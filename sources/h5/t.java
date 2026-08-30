package h5;

import android.content.Context;
import android.telephony.TelephonyManager;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
            u.b(uVar, 5);
        }
    }
}
