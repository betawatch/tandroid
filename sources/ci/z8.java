package ci;

import android.content.Context;
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z8 {
    public final org.telegram.ui.ActionBar.d2 a;
    public final long b;
    public final org.telegram.ui.Components.ac c;
    public final org.telegram.ui.Components.ub d;
    public final org.telegram.ui.Components.yb e;
    public final d9 f;
    public int g;
    public long h;
    public b8 i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final y8 p;

    /* JADX WARN: Type inference failed for: r2v0, types: [ci.y8, java.lang.Runnable] */
    public z8(org.telegram.ui.ActionBar.d2 d2Var, long j10) {
        final int i3 = 0;
        ?? r22 = new Runnable(this) { // from class: ci.y8
            public final /* synthetic */ z8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.a();
                        break;
                    default:
                        z8 z8Var = this.b;
                        if (!z8Var.n && !z8Var.o && z8Var.m) {
                            z8Var.n = true;
                            b8 b8Var = z8Var.i;
                            if (b8Var != null) {
                                b8Var.a(z8Var.k);
                            }
                            if (z8Var.e != null) {
                                z8Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.p = r22;
        this.a = d2Var;
        this.b = j10;
        Context t10 = e9.t(d2Var);
        org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(t10, d2Var.getResourceProvider());
        this.d = ubVar;
        ubVar.c(R.raw.stars_topup, new String[0]);
        d9 d9Var = new d9(t10, d2Var.getResourceProvider());
        this.f = d9Var;
        d9Var.b = 3000L;
        int i10 = org.telegram.ui.ActionBar.k6.uj;
        org.telegram.ui.ActionBar.e6 resourceProvider = d2Var.getResourceProvider();
        a3.j jVar = new a3.j(20);
        a3.j jVar2 = new a3.j(21);
        int Q = org.telegram.ui.ActionBar.r6.Q(i10, -1, 0, 0.0f, resourceProvider);
        jVar2.f(Q, d9Var);
        org.telegram.ui.ActionBar.l6 x10 = org.telegram.ui.ActionBar.r6.x(101, d9Var);
        x10.c(i10, -1, 0, 0.0f, resourceProvider);
        x10.n = jVar;
        x10.o = jVar2;
        x10.m = false;
        x10.g = Q;
        final int i11 = 1;
        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(t10, d2Var.getResourceProvider(), true, false);
        this.e = ybVar;
        ybVar.e(bd.M0(2131745033, null));
        ybVar.b = new Runnable(this) { // from class: ci.y8
            public final /* synthetic */ z8 b;

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
                        z8 z8Var = this.b;
                        if (!z8Var.n && !z8Var.o && z8Var.m) {
                            z8Var.n = true;
                            b8 b8Var = z8Var.i;
                            if (b8Var != null) {
                                b8Var.a(z8Var.k);
                            }
                            if (z8Var.e != null) {
                                z8Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        ybVar.addView(d9Var, mf.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ybVar.e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        ubVar.setButton(ybVar);
        org.telegram.ui.Components.ac b10 = org.telegram.ui.Components.fc.a0(d2Var).b(ubVar, -1);
        this.c = b10;
        b10.r = false;
        b10.k(true);
        b10.v = new Runnable(this) { // from class: ci.y8
            public final /* synthetic */ z8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.a();
                        break;
                    default:
                        z8 z8Var = this.b;
                        if (!z8Var.n && !z8Var.o && z8Var.m) {
                            z8Var.n = true;
                            b8 b8Var = z8Var.i;
                            if (b8Var != null) {
                                b8Var.a(z8Var.k);
                            }
                            if (z8Var.e != null) {
                                z8Var.c.b();
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
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((Runnable) obj).run();
        }
        if (this.e != null) {
            this.c.b();
        }
    }
}
