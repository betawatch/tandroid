package e2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ci.d1;
import g2.j0;
import k2.c0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends BroadcastReceiver {
    public final c0 a;
    public final j0 b;
    public final /* synthetic */ b4.n c;

    public a(b4.n nVar, j0 j0Var, c0 c0Var) {
        this.c = nVar;
        this.b = j0Var;
        this.a = c0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.d(new d1(this, 19));
        }
    }
}
