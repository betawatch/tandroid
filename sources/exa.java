// default package

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class exa {
    public final e a;
    public final long b;
    public final v21 c;
    public final p21 d;
    public final t21 e;
    public final ixa f;
    public int g;
    public long h;
    public sa i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final dxa p;

    /* JADX WARN: Type inference failed for: r2v0, types: [dxa, java.lang.Runnable] */
    public exa(e eVar, long j) {
        final byte b = 1;
        final byte b2 = 0;
        ?? r2 = new Runnable(this) { // from class: dxa
            public final /* synthetic */ exa b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                exa exaVar = this.b;
                switch (b3) {
                    case 0:
                        exaVar.a();
                        break;
                    default:
                        if (!exaVar.n && !exaVar.o && exaVar.m) {
                            exaVar.n = true;
                            sa saVar = exaVar.i;
                            if (saVar != null) {
                                saVar.a(exaVar.k);
                            }
                            if (exaVar.e != null) {
                                exaVar.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.p = r2;
        this.a = eVar;
        this.b = j;
        Context q = jxa.q(eVar);
        p21 p21Var = new p21(q, eVar.getResourceProvider());
        this.d = p21Var;
        p21Var.a.f(R.raw.stars_topup, 32, 32, null);
        ixa ixaVar = new ixa(q, eVar.getResourceProvider());
        this.f = ixaVar;
        ixaVar.b = 3000L;
        int i = aob.xj;
        vnb resourceProvider = eVar.getResourceProvider();
        vr9 vr9Var = new vr9((byte) 28);
        vr9 vr9Var2 = new vr9((byte) 29);
        int P = yob.P(i, -1, 0, 0.0f, resourceProvider);
        vr9Var2.e(P, ixaVar);
        sob w = yob.w(101, ixaVar);
        w.c(i, -1, 0, 0.0f, resourceProvider);
        w.n = vr9Var;
        w.o = vr9Var2;
        w.m = false;
        w.g = P;
        t21 t21Var = new t21(eVar.getResourceProvider(), q, true, false);
        this.e = t21Var;
        t21Var.e(ob6.M0(2131744680, null));
        t21Var.b = new Runnable(this) { // from class: dxa
            public final /* synthetic */ exa b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b;
                exa exaVar = this.b;
                switch (b3) {
                    case 0:
                        exaVar.a();
                        break;
                    default:
                        if (!exaVar.n && !exaVar.o && exaVar.m) {
                            exaVar.n = true;
                            sa saVar = exaVar.i;
                            if (saVar != null) {
                                saVar.a(exaVar.k);
                            }
                            if (exaVar.e != null) {
                                exaVar.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        t21Var.addView(ixaVar, tre.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        t21Var.e.setPadding(hl.L(12.0f), hl.L(8.0f), hl.L(30.0f), hl.L(8.0f));
        p21Var.setButton(t21Var);
        v21 b3 = d31.b0(eVar).b(p21Var, -1);
        this.c = b3;
        b3.s = false;
        b3.k(true);
        b3.w = new Runnable(this) { // from class: dxa
            public final /* synthetic */ exa b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b2;
                exa exaVar = this.b;
                switch (b32) {
                    case 0:
                        exaVar.a();
                        break;
                    default:
                        if (!exaVar.n && !exaVar.o && exaVar.m) {
                            exaVar.n = true;
                            sa saVar = exaVar.i;
                            if (saVar != null) {
                                saVar.a(exaVar.k);
                            }
                            if (exaVar.e != null) {
                                exaVar.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        hl.r(r2);
        hl.d3(r2, 3000L);
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
