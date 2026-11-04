package g2;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class v {
    public static void a(Context context, x xVar) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            u uVar = new u(xVar);
            telephonyManager.registerTelephonyCallback((Executor) xVar.c, uVar);
            telephonyManager.unregisterTelephonyCallback(uVar);
        } catch (RuntimeException unused) {
            xVar.c(5);
        }
    }
}
