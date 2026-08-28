package f2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class z extends y {
    public final ArrayList Q;
    public boolean R;

    public z(boolean z10) {
        super(MediaDataController.MAX_STYLE_RUNS_COUNT, z10);
        this.Q = new ArrayList(4);
        this.R = true;
    }

    public abstract boolean B1(int i9);

    public abstract boolean C1(View view);

    /* JADX WARN: Code restructure failed: missing block: B:144:0x00db, code lost:
    
        r25.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x00de, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a2, code lost:
    
        if (r24.f != (-1)) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0135 A[SYNTHETIC] */
    @Override // f2.y, f2.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z0(g1 g1Var, n1 n1Var, k0 k0Var, j0 j0Var) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        int b10;
        float c10;
        View c11;
        g1 g1Var2 = g1Var;
        n1 n1Var2 = n1Var;
        int i18 = this.q.i();
        int i19 = 0;
        boolean z11 = k0Var.e == 1;
        j0Var.a = 0;
        int i20 = k0Var.d;
        boolean z12 = this.v;
        Rect rect = this.P;
        ArrayList arrayList = this.Q;
        int i21 = -1;
        if (z12 && k0Var.f != -1 && B1(i20) && m(k0Var.d + 1) == null) {
            if (B1(k0Var.d + 1)) {
                k0Var.d += 3;
            } else {
                k0Var.d += 2;
            }
            int i22 = k0Var.d;
            for (int i23 = i22; i23 > i20; i23--) {
                View c12 = k0Var.c(g1Var2);
                if (c12 != null) {
                    arrayList.add(c12);
                    if (i23 != i22) {
                        c(c12, rect);
                        w1(c12, i18, false);
                        int b11 = this.q.b(c12);
                        k0Var.b -= b11;
                        k0Var.c += b11;
                    }
                }
            }
            k0Var.d = i22;
        }
        boolean z13 = true;
        while (z13) {
            int i24 = this.J;
            boolean z14 = !arrayList.isEmpty();
            int i25 = 0;
            while (i25 < this.J && k0Var.b(n1Var2) && i24 > 0) {
                int i26 = k0Var.d;
                i24 -= v1(i26, g1Var2, n1Var2);
                if (i24 < 0) {
                    break;
                }
                if (arrayList.isEmpty()) {
                    c11 = k0Var.c(g1Var2);
                } else {
                    c11 = (View) arrayList.get(i19);
                    arrayList.remove(i19);
                    k0Var.d--;
                }
                if (c11 == null) {
                    break;
                }
                this.L[i25] = c11;
                i25++;
                if (k0Var.f == i21 && i24 <= 0 && B1(i26)) {
                    z14 = true;
                }
                i19 = 0;
            }
            p1(i25, g1Var2, n1Var2, z11);
            float f10 = 0.0f;
            int i27 = 0;
            for (int i28 = 0; i28 < i25; i28++) {
                View view = this.L[i28];
                if (k0Var.k == null) {
                    if (z11) {
                        a(view, -1, false);
                    } else {
                        a(view, 0, false);
                    }
                } else if (z11) {
                    a(view, -1, true);
                } else {
                    z10 = false;
                    a(view, 0, true);
                    c(view, rect);
                    w1(view, i18, z10);
                    b10 = this.q.b(view);
                    if (b10 > i27) {
                        i27 = b10;
                    }
                    c10 = (this.q.c(view) * 1.0f) / ((w) view.getLayoutParams()).f;
                    if (c10 <= f10) {
                        f10 = c10;
                    }
                }
                z10 = false;
                c(view, rect);
                w1(view, i18, z10);
                b10 = this.q.b(view);
                if (b10 > i27) {
                }
                c10 = (this.q.c(view) * 1.0f) / ((w) view.getLayoutParams()).f;
                if (c10 <= f10) {
                }
            }
            int i29 = 0;
            while (i29 < i25) {
                View view2 = this.L[i29];
                if (this.q.b(view2) != i27) {
                    w wVar = (w) view2.getLayoutParams();
                    Rect rect2 = wVar.b;
                    i16 = i29;
                    i17 = i18;
                    x1(z0.s(false, this.K[wVar.f], TLObject.FLAG_30, rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) wVar).leftMargin + ((ViewGroup.MarginLayoutParams) wVar).rightMargin, ((ViewGroup.MarginLayoutParams) wVar).width), View.MeasureSpec.makeMeasureSpec(i27 - (((rect2.top + rect2.bottom) + ((ViewGroup.MarginLayoutParams) wVar).topMargin) + ((ViewGroup.MarginLayoutParams) wVar).bottomMargin), TLObject.FLAG_30), view2, true);
                } else {
                    i16 = i29;
                    i17 = i18;
                }
                i29 = i16 + 1;
                i18 = i17;
            }
            int i30 = i18;
            boolean C1 = C1(this.L[0]);
            if (C1) {
                i9 = -1;
            } else {
                i9 = -1;
            }
            if (C1 || k0Var.f != 1) {
                if (k0Var.f == -1) {
                    int i31 = k0Var.b - j0Var.a;
                    int i32 = i31 - i27;
                    i11 = i31;
                    i12 = this.m;
                    i10 = i32;
                } else {
                    int i33 = j0Var.a + k0Var.b;
                    i10 = i33;
                    i11 = i33 + i27;
                    i12 = 0;
                }
                int i34 = i12;
                int i35 = 0;
                while (i35 < i25) {
                    View view3 = this.L[i35];
                    w wVar2 = (w) view3.getLayoutParams();
                    int c13 = this.q.c(view3);
                    int i36 = i35;
                    boolean z15 = z11;
                    if (k0Var.f == -1) {
                        i34 -= c13;
                    }
                    int i37 = c13 + i34;
                    z0.O(view3, i34, i10, i37, i11);
                    if (k0Var.f == 1) {
                        i34 = i37;
                    }
                    if (wVar2.a.j() || wVar2.a.m()) {
                        j0Var.c = true;
                    }
                    j0Var.d |= view3.hasFocusable();
                    i35 = i36 + 1;
                    z11 = z15;
                }
                boolean z16 = z11;
                j0Var.a += i27;
                Arrays.fill(this.L, (Object) null);
                g1Var2 = g1Var;
                n1Var2 = n1Var;
                z13 = z14;
                i18 = i30;
                z11 = z16;
                i19 = 0;
                i21 = -1;
            }
            if (k0Var.f == i9) {
                int i38 = k0Var.b - j0Var.a;
                i15 = i38 - i27;
                i13 = i38;
                i14 = 0;
            } else {
                int i39 = j0Var.a + k0Var.b;
                i13 = i39 + i27;
                i14 = this.m;
                i15 = i39;
            }
            for (int i40 = i25 - 1; i40 >= 0; i40--) {
                View view4 = this.L[i40];
                w wVar3 = (w) view4.getLayoutParams();
                int c14 = this.q.c(view4);
                int i41 = i14;
                int i42 = k0Var.f == 1 ? i41 - c14 : i41;
                int i43 = c14 + i42;
                z0.O(view4, i42, i15, i43, i13);
                i14 = k0Var.f == -1 ? i43 : i42;
                if (wVar3.a.j() || wVar3.a.m()) {
                    j0Var.c = true;
                }
                j0Var.d |= view4.hasFocusable();
            }
            boolean z162 = z11;
            j0Var.a += i27;
            Arrays.fill(this.L, (Object) null);
            g1Var2 = g1Var;
            n1Var2 = n1Var;
            z13 = z14;
            i18 = i30;
            z11 = z162;
            i19 = 0;
            i21 = -1;
        }
    }

    @Override // f2.m0, f2.z0
    public final boolean e() {
        return this.R;
    }

    @Override // f2.m0
    public final void e1(g1 g1Var, int i9, int i10) {
        if (i9 < 0) {
            return;
        }
        int r10 = r();
        if (!this.v) {
            for (int i11 = 0; i11 < r10; i11++) {
                View q10 = q(i11);
                if (q10.getBottom() + ((ViewGroup.MarginLayoutParams) ((a1) q10.getLayoutParams())).bottomMargin <= i9) {
                    if (q10.getHeight() + q10.getTop() <= i9) {
                    }
                }
                d1(g1Var, 0, i11);
                return;
            }
            return;
        }
        int i12 = r10 - 1;
        for (int i13 = i12; i13 >= 0; i13--) {
            View q11 = q(i13);
            if (q11.getBottom() + ((ViewGroup.MarginLayoutParams) ((a1) q11.getLayoutParams())).bottomMargin <= i9) {
                if (q11.getHeight() + q11.getTop() <= i9) {
                }
            }
            d1(g1Var, i12, i13);
            return;
        }
    }

    @Override // f2.y
    public final int[] q1(int i9, int i10, int[] iArr) {
        if (iArr == null || iArr.length != i9 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i9 + 1];
        }
        iArr[0] = 0;
        for (int i11 = 1; i11 <= i9; i11++) {
            iArr[i11] = (int) Math.ceil((i11 / i9) * i10);
        }
        return iArr;
    }

    @Override // f2.y
    public final void w1(View view, int i9, boolean z10) {
        w wVar = (w) view.getLayoutParams();
        Rect rect = wVar.b;
        int i10 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) wVar).topMargin + ((ViewGroup.MarginLayoutParams) wVar).bottomMargin;
        x1(z0.s(false, this.K[wVar.f], i9, rect.left + rect.right + ((ViewGroup.MarginLayoutParams) wVar).leftMargin + ((ViewGroup.MarginLayoutParams) wVar).rightMargin, ((ViewGroup.MarginLayoutParams) wVar).width), z0.s(true, this.q.k(), this.l, i10, ((ViewGroup.MarginLayoutParams) wVar).height), view, z10);
    }
}
