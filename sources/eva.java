// default package

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class eva {
    public final d a;
    public final long b;
    public final u31 c;
    public final o31 d;
    public final s31 e;
    public final iva f;
    public int g;
    public long h;
    public ra i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final dva p;

    /* JADX WARN: Type inference failed for: r2v0, types: [dva, java.lang.Runnable] */
    public eva(d dVar, long j) {
        final byte b = 1;
        final byte b2 = 0;
        ?? r2 = new Runnable(this) { // from class: dva
            public final /* synthetic */ eva b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                eva evaVar = this.b;
                switch (b3) {
                    case 0:
                        evaVar.a();
                        break;
                    default:
                        if (!evaVar.n && !evaVar.o && evaVar.m) {
                            evaVar.n = true;
                            ra raVar = evaVar.i;
                            if (raVar != null) {
                                raVar.a(evaVar.k);
                            }
                            if (evaVar.e != null) {
                                evaVar.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.p = r2;
        this.a = dVar;
        this.b = j;
        Context q = jva.q(dVar);
        o31 o31Var = new o31(q, dVar.getResourceProvider());
        this.d = o31Var;
        o31Var.a.f(R.raw.stars_topup, 32, 32, null);
        iva ivaVar = new iva(q, dVar.getResourceProvider());
        this.f = ivaVar;
        ivaVar.b = 3000L;
        int i = cmb.wj;
        ylb resourceProvider = dVar.getResourceProvider();
        dq9 dq9Var = new dq9((byte) 27);
        dq9 dq9Var2 = new dq9((byte) 28);
        int P = anb.P(i, -1, 0, 0.0f, resourceProvider);
        dq9Var2.e(P, ivaVar);
        umb w = anb.w(101, ivaVar);
        w.c(i, -1, 0, 0.0f, resourceProvider);
        w.n = dq9Var;
        w.o = dq9Var2;
        w.m = false;
        w.g = P;
        s31 s31Var = new s31(dVar.getResourceProvider(), q, true, false);
        this.e = s31Var;
        s31Var.e(jb6.M0(2131744712, null));
        s31Var.b = new Runnable(this) { // from class: dva
            public final /* synthetic */ eva b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b;
                eva evaVar = this.b;
                switch (b3) {
                    case 0:
                        evaVar.a();
                        break;
                    default:
                        if (!evaVar.n && !evaVar.o && evaVar.m) {
                            evaVar.n = true;
                            ra raVar = evaVar.i;
                            if (raVar != null) {
                                raVar.a(evaVar.k);
                            }
                            if (evaVar.e != null) {
                                evaVar.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        s31Var.addView(ivaVar, qoe.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        s31Var.e.setPadding(gm.L(12.0f), gm.L(8.0f), gm.L(30.0f), gm.L(8.0f));
        o31Var.setButton(s31Var);
        u31 b3 = c41.b0(dVar).b(o31Var, -1);
        this.c = b3;
        b3.s = false;
        b3.k(true);
        b3.w = new Runnable(this) { // from class: dva
            public final /* synthetic */ eva b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b2;
                eva evaVar = this.b;
                switch (b32) {
                    case 0:
                        evaVar.a();
                        break;
                    default:
                        if (!evaVar.n && !evaVar.o && evaVar.m) {
                            evaVar.n = true;
                            ra raVar = evaVar.i;
                            if (raVar != null) {
                                raVar.a(evaVar.k);
                            }
                            if (evaVar.e != null) {
                                evaVar.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        gm.r(r2);
        gm.d3(r2, 3000L);
    }

    public final void a() {
        if (this.n || this.o) {
            return;
        }
        this.o = true;
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        if (this.e != null) {
            this.c.b();
        }
    }
}
