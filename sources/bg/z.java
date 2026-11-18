package bg;

import android.graphics.Rect;
import android.view.Choreographer;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        switch (this.a) {
            case 0:
                c0 c0Var = (c0) this.b;
                if (c0Var.G.get()) {
                    long j10 = c0Var.b;
                    if (j10 == 0) {
                        c0Var.b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        c0Var.c = c0Var.a;
                        c0Var.f = c0Var.e.getAndSet(0);
                        c0Var.a = 0;
                        c0Var.b = j3;
                    } else {
                        c0Var.a++;
                    }
                    Choreographer.getInstance().postFrameCallback(c0Var.d);
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
