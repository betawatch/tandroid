package d5;

import android.content.Context;
import android.telephony.TelephonyManager;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class w {
    public static void a(Context context, x xVar) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            v vVar = new v(xVar);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), vVar);
            telephonyManager.unregisterTelephonyCallback(vVar);
        } catch (RuntimeException unused) {
            x.a(xVar, 5);
        }
    }
}
