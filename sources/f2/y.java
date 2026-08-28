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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class y extends m0 {
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public x O;
    public final Rect P;

    public y(int i9) {
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new v(0);
        this.P = new Rect();
        y1(i9);
    }

    @Override // f2.m0
    public final void A0(n1 n1Var, k0 k0Var, androidx.datastore.preferences.protobuf.i iVar) {
        int i9 = this.J;
        for (int i10 = 0; i10 < this.J && k0Var.b(n1Var) && i9 > 0; i10++) {
            int i11 = k0Var.d;
            iVar.a(i11, Math.max(0, k0Var.g));
            i9 -= this.O.i(i11);
            k0Var.d += k0Var.e;
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
        int i9 = C - F;
        this.K = q1(this.J, i9, this.K);
    }

    @Override // f2.z0
    public int I(g1 g1Var, n1 n1Var) {
        if (this.o == 0) {
            return this.J;
        }
        if (n1Var.b() < 1) {
            return 0;
        }
        return t1(n1Var.b() - 1, g1Var, n1Var) + 1;
    }

    @Override // f2.m0
    public final View Q0(g1 g1Var, n1 n1Var, int i9, int i10, int i11) {
        G0();
        int j10 = this.q.j();
        int f10 = this.q.f();
        int i12 = i10 > i9 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i9 != i10) {
            View q10 = q(i9);
            int H = z0.H(q10);
            if (H >= 0 && H < i11 && u1(H, g1Var, n1Var) == 0) {
                if (((a1) q10.getLayoutParams()).a.j()) {
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
            i9 += i12;
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
    @Override // f2.m0, f2.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View R(View view, int i9, g1 g1Var, n1 n1Var) {
        View F;
        int r10;
        int i10;
        int i11;
        View view2;
        View view3;
        int i12;
        int i13;
        g1 g1Var2 = g1Var;
        n1 n1Var2 = n1Var;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            F = recyclerView.F(view);
            if (F != null) {
            }
        }
        F = null;
        if (F != null) {
            w wVar = (w) F.getLayoutParams();
            int i14 = wVar.e;
            int i15 = wVar.f + i14;
            if (super.R(view, i9, g1Var, n1Var) != null) {
                if ((F0(i9) == 1) != this.v) {
                    i10 = r() - 1;
                    r10 = -1;
                    i11 = -1;
                } else {
                    r10 = r();
                    i10 = 0;
                    i11 = 1;
                }
                boolean z10 = this.o == 1 && Y0();
                int t12 = t1(i10, g1Var2, n1Var2);
                View view4 = null;
                int i16 = i10;
                int i17 = -1;
                int i18 = 0;
                int i19 = -1;
                View view5 = null;
                int i20 = 0;
                while (true) {
                    view2 = view5;
                    if (i16 == r10) {
                        break;
                    }
                    int t13 = t1(i16, g1Var2, n1Var2);
                    View q10 = q(i16);
                    if (q10 == F) {
                        break;
                    }
                    if (!q10.hasFocusable() || t13 == t12) {
                        w wVar2 = (w) q10.getLayoutParams();
                        int i21 = wVar2.e;
                        view3 = F;
                        int i22 = wVar2.f + i21;
                        if (q10.hasFocusable() && i21 == i14 && i22 == i15) {
                            return q10;
                        }
                        if (!(q10.hasFocusable() && view4 == null) && (q10.hasFocusable() || view2 != null)) {
                            i12 = r10;
                            int min = Math.min(i22, i15) - Math.max(i21, i14);
                            if (q10.hasFocusable()) {
                                if (min <= i18) {
                                    if (min == i18) {
                                    }
                                    i13 = i18;
                                }
                                i13 = i18;
                            } else {
                                if (view4 == null) {
                                    i13 = i18;
                                    if (!(this.c.G(q10) && this.d.G(q10))) {
                                        if (min <= i20) {
                                            if (min == i20) {
                                            }
                                        }
                                    }
                                }
                                i13 = i18;
                            }
                        } else {
                            i13 = i18;
                            i12 = r10;
                        }
                        if (q10.hasFocusable()) {
                            int i23 = wVar2.e;
                            i18 = Math.min(i22, i15) - Math.max(i21, i14);
                            view4 = q10;
                            i19 = i23;
                            view5 = view2;
                        } else {
                            int i24 = wVar2.e;
                            view5 = q10;
                            i17 = i24;
                            i18 = i13;
                            i20 = Math.min(i22, i15) - Math.max(i21, i14);
                        }
                        i16 += i11;
                        g1Var2 = g1Var;
                        n1Var2 = n1Var;
                        F = view3;
                        r10 = i12;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = F;
                        i13 = i18;
                        i12 = r10;
                    }
                    view5 = view2;
                    i18 = i13;
                    i16 += i11;
                    g1Var2 = g1Var;
                    n1Var2 = n1Var;
                    F = view3;
                    r10 = i12;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    @Override // f2.z0
    public void U(g1 g1Var, n1 n1Var, View view, s0.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof w)) {
            T(view, dVar);
            return;
        }
        w wVar = (w) layoutParams;
        int t12 = t1(wVar.b(), g1Var, n1Var);
        if (this.o == 0) {
            int i9 = wVar.e;
            int i10 = wVar.f;
            int i11 = this.J;
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i9, i10, t12, 1, i11 > 1 && i10 == i11, false));
            return;
        }
        int i12 = wVar.e;
        int i13 = wVar.f;
        int i14 = this.J;
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(t12, 1, i12, i13, i14 > 1 && i13 == i14, false));
    }

    @Override // f2.z0
    public void V(RecyclerView recyclerView, int i9, int i10) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // f2.z0
    public void W(RecyclerView recyclerView) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // f2.z0
    public void X(RecyclerView recyclerView, int i9, int i10) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // f2.z0
    public void Y(RecyclerView recyclerView, int i9, int i10) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        r21.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        return;
     */
    @Override // f2.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Z0(g1 g1Var, n1 n1Var, k0 k0Var, j0 j0Var) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int s10;
        int i16;
        View c10;
        int i17 = this.q.i();
        boolean z10 = i17 != 1073741824;
        int i18 = r() > 0 ? this.K[this.J] : 0;
        if (z10) {
            A1();
        }
        boolean z11 = k0Var.e == 1;
        int i19 = this.J;
        if (!z11) {
            i19 = u1(k0Var.d, g1Var, n1Var) + v1(k0Var.d, g1Var, n1Var);
        }
        int i20 = 0;
        while (i20 < this.J && k0Var.b(n1Var) && i19 > 0) {
            int i21 = k0Var.d;
            int v12 = v1(i21, g1Var, n1Var);
            if (v12 > this.J) {
                throw new IllegalArgumentException(aa.d.l(this.J, " spans.", e2.c.o("Item at position ", i21, " requires ", v12, " spans but GridLayoutManager has only ")));
            }
            i19 -= v12;
            if (i19 < 0 || (c10 = k0Var.c(g1Var)) == null) {
                break;
            }
            this.L[i20] = c10;
            i20++;
        }
        p1(i20, g1Var, n1Var, z11);
        float f10 = 0.0f;
        int i22 = 0;
        for (int i23 = 0; i23 < i20; i23++) {
            View view = this.L[i23];
            if (k0Var.k == null) {
                if (z11) {
                    a(view, -1, false);
                } else {
                    a(view, 0, false);
                }
            } else if (z11) {
                a(view, -1, true);
            } else {
                a(view, 0, true);
            }
            c(view, this.P);
            w1(view, i17, false);
            int b10 = this.q.b(view);
            if (b10 > i22) {
                i22 = b10;
            }
            float c11 = (this.q.c(view) * 1.0f) / ((w) view.getLayoutParams()).f;
            if (c11 > f10) {
                f10 = c11;
            }
        }
        if (z10) {
            this.K = q1(this.J, Math.max(Math.round(f10 * this.J), i18), this.K);
            i22 = 0;
            for (int i24 = 0; i24 < i20; i24++) {
                View view2 = this.L[i24];
                w1(view2, TLObject.FLAG_30, true);
                int b11 = this.q.b(view2);
                if (b11 > i22) {
                    i22 = b11;
                }
            }
        }
        for (int i25 = 0; i25 < i20; i25++) {
            View view3 = this.L[i25];
            if (this.q.b(view3) != i22) {
                w wVar = (w) view3.getLayoutParams();
                Rect rect = wVar.b;
                int i26 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) wVar).topMargin + ((ViewGroup.MarginLayoutParams) wVar).bottomMargin;
                int i27 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) wVar).leftMargin + ((ViewGroup.MarginLayoutParams) wVar).rightMargin;
                int s12 = s1(wVar.e, wVar.f);
                if (this.o == 1) {
                    i16 = z0.s(false, s12, TLObject.FLAG_30, i27, ((ViewGroup.MarginLayoutParams) wVar).width);
                    s10 = View.MeasureSpec.makeMeasureSpec(i22 - i26, TLObject.FLAG_30);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i22 - i27, TLObject.FLAG_30);
                    s10 = z0.s(false, s12, TLObject.FLAG_30, i26, ((ViewGroup.MarginLayoutParams) wVar).height);
                    i16 = makeMeasureSpec;
                }
                x1(i16, s10, view3, true);
            }
        }
        j0Var.a = i22;
        if (this.o == 1) {
            if (k0Var.f == -1) {
                i14 = k0Var.b;
                i15 = i14 - i22;
            } else {
                i15 = k0Var.b;
                i14 = i15 + i22;
            }
            i12 = i15;
            i13 = 0;
            i11 = 0;
        } else {
            if (k0Var.f == -1) {
                i10 = k0Var.b;
                i9 = i10 - i22;
            } else {
                i9 = k0Var.b;
                i10 = i9 + i22;
            }
            i11 = i9;
            i12 = 0;
            i13 = i10;
            i14 = 0;
        }
        for (int i28 = 0; i28 < i20; i28++) {
            View view4 = this.L[i28];
            w wVar2 = (w) view4.getLayoutParams();
            if (this.o != 1) {
                int F = F() + this.K[wVar2.e];
                i12 = F;
                i14 = this.q.c(view4) + F;
            } else if (Y0()) {
                i13 = D() + this.K[this.J - wVar2.e];
                i11 = i13 - this.q.c(view4);
            } else {
                int D = D() + this.K[wVar2.e];
                i11 = D;
                i13 = this.q.c(view4) + D;
            }
            z0.O(view4, i11, i12, i13, i14);
            if (wVar2.a.j() || wVar2.a.m()) {
                j0Var.c = true;
            }
            j0Var.d = view4.hasFocusable() | j0Var.d;
        }
        Arrays.fill(this.L, (Object) null);
    }

    @Override // f2.z0
    public void a0(RecyclerView recyclerView, int i9, int i10, Object obj) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // f2.m0
    public final void a1(g1 g1Var, n1 n1Var, i0 i0Var, int i9) {
        A1();
        if (n1Var.b() > 0 && !n1Var.g) {
            boolean z10 = i9 == 1;
            int u12 = u1(i0Var.b, g1Var, n1Var);
            if (z10) {
                while (u12 > 0) {
                    int i10 = i0Var.b;
                    if (i10 <= 0) {
                        break;
                    }
                    int i11 = i10 - 1;
                    i0Var.b = i11;
                    u12 = u1(i11, g1Var, n1Var);
                }
            } else {
                int b10 = n1Var.b() - 1;
                int i12 = i0Var.b;
                while (i12 < b10) {
                    int i13 = i12 + 1;
                    int u13 = u1(i13, g1Var, n1Var);
                    if (u13 <= u12) {
                        break;
                    }
                    i12 = i13;
                    u12 = u13;
                }
                i0Var.b = i12;
            }
        }
        r1();
    }

    @Override // f2.m0, f2.z0
    public void b0(g1 g1Var, n1 n1Var) {
        boolean z10 = n1Var.g;
        SparseIntArray sparseIntArray = this.N;
        SparseIntArray sparseIntArray2 = this.M;
        if (z10) {
            int r10 = r();
            for (int i9 = 0; i9 < r10; i9++) {
                w wVar = (w) q(i9).getLayoutParams();
                int b10 = wVar.b();
                sparseIntArray2.put(b10, wVar.f);
                sparseIntArray.put(b10, wVar.e);
            }
        }
        super.b0(g1Var, n1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // f2.m0, f2.z0
    public final void c0(n1 n1Var) {
        super.c0(n1Var);
        this.I = false;
    }

    @Override // f2.z0
    public final boolean f(a1 a1Var) {
        return a1Var instanceof w;
    }

    @Override // f2.m0, f2.z0
    public final int h(n1 n1Var) {
        return C0(n1Var);
    }

    @Override // f2.m0, f2.z0
    public final int i(n1 n1Var) {
        return D0(n1Var);
    }

    @Override // f2.m0, f2.z0
    public int k(n1 n1Var) {
        return C0(n1Var);
    }

    @Override // f2.m0, f2.z0
    public int l(n1 n1Var) {
        return D0(n1Var);
    }

    @Override // f2.m0
    public final void l1(boolean z10) {
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // f2.m0, f2.z0
    public final int m0(int i9, g1 g1Var, n1 n1Var) {
        A1();
        r1();
        return super.m0(i9, g1Var, n1Var);
    }

    @Override // f2.m0, f2.z0
    public final a1 n() {
        return this.o == 0 ? new w(-2, -1) : new w(-1, -2);
    }

    @Override // f2.z0
    public final a1 o(Context context, AttributeSet attributeSet) {
        w wVar = new w(context, attributeSet);
        wVar.e = -1;
        wVar.f = 0;
        return wVar;
    }

    @Override // f2.m0, f2.z0
    public int o0(int i9, g1 g1Var, n1 n1Var) {
        A1();
        r1();
        return super.o0(i9, g1Var, n1Var);
    }

    @Override // f2.z0
    public final a1 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            w wVar = new w((ViewGroup.MarginLayoutParams) layoutParams);
            wVar.e = -1;
            wVar.f = 0;
            return wVar;
        }
        w wVar2 = new w(layoutParams);
        wVar2.e = -1;
        wVar2.f = 0;
        return wVar2;
    }

    public final void p1(int i9, g1 g1Var, n1 n1Var, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (z10) {
            i11 = i9;
            i10 = 0;
            i12 = 1;
        } else {
            i10 = i9 - 1;
            i11 = -1;
            i12 = -1;
        }
        while (i10 != i11) {
            View view = this.L[i10];
            w wVar = (w) view.getLayoutParams();
            int v12 = v1(((a1) view.getLayoutParams()).b(), g1Var, n1Var);
            wVar.f = v12;
            wVar.e = i13;
            i13 += v12;
            i10 += i12;
        }
    }

    public int[] q1(int i9, int i10, int[] iArr) {
        int i11;
        if (iArr == null || iArr.length != i9 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i9 + 1];
        }
        int i12 = 0;
        iArr[0] = 0;
        int i13 = i10 / i9;
        int i14 = i10 % i9;
        int i15 = 0;
        for (int i16 = 1; i16 <= i9; i16++) {
            i12 += i14;
            if (i12 <= 0 || i9 - i12 >= i14) {
                i11 = i13;
            } else {
                i11 = i13 + 1;
                i12 -= i9;
            }
            i15 += i11;
            iArr[i16] = i15;
        }
        return iArr;
    }

    @Override // f2.z0
    public final void r0(Rect rect, int i9, int i10) {
        int g10;
        int g11;
        if (this.K == null) {
            super.r0(rect, i9, i10);
        }
        int E = E() + D();
        int C = C() + F();
        if (this.o == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = r0.j0.a;
            g11 = z0.g(i10, height, recyclerView.getMinimumHeight());
            int[] iArr = this.K;
            g10 = z0.g(i9, iArr[iArr.length - 1] + E, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = r0.j0.a;
            g10 = z0.g(i9, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.K;
            g11 = z0.g(i10, iArr2[iArr2.length - 1] + C, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(g10, g11);
    }

    public final void r1() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    public final int s1(int i9, int i10) {
        if (this.o != 1 || !Y0()) {
            int[] iArr = this.K;
            return iArr[i10 + i9] - iArr[i9];
        }
        int[] iArr2 = this.K;
        int i11 = this.J;
        return iArr2[i11 - i9] - iArr2[(i11 - i9) - i10];
    }

    public final int t1(int i9, g1 g1Var, n1 n1Var) {
        if (!n1Var.g) {
            return this.O.g(i9, this.J);
        }
        int b10 = g1Var.b(i9);
        if (b10 != -1) {
            return this.O.g(b10, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i9);
        return 0;
    }

    @Override // f2.z0
    public int u(g1 g1Var, n1 n1Var) {
        if (this.o == 1) {
            return this.J;
        }
        if (n1Var.b() < 1) {
            return 0;
        }
        return t1(n1Var.b() - 1, g1Var, n1Var) + 1;
    }

    public final int u1(int i9, g1 g1Var, n1 n1Var) {
        if (!n1Var.g) {
            return this.O.h(i9, this.J);
        }
        int i10 = this.N.get(i9, -1);
        if (i10 != -1) {
            return i10;
        }
        int b10 = g1Var.b(i9);
        if (b10 != -1) {
            return this.O.h(b10, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i9);
        return 0;
    }

    public final int v1(int i9, g1 g1Var, n1 n1Var) {
        if (!n1Var.g) {
            return this.O.i(i9);
        }
        int i10 = this.M.get(i9, -1);
        if (i10 != -1) {
            return i10;
        }
        int b10 = g1Var.b(i9);
        if (b10 != -1) {
            return this.O.i(b10);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i9);
        return 1;
    }

    public void w1(View view, int i9, boolean z10) {
        int i10;
        int i11;
        w wVar = (w) view.getLayoutParams();
        Rect rect = wVar.b;
        int i12 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) wVar).topMargin + ((ViewGroup.MarginLayoutParams) wVar).bottomMargin;
        int i13 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) wVar).leftMargin + ((ViewGroup.MarginLayoutParams) wVar).rightMargin;
        int s12 = s1(wVar.e, wVar.f);
        if (this.o == 1) {
            i11 = z0.s(false, s12, i9, i13, ((ViewGroup.MarginLayoutParams) wVar).width);
            i10 = z0.s(true, this.q.k(), this.l, i12, ((ViewGroup.MarginLayoutParams) wVar).height);
        } else {
            int s10 = z0.s(false, s12, i9, i12, ((ViewGroup.MarginLayoutParams) wVar).height);
            int s11 = z0.s(true, this.q.k(), this.k, i13, ((ViewGroup.MarginLayoutParams) wVar).width);
            i10 = s10;
            i11 = s11;
        }
        x1(i11, i10, view, z10);
    }

    public final void x1(int i9, int i10, View view, boolean z10) {
        a1 a1Var = (a1) view.getLayoutParams();
        if (z10 ? (this.g && z0.N(view.getMeasuredWidth(), i9, ((ViewGroup.MarginLayoutParams) a1Var).width) && z0.N(view.getMeasuredHeight(), i10, ((ViewGroup.MarginLayoutParams) a1Var).height)) ? false : true : u0(view, i9, i10, a1Var)) {
            view.measure(i9, i10);
        }
    }

    @Override // f2.m0, f2.z0
    public boolean y0() {
        return this.B == null && !this.I;
    }

    public void y1(int i9) {
        if (i9 == this.J) {
            return;
        }
        this.I = true;
        if (i9 < 1) {
            throw new IllegalArgumentException(j3.r0.l(i9, "Span count should be at least 1. Provided "));
        }
        this.J = i9;
        this.O.j();
        l0();
    }

    public final void z1(x xVar) {
        this.O = xVar;
    }

    public y(int i9, boolean z10) {
        super(1, z10);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new v(0);
        this.P = new Rect();
        y1(i9);
    }
}
