package k7;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.common.api.internal.t0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
