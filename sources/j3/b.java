package j3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b extends BroadcastReceiver implements Runnable {
    public final c0 a;
    public final Handler b;
    public final /* synthetic */ androidx.activity.o c;

    public b(androidx.activity.o oVar, Handler handler, c0 c0Var) {
        this.c = oVar;
        this.b = handler;
        this.a = c0Var;
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
            this.a.a.g0(-1, 3, false);
        }
    }
}
