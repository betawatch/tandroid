package l7;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.common.api.internal.t0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
