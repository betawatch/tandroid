package h2;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
