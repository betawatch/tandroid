package k7;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.common.api.internal.u0;
import f0.e;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public abstract class c extends e {
    public static void g(Context context, u0 u0Var, IntentFilter intentFilter) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            context.registerReceiver(u0Var, intentFilter, i10 >= 33 ? 2 : 0);
        } else {
            context.registerReceiver(u0Var, intentFilter);
        }
    }
}
