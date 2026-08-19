package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.google.firebase.sessions.SessionGenerator;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* loaded from: classes.dex */
public final class SessionLifecycleService extends Service {
    public static final Companion Companion = new Companion(null);
    private final HandlerThread handlerThread = new HandlerThread("FirebaseSessions_HandlerThread");
    private MessageHandler messageHandler;
    private Messenger messenger;

    public static final class MessageHandler extends Handler {
        private final ArrayList boundClients;
        private boolean hasForegrounded;
        private long lastMsgTimeMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessageHandler(Looper looper) {
            super(looper);
            Intrinsics.checkNotNullParameter(looper, "looper");
            this.boundClients = new ArrayList();
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (this.lastMsgTimeMs > msg.getWhen()) {
                Log.d("SessionLifecycleService", "Ignoring old message from " + msg.getWhen() + " which is older than " + this.lastMsgTimeMs + '.');
                return;
            }
            int i = msg.what;
            if (i == 1) {
                handleForegrounding(msg);
                return;
            }
            if (i == 2) {
                handleBackgrounding(msg);
                return;
            }
            if (i == 4) {
                handleClientBound(msg);
                return;
            }
            Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + msg);
            super.handleMessage(msg);
        }

        private final void handleForegrounding(Message message) {
            Log.d("SessionLifecycleService", "Activity foregrounding at " + message.getWhen() + '.');
            if (!this.hasForegrounded) {
                Log.d("SessionLifecycleService", "Cold start detected.");
                this.hasForegrounded = true;
                newSession();
            } else if (isSessionRestart(message.getWhen())) {
                Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                newSession();
            }
            this.lastMsgTimeMs = message.getWhen();
        }

        private final void handleBackgrounding(Message message) {
            Log.d("SessionLifecycleService", "Activity backgrounding at " + message.getWhen());
            this.lastMsgTimeMs = message.getWhen();
        }

        private final void handleClientBound(Message message) {
            this.boundClients.add(message.replyTo);
            Messenger messenger = message.replyTo;
            Intrinsics.checkNotNullExpressionValue(messenger, "msg.replyTo");
            maybeSendSessionToClient(messenger);
            Log.d("SessionLifecycleService", "Client " + message.replyTo + " bound at " + message.getWhen() + ". Clients: " + this.boundClients.size());
        }

        private final void newSession() {
            SessionGenerator.Companion companion = SessionGenerator.Companion;
            companion.getInstance().generateNewSession();
            Log.d("SessionLifecycleService", "Generated new session " + companion.getInstance().getCurrentSession().getSessionId());
            broadcastSession();
            SessionDatastore.Companion.getInstance().updateSessionId(companion.getInstance().getCurrentSession().getSessionId());
        }

        private final void broadcastSession() {
            StringBuilder sb = new StringBuilder();
            sb.append("Broadcasting new session: ");
            SessionGenerator.Companion companion = SessionGenerator.Companion;
            sb.append(companion.getInstance().getCurrentSession());
            Log.d("SessionLifecycleService", sb.toString());
            SessionFirelogPublisher.Companion.getInstance().logSession(companion.getInstance().getCurrentSession());
            ArrayList arrayList = new ArrayList(this.boundClients);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Messenger it = (Messenger) obj;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                maybeSendSessionToClient(it);
            }
        }

        private final void maybeSendSessionToClient(Messenger messenger) {
            if (this.hasForegrounded) {
                sendSessionToClient(messenger, SessionGenerator.Companion.getInstance().getCurrentSession().getSessionId());
                return;
            }
            String currentSessionId = SessionDatastore.Companion.getInstance().getCurrentSessionId();
            Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + currentSessionId);
            if (currentSessionId != null) {
                sendSessionToClient(messenger, currentSessionId);
            }
        }

        private final void sendSessionToClient(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", str);
                Message obtain = Message.obtain(null, 3, 0, 0);
                obtain.setData(bundle);
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
                Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
                this.boundClients.remove(messenger);
            } catch (Exception e) {
                Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e);
            }
        }

        private final boolean isSessionRestart(long j) {
            return j - this.lastMsgTimeMs > Duration.getInWholeMilliseconds-impl(SessionsSettings.Companion.getInstance().getSessionRestartTimeout-UwyO8pc());
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.handlerThread.start();
        Looper looper = this.handlerThread.getLooper();
        Intrinsics.checkNotNullExpressionValue(looper, "handlerThread.looper");
        this.messageHandler = new MessageHandler(looper);
        this.messenger = new Messenger(this.messageHandler);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        Messenger clientCallback = getClientCallback(intent);
        if (clientCallback != null) {
            Message obtain = Message.obtain(null, 4, 0, 0);
            obtain.replyTo = clientCallback;
            MessageHandler messageHandler = this.messageHandler;
            if (messageHandler != null) {
                messageHandler.sendMessage(obtain);
            }
        }
        Messenger messenger = this.messenger;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.handlerThread.quit();
    }

    private final Messenger getClientCallback(Intent intent) {
        Object parcelableExtra;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class);
            return (Messenger) parcelableExtra;
        }
        return (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
