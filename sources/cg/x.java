package cg;

import android.graphics.Rect;
import android.view.Choreographer;
import b8.be;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        switch (this.a) {
            case 0:
                a0 a0Var = (a0) this.b;
                if (a0Var.G.get()) {
                    long j11 = a0Var.b;
                    if (j11 == 0) {
                        a0Var.b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        a0Var.c = a0Var.a;
                        a0Var.f = a0Var.e.getAndSet(0);
                        a0Var.a = 0;
                        a0Var.b = j10;
                    } else {
                        a0Var.a++;
                    }
                    Choreographer.getInstance().postFrameCallback(a0Var.d);
                    break;
                }
                break;
            case 1:
                ((Runnable) this.b).run();
                break;
            case 2:
                uf.b bVar = (uf.b) this.b;
                xf.a aVar = bVar.k;
                xf.a aVar2 = bVar.j;
                if (bVar.n) {
                    ArrayList arrayList = bVar.b;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        org.telegram.ui.e eVar = ((wf.e) obj).f;
                        if (eVar != null) {
                            eVar.invalidate();
                        }
                    }
                    if (aVar2.c != 0) {
                        bVar.d(be.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.c != 0) {
                        bVar.d(be.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    bVar.l.postFrameCallback(bVar.m);
                    break;
                }
                break;
            default:
                yh.h hVar = (yh.h) this.b;
                Rect rect = hVar.m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - hVar.h > 32 && !hVar.j && !rect.isEmpty()) {
                    hVar.h = currentTimeMillis;
                    hVar.j = true;
                    hVar.o.set(rect);
                    hVar.a.postRunnable(new yh.g(hVar, (hVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                hVar.l = false;
                break;
        }
    }
}
