package k7;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.common.api.internal.t0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public abstract class c extends f0.c {
    public static void e(Context context, t0 t0Var, IntentFilter intentFilter) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            context.registerReceiver(t0Var, intentFilter, i10 >= 33 ? 2 : 0);
        } else {
            context.registerReceiver(t0Var, intentFilter);
        }
    }
}
