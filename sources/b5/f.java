package b5;

import android.text.TextUtils;
import d5.g0;
import h3.t0;
import j4.i1;
import org.telegram.tgnet.ConnectionsManager;
import p8.j0;
import p8.k0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f extends o implements Comparable {
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
    public final i n;
    public final boolean r;
    public final int s;
    public final int v;
    public final int w;
    public final boolean x;
    public final int y;

    public f(int i10, i1 i1Var, int i11, i iVar, int i12, boolean z10, e eVar) {
        super(i10, i1Var, i11);
        p8.z zVar;
        int i13;
        int i14;
        int i15;
        this.n = iVar;
        this.h = q.h(this.d.c);
        int i16 = 0;
        this.r = q.f(i12, false);
        int i17 = 0;
        while (true) {
            p8.z zVar2 = iVar.y;
            zVar = iVar.D;
            int size = zVar2.size();
            i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (i17 >= size) {
                i17 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                i14 = 0;
                break;
            } else {
                i14 = q.d(this.d, (String) iVar.y.get(i17), false);
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
        int i19 = iVar.A;
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
        this.f = (i22 == -1 || i22 <= iVar.C) && (i21 == -1 || i21 <= iVar.B) && eVar.apply(t0Var);
        String[] z11 = g0.z();
        int i23 = 0;
        while (true) {
            if (i23 >= z11.length) {
                i23 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                i15 = 0;
                break;
            } else {
                i15 = q.d(this.d, z11[i23], false);
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
        i iVar2 = this.n;
        if (q.f(i12, iVar2.W) && (z12 || iVar2.Q)) {
            i16 = (!q.f(i12, false) || !z12 || this.d.n == -1 || iVar2.J || iVar2.I || (!iVar2.Y && z10)) ? 1 : 2;
        }
        this.e = i16;
    }

    @Override // b5.o
    public final int a() {
        return this.e;
    }

    @Override // b5.o
    public final boolean b(o oVar) {
        int i10;
        String str;
        int i11;
        f fVar = (f) oVar;
        t0 t0Var = fVar.d;
        i iVar = this.n;
        boolean z10 = iVar.T;
        t0 t0Var2 = this.d;
        if (!z10 && ((i11 = t0Var2.O) == -1 || i11 != t0Var.O)) {
            return false;
        }
        if (!iVar.R && ((str = t0Var2.B) == null || !TextUtils.equals(str, t0Var.B))) {
            return false;
        }
        if (!iVar.S && ((i10 = t0Var2.P) == -1 || i10 != t0Var.P)) {
            return false;
        }
        if (iVar.U) {
            return true;
        }
        return this.G == fVar.G && this.H == fVar.H;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(f fVar) {
        boolean z10 = this.r;
        boolean z11 = this.f;
        k0 a2 = (z11 && z10) ? q.k : q.k.a();
        boolean z12 = fVar.r;
        int i10 = fVar.E;
        p8.t c10 = p8.t.a.c(z10, z12);
        Integer valueOf = Integer.valueOf(this.v);
        Integer valueOf2 = Integer.valueOf(fVar.v);
        j0 j0Var = j0.c;
        p8.t b10 = c10.b(valueOf, valueOf2, j0Var).a(this.s, fVar.s).a(this.w, fVar.w).c(this.B, fVar.B).c(this.x, fVar.x).b(Integer.valueOf(this.y), Integer.valueOf(fVar.y), j0Var).a(this.A, fVar.A).c(z11, fVar.f).b(Integer.valueOf(this.F), Integer.valueOf(fVar.F), j0Var);
        int i11 = this.E;
        p8.t b11 = b10.b(Integer.valueOf(i11), Integer.valueOf(i10), this.n.I ? q.k.a() : q.l).c(this.G, fVar.G).c(this.H, fVar.H).b(Integer.valueOf(this.C), Integer.valueOf(fVar.C), a2).b(Integer.valueOf(this.D), Integer.valueOf(fVar.D), a2);
        Integer valueOf3 = Integer.valueOf(i11);
        Integer valueOf4 = Integer.valueOf(i10);
        if (!g0.a(this.h, fVar.h)) {
            a2 = q.l;
        }
        return b11.b(valueOf3, valueOf4, a2).e();
    }
}
