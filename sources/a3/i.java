package a3;

import android.text.TextUtils;
import e2.m1;
import e2.o1;
import h2.l0;
import h9.i0;
import h9.n1;
import h9.q1;
import j$.util.Objects;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class i extends q implements Comparable {
    public final boolean E;
    public final boolean F;
    public final int G;
    public final int H;
    public final boolean I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
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
    public i(int i7, m1 m1Var, int i10, n nVar, int i11, boolean z10, e eVar, int i12) {
        super(i7, m1Var, i10);
        int i13;
        int i14;
        boolean z11;
        String[] G;
        int i15;
        int i16;
        int i17;
        e2.u uVar;
        boolean z12;
        n nVar2;
        boolean z13;
        o1 o1Var;
        boolean z14;
        this.n = nVar;
        boolean z15 = nVar.z0;
        i0 i0Var = nVar.v;
        i0 i0Var2 = nVar.q;
        int i18 = z15 ? 24 : 16;
        int i19 = 0;
        this.E = false;
        this.h = s.l(this.d.d);
        this.r = i5.c.b(i11, false);
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
        this.F = i23 == 0 || (i23 & 1) != 0;
        this.I = (uVar2.e & 1) != 0;
        String str = uVar2.s;
        if (str != null) {
            switch (str.hashCode()) {
                case -2123537834:
                    if (str.equals("audio/eac3-joc")) {
                        z14 = false;
                        break;
                    }
                    z14 = -1;
                    break;
                case 187078297:
                    if (str.equals("audio/ac4")) {
                        z14 = true;
                        break;
                    }
                    z14 = -1;
                    break;
                case 1504698186:
                    if (str.equals("audio/iamf")) {
                        z14 = 2;
                        break;
                    }
                    z14 = -1;
                    break;
                default:
                    z14 = -1;
                    break;
            }
            switch (z14) {
                case false:
                case true:
                case true:
                    z11 = true;
                    break;
            }
            this.P = z11;
            int i24 = uVar2.K;
            this.J = i24;
            this.K = uVar2.L;
            int i25 = uVar2.j;
            this.L = i25;
            this.f = (i25 != -1 || i25 <= nVar.u) && (i24 == -1 || i24 <= nVar.t) && eVar.apply(uVar2);
            G = l0.G();
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
            this.G = i15;
            this.H = i16;
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
            this.M = i13;
            this.N = (i11 & 384) != 128;
            this.O = (i11 & 64) != 64;
            uVar = this.d;
            z12 = this.f;
            nVar2 = this.n;
            z13 = nVar2.B0;
            o1Var = nVar2.w;
            if (i5.c.b(i11, z13) && ((z12 || nVar2.y0) && (o1Var.a != 2 || s.n(nVar2, i11, uVar)))) {
                i19 = (i5.c.b(i11, false) || !z12 || uVar.j == -1 || nVar2.G || nVar2.F || (!nVar2.C0 && z10) || o1Var.a == 2 || (i18 & i11) == 0) ? 1 : 2;
            }
            this.e = i19;
        }
        z11 = false;
        this.P = z11;
        int i242 = uVar2.K;
        this.J = i242;
        this.K = uVar2.L;
        int i252 = uVar2.j;
        this.L = i252;
        this.f = (i252 != -1 || i252 <= nVar.u) && (i242 == -1 || i242 <= nVar.t) && eVar.apply(uVar2);
        G = l0.G();
        i15 = 0;
        while (true) {
            if (i15 >= G.length) {
            }
            i15++;
        }
        this.G = i15;
        this.H = i16;
        i17 = 0;
        while (true) {
            if (i17 < i0Var.size()) {
            }
            i17++;
        }
        this.M = i13;
        this.N = (i11 & 384) != 128;
        this.O = (i11 & 64) != 64;
        uVar = this.d;
        z12 = this.f;
        nVar2 = this.n;
        z13 = nVar2.B0;
        o1Var = nVar2.w;
        if (i5.c.b(i11, z13)) {
            if (i5.c.b(i11, false)) {
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
        return (this.E || ((str = uVar2.s) != null && TextUtils.equals(str, uVar.s))) && (i7 = uVar2.L) != -1 && i7 == uVar.L && this.N == iVar.N && this.O == iVar.O;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(i iVar) {
        boolean z10 = this.r;
        boolean z11 = this.f;
        q1 a10 = (z11 && z10) ? s.l : s.l.a();
        boolean z12 = iVar.r;
        int i7 = iVar.L;
        h9.w c10 = h9.w.a.c(z10, z12);
        Integer valueOf = Integer.valueOf(this.w);
        Integer valueOf2 = Integer.valueOf(iVar.w);
        n1 n1Var = n1.c;
        h9.w b10 = c10.b(valueOf, valueOf2, n1Var).a(this.s, iVar.s).a(this.x, iVar.x).b(Integer.valueOf(this.y), Integer.valueOf(iVar.y), n1Var).c(this.I, iVar.I).c(this.F, iVar.F).b(Integer.valueOf(this.G), Integer.valueOf(iVar.G), n1Var).a(this.H, iVar.H).c(z11, iVar.f).b(Integer.valueOf(this.M), Integer.valueOf(iVar.M), n1Var);
        boolean z13 = this.n.F;
        int i10 = this.L;
        if (z13) {
            b10 = b10.b(Integer.valueOf(i10), Integer.valueOf(i7), s.l.a());
        }
        h9.w b11 = b10.c(this.N, iVar.N).c(this.O, iVar.O).c(this.P, iVar.P).b(Integer.valueOf(this.J), Integer.valueOf(iVar.J), a10).b(Integer.valueOf(this.K), Integer.valueOf(iVar.K), a10);
        if (Objects.equals(this.h, iVar.h)) {
            b11 = b11.b(Integer.valueOf(i10), Integer.valueOf(i7), a10);
        }
        return b11.e();
    }
}
