package org.telegram.messenger;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;
/* loaded from: classes.dex */
public class GcmPushListenerService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        String from = remoteMessage.getFrom();
        Map<String, String> data = remoteMessage.getData();
        long sentTime = remoteMessage.getSentTime();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("FCM received data: " + data + " from: " + from);
        }
        PushListenerController.processRemoteMessage(2, data.get("p"), sentTime);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        AndroidUtilities.runOnUIThread(new GcmPushListenerService$$ExternalSyntheticLambda0(str));
    }

    public static /* synthetic */ void lambda$onNewToken$0(String str) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("Refreshed FCM token: " + str);
        }
        ApplicationLoader.postInitApplication();
        PushListenerController.sendRegistrationToServer(2, str);
    }
}
