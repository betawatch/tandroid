package a3;

import android.text.TextUtils;
import e2.m1;
import e2.o1;
import h2.m0;
import h9.i0;
import h9.r1;
import j$.util.Objects;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class i extends q implements Comparable {
    public final boolean D;
    public final boolean E;
    public final int F;
    public final int G;
    public final boolean H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final int e;
    public final boolean f;
    public final String h;
    public final n n;
    public final boolean r;
    public final int s;
    public final int w;
    public final int x;
    public final int y;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ef A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(int i7, m1 m1Var, int i10, n nVar, int i11, boolean z9, e eVar, int i12) {
        super(i7, m1Var, i10);
        int i13;
        int i14;
        boolean z10;
        String[] G;
        int i15;
        int i16;
        int i17;
        e2.u uVar;
        boolean z11;
        n nVar2;
        boolean z12;
        o1 o1Var;
        boolean z13;
        this.n = nVar;
        boolean z14 = nVar.z0;
        i0 i0Var = nVar.v;
        i0 i0Var2 = nVar.q;
        int i18 = z14 ? 24 : 16;
        int i19 = 0;
        this.D = false;
        this.h = s.l(this.d.d);
        this.r = jg.g.c(i11, false);
        int i20 = 0;
        while (true) {
            int size = i0Var2.size();
            i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (i20 >= size) {
                i14 = 0;
                i20 = Integer.MAX_VALUE;
                break;
            } else {
                i14 = s.i(this.d, (String) i0Var2.get(i20), false);
                if (i14 > 0) {
                    break;
                } else {
                    i20++;
                }
            }
        }
        this.w = i20;
        this.s = i14;
        int i21 = this.d.f;
        int i22 = nVar.s;
        this.x = (i21 == 0 || i21 != i22) ? Integer.bitCount(i21 & i22) : Integer.MAX_VALUE;
        this.y = s.c(this.d, nVar.r);
        e2.u uVar2 = this.d;
        int i23 = uVar2.f;
        this.E = i23 == 0 || (i23 & 1) != 0;
        this.H = (uVar2.e & 1) != 0;
        String str = uVar2.s;
        if (str != null) {
            switch (str.hashCode()) {
                case -2123537834:
                    if (str.equals("audio/eac3-joc")) {
                        z13 = false;
                        break;
                    }
                    z13 = -1;
                    break;
                case 187078297:
                    if (str.equals("audio/ac4")) {
                        z13 = true;
                        break;
                    }
                    z13 = -1;
                    break;
                case 1504698186:
                    if (str.equals("audio/iamf")) {
                        z13 = 2;
                        break;
                    }
                    z13 = -1;
                    break;
                default:
                    z13 = -1;
                    break;
            }
            switch (z13) {
                case false:
                case true:
                case true:
                    z10 = true;
                    break;
            }
            this.O = z10;
            int i24 = uVar2.K;
            this.I = i24;
            this.J = uVar2.L;
            int i25 = uVar2.j;
            this.K = i25;
            this.f = (i25 != -1 || i25 <= nVar.u) && (i24 == -1 || i24 <= nVar.t) && eVar.apply(uVar2);
            G = m0.G();
            i15 = 0;
            while (true) {
                if (i15 >= G.length) {
                    i16 = s.i(this.d, G[i15], false);
                    if (i16 <= 0) {
                        i15++;
                    }
                } else {
                    i16 = 0;
                    i15 = Integer.MAX_VALUE;
                }
            }
            this.F = i15;
            this.G = i16;
            i17 = 0;
            while (true) {
                if (i17 < i0Var.size()) {
                    String str2 = this.d.s;
                    if (str2 == null || !str2.equals(i0Var.get(i17))) {
                        i17++;
                    } else {
                        i13 = i17;
                    }
                }
            }
            this.L = i13;
            this.M = (i11 & 384) != 128;
            this.N = (i11 & 64) != 64;
            uVar = this.d;
            z11 = this.f;
            nVar2 = this.n;
            z12 = nVar2.B0;
            o1Var = nVar2.w;
            if (jg.g.c(i11, z12) && ((z11 || nVar2.y0) && (o1Var.a != 2 || s.n(nVar2, i11, uVar)))) {
                i19 = (jg.g.c(i11, false) || !z11 || uVar.j == -1 || nVar2.G || nVar2.F || (!nVar2.C0 && z9) || o1Var.a == 2 || (i18 & i11) == 0) ? 1 : 2;
            }
            this.e = i19;
        }
        z10 = false;
        this.O = z10;
        int i242 = uVar2.K;
        this.I = i242;
        this.J = uVar2.L;
        int i252 = uVar2.j;
        this.K = i252;
        this.f = (i252 != -1 || i252 <= nVar.u) && (i242 == -1 || i242 <= nVar.t) && eVar.apply(uVar2);
        G = m0.G();
        i15 = 0;
        while (true) {
            if (i15 >= G.length) {
            }
            i15++;
        }
        this.F = i15;
        this.G = i16;
        i17 = 0;
        while (true) {
            if (i17 < i0Var.size()) {
            }
            i17++;
        }
        this.L = i13;
        this.M = (i11 & 384) != 128;
        this.N = (i11 & 64) != 64;
        uVar = this.d;
        z11 = this.f;
        nVar2 = this.n;
        z12 = nVar2.B0;
        o1Var = nVar2.w;
        if (jg.g.c(i11, z12)) {
            if (jg.g.c(i11, false)) {
            }
        }
        this.e = i19;
    }

    @Override // a3.q
    public final int a() {
        return this.e;
    }

    @Override // a3.q
    public final boolean b(q qVar) {
        int i7;
        String str;
        i iVar = (i) qVar;
        e2.u uVar = iVar.d;
        this.n.getClass();
        e2.u uVar2 = this.d;
        int i10 = uVar2.K;
        if (i10 == -1 || i10 != uVar.K) {
            return false;
        }
        return (this.D || ((str = uVar2.s) != null && TextUtils.equals(str, uVar.s))) && (i7 = uVar2.L) != -1 && i7 == uVar.L && this.M == iVar.M && this.N == iVar.N;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(i iVar) {
        boolean z9 = this.r;
        boolean z10 = this.f;
        r1 a10 = (z10 && z9) ? s.l : s.l.a();
        boolean z11 = iVar.r;
        int i7 = iVar.K;
        h9.w c10 = h9.w.a.c(z9, z11);
        Integer valueOf = Integer.valueOf(this.w);
        Integer valueOf2 = Integer.valueOf(iVar.w);
        h9.o1 o1Var = h9.o1.c;
        h9.w b10 = c10.b(valueOf, valueOf2, o1Var).a(this.s, iVar.s).a(this.x, iVar.x).b(Integer.valueOf(this.y), Integer.valueOf(iVar.y), o1Var).c(this.H, iVar.H).c(this.E, iVar.E).b(Integer.valueOf(this.F), Integer.valueOf(iVar.F), o1Var).a(this.G, iVar.G).c(z10, iVar.f).b(Integer.valueOf(this.L), Integer.valueOf(iVar.L), o1Var);
        boolean z12 = this.n.F;
        int i10 = this.K;
        if (z12) {
            b10 = b10.b(Integer.valueOf(i10), Integer.valueOf(i7), s.l.a());
        }
        h9.w b11 = b10.c(this.M, iVar.M).c(this.N, iVar.N).c(this.O, iVar.O).b(Integer.valueOf(this.I), Integer.valueOf(iVar.I), a10).b(Integer.valueOf(this.J), Integer.valueOf(iVar.J), a10);
        if (Objects.equals(this.h, iVar.h)) {
            b11 = b11.b(Integer.valueOf(i10), Integer.valueOf(i7), a10);
        }
        return b11.e();
    }
}
