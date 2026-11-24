// default package

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.Choreographer;
import org.telegram.utils.twidget.z;
import org.webrtc.RenderSynchronizer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class gr4 implements Choreographer.FrameCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gr4(Object obj, byte b) {
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
                jr4 jr4Var = (jr4) obj;
                if (jr4Var.G.get()) {
                    long j2 = jr4Var.b;
                    if (j2 == 0) {
                        jr4Var.b = j;
                    } else {
                        long j3 = j - j2;
                        int i = jr4Var.a;
                        if (j3 >= 1000000000) {
                            jr4Var.c = i;
                            jr4Var.f = jr4Var.e.getAndSet(0);
                            jr4Var.a = 0;
                            jr4Var.b = j;
                        } else {
                            jr4Var.a = i + 1;
                        }
                    }
                    Choreographer.getInstance().postFrameCallback(jr4Var.d);
                    break;
                }
                break;
            case 1:
                hk6 hk6Var = (hk6) obj;
                hk6Var.j = false;
                hk6Var.c();
                break;
            case 2:
                ((Runnable) obj).run();
                break;
            case 3:
                ((RenderSynchronizer) obj).onDisplayRefreshCycleBegin(j);
                break;
            case 4:
                tna tnaVar = (tna) obj;
                Rect rect = tnaVar.m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - tnaVar.h > 32 && !tnaVar.j && !rect.isEmpty()) {
                    tnaVar.h = currentTimeMillis;
                    tnaVar.j = true;
                    tnaVar.o.set(rect);
                    tnaVar.a.postRunnable(new sna(tnaVar, (tnaVar.d + 1) % 2, b2));
                }
                rect.set(0, 0, 0, 0);
                tnaVar.l = false;
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
