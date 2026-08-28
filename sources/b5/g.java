package b5;

import android.text.TextUtils;
import d5.f0;
import h3.t0;
import j4.i1;
import o8.j0;
import o8.k0;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g extends p implements Comparable {
    public final int A;
    public final boolean B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final boolean G;
    public final boolean H;
    public final int e;
    public final boolean f;
    public final String h;
    public final j n;
    public final boolean r;
    public final int s;
    public final int v;
    public final int w;
    public final boolean x;
    public final int y;

    public g(int i9, i1 i1Var, int i10, j jVar, int i11, boolean z10, f fVar) {
        super(i9, i1Var, i10);
        o8.z zVar;
        int i12;
        int i13;
        int i14;
        this.n = jVar;
        this.h = r.h(this.d.c);
        int i15 = 0;
        this.r = r.f(i11, false);
        int i16 = 0;
        while (true) {
            o8.z zVar2 = jVar.y;
            zVar = jVar.D;
            int size = zVar2.size();
            i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (i16 >= size) {
                i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                i13 = 0;
                break;
            } else {
                i13 = r.d(this.d, (String) jVar.y.get(i16), false);
                if (i13 > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.v = i16;
        this.s = i13;
        int i17 = this.d.e;
        int i18 = jVar.A;
        this.w = (i17 == 0 || i17 != i18) ? Integer.bitCount(i17 & i18) : ConnectionsManager.DEFAULT_DATACENTER_ID;
        t0 t0Var = this.d;
        int i19 = t0Var.e;
        this.x = i19 == 0 || (i19 & 1) != 0;
        this.B = (t0Var.d & 1) != 0;
        int i20 = t0Var.O;
        this.C = i20;
        this.D = t0Var.P;
        int i21 = t0Var.n;
        this.E = i21;
        this.f = (i21 == -1 || i21 <= jVar.C) && (i20 == -1 || i20 <= jVar.B) && fVar.apply(t0Var);
        String[] z11 = f0.z();
        int i22 = 0;
        while (true) {
            if (i22 >= z11.length) {
                i22 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                i14 = 0;
                break;
            } else {
                i14 = r.d(this.d, z11[i22], false);
                if (i14 > 0) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.y = i22;
        this.A = i14;
        int i23 = 0;
        while (true) {
            if (i23 < zVar.size()) {
                String str = this.d.B;
                if (str != null && str.equals(zVar.get(i23))) {
                    i12 = i23;
                    break;
                }
                i23++;
            } else {
                break;
            }
        }
        this.F = i12;
        this.G = (i11 & 384) == 128;
        this.H = (i11 & 64) == 64;
        boolean z12 = this.f;
        j jVar2 = this.n;
        if (r.f(i11, jVar2.W) && (z12 || jVar2.Q)) {
            i15 = (!r.f(i11, false) || !z12 || this.d.n == -1 || jVar2.J || jVar2.I || (!jVar2.Y && z10)) ? 1 : 2;
        }
        this.e = i15;
    }

    @Override // b5.p
    public final int a() {
        return this.e;
    }

    @Override // b5.p
    public final boolean b(p pVar) {
        int i9;
        String str;
        int i10;
        g gVar = (g) pVar;
        t0 t0Var = gVar.d;
        j jVar = this.n;
        boolean z10 = jVar.T;
        t0 t0Var2 = this.d;
        if (!z10 && ((i10 = t0Var2.O) == -1 || i10 != t0Var.O)) {
            return false;
        }
        if (!jVar.R && ((str = t0Var2.B) == null || !TextUtils.equals(str, t0Var.B))) {
            return false;
        }
        if (!jVar.S && ((i9 = t0Var2.P) == -1 || i9 != t0Var.P)) {
            return false;
        }
        if (jVar.U) {
            return true;
        }
        return this.G == gVar.G && this.H == gVar.H;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(g gVar) {
        boolean z10 = this.r;
        boolean z11 = this.f;
        k0 a2 = (z11 && z10) ? r.k : r.k.a();
        boolean z12 = gVar.r;
        int i9 = gVar.E;
        o8.t c10 = o8.t.a.c(z10, z12);
        Integer valueOf = Integer.valueOf(this.v);
        Integer valueOf2 = Integer.valueOf(gVar.v);
        j0 j0Var = j0.c;
        o8.t b10 = c10.b(valueOf, valueOf2, j0Var).a(this.s, gVar.s).a(this.w, gVar.w).c(this.B, gVar.B).c(this.x, gVar.x).b(Integer.valueOf(this.y), Integer.valueOf(gVar.y), j0Var).a(this.A, gVar.A).c(z11, gVar.f).b(Integer.valueOf(this.F), Integer.valueOf(gVar.F), j0Var);
        int i10 = this.E;
        o8.t b11 = b10.b(Integer.valueOf(i10), Integer.valueOf(i9), this.n.I ? r.k.a() : r.l).c(this.G, gVar.G).c(this.H, gVar.H).b(Integer.valueOf(this.C), Integer.valueOf(gVar.C), a2).b(Integer.valueOf(this.D), Integer.valueOf(gVar.D), a2);
        Integer valueOf3 = Integer.valueOf(i10);
        Integer valueOf4 = Integer.valueOf(i9);
        if (!f0.a(this.h, gVar.h)) {
            a2 = r.l;
        }
        return b11.b(valueOf3, valueOf4, a2).e();
    }
}
