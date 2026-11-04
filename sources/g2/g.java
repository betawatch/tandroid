package g2;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import u4.a1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g {
    public int a;
    public int b;
    public int c;
    public int[] d;

    public g(int[] iArr) {
        this.a = h10.t0;
        this.b = -1;
        this.c = -1;
        this.d = iArr;
    }

    public void a(int i3) {
        int[] iArr = this.d;
        int i10 = this.b;
        iArr[i10] = i3;
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

    public void b(int i3, int i10) {
        if (i3 < 0) {
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
        iArr4[i12] = i3;
        iArr4[i12 + 1] = i10;
        this.c++;
    }

    public void c(RecyclerView recyclerView, boolean z10) {
        boolean z11;
        int i3;
        this.c = 0;
        int[] iArr = this.d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        u4.o0 o0Var = recyclerView.y;
        if (recyclerView.x == null || o0Var == null || !o0Var.h) {
            return;
        }
        if (z10) {
            if (!recyclerView.d.g()) {
                int b10 = recyclerView.x.b();
                u4.b0 b0Var = (u4.b0) o0Var;
                u4.a0 a0Var = b0Var.B;
                if (a0Var == null || (i3 = a0Var.a) < 0) {
                    b0Var.f1();
                    z11 = b0Var.v;
                    i3 = b0Var.y;
                    if (i3 == -1) {
                        i3 = z11 ? b10 - 1 : 0;
                    }
                } else {
                    z11 = a0Var.c;
                }
                int i10 = z11 ? -1 : 1;
                for (int i11 = 0; i11 < b0Var.E && i3 >= 0 && i3 < b10; i11++) {
                    b(i3, 0);
                    i3 += i10;
                }
            }
        } else if (!recyclerView.Z()) {
            int i12 = this.a;
            int i13 = this.b;
            a1 a1Var = recyclerView.v0;
            u4.b0 b0Var2 = (u4.b0) o0Var;
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
        if (i14 > o0Var.i) {
            o0Var.i = i14;
            o0Var.j = z10;
            recyclerView.b.l();
        }
    }

    public void d() {
        int[] iArr = this.d;
        int i3 = h10.t0;
        if (this.a != i3) {
            hs.f(i3).j(this.b);
            this.b = -1;
            this.a = i3;
        }
        this.b = hs.f(i3).q(iArr, this.b, true);
        this.c = hs.e().q(iArr, this.c, true);
    }

    public void e() {
        hs.f(this.a).j(this.b);
        hs.e().j(this.c);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(int i3) {
        this((int[]) null);
        switch (i3) {
            case 1:
                break;
            default:
                this.c = 7;
                this.d = new int[8];
                break;
        }
    }
}
