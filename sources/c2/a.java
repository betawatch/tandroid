package c2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e2.i0;
import i2.b0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class a extends BroadcastReceiver {
    public final b0 a;
    public final i0 b;
    public final /* synthetic */ b c;

    public a(b bVar, i0 i0Var, b0 b0Var) {
        this.c = bVar;
        this.b = i0Var;
        this.a = b0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.d(new androidx.fragment.app.d(this, 5));
        }
    }
}
