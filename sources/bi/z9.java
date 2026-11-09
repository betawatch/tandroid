package bi;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class z9 {
    public final org.telegram.ui.ActionBar.f2 a;
    public final long b;
    public final org.telegram.ui.Components.cc c;
    public final org.telegram.ui.Components.wb d;
    public final org.telegram.ui.Components.ac e;
    public final da f;
    public int g;
    public long h;
    public b9 i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final y9 p;

    /* JADX WARN: Type inference failed for: r2v0, types: [bi.y9, java.lang.Runnable] */
    public z9(org.telegram.ui.ActionBar.f2 f2Var, long j3) {
        final int i7 = 0;
        ?? r22 = new Runnable(this) { // from class: bi.y9
            public final /* synthetic */ z9 b;

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
                        z9 z9Var = this.b;
                        if (!z9Var.n && !z9Var.o && z9Var.m) {
                            z9Var.n = true;
                            b9 b9Var = z9Var.i;
                            if (b9Var != null) {
                                b9Var.a(z9Var.k);
                            }
                            if (z9Var.e != null) {
                                z9Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.p = r22;
        this.a = f2Var;
        this.b = j3;
        Context t6 = ea.t(f2Var);
        org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(t6, f2Var.getResourceProvider());
        this.d = wbVar;
        wbVar.c(R.raw.stars_topup, new String[0]);
        da daVar = new da(t6, f2Var.getResourceProvider());
        this.f = daVar;
        daVar.b = 3000L;
        int i10 = org.telegram.ui.ActionBar.l6.uj;
        org.telegram.ui.ActionBar.g6 resourceProvider = f2Var.getResourceProvider();
        a3.l lVar = new a3.l(24);
        a3.l lVar2 = new a3.l(25);
        int P = org.telegram.ui.ActionBar.s6.P(i10, -1, 0, 0.0f, resourceProvider);
        lVar2.c(P, daVar);
        org.telegram.ui.ActionBar.m6 w10 = org.telegram.ui.ActionBar.s6.w(101, daVar);
        w10.c(i10, -1, 0, 0.0f, resourceProvider);
        w10.n = lVar;
        w10.o = lVar2;
        w10.m = false;
        w10.g = P;
        final int i11 = 1;
        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(t6, f2Var.getResourceProvider(), true, false);
        this.e = acVar;
        acVar.e(org.telegram.messenger.id.M0(2131745023, null));
        acVar.b = new Runnable(this) { // from class: bi.y9
            public final /* synthetic */ z9 b;

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
                        z9 z9Var = this.b;
                        if (!z9Var.n && !z9Var.o && z9Var.m) {
                            z9Var.n = true;
                            b9 b9Var = z9Var.i;
                            if (b9Var != null) {
                                b9Var.a(z9Var.k);
                            }
                            if (z9Var.e != null) {
                                z9Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        acVar.addView(daVar, c8.ha.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        acVar.e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        wbVar.setButton(acVar);
        org.telegram.ui.Components.cc b10 = org.telegram.ui.Components.hc.a0(f2Var).b(wbVar, -1);
        this.c = b10;
        b10.r = false;
        b10.k(true);
        b10.v = new Runnable(this) { // from class: bi.y9
            public final /* synthetic */ z9 b;

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
                        z9 z9Var = this.b;
                        if (!z9Var.n && !z9Var.o && z9Var.m) {
                            z9Var.n = true;
                            b9 b9Var = z9Var.i;
                            if (b9Var != null) {
                                b9Var.a(z9Var.k);
                            }
                            if (z9Var.e != null) {
                                z9Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        org.telegram.messenger.g0.r(r22);
        org.telegram.messenger.g0.i3(r22, 3000L);
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
