package h3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends BroadcastReceiver implements Runnable {
    public final h0 a;
    public final Handler b;
    public final /* synthetic */ androidx.activity.o c;

    public b(androidx.activity.o oVar, Handler handler, h0 h0Var) {
        this.c = oVar;
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
