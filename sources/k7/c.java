package k7;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.common.api.internal.u0;
import f0.e;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
