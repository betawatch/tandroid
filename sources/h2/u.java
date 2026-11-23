package h2;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
