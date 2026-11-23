package di;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class t8 {
    public final org.telegram.ui.ActionBar.g2 a;
    public final long b;
    public final org.telegram.ui.Components.gc c;
    public final org.telegram.ui.Components.ac d;
    public final org.telegram.ui.Components.ec e;
    public final x8 f;
    public int g;
    public long h;
    public ai.x2 i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final s8 p;

    /* JADX WARN: Type inference failed for: r2v0, types: [di.s8, java.lang.Runnable] */
    public t8(org.telegram.ui.ActionBar.g2 g2Var, long j3) {
        final int i7 = 0;
        ?? r22 = new Runnable(this) { // from class: di.s8
            public final /* synthetic */ t8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.b.a();
                        break;
                    default:
                        t8 t8Var = this.b;
                        if (!t8Var.n && !t8Var.o && t8Var.m) {
                            t8Var.n = true;
                            ai.x2 x2Var = t8Var.i;
                            if (x2Var != null) {
                                x2Var.a(t8Var.k);
                            }
                            if (t8Var.e != null) {
                                t8Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.p = r22;
        this.a = g2Var;
        this.b = j3;
        Context t6 = y8.t(g2Var);
        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(t6, g2Var.getResourceProvider());
        this.d = acVar;
        acVar.c(R.raw.stars_topup, new String[0]);
        x8 x8Var = new x8(t6, g2Var.getResourceProvider());
        this.f = x8Var;
        x8Var.b = 3000L;
        int i10 = org.telegram.ui.ActionBar.m6.xj;
        org.telegram.ui.ActionBar.h6 resourceProvider = g2Var.getResourceProvider();
        ci.v vVar = new ci.v(4);
        ci.v vVar2 = new ci.v(5);
        int P = org.telegram.ui.ActionBar.t6.P(i10, -1, 0, 0.0f, resourceProvider);
        vVar2.d(P, x8Var);
        org.telegram.ui.ActionBar.n6 w10 = org.telegram.ui.ActionBar.t6.w(101, x8Var);
        w10.c(i10, -1, 0, 0.0f, resourceProvider);
        w10.n = vVar;
        w10.o = vVar2;
        w10.m = false;
        w10.g = P;
        final int i11 = 1;
        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(t6, g2Var.getResourceProvider(), true, false);
        this.e = ecVar;
        ecVar.e(hd.N0(2131744780, null));
        ecVar.b = new Runnable(this) { // from class: di.s8
            public final /* synthetic */ t8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.a();
                        break;
                    default:
                        t8 t8Var = this.b;
                        if (!t8Var.n && !t8Var.o && t8Var.m) {
                            t8Var.n = true;
                            ai.x2 x2Var = t8Var.i;
                            if (x2Var != null) {
                                x2Var.a(t8Var.k);
                            }
                            if (t8Var.e != null) {
                                t8Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        ecVar.addView(x8Var, c8.ma.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ecVar.e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        acVar.setButton(ecVar);
        org.telegram.ui.Components.gc b10 = org.telegram.ui.Components.lc.b0(g2Var).b(acVar, -1);
        this.c = b10;
        b10.r = false;
        b10.k(true);
        b10.v = new Runnable(this) { // from class: di.s8
            public final /* synthetic */ t8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.b.a();
                        break;
                    default:
                        t8 t8Var = this.b;
                        if (!t8Var.n && !t8Var.o && t8Var.m) {
                            t8Var.n = true;
                            ai.x2 x2Var = t8Var.i;
                            if (x2Var != null) {
                                x2Var.a(t8Var.k);
                            }
                            if (t8Var.e != null) {
                                t8Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        org.telegram.messenger.g0.r(r22);
        org.telegram.messenger.g0.h3(r22, 3000L);
    }

    public final void a() {
        if (this.n || this.o) {
            return;
        }
        this.o = true;
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
        if (this.e != null) {
            this.c.b();
        }
    }
}
