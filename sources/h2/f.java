package h2;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import v4.a1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class f {
    public int a;
    public int b;
    public int c;
    public int[] d;

    public f(int[] iArr) {
        this.a = p10.s0;
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

    public void c(RecyclerView recyclerView, boolean z9) {
        boolean z10;
        int i7;
        this.c = 0;
        int[] iArr = this.d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        v4.n0 n0Var = recyclerView.y;
        if (recyclerView.x == null || n0Var == null || !n0Var.h) {
            return;
        }
        if (z9) {
            if (!recyclerView.d.g()) {
                int b10 = recyclerView.x.b();
                v4.b0 b0Var = (v4.b0) n0Var;
                v4.a0 a0Var = b0Var.B;
                if (a0Var == null || (i7 = a0Var.a) < 0) {
                    b0Var.f1();
                    z10 = b0Var.v;
                    i7 = b0Var.y;
                    if (i7 == -1) {
                        i7 = z10 ? b10 - 1 : 0;
                    }
                } else {
                    z10 = a0Var.c;
                }
                int i10 = z10 ? -1 : 1;
                for (int i11 = 0; i11 < b0Var.E && i7 >= 0 && i7 < b10; i11++) {
                    b(i7, 0);
                    i7 += i10;
                }
            }
        } else if (!recyclerView.Z()) {
            int i12 = this.a;
            int i13 = this.b;
            a1 a1Var = recyclerView.u0;
            v4.b0 b0Var2 = (v4.b0) n0Var;
            if (b0Var2.o != 0) {
                i12 = i13;
            }
            if (b0Var2.r() != 0 && i12 != 0) {
                b0Var2.G0();
                b0Var2.m1(i12 > 0 ? 1 : -1, Math.abs(i12), true, a1Var);
                b0Var2.A0(a1Var, b0Var2.p, this);
            }
        }
        int i14 = this.c;
        if (i14 > n0Var.i) {
            n0Var.i = i14;
            n0Var.j = z9;
            recyclerView.b.l();
        }
    }

    public void d() {
        int[] iArr = this.d;
        int i7 = p10.s0;
        if (this.a != i7) {
            qs.f(i7).j(this.b);
            this.b = -1;
            this.a = i7;
        }
        this.b = qs.f(i7).q(iArr, this.b, true);
        this.c = qs.e().q(iArr, this.c, true);
    }

    public void e() {
        qs.f(this.a).j(this.b);
        qs.e().j(this.c);
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
