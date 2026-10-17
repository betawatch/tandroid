package e2;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
