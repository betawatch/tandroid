package f5;

import android.text.TextUtils;
import h5.d0;
import j3.n0;
import o4.s0;
import org.telegram.tgnet.ConnectionsManager;
import s8.g0;
import s8.h0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e extends n implements Comparable {
    public final int B;
    public final boolean C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final boolean H;
    public final boolean I;
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

    public e(int i10, s0 s0Var, int i11, h hVar, int i12, boolean z4, d dVar) {
        super(i10, s0Var, i11);
        s8.v vVar;
        int i13;
        int i14;
        int i15;
        this.n = hVar;
        this.h = p.h(this.d.c);
        int i16 = 0;
        this.r = p.f(i12, false);
        int i17 = 0;
        while (true) {
            s8.v vVar2 = hVar.y;
            vVar = hVar.E;
            int size = vVar2.size();
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
        int i19 = hVar.B;
        this.w = (i18 == 0 || i18 != i19) ? Integer.bitCount(i18 & i19) : ConnectionsManager.DEFAULT_DATACENTER_ID;
        n0 n0Var = this.d;
        int i20 = n0Var.e;
        this.x = i20 == 0 || (i20 & 1) != 0;
        this.C = (n0Var.d & 1) != 0;
        int i21 = n0Var.P;
        this.D = i21;
        this.E = n0Var.Q;
        int i22 = n0Var.n;
        this.F = i22;
        this.f = (i22 == -1 || i22 <= hVar.D) && (i21 == -1 || i21 <= hVar.C) && dVar.apply(n0Var);
        String[] z10 = d0.z();
        int i23 = 0;
        while (true) {
            if (i23 >= z10.length) {
                i23 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                i15 = 0;
                break;
            } else {
                i15 = p.d(this.d, z10[i23], false);
                if (i15 > 0) {
                    break;
                } else {
                    i23++;
                }
            }
        }
        this.y = i23;
        this.B = i15;
        int i24 = 0;
        while (true) {
            if (i24 < vVar.size()) {
                String str = this.d.C;
                if (str != null && str.equals(vVar.get(i24))) {
                    i13 = i24;
                    break;
                }
                i24++;
            } else {
                break;
            }
        }
        this.G = i13;
        this.H = (i12 & 384) == 128;
        this.I = (i12 & 64) == 64;
        boolean z11 = this.f;
        h hVar2 = this.n;
        if (p.f(i12, hVar2.X) && (z11 || hVar2.R)) {
            i16 = (!p.f(i12, false) || !z11 || this.d.n == -1 || hVar2.K || hVar2.J || (!hVar2.Z && z4)) ? 1 : 2;
        }
        this.e = i16;
    }

    @Override // f5.n
    public final int a() {
        return this.e;
    }

    @Override // f5.n
    public final boolean b(n nVar) {
        int i10;
        String str;
        int i11;
        e eVar = (e) nVar;
        n0 n0Var = eVar.d;
        h hVar = this.n;
        boolean z4 = hVar.U;
        n0 n0Var2 = this.d;
        if (!z4 && ((i11 = n0Var2.P) == -1 || i11 != n0Var.P)) {
            return false;
        }
        if (!hVar.S && ((str = n0Var2.C) == null || !TextUtils.equals(str, n0Var.C))) {
            return false;
        }
        if (!hVar.T && ((i10 = n0Var2.Q) == -1 || i10 != n0Var.Q)) {
            return false;
        }
        if (hVar.V) {
            return true;
        }
        return this.H == eVar.H && this.I == eVar.I;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(e eVar) {
        boolean z4 = this.r;
        boolean z10 = this.f;
        h0 a2 = (z10 && z4) ? p.k : p.k.a();
        boolean z11 = eVar.r;
        int i10 = eVar.F;
        s8.p c3 = s8.p.a.c(z4, z11);
        Integer valueOf = Integer.valueOf(this.v);
        Integer valueOf2 = Integer.valueOf(eVar.v);
        g0 g0Var = g0.c;
        s8.p b10 = c3.b(valueOf, valueOf2, g0Var).a(this.s, eVar.s).a(this.w, eVar.w).c(this.C, eVar.C).c(this.x, eVar.x).b(Integer.valueOf(this.y), Integer.valueOf(eVar.y), g0Var).a(this.B, eVar.B).c(z10, eVar.f).b(Integer.valueOf(this.G), Integer.valueOf(eVar.G), g0Var);
        int i11 = this.F;
        s8.p b11 = b10.b(Integer.valueOf(i11), Integer.valueOf(i10), this.n.J ? p.k.a() : p.l).c(this.H, eVar.H).c(this.I, eVar.I).b(Integer.valueOf(this.D), Integer.valueOf(eVar.D), a2).b(Integer.valueOf(this.E), Integer.valueOf(eVar.E), a2);
        Integer valueOf3 = Integer.valueOf(i11);
        Integer valueOf4 = Integer.valueOf(i10);
        if (!d0.a(this.h, eVar.h)) {
            a2 = p.l;
        }
        return b11.b(valueOf3, valueOf4, a2).e();
    }
}
