// default package

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.Choreographer;
import org.telegram.utils.twidget.z;
import org.webrtc.RenderSynchronizer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fp4 implements Choreographer.FrameCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fp4(Object obj, byte b) {
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
                ip4 ip4Var = (ip4) obj;
                if (ip4Var.G.get()) {
                    long j2 = ip4Var.b;
                    if (j2 == 0) {
                        ip4Var.b = j;
                    } else {
                        long j3 = j - j2;
                        int i = ip4Var.a;
                        if (j3 >= 1000000000) {
                            ip4Var.c = i;
                            ip4Var.f = ip4Var.e.getAndSet(0);
                            ip4Var.a = 0;
                            ip4Var.b = j;
                        } else {
                            ip4Var.a = i + 1;
                        }
                    }
                    Choreographer.getInstance().postFrameCallback(ip4Var.d);
                    break;
                }
                break;
            case 1:
                fi6 fi6Var = (fi6) obj;
                fi6Var.j = false;
                fi6Var.c();
                break;
            case 2:
                ((Runnable) obj).run();
                break;
            case 3:
                ((RenderSynchronizer) obj).onDisplayRefreshCycleBegin(j);
                break;
            case 4:
                sla slaVar = (sla) obj;
                Rect rect = slaVar.m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - slaVar.h > 32 && !slaVar.j && !rect.isEmpty()) {
                    slaVar.h = currentTimeMillis;
                    slaVar.j = true;
                    slaVar.o.set(rect);
                    slaVar.a.postRunnable(new rla(slaVar, (slaVar.d + 1) % 2, b2));
                }
                rect.set(0, 0, 0, 0);
                slaVar.l = false;
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
