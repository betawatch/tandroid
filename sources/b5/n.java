package b5;

import j4.i1;
import o8.j0;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n extends p implements Comparable {
    public final int e;
    public final boolean f;
    public final boolean h;
    public final boolean n;
    public final int r;
    public final int s;
    public final int v;
    public final int w;
    public final boolean x;

    public n(int i9, i1 i1Var, int i10, j jVar, int i11, String str) {
        super(i9, i1Var, i10);
        int i12;
        int i13;
        int i14 = 0;
        this.f = r.f(i11, false);
        int i15 = this.d.d;
        int i16 = jVar.G;
        o8.z zVar = jVar.E;
        int i17 = i15 & (~i16);
        this.h = (i17 & 1) != 0;
        this.n = (i17 & 2) != 0;
        o8.z y10 = zVar.isEmpty() ? o8.z.y("") : zVar;
        int i18 = 0;
        while (true) {
            int size = y10.size();
            i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (i18 >= size) {
                i18 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                i13 = 0;
                break;
            } else {
                i13 = r.d(this.d, (String) y10.get(i18), jVar.H);
                if (i13 > 0) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        this.r = i18;
        this.s = i13;
        int i19 = this.d.e;
        int i20 = jVar.F;
        i12 = (i19 == 0 || i19 != i20) ? Integer.bitCount(i19 & i20) : i12;
        this.v = i12;
        this.x = (this.d.e & 1088) != 0;
        int d = r.d(this.d, str, r.h(str) == null);
        this.w = d;
        boolean z10 = i13 > 0 || (zVar.isEmpty() && i12 > 0) || this.h || (this.n && d > 0);
        if (r.f(i11, jVar.W) && z10) {
            i14 = 1;
        }
        this.e = i14;
    }

    @Override // b5.p
    public final int a() {
        return this.e;
    }

    @Override // b5.p
    public final /* bridge */ /* synthetic */ boolean b(p pVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(n nVar) {
        o8.t c10 = o8.t.a.c(this.f, nVar.f);
        Integer valueOf = Integer.valueOf(this.r);
        Integer valueOf2 = Integer.valueOf(nVar.r);
        j0 j0Var = j0.b;
        j0 j0Var2 = j0.c;
        o8.t b10 = c10.b(valueOf, valueOf2, j0Var2);
        int i9 = nVar.s;
        int i10 = this.s;
        o8.t a2 = b10.a(i10, i9);
        int i11 = nVar.v;
        int i12 = this.v;
        o8.t c11 = a2.a(i12, i11).c(this.h, nVar.h);
        Boolean valueOf3 = Boolean.valueOf(this.n);
        Boolean valueOf4 = Boolean.valueOf(nVar.n);
        if (i10 != 0) {
            j0Var = j0Var2;
        }
        o8.t a3 = c11.b(valueOf3, valueOf4, j0Var).a(this.w, nVar.w);
        if (i12 == 0) {
            a3 = a3.d(this.x, nVar.x);
        }
        return a3.e();
    }
}
