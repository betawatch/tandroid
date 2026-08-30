package f2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class x extends w {
    public final ArrayList Q;
    public boolean R;

    public x(boolean z4) {
        super(MediaDataController.MAX_STYLE_RUNS_COUNT, z4);
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
    @Override // f2.w, f2.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z0(bf.f fVar, i1 i1Var, g0 g0Var, f0 f0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z4;
        int b10;
        float c3;
        View c10;
        bf.f fVar2 = fVar;
        i1 i1Var2 = i1Var;
        int i19 = this.q.i();
        int i20 = 0;
        boolean z10 = g0Var.e == 1;
        f0Var.a = 0;
        int i21 = g0Var.d;
        boolean z11 = this.v;
        Rect rect = this.P;
        ArrayList arrayList = this.Q;
        int i22 = -1;
        if (z11 && g0Var.f != -1 && B1(i21) && m(g0Var.d + 1) == null) {
            if (B1(g0Var.d + 1)) {
                g0Var.d += 3;
            } else {
                g0Var.d += 2;
            }
            int i23 = g0Var.d;
            for (int i24 = i23; i24 > i21; i24--) {
                View c11 = g0Var.c(fVar2);
                if (c11 != null) {
                    arrayList.add(c11);
                    if (i24 != i23) {
                        c(c11, rect);
                        w1(c11, i19, false);
                        int b11 = this.q.b(c11);
                        g0Var.b -= b11;
                        g0Var.c += b11;
                    }
                }
            }
            g0Var.d = i23;
        }
        boolean z12 = true;
        while (z12) {
            int i25 = this.J;
            boolean z13 = !arrayList.isEmpty();
            int i26 = 0;
            while (i26 < this.J && g0Var.b(i1Var2) && i25 > 0) {
                int i27 = g0Var.d;
                i25 -= v1(i27, fVar2, i1Var2);
                if (i25 < 0) {
                    break;
                }
                if (arrayList.isEmpty()) {
                    c10 = g0Var.c(fVar2);
                } else {
                    c10 = (View) arrayList.get(i20);
                    arrayList.remove(i20);
                    g0Var.d--;
                }
                if (c10 == null) {
                    break;
                }
                this.L[i26] = c10;
                i26++;
                if (g0Var.f == i22 && i25 <= 0 && B1(i27)) {
                    z13 = true;
                }
                i20 = 0;
            }
            p1(i26, fVar2, i1Var2, z10);
            float f10 = 0.0f;
            int i28 = 0;
            for (int i29 = 0; i29 < i26; i29++) {
                View view = this.L[i29];
                if (g0Var.k == null) {
                    if (z10) {
                        a(view, -1, false);
                    } else {
                        a(view, 0, false);
                    }
                } else if (z10) {
                    a(view, -1, true);
                } else {
                    z4 = false;
                    a(view, 0, true);
                    c(view, rect);
                    w1(view, i19, z4);
                    b10 = this.q.b(view);
                    if (b10 > i28) {
                        i28 = b10;
                    }
                    c3 = (this.q.c(view) * 1.0f) / ((u) view.getLayoutParams()).f;
                    if (c3 <= f10) {
                        f10 = c3;
                    }
                }
                z4 = false;
                c(view, rect);
                w1(view, i19, z4);
                b10 = this.q.b(view);
                if (b10 > i28) {
                }
                c3 = (this.q.c(view) * 1.0f) / ((u) view.getLayoutParams()).f;
                if (c3 <= f10) {
                }
            }
            int i30 = 0;
            while (i30 < i26) {
                View view2 = this.L[i30];
                if (this.q.b(view2) != i28) {
                    u uVar = (u) view2.getLayoutParams();
                    Rect rect2 = uVar.b;
                    i17 = i30;
                    i18 = i19;
                    x1(v0.s(false, this.K[uVar.f], TLObject.FLAG_30, rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) uVar).leftMargin + ((ViewGroup.MarginLayoutParams) uVar).rightMargin, ((ViewGroup.MarginLayoutParams) uVar).width), View.MeasureSpec.makeMeasureSpec(i28 - (((rect2.top + rect2.bottom) + ((ViewGroup.MarginLayoutParams) uVar).topMargin) + ((ViewGroup.MarginLayoutParams) uVar).bottomMargin), TLObject.FLAG_30), view2, true);
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
            if (C1 || g0Var.f != 1) {
                if (g0Var.f == -1) {
                    int i32 = g0Var.b - f0Var.a;
                    int i33 = i32 - i28;
                    i12 = i32;
                    i13 = this.m;
                    i11 = i33;
                } else {
                    int i34 = f0Var.a + g0Var.b;
                    i11 = i34;
                    i12 = i34 + i28;
                    i13 = 0;
                }
                int i35 = i13;
                int i36 = 0;
                while (i36 < i26) {
                    View view3 = this.L[i36];
                    u uVar2 = (u) view3.getLayoutParams();
                    int c12 = this.q.c(view3);
                    int i37 = i36;
                    boolean z14 = z10;
                    if (g0Var.f == -1) {
                        i35 -= c12;
                    }
                    int i38 = c12 + i35;
                    v0.O(view3, i35, i11, i38, i12);
                    if (g0Var.f == 1) {
                        i35 = i38;
                    }
                    if (uVar2.a.j() || uVar2.a.m()) {
                        f0Var.c = true;
                    }
                    f0Var.d |= view3.hasFocusable();
                    i36 = i37 + 1;
                    z10 = z14;
                }
                boolean z15 = z10;
                f0Var.a += i28;
                Arrays.fill(this.L, (Object) null);
                fVar2 = fVar;
                i1Var2 = i1Var;
                z12 = z13;
                i19 = i31;
                z10 = z15;
                i20 = 0;
                i22 = -1;
            }
            if (g0Var.f == i10) {
                int i39 = g0Var.b - f0Var.a;
                i16 = i39 - i28;
                i14 = i39;
                i15 = 0;
            } else {
                int i40 = f0Var.a + g0Var.b;
                i14 = i40 + i28;
                i15 = this.m;
                i16 = i40;
            }
            for (int i41 = i26 - 1; i41 >= 0; i41--) {
                View view4 = this.L[i41];
                u uVar3 = (u) view4.getLayoutParams();
                int c13 = this.q.c(view4);
                int i42 = i15;
                int i43 = g0Var.f == 1 ? i42 - c13 : i42;
                int i44 = c13 + i43;
                v0.O(view4, i43, i16, i44, i14);
                i15 = g0Var.f == -1 ? i44 : i43;
                if (uVar3.a.j() || uVar3.a.m()) {
                    f0Var.c = true;
                }
                f0Var.d |= view4.hasFocusable();
            }
            boolean z152 = z10;
            f0Var.a += i28;
            Arrays.fill(this.L, (Object) null);
            fVar2 = fVar;
            i1Var2 = i1Var;
            z12 = z13;
            i19 = i31;
            z10 = z152;
            i20 = 0;
            i22 = -1;
        }
    }

    @Override // f2.i0, f2.v0
    public final boolean e() {
        return this.R;
    }

    @Override // f2.i0
    public final void e1(bf.f fVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int r10 = r();
        if (!this.v) {
            for (int i12 = 0; i12 < r10; i12++) {
                View q10 = q(i12);
                if (q10.getBottom() + ((ViewGroup.MarginLayoutParams) ((w0) q10.getLayoutParams())).bottomMargin <= i10) {
                    if (q10.getHeight() + q10.getTop() <= i10) {
                    }
                }
                d1(fVar, 0, i12);
                return;
            }
            return;
        }
        int i13 = r10 - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View q11 = q(i14);
            if (q11.getBottom() + ((ViewGroup.MarginLayoutParams) ((w0) q11.getLayoutParams())).bottomMargin <= i10) {
                if (q11.getHeight() + q11.getTop() <= i10) {
                }
            }
            d1(fVar, i13, i14);
            return;
        }
    }

    @Override // f2.w
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

    @Override // f2.w
    public final void w1(View view, int i10, boolean z4) {
        u uVar = (u) view.getLayoutParams();
        Rect rect = uVar.b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) uVar).topMargin + ((ViewGroup.MarginLayoutParams) uVar).bottomMargin;
        x1(v0.s(false, this.K[uVar.f], i10, rect.left + rect.right + ((ViewGroup.MarginLayoutParams) uVar).leftMargin + ((ViewGroup.MarginLayoutParams) uVar).rightMargin, ((ViewGroup.MarginLayoutParams) uVar).width), v0.s(true, this.q.k(), this.l, i11, ((ViewGroup.MarginLayoutParams) uVar).height), view, z4);
    }
}
