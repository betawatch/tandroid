package f2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import h2.i0;
import l2.a0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class b extends BroadcastReceiver {
    public final a0 a;
    public final i0 b;
    public final /* synthetic */ ab.q c;

    public b(ab.q qVar, i0 i0Var, a0 a0Var) {
        this.c = qVar;
        this.b = i0Var;
        this.a = a0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.d(new a(this, 0));
        }
    }
}
