package i2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import di.nb;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class b extends BroadcastReceiver {
    public final c0 a;
    public final e2.z b;
    public final /* synthetic */ com.google.firebase.messaging.m c;

    public b(com.google.firebase.messaging.m mVar, e2.z zVar, c0 c0Var) {
        this.c = mVar;
        this.b = zVar;
        this.a = c0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.c(new nb(this, 23));
        }
    }
}
