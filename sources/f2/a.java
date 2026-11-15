package f2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ch.w;
import h2.i0;
import l2.z;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
