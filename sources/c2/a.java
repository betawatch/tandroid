package c2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e2.i0;
import i2.c0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class a extends BroadcastReceiver {
    public final c0 a;
    public final i0 b;
    public final /* synthetic */ b c;

    public a(b bVar, i0 i0Var, c0 c0Var) {
        this.c = bVar;
        this.b = i0Var;
        this.a = c0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.d(new androidx.fragment.app.d(this, 5));
        }
    }
}
