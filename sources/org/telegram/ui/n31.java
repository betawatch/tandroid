package org.telegram.ui;

import android.os.RemoteException;
import android.os.SystemClock;
import android.os.Trace;
import java.util.HashSet;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class n31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n31(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        switch (this.a) {
            case 0:
                ((li.v) this.c).a(Long.valueOf(this.b));
                return;
            case 1:
                org.telegram.ui.web.a0 a0Var = (org.telegram.ui.web.a0) this.c;
                long j3 = this.b;
                a0Var.getClass();
                a0Var.presentFragment(an.ua(j3));
                return;
            case 2:
                org.telegram.utils.twidget.l1 l1Var = (org.telegram.utils.twidget.l1) this.c;
                long j10 = this.b;
                Trace.beginSection("WidgetSandbox:Destroy");
                try {
                    org.telegram.utils.twidget.u0 u0Var = l1Var.c;
                    org.telegram.utils.twidget.r0 r0Var = (org.telegram.utils.twidget.r0) u0Var.e.remove(Long.valueOf(j10));
                    if (r0Var != null) {
                        org.telegram.utils.twidget.b h12 = r0Var.h1();
                        if (h12 != null) {
                            try {
                                h12.K(r0Var.d);
                            } catch (RemoteException unused) {
                            }
                        }
                        synchronized (u0Var.b) {
                            u0Var.j(r0Var.a);
                        }
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 3:
                wg.u0 u0Var2 = (wg.u0) this.c;
                long j11 = this.b;
                HashSet hashSet = u0Var2.a2;
                hashSet.remove(Long.valueOf(j11));
                u0Var2.U1.b(true, hashSet, new wg.p0(u0Var2, 5), null);
                u0Var2.n1(true, false);
                return;
            default:
                ac.e eVar = (ac.e) this.c;
                long j12 = this.b;
                yi.j jVar = (yi.j) eVar.c;
                if (j12 != jVar.o || (i7 = jVar.G) == 9 || i7 == 10 || i7 == 8) {
                    return;
                }
                SystemClock.elapsedRealtime();
                jVar.w = false;
                jVar.s(3);
                jVar.i.removeCallbacks(jVar.D);
                jVar.h.b("recording started: retainedDurationMs=" + yi.j.r(jVar.p));
                return;
        }
    }
}
