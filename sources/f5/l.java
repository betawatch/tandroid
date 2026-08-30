package f5;

import o4.s0;
import org.telegram.tgnet.ConnectionsManager;
import s8.g0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class l extends n implements Comparable {
    public final int e;
    public final boolean f;
    public final boolean h;
    public final boolean n;
    public final int r;
    public final int s;
    public final int v;
    public final int w;
    public final boolean x;

    public l(int i10, s0 s0Var, int i11, h hVar, int i12, String str) {
        super(i10, s0Var, i11);
        int i13;
        int i14;
        int i15 = 0;
        this.f = p.f(i12, false);
        int i16 = this.d.d;
        int i17 = hVar.H;
        s8.v vVar = hVar.F;
        int i18 = i16 & (~i17);
        this.h = (i18 & 1) != 0;
        this.n = (i18 & 2) != 0;
        s8.v x10 = vVar.isEmpty() ? s8.v.x("") : vVar;
        int i19 = 0;
        while (true) {
            int size = x10.size();
            i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (i19 >= size) {
                i19 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                i14 = 0;
                break;
            } else {
                i14 = p.d(this.d, (String) x10.get(i19), hVar.I);
                if (i14 > 0) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        this.r = i19;
        this.s = i14;
        int i20 = this.d.e;
        int i21 = hVar.G;
        i13 = (i20 == 0 || i20 != i21) ? Integer.bitCount(i20 & i21) : i13;
        this.v = i13;
        this.x = (this.d.e & 1088) != 0;
        int d = p.d(this.d, str, p.h(str) == null);
        this.w = d;
        boolean z4 = i14 > 0 || (vVar.isEmpty() && i13 > 0) || this.h || (this.n && d > 0);
        if (p.f(i12, hVar.X) && z4) {
            i15 = 1;
        }
        this.e = i15;
    }

    @Override // f5.n
    public final int a() {
        return this.e;
    }

    @Override // f5.n
    public final /* bridge */ /* synthetic */ boolean b(n nVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(l lVar) {
        s8.p c3 = s8.p.a.c(this.f, lVar.f);
        Integer valueOf = Integer.valueOf(this.r);
        Integer valueOf2 = Integer.valueOf(lVar.r);
        g0 g0Var = g0.b;
        g0 g0Var2 = g0.c;
        s8.p b10 = c3.b(valueOf, valueOf2, g0Var2);
        int i10 = lVar.s;
        int i11 = this.s;
        s8.p a2 = b10.a(i11, i10);
        int i12 = lVar.v;
        int i13 = this.v;
        s8.p c10 = a2.a(i13, i12).c(this.h, lVar.h);
        Boolean valueOf3 = Boolean.valueOf(this.n);
        Boolean valueOf4 = Boolean.valueOf(lVar.n);
        if (i11 != 0) {
            g0Var = g0Var2;
        }
        s8.p a10 = c10.b(valueOf3, valueOf4, g0Var).a(this.w, lVar.w);
        if (i13 == 0) {
            a10 = a10.d(this.x, lVar.x);
        }
        return a10.e();
    }
}
