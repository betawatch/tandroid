package b5;

import j4.i1;
import org.telegram.tgnet.ConnectionsManager;
import p8.j0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class m extends o implements Comparable {
    public final int e;
    public final boolean f;
    public final boolean h;
    public final boolean n;
    public final int r;
    public final int s;
    public final int v;
    public final int w;
    public final boolean x;

    public m(int i10, i1 i1Var, int i11, i iVar, int i12, String str) {
        super(i10, i1Var, i11);
        int i13;
        int i14;
        int i15 = 0;
        this.f = q.f(i12, false);
        int i16 = this.d.d;
        int i17 = iVar.G;
        p8.z zVar = iVar.E;
        int i18 = i16 & (~i17);
        this.h = (i18 & 1) != 0;
        this.n = (i18 & 2) != 0;
        p8.z y10 = zVar.isEmpty() ? p8.z.y("") : zVar;
        int i19 = 0;
        while (true) {
            int size = y10.size();
            i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (i19 >= size) {
                i19 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                i14 = 0;
                break;
            } else {
                i14 = q.d(this.d, (String) y10.get(i19), iVar.H);
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
        int i21 = iVar.F;
        i13 = (i20 == 0 || i20 != i21) ? Integer.bitCount(i20 & i21) : i13;
        this.v = i13;
        this.x = (this.d.e & 1088) != 0;
        int d = q.d(this.d, str, q.h(str) == null);
        this.w = d;
        boolean z10 = i14 > 0 || (zVar.isEmpty() && i13 > 0) || this.h || (this.n && d > 0);
        if (q.f(i12, iVar.W) && z10) {
            i15 = 1;
        }
        this.e = i15;
    }

    @Override // b5.o
    public final int a() {
        return this.e;
    }

    @Override // b5.o
    public final /* bridge */ /* synthetic */ boolean b(o oVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(m mVar) {
        p8.t c10 = p8.t.a.c(this.f, mVar.f);
        Integer valueOf = Integer.valueOf(this.r);
        Integer valueOf2 = Integer.valueOf(mVar.r);
        j0 j0Var = j0.b;
        j0 j0Var2 = j0.c;
        p8.t b10 = c10.b(valueOf, valueOf2, j0Var2);
        int i10 = mVar.s;
        int i11 = this.s;
        p8.t a2 = b10.a(i11, i10);
        int i12 = mVar.v;
        int i13 = this.v;
        p8.t c11 = a2.a(i13, i12).c(this.h, mVar.h);
        Boolean valueOf3 = Boolean.valueOf(this.n);
        Boolean valueOf4 = Boolean.valueOf(mVar.n);
        if (i11 != 0) {
            j0Var = j0Var2;
        }
        p8.t a3 = c11.b(valueOf3, valueOf4, j0Var).a(this.w, mVar.w);
        if (i13 == 0) {
            a3 = a3.d(this.x, mVar.x);
        }
        return a3.e();
    }
}
