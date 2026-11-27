// default package

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.Choreographer;
import org.telegram.utils.twidget.z;
import org.webrtc.RenderSynchronizer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jr4 implements Choreographer.FrameCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jr4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        byte b = this.a;
        byte b2 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                mr4 mr4Var = (mr4) obj;
                if (mr4Var.G.get()) {
                    long j2 = mr4Var.b;
                    if (j2 == 0) {
                        mr4Var.b = j;
                    } else {
                        long j3 = j - j2;
                        int i = mr4Var.a;
                        if (j3 >= 1000000000) {
                            mr4Var.c = i;
                            mr4Var.f = mr4Var.e.getAndSet(0);
                            mr4Var.a = 0;
                            mr4Var.b = j;
                        } else {
                            mr4Var.a = i + 1;
                        }
                    }
                    Choreographer.getInstance().postFrameCallback(mr4Var.d);
                    break;
                }
                break;
            case 1:
                jk6 jk6Var = (jk6) obj;
                jk6Var.j = false;
                jk6Var.c();
                break;
            case 2:
                ((Runnable) obj).run();
                break;
            case 3:
                ((RenderSynchronizer) obj).onDisplayRefreshCycleBegin(j);
                break;
            case 4:
                ppa ppaVar = (ppa) obj;
                Rect rect = ppaVar.m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - ppaVar.h > 32 && !ppaVar.j && !rect.isEmpty()) {
                    ppaVar.h = currentTimeMillis;
                    ppaVar.j = true;
                    ppaVar.o.set(rect);
                    ppaVar.a.postRunnable(new opa(ppaVar, (ppaVar.d + 1) % 2, b2));
                }
                rect.set(0, 0, 0, 0);
                ppaVar.l = false;
                break;
            default:
                z zVar = (z) obj;
                zVar.J = false;
                long j4 = zVar.v;
                if (!zVar.A && j4 != 0 && zVar.o.compareAndSet(false, true)) {
                    boolean z = zVar.L && (zVar.r.getAndSet(false) || zVar.q.get());
                    boolean z2 = zVar.L && zVar.p.getAndSet(false);
                    if (z2) {
                        zVar.c0 = j;
                    }
                    zVar.Z = SystemClock.uptimeMillis();
                    if (!zVar.a0) {
                        zVar.a0 = true;
                        zVar.a.postDelayed(zVar.b0, 5000L);
                    }
                    zVar.c.j(j4, (j - zVar.m) / 1000000.0f, z2, z, zVar.n.getAndSet(false));
                    break;
                }
                break;
        }
    }
}
