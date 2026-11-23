package h2;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import v4.c1;
import v4.p0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class f {
    public int a;
    public int b;
    public int c;
    public int[] d;

    public f(int[] iArr) {
        this.a = k10.t0;
        this.b = -1;
        this.c = -1;
        this.d = iArr;
    }

    public void a(int i7) {
        int[] iArr = this.d;
        int i10 = this.b;
        iArr[i10] = i7;
        int i11 = this.c & (i10 + 1);
        this.b = i11;
        int i12 = this.a;
        if (i11 == i12) {
            int length = iArr.length;
            int i13 = length - i12;
            int i14 = length << 1;
            int[] iArr2 = new int[i14];
            System.arraycopy(iArr, i12, iArr2, 0, i13);
            System.arraycopy(this.d, 0, iArr2, i13, this.a);
            this.d = iArr2;
            this.a = 0;
            this.b = length;
            this.c = i14 - 1;
        }
    }

    public void b(int i7, int i10) {
        if (i7 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i11 = this.c;
        int i12 = i11 * 2;
        int[] iArr = this.d;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.d = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i12 >= iArr.length) {
            int[] iArr3 = new int[i11 * 4];
            this.d = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.d;
        iArr4[i12] = i7;
        iArr4[i12 + 1] = i10;
        this.c++;
    }

    public void c(RecyclerView recyclerView, boolean z10) {
        boolean z11;
        int i7;
        this.c = 0;
        int[] iArr = this.d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        p0 p0Var = recyclerView.y;
        if (recyclerView.x == null || p0Var == null || !p0Var.h) {
            return;
        }
        if (z10) {
            if (!recyclerView.d.g()) {
                int b10 = recyclerView.x.b();
                v4.c0 c0Var = (v4.c0) p0Var;
                v4.b0 b0Var = c0Var.B;
                if (b0Var == null || (i7 = b0Var.a) < 0) {
                    c0Var.f1();
                    z11 = c0Var.v;
                    i7 = c0Var.y;
                    if (i7 == -1) {
                        i7 = z11 ? b10 - 1 : 0;
                    }
                } else {
                    z11 = b0Var.c;
                }
                int i10 = z11 ? -1 : 1;
                for (int i11 = 0; i11 < c0Var.E && i7 >= 0 && i7 < b10; i11++) {
                    b(i7, 0);
                    i7 += i10;
                }
            }
        } else if (!recyclerView.Z()) {
            int i12 = this.a;
            int i13 = this.b;
            c1 c1Var = recyclerView.v0;
            v4.c0 c0Var2 = (v4.c0) p0Var;
            if (c0Var2.o != 0) {
                i12 = i13;
            }
            if (c0Var2.r() != 0 && i12 != 0) {
                c0Var2.G0();
                c0Var2.m1(i12 > 0 ? 1 : -1, Math.abs(i12), true, c1Var);
                c0Var2.A0(c1Var, c0Var2.p, this);
            }
        }
        int i14 = this.c;
        if (i14 > p0Var.i) {
            p0Var.i = i14;
            p0Var.j = z10;
            recyclerView.b.l();
        }
    }

    public void d() {
        int[] iArr = this.d;
        int i7 = k10.t0;
        if (this.a != i7) {
            ls.f(i7).j(this.b);
            this.b = -1;
            this.a = i7;
        }
        this.b = ls.f(i7).q(iArr, this.b, true);
        this.c = ls.e().q(iArr, this.c, true);
    }

    public void e() {
        ls.f(this.a).j(this.b);
        ls.e().j(this.c);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(int i7) {
        this((int[]) null);
        switch (i7) {
            case 1:
                break;
            default:
                this.c = 7;
                this.d = new int[8];
                break;
        }
    }
}
