package bg;

import android.graphics.Rect;
import android.view.Choreographer;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        switch (this.a) {
            case 0:
                b0 b0Var = (b0) this.b;
                if (b0Var.F.get()) {
                    long j10 = b0Var.b;
                    if (j10 == 0) {
                        b0Var.b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        b0Var.c = b0Var.a;
                        b0Var.f = b0Var.e.getAndSet(0);
                        b0Var.a = 0;
                        b0Var.b = j3;
                    } else {
                        b0Var.a++;
                    }
                    Choreographer.getInstance().postFrameCallback(b0Var.d);
                    break;
                }
                break;
            case 1:
                ((Runnable) this.b).run();
                break;
            default:
                xh.h hVar = (xh.h) this.b;
                Rect rect = hVar.m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - hVar.h > 32 && !hVar.j && !rect.isEmpty()) {
                    hVar.h = currentTimeMillis;
                    hVar.j = true;
                    hVar.o.set(rect);
                    hVar.a.postRunnable(new xh.g(hVar, (hVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                hVar.l = false;
                break;
        }
    }
}
