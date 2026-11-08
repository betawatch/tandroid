package org.telegram.ui;

import android.os.RemoteException;
import android.os.SystemClock;
import android.os.Trace;
import java.util.HashSet;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
                return;
            case 1:
                org.telegram.ui.web.b0 b0Var = (org.telegram.ui.web.b0) this.c;
                long j3 = this.b;
                b0Var.getClass();
                b0Var.presentFragment(an.ra(j3));
                return;
            case 2:
                org.telegram.utils.twidget.h1 h1Var = (org.telegram.utils.twidget.h1) this.c;
                long j10 = this.b;
                Trace.beginSection("WidgetSandbox:Destroy");
                try {
                    org.telegram.utils.twidget.r0 r0Var = h1Var.c;
                    org.telegram.utils.twidget.o0 o0Var = (org.telegram.utils.twidget.o0) r0Var.e.remove(Long.valueOf(j10));
                    if (o0Var != null) {
                        org.telegram.utils.twidget.b h12 = o0Var.h1();
                        if (h12 != null) {
                            try {
                                h12.J(o0Var.d);
                            } catch (RemoteException unused) {
                            }
                        }
                        synchronized (r0Var.b) {
                            r0Var.i(o0Var.a);
                        }
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 3:
                ac.e eVar = (ac.e) this.c;
                long j11 = this.b;
                vi.h hVar = (vi.h) eVar.c;
                if (j11 != hVar.o || (i7 = hVar.G) == 9 || i7 == 10 || i7 == 8) {
                    return;
                }
                SystemClock.elapsedRealtime();
                hVar.w = false;
                hVar.s(3);
                hVar.i.removeCallbacks(hVar.D);
                hVar.h.b("recording started: retainedDurationMs=" + vi.h.r(hVar.p));
                return;
            default:
                wg.w0 w0Var = (wg.w0) this.c;
                long j12 = this.b;
                HashSet hashSet = w0Var.W1;
                hashSet.remove(Long.valueOf(j12));
                w0Var.Q1.b(true, hashSet, new wg.r0(w0Var, 5), null);
                w0Var.n1(true, false);
                return;
        }
    }
}
