package e2;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
