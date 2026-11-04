package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class oj0 extends zi0 {
    public SparseIntArray c;
    public SparseIntArray d;
    public SparseIntArray e;
    public int f;
    public int h;
    public final ArrayList n = new ArrayList();

    public oj0() {
        L();
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int b10 = d1Var.b();
        return V(S(b10), Q(b10), d1Var);
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

    public abstract int M(int i3);

    public int N(int i3, int i10) {
        return Objects.hash(Integer.valueOf((-49612) * i3), O(i3, i10));
    }

    public abstract Object O(int i3, int i10);

    public abstract int P(int i3, int i10);

    public final int Q(int i3) {
        int i10 = this.c.get(i3, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int i11 = this.f;
        if (i11 < 0) {
            i11 = R();
            this.f = i11;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int U = U(i12) + i13;
            if (i3 >= i13 && i3 < U) {
                int i14 = i3 - i13;
                this.c.put(i3, i14);
                return i14;
            }
            i12++;
            i13 = U;
        }
        return -1;
    }

    public abstract int R();

    public final int S(int i3) {
        int i10 = this.d.get(i3, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int i11 = this.f;
        if (i11 < 0) {
            i11 = R();
            this.f = i11;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int U = U(i12) + i13;
            if (i3 >= i13 && i3 < U) {
                this.d.put(i3, i12);
                return i12;
            }
            i12++;
            i13 = U;
        }
        return -1;
    }

    public abstract View T(int i3, View view);

    public final int U(int i3) {
        int i10 = this.e.get(i3, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int M = M(i3);
        this.e.put(i3, M);
        return M;
    }

    public abstract boolean V(int i3, int i10, u4.d1 d1Var);

    public abstract void W(int i3, int i10, u4.d1 d1Var);

    public final void X(boolean z10) {
        ArrayList arrayList = this.n;
        ArrayList arrayList2 = new ArrayList(arrayList);
        L();
        arrayList.clear();
        int i3 = this.f;
        if (i3 < 0) {
            i3 = R();
            this.f = i3;
        }
        for (int i10 = 0; i10 < i3; i10++) {
            int U = U(i10);
            for (int i11 = 0; i11 < U; i11++) {
                arrayList.add(Integer.valueOf(N(i10, i11)));
            }
        }
        if (z10) {
            u4.o.c(new kg.g(this, arrayList2, 2), true).c(this);
        } else {
            super.f();
        }
    }

    @Override // u4.h0
    public final int b() {
        int i3 = this.h;
        if (i3 >= 0) {
            return i3;
        }
        this.h = 0;
        int i10 = this.f;
        if (i10 < 0) {
            i10 = R();
            this.f = i10;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            this.h = U(i11) + this.h;
        }
        return this.h;
    }

    @Override // u4.h0
    public final int d(int i3) {
        return P(S(i3), Q(i3));
    }

    @Override // u4.h0
    public void f() {
        X(false);
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        W(S(i3), Q(i3), d1Var);
    }
}
