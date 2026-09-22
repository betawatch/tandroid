package k7;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.common.api.internal.u0;
import f0.e;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
