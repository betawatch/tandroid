package org.telegram.messenger;

import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.HashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class GcmPushListenerService extends FirebaseMessagingService {
    public static final /* synthetic */ int n = 0;

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void c(w99 w99Var) {
        long parseLong;
        Bundle bundle = w99Var.a;
        String string = bundle.getString("from");
        if (w99Var.b == null) {
            qs qsVar = new qs(0);
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        qsVar.put(str, str2);
                    }
                }
            }
            w99Var.b = qsVar;
        }
        HashMap hashMap = new HashMap(w99Var.b);
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
        if (f11.a) {
            cc4.b("FCM received data: " + hashMap + " from: " + string);
        }
        PushListenerController.processRemoteMessage(2, (String) hashMap.get("p"), parseLong);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(String str) {
        hl.c3(new qu2(str, (byte) 5));
    }
}
