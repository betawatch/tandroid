package c2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e2.i0;
import i2.c0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a extends BroadcastReceiver {
    public final c0 a;
    public final i0 b;
    public final /* synthetic */ ac.a c;

    public a(ac.a aVar, i0 i0Var, c0 c0Var) {
        this.c = aVar;
        this.b = i0Var;
        this.a = c0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.d(new a3.d(this, 26));
        }
    }
}
