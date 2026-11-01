package k7;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.common.api.internal.v0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class c extends f0.c {
    public static void e(Context context, v0 v0Var, IntentFilter intentFilter) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            context.registerReceiver(v0Var, intentFilter, i10 >= 33 ? 2 : 0);
        } else {
            context.registerReceiver(v0Var, intentFilter);
        }
    }
}
