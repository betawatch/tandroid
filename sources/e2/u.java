package e2;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
