package org.telegram.messenger;

import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.r;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class GcmPushListenerService extends FirebaseMessagingService {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onNewToken$0(String str) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("Refreshed FCM token: " + str);
        }
        ApplicationLoader.postInitApplication();
        PushListenerController.sendRegistrationToServer(2, str);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(r rVar) {
        long parseLong;
        Bundle bundle = rVar.a;
        String string = bundle.getString("from");
        if (rVar.b == null) {
            a0.f fVar = new a0.f(0);
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        fVar.put(str, str2);
                    }
                }
            }
            rVar.b = fVar;
        }
        a0.f fVar2 = rVar.b;
        Object obj2 = bundle.get("google.sent_time");
        if (obj2 instanceof Long) {
            parseLong = ((Long) obj2).longValue();
        } else {
            if (obj2 instanceof String) {
                try {
                    parseLong = Long.parseLong((String) obj2);
                } catch (NumberFormatException unused) {
                    Log.w("FirebaseMessaging", "Invalid sent time: " + obj2);
                }
            }
            parseLong = 0;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("FCM received data: " + fVar2 + " from: " + string);
        }
        PushListenerController.processRemoteMessage(2, (String) fVar2.get("p"), parseLong);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        AndroidUtilities.runOnUIThread(new v1(str, 4));
    }
}
