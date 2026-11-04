package g9;

import b8.od;
import b8.zb;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y1 extends r0 {
    public static final y1 n;
    public final transient p1 e;
    public final transient int f;
    public transient q0 h;

    static {
        p1 p1Var = new p1();
        p1Var.d(3);
        n = new y1(p1Var);
    }

    public y1(p1 p1Var) {
        this.e = p1Var;
        long j10 = 0;
        int i3 = 0;
        while (true) {
            int i10 = p1Var.c;
            if (i3 >= i10) {
                this.f = od.e(j10);
                return;
            } else {
                zb.j(i3, i10);
                j10 += p1Var.b[i3];
                i3++;
            }
        }
    }

    @Override // g9.d0
    public final boolean m() {
        throw null;
    }

    @Override // g9.r0
    public final t0 o() {
        q0 q0Var = this.h;
        if (q0Var != null) {
            return q0Var;
        }
        q0 q0Var2 = new q0(this, 1);
        this.h = q0Var2;
        return q0Var2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f;
    }
}
