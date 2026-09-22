package i2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ci.uc;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class b extends BroadcastReceiver {
    public final b0 a;
    public final e2.z b;
    public final /* synthetic */ com.google.firebase.messaging.m c;

    public b(com.google.firebase.messaging.m mVar, e2.z zVar, b0 b0Var) {
        this.c = mVar;
        this.b = zVar;
        this.a = b0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.c(new uc(this, 27));
        }
    }
}
