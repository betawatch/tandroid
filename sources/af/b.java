package af;

import android.graphics.Rect;
import android.view.Choreographer;
import gh.l;
import gh.m;
import i7.w;
import java.util.ArrayList;
import jf.a0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                d dVar = (d) this.b;
                df.a aVar = dVar.k;
                df.a aVar2 = dVar.j;
                if (dVar.n) {
                    ArrayList arrayList = dVar.b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        h hVar = ((cf.e) ((bf.b) obj)).f;
                        if (hVar != null) {
                            hVar.invalidate();
                        }
                    }
                    if (aVar2.c != 0) {
                        dVar.d(w.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.c != 0) {
                        dVar.d(w.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    dVar.l.postFrameCallback(dVar.m);
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
                if (a0Var.B.get()) {
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
