package e2;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public abstract class s {
    public static void a(Context context, u uVar) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            r rVar = new r(uVar);
            telephonyManager.registerTelephonyCallback((Executor) uVar.c, rVar);
            telephonyManager.unregisterTelephonyCallback(rVar);
        } catch (RuntimeException unused) {
            uVar.c(5);
        }
    }
}
