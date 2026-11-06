package org.telegram.ui;

import android.os.SystemClock;
import java.util.HashSet;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p31(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        switch (this.a) {
            case 0:
                ((org.telegram.messenger.voip.k) this.c).a(Long.valueOf(this.b));
                break;
            case 1:
                org.telegram.ui.web.b0 b0Var = (org.telegram.ui.web.b0) this.c;
                b0Var.getClass();
                b0Var.presentFragment(an.ra(this.b));
                break;
            case 2:
                vi.h hVar = (vi.h) ((ac.e) this.c).c;
                if (this.b == hVar.o && (i7 = hVar.G) != 9 && i7 != 10 && i7 != 8) {
                    SystemClock.elapsedRealtime();
                    hVar.w = false;
                    hVar.s(3);
                    hVar.i.removeCallbacks(hVar.D);
                    hVar.h.b("recording started: retainedDurationMs=" + vi.h.r(hVar.p));
                    break;
                }
                break;
            default:
                wg.w0 w0Var = (wg.w0) this.c;
                HashSet hashSet = w0Var.W1;
                hashSet.remove(Long.valueOf(this.b));
                w0Var.Q1.b(true, hashSet, new wg.r0(w0Var, 5), null);
                w0Var.n1(true, false);
                break;
        }
    }
}
