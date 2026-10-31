package org.telegram.messenger;

import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class GcmPushListenerService extends FirebaseMessagingService {
    public static final /* synthetic */ int n = 0;

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void c(xa.l lVar) {
        long parseLong;
        Bundle bundle = lVar.a;
        String string = bundle.getString("from");
        if (lVar.b == null) {
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
            lVar.b = fVar;
        }
        a0.f fVar2 = lVar.b;
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
        if (v2.a) {
            f8.b("FCM received data: " + fVar2 + " from: " + string);
        }
        PushListenerController.processRemoteMessage(2, (String) fVar2.get("p"), parseLong);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(String str) {
        i0.g3(new o4(str, 4));
    }
}
