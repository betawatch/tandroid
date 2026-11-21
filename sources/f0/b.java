package f0;

import ab.e0;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class b {
    public static Intent a(Context context, e0 e0Var, IntentFilter intentFilter) {
        return context.registerReceiver(e0Var, intentFilter, null, null, 0);
    }

    public static Intent b(Context context, e0 e0Var, IntentFilter intentFilter) {
        return context.registerReceiver(e0Var, intentFilter, null, null, 2);
    }
}
