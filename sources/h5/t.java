package h5;

import android.content.Context;
import android.telephony.TelephonyManager;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
