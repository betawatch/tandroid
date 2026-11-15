package f2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ch.w;
import h2.i0;
import l2.z;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class a extends BroadcastReceiver {
    public final z a;
    public final i0 b;
    public final /* synthetic */ ab.q c;

    public a(ab.q qVar, i0 i0Var, z zVar) {
        this.c = qVar;
        this.b = i0Var;
        this.a = zVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.d(new w(this, 27));
        }
    }
}
