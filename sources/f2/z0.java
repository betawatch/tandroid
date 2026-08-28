package f2;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class z0 {
    public a5.m a;
    public RecyclerView b;
    public final we.b c;
    public final we.b d;
    public m1 e;
    public boolean f;
    public final boolean g;
    public final boolean h;
    public int i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;

    public z0() {
        fa.c cVar = new fa.c(this, 15);
        k5.i iVar = new k5.i(this, 13);
        this.c = new we.b(cVar);
        this.d = new we.b(iVar);
        this.f = false;
        this.g = true;
        this.h = true;
    }

    public static int H(View view) {
        return ((a1) view.getLayoutParams()).b();
    }

    public static boolean N(int i9, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (i11 > 0 && i9 != i11) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i9;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i9;
        }
        return true;
    }

    public static void O(View view, int i9, int i10, int i11, int i12) {
        a1 a1Var = (a1) view.getLayoutParams();
        Rect rect = a1Var.b;
        view.layout(i9 + rect.left + ((ViewGroup.MarginLayoutParams) a1Var).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) a1Var).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) a1Var).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin);
    }

    public static int g(int i9, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i10, i11) : size : Math.min(size, Math.max(i10, i11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int s(boolean z10, int i9, int i10, int i11, int i12) {
        int max = Math.max(0, i9 - i11);
        if (z10) {
            if (i12 < 0) {
                if (i12 == -1) {
                    if (i10 != Integer.MIN_VALUE) {
                        if (i10 != 0) {
                        }
                    }
                    i12 = max;
                }
                i10 = 0;
                i12 = 0;
            }
            i10 = TLObject.FLAG_30;
        } else {
            if (i12 < 0) {
                if (i12 != -1) {
                    if (i12 == -2) {
                        if (i10 == Integer.MIN_VALUE || i10 == 1073741824) {
                            i12 = max;
                            i10 = TLObject.FLAG_31;
                        } else {
                            i12 = max;
                            i10 = 0;
                        }
                    }
                    i10 = 0;
                    i12 = 0;
                }
                i12 = max;
            }
            i10 = TLObject.FLAG_30;
        }
        return View.MeasureSpec.makeMeasureSpec(i12, i10);
    }

    public static int v(View view) {
        return view.getBottom() + ((a1) view.getLayoutParams()).b.bottom;
    }

    public static void w(View view, Rect rect) {
        int[] iArr = RecyclerView.L0;
        a1 a1Var = (a1) view.getLayoutParams();
        Rect rect2 = a1Var.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) a1Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) a1Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) a1Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin);
    }

    public static int x(View view) {
        return view.getLeft() - ((a1) view.getLayoutParams()).b.left;
    }

    public static void x0(View view) {
        q1 U = RecyclerView.U(view);
        U.l &= -129;
        U.o();
        U.a(4);
    }

    public static int y(View view) {
        return view.getRight() + ((a1) view.getLayoutParams()).b.right;
    }

    public static int z(View view) {
        return view.getTop() - ((a1) view.getLayoutParams()).b.top;
    }

    public int A() {
        return B();
    }

    public final int B() {
        RecyclerView recyclerView = this.b;
        r0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.h();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int G() {
        return F();
    }

    public int I(g1 g1Var, n1 n1Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.w == null || !e()) {
            return 1;
        }
        return this.b.w.h();
    }

    public int J() {
        return F();
    }

    public int K() {
        return (this.n - F()) - C();
    }

    public final void L(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((a1) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.v;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void M(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.b;
        if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
            throw new IllegalArgumentException("View should be fully attached to be ignored" + this.b.C());
        }
        q1 U = RecyclerView.U(view);
        U.a(128);
        this.b.f.L(U);
    }

    public void P(View view) {
        a1 a1Var = (a1) view.getLayoutParams();
        Rect W = this.b.W(view);
        int i9 = W.left + W.right;
        int i10 = W.top + W.bottom;
        int s10 = s(d(), this.m, this.k, E() + D() + ((ViewGroup.MarginLayoutParams) a1Var).leftMargin + ((ViewGroup.MarginLayoutParams) a1Var).rightMargin + i9, ((ViewGroup.MarginLayoutParams) a1Var).width);
        int s11 = s(e(), this.n, this.l, C() + F() + ((ViewGroup.MarginLayoutParams) a1Var).topMargin + ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin + i10, ((ViewGroup.MarginLayoutParams) a1Var).height);
        if (u0(view, s10, s11, a1Var)) {
            view.measure(s10, s11);
        }
    }

    public abstract View R(View view, int i9, g1 g1Var, n1 n1Var);

    public void S(g1 g1Var, n1 n1Var, s0.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            dVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            dVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(g1Var, n1Var), u(g1Var, n1Var), false, 0));
    }

    public final void T(View view, s0.d dVar) {
        q1 U = RecyclerView.U(view);
        if (U == null || U.j()) {
            return;
        }
        a5.m mVar = this.a;
        if (((ArrayList) mVar.d).contains(U.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        U(recyclerView.b, recyclerView.p0, view, dVar);
    }

    public void U(g1 g1Var, n1 n1Var, View view, s0.d dVar) {
        dVar.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(e() ? H(view) : 0, 1, d() ? H(view) : 0, 1, false, false));
    }

    public final void a(View view, int i9, boolean z10) {
        q1 U = RecyclerView.U(view);
        if (z10 || U.j()) {
            a0.f fVar = (a0.f) this.b.f.b;
            w1 w1Var = (w1) fVar.get(U);
            if (w1Var == null) {
                w1Var = w1.a();
                fVar.put(U, w1Var);
            }
            w1Var.a |= 1;
        } else {
            this.b.f.K(U);
        }
        a1 a1Var = (a1) view.getLayoutParams();
        if (U.s() || U.k()) {
            if (U.k()) {
                U.p.k(U);
            } else {
                U.l &= -33;
            }
            this.a.c(view, i9, view.getLayoutParams(), false);
        } else if (view.getParent() == this.b) {
            a5.m mVar = this.a;
            d dVar = (d) mVar.c;
            int indexOfChild = ((RecyclerView) ((k5.i) mVar.b).b).indexOfChild(view);
            int E = (indexOfChild == -1 || dVar.H(indexOfChild)) ? -1 : indexOfChild - dVar.E(indexOfChild);
            if (i9 == -1) {
                i9 = this.a.q();
            }
            if (E == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.C());
            }
            if (E != i9) {
                z0 z0Var = this.b.x;
                View q10 = z0Var.q(E);
                if (q10 == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + E + z0Var.b.toString());
                }
                z0Var.q(E);
                z0Var.a.j(E);
                a1 a1Var2 = (a1) q10.getLayoutParams();
                q1 U2 = RecyclerView.U(q10);
                if (U2.j()) {
                    a0.f fVar2 = (a0.f) z0Var.b.f.b;
                    w1 w1Var2 = (w1) fVar2.get(U2);
                    if (w1Var2 == null) {
                        w1Var2 = w1.a();
                        fVar2.put(U2, w1Var2);
                    }
                    w1Var2.a = 1 | w1Var2.a;
                } else {
                    z0Var.b.f.K(U2);
                }
                z0Var.a.c(q10, i9, a1Var2, U2.j());
            }
        } else {
            this.a.a(view, i9, false);
            a1Var.c = true;
            m1 m1Var = this.e;
            if (m1Var != null && m1Var.e) {
                m1Var.b.getClass();
                if (RecyclerView.S(view) == m1Var.a) {
                    m1Var.f = view;
                }
            }
        }
        if (a1Var.d) {
            U.a.invalidate();
            a1Var.d = false;
        }
    }

    public void a0(RecyclerView recyclerView, int i9, int i10, Object obj) {
        Z();
    }

    public abstract void b(String str);

    public abstract void b0(g1 g1Var, n1 n1Var);

    public final void c(View view, Rect rect) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.W(view));
        }
    }

    public abstract void c0(n1 n1Var);

    public abstract boolean d();

    public void d0(g1 g1Var, n1 n1Var, int i9, int i10) {
        this.b.q(i9, i10);
    }

    public abstract boolean e();

    public abstract l0 e0();

    public boolean f(a1 a1Var) {
        return a1Var != null;
    }

    public final void g0(g1 g1Var) {
        for (int r10 = r() - 1; r10 >= 0; r10--) {
            if (!RecyclerView.U(q(r10)).r()) {
                i0(r10, g1Var);
            }
        }
    }

    public abstract int h(n1 n1Var);

    public final void h0(g1 g1Var) {
        ArrayList arrayList = (ArrayList) g1Var.c;
        ArrayList arrayList2 = (ArrayList) g1Var.c;
        int size = arrayList.size();
        for (int i9 = size - 1; i9 >= 0; i9--) {
            View view = ((q1) arrayList2.get(i9)).a;
            q1 U = RecyclerView.U(view);
            if (!U.r()) {
                U.q(false);
                if (U.l()) {
                    this.b.removeDetachedView(view, false);
                }
                w0 w0Var = this.b.V;
                if (w0Var != null) {
                    w0Var.f(U);
                }
                U.q(true);
                q1 U2 = RecyclerView.U(view);
                U2.p = null;
                U2.q = false;
                U2.l &= -33;
                g1Var.h(U2);
            }
        }
        arrayList2.clear();
        ArrayList arrayList3 = (ArrayList) g1Var.d;
        if (arrayList3 != null) {
            arrayList3.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int i(n1 n1Var);

    public final void i0(int i9, g1 g1Var) {
        View q10 = q(i9);
        if (RecyclerView.U(q10).r()) {
            return;
        }
        j0(i9);
        g1Var.g(q10);
    }

    public abstract int j(n1 n1Var);

    public final void j0(int i9) {
        if (q(i9) != null) {
            a5.m mVar = this.a;
            int t10 = mVar.t(i9);
            k5.i iVar = (k5.i) mVar.b;
            View childAt = ((RecyclerView) iVar.b).getChildAt(t10);
            if (childAt == null) {
                return;
            }
            if (((d) mVar.c).K(t10)) {
                mVar.B(childAt);
            }
            iVar.O(t10);
        }
    }

    public abstract int k(n1 n1Var);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if ((r6.bottom - r9) > r3) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int[] t10 = t(view, rect);
        int i9 = t10[0];
        int i10 = t10[1];
        if (z11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int D = D();
                int F = F();
                int E = this.m - E();
                int C = this.n - C();
                Rect rect2 = this.b.r;
                w(focusedChild, rect2);
                if (rect2.left - i9 < E) {
                    if (rect2.right - i9 > D) {
                        if (rect2.top - i10 < C) {
                        }
                    }
                }
            }
            return false;
        }
        if (i9 != 0 || i10 != 0) {
            if (z10) {
                recyclerView.scrollBy(i9, i10);
                return true;
            }
            recyclerView.v0(i9, i10, null);
            return true;
        }
        return false;
    }

    public abstract int l(n1 n1Var);

    public final void l0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract View m(int i9);

    public abstract int m0(int i9, g1 g1Var, n1 n1Var);

    public abstract a1 n();

    public abstract void n0(int i9);

    public a1 o(Context context, AttributeSet attributeSet) {
        return new a1(context, attributeSet);
    }

    public abstract int o0(int i9, g1 g1Var, n1 n1Var);

    public a1 p(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a1 ? new a1((a1) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a1((ViewGroup.MarginLayoutParams) layoutParams) : new a1(layoutParams);
    }

    public final void p0(RecyclerView recyclerView) {
        q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), TLObject.FLAG_30));
    }

    public final View q(int i9) {
        a5.m mVar = this.a;
        if (mVar != null) {
            return mVar.p(i9);
        }
        return null;
    }

    public final void q0(int i9, int i10) {
        this.m = View.MeasureSpec.getSize(i9);
        int mode = View.MeasureSpec.getMode(i9);
        this.k = mode;
        if (mode == 0 && !RecyclerView.M0) {
            this.m = 0;
        }
        this.n = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        this.l = mode2;
        if (mode2 != 0 || RecyclerView.M0) {
            return;
        }
        this.n = 0;
    }

    public final int r() {
        a5.m mVar = this.a;
        if (mVar != null) {
            return mVar.q();
        }
        return 0;
    }

    public void r0(Rect rect, int i9, int i10) {
        int E = E() + D() + rect.width();
        int C = C() + F() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = r0.j0.a;
        this.b.setMeasuredDimension(g(i9, E, recyclerView.getMinimumWidth()), g(i10, C, this.b.getMinimumHeight()));
    }

    public final void s0(int i9, int i10) {
        int r10 = r();
        if (r10 == 0) {
            this.b.q(i9, i10);
            return;
        }
        int i11 = TLObject.FLAG_31;
        int i12 = TLObject.FLAG_31;
        int i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i15 = 0; i15 < r10; i15++) {
            View q10 = q(i15);
            Rect rect = this.b.r;
            w(q10, rect);
            int i16 = rect.left;
            if (i16 < i13) {
                i13 = i16;
            }
            int i17 = rect.right;
            if (i17 > i11) {
                i11 = i17;
            }
            int i18 = rect.top;
            if (i18 < i14) {
                i14 = i18;
            }
            int i19 = rect.bottom;
            if (i19 > i12) {
                i12 = i19;
            }
        }
        this.b.r.set(i13, i14, i11, i12);
        r0(this.b.r, i9, i10);
    }

    public int[] t(View view, Rect rect) {
        int D = D();
        int F = F();
        int E = this.m - E();
        int C = this.n - C();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i9 = left - D;
        int min = Math.min(0, i9);
        int i10 = top - F;
        int min2 = Math.min(0, i10);
        int i11 = width - E;
        int max = Math.max(0, i11);
        int max2 = Math.max(0, height - C);
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = r0.j0.a;
        if (recyclerView.getLayoutDirection() != 1) {
            if (min == 0) {
                min = Math.min(i9, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i11);
        }
        if (min2 == 0) {
            min2 = Math.min(i10, max2);
        }
        return new int[]{max, min2};
    }

    public final void t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.m = 0;
            this.n = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.e;
            this.m = recyclerView.getWidth();
            this.n = recyclerView.getHeight();
        }
        this.k = TLObject.FLAG_30;
        this.l = TLObject.FLAG_30;
    }

    public int u(g1 g1Var, n1 n1Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.w == null || !d()) {
            return 1;
        }
        return this.b.w.h();
    }

    public final boolean u0(View view, int i9, int i10, a1 a1Var) {
        return (!view.isLayoutRequested() && this.g && N(view.getWidth(), i9, ((ViewGroup.MarginLayoutParams) a1Var).width) && N(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) a1Var).height)) ? false : true;
    }

    public abstract void v0(RecyclerView recyclerView, n1 n1Var, int i9);

    public final void w0(m1 m1Var) {
        m1 m1Var2 = this.e;
        if (m1Var2 != null && m1Var != m1Var2 && m1Var2.e) {
            m1Var2.h();
        }
        this.e = m1Var;
        RecyclerView recyclerView = this.b;
        m1Var.getClass();
        recyclerView.J0 = true;
        p1 p1Var = recyclerView.m0;
        RecyclerView recyclerView2 = p1Var.h;
        if (recyclerView2.J0) {
            recyclerView2.removeCallbacks(p1Var);
            p1Var.c.abortAnimation();
        }
        if (m1Var.h) {
            Log.w("RecyclerView", "An instance of " + m1Var.getClass().getSimpleName() + " was started more than once. Each instance of" + m1Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        m1Var.b = recyclerView;
        m1Var.c = this;
        int i9 = m1Var.a;
        if (i9 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.p0.a = i9;
        m1Var.e = true;
        m1Var.d = true;
        m1Var.f = recyclerView.x.m(i9);
        m1Var.e();
        m1Var.b.m0.a();
        m1Var.h = true;
    }

    public abstract boolean y0();

    public void Q() {
    }

    public void Z() {
    }

    public void f0() {
    }

    public void W(RecyclerView recyclerView) {
    }

    public void V(RecyclerView recyclerView, int i9, int i10) {
    }

    public void X(RecyclerView recyclerView, int i9, int i10) {
    }

    public void Y(RecyclerView recyclerView, int i9, int i10) {
    }
}
