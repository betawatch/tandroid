package ag;

import a8.ee;
import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        switch (this.a) {
            case 0:
                g0 g0Var = (g0) this.b;
                if (g0Var.F.get()) {
                    long j11 = g0Var.b;
                    if (j11 == 0) {
                        g0Var.b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        g0Var.c = g0Var.a;
                        g0Var.f = g0Var.e.getAndSet(0);
                        g0Var.a = 0;
                        g0Var.b = j10;
                    } else {
                        g0Var.a++;
                    }
                    Choreographer.getInstance().postFrameCallback(g0Var.d);
                    break;
                }
                break;
            case 1:
                ((Runnable) this.b).run();
                break;
            case 2:
                sf.b bVar = (sf.b) this.b;
                vf.a aVar = bVar.k;
                vf.a aVar2 = bVar.j;
                if (bVar.n) {
                    ArrayList arrayList = bVar.b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        sf.e eVar = ((uf.e) ((tf.b) obj)).f;
                        if (eVar != null) {
                            eVar.invalidate();
                        }
                    }
                    if (aVar2.c != 0) {
                        bVar.d(ee.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.c != 0) {
                        bVar.d(ee.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    bVar.l.postFrameCallback(bVar.m);
                    break;
                }
                break;
            default:
                xh.i iVar = (xh.i) this.b;
                Rect rect = iVar.m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.j = true;
                    iVar.o.set(rect);
                    iVar.a.postRunnable(new xh.h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.l = false;
                break;
        }
    }
}
