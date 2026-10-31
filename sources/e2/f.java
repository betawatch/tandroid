package e2;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import org.telegram.messenger.d20;
import org.telegram.messenger.zs;
import s4.z0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f {
    public int a;
    public int b;
    public int c;
    public int[] d;

    public f(int[] iArr) {
        this.a = d20.s0;
        this.b = -1;
        this.c = -1;
        this.d = iArr;
    }

    public void a(int i10) {
        int[] iArr = this.d;
        int i11 = this.b;
        iArr[i11] = i10;
        int i12 = this.c & (i11 + 1);
        this.b = i12;
        int i13 = this.a;
        if (i12 == i13) {
            int length = iArr.length;
            int i14 = length - i13;
            int i15 = length << 1;
            int[] iArr2 = new int[i15];
            System.arraycopy(iArr, i13, iArr2, 0, i14);
            System.arraycopy(this.d, 0, iArr2, i14, this.a);
            this.d = iArr2;
            this.a = 0;
            this.b = length;
            this.c = i15 - 1;
        }
    }

    public void b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i12 = this.c;
        int i13 = i12 * 2;
        int[] iArr = this.d;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.d = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i13 >= iArr.length) {
            int[] iArr3 = new int[i12 * 4];
            this.d = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.d;
        iArr4[i13] = i10;
        iArr4[i13 + 1] = i11;
        this.c++;
    }

    public void c(RecyclerView recyclerView, boolean z10) {
        boolean z11;
        int i10;
        this.c = 0;
        int[] iArr = this.d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        s4.n0 n0Var = recyclerView.y;
        if (recyclerView.x == null || n0Var == null || !n0Var.h) {
            return;
        }
        if (z10) {
            if (!recyclerView.d.h()) {
                int b10 = recyclerView.x.b();
                s4.a0 a0Var = (s4.a0) n0Var;
                s4.z zVar = a0Var.B;
                if (zVar == null || (i10 = zVar.a) < 0) {
                    a0Var.f1();
                    z11 = a0Var.v;
                    i10 = a0Var.y;
                    if (i10 == -1) {
                        i10 = z11 ? b10 - 1 : 0;
                    }
                } else {
                    z11 = zVar.c;
                }
                int i11 = z11 ? -1 : 1;
                for (int i12 = 0; i12 < a0Var.E && i10 >= 0 && i10 < b10; i12++) {
                    b(i10, 0);
                    i10 += i11;
                }
            }
        } else if (!recyclerView.Z()) {
            int i13 = this.a;
            int i14 = this.b;
            z0 z0Var = recyclerView.u0;
            s4.a0 a0Var2 = (s4.a0) n0Var;
            if (a0Var2.o != 0) {
                i13 = i14;
            }
            if (a0Var2.r() != 0 && i13 != 0) {
                a0Var2.G0();
                a0Var2.m1(i13 > 0 ? 1 : -1, Math.abs(i13), true, z0Var);
                a0Var2.A0(z0Var, a0Var2.p, this);
            }
        }
        int i15 = this.c;
        if (i15 > n0Var.i) {
            n0Var.i = i15;
            n0Var.j = z10;
            recyclerView.b.l();
        }
    }

    public void d() {
        int[] iArr = this.d;
        int i10 = d20.s0;
        if (this.a != i10) {
            zs.f(i10).j(this.b);
            this.b = -1;
            this.a = i10;
        }
        this.b = zs.f(i10).q(iArr, this.b, true);
        this.c = zs.e().q(iArr, this.c, true);
    }

    public void e() {
        zs.f(this.a).j(this.b);
        zs.e().j(this.c);
    }

    public f() {
        this.c = 7;
        this.d = new int[8];
    }
}
