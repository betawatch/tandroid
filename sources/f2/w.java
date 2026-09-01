package f2;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class w extends j0 {
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public v O;
    public final Rect P;

    public w(int i10) {
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new t(0);
        this.P = new Rect();
        y1(i10);
    }

    @Override // f2.j0
    public final void A0(j1 j1Var, h0 h0Var, androidx.datastore.preferences.protobuf.i iVar) {
        int i10 = this.J;
        for (int i11 = 0; i11 < this.J && h0Var.b(j1Var) && i10 > 0; i11++) {
            int i12 = h0Var.d;
            iVar.a(i12, Math.max(0, h0Var.g));
            i10 -= this.O.i(i12);
            h0Var.d += h0Var.e;
        }
    }

    public final void A1() {
        int C;
        int F;
        if (this.o == 1) {
            C = this.m - E();
            F = D();
        } else {
            C = this.n - C();
            F = F();
        }
        int i10 = C - F;
        this.K = q1(this.J, i10, this.K);
    }

    @Override // f2.w0
    public int I(bf.f fVar, j1 j1Var) {
        if (this.o == 0) {
            return this.J;
        }
        if (j1Var.b() < 1) {
            return 0;
        }
        return t1(j1Var.b() - 1, fVar, j1Var) + 1;
    }

    @Override // f2.j0
    public final View Q0(bf.f fVar, j1 j1Var, int i10, int i11, int i12) {
        G0();
        int j10 = this.q.j();
        int f10 = this.q.f();
        int i13 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View q10 = q(i10);
            int H = w0.H(q10);
            if (H >= 0 && H < i12 && u1(H, fVar, j1Var) == 0) {
                if (((x0) q10.getLayoutParams()).a.j()) {
                    if (view2 == null) {
                        view2 = q10;
                    }
                } else {
                    if (this.q.d(q10) < f10 && this.q.a(q10) >= j10) {
                        return q10;
                    }
                    if (view == null) {
                        view = q10;
                    }
                }
            }
            i10 += i13;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e3, code lost:
    
        if (r13 == (r2 > r15)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010c, code lost:
    
        if (r13 == (r2 > r8)) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0022, code lost:
    
        if (((java.util.ArrayList) r22.a.d).contains(r3) != false) goto L5;
     */
    @Override // f2.j0, f2.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View R(View view, int i10, bf.f fVar, j1 j1Var) {
        View F;
        int r10;
        int i11;
        int i12;
        View view2;
        View view3;
        int i13;
        int i14;
        bf.f fVar2 = fVar;
        j1 j1Var2 = j1Var;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            F = recyclerView.F(view);
            if (F != null) {
            }
        }
        F = null;
        if (F != null) {
            u uVar = (u) F.getLayoutParams();
            int i15 = uVar.e;
            int i16 = uVar.f + i15;
            if (super.R(view, i10, fVar, j1Var) != null) {
                if ((F0(i10) == 1) != this.v) {
                    i11 = r() - 1;
                    r10 = -1;
                    i12 = -1;
                } else {
                    r10 = r();
                    i11 = 0;
                    i12 = 1;
                }
                boolean z4 = this.o == 1 && Y0();
                int t12 = t1(i11, fVar2, j1Var2);
                View view4 = null;
                int i17 = i11;
                int i18 = -1;
                int i19 = 0;
                int i20 = -1;
                View view5 = null;
                int i21 = 0;
                while (true) {
                    view2 = view5;
                    if (i17 == r10) {
                        break;
                    }
                    int t13 = t1(i17, fVar2, j1Var2);
                    View q10 = q(i17);
                    if (q10 == F) {
                        break;
                    }
                    if (!q10.hasFocusable() || t13 == t12) {
                        u uVar2 = (u) q10.getLayoutParams();
                        int i22 = uVar2.e;
                        view3 = F;
                        int i23 = uVar2.f + i22;
                        if (q10.hasFocusable() && i22 == i15 && i23 == i16) {
                            return q10;
                        }
                        if (!(q10.hasFocusable() && view4 == null) && (q10.hasFocusable() || view2 != null)) {
                            i13 = r10;
                            int min = Math.min(i23, i16) - Math.max(i22, i15);
                            if (q10.hasFocusable()) {
                                if (min <= i19) {
                                    if (min == i19) {
                                    }
                                    i14 = i19;
                                }
                                i14 = i19;
                            } else {
                                if (view4 == null) {
                                    i14 = i19;
                                    if (!(this.c.V(q10) && this.d.V(q10))) {
                                        if (min <= i21) {
                                            if (min == i21) {
                                            }
                                        }
                                    }
                                }
                                i14 = i19;
                            }
                        } else {
                            i14 = i19;
                            i13 = r10;
                        }
                        if (q10.hasFocusable()) {
                            int i24 = uVar2.e;
                            i19 = Math.min(i23, i16) - Math.max(i22, i15);
                            view4 = q10;
                            i20 = i24;
                            view5 = view2;
                        } else {
                            int i25 = uVar2.e;
                            view5 = q10;
                            i18 = i25;
                            i19 = i14;
                            i21 = Math.min(i23, i16) - Math.max(i22, i15);
                        }
                        i17 += i12;
                        fVar2 = fVar;
                        j1Var2 = j1Var;
                        F = view3;
                        r10 = i13;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = F;
                        i14 = i19;
                        i13 = r10;
                    }
                    view5 = view2;
                    i19 = i14;
                    i17 += i12;
                    fVar2 = fVar;
                    j1Var2 = j1Var;
                    F = view3;
                    r10 = i13;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    @Override // f2.w0
    public void U(bf.f fVar, j1 j1Var, View view, s0.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof u)) {
            T(view, dVar);
            return;
        }
        u uVar = (u) layoutParams;
        int t12 = t1(uVar.b(), fVar, j1Var);
        if (this.o == 0) {
            int i10 = uVar.e;
            int i11 = uVar.f;
            int i12 = this.J;
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, t12, 1, i12 > 1 && i11 == i12, false));
            return;
        }
        int i13 = uVar.e;
        int i14 = uVar.f;
        int i15 = this.J;
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(t12, 1, i13, i14, i15 > 1 && i14 == i15, false));
    }

    @Override // f2.w0
    public void V(RecyclerView recyclerView, int i10, int i11) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // f2.w0
    public void W(RecyclerView recyclerView) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // f2.w0
    public void X(RecyclerView recyclerView, int i10, int i11) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // f2.w0
    public void Y(RecyclerView recyclerView, int i10, int i11) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        r21.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        return;
     */
    @Override // f2.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Z0(bf.f fVar, j1 j1Var, h0 h0Var, g0 g0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int s6;
        int i17;
        View c3;
        int i18 = this.q.i();
        boolean z4 = i18 != 1073741824;
        int i19 = r() > 0 ? this.K[this.J] : 0;
        if (z4) {
            A1();
        }
        boolean z10 = h0Var.e == 1;
        int i20 = this.J;
        if (!z10) {
            i20 = u1(h0Var.d, fVar, j1Var) + v1(h0Var.d, fVar, j1Var);
        }
        int i21 = 0;
        while (i21 < this.J && h0Var.b(j1Var) && i20 > 0) {
            int i22 = h0Var.d;
            int v12 = v1(i22, fVar, j1Var);
            if (v12 > this.J) {
                throw new IllegalArgumentException(android.support.v4.media.a.m(this.J, " spans.", e2.c.m("Item at position ", i22, " requires ", v12, " spans but GridLayoutManager has only ")));
            }
            i20 -= v12;
            if (i20 < 0 || (c3 = h0Var.c(fVar)) == null) {
                break;
            }
            this.L[i21] = c3;
            i21++;
        }
        p1(i21, fVar, j1Var, z10);
        float f10 = 0.0f;
        int i23 = 0;
        for (int i24 = 0; i24 < i21; i24++) {
            View view = this.L[i24];
            if (h0Var.k == null) {
                if (z10) {
                    a(view, -1, false);
                } else {
                    a(view, 0, false);
                }
            } else if (z10) {
                a(view, -1, true);
            } else {
                a(view, 0, true);
            }
            c(view, this.P);
            w1(view, i18, false);
            int b10 = this.q.b(view);
            if (b10 > i23) {
                i23 = b10;
            }
            float c10 = (this.q.c(view) * 1.0f) / ((u) view.getLayoutParams()).f;
            if (c10 > f10) {
                f10 = c10;
            }
        }
        if (z4) {
            this.K = q1(this.J, Math.max(Math.round(f10 * this.J), i19), this.K);
            i23 = 0;
            for (int i25 = 0; i25 < i21; i25++) {
                View view2 = this.L[i25];
                w1(view2, TLObject.FLAG_30, true);
                int b11 = this.q.b(view2);
                if (b11 > i23) {
                    i23 = b11;
                }
            }
        }
        for (int i26 = 0; i26 < i21; i26++) {
            View view3 = this.L[i26];
            if (this.q.b(view3) != i23) {
                u uVar = (u) view3.getLayoutParams();
                Rect rect = uVar.b;
                int i27 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) uVar).topMargin + ((ViewGroup.MarginLayoutParams) uVar).bottomMargin;
                int i28 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) uVar).leftMargin + ((ViewGroup.MarginLayoutParams) uVar).rightMargin;
                int s12 = s1(uVar.e, uVar.f);
                if (this.o == 1) {
                    i17 = w0.s(false, s12, TLObject.FLAG_30, i28, ((ViewGroup.MarginLayoutParams) uVar).width);
                    s6 = View.MeasureSpec.makeMeasureSpec(i23 - i27, TLObject.FLAG_30);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i23 - i28, TLObject.FLAG_30);
                    s6 = w0.s(false, s12, TLObject.FLAG_30, i27, ((ViewGroup.MarginLayoutParams) uVar).height);
                    i17 = makeMeasureSpec;
                }
                x1(i17, s6, view3, true);
            }
        }
        g0Var.a = i23;
        if (this.o == 1) {
            if (h0Var.f == -1) {
                i15 = h0Var.b;
                i16 = i15 - i23;
            } else {
                i16 = h0Var.b;
                i15 = i16 + i23;
            }
            i13 = i16;
            i14 = 0;
            i12 = 0;
        } else {
            if (h0Var.f == -1) {
                i11 = h0Var.b;
                i10 = i11 - i23;
            } else {
                i10 = h0Var.b;
                i11 = i10 + i23;
            }
            i12 = i10;
            i13 = 0;
            i14 = i11;
            i15 = 0;
        }
        for (int i29 = 0; i29 < i21; i29++) {
            View view4 = this.L[i29];
            u uVar2 = (u) view4.getLayoutParams();
            if (this.o != 1) {
                int F = F() + this.K[uVar2.e];
                i13 = F;
                i15 = this.q.c(view4) + F;
            } else if (Y0()) {
                i14 = D() + this.K[this.J - uVar2.e];
                i12 = i14 - this.q.c(view4);
            } else {
                int D = D() + this.K[uVar2.e];
                i12 = D;
                i14 = this.q.c(view4) + D;
            }
            w0.O(view4, i12, i13, i14, i15);
            if (uVar2.a.j() || uVar2.a.m()) {
                g0Var.c = true;
            }
            g0Var.d = view4.hasFocusable() | g0Var.d;
        }
        Arrays.fill(this.L, (Object) null);
    }

    @Override // f2.w0
    public void a0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // f2.j0
    public final void a1(bf.f fVar, j1 j1Var, b4.v vVar, int i10) {
        A1();
        if (j1Var.b() > 0 && !j1Var.g) {
            boolean z4 = i10 == 1;
            int u12 = u1(vVar.b, fVar, j1Var);
            if (z4) {
                while (u12 > 0) {
                    int i11 = vVar.b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    vVar.b = i12;
                    u12 = u1(i12, fVar, j1Var);
                }
            } else {
                int b10 = j1Var.b() - 1;
                int i13 = vVar.b;
                while (i13 < b10) {
                    int i14 = i13 + 1;
                    int u13 = u1(i14, fVar, j1Var);
                    if (u13 <= u12) {
                        break;
                    }
                    i13 = i14;
                    u12 = u13;
                }
                vVar.b = i13;
            }
        }
        r1();
    }

    @Override // f2.j0, f2.w0
    public void b0(bf.f fVar, j1 j1Var) {
        boolean z4 = j1Var.g;
        SparseIntArray sparseIntArray = this.N;
        SparseIntArray sparseIntArray2 = this.M;
        if (z4) {
            int r10 = r();
            for (int i10 = 0; i10 < r10; i10++) {
                u uVar = (u) q(i10).getLayoutParams();
                int b10 = uVar.b();
                sparseIntArray2.put(b10, uVar.f);
                sparseIntArray.put(b10, uVar.e);
            }
        }
        super.b0(fVar, j1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // f2.j0, f2.w0
    public final void c0(j1 j1Var) {
        super.c0(j1Var);
        this.I = false;
    }

    @Override // f2.w0
    public final boolean f(x0 x0Var) {
        return x0Var instanceof u;
    }

    @Override // f2.j0, f2.w0
    public final int h(j1 j1Var) {
        return C0(j1Var);
    }

    @Override // f2.j0, f2.w0
    public final int i(j1 j1Var) {
        return D0(j1Var);
    }

    @Override // f2.j0, f2.w0
    public int k(j1 j1Var) {
        return C0(j1Var);
    }

    @Override // f2.j0, f2.w0
    public int l(j1 j1Var) {
        return D0(j1Var);
    }

    @Override // f2.j0
    public final void l1(boolean z4) {
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // f2.j0, f2.w0
    public final int m0(int i10, bf.f fVar, j1 j1Var) {
        A1();
        r1();
        return super.m0(i10, fVar, j1Var);
    }

    @Override // f2.j0, f2.w0
    public final x0 n() {
        return this.o == 0 ? new u(-2, -1) : new u(-1, -2);
    }

    @Override // f2.w0
    public final x0 o(Context context, AttributeSet attributeSet) {
        u uVar = new u(context, attributeSet);
        uVar.e = -1;
        uVar.f = 0;
        return uVar;
    }

    @Override // f2.j0, f2.w0
    public int o0(int i10, bf.f fVar, j1 j1Var) {
        A1();
        r1();
        return super.o0(i10, fVar, j1Var);
    }

    @Override // f2.w0
    public final x0 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            u uVar = new u((ViewGroup.MarginLayoutParams) layoutParams);
            uVar.e = -1;
            uVar.f = 0;
            return uVar;
        }
        u uVar2 = new u(layoutParams);
        uVar2.e = -1;
        uVar2.f = 0;
        return uVar2;
    }

    public final void p1(int i10, bf.f fVar, j1 j1Var, boolean z4) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z4) {
            i12 = i10;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.L[i11];
            u uVar = (u) view.getLayoutParams();
            int v12 = v1(((x0) view.getLayoutParams()).b(), fVar, j1Var);
            uVar.f = v12;
            uVar.e = i14;
            i14 += v12;
            i11 += i13;
        }
    }

    public int[] q1(int i10, int i11, int[] iArr) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    @Override // f2.w0
    public final void r0(Rect rect, int i10, int i11) {
        int g10;
        int g11;
        if (this.K == null) {
            super.r0(rect, i10, i11);
        }
        int E = E() + D();
        int C = C() + F();
        if (this.o == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = r0.j0.a;
            g11 = w0.g(i11, height, recyclerView.getMinimumHeight());
            int[] iArr = this.K;
            g10 = w0.g(i10, iArr[iArr.length - 1] + E, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = r0.j0.a;
            g10 = w0.g(i10, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.K;
            g11 = w0.g(i11, iArr2[iArr2.length - 1] + C, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(g10, g11);
    }

    public final void r1() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    public final int s1(int i10, int i11) {
        if (this.o != 1 || !Y0()) {
            int[] iArr = this.K;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.K;
        int i12 = this.J;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public final int t1(int i10, bf.f fVar, j1 j1Var) {
        if (!j1Var.g) {
            return this.O.g(i10, this.J);
        }
        int b10 = fVar.b(i10);
        if (b10 != -1) {
            return this.O.g(b10, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    @Override // f2.w0
    public int u(bf.f fVar, j1 j1Var) {
        if (this.o == 1) {
            return this.J;
        }
        if (j1Var.b() < 1) {
            return 0;
        }
        return t1(j1Var.b() - 1, fVar, j1Var) + 1;
    }

    public final int u1(int i10, bf.f fVar, j1 j1Var) {
        if (!j1Var.g) {
            return this.O.h(i10, this.J);
        }
        int i11 = this.N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int b10 = fVar.b(i10);
        if (b10 != -1) {
            return this.O.h(b10, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    public final int v1(int i10, bf.f fVar, j1 j1Var) {
        if (!j1Var.g) {
            return this.O.i(i10);
        }
        int i11 = this.M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int b10 = fVar.b(i10);
        if (b10 != -1) {
            return this.O.i(b10);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    public void w1(View view, int i10, boolean z4) {
        int i11;
        int i12;
        u uVar = (u) view.getLayoutParams();
        Rect rect = uVar.b;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) uVar).topMargin + ((ViewGroup.MarginLayoutParams) uVar).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) uVar).leftMargin + ((ViewGroup.MarginLayoutParams) uVar).rightMargin;
        int s12 = s1(uVar.e, uVar.f);
        if (this.o == 1) {
            i12 = w0.s(false, s12, i10, i14, ((ViewGroup.MarginLayoutParams) uVar).width);
            i11 = w0.s(true, this.q.k(), this.l, i13, ((ViewGroup.MarginLayoutParams) uVar).height);
        } else {
            int s6 = w0.s(false, s12, i10, i13, ((ViewGroup.MarginLayoutParams) uVar).height);
            int s9 = w0.s(true, this.q.k(), this.k, i14, ((ViewGroup.MarginLayoutParams) uVar).width);
            i11 = s6;
            i12 = s9;
        }
        x1(i12, i11, view, z4);
    }

    public final void x1(int i10, int i11, View view, boolean z4) {
        x0 x0Var = (x0) view.getLayoutParams();
        if (z4 ? (this.g && w0.N(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) x0Var).width) && w0.N(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) x0Var).height)) ? false : true : u0(view, i10, i11, x0Var)) {
            view.measure(i10, i11);
        }
    }

    @Override // f2.j0, f2.w0
    public boolean y0() {
        return this.B == null && !this.I;
    }

    public void y1(int i10) {
        if (i10 == this.J) {
            return;
        }
        this.I = true;
        if (i10 < 1) {
            throw new IllegalArgumentException(l.d.j(i10, "Span count should be at least 1. Provided "));
        }
        this.J = i10;
        this.O.j();
        l0();
    }

    public final void z1(v vVar) {
        this.O = vVar;
    }

    public w(int i10, boolean z4) {
        super(1, z4);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new t(0);
        this.P = new Rect();
        y1(i10);
    }
}
