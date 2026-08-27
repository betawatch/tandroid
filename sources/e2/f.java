package e2;

import android.graphics.Rect;
import android.view.Choreographer;
import eh.m;
import gf.b0;
import h7.n;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        switch (this.a) {
            case 0:
                ((Runnable) this.b).run();
                break;
            case 1:
                m mVar = (m) this.b;
                Rect rect = mVar.m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - mVar.h > 32 && !mVar.j && !rect.isEmpty()) {
                    mVar.h = currentTimeMillis;
                    mVar.j = true;
                    mVar.o.set(rect);
                    mVar.a.postRunnable(new eh.l(mVar, (mVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                mVar.l = false;
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
                ye.b bVar = (ye.b) this.b;
                bf.a aVar = bVar.k;
                bf.a aVar2 = bVar.j;
                if (bVar.n) {
                    ArrayList arrayList = bVar.b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ye.e eVar = ((af.f) ((ze.b) obj)).f;
                        if (eVar != null) {
                            eVar.invalidate();
                        }
                    }
                    if (aVar2.c != 0) {
                        bVar.d(n.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.c != 0) {
                        bVar.d(n.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    bVar.l.postFrameCallback(bVar.m);
                    break;
                }
                break;
        }
    }
}
