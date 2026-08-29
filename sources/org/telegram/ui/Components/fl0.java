package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class fl0 extends tk0 {
    public SparseIntArray c;
    public SparseIntArray d;
    public SparseIntArray e;
    public int f;
    public int h;
    public final ArrayList n = new ArrayList();

    public fl0() {
        L();
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int b10 = n1Var.b();
        return V(S(b10), Q(b10), n1Var);
    }

    public final void L() {
        SparseIntArray sparseIntArray = this.d;
        if (sparseIntArray == null) {
            this.d = new SparseIntArray();
            this.c = new SparseIntArray();
            this.e = new SparseIntArray();
        } else {
            sparseIntArray.clear();
            this.c.clear();
            this.e.clear();
        }
        this.h = -1;
        this.f = -1;
    }

    public abstract int M(int i10);

    public int N(int i10, int i11) {
        return Objects.hash(Integer.valueOf((-49612) * i10), O(i10, i11));
    }

    public abstract Object O(int i10, int i11);

    public abstract int P(int i10, int i11);

    public final int Q(int i10) {
        int i11 = this.c.get(i10, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        int i12 = this.f;
        if (i12 < 0) {
            i12 = R();
            this.f = i12;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            int U = U(i13) + i14;
            if (i10 >= i14 && i10 < U) {
                int i15 = i10 - i14;
                this.c.put(i10, i15);
                return i15;
            }
            i13++;
            i14 = U;
        }
        return -1;
    }

    public abstract int R();

    public final int S(int i10) {
        int i11 = this.d.get(i10, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        int i12 = this.f;
        if (i12 < 0) {
            i12 = R();
            this.f = i12;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            int U = U(i13) + i14;
            if (i10 >= i14 && i10 < U) {
                this.d.put(i10, i13);
                return i13;
            }
            i13++;
            i14 = U;
        }
        return -1;
    }

    public abstract View T(int i10, View view);

    public final int U(int i10) {
        int i11 = this.e.get(i10, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        int M = M(i10);
        this.e.put(i10, M);
        return M;
    }

    public abstract boolean V(int i10, int i11, f2.n1 n1Var);

    public abstract void W(int i10, int i11, f2.n1 n1Var);

    public final void X(boolean z10) {
        ArrayList arrayList = this.n;
        ArrayList arrayList2 = new ArrayList(arrayList);
        L();
        arrayList.clear();
        int i10 = this.f;
        if (i10 < 0) {
            i10 = R();
            this.f = i10;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            int U = U(i11);
            for (int i12 = 0; i12 < U; i12++) {
                arrayList.add(Integer.valueOf(N(i11, i12)));
            }
        }
        if (z10) {
            f2.q.c(new mx(this, arrayList2, 1), true).b(this);
        } else {
            super.l();
        }
    }

    @Override // f2.p0
    public final int h() {
        int i10 = this.h;
        if (i10 >= 0) {
            return i10;
        }
        this.h = 0;
        int i11 = this.f;
        if (i11 < 0) {
            i11 = R();
            this.f = i11;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            this.h = U(i12) + this.h;
        }
        return this.h;
    }

    @Override // f2.p0
    public final int j(int i10) {
        return P(S(i10), Q(i10));
    }

    @Override // f2.p0
    public void l() {
        X(false);
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        W(S(i10), Q(i10), n1Var);
    }
}
