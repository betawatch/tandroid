package e2;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public abstract class s {
    public static void a(Context context, u uVar) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            r rVar = new r(uVar);
            telephonyManager.registerTelephonyCallback((Executor) uVar.c, rVar);
            telephonyManager.unregisterTelephonyCallback(rVar);
        } catch (RuntimeException unused) {
            uVar.c(5);
        }
    }
}
