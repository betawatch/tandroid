package i2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ci.qc;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
            this.b.c(new qc(this, 27));
        }
    }
}
