package j3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b extends BroadcastReceiver implements Runnable {
    public final h0 a;
    public final Handler b;
    public final /* synthetic */ androidx.activity.n c;

    public b(androidx.activity.n nVar, Handler handler, h0 h0Var) {
        this.c = nVar;
        this.b = handler;
        this.a = h0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.a) {
            this.a.a.n0(-1, 3, false);
        }
    }
}
