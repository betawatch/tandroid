package d5;

import android.content.Context;
import android.telephony.TelephonyManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class v {
    public static void a(Context context, w wVar) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            u uVar = new u(wVar);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), uVar);
            telephonyManager.unregisterTelephonyCallback(uVar);
        } catch (RuntimeException unused) {
            w.a(wVar, 5);
        }
    }
}
