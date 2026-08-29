package f5;

import android.content.Context;
import android.telephony.TelephonyManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class t {
    public static void a(Context context, u uVar) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            s sVar = new s(uVar);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), sVar);
            telephonyManager.unregisterTelephonyCallback(sVar);
        } catch (RuntimeException unused) {
            u.c(uVar, 5);
        }
    }
}
