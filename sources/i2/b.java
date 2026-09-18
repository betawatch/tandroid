package i2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ci.uc;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
