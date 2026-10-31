package androidx.recyclerview.widget;

import a0.h;
import a1.g;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import e2.f;
import hf.e;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kg.s0;
import m2.t;
import m4.c;
import n2.u;
import org.telegram.messenger.f8;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.xj0;
import q0.a;
import q5.d;
import r0.b0;
import r0.h0;
import r0.i0;
import r0.j;
import s4.a0;
import s4.a1;
import s4.b1;
import s4.c1;
import s4.e0;
import s4.e1;
import s4.f0;
import s4.f1;
import s4.g0;
import s4.j0;
import s4.j1;
import s4.k0;
import s4.l0;
import s4.m0;
import s4.n0;
import s4.o0;
import s4.p;
import s4.p0;
import s4.q0;
import s4.r0;
import s4.u0;
import s4.v0;
import s4.w0;
import s4.y0;
import s4.z;
import s4.z0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] Q0 = {R.attr.clipToPadding};
    public static final p2 R0 = new p2(4);
    public boolean A0;
    public e1 B0;
    public final int[] C0;
    public final ArrayList D;
    public j D0;
    public final ArrayList E;
    public final int[] E0;
    public r0 F;
    public final int[] F0;
    public boolean G;
    public int G0;
    public boolean H;
    public int H0;
    public boolean I;
    public Integer I0;
    public int J;
    public final int[] J0;
    public boolean K;
    public final ArrayList K0;
    public boolean L;
    public final e0 L0;
    public boolean M;
    public final f0 M0;
    public int N;
    public String N0;
    public final AccessibilityManager O;
    public boolean O0;
    public ArrayList P;
    public boolean P0;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public k0 U;
    public EdgeEffect V;
    public EdgeEffect W;
    public final xj0 a;
    public EdgeEffect a0;
    public final e b;
    public EdgeEffect b0;
    public w0 c;
    public l0 c0;
    public final s0 d;
    public int d0;
    public final d e;
    public int e0;
    public final c f;
    public VelocityTracker f0;
    public int g0;
    public boolean h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public q0 l0;
    public final int m0;
    public final e0 n;
    public final int n0;
    public final float o0;
    public final float p0;
    public boolean q0;
    public final Rect r;
    public final b1 r0;
    public final Rect s;
    public p s0;
    public final f t0;
    public final z0 u0;
    public s4.s0 v0;
    public final RectF w;
    public ArrayList w0;
    public g0 x;
    public boolean x0;
    public n0 y;
    public boolean y0;
    public final u z0;

    public RecyclerView(Context context) {
        this(context, null);
    }

    public static RecyclerView J(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView J = J(viewGroup.getChildAt(i10));
            if (J != null) {
                return J;
            }
        }
        return null;
    }

    public static int R(View view) {
        c1 U = U(view);
        if (U != null) {
            return U.b();
        }
        return -1;
    }

    public static int S(View view) {
        c1 U = U(view);
        if (U != null) {
            return U.c();
        }
        return -1;
    }

    public static c1 U(View view) {
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof o0) {
            return ((o0) layoutParams).a;
        }
        return null;
    }

    private j getScrollingChildHelper() {
        if (this.D0 == null) {
            this.D0 = new j(this);
        }
        return this.D0;
    }

    public static void m(c1 c1Var) {
        WeakReference weakReference = c1Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == c1Var.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            c1Var.b = null;
        }
    }

    public final void A() {
        if (this.a0 != null) {
            return;
        }
        EdgeEffect a2 = this.U.a(this, 2);
        this.a0 = a2;
        if (this.h) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
        k(this.a0);
    }

    public final void A0(boolean z10) {
        if (this.J < 1) {
            this.J = 1;
        }
        if (!z10 && !this.L) {
            this.K = false;
        }
        if (this.J == 1) {
            if (z10 && this.K && !this.L && this.y != null && this.x != null) {
                s();
            }
            if (!this.L) {
                this.K = false;
            }
        }
        this.J--;
    }

    public final void B() {
        if (this.W != null) {
            return;
        }
        EdgeEffect a2 = this.U.a(this, 1);
        this.W = a2;
        if (this.h) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
        k(this.W);
    }

    public final void B0(int i10) {
        getScrollingChildHelper().h(i10);
    }

    public final String C() {
        String sb2;
        StringBuilder sb3 = new StringBuilder(" ");
        sb3.append(super.toString());
        sb3.append(", adapter:");
        sb3.append(this.x);
        sb3.append(", layout:");
        sb3.append(this.y);
        sb3.append(", context:");
        sb3.append(getContext());
        sb3.append(", ainfo:");
        sb3.append(this.N0);
        ArrayList arrayList = (ArrayList) this.d.h;
        if (arrayList == null) {
            sb2 = null;
        } else {
            StringBuilder sb4 = new StringBuilder();
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (size < arrayList.size() - 1) {
                    sb4.append("\n\n");
                }
                sb4.append((String) arrayList.get(size));
            }
            sb2 = sb4.toString();
        }
        if (sb2 != null) {
            sb3.append(", last notifies:\n");
            sb3.append(sb2);
        }
        return sb3.toString();
    }

    public void C0() {
        y0 y0Var;
        setScrollState(0);
        b1 b1Var = this.r0;
        RecyclerView recyclerView = b1Var.h;
        if (recyclerView.O0) {
            recyclerView.removeCallbacks(b1Var);
            b1Var.c.abortAnimation();
        }
        n0 n0Var = this.y;
        if (n0Var == null || (y0Var = n0Var.e) == null) {
            return;
        }
        y0Var.h();
    }

    public final void D(z0 z0Var) {
        if (getScrollState() != 2) {
            z0Var.getClass();
            return;
        }
        OverScroller overScroller = this.r0.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        z0Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View E(float f7, float f10) {
        for (int m10 = this.e.m() - 1; m10 >= 0; m10--) {
            View l4 = this.e.l(m10);
            float translationX = l4.getTranslationX();
            float translationY = l4.getTranslationY();
            if (f7 >= l4.getLeft() + translationX && f7 <= l4.getRight() + translationX && f10 >= l4.getTop() + translationY && f10 <= l4.getBottom() + translationY) {
                return l4;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View F(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    public final c1 G(View view) {
        View F = F(view);
        if (F == null) {
            return null;
        }
        return T(F);
    }

    public final boolean H(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            r0 r0Var = (r0) arrayList.get(i10);
            if (r0Var.b(this, motionEvent) && action != 3) {
                this.F = r0Var;
                return true;
            }
        }
        return false;
    }

    public final void I(int[] iArr) {
        int m10 = this.e.m();
        if (m10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i11 = TLObject.FLAG_31;
        for (int i12 = 0; i12 < m10; i12++) {
            c1 U = U(this.e.l(i12));
            if (U != null && !U.r()) {
                int c10 = U.c();
                if (c10 < i10) {
                    i10 = c10;
                }
                if (c10 > i11) {
                    i11 = c10;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public final c1 K(int i10) {
        c1 c1Var = null;
        if (this.Q) {
            return null;
        }
        int r10 = this.e.r();
        for (int i11 = 0; i11 < r10; i11++) {
            c1 U = U(this.e.q(i11));
            if (U != null && !U.j() && N(U) == i10) {
                if (!((ArrayList) this.e.d).contains(U.a)) {
                    return U;
                }
                c1Var = U;
            }
        }
        return c1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c1 L(int i10, boolean z10) {
        int r10 = this.e.r();
        c1 c1Var = null;
        for (int i11 = 0; i11 < r10; i11++) {
            c1 U = U(this.e.q(i11));
            if (U != null && !U.j()) {
                if (z10) {
                    if (U.c != i10) {
                        continue;
                    }
                    if (((ArrayList) this.e.d).contains(U.a)) {
                        return U;
                    }
                    c1Var = U;
                } else {
                    if (U.c() != i10) {
                        continue;
                    }
                    if (((ArrayList) this.e.d).contains(U.a)) {
                    }
                }
            }
        }
        return c1Var;
    }

    public final void M(a aVar) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            aVar.accept(getChildAt(i10));
        }
        for (int i11 = 0; i11 < getHiddenChildCount(); i11++) {
            aVar.accept(V(i11));
        }
        for (int i12 = 0; i12 < getAttachedScrapChildCount(); i12++) {
            aVar.accept(O(i12));
        }
    }

    public final int N(c1 c1Var) {
        if (c1Var.e(524) || !c1Var.g()) {
            return -1;
        }
        int i10 = c1Var.c;
        ArrayList arrayList = (ArrayList) this.d.d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            s4.a aVar = (s4.a) arrayList.get(i11);
            int i12 = aVar.a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = aVar.b;
                    if (i13 <= i10) {
                        int i14 = aVar.d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = aVar.b;
                    if (i15 == i10) {
                        i10 = aVar.d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (aVar.d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (aVar.b <= i10) {
                i10 += aVar.d;
            }
        }
        return i10;
    }

    public final View O(int i10) {
        if (i10 < 0) {
            return null;
        }
        e eVar = this.b;
        if (i10 >= ((ArrayList) eVar.c).size()) {
            return null;
        }
        return ((c1) ((ArrayList) eVar.c).get(i10)).a;
    }

    public final View P(int i10) {
        if (i10 < 0) {
            return null;
        }
        e eVar = this.b;
        if (i10 >= ((ArrayList) eVar.e).size()) {
            return null;
        }
        return ((c1) ((ArrayList) eVar.e).get(i10)).a;
    }

    public final long Q(c1 c1Var) {
        return this.x.b ? c1Var.e : c1Var.c;
    }

    public final c1 T(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return U(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final View V(int i10) {
        ArrayList arrayList = (ArrayList) this.e.d;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return null;
        }
        return (View) arrayList.get(i10);
    }

    public final Rect W(View view) {
        o0 o0Var = (o0) view.getLayoutParams();
        boolean z10 = o0Var.c;
        Rect rect = o0Var.b;
        if (z10) {
            z0 z0Var = this.u0;
            if (!z0Var.g || (!o0Var.a.m() && !o0Var.a.h())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.D;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Rect rect2 = this.r;
                    rect2.set(0, 0, 0, 0);
                    ((m0) arrayList.get(i10)).c(rect2, view, this, z0Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                o0Var.c = false;
                return rect;
            }
        }
        return rect;
    }

    public final m0 X(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 < 0 || i10 >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(g.i(i10, itemDecorationCount, " is an invalid index for size "));
        }
        return (m0) this.D.get(i10);
    }

    public final void Y(long j10, c1 c1Var, c1 c1Var2) {
        int m10 = this.e.m();
        for (int i10 = 0; i10 < m10; i10++) {
            c1 U = U(this.e.l(i10));
            if (U != c1Var && Q(U) == j10) {
                g0 g0Var = this.x;
                if (g0Var == null || !g0Var.b) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + U + " \n View Holder 2:" + c1Var + C());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + U + " \n View Holder 2:" + c1Var + C());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + c1Var2 + " cannot be found but it is necessary for " + c1Var + C());
    }

    public final boolean Z() {
        return !this.I || this.Q || this.d.h();
    }

    public final void a0() {
        if (this.D.size() == 0) {
            return;
        }
        n0 n0Var = this.y;
        if (n0Var != null) {
            n0Var.b("Cannot invalidate item decorations during a scroll or layout");
        }
        e0();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        n0 n0Var = this.y;
        if (n0Var != null) {
            n0Var.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final boolean b0() {
        l0 l0Var = this.c0;
        return l0Var != null && l0Var.k();
    }

    public final boolean c0() {
        return this.S > 0;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof o0) && this.y.f((o0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        n0 n0Var = this.y;
        if (n0Var == null || !n0Var.d()) {
            return 0;
        }
        return ((a0) this.y).B0(this.u0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        n0 n0Var = this.y;
        if (n0Var != null && n0Var.d()) {
            return this.y.h(this.u0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        n0 n0Var = this.y;
        if (n0Var != null && n0Var.d()) {
            return this.y.i(this.u0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        n0 n0Var = this.y;
        if (n0Var != null && n0Var.e()) {
            return this.y.j(this.u0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        n0 n0Var = this.y;
        if (n0Var != null && n0Var.e()) {
            return this.y.k(this.u0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        n0 n0Var = this.y;
        if (n0Var != null && n0Var.e()) {
            return this.y.l(this.u0);
        }
        return 0;
    }

    public final void d0(int i10) {
        if (this.y == null) {
            return;
        }
        setScrollState(2);
        this.y.n0(i10);
        awakenScrollBars();
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f7, float f10, boolean z10) {
        return getScrollingChildHelper().a(f7, f10, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f7, float f10) {
        return getScrollingChildHelper().b(f7, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().d(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ((m0) arrayList.get(i10)).f(canvas, this);
        }
        Integer num = this.I0;
        if (num == null || num.intValue() != 0) {
            EdgeEffect edgeEffect = this.V;
            if (edgeEffect == null || edgeEffect.isFinished()) {
                z10 = false;
            } else {
                int save = canvas.save();
                int paddingBottom = this.h ? getPaddingBottom() : 0;
                canvas.rotate(270.0f);
                canvas.translate((-getHeight()) + paddingBottom, 0.0f);
                EdgeEffect edgeEffect2 = this.V;
                z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
                canvas.restoreToCount(save);
            }
            EdgeEffect edgeEffect3 = this.W;
            if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
                int save2 = canvas.save();
                if (this.h) {
                    canvas.translate(getPaddingLeft(), getPaddingTop());
                }
                canvas.translate(0.0f, this.G0);
                EdgeEffect edgeEffect4 = this.W;
                z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
                canvas.restoreToCount(save2);
            }
            EdgeEffect edgeEffect5 = this.a0;
            if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
                int save3 = canvas.save();
                int width = getWidth();
                int paddingTop = this.h ? getPaddingTop() : 0;
                canvas.rotate(90.0f);
                canvas.translate(-paddingTop, -width);
                EdgeEffect edgeEffect6 = this.a0;
                z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
                canvas.restoreToCount(save3);
            }
            EdgeEffect edgeEffect7 = this.b0;
            if (edgeEffect7 == null || edgeEffect7.isFinished()) {
                z11 = z10;
            } else {
                int save4 = canvas.save();
                canvas.rotate(180.0f);
                if (this.h) {
                    canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
                } else {
                    canvas.translate(-getWidth(), (-getHeight()) + this.H0);
                }
                EdgeEffect edgeEffect8 = this.b0;
                if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                    z11 = true;
                }
                z11 |= z10;
                canvas.restoreToCount(save4);
            }
        }
        if ((z11 || this.c0 == null || arrayList.size() <= 0 || !this.c0.k()) ? z11 : true) {
            WeakHashMap weakHashMap = h0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e0() {
        int r10 = this.e.r();
        for (int i10 = 0; i10 < r10; i10++) {
            ((o0) this.e.q(i10).getLayoutParams()).c = true;
        }
        ArrayList arrayList = (ArrayList) this.b.e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o0 o0Var = (o0) ((c1) arrayList.get(i11)).a.getLayoutParams();
            if (o0Var != null) {
                o0Var.c = true;
            }
        }
    }

    public final void f0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int r10 = this.e.r();
        for (int i13 = 0; i13 < r10; i13++) {
            c1 U = U(this.e.q(i13));
            if (U != null && !U.r()) {
                int i14 = U.c;
                z0 z0Var = this.u0;
                if (i14 >= i12) {
                    U.n(-i11, z10);
                    z0Var.f = true;
                } else if (i14 >= i10) {
                    U.a(8);
                    U.n(-i11, z10);
                    U.c = i10 - 1;
                    z0Var.f = true;
                }
            }
        }
        e eVar = this.b;
        ArrayList arrayList = (ArrayList) eVar.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c1 c1Var = (c1) arrayList.get(size);
            if (c1Var != null) {
                int i15 = c1Var.c;
                if (i15 >= i12) {
                    c1Var.n(-i11, z10);
                } else if (i15 >= i10) {
                    c1Var.a(8);
                    eVar.f(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018e, code lost:
    
        if (r5 < 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0196, code lost:
    
        if ((r5 * r6) <= 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x019e, code lost:
    
        if ((r5 * r6) >= 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0168, code lost:
    
        if (r7 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0188, code lost:
    
        if (r5 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018b, code lost:
    
        if (r7 < 0) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00df  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i10) {
        View view2;
        int i11;
        char c10;
        boolean z10;
        this.y.getClass();
        boolean z11 = true;
        boolean z12 = (this.x == null || this.y == null || c0() || this.L) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        z0 z0Var = this.u0;
        e eVar = this.b;
        if (z12 && (i10 == 2 || i10 == 1)) {
            if (this.y.e()) {
                if (focusFinder.findNextFocus(this, view, i10 == 2 ? zs.O1 : 33) == null) {
                    z10 = true;
                    if (!z10 && this.y.d()) {
                        RecyclerView recyclerView = this.y.b;
                        WeakHashMap weakHashMap = h0.a;
                        z10 = focusFinder.findNextFocus(this, view, !((recyclerView.getLayoutDirection() != 1) ^ (i10 != 2)) ? 66 : 17) != null;
                    }
                    if (z10) {
                        p();
                        if (F(view) != null) {
                            z0();
                            this.y.R(view, i10, eVar, z0Var);
                            A0(false);
                        }
                        return null;
                    }
                    view2 = focusFinder.findNextFocus(this, view, i10);
                    if (view2 == null) {
                    }
                    if (view2 != null) {
                        if (F(view2) != null) {
                        }
                        if (z11) {
                        }
                    }
                    z11 = false;
                    if (z11) {
                    }
                }
            }
            z10 = false;
            if (!z10) {
                RecyclerView recyclerView2 = this.y.b;
                WeakHashMap weakHashMap2 = h0.a;
                if (focusFinder.findNextFocus(this, view, !((recyclerView2.getLayoutDirection() != 1) ^ (i10 != 2)) ? 66 : 17) != null) {
                }
            }
            if (z10) {
            }
            view2 = focusFinder.findNextFocus(this, view, i10);
            if (view2 == null) {
            }
            if (view2 != null) {
            }
            z11 = false;
            if (z11) {
            }
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (findNextFocus == null && z12) {
                p();
                if (F(view) != null) {
                    z0();
                    view2 = this.y.R(view, i10, eVar, z0Var);
                    A0(false);
                }
                return null;
            }
            view2 = findNextFocus;
            if (view2 == null && !view2.hasFocusable()) {
                if (getFocusedChild() == null) {
                    return super.focusSearch(view, i10);
                }
                r0(view2, null);
                return view;
            }
            if (view2 != null && view2 != this && view2 != view) {
                if (F(view2) != null) {
                    z11 = false;
                } else if (view != null && F(view) != null) {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    Rect rect = this.r;
                    rect.set(0, 0, width, height);
                    int width2 = view2.getWidth();
                    int height2 = view2.getHeight();
                    Rect rect2 = this.s;
                    rect2.set(0, 0, width2, height2);
                    offsetDescendantRectToMyCoords(view, rect);
                    offsetDescendantRectToMyCoords(view2, rect2);
                    RecyclerView recyclerView3 = this.y.b;
                    WeakHashMap weakHashMap3 = h0.a;
                    int i12 = recyclerView3.getLayoutDirection() == 1 ? -1 : 1;
                    int i13 = rect.left;
                    int i14 = rect2.left;
                    if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
                        i11 = 1;
                    } else {
                        int i15 = rect.right;
                        int i16 = rect2.right;
                        i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
                    }
                    int i17 = rect.top;
                    int i18 = rect2.top;
                    if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
                        c10 = 1;
                    } else {
                        int i19 = rect.bottom;
                        int i20 = rect2.bottom;
                        c10 = ((i19 > i20 || i17 >= i20) && i17 > i18) ? (char) 65535 : (char) 0;
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 17) {
                                if (i10 != 33) {
                                    if (i10 != 66) {
                                        if (i10 != 130) {
                                            throw new IllegalArgumentException("Invalid direction: " + i10 + C());
                                        }
                                    }
                                }
                            }
                        } else if (c10 <= 0) {
                            if (c10 == 0) {
                            }
                        }
                    } else if (c10 >= 0) {
                        if (c10 == 0) {
                        }
                    }
                }
                return z11 ? view2 : super.focusSearch(view, i10);
            }
            z11 = false;
            if (z11) {
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        n0 n0Var = this.y;
        if (n0Var != null) {
            return n0Var.n();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + C());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        n0 n0Var = this.y;
        if (n0Var != null) {
            return n0Var.o(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + C());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g0 getAdapter() {
        return this.x;
    }

    public int getAttachedScrapChildCount() {
        return ((ArrayList) this.b.c).size();
    }

    @Override // android.view.View
    public int getBaseline() {
        n0 n0Var = this.y;
        if (n0Var == null) {
            return super.getBaseline();
        }
        n0Var.getClass();
        return -1;
    }

    public int getBottomGlowOffset() {
        return this.H0;
    }

    public int getCachedChildCount() {
        return ((ArrayList) this.b.e).size();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.h;
    }

    public e1 getCompatAccessibilityDelegate() {
        return this.B0;
    }

    public float getCurrentVelocity() {
        VelocityTracker velocityTracker = this.f0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.n0);
        return this.f0.getYVelocity();
    }

    public k0 getEdgeEffectFactory() {
        return this.U;
    }

    public int getGlowColor() {
        Integer num = this.I0;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int getHiddenChildCount() {
        return ((ArrayList) this.e.d).size();
    }

    public l0 getItemAnimator() {
        return this.c0;
    }

    public int getItemDecorationCount() {
        return this.D.size();
    }

    public n0 getLayoutManager() {
        return this.y;
    }

    public int getMaxFlingVelocity() {
        return this.n0;
    }

    public int getMinFlingVelocity() {
        return this.m0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public q0 getOnFlingListener() {
        return this.l0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.q0;
    }

    public u0 getRecycledViewPool() {
        return this.b.c();
    }

    public int getScrollState() {
        return this.d0;
    }

    public int getTopGlowOffset() {
        return this.G0;
    }

    public final void h(c1 c1Var) {
        View view = c1Var.a;
        boolean z10 = view.getParent() == this;
        this.b.k(T(view));
        if (c1Var.l()) {
            this.e.i(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z10) {
            this.e.h(-1, view, true);
            return;
        }
        d dVar = this.e;
        int indexOfChild = ((RecyclerView) ((t) dVar.b).b).indexOfChild(view);
        if (indexOfChild >= 0) {
            ((c3.g0) dVar.c).J(indexOfChild);
            dVar.t(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void h0() {
        this.S++;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(m0 m0Var) {
        n0 n0Var = this.y;
        if (n0Var != null) {
            n0Var.b("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.D;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(m0Var);
        e0();
        requestLayout();
    }

    public final void i0(boolean z10) {
        int i10;
        AccessibilityManager accessibilityManager;
        int i11 = this.S - 1;
        this.S = i11;
        if (i11 < 1) {
            this.S = 0;
            if (z10) {
                int i12 = this.N;
                this.N = 0;
                if (i12 != 0 && (accessibilityManager = this.O) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i12);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.K0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c1 c1Var = (c1) arrayList.get(size);
                    if (c1Var.a.getParent() == this && !c1Var.r() && (i10 = c1Var.s) != -1) {
                        View view = c1Var.a;
                        WeakHashMap weakHashMap = h0.a;
                        view.setImportantForAccessibility(i10);
                        c1Var.s = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.G;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.L;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(s4.s0 s0Var) {
        if (this.w0 == null) {
            this.w0 = new ArrayList();
        }
        this.w0.add(s0Var);
    }

    public final void j0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.e0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.e0 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.i0 = x10;
            this.g0 = x10;
            int y3 = (int) (motionEvent.getY(i10) + 0.5f);
            this.j0 = y3;
            this.h0 = y3;
        }
    }

    public final void k(EdgeEffect edgeEffect) {
        Integer num;
        if (edgeEffect == null || (num = this.I0) == null) {
            return;
        }
        edgeEffect.setColor(num.intValue());
    }

    public final void l(String str) {
        if (c0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + C());
        }
        if (this.T > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + C()));
        }
    }

    public final void m0() {
        if (this.A0 || !this.G) {
            return;
        }
        WeakHashMap weakHashMap = h0.a;
        postOnAnimation(this.L0);
        this.A0 = true;
    }

    public final void n() {
        int r10 = this.e.r();
        for (int i10 = 0; i10 < r10; i10++) {
            c1 U = U(this.e.q(i10));
            if (U != null && !U.r()) {
                U.d = -1;
                U.g = -1;
            }
        }
        e eVar = this.b;
        ArrayList arrayList = (ArrayList) eVar.c;
        ArrayList arrayList2 = (ArrayList) eVar.e;
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            c1 c1Var = (c1) arrayList2.get(i11);
            c1Var.d = -1;
            c1Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            c1 c1Var2 = (c1) arrayList.get(i12);
            c1Var2.d = -1;
            c1Var2.g = -1;
        }
        ArrayList arrayList3 = (ArrayList) eVar.d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                c1 c1Var3 = (c1) ((ArrayList) eVar.d).get(i13);
                c1Var3.d = -1;
                c1Var3.g = -1;
            }
        }
    }

    public final void n0(boolean z10) {
        this.R = z10 | this.R;
        this.Q = true;
        int r10 = this.e.r();
        for (int i10 = 0; i10 < r10; i10++) {
            c1 U = U(this.e.q(i10));
            if (U != null && !U.r()) {
                U.a(6);
            }
        }
        e0();
        e eVar = this.b;
        ArrayList arrayList = (ArrayList) eVar.e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            c1 c1Var = (c1) arrayList.get(i11);
            if (c1Var != null) {
                c1Var.a(6);
                c1Var.a(1024);
            }
        }
        g0 g0Var = ((RecyclerView) eVar.h).x;
        if (g0Var == null || !g0Var.b) {
            eVar.e();
        }
    }

    public final void o(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.V;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.V.onRelease();
            z10 = this.V.isFinished();
        }
        EdgeEffect edgeEffect2 = this.a0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.a0.onRelease();
            z10 |= this.a0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.W;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.W.onRelease();
            z10 |= this.W.isFinished();
        }
        EdgeEffect edgeEffect4 = this.b0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.b0.onRelease();
            z10 |= this.b0.isFinished();
        }
        if (z10) {
            WeakHashMap weakHashMap = h0.a;
            postInvalidateOnAnimation();
        }
    }

    public final void o0(c1 c1Var, ac.g gVar) {
        c1Var.p(0, TLObject.FLAG_13);
        boolean z10 = this.u0.h;
        c cVar = this.f;
        if (z10 && c1Var.m() && !c1Var.j() && !c1Var.r()) {
            ((h) cVar.c).k(c1Var, Q(c1Var));
        }
        a0.f fVar = (a0.f) cVar.b;
        j1 j1Var = (j1) fVar.get(c1Var);
        if (j1Var == null) {
            j1Var = j1.a();
            fVar.put(c1Var, j1Var);
        }
        j1Var.b = gVar;
        j1Var.a |= 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (r1 >= 30.0f) goto L20;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        float f7;
        super.onAttachedToWindow();
        this.S = 0;
        this.G = true;
        this.I = this.I && !isLayoutRequested();
        n0 n0Var = this.y;
        if (n0Var != null) {
            n0Var.getClass();
        }
        this.A0 = false;
        ThreadLocal threadLocal = p.e;
        p pVar = (p) threadLocal.get();
        this.s0 = pVar;
        if (pVar == null) {
            p pVar2 = new p();
            pVar2.a = new ArrayList();
            pVar2.d = new ArrayList();
            this.s0 = pVar2;
            WeakHashMap weakHashMap = h0.a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f7 = display.getRefreshRate();
            }
            f7 = 60.0f;
            p pVar3 = this.s0;
            pVar3.c = (long) (1.0E9f / f7);
            threadLocal.set(pVar3);
        }
        this.s0.a.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l0 l0Var = this.c0;
        if (l0Var != null) {
            l0Var.g();
        }
        C0();
        this.G = false;
        this.K0.clear();
        removeCallbacks(this.L0);
        this.f.getClass();
        while (j1.d.b() != null) {
        }
        p pVar = this.s0;
        if (pVar != null) {
            pVar.a.remove(this);
            this.s0 = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((m0) arrayList.get(i10)).e(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f7;
        float f10;
        if (this.y != null && !this.L && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f7 = this.y.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.y.d()) {
                    f10 = motionEvent.getAxisValue(10);
                    if (f7 == 0.0f || f10 != 0.0f) {
                        t0((int) (f10 * this.o0), (int) (f7 * this.p0), motionEvent);
                    }
                }
                f10 = 0.0f;
                if (f7 == 0.0f) {
                }
                t0((int) (f10 * this.o0), (int) (f7 * this.p0), motionEvent);
            } else {
                if ((motionEvent.getSource() & TLObject.FLAG_22) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.y.e()) {
                        f7 = -axisValue;
                        f10 = 0.0f;
                        if (f7 == 0.0f) {
                        }
                        t0((int) (f10 * this.o0), (int) (f7 * this.p0), motionEvent);
                    } else if (this.y.d()) {
                        f10 = axisValue;
                        f7 = 0.0f;
                        if (f7 == 0.0f) {
                        }
                        t0((int) (f10 * this.o0), (int) (f7 * this.p0), motionEvent);
                    }
                }
                f7 = 0.0f;
                f10 = 0.0f;
                if (f7 == 0.0f) {
                }
                t0((int) (f10 * this.o0), (int) (f7 * this.p0), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (!this.L) {
            this.F = null;
            if (H(motionEvent)) {
                s0();
                setScrollState(0);
                return true;
            }
            n0 n0Var = this.y;
            if (n0Var != null) {
                boolean d = n0Var.d();
                boolean e = this.y.e();
                if (this.f0 == null) {
                    this.f0 = VelocityTracker.obtain();
                }
                this.f0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.M) {
                        this.M = false;
                    }
                    this.e0 = motionEvent.getPointerId(0);
                    int x10 = (int) (motionEvent.getX() + 0.5f);
                    this.i0 = x10;
                    this.g0 = x10;
                    int y3 = (int) (motionEvent.getY() + 0.5f);
                    this.j0 = y3;
                    this.h0 = y3;
                    if (this.d0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        B0(1);
                    }
                    int[] iArr = this.F0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i10 = d;
                    if (e) {
                        i10 = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i10, 0);
                } else if (actionMasked == 1) {
                    this.f0.clear();
                    B0(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.e0);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.e0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y10 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.d0 != 1) {
                        int i11 = x11 - this.g0;
                        int i12 = y10 - this.h0;
                        if (d == 0 || Math.abs(i11) <= this.k0) {
                            z10 = false;
                        } else {
                            this.i0 = x11;
                            z10 = true;
                        }
                        if (e && Math.abs(i12) > this.k0) {
                            this.j0 = y10;
                            z10 = true;
                        }
                        if (z10) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    s0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.e0 = motionEvent.getPointerId(actionIndex);
                    int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.i0 = x12;
                    this.g0 = x12;
                    int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.j0 = y11;
                    this.h0 = y11;
                } else if (actionMasked == 6) {
                    j0(motionEvent);
                }
                if (this.d0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = n0.g.a;
        Trace.beginSection("RV OnLayout");
        s();
        Trace.endSection();
        this.I = true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.y == null) {
            q(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        n0 n0Var = this.y;
        e eVar = this.b;
        z0 z0Var = this.u0;
        n0Var.d0(eVar, z0Var, i10, i11);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.x == null) {
            return;
        }
        if (z0Var.d == 1) {
            t();
        }
        this.y.q0(i10, i11);
        z0Var.i = true;
        u();
        this.y.s0(i10, i11);
        a0 a0Var = (a0) this.y;
        if (a0Var.l == 1073741824 || a0Var.k == 1073741824) {
            return;
        }
        int r10 = a0Var.r();
        for (int i12 = 0; i12 < r10; i12++) {
            ViewGroup.LayoutParams layoutParams = a0Var.q(i12).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                this.y.q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                z0Var.i = true;
                u();
                this.y.s0(i10, i11);
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (c0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof w0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        w0 w0Var = (w0) parcelable;
        this.c = w0Var;
        super.onRestoreInstanceState(w0Var.a);
        n0 n0Var = this.y;
        if (n0Var == null || (parcelable2 = this.c.c) == null) {
            return;
        }
        a0 a0Var = (a0) n0Var;
        if (parcelable2 instanceof z) {
            a0Var.B = (z) parcelable2;
            a0Var.l0();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        w0 w0Var = new w0(super.onSaveInstanceState());
        w0 w0Var2 = this.c;
        if (w0Var2 != null) {
            w0Var.c = w0Var2.c;
            return w0Var;
        }
        n0 n0Var = this.y;
        if (n0Var != null) {
            w0Var.c = n0Var.e0();
            return w0Var;
        }
        w0Var.c = null;
        return w0Var;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        this.b0 = null;
        this.W = null;
        this.a0 = null;
        this.V = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0138  */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        if (!this.L && !this.M) {
            r0 r0Var = this.F;
            if (r0Var == null) {
                z10 = motionEvent.getAction() == 0 ? false : H(motionEvent);
            } else {
                r0Var.a(this, motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.F = null;
                }
                z10 = true;
            }
            if (z10) {
                s0();
                setScrollState(0);
                return true;
            }
            n0 n0Var = this.y;
            if (n0Var != null) {
                boolean d = n0Var.d();
                boolean e = this.y.e();
                if (this.f0 == null) {
                    this.f0 = VelocityTracker.obtain();
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.F0;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                obtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked == 0) {
                    this.e0 = motionEvent.getPointerId(0);
                    int x10 = (int) (motionEvent.getX() + 0.5f);
                    this.i0 = x10;
                    this.g0 = x10;
                    int y3 = (int) (motionEvent.getY() + 0.5f);
                    this.j0 = y3;
                    this.h0 = y3;
                    int i10 = d;
                    if (e) {
                        i10 = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i10, 0);
                } else {
                    if (actionMasked == 1) {
                        this.f0.addMovement(obtain);
                        VelocityTracker velocityTracker = this.f0;
                        int i11 = this.n0;
                        velocityTracker.computeCurrentVelocity(1000, i11);
                        float f7 = d != 0 ? -this.f0.getXVelocity(this.e0) : 0.0f;
                        float f10 = e ? -this.f0.getYVelocity(this.e0) : 0.0f;
                        if (f7 != 0.0f || f10 != 0.0f) {
                            int i12 = (int) f7;
                            int i13 = (int) f10;
                            n0 n0Var2 = this.y;
                            if (n0Var2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.L) {
                                int d10 = n0Var2.d();
                                boolean e7 = this.y.e();
                                int i14 = this.m0;
                                if (d10 == 0 || Math.abs(i12) < i14) {
                                    i12 = 0;
                                }
                                if (!e7 || Math.abs(i13) < i14) {
                                    i13 = 0;
                                }
                                if (i12 != 0 || i13 != 0) {
                                    float f11 = i12;
                                    float f12 = i13;
                                    if (!dispatchNestedPreFling(f11, f12)) {
                                        boolean z12 = d10 != 0 || e7;
                                        dispatchNestedFling(f11, f12, z12);
                                        q0 q0Var = this.l0;
                                        if (q0Var == null || !q0Var.a(i12, i13)) {
                                            if (z12) {
                                                if (e7) {
                                                    d10 = (d10 == true ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().g(d10, 1);
                                                int i15 = -i11;
                                                int max = Math.max(i15, Math.min(i12, i11));
                                                int max2 = Math.max(i15, Math.min(i13, i11));
                                                b1 b1Var = this.r0;
                                                RecyclerView recyclerView = b1Var.h;
                                                recyclerView.setScrollState(2);
                                                b1Var.b = 0;
                                                b1Var.a = 0;
                                                Interpolator interpolator = b1Var.d;
                                                p2 p2Var = R0;
                                                if (interpolator != p2Var) {
                                                    b1Var.d = p2Var;
                                                    b1Var.c = new OverScroller(recyclerView.getContext(), p2Var);
                                                }
                                                b1Var.c.fling(0, 0, max, max2, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                b1Var.a();
                                            }
                                        }
                                        s0();
                                        obtain.recycle();
                                        return true;
                                    }
                                }
                            }
                        }
                        setScrollState(0);
                        s0();
                        obtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.e0);
                        if (findPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.e0 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y10 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i16 = this.i0 - x11;
                        int i17 = this.j0 - y10;
                        int[] iArr2 = this.J0;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        boolean v = v(i16, i17, 0, iArr2, this.E0);
                        int[] iArr3 = this.E0;
                        if (v) {
                            i16 -= iArr2[0];
                            i17 -= iArr2[1];
                            obtain.offsetLocation(iArr3[0], iArr3[1]);
                            iArr[0] = iArr[0] + iArr3[0];
                            iArr[1] = iArr[1] + iArr3[1];
                        }
                        if (this.d0 != 1) {
                            if (d != 0) {
                                int abs = Math.abs(i16);
                                int i18 = this.k0;
                                if (abs > i18) {
                                    i16 = i16 > 0 ? i16 - i18 : i16 + i18;
                                    z11 = true;
                                    if (e) {
                                        int abs2 = Math.abs(i17);
                                        int i19 = this.k0;
                                        if (abs2 > i19) {
                                            i17 = i17 > 0 ? i17 - i19 : i17 + i19;
                                            z11 = true;
                                        }
                                    }
                                    if (z11) {
                                        setScrollState(1);
                                    }
                                }
                            }
                            z11 = false;
                            if (e) {
                            }
                            if (z11) {
                            }
                        }
                        if (this.d0 == 1) {
                            this.i0 = x11 - iArr3[0];
                            this.j0 = y10 - iArr3[1];
                            if (t0(d != 0 ? i16 : 0, e ? i17 : 0, obtain)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            p pVar = this.s0;
                            if (pVar != null && (i16 != 0 || i17 != 0)) {
                                pVar.a(this, i16, i17);
                            }
                        }
                    } else if (actionMasked == 3) {
                        s0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.e0 = motionEvent.getPointerId(actionIndex);
                        int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.i0 = x12;
                        this.g0 = x12;
                        int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.j0 = y11;
                        this.h0 = y11;
                    } else if (actionMasked == 6) {
                        j0(motionEvent);
                    }
                }
                this.f0.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        if (!this.I || this.Q) {
            int i10 = n0.g.a;
            Trace.beginSection("RV FullInvalidate");
            s();
            Trace.endSection();
            return;
        }
        s0 s0Var = this.d;
        if (s0Var.h()) {
            int i11 = s0Var.b;
            if ((i11 & 4) == 0 || (i11 & 11) != 0) {
                if (s0Var.h()) {
                    int i12 = n0.g.a;
                    Trace.beginSection("RV FullInvalidate");
                    s();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i13 = n0.g.a;
            Trace.beginSection("RV PartialInvalidate");
            z0();
            h0();
            s0Var.l();
            if (!this.K) {
                d dVar = this.e;
                int m10 = dVar.m();
                int i14 = 0;
                while (true) {
                    if (i14 < m10) {
                        c1 U = U(dVar.l(i14));
                        if (U != null && !U.r() && U.m()) {
                            s();
                            break;
                        }
                        i14++;
                    } else {
                        s0Var.c();
                        break;
                    }
                }
            }
            A0(true);
            i0(true);
            Trace.endSection();
        }
    }

    public final void p0() {
        l0 l0Var = this.c0;
        if (l0Var != null) {
            l0Var.g();
        }
        n0 n0Var = this.y;
        e eVar = this.b;
        if (n0Var != null) {
            n0Var.g0(eVar);
            this.y.h0(eVar);
        }
        ((ArrayList) eVar.c).clear();
        eVar.e();
    }

    public final void q(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = h0.a;
        setMeasuredDimension(n0.g(i10, paddingRight, getMinimumWidth()), n0.g(i11, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void q0(m0 m0Var) {
        n0 n0Var = this.y;
        if (n0Var != null) {
            n0Var.b("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.D;
        arrayList.remove(m0Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        e0();
        requestLayout();
    }

    public final void r(View view) {
        c1 U = U(view);
        g0 g0Var = this.x;
        if (g0Var != null && U != null) {
            g0Var.z(U);
        }
        ArrayList arrayList = this.P;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((p0) this.P.get(size)).a(view);
            }
        }
    }

    public void r0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.r;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof o0) {
            o0 o0Var = (o0) layoutParams;
            if (!o0Var.c) {
                Rect rect2 = o0Var.b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.y.k0(this, view, this.r, !this.I, view2 == null);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        c1 U = U(view);
        if (U != null) {
            if (U.l()) {
                U.l &= -257;
            } else if (!U.r()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + U + C());
            }
        }
        view.clearAnimation();
        r(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        y0 y0Var = this.y.e;
        if ((y0Var == null || !y0Var.e) && !c0() && view2 != null) {
            r0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.y.k0(this, view, rect, z10, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((r0) arrayList.get(i10)).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.J != 0 || this.L) {
            this.K = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0369, code lost:
    
        if (((java.util.ArrayList) r19.e.d).contains(getFocusedChild()) == false) goto L236;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0416  */
    /* JADX WARN: Type inference failed for: r11v13, types: [int] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        j1 j1Var;
        boolean z10;
        ?? r11;
        boolean r10;
        int i10;
        int i11;
        int i12;
        int i13;
        c1 c1Var;
        View findViewById;
        boolean z11;
        if (this.x == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.y == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        z0 z0Var = this.u0;
        boolean z12 = false;
        z0Var.i = false;
        boolean z13 = true;
        if (z0Var.d == 1) {
            t();
            this.y.p0(this);
            u();
        } else {
            s0 s0Var = this.d;
            if ((((ArrayList) s0Var.e).isEmpty() || ((ArrayList) s0Var.d).isEmpty()) && this.y.m == getWidth() && this.y.n == getHeight()) {
                this.y.p0(this);
            } else {
                this.y.p0(this);
                u();
            }
        }
        z0Var.a(4);
        z0();
        h0();
        z0Var.d = 1;
        boolean z14 = z0Var.j;
        e eVar = this.b;
        c cVar = this.f;
        if (z14) {
            try {
                for (int m10 = this.e.m() - 1; m10 >= 0; m10--) {
                    c1 U = U(this.e.l(m10));
                    if (U != null && !U.r()) {
                        long Q = Q(U);
                        this.c0.getClass();
                        ac.g gVar = new ac.g();
                        View view = U.a;
                        gVar.a = view.getLeft();
                        gVar.b = view.getTop();
                        view.getRight();
                        view.getBottom();
                        h hVar = (h) cVar.c;
                        a0.f fVar = (a0.f) cVar.b;
                        c1 c1Var2 = (c1) hVar.f(Q);
                        if (c1Var2 == null || c1Var2.r()) {
                            cVar.y(U, gVar);
                        } else {
                            j1 j1Var2 = (j1) fVar.get(c1Var2);
                            ?? r15 = (j1Var2 == null || (j1Var2.a & 1) == 0) ? false : true;
                            j1 j1Var3 = (j1) fVar.get(U);
                            ?? r14 = (j1Var3 == null || (j1Var3.a & 1) == 0) ? false : true;
                            if (r15 == true && c1Var2 == U) {
                                cVar.y(U, gVar);
                            } else {
                                ac.g b02 = cVar.b0(c1Var2, 4);
                                cVar.y(U, gVar);
                                ac.g b03 = cVar.b0(U, 8);
                                if (b02 == null) {
                                    Y(Q, U, c1Var2);
                                } else {
                                    c1Var2.q(false);
                                    if (r15 != false) {
                                        h(c1Var2);
                                    }
                                    if (c1Var2 != U) {
                                        if (r14 != false) {
                                            h(U);
                                        }
                                        c1Var2.j = U;
                                        h(c1Var2);
                                        eVar.k(c1Var2);
                                        U.q(false);
                                        U.k = c1Var2;
                                    }
                                    f1 f1Var = (f1) this.c0;
                                    f1Var.getClass();
                                    int i14 = b02.a;
                                    int i15 = b02.b;
                                    if (U.r()) {
                                        i12 = b02.a;
                                        i13 = b02.b;
                                    } else {
                                        i12 = b03.a;
                                        i13 = b03.b;
                                    }
                                    if (f1Var.q(c1Var2, U, b02, i14, i15, i12, i13)) {
                                        m0();
                                    }
                                }
                            }
                        }
                    }
                }
                a0.f fVar2 = (a0.f) cVar.b;
                int i16 = fVar2.c - 1;
                while (i16 >= 0) {
                    c1 c1Var3 = (c1) fVar2.e(i16);
                    try {
                        j1Var = (j1) fVar2.f(i16);
                    } catch (Exception e) {
                        f8.g(e, z13);
                        j1Var = null;
                    }
                    if (j1Var == null) {
                        z10 = z13;
                    } else {
                        int i17 = j1Var.a;
                        int i18 = i17 & 3;
                        f0 f0Var = this.M0;
                        if (i18 == 3) {
                            f0Var.b(c1Var3);
                        } else if ((i17 & 1) != 0) {
                            ac.g gVar2 = j1Var.b;
                            if (gVar2 == null) {
                                f0Var.b(c1Var3);
                            } else {
                                f0Var.a(c1Var3, gVar2, j1Var.c);
                            }
                        } else if ((i17 & 14) == 14) {
                            ac.g gVar3 = j1Var.b;
                            ac.g gVar4 = j1Var.c;
                            RecyclerView recyclerView = f0Var.a;
                            c1Var3.q(z12);
                            if (recyclerView.c0.a(c1Var3, gVar3, gVar4)) {
                                recyclerView.m0();
                            }
                        } else {
                            if ((i17 & 12) == 12) {
                                ac.g gVar5 = j1Var.b;
                                ac.g gVar6 = j1Var.c;
                                f0Var.getClass();
                                c1Var3.q(z12);
                                RecyclerView recyclerView2 = f0Var.a;
                                if (recyclerView2.Q) {
                                    f1 f1Var2 = (f1) recyclerView2.c0;
                                    f1Var2.getClass();
                                    int i19 = gVar5.a;
                                    int i20 = gVar5.b;
                                    if (c1Var3.r()) {
                                        i11 = gVar5.a;
                                        z10 = z13;
                                        i10 = gVar5.b;
                                    } else {
                                        z10 = z13;
                                        int i21 = gVar6.a;
                                        i10 = gVar6.b;
                                        i11 = i21;
                                    }
                                    if (f1Var2.q(c1Var3, c1Var3, gVar5, i19, i20, i11, i10)) {
                                        recyclerView2.m0();
                                    }
                                } else {
                                    z10 = z13;
                                    f1 f1Var3 = (f1) recyclerView2.c0;
                                    f1Var3.getClass();
                                    int i22 = gVar5.a;
                                    int i23 = gVar6.a;
                                    if (i22 == i23 && gVar5.b == gVar6.b) {
                                        f1Var3.v(c1Var3);
                                        r10 = false;
                                    } else {
                                        r10 = f1Var3.r(c1Var3, gVar5, i22, gVar5.b, i23, gVar6.b);
                                    }
                                    if (r10) {
                                        recyclerView2.m0();
                                    }
                                }
                            } else {
                                z10 = z13;
                                if ((i17 & 4) != 0) {
                                    f0Var.a(c1Var3, j1Var.b, null);
                                } else if ((i17 & 8) != 0) {
                                    ac.g gVar7 = j1Var.b;
                                    ac.g gVar8 = j1Var.c;
                                    RecyclerView recyclerView3 = f0Var.a;
                                    r11 = 0;
                                    r11 = 0;
                                    c1Var3.q(false);
                                    if (recyclerView3.c0.a(c1Var3, gVar7, gVar8)) {
                                        recyclerView3.m0();
                                    }
                                    j1Var.a = r11;
                                    j1Var.b = null;
                                    j1Var.c = null;
                                    j1.d.r(j1Var);
                                }
                            }
                            r11 = 0;
                            j1Var.a = r11;
                            j1Var.b = null;
                            j1Var.c = null;
                            j1.d.r(j1Var);
                        }
                        r11 = z12;
                        z10 = z13;
                        j1Var.a = r11;
                        j1Var.b = null;
                        j1Var.c = null;
                        j1.d.r(j1Var);
                    }
                    i16--;
                    z13 = z10;
                    z12 = false;
                }
            } catch (Exception e7) {
                StringBuilder sb2 = new StringBuilder();
                for (int m11 = this.e.m() - 1; m11 >= 0; m11--) {
                    c1 U2 = U(this.e.l(m11));
                    if (U2 != null && !U2.r()) {
                        sb2.append("Holder at" + m11 + " " + U2 + "\n");
                    }
                }
                throw new RuntimeException(sb2.toString(), e7);
            }
        }
        boolean z15 = z13;
        View view2 = null;
        this.y.h0(eVar);
        z0Var.b = z0Var.e;
        this.Q = false;
        this.R = false;
        z0Var.j = false;
        z0Var.k = false;
        this.y.f = false;
        ArrayList arrayList = (ArrayList) eVar.d;
        if (arrayList != null) {
            arrayList.clear();
        }
        n0 n0Var = this.y;
        if (n0Var.j) {
            n0Var.i = 0;
            n0Var.j = false;
            eVar.l();
        }
        this.y.c0(z0Var);
        i0(z15);
        A0(false);
        ((a0.f) cVar.b).clear();
        ((h) cVar.c).b();
        int[] iArr = this.C0;
        int i24 = iArr[0];
        int i25 = iArr[z15 ? 1 : 0];
        I(iArr);
        if ((iArr[0] == i24 && iArr[z15 ? 1 : 0] == i25) ? false : true) {
            x(0, 0);
        }
        if (this.q0 && this.x != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j10 = z0Var.m;
            if (j10 != -1 && (z11 = this.x.b) && z11) {
                int r12 = this.e.r();
                c1Var = null;
                int i26 = 0;
                while (true) {
                    if (i26 >= r12) {
                        break;
                    }
                    c1 U3 = U(this.e.q(i26));
                    if (U3 != null && !U3.j() && U3.e == j10) {
                        if (!((ArrayList) this.e.d).contains(U3.a)) {
                            c1Var = U3;
                            break;
                        }
                        c1Var = U3;
                    }
                    i26++;
                }
            } else {
                c1Var = null;
            }
            if (c1Var != null) {
                View view3 = c1Var.a;
                if (!((ArrayList) this.e.d).contains(view3) && view3.hasFocusable()) {
                    view2 = view3;
                    if (view2 != null) {
                        int i27 = z0Var.n;
                        if (i27 != -1 && (findViewById = view2.findViewById(i27)) != null && findViewById.isFocusable()) {
                            view2 = findViewById;
                        }
                        view2.requestFocus();
                    }
                }
            }
            if (this.e.m() > 0) {
                int i28 = z0Var.l;
                if (i28 == -1) {
                    i28 = 0;
                }
                int b10 = z0Var.b();
                for (int i29 = i28; i29 < b10; i29++) {
                    c1 K = K(i29);
                    if (K == null) {
                        break;
                    }
                    View view4 = K.a;
                    if (view4.hasFocusable()) {
                        view2 = view4;
                        break;
                    }
                }
                int min = Math.min(b10, i28) - 1;
                while (true) {
                    if (min < 0) {
                        break;
                    }
                    c1 K2 = K(min);
                    if (K2 == null) {
                        break;
                    }
                    View view5 = K2.a;
                    if (view5.hasFocusable()) {
                        view2 = view5;
                        break;
                    }
                    min--;
                }
            }
            if (view2 != null) {
            }
        }
        z0Var.m = -1L;
        z0Var.l = -1;
        z0Var.n = -1;
    }

    public final void s0() {
        VelocityTracker velocityTracker = this.f0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z10 = false;
        B0(0);
        EdgeEffect edgeEffect = this.V;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.V.isFinished();
        }
        EdgeEffect edgeEffect2 = this.W;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.W.isFinished();
        }
        EdgeEffect edgeEffect3 = this.a0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.a0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.b0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.b0.isFinished();
        }
        if (z10) {
            WeakHashMap weakHashMap = h0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        n0 n0Var = this.y;
        if (n0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.L) {
            return;
        }
        boolean d = n0Var.d();
        boolean e = this.y.e();
        if (d || e) {
            if (!d) {
                i10 = 0;
            }
            if (!e) {
                i11 = 0;
            }
            t0(i10, i11, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!c0()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.N |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(e1 e1Var) {
        this.B0 = e1Var;
        h0.j(this, e1Var);
    }

    public void setAdapter(g0 g0Var) {
        setLayoutFrozen(false);
        g0 g0Var2 = this.x;
        xj0 xj0Var = this.a;
        if (g0Var2 != null) {
            g0Var2.a.unregisterObserver(xj0Var);
            this.x.getClass();
        }
        p0();
        s0 s0Var = this.d;
        s0Var.m((ArrayList) s0Var.d);
        s0Var.m((ArrayList) s0Var.e);
        s0Var.b = 0;
        g0 g0Var3 = this.x;
        this.x = g0Var;
        if (g0Var != null) {
            g0Var.B(xj0Var);
        }
        n0 n0Var = this.y;
        if (n0Var != null) {
            n0Var.Q();
        }
        this.b.d(g0Var3, this.x);
        this.u0.f = true;
        n0(false);
        requestLayout();
    }

    public void setAdditionalDebugInfo(String str) {
        this.N0 = str;
    }

    public void setBottomGlowOffset(int i10) {
        this.H0 = i10;
    }

    public void setChildDrawingOrderCallback(j0 j0Var) {
        if (j0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(j0Var != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.h) {
            this.b0 = null;
            this.W = null;
            this.a0 = null;
            this.V = null;
        }
        this.h = z10;
        super.setClipToPadding(z10);
        if (this.I) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k0 k0Var) {
        k0Var.getClass();
        this.U = k0Var;
        this.b0 = null;
        this.W = null;
        this.a0 = null;
        this.V = null;
    }

    public void setGlowColor(int i10) {
        this.I0 = Integer.valueOf(i10);
    }

    public void setHasFixedSize(boolean z10) {
        this.H = z10;
    }

    public void setItemAnimator(l0 l0Var) {
        l0 l0Var2 = this.c0;
        if (l0Var2 != null) {
            l0Var2.g();
            this.c0.a = null;
        }
        this.c0 = l0Var;
        if (l0Var != null) {
            l0Var.a = this.z0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        e eVar = this.b;
        eVar.a = i10;
        eVar.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(n0 n0Var) {
        if (n0Var == this.y) {
            return;
        }
        C0();
        n0 n0Var2 = this.y;
        e eVar = this.b;
        if (n0Var2 != null) {
            l0 l0Var = this.c0;
            if (l0Var != null) {
                l0Var.g();
            }
            this.y.g0(eVar);
            this.y.h0(eVar);
            ((ArrayList) eVar.c).clear();
            eVar.e();
            if (this.G) {
                this.y.getClass();
            }
            this.y.t0(null);
            this.y = null;
        } else {
            ((ArrayList) eVar.c).clear();
            eVar.e();
        }
        this.e.w();
        this.y = n0Var;
        if (n0Var != null) {
            if (n0Var.b != null) {
                throw new IllegalArgumentException("LayoutManager " + n0Var + " is already attached to a RecyclerView:" + n0Var.b.C());
            }
            n0Var.t0(this);
            if (this.G) {
                this.y.getClass();
            }
        }
        eVar.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        j scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = h0.a;
            r0.z.j(viewGroup);
        }
        scrollingChildHelper.d = z10;
    }

    public void setOnFlingListener(q0 q0Var) {
        this.l0 = q0Var;
    }

    @Deprecated
    public void setOnScrollListener(s4.s0 s0Var) {
        this.v0 = s0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.q0 = z10;
    }

    public void setRecycledViewPool(u0 u0Var) {
        e eVar = this.b;
        if (((u0) eVar.g) != null) {
            r1.b--;
        }
        eVar.g = u0Var;
        if (u0Var == null || ((RecyclerView) eVar.h).getAdapter() == null) {
            return;
        }
        ((u0) eVar.g).b++;
    }

    public void setScrollState(int i10) {
        y0 y0Var;
        if (i10 == this.d0) {
            return;
        }
        this.d0 = i10;
        if (i10 != 2) {
            b1 b1Var = this.r0;
            RecyclerView recyclerView = b1Var.h;
            if (recyclerView.O0) {
                recyclerView.removeCallbacks(b1Var);
                b1Var.c.abortAnimation();
            }
            n0 n0Var = this.y;
            if (n0Var != null && (y0Var = n0Var.e) != null) {
                y0Var.h();
            }
        }
        n0 n0Var2 = this.y;
        if (n0Var2 != null) {
            n0Var2.f0();
        }
        k0(i10);
        s4.s0 s0Var = this.v0;
        if (s0Var != null) {
            s0Var.a(this, i10);
        }
        ArrayList arrayList = this.w0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((s4.s0) this.w0.get(size)).a(this, i10);
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.k0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.k0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setTopGlowOffset(int i10) {
        this.G0 = i10;
    }

    public void setViewCacheExtension(a1 a1Var) {
        this.b.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.L) {
            l("Do not suppressLayout in layout or scroll");
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.L = true;
                this.M = true;
                C0();
                return;
            }
            this.L = false;
            if (this.K && this.y != null && this.x != null) {
                requestLayout();
            }
            this.K = false;
        }
    }

    public final void t() {
        j1 j1Var;
        View F;
        boolean z10;
        z0 z0Var = this.u0;
        z0Var.a(1);
        D(z0Var);
        z0Var.i = false;
        z0();
        c cVar = this.f;
        a0.f fVar = (a0.f) cVar.b;
        a0.f fVar2 = (a0.f) cVar.b;
        fVar.clear();
        h hVar = (h) cVar.c;
        hVar.b();
        h0();
        if (this.Q) {
            s0 s0Var = this.d;
            s0Var.m((ArrayList) s0Var.d);
            s0Var.m((ArrayList) s0Var.e);
            s0Var.b = 0;
            if (this.R) {
                this.y.W(this);
            }
        }
        if (this.c0 == null || !this.y.y0()) {
            this.d.d();
        } else {
            this.d.l();
        }
        boolean z11 = this.x0 || this.y0;
        boolean z12 = this.I && this.c0 != null && ((z10 = this.Q) || z11 || this.y.f) && (!z10 || this.x.b);
        z0Var.j = z12;
        z0Var.k = z12 && z11 && !this.Q && this.c0 != null && this.y.y0();
        c1 c1Var = null;
        View focusedChild = (this.q0 && hasFocus() && this.x != null) ? getFocusedChild() : null;
        if (focusedChild != null && (F = F(focusedChild)) != null) {
            c1Var = T(F);
        }
        if (c1Var == null) {
            z0Var.m = -1L;
            z0Var.l = -1;
            z0Var.n = -1;
        } else {
            z0Var.m = this.x.b ? c1Var.e : -1L;
            z0Var.l = this.Q ? -1 : c1Var.j() ? c1Var.d : c1Var.b();
            View view = c1Var.a;
            int id2 = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id2 = view.getId();
                }
            }
            z0Var.n = id2;
        }
        z0Var.h = z0Var.j && this.y0;
        this.y0 = false;
        this.x0 = false;
        z0Var.g = z0Var.k;
        z0Var.e = this.x.b();
        I(this.C0);
        if (z0Var.j) {
            int m10 = this.e.m();
            for (int i10 = 0; i10 < m10; i10++) {
                c1 U = U(this.e.l(i10));
                if (!U.r() && (!U.h() || this.x.b)) {
                    ac.g l4 = this.c0.l(z0Var, U, l0.b(U), U.d());
                    j1 j1Var2 = (j1) fVar2.get(U);
                    if (j1Var2 == null) {
                        j1Var2 = j1.a();
                        fVar2.put(U, j1Var2);
                    }
                    j1Var2.b = l4;
                    j1Var2.a |= 4;
                    if (z0Var.h && U.m() && !U.j() && !U.r() && !U.h()) {
                        hVar.k(U, Q(U));
                    }
                }
            }
        }
        if (z0Var.k) {
            int r10 = this.e.r();
            for (int i11 = 0; i11 < r10; i11++) {
                c1 U2 = U(this.e.q(i11));
                if (!U2.r()) {
                    if (U2.d == -1) {
                        U2.d = U2.c;
                    }
                    U2.h = U2.c;
                }
            }
            boolean z13 = z0Var.f;
            z0Var.f = false;
            this.y.b0(this.b, z0Var);
            z0Var.f = z13;
            for (int i12 = 0; i12 < this.e.m(); i12++) {
                c1 U3 = U(this.e.l(i12));
                if (!U3.r() && ((j1Var = (j1) fVar2.get(U3)) == null || (j1Var.a & 4) == 0)) {
                    int b10 = l0.b(U3);
                    boolean e = U3.e(TLObject.FLAG_13);
                    if (!e) {
                        b10 |= TLObject.FLAG_12;
                    }
                    ac.g l10 = this.c0.l(z0Var, U3, b10, U3.d());
                    if (e) {
                        o0(U3, l10);
                    } else {
                        j1 j1Var3 = (j1) fVar2.get(U3);
                        if (j1Var3 == null) {
                            j1Var3 = j1.a();
                            fVar2.put(U3, j1Var3);
                        }
                        j1Var3.a |= 2;
                        j1Var3.b = l10;
                    }
                }
            }
            n();
        } else {
            n();
        }
        i0(true);
        A0(false);
        z0Var.d = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t0(int i10, int i11, MotionEvent motionEvent) {
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        p();
        g0 g0Var = this.x;
        int[] iArr = this.J0;
        if (g0Var != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            u0(i10, i11, iArr);
            i12 = iArr[0];
            i13 = iArr[1];
            i14 = i10 - i12;
            i15 = i11 - i13;
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        if (!this.D.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        w(i12, i13, i14, i15, this.E0, 0, iArr);
        int i16 = i14 - iArr[0];
        int i17 = i15 - iArr[1];
        int i18 = this.i0;
        int[] iArr2 = this.E0;
        int i19 = iArr2[0];
        this.i0 = i18 - i19;
        int i20 = this.j0;
        int i21 = iArr2[1];
        this.j0 = i20 - i21;
        if (motionEvent != null) {
            motionEvent.offsetLocation(i19, i21);
        }
        int[] iArr3 = this.F0;
        iArr3[0] = iArr3[0] + iArr2[0];
        iArr3[1] = iArr3[1] + iArr2[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x10 = motionEvent.getX();
                float f7 = i16;
                float y3 = motionEvent.getY();
                float f10 = i17;
                Integer num = this.I0;
                if (num == null || num.intValue() != 0) {
                    if (f7 < 0.0f) {
                        z();
                        u0.c.a(this.V, (-f7) / getWidth(), 1.0f - (y3 / getHeight()));
                    } else if (f7 > 0.0f) {
                        A();
                        u0.c.a(this.a0, f7 / getWidth(), y3 / getHeight());
                    } else {
                        z10 = false;
                        if (f10 >= 0.0f) {
                            B();
                            u0.c.a(this.W, (-f10) / getHeight(), x10 / getWidth());
                        } else {
                            if (f10 > 0.0f) {
                                y();
                                u0.c.a(this.b0, f10 / getHeight(), 1.0f - (x10 / getWidth()));
                            }
                            if (!z10 || f7 != 0.0f || f10 != 0.0f) {
                                WeakHashMap weakHashMap = h0.a;
                                postInvalidateOnAnimation();
                            }
                        }
                        z10 = true;
                        if (!z10) {
                        }
                        WeakHashMap weakHashMap2 = h0.a;
                        postInvalidateOnAnimation();
                    }
                    z10 = true;
                    if (f10 >= 0.0f) {
                    }
                    z10 = true;
                    if (!z10) {
                    }
                    WeakHashMap weakHashMap22 = h0.a;
                    postInvalidateOnAnimation();
                }
            }
            o(i10, i11);
        }
        if (i12 != 0 || i13 != 0) {
            x(i12, i13);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i12 == 0 && i13 == 0) ? false : true;
    }

    public final void u() {
        z0();
        h0();
        z0 z0Var = this.u0;
        z0Var.a(6);
        this.d.d();
        z0Var.e = this.x.b();
        z0Var.c = 0;
        z0Var.g = false;
        this.y.b0(this.b, z0Var);
        z0Var.f = false;
        this.c = null;
        z0Var.j = z0Var.j && this.c0 != null;
        z0Var.d = 4;
        i0(true);
        A0(false);
    }

    public final void u0(int i10, int i11, int[] iArr) {
        c1 c1Var;
        z0();
        h0();
        int i12 = n0.g.a;
        Trace.beginSection("RV Scroll");
        z0 z0Var = this.u0;
        D(z0Var);
        e eVar = this.b;
        int m0 = i10 != 0 ? this.y.m0(i10, eVar, z0Var) : 0;
        int o02 = i11 != 0 ? this.y.o0(i11, eVar, z0Var) : 0;
        Trace.endSection();
        d dVar = this.e;
        int m10 = dVar.m();
        for (int i13 = 0; i13 < m10; i13++) {
            View l4 = dVar.l(i13);
            c1 T = T(l4);
            if (T != null && (c1Var = T.k) != null) {
                View view = c1Var.a;
                int left = l4.getLeft();
                int top = l4.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        i0(true);
        A0(false);
        if (iArr != null) {
            iArr[0] = m0;
            iArr[1] = o02;
        }
    }

    public boolean v(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, i12, iArr, iArr2);
    }

    public final void v0(int i10) {
        if (this.L) {
            return;
        }
        C0();
        n0 n0Var = this.y;
        if (n0Var == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            n0Var.n0(i10);
            awakenScrollBars();
        }
    }

    public final void w(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().d(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public final void w0(int i10, int i11, Interpolator interpolator) {
        n0 n0Var = this.y;
        if (n0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.L) {
            return;
        }
        if (!n0Var.d()) {
            i10 = 0;
        }
        if (!this.y.e()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.r0.b(i10, i11, TLObject.FLAG_31, interpolator);
    }

    public final void x(int i10, int i11) {
        this.T++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        l0(i11);
        s4.s0 s0Var = this.v0;
        if (s0Var != null) {
            s0Var.b(this, i10, i11);
        }
        ArrayList arrayList = this.w0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((s4.s0) this.w0.get(size)).b(this, i10, i11);
            }
        }
        this.T--;
    }

    public final void x0(int i10, int i11, Interpolator interpolator) {
        if (this.y == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.L) {
            return;
        }
        if (!this.y.e()) {
            i10 = 0;
        }
        if (i10 != 0) {
            this.r0.b(0, i10, i11, interpolator);
        }
    }

    public final void y() {
        if (this.b0 != null) {
            return;
        }
        EdgeEffect a2 = this.U.a(this, 3);
        this.b0 = a2;
        if (this.h) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
        k(this.b0);
    }

    public final void y0(int i10) {
        if (this.L) {
            return;
        }
        n0 n0Var = this.y;
        if (n0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            n0Var.v0(this, this.u0, i10);
        }
    }

    public final void z() {
        if (this.V != null) {
            return;
        }
        EdgeEffect a2 = this.U.a(this, 0);
        this.V = a2;
        if (this.h) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
        k(this.V);
    }

    public final void z0() {
        int i10 = this.J + 1;
        this.J = i10;
        if (i10 != 1 || this.L) {
            return;
        }
        this.K = false;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        float a2;
        float a10;
        int i11 = 1;
        this.a = new xj0(this, i11);
        this.b = new e(this);
        this.f = new c(26, (byte) 0);
        this.n = new e0(this, 0);
        this.r = new Rect();
        this.s = new Rect();
        this.w = new RectF();
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.J = 0;
        this.Q = false;
        this.R = false;
        this.S = 0;
        this.T = 0;
        this.U = new k0();
        this.c0 = new s4.j();
        this.d0 = 0;
        this.e0 = -1;
        this.o0 = Float.MIN_VALUE;
        this.p0 = Float.MIN_VALUE;
        this.q0 = true;
        this.r0 = new b1(this);
        this.t0 = new f();
        z0 z0Var = new z0();
        z0Var.a = -1;
        z0Var.b = 0;
        z0Var.c = 0;
        z0Var.d = 1;
        z0Var.e = 0;
        z0Var.f = false;
        z0Var.g = false;
        z0Var.h = false;
        z0Var.i = false;
        z0Var.j = false;
        z0Var.k = false;
        this.u0 = z0Var;
        this.x0 = false;
        this.y0 = false;
        int i12 = 23;
        u uVar = new u(this, i12);
        this.z0 = uVar;
        this.A0 = false;
        this.C0 = new int[2];
        this.E0 = new int[2];
        this.F0 = new int[2];
        this.G0 = 0;
        this.H0 = 0;
        this.I0 = null;
        this.J0 = new int[2];
        this.K0 = new ArrayList();
        this.L0 = new e0(this, i11);
        this.M0 = new f0(this);
        this.O0 = true;
        this.P0 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q0, i10, 0);
            this.h = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.h = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.k0 = viewConfiguration.getScaledTouchSlop();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            Method method = i0.a;
            a2 = c2.h.f(viewConfiguration);
        } else {
            a2 = i0.a(viewConfiguration, context);
        }
        this.o0 = a2;
        if (i13 >= 26) {
            a10 = c2.h.g(viewConfiguration);
        } else {
            a10 = i0.a(viewConfiguration, context);
        }
        this.p0 = a10;
        this.m0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.n0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.c0.a = uVar;
        this.d = new s0(new l2.f(this, 28));
        this.e = new d(new t(this, i12));
        WeakHashMap weakHashMap = h0.a;
        if ((i13 >= 26 ? b0.a(this) : 0) == 0 && i13 >= 26) {
            b0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.O = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new e1(this));
        setDescendantFocusability(262144);
        setNestedScrollingEnabled(true);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        n0 n0Var = this.y;
        if (n0Var != null) {
            return n0Var.p(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + C());
    }

    public void g0(View view) {
    }

    public void k0(int i10) {
    }

    public void l0(int i10) {
    }

    public void setRecyclerListener(v0 v0Var) {
    }
}
