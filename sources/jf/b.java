package jf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import nh.j;
import nh.k;
import rf.v;
import w7.u;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                mf.a aVar = cVar.k;
                mf.a aVar2 = cVar.j;
                if (cVar.n) {
                    ArrayList arrayList = cVar.b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        g gVar = ((lf.e) obj).f;
                        if (gVar != null) {
                            gVar.invalidate();
                        }
                    }
                    if (aVar2.c != 0) {
                        cVar.d(u.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.c != 0) {
                        cVar.d(u.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.l.postFrameCallback(cVar.m);
                    break;
                }
                break;
            case 1:
                k kVar = (k) this.b;
                Rect rect = kVar.m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - kVar.h > 32 && !kVar.j && !rect.isEmpty()) {
                    kVar.h = currentTimeMillis;
                    kVar.j = true;
                    kVar.o.set(rect);
                    kVar.a.postRunnable(new j(kVar, (kVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                kVar.l = false;
                break;
            case 2:
                ((Runnable) this.b).run();
                break;
            default:
                v vVar = (v) this.b;
                if (vVar.F.get()) {
                    long j11 = vVar.b;
                    if (j11 == 0) {
                        vVar.b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        vVar.c = vVar.a;
                        vVar.f = vVar.e.getAndSet(0);
                        vVar.a = 0;
                        vVar.b = j10;
                    } else {
                        vVar.a++;
                    }
                    Choreographer.getInstance().postFrameCallback(vVar.d);
                    break;
                }
                break;
        }
    }
}
