package f2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class y extends x {
    public final ArrayList Q;
    public boolean R;

    public y(boolean z10) {
        super(MediaDataController.MAX_STYLE_RUNS_COUNT, z10);
        this.Q = new ArrayList(4);
        this.R = true;
    }

    public abstract boolean B1(int i10);

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
    @Override // f2.x, f2.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z0(e1 e1Var, l1 l1Var, i0 i0Var, h0 h0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z10;
        int b10;
        float c10;
        View c11;
        e1 e1Var2 = e1Var;
        l1 l1Var2 = l1Var;
        int i19 = this.q.i();
        int i20 = 0;
        boolean z11 = i0Var.e == 1;
        h0Var.a = 0;
        int i21 = i0Var.d;
        boolean z12 = this.v;
        Rect rect = this.P;
        ArrayList arrayList = this.Q;
        int i22 = -1;
        if (z12 && i0Var.f != -1 && B1(i21) && m(i0Var.d + 1) == null) {
            if (B1(i0Var.d + 1)) {
                i0Var.d += 3;
            } else {
                i0Var.d += 2;
            }
            int i23 = i0Var.d;
            for (int i24 = i23; i24 > i21; i24--) {
                View c12 = i0Var.c(e1Var2);
                if (c12 != null) {
                    arrayList.add(c12);
                    if (i24 != i23) {
                        c(c12, rect);
                        w1(c12, i19, false);
                        int b11 = this.q.b(c12);
                        i0Var.b -= b11;
                        i0Var.c += b11;
                    }
                }
            }
            i0Var.d = i23;
        }
        boolean z13 = true;
        while (z13) {
            int i25 = this.J;
            boolean z14 = !arrayList.isEmpty();
            int i26 = 0;
            while (i26 < this.J && i0Var.b(l1Var2) && i25 > 0) {
                int i27 = i0Var.d;
                i25 -= v1(i27, e1Var2, l1Var2);
                if (i25 < 0) {
                    break;
                }
                if (arrayList.isEmpty()) {
                    c11 = i0Var.c(e1Var2);
                } else {
                    c11 = (View) arrayList.get(i20);
                    arrayList.remove(i20);
                    i0Var.d--;
                }
                if (c11 == null) {
                    break;
                }
                this.L[i26] = c11;
                i26++;
                if (i0Var.f == i22 && i25 <= 0 && B1(i27)) {
                    z14 = true;
                }
                i20 = 0;
            }
            p1(i26, e1Var2, l1Var2, z11);
            float f10 = 0.0f;
            int i28 = 0;
            for (int i29 = 0; i29 < i26; i29++) {
                View view = this.L[i29];
                if (i0Var.k == null) {
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
                    w1(view, i19, z10);
                    b10 = this.q.b(view);
                    if (b10 > i28) {
                        i28 = b10;
                    }
                    c10 = (this.q.c(view) * 1.0f) / ((v) view.getLayoutParams()).f;
                    if (c10 <= f10) {
                        f10 = c10;
                    }
                }
                z10 = false;
                c(view, rect);
                w1(view, i19, z10);
                b10 = this.q.b(view);
                if (b10 > i28) {
                }
                c10 = (this.q.c(view) * 1.0f) / ((v) view.getLayoutParams()).f;
                if (c10 <= f10) {
                }
            }
            int i30 = 0;
            while (i30 < i26) {
                View view2 = this.L[i30];
                if (this.q.b(view2) != i28) {
                    v vVar = (v) view2.getLayoutParams();
                    Rect rect2 = vVar.b;
                    i17 = i30;
                    i18 = i19;
                    x1(x0.s(false, this.K[vVar.f], TLObject.FLAG_30, rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) vVar).leftMargin + ((ViewGroup.MarginLayoutParams) vVar).rightMargin, ((ViewGroup.MarginLayoutParams) vVar).width), View.MeasureSpec.makeMeasureSpec(i28 - (((rect2.top + rect2.bottom) + ((ViewGroup.MarginLayoutParams) vVar).topMargin) + ((ViewGroup.MarginLayoutParams) vVar).bottomMargin), TLObject.FLAG_30), view2, true);
                } else {
                    i17 = i30;
                    i18 = i19;
                }
                i30 = i17 + 1;
                i19 = i18;
            }
            int i31 = i19;
            boolean C1 = C1(this.L[0]);
            if (C1) {
                i10 = -1;
            } else {
                i10 = -1;
            }
            if (C1 || i0Var.f != 1) {
                if (i0Var.f == -1) {
                    int i32 = i0Var.b - h0Var.a;
                    int i33 = i32 - i28;
                    i12 = i32;
                    i13 = this.m;
                    i11 = i33;
                } else {
                    int i34 = h0Var.a + i0Var.b;
                    i11 = i34;
                    i12 = i34 + i28;
                    i13 = 0;
                }
                int i35 = i13;
                int i36 = 0;
                while (i36 < i26) {
                    View view3 = this.L[i36];
                    v vVar2 = (v) view3.getLayoutParams();
                    int c13 = this.q.c(view3);
                    int i37 = i36;
                    boolean z15 = z11;
                    if (i0Var.f == -1) {
                        i35 -= c13;
                    }
                    int i38 = c13 + i35;
                    x0.O(view3, i35, i11, i38, i12);
                    if (i0Var.f == 1) {
                        i35 = i38;
                    }
                    if (vVar2.a.j() || vVar2.a.m()) {
                        h0Var.c = true;
                    }
                    h0Var.d |= view3.hasFocusable();
                    i36 = i37 + 1;
                    z11 = z15;
                }
                boolean z16 = z11;
                h0Var.a += i28;
                Arrays.fill(this.L, (Object) null);
                e1Var2 = e1Var;
                l1Var2 = l1Var;
                z13 = z14;
                i19 = i31;
                z11 = z16;
                i20 = 0;
                i22 = -1;
            }
            if (i0Var.f == i10) {
                int i39 = i0Var.b - h0Var.a;
                i16 = i39 - i28;
                i14 = i39;
                i15 = 0;
            } else {
                int i40 = h0Var.a + i0Var.b;
                i14 = i40 + i28;
                i15 = this.m;
                i16 = i40;
            }
            for (int i41 = i26 - 1; i41 >= 0; i41--) {
                View view4 = this.L[i41];
                v vVar3 = (v) view4.getLayoutParams();
                int c14 = this.q.c(view4);
                int i42 = i15;
                int i43 = i0Var.f == 1 ? i42 - c14 : i42;
                int i44 = c14 + i43;
                x0.O(view4, i43, i16, i44, i14);
                i15 = i0Var.f == -1 ? i44 : i43;
                if (vVar3.a.j() || vVar3.a.m()) {
                    h0Var.c = true;
                }
                h0Var.d |= view4.hasFocusable();
            }
            boolean z162 = z11;
            h0Var.a += i28;
            Arrays.fill(this.L, (Object) null);
            e1Var2 = e1Var;
            l1Var2 = l1Var;
            z13 = z14;
            i19 = i31;
            z11 = z162;
            i20 = 0;
            i22 = -1;
        }
    }

    @Override // f2.k0, f2.x0
    public final boolean e() {
        return this.R;
    }

    @Override // f2.k0
    public final void e1(e1 e1Var, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int r10 = r();
        if (!this.v) {
            for (int i12 = 0; i12 < r10; i12++) {
                View q6 = q(i12);
                if (q6.getBottom() + ((ViewGroup.MarginLayoutParams) ((y0) q6.getLayoutParams())).bottomMargin <= i10) {
                    if (q6.getHeight() + q6.getTop() <= i10) {
                    }
                }
                d1(e1Var, 0, i12);
                return;
            }
            return;
        }
        int i13 = r10 - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View q9 = q(i14);
            if (q9.getBottom() + ((ViewGroup.MarginLayoutParams) ((y0) q9.getLayoutParams())).bottomMargin <= i10) {
                if (q9.getHeight() + q9.getTop() <= i10) {
                }
            }
            d1(e1Var, i13, i14);
            return;
        }
    }

    @Override // f2.x
    public final int[] q1(int i10, int i11, int[] iArr) {
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        iArr[0] = 0;
        for (int i12 = 1; i12 <= i10; i12++) {
            iArr[i12] = (int) Math.ceil((i12 / i10) * i11);
        }
        return iArr;
    }

    @Override // f2.x
    public final void w1(View view, int i10, boolean z10) {
        v vVar = (v) view.getLayoutParams();
        Rect rect = vVar.b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) vVar).topMargin + ((ViewGroup.MarginLayoutParams) vVar).bottomMargin;
        x1(x0.s(false, this.K[vVar.f], i10, rect.left + rect.right + ((ViewGroup.MarginLayoutParams) vVar).leftMargin + ((ViewGroup.MarginLayoutParams) vVar).rightMargin, ((ViewGroup.MarginLayoutParams) vVar).width), x0.s(true, this.q.k(), this.l, i11, ((ViewGroup.MarginLayoutParams) vVar).height), view, z10);
    }
}
