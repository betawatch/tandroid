package org.telegram.messenger;

import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.HashMap;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public class GcmPushListenerService extends FirebaseMessagingService {
    public static final /* synthetic */ int n = 0;

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void c(ab.a0 a0Var) {
        long parseLong;
        Bundle bundle = a0Var.a;
        String string = bundle.getString("from");
        if (a0Var.b == null) {
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
            a0Var.b = fVar;
        }
        HashMap hashMap = new HashMap(a0Var.b);
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
        if (s2.a) {
            a8.b("FCM received data: " + hashMap + " from: " + string);
        }
        PushListenerController.processRemoteMessage(2, (String) hashMap.get("p"), parseLong);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(String str) {
        g0.g3(new n4(str, 4));
    }
}
