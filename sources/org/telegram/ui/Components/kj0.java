package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class kj0 extends vi0 {
    public SparseIntArray c;
    public SparseIntArray d;
    public SparseIntArray e;
    public int f;
    public int h;
    public final ArrayList n = new ArrayList();

    public kj0() {
        L();
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
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

    public abstract int M(int i7);

    public int N(int i7, int i10) {
        return Objects.hash(Integer.valueOf((-49612) * i7), O(i7, i10));
    }

    public abstract Object O(int i7, int i10);

    public abstract int P(int i7, int i10);

    public final int Q(int i7) {
        int i10 = this.c.get(i7, ConnectionsManager.DEFAULT_DATACENTER_ID);
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
            if (i7 >= i13 && i7 < U) {
                int i14 = i7 - i13;
                this.c.put(i7, i14);
                return i14;
            }
            i12++;
            i13 = U;
        }
        return -1;
    }

    public abstract int R();

    public final int S(int i7) {
        int i10 = this.d.get(i7, ConnectionsManager.DEFAULT_DATACENTER_ID);
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
            if (i7 >= i13 && i7 < U) {
                this.d.put(i7, i12);
                return i12;
            }
            i12++;
            i13 = U;
        }
        return -1;
    }

    public abstract View T(int i7, View view);

    public final int U(int i7) {
        int i10 = this.e.get(i7, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int M = M(i7);
        this.e.put(i7, M);
        return M;
    }

    public abstract boolean V(int i7, int i10, v4.d1 d1Var);

    public abstract void W(int i7, int i10, v4.d1 d1Var);

    public final void X(boolean z9) {
        ArrayList arrayList = this.n;
        ArrayList arrayList2 = new ArrayList(arrayList);
        L();
        arrayList.clear();
        int i7 = this.f;
        if (i7 < 0) {
            i7 = R();
            this.f = i7;
        }
        for (int i10 = 0; i10 < i7; i10++) {
            int U = U(i10);
            for (int i11 = 0; i11 < U; i11++) {
                arrayList.add(Integer.valueOf(N(i10, i11)));
            }
        }
        if (z9) {
            v4.o.c(new jg.h(this, arrayList2, 2), true).c(this);
        } else {
            super.f();
        }
    }

    @Override // v4.g0
    public final int b() {
        int i7 = this.h;
        if (i7 >= 0) {
            return i7;
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

    @Override // v4.g0
    public final int d(int i7) {
        return P(S(i7), Q(i7));
    }

    @Override // v4.g0
    public void f() {
        X(false);
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        W(S(i7), Q(i7), d1Var);
    }
}
