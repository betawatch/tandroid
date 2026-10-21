package e2;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public abstract class u {
    public static void a(Context context, w wVar) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            t tVar = new t(wVar);
            telephonyManager.registerTelephonyCallback((Executor) wVar.c, tVar);
            telephonyManager.unregisterTelephonyCallback(tVar);
        } catch (RuntimeException unused) {
            wVar.c(5);
        }
    }
}
