package org.telegram.messenger;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class PushListenerController {
    public static final int NOTIFICATION_ID = 1;
    public static final int PUSH_TYPE_FIREBASE = 2;
    public static final int PUSH_TYPE_HUAWEI = 13;
    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static final class GooglePushListenerServiceProvider implements IPushListenerServiceProvider {
        public static final GooglePushListenerServiceProvider INSTANCE = new GooglePushListenerServiceProvider();
        private Boolean hasServices;

        private GooglePushListenerServiceProvider() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onRequestPushToken$0(Task task) {
            SharedConfig.pushStringGetTimeEnd = SystemClock.elapsedRealtime();
            if (task.isSuccessful()) {
                String str = (String) task.getResult();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                PushListenerController.sendRegistrationToServer(getPushType(), str);
                return;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("Failed to get regid");
            }
            SharedConfig.pushStringStatus = "__FIREBASE_FAILED__";
            PushListenerController.sendRegistrationToServer(getPushType(), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onRequestPushToken$1() {
            FirebaseMessaging firebaseMessaging;
            try {
                SharedConfig.pushStringGetTimeStart = SystemClock.elapsedRealtime();
                s8.h.f(ApplicationLoader.applicationContext);
                android.support.v4.media.c cVar = FirebaseMessaging.l;
                synchronized (FirebaseMessaging.class) {
                    firebaseMessaging = FirebaseMessaging.getInstance(s8.h.c());
                }
                firebaseMessaging.getClass();
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                firebaseMessaging.f.execute(new a1.e(22, firebaseMessaging, taskCompletionSource));
                taskCompletionSource.getTask().addOnCompleteListener(new d(this, 12));
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }

        @Override // org.telegram.messenger.PushListenerController.IPushListenerServiceProvider
        public String getLogTitle() {
            return "Google Play Services";
        }

        @Override // org.telegram.messenger.PushListenerController.IPushListenerServiceProvider
        public int getPushType() {
            return 2;
        }

        @Override // org.telegram.messenger.PushListenerController.IPushListenerServiceProvider
        public boolean hasServices() {
            if (this.hasServices == null) {
                try {
                    this.hasServices = Boolean.valueOf(u5.d.d.d(ApplicationLoader.applicationContext, u5.e.a) == 0);
                } catch (Exception e10) {
                    FileLog.e(e10);
                    this.hasServices = Boolean.FALSE;
                }
            }
            return this.hasServices.booleanValue();
        }

        @Override // org.telegram.messenger.PushListenerController.IPushListenerServiceProvider
        public void onRequestPushToken() {
            String str = SharedConfig.pushString;
            if (TextUtils.isEmpty(str)) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("FCM Registration not found.");
                }
            } else if (BuildVars.DEBUG_PRIVATE_VERSION && BuildVars.LOGS_ENABLED) {
                FileLog.d("FCM regId = " + str);
            }
            Utilities.globalQueue.postRunnable(new ng(this, 5));
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public interface IPushListenerServiceProvider {
        String getLogTitle();

        int getPushType();

        boolean hasServices();

        void onRequestPushToken();
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface PushType {
    }

    private static String getReactedText(String str, Object[] objArr) {
        str.getClass();
        switch (str) {
            case "CHAT_REACT_CONTACT":
                return LocaleController.formatString(R.string.PushChatReactContact, objArr);
            case "REACT_GEOLIVE":
                return LocaleController.formatString(R.string.PushReactGeoLocation, objArr);
            case "REACT_STORY_HIDDEN":
                return LocaleController.formatString(R.string.PushReactStoryHidden, objArr);
            case "REACT_HIDDEN":
                return LocaleController.formatString(R.string.PushReactHidden, objArr);
            case "CHAT_REACT_NOTEXT":
                return LocaleController.formatString(R.string.PushChatReactNotext, objArr);
            case "REACT_NOTEXT":
                return LocaleController.formatString(R.string.PushReactNoText, objArr);
            case "CHAT_REACT_INVOICE":
                return LocaleController.formatString(R.string.PushChatReactInvoice, objArr);
            case "REACT_CONTACT":
                return LocaleController.formatString(R.string.PushReactContect, objArr);
            case "CHAT_REACT_STICKER":
                return LocaleController.formatString(R.string.PushChatReactSticker, objArr);
            case "REACT_GAME":
                return LocaleController.formatString(R.string.PushReactGame, objArr);
            case "REACT_POLL":
                return LocaleController.formatString(R.string.PushReactPoll, objArr);
            case "REACT_QUIZ":
                return LocaleController.formatString(R.string.PushReactQuiz, objArr);
            case "REACT_TEXT":
                return LocaleController.formatString(R.string.PushReactText, objArr);
            case "REACT_TODO":
                return LocaleController.formatString(R.string.PushReactTodo, objArr);
            case "REACT_INVOICE":
                return LocaleController.formatString(R.string.PushReactInvoice, objArr);
            case "CHAT_REACT_DOC":
                return LocaleController.formatString(R.string.PushChatReactDoc, objArr);
            case "CHAT_REACT_GEO":
                return LocaleController.formatString(R.string.PushChatReactGeo, objArr);
            case "CHAT_REACT_GIF":
                return LocaleController.formatString(R.string.PushChatReactGif, objArr);
            case "REACT_STICKER":
                return LocaleController.formatString(R.string.PushReactSticker, objArr);
            case "CHAT_REACT_AUDIO":
                return LocaleController.formatString(R.string.PushChatReactAudio, objArr);
            case "CHAT_REACT_PHOTO":
                return LocaleController.formatString(R.string.PushChatReactPhoto, objArr);
            case "CHAT_REACT_ROUND":
                return LocaleController.formatString(R.string.PushChatReactRound, objArr);
            case "CHAT_REACT_VIDEO":
                return LocaleController.formatString(R.string.PushChatReactVideo, objArr);
            case "CHAT_REACT_GIVEAWAY":
                return LocaleController.formatString(R.string.NotificationChatReactGiveaway, objArr);
            case "REACT_GIVEAWAY":
                return LocaleController.formatString(R.string.NotificationReactGiveaway, objArr);
            case "CHAT_REACT_GEOLIVE":
                return LocaleController.formatString(R.string.PushChatReactGeoLive, objArr);
            case "REACT_AUDIO":
                return LocaleController.formatString(R.string.PushReactAudio, objArr);
            case "REACT_PHOTO":
                return LocaleController.formatString(R.string.PushReactPhoto, objArr);
            case "REACT_ROUND":
                return LocaleController.formatString(R.string.PushReactRound, objArr);
            case "REACT_STORY":
                return LocaleController.formatString(R.string.PushReactStory, objArr);
            case "REACT_VIDEO":
                return LocaleController.formatString(R.string.PushReactVideo, objArr);
            case "REACT_DOC":
                return LocaleController.formatString(R.string.PushReactDoc, objArr);
            case "REACT_GEO":
                return LocaleController.formatString(R.string.PushReactGeo, objArr);
            case "REACT_GIF":
                return LocaleController.formatString(R.string.PushReactGif, objArr);
            case "CHAT_REACT_GAME":
                return LocaleController.formatString(R.string.PushChatReactGame, objArr);
            case "CHAT_REACT_POLL":
                return LocaleController.formatString(R.string.PushChatReactPoll, objArr);
            case "CHAT_REACT_QUIZ":
                return LocaleController.formatString(R.string.PushChatReactQuiz, objArr);
            case "CHAT_REACT_TEXT":
                return LocaleController.formatString(R.string.PushChatReactText, objArr);
            case "CHAT_REACT_TODO":
                return LocaleController.formatString(R.string.PushChatReactTodo, objArr);
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$2(int i9, TLRPC.TL_updates tL_updates) {
        MessagesController.getInstance(i9).processUpdates(tL_updates, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$3(int i9) {
        if (UserConfig.getInstance(i9).getClientUserId() != 0) {
            UserConfig.getInstance(i9).clearConfig();
            MessagesController.getInstance(i9).performLogout(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$4(int i9) {
        LocationController.getInstance(i9).setNewLocationEndWatchTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$5(int i9, long j10, int i10) {
        MessagesController.getInstance(i9).reportMessageDelivery(j10, i10, true);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$6(java.lang.String r72, java.lang.String r73, long r74) {
        /*
            Method dump skipped, instructions count: 10296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.PushListenerController.lambda$processRemoteMessage$6(java.lang.String, java.lang.String, long):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$7(String str, String str2, long j10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d(str + " PRE INIT APP");
        }
        ApplicationLoader.postInitApplication();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d(str + " POST INIT APP");
        }
        Utilities.stageQueue.postRunnable(new lh(0, j10, str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendRegistrationToServer$0(int i9, int i10, String str) {
        MessagesController.getInstance(i9).registerForPush(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendRegistrationToServer$1(String str, int i9) {
        boolean z10;
        ConnectionsManager.setRegId(str, i9, SharedConfig.pushStringStatus);
        if (str == null) {
            return;
        }
        if (SharedConfig.pushStringGetTimeStart == 0 || SharedConfig.pushStringGetTimeEnd == 0 || (SharedConfig.pushStatSent && TextUtils.equals(SharedConfig.pushString, str))) {
            z10 = false;
        } else {
            SharedConfig.pushStatSent = false;
            z10 = true;
        }
        SharedConfig.pushString = str;
        SharedConfig.pushType = i9;
        for (int i10 = 0; i10 < 4; i10++) {
            UserConfig userConfig = UserConfig.getInstance(i10);
            userConfig.registeredForPush = false;
            userConfig.saveConfig(false);
            if (userConfig.getClientUserId() != 0) {
                if (z10) {
                    String str2 = i9 == 2 ? "fcm" : "hcm";
                    TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                    TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                    tL_inputAppEvent.time = SharedConfig.pushStringGetTimeStart;
                    tL_inputAppEvent.type = str2.concat("_token_request");
                    tL_inputAppEvent.peer = 0L;
                    tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
                    tL_help_saveAppLog.events.add(tL_inputAppEvent);
                    TLRPC.TL_inputAppEvent tL_inputAppEvent2 = new TLRPC.TL_inputAppEvent();
                    tL_inputAppEvent2.time = SharedConfig.pushStringGetTimeEnd;
                    tL_inputAppEvent2.type = str2.concat("_token_response");
                    tL_inputAppEvent2.peer = SharedConfig.pushStringGetTimeEnd - SharedConfig.pushStringGetTimeStart;
                    tL_inputAppEvent2.data = new TLRPC.TL_jsonNull();
                    tL_help_saveAppLog.events.add(tL_inputAppEvent2);
                    SharedConfig.pushStatSent = true;
                    SharedConfig.saveConfig();
                    ConnectionsManager.getInstance(i10).sendRequest(tL_help_saveAppLog, null);
                    z10 = false;
                }
                AndroidUtilities.runOnUIThread(new p6(i10, i9, str));
            }
        }
    }

    private static void onDecryptError() {
        for (int i9 = 0; i9 < 4; i9++) {
            if (UserConfig.getInstance(i9).isClientActivated()) {
                ConnectionsManager.onInternalPushReceived(i9);
                ConnectionsManager.getInstance(i9).resumeNetworkMaybe();
            }
        }
        countDownLatch.countDown();
    }

    public static void processRemoteMessage(int i9, String str, long j10) {
        String str2 = i9 == 2 ? "FCM" : "HCM";
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d(str2.concat(" PRE START PROCESSING"));
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AndroidUtilities.runOnUIThread(new lh(1, j10, str2, str));
        try {
            countDownLatch.await();
        } catch (Throwable unused) {
        }
        if (BuildVars.DEBUG_VERSION) {
            StringBuilder t10 = aa.d.t("finished ", str2, " service, time = ");
            t10.append(SystemClock.elapsedRealtime() - elapsedRealtime);
            FileLog.d(t10.toString());
        }
    }

    public static void sendRegistrationToServer(int i9, String str) {
        Utilities.stageQueue.postRunnable(new n6(str, i9, 8));
    }
}
