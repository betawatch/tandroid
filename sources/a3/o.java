package a3;

import e2.m1;
import h9.i0;
import h9.o1;
import h9.r1;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class o extends q implements Comparable {
    public final boolean D;
    public final int e;
    public final boolean f;
    public final boolean h;
    public final boolean n;
    public final int r;
    public final int s;
    public final int w;
    public final int x;
    public final int y;

    public o(int i7, m1 m1Var, int i10, n nVar, int i11, String str, String str2) {
        super(i7, m1Var, i10);
        int i12;
        int i13 = 0;
        this.f = jg.g.c(i11, false);
        int i14 = this.d.e;
        int i15 = nVar.C;
        i0 i0Var = nVar.y;
        int i16 = i14 & (~i15);
        this.h = (i16 & 1) != 0;
        this.n = (i16 & 2) != 0;
        i0 u10 = str2 != null ? i0.u(str2) : i0Var.isEmpty() ? i0.u("") : i0Var;
        int i17 = 0;
        while (true) {
            if (i17 >= u10.size()) {
                i12 = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                i12 = s.i(this.d, (String) u10.get(i17), nVar.D);
                if (i12 > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.r = i17;
        this.s = i12;
        int i18 = str2 != null ? 1088 : nVar.A;
        int i19 = this.d.f;
        r1 r1Var = s.l;
        int bitCount = (i19 == 0 || i19 != i18) ? Integer.bitCount(i18 & i19) : Integer.MAX_VALUE;
        this.w = bitCount;
        e2.u uVar = this.d;
        this.D = (1088 & uVar.f) != 0;
        int c10 = s.c(uVar, nVar.z);
        this.x = c10;
        int i20 = s.i(this.d, str, s.l(str) == null);
        this.y = i20;
        boolean z9 = i12 > 0 || (i0Var.isEmpty() && bitCount > 0) || ((i0Var.isEmpty() && c10 != Integer.MAX_VALUE) || this.h || ((this.n && i20 > 0) || nVar.x));
        if (jg.g.c(i11, nVar.B0) && z9) {
            i13 = 1;
        }
        this.e = i13;
    }

    @Override // a3.q
    public final int a() {
        return this.e;
    }

    @Override // a3.q
    public final /* bridge */ /* synthetic */ boolean b(q qVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(o oVar) {
        h9.w c10 = h9.w.a.c(this.f, oVar.f);
        Integer valueOf = Integer.valueOf(this.r);
        Integer valueOf2 = Integer.valueOf(oVar.r);
        o1 o1Var = o1.b;
        o1 o1Var2 = o1.c;
        h9.w b10 = c10.b(valueOf, valueOf2, o1Var2);
        int i7 = oVar.s;
        int i10 = this.s;
        h9.w a10 = b10.a(i10, i7);
        int i11 = oVar.w;
        int i12 = this.w;
        h9.w c11 = a10.a(i12, i11).b(Integer.valueOf(this.x), Integer.valueOf(oVar.x), o1Var2).c(this.h, oVar.h);
        Boolean valueOf3 = Boolean.valueOf(this.n);
        Boolean valueOf4 = Boolean.valueOf(oVar.n);
        if (i10 != 0) {
            o1Var = o1Var2;
        }
        h9.w a11 = c11.b(valueOf3, valueOf4, o1Var).a(this.y, oVar.y);
        if (i12 == 0) {
            a11 = a11.d(this.D, oVar.D);
        }
        return a11.e();
    }
}
