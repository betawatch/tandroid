package org.telegram.ui;

import android.os.SystemClock;
import java.util.HashSet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f31(Object obj, long j10, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        switch (this.a) {
            case 0:
                ((mi.f) this.c).a(Long.valueOf(this.b));
                break;
            case 1:
                org.telegram.ui.web.b0 b0Var = (org.telegram.ui.web.b0) this.c;
                b0Var.getClass();
                b0Var.presentFragment(wm.ra(this.b));
                break;
            case 2:
                vi.j jVar = (vi.j) ((vi.f) this.c).c;
                if (this.b == jVar.o && (i3 = jVar.G) != 9 && i3 != 10 && i3 != 8) {
                    SystemClock.elapsedRealtime();
                    jVar.w = false;
                    jVar.s(3);
                    jVar.i.removeCallbacks(jVar.D);
                    jVar.h.b("recording started: retainedDurationMs=" + vi.j.r(jVar.p));
                    break;
                }
                break;
            default:
                xg.w0 w0Var = (xg.w0) this.c;
                HashSet hashSet = w0Var.X1;
                hashSet.remove(Long.valueOf(this.b));
                w0Var.R1.b(true, hashSet, new xg.r0(w0Var, 5), null);
                w0Var.n1(true, false);
                break;
        }
    }
}
