// default package

import android.util.SparseIntArray;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class j39 extends w29 {
    public SparseIntArray c;
    public SparseIntArray d;
    public SparseIntArray e;
    public int f;
    public int h;
    public final ArrayList n = new ArrayList();

    public j39() {
        L();
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int b = s49Var.b();
        return V(S(b), Q(b), s49Var);
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

    public abstract int M(int i);

    public int N(int i, int i2) {
        return Objects.hash(Integer.valueOf((-49612) * i), O(i, i2));
    }

    public Object O(int i, int i2) {
        return null;
    }

    public int P(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        return i == 2 ? 2 : 0;
    }

    public final int Q(int i) {
        int i2 = this.c.get(i, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int i3 = this.f;
        if (i3 < 0) {
            i3 = R();
            this.f = i3;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int U = U(i4) + i5;
            if (i >= i5 && i < U) {
                int i6 = i - i5;
                this.c.put(i, i6);
                return i6;
            }
            i4++;
            i5 = U;
        }
        return -1;
    }

    public int R() {
        return 3;
    }

    public final int S(int i) {
        int i2 = this.d.get(i, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int i3 = this.f;
        if (i3 < 0) {
            i3 = R();
            this.f = i3;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int U = U(i4) + i5;
            if (i >= i5 && i < U) {
                this.d.put(i, i4);
                return i4;
            }
            i4++;
            i5 = U;
        }
        return -1;
    }

    public View T(int i, View view) {
        return null;
    }

    public final int U(int i) {
        int i2 = this.e.get(i, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int M = M(i);
        this.e.put(i, M);
        return M;
    }

    public boolean V(int i, int i2, s49 s49Var) {
        int i3 = s49Var.f;
        return i3 == 1 || i3 == 4;
    }

    public abstract void W(int i, int i2, s49 s49Var);

    public final void X(boolean z) {
        ArrayList arrayList = this.n;
        ArrayList arrayList2 = new ArrayList(arrayList);
        L();
        arrayList.clear();
        int i = this.f;
        if (i < 0) {
            i = R();
            this.f = i;
        }
        for (int i2 = 0; i2 < i; i2++) {
            int U = U(i2);
            for (int i3 = 0; i3 < U; i3++) {
                arrayList.add(Integer.valueOf(N(i2, i3)));
            }
        }
        if (z) {
            vu7.a(new ij3(this, arrayList2, (byte) 3), true).c(this);
        } else {
            super.f();
        }
    }

    @Override // w39
    public final int b() {
        int i = this.h;
        if (i >= 0) {
            return i;
        }
        int i2 = 0;
        this.h = 0;
        int i3 = this.f;
        if (i3 < 0) {
            i3 = R();
            this.f = i3;
        }
        while (true) {
            int i4 = this.h;
            if (i2 >= i3) {
                return i4;
            }
            this.h = U(i2) + i4;
            i2++;
        }
    }

    @Override // w39
    public final int d(int i) {
        return P(S(i), Q(i));
    }

    @Override // w39
    public void f() {
        X(false);
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        W(S(i), Q(i), s49Var);
    }
}
