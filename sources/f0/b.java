package f0;

import ab.e0;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class b {
    public static Intent a(Context context, e0 e0Var, IntentFilter intentFilter) {
        return context.registerReceiver(e0Var, intentFilter, null, null, 0);
    }

    public static Intent b(Context context, e0 e0Var, IntentFilter intentFilter) {
        return context.registerReceiver(e0Var, intentFilter, null, null, 2);
    }
}
