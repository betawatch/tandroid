package f0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.api.internal.o0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class b {
    public static Intent a(Context context, o0 o0Var, IntentFilter intentFilter) {
        return context.registerReceiver(o0Var, intentFilter, null, null, 0);
    }

    public static Intent b(Context context, o0 o0Var, IntentFilter intentFilter) {
        return context.registerReceiver(o0Var, intentFilter, null, null, 2);
    }
}
