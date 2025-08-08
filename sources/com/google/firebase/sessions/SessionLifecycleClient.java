package com.google.firebase.sessions;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public final class SessionLifecycleClient {
    public static final Companion Companion = new Companion(null);
    private final CoroutineContext backgroundDispatcher;
    private final LinkedBlockingDeque queuedMessages;
    private Messenger service;
    private boolean serviceBound;
    private final SessionLifecycleClient$serviceConnection$1 serviceConnection;

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1] */
    public SessionLifecycleClient(CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.backgroundDispatcher = backgroundDispatcher;
        this.queuedMessages = new LinkedBlockingDeque(20);
        this.serviceConnection = new ServiceConnection() { // from class: com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                LinkedBlockingDeque linkedBlockingDeque;
                List drainQueue;
                StringBuilder sb = new StringBuilder();
                sb.append("Connected to SessionLifecycleService. Queue size ");
                linkedBlockingDeque = SessionLifecycleClient.this.queuedMessages;
                sb.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb.toString());
                SessionLifecycleClient.this.service = new Messenger(iBinder);
                SessionLifecycleClient.this.serviceBound = true;
                SessionLifecycleClient sessionLifecycleClient = SessionLifecycleClient.this;
                drainQueue = sessionLifecycleClient.drainQueue();
                sessionLifecycleClient.sendLifecycleEvents(drainQueue);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                SessionLifecycleClient.this.service = null;
                SessionLifecycleClient.this.serviceBound = false;
            }
        };
    }

    public static final class ClientUpdateHandler extends Handler {
        private final CoroutineContext backgroundDispatcher;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientUpdateHandler(CoroutineContext backgroundDispatcher) {
            super(Looper.getMainLooper());
            Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
            this.backgroundDispatcher = backgroundDispatcher;
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            String str;
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (msg.what == 3) {
                Bundle data = msg.getData();
                if (data == null || (str = data.getString("SessionUpdateExtra")) == null) {
                    str = "";
                }
                handleSessionUpdate(str);
                return;
            }
            Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + msg);
            super.handleMessage(msg);
        }

        private final void handleSessionUpdate(String str) {
            Log.d("SessionLifecycleClient", "Session update received: " + str);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.backgroundDispatcher), null, null, new SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(str, null), 3, null);
        }
    }

    public final void bindToService() {
        SessionLifecycleServiceBinder.Companion.getInstance().bindToService(new Messenger(new ClientUpdateHandler(this.backgroundDispatcher)), this.serviceConnection);
    }

    public final void foregrounded() {
        sendLifecycleEvent(1);
    }

    public final void backgrounded() {
        sendLifecycleEvent(2);
    }

    private final void sendLifecycleEvent(int i) {
        List drainQueue = drainQueue();
        Message obtain = Message.obtain(null, i, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(null, messageCode, 0, 0)");
        drainQueue.add(obtain);
        sendLifecycleEvents(drainQueue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job sendLifecycleEvents(List list) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.backgroundDispatcher), null, null, new SessionLifecycleClient$sendLifecycleEvents$1(this, list, null), 3, null);
        return launch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendMessageToServer(Message message) {
        if (this.service != null) {
            try {
                Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                Messenger messenger = this.service;
                if (messenger != null) {
                    messenger.send(message);
                    return;
                }
                return;
            } catch (RemoteException e) {
                Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e);
                queueMessage(message);
                return;
            }
        }
        queueMessage(message);
    }

    private final void queueMessage(Message message) {
        if (this.queuedMessages.offer(message)) {
            Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + this.queuedMessages.size());
            return;
        }
        Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List drainQueue() {
        ArrayList arrayList = new ArrayList();
        this.queuedMessages.drainTo(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Message getLatestByCode(List list, int i) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
