package c2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bi.u6;
import e2.i0;
import i2.d0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a extends BroadcastReceiver {
    public final d0 a;
    public final i0 b;
    public final /* synthetic */ b c;

    public a(b bVar, i0 i0Var, d0 d0Var) {
        this.c = bVar;
        this.b = i0Var;
        this.a = d0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.d(new u6(this, 9));
        }
    }
}
