package dh;

import android.graphics.Rect;
import android.view.Choreographer;
import ff.b0;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        switch (this.a) {
            case 0:
                o oVar = (o) this.b;
                Rect rect = oVar.m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - oVar.h > 32 && !oVar.j && !rect.isEmpty()) {
                    oVar.h = currentTimeMillis;
                    oVar.j = true;
                    oVar.o.set(rect);
                    oVar.a.postRunnable(new n(oVar, (oVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                oVar.l = false;
                break;
            case 1:
                ((Runnable) this.b).run();
                break;
            case 2:
                b0 b0Var = (b0) this.b;
                if (b0Var.B.get()) {
                    long j11 = b0Var.b;
                    if (j11 == 0) {
                        b0Var.b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        b0Var.c = b0Var.a;
                        b0Var.f = b0Var.e.getAndSet(0);
                        b0Var.a = 0;
                        b0Var.b = j10;
                    } else {
                        b0Var.a++;
                    }
                    Choreographer.getInstance().postFrameCallback(b0Var.d);
                    break;
                }
                break;
            default:
                xe.b bVar = (xe.b) this.b;
                af.a aVar = bVar.k;
                af.a aVar2 = bVar.j;
                if (bVar.n) {
                    ArrayList arrayList = bVar.b;
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
                        xe.e eVar = ((ze.e) ((ye.b) obj)).f;
                        if (eVar != null) {
                            eVar.invalidate();
                        }
                    }
                    if (aVar2.c != 0) {
                        bVar.d(g7.n.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.c != 0) {
                        bVar.d(g7.n.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    bVar.l.postFrameCallback(bVar.m);
                    break;
                }
                break;
        }
    }
}
