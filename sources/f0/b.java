package f0;

import ab.e0;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class b {
    public static Intent a(Context context, e0 e0Var, IntentFilter intentFilter) {
        return context.registerReceiver(e0Var, intentFilter, null, null, 0);
    }

    public static Intent b(Context context, e0 e0Var, IntentFilter intentFilter) {
        return context.registerReceiver(e0Var, intentFilter, null, null, 2);
    }
}
