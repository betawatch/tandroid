// default package

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bta {
    public final d a;
    public final long b;
    public final m21 c;
    public final g21 d;
    public final k21 e;
    public final fta f;
    public int g;
    public long h;
    public ra i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final ata p;

    /* JADX WARN: Type inference failed for: r2v0, types: [ata, java.lang.Runnable] */
    public bta(d dVar, long j) {
        final byte b = 1;
        final byte b2 = 0;
        ?? r2 = new Runnable(this) { // from class: ata
            public final /* synthetic */ bta b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                bta btaVar = this.b;
                switch (b3) {
                    case 0:
                        btaVar.a();
                        break;
                    default:
                        if (!btaVar.n && !btaVar.o && btaVar.m) {
                            btaVar.n = true;
                            ra raVar = btaVar.i;
                            if (raVar != null) {
                                raVar.a(btaVar.k);
                            }
                            if (btaVar.e != null) {
                                btaVar.c.b();
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
        Context q = gta.q(dVar);
        g21 g21Var = new g21(q, dVar.getResourceProvider());
        this.d = g21Var;
        g21Var.a.f(R.raw.stars_topup, 32, 32, null);
        fta ftaVar = new fta(q, dVar.getResourceProvider());
        this.f = ftaVar;
        ftaVar.b = 3000L;
        int i = bkb.wj;
        wjb resourceProvider = dVar.getResourceProvider();
        ho9 ho9Var = new ho9((byte) 26);
        ho9 ho9Var2 = new ho9((byte) 27);
        int P = zkb.P(i, -1, 0, 0.0f, resourceProvider);
        ho9Var2.d(P, ftaVar);
        tkb w = zkb.w(101, ftaVar);
        w.c(i, -1, 0, 0.0f, resourceProvider);
        w.n = ho9Var;
        w.o = ho9Var2;
        w.m = false;
        w.g = P;
        k21 k21Var = new k21(dVar.getResourceProvider(), q, true, false);
        this.e = k21Var;
        k21Var.e(k96.M0(2131744786, null));
        k21Var.b = new Runnable(this) { // from class: ata
            public final /* synthetic */ bta b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b;
                bta btaVar = this.b;
                switch (b3) {
                    case 0:
                        btaVar.a();
                        break;
                    default:
                        if (!btaVar.n && !btaVar.o && btaVar.m) {
                            btaVar.n = true;
                            ra raVar = btaVar.i;
                            if (raVar != null) {
                                raVar.a(btaVar.k);
                            }
                            if (btaVar.e != null) {
                                btaVar.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        k21Var.addView(ftaVar, nme.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        k21Var.e.setPadding(gl.L(12.0f), gl.L(8.0f), gl.L(30.0f), gl.L(8.0f));
        g21Var.setButton(k21Var);
        m21 b3 = u21.b0(dVar).b(g21Var, -1);
        this.c = b3;
        b3.r = false;
        b3.k(true);
        b3.v = new Runnable(this) { // from class: ata
            public final /* synthetic */ bta b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b2;
                bta btaVar = this.b;
                switch (b32) {
                    case 0:
                        btaVar.a();
                        break;
                    default:
                        if (!btaVar.n && !btaVar.o && btaVar.m) {
                            btaVar.n = true;
                            ra raVar = btaVar.i;
                            if (raVar != null) {
                                raVar.a(btaVar.k);
                            }
                            if (btaVar.e != null) {
                                btaVar.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        gl.r(r2);
        gl.d3(r2, 3000L);
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
