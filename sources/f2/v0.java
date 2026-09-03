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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class v0 {
    public af.d a;
    public RecyclerView b;
    public final af.c c;
    public final af.c d;
    public h1 e;
    public boolean f;
    public final boolean g;
    public final boolean h;
    public int i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;

    public v0() {
        androidx.biometric.e0 e0Var = new androidx.biometric.e0(this, 10);
        bb.b bVar = new bb.b(this, 13);
        this.c = new af.c((p1) e0Var);
        this.d = new af.c((p1) bVar);
        this.f = false;
        this.g = true;
        this.h = true;
    }

    public static int H(View view) {
        return ((w0) view.getLayoutParams()).b();
    }

    public static boolean N(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i10;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i10;
        }
        return true;
    }

    public static void O(View view, int i10, int i11, int i12, int i13) {
        w0 w0Var = (w0) view.getLayoutParams();
        Rect rect = w0Var.b;
        view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) w0Var).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) w0Var).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) w0Var).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin);
    }

    public static int g(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int s(boolean z4, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, i10 - i12);
        if (z4) {
            if (i13 < 0) {
                if (i13 == -1) {
                    if (i11 != Integer.MIN_VALUE) {
                        if (i11 != 0) {
                        }
                    }
                    i13 = max;
                }
                i11 = 0;
                i13 = 0;
            }
            i11 = TLObject.FLAG_30;
        } else {
            if (i13 < 0) {
                if (i13 != -1) {
                    if (i13 == -2) {
                        if (i11 == Integer.MIN_VALUE || i11 == 1073741824) {
                            i13 = max;
                            i11 = TLObject.FLAG_31;
                        } else {
                            i13 = max;
                            i11 = 0;
                        }
                    }
                    i11 = 0;
                    i13 = 0;
                }
                i13 = max;
            }
            i11 = TLObject.FLAG_30;
        }
        return View.MeasureSpec.makeMeasureSpec(i13, i11);
    }

    public static int v(View view) {
        return view.getBottom() + ((w0) view.getLayoutParams()).b.bottom;
    }

    public static void w(View view, Rect rect) {
        int[] iArr = RecyclerView.M0;
        w0 w0Var = (w0) view.getLayoutParams();
        Rect rect2 = w0Var.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) w0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) w0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) w0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin);
    }

    public static int x(View view) {
        return view.getLeft() - ((w0) view.getLayoutParams()).b.left;
    }

    public static void x0(View view) {
        l1 U = RecyclerView.U(view);
        U.l &= -129;
        U.o();
        U.a(4);
    }

    public static int y(View view) {
        return view.getRight() + ((w0) view.getLayoutParams()).b.right;
    }

    public static int z(View view) {
        return view.getTop() - ((w0) view.getLayoutParams()).b.top;
    }

    public int A() {
        return B();
    }

    public final int B() {
        RecyclerView recyclerView = this.b;
        o0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
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

    public int I(af.h hVar, i1 i1Var) {
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
        Rect rect2 = ((w0) view.getLayoutParams()).b;
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
        l1 U = RecyclerView.U(view);
        U.a(128);
        this.b.f.c0(U);
    }

    public void P(View view) {
        w0 w0Var = (w0) view.getLayoutParams();
        Rect W = this.b.W(view);
        int i10 = W.left + W.right;
        int i11 = W.top + W.bottom;
        int s6 = s(d(), this.m, this.k, E() + D() + ((ViewGroup.MarginLayoutParams) w0Var).leftMargin + ((ViewGroup.MarginLayoutParams) w0Var).rightMargin + i10, ((ViewGroup.MarginLayoutParams) w0Var).width);
        int s9 = s(e(), this.n, this.l, C() + F() + ((ViewGroup.MarginLayoutParams) w0Var).topMargin + ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin + i11, ((ViewGroup.MarginLayoutParams) w0Var).height);
        if (u0(view, s6, s9, w0Var)) {
            view.measure(s6, s9);
        }
    }

    public abstract View R(View view, int i10, af.h hVar, i1 i1Var);

    public void S(af.h hVar, i1 i1Var, s0.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            dVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            dVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(hVar, i1Var), u(hVar, i1Var), false, 0));
    }

    public void T(af.h hVar, i1 i1Var, View view, s0.d dVar) {
        dVar.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(e() ? H(view) : 0, 1, d() ? H(view) : 0, 1, false, false));
    }

    public final void U(View view, s0.d dVar) {
        l1 U = RecyclerView.U(view);
        if (U == null || U.j()) {
            return;
        }
        af.d dVar2 = this.a;
        if (((ArrayList) dVar2.d).contains(U.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        T(recyclerView.b, recyclerView.q0, view, dVar);
    }

    public final void a(View view, int i10, boolean z4) {
        l1 U = RecyclerView.U(view);
        if (z4 || U.j()) {
            a0.f fVar = (a0.f) this.b.f.b;
            q1 q1Var = (q1) fVar.get(U);
            if (q1Var == null) {
                q1Var = q1.a();
                fVar.put(U, q1Var);
            }
            q1Var.a |= 1;
        } else {
            this.b.f.b0(U);
        }
        w0 w0Var = (w0) view.getLayoutParams();
        if (U.s() || U.k()) {
            if (U.k()) {
                U.p.k(U);
            } else {
                U.l &= -33;
            }
            this.a.g(view, i10, view.getLayoutParams(), false);
        } else if (view.getParent() == this.b) {
            af.d dVar = this.a;
            c cVar = (c) dVar.c;
            int indexOfChild = ((RecyclerView) ((bb.b) dVar.b).b).indexOfChild(view);
            int u10 = (indexOfChild == -1 || cVar.x(indexOfChild)) ? -1 : indexOfChild - cVar.u(indexOfChild);
            if (i10 == -1) {
                i10 = this.a.p();
            }
            if (u10 == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.C());
            }
            if (u10 != i10) {
                v0 v0Var = this.b.x;
                View q10 = v0Var.q(u10);
                if (q10 == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + u10 + v0Var.b.toString());
                }
                v0Var.q(u10);
                v0Var.a.l(u10);
                w0 w0Var2 = (w0) q10.getLayoutParams();
                l1 U2 = RecyclerView.U(q10);
                if (U2.j()) {
                    a0.f fVar2 = (a0.f) v0Var.b.f.b;
                    q1 q1Var2 = (q1) fVar2.get(U2);
                    if (q1Var2 == null) {
                        q1Var2 = q1.a();
                        fVar2.put(U2, q1Var2);
                    }
                    q1Var2.a = 1 | q1Var2.a;
                } else {
                    v0Var.b.f.b0(U2);
                }
                v0Var.a.g(q10, i10, w0Var2, U2.j());
            }
        } else {
            this.a.f(view, i10, false);
            w0Var.c = true;
            h1 h1Var = this.e;
            if (h1Var != null && h1Var.e) {
                h1Var.b.getClass();
                if (RecyclerView.S(view) == h1Var.a) {
                    h1Var.f = view;
                }
            }
        }
        if (w0Var.d) {
            U.a.invalidate();
            w0Var.d = false;
        }
    }

    public void a0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        Z();
    }

    public abstract void b(String str);

    public abstract void b0(af.h hVar, i1 i1Var);

    public final void c(View view, Rect rect) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.W(view));
        }
    }

    public abstract void c0(i1 i1Var);

    public abstract boolean d();

    public void d0(af.h hVar, i1 i1Var, int i10, int i11) {
        this.b.q(i10, i11);
    }

    public abstract boolean e();

    public abstract h0 e0();

    public boolean f(w0 w0Var) {
        return w0Var != null;
    }

    public final void g0(af.h hVar) {
        for (int r10 = r() - 1; r10 >= 0; r10--) {
            if (!RecyclerView.U(q(r10)).r()) {
                i0(r10, hVar);
            }
        }
    }

    public abstract int h(i1 i1Var);

    public final void h0(af.h hVar) {
        ArrayList arrayList = (ArrayList) hVar.c;
        ArrayList arrayList2 = (ArrayList) hVar.c;
        int size = arrayList.size();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            View view = ((l1) arrayList2.get(i10)).a;
            l1 U = RecyclerView.U(view);
            if (!U.r()) {
                U.q(false);
                if (U.l()) {
                    this.b.removeDetachedView(view, false);
                }
                t0 t0Var = this.b.W;
                if (t0Var != null) {
                    t0Var.f(U);
                }
                U.q(true);
                l1 U2 = RecyclerView.U(view);
                U2.p = null;
                U2.q = false;
                U2.l &= -33;
                hVar.h(U2);
            }
        }
        arrayList2.clear();
        ArrayList arrayList3 = (ArrayList) hVar.d;
        if (arrayList3 != null) {
            arrayList3.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int i(i1 i1Var);

    public final void i0(int i10, af.h hVar) {
        View q10 = q(i10);
        if (RecyclerView.U(q10).r()) {
            return;
        }
        j0(i10);
        hVar.g(q10);
    }

    public abstract int j(i1 i1Var);

    public final void j0(int i10) {
        if (q(i10) != null) {
            af.d dVar = this.a;
            int t6 = dVar.t(i10);
            bb.b bVar = (bb.b) dVar.b;
            View childAt = ((RecyclerView) bVar.b).getChildAt(t6);
            if (childAt == null) {
                return;
            }
            if (((c) dVar.c).z(t6)) {
                dVar.C(childAt);
            }
            bVar.Q(t6);
        }
    }

    public abstract int k(i1 i1Var);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if ((r6.bottom - r9) > r3) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k0(RecyclerView recyclerView, View view, Rect rect, boolean z4, boolean z10) {
        int[] t6 = t(view, rect);
        int i10 = t6[0];
        int i11 = t6[1];
        if (z10) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int D = D();
                int F = F();
                int E = this.m - E();
                int C = this.n - C();
                Rect rect2 = this.b.r;
                w(focusedChild, rect2);
                if (rect2.left - i10 < E) {
                    if (rect2.right - i10 > D) {
                        if (rect2.top - i11 < C) {
                        }
                    }
                }
            }
            return false;
        }
        if (i10 != 0 || i11 != 0) {
            if (z4) {
                recyclerView.scrollBy(i10, i11);
                return true;
            }
            recyclerView.v0(i10, i11, null);
            return true;
        }
        return false;
    }

    public abstract int l(i1 i1Var);

    public final void l0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract View m(int i10);

    public abstract int m0(int i10, af.h hVar, i1 i1Var);

    public abstract w0 n();

    public abstract void n0(int i10);

    public w0 o(Context context, AttributeSet attributeSet) {
        return new w0(context, attributeSet);
    }

    public abstract int o0(int i10, af.h hVar, i1 i1Var);

    public w0 p(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof w0 ? new w0((w0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new w0((ViewGroup.MarginLayoutParams) layoutParams) : new w0(layoutParams);
    }

    public final void p0(RecyclerView recyclerView) {
        q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), TLObject.FLAG_30));
    }

    public final View q(int i10) {
        af.d dVar = this.a;
        if (dVar != null) {
            return dVar.o(i10);
        }
        return null;
    }

    public final void q0(int i10, int i11) {
        this.m = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.k = mode;
        if (mode == 0 && !RecyclerView.N0) {
            this.m = 0;
        }
        this.n = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.l = mode2;
        if (mode2 != 0 || RecyclerView.N0) {
            return;
        }
        this.n = 0;
    }

    public final int r() {
        af.d dVar = this.a;
        if (dVar != null) {
            return dVar.p();
        }
        return 0;
    }

    public void r0(Rect rect, int i10, int i11) {
        int E = E() + D() + rect.width();
        int C = C() + F() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = r0.j0.a;
        this.b.setMeasuredDimension(g(i10, E, recyclerView.getMinimumWidth()), g(i11, C, this.b.getMinimumHeight()));
    }

    public final void s0(int i10, int i11) {
        int r10 = r();
        if (r10 == 0) {
            this.b.q(i10, i11);
            return;
        }
        int i12 = TLObject.FLAG_31;
        int i13 = TLObject.FLAG_31;
        int i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i16 = 0; i16 < r10; i16++) {
            View q10 = q(i16);
            Rect rect = this.b.r;
            w(q10, rect);
            int i17 = rect.left;
            if (i17 < i14) {
                i14 = i17;
            }
            int i18 = rect.right;
            if (i18 > i12) {
                i12 = i18;
            }
            int i19 = rect.top;
            if (i19 < i15) {
                i15 = i19;
            }
            int i20 = rect.bottom;
            if (i20 > i13) {
                i13 = i20;
            }
        }
        this.b.r.set(i14, i15, i12, i13);
        r0(this.b.r, i10, i11);
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
        int i10 = left - D;
        int min = Math.min(0, i10);
        int i11 = top - F;
        int min2 = Math.min(0, i11);
        int i12 = width - E;
        int max = Math.max(0, i12);
        int max2 = Math.max(0, height - C);
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = r0.j0.a;
        if (recyclerView.getLayoutDirection() != 1) {
            if (min == 0) {
                min = Math.min(i10, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i12);
        }
        if (min2 == 0) {
            min2 = Math.min(i11, max2);
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

    public int u(af.h hVar, i1 i1Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.w == null || !d()) {
            return 1;
        }
        return this.b.w.h();
    }

    public final boolean u0(View view, int i10, int i11, w0 w0Var) {
        return (!view.isLayoutRequested() && this.g && N(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) w0Var).width) && N(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) w0Var).height)) ? false : true;
    }

    public abstract void v0(RecyclerView recyclerView, i1 i1Var, int i10);

    public final void w0(h1 h1Var) {
        h1 h1Var2 = this.e;
        if (h1Var2 != null && h1Var != h1Var2 && h1Var2.e) {
            h1Var2.h();
        }
        this.e = h1Var;
        RecyclerView recyclerView = this.b;
        h1Var.getClass();
        recyclerView.K0 = true;
        k1 k1Var = recyclerView.n0;
        RecyclerView recyclerView2 = k1Var.h;
        if (recyclerView2.K0) {
            recyclerView2.removeCallbacks(k1Var);
            k1Var.c.abortAnimation();
        }
        if (h1Var.h) {
            Log.w("RecyclerView", "An instance of " + h1Var.getClass().getSimpleName() + " was started more than once. Each instance of" + h1Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        h1Var.b = recyclerView;
        h1Var.c = this;
        int i10 = h1Var.a;
        if (i10 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.q0.a = i10;
        h1Var.e = true;
        h1Var.d = true;
        h1Var.f = recyclerView.x.m(i10);
        h1Var.e();
        h1Var.b.n0.a();
        h1Var.h = true;
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

    public void V(RecyclerView recyclerView, int i10, int i11) {
    }

    public void X(RecyclerView recyclerView, int i10, int i11) {
    }

    public void Y(RecyclerView recyclerView, int i10, int i11) {
    }
}
