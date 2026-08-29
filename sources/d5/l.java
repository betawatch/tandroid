package d5;

import l4.j1;
import org.telegram.tgnet.ConnectionsManager;
import q8.j0;
import q8.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    public l(int i10, j1 j1Var, int i11, h hVar, int i12, String str) {
        super(i10, j1Var, i11);
        int i13;
        int i14;
        int i15 = 0;
        this.f = p.f(i12, false);
        int i16 = this.d.d;
        int i17 = hVar.G;
        z zVar = hVar.E;
        int i18 = i16 & (~i17);
        this.h = (i18 & 1) != 0;
        this.n = (i18 & 2) != 0;
        z y8 = zVar.isEmpty() ? z.y("") : zVar;
        int i19 = 0;
        while (true) {
            int size = y8.size();
            i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (i19 >= size) {
                i19 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                i14 = 0;
                break;
            } else {
                i14 = p.d(this.d, (String) y8.get(i19), hVar.H);
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
        int i21 = hVar.F;
        i13 = (i20 == 0 || i20 != i21) ? Integer.bitCount(i20 & i21) : i13;
        this.v = i13;
        this.x = (this.d.e & 1088) != 0;
        int d = p.d(this.d, str, p.h(str) == null);
        this.w = d;
        boolean z10 = i14 > 0 || (zVar.isEmpty() && i13 > 0) || this.h || (this.n && d > 0);
        if (p.f(i12, hVar.W) && z10) {
            i15 = 1;
        }
        this.e = i15;
    }

    @Override // d5.n
    public final int a() {
        return this.e;
    }

    @Override // d5.n
    public final /* bridge */ /* synthetic */ boolean b(n nVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(l lVar) {
        q8.t c3 = q8.t.a.c(this.f, lVar.f);
        Integer valueOf = Integer.valueOf(this.r);
        Integer valueOf2 = Integer.valueOf(lVar.r);
        j0 j0Var = j0.b;
        j0 j0Var2 = j0.c;
        q8.t b10 = c3.b(valueOf, valueOf2, j0Var2);
        int i10 = lVar.s;
        int i11 = this.s;
        q8.t a2 = b10.a(i11, i10);
        int i12 = lVar.v;
        int i13 = this.v;
        q8.t c6 = a2.a(i13, i12).c(this.h, lVar.h);
        Boolean valueOf3 = Boolean.valueOf(this.n);
        Boolean valueOf4 = Boolean.valueOf(lVar.n);
        if (i11 != 0) {
            j0Var = j0Var2;
        }
        q8.t a10 = c6.b(valueOf3, valueOf4, j0Var).a(this.w, lVar.w);
        if (i13 == 0) {
            a10 = a10.d(this.x, lVar.x);
        }
        return a10.e();
    }
}
