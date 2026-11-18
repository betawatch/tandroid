package f2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import h2.i0;
import l2.z;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class b extends BroadcastReceiver {
    public final z a;
    public final i0 b;
    public final /* synthetic */ ab.q c;

    public b(ab.q qVar, i0 i0Var, z zVar) {
        this.c = qVar;
        this.b = i0Var;
        this.a = zVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.d(new a(this, 1));
        }
    }
}
