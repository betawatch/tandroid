package d5;

import android.text.TextUtils;
import f5.d0;
import j3.t0;
import l4.j1;
import org.telegram.tgnet.ConnectionsManager;
import q8.j0;
import q8.k0;
import q8.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e extends n implements Comparable {
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
    public final h n;
    public final boolean r;
    public final int s;
    public final int v;
    public final int w;
    public final boolean x;
    public final int y;

    public e(int i10, j1 j1Var, int i11, h hVar, int i12, boolean z10, d dVar) {
        super(i10, j1Var, i11);
        z zVar;
        int i13;
        int i14;
        int i15;
        this.n = hVar;
        this.h = p.h(this.d.c);
        int i16 = 0;
        this.r = p.f(i12, false);
        int i17 = 0;
        while (true) {
            z zVar2 = hVar.y;
            zVar = hVar.D;
            int size = zVar2.size();
            i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (i17 >= size) {
                i17 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                i14 = 0;
                break;
            } else {
                i14 = p.d(this.d, (String) hVar.y.get(i17), false);
                if (i14 > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.v = i17;
        this.s = i14;
        int i18 = this.d.e;
        int i19 = hVar.A;
        this.w = (i18 == 0 || i18 != i19) ? Integer.bitCount(i18 & i19) : ConnectionsManager.DEFAULT_DATACENTER_ID;
        t0 t0Var = this.d;
        int i20 = t0Var.e;
        this.x = i20 == 0 || (i20 & 1) != 0;
        this.B = (t0Var.d & 1) != 0;
        int i21 = t0Var.O;
        this.C = i21;
        this.D = t0Var.P;
        int i22 = t0Var.n;
        this.E = i22;
        this.f = (i22 == -1 || i22 <= hVar.C) && (i21 == -1 || i21 <= hVar.B) && dVar.apply(t0Var);
        String[] z11 = d0.z();
        int i23 = 0;
        while (true) {
            if (i23 >= z11.length) {
                i23 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                i15 = 0;
                break;
            } else {
                i15 = p.d(this.d, z11[i23], false);
                if (i15 > 0) {
                    break;
                } else {
                    i23++;
                }
            }
        }
        this.y = i23;
        this.A = i15;
        int i24 = 0;
        while (true) {
            if (i24 < zVar.size()) {
                String str = this.d.B;
                if (str != null && str.equals(zVar.get(i24))) {
                    i13 = i24;
                    break;
                }
                i24++;
            } else {
                break;
            }
        }
        this.F = i13;
        this.G = (i12 & 384) == 128;
        this.H = (i12 & 64) == 64;
        boolean z12 = this.f;
        h hVar2 = this.n;
        if (p.f(i12, hVar2.W) && (z12 || hVar2.Q)) {
            i16 = (!p.f(i12, false) || !z12 || this.d.n == -1 || hVar2.J || hVar2.I || (!hVar2.Y && z10)) ? 1 : 2;
        }
        this.e = i16;
    }

    @Override // d5.n
    public final int a() {
        return this.e;
    }

    @Override // d5.n
    public final boolean b(n nVar) {
        int i10;
        String str;
        int i11;
        e eVar = (e) nVar;
        t0 t0Var = eVar.d;
        h hVar = this.n;
        boolean z10 = hVar.T;
        t0 t0Var2 = this.d;
        if (!z10 && ((i11 = t0Var2.O) == -1 || i11 != t0Var.O)) {
            return false;
        }
        if (!hVar.R && ((str = t0Var2.B) == null || !TextUtils.equals(str, t0Var.B))) {
            return false;
        }
        if (!hVar.S && ((i10 = t0Var2.P) == -1 || i10 != t0Var.P)) {
            return false;
        }
        if (hVar.U) {
            return true;
        }
        return this.G == eVar.G && this.H == eVar.H;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(e eVar) {
        boolean z10 = this.r;
        boolean z11 = this.f;
        k0 a2 = (z11 && z10) ? p.k : p.k.a();
        boolean z12 = eVar.r;
        int i10 = eVar.E;
        q8.t c3 = q8.t.a.c(z10, z12);
        Integer valueOf = Integer.valueOf(this.v);
        Integer valueOf2 = Integer.valueOf(eVar.v);
        j0 j0Var = j0.c;
        q8.t b10 = c3.b(valueOf, valueOf2, j0Var).a(this.s, eVar.s).a(this.w, eVar.w).c(this.B, eVar.B).c(this.x, eVar.x).b(Integer.valueOf(this.y), Integer.valueOf(eVar.y), j0Var).a(this.A, eVar.A).c(z11, eVar.f).b(Integer.valueOf(this.F), Integer.valueOf(eVar.F), j0Var);
        int i11 = this.E;
        q8.t b11 = b10.b(Integer.valueOf(i11), Integer.valueOf(i10), this.n.I ? p.k.a() : p.l).c(this.G, eVar.G).c(this.H, eVar.H).b(Integer.valueOf(this.C), Integer.valueOf(eVar.C), a2).b(Integer.valueOf(this.D), Integer.valueOf(eVar.D), a2);
        Integer valueOf3 = Integer.valueOf(i11);
        Integer valueOf4 = Integer.valueOf(i10);
        if (!d0.a(this.h, eVar.h)) {
            a2 = p.l;
        }
        return b11.b(valueOf3, valueOf4, a2).e();
    }
}
