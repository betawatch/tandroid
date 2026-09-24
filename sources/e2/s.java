package e2;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
