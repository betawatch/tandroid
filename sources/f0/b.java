package f0;

import ab.e0;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class b {
    public static Intent a(Context context, e0 e0Var, IntentFilter intentFilter) {
        return context.registerReceiver(e0Var, intentFilter, null, null, 0);
    }

    public static Intent b(Context context, e0 e0Var, IntentFilter intentFilter) {
        return context.registerReceiver(e0Var, intentFilter, null, null, 2);
    }
}
