package j3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
