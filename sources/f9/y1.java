package f9;

import a8.ed;
import a8.yb;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        int i10 = 0;
        while (true) {
            int i11 = p1Var.c;
            if (i10 >= i11) {
                this.f = ed.e(j10);
                return;
            } else {
                yb.j(i10, i11);
                j10 += p1Var.b[i10];
                i10++;
            }
        }
    }

    @Override // f9.d0
    public final boolean q() {
        throw null;
    }

    @Override // f9.r0
    public final t0 s() {
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
