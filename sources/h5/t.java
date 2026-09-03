package h5;

import android.content.Context;
import android.telephony.TelephonyManager;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
