package cf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import jh.l;
import jh.m;
import k7.o;
import lf.a0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        switch (this.a) {
            case 0:
                c cVar = (c) this.b;
                ff.a aVar = cVar.k;
                ff.a aVar2 = cVar.j;
                if (cVar.n) {
                    ArrayList arrayList = cVar.b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        g gVar = ((ef.e) ((df.b) obj)).f;
                        if (gVar != null) {
                            gVar.invalidate();
                        }
                    }
                    if (aVar2.c != 0) {
                        cVar.d(o.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.c != 0) {
                        cVar.d(o.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.l.postFrameCallback(cVar.m);
                    break;
                }
                break;
            case 1:
                ((Runnable) this.b).run();
                break;
            case 2:
                m mVar = (m) this.b;
                Rect rect = mVar.m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - mVar.h > 32 && !mVar.j && !rect.isEmpty()) {
                    mVar.h = currentTimeMillis;
                    mVar.j = true;
                    mVar.o.set(rect);
                    mVar.a.postRunnable(new l(mVar, (mVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                mVar.l = false;
                break;
            default:
                a0 a0Var = (a0) this.b;
                if (a0Var.C.get()) {
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
        }
    }
}
