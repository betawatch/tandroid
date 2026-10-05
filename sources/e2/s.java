package e2;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
