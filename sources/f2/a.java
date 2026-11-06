package f2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import di.s7;
import h2.i0;
import l2.c0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class a extends BroadcastReceiver {
    public final c0 a;
    public final i0 b;
    public final /* synthetic */ ab.q c;

    public a(ab.q qVar, i0 i0Var, c0 c0Var) {
        this.c = qVar;
        this.b = i0Var;
        this.a = c0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.d(new s7(this, 11));
        }
    }
}
