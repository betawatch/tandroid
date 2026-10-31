package k7;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.common.api.internal.v0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
