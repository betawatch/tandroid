package androidx.recyclerview.widget;

import a0.f;
import a0.h;
import a0.i;
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
import e6.n;
import hg.p1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ji.u4;
import l.d;
import m2.t;
import n0.g;
import n7.z0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.l2;
import pf.e;
import r0.a0;
import r0.i0;
import r0.j0;
import r0.k;
import ra.a;
import s4.a1;
import s4.b0;
import s4.b1;
import s4.c0;
import s4.c1;
import s4.e1;
import s4.f1;
import s4.g0;
import s4.h0;
import s4.i1;
import s4.j;
import s4.k0;
import s4.l0;
import s4.m0;
import s4.n0;
import s4.o0;
import s4.p0;
import s4.q;
import s4.q0;
import s4.r0;
import s4.s0;
import s4.u0;
import s4.v0;
import s4.w0;
import s4.y;
import s4.y0;
import u0.b;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] P0 = {R.attr.clipToPadding};
    public static final boolean Q0;
    public static final boolean R0;
    public static final boolean S0;
    public static final l2 T0;
    public e1 A0;
    public final int[] B0;
    public k C0;
    public final int[] D0;
    public final ArrayList E;
    public final int[] E0;
    public r0 F;
    public int F0;
    public boolean G;
    public int G0;
    public boolean H;
    public Integer H0;
    public boolean I;
    public final int[] I0;
    public int J;
    public final ArrayList J0;
    public boolean K;
    public final g0 K0;
    public boolean L;
    public final u4 L0;
    public boolean M;
    public String M0;
    public int N;
    public boolean N0;
    public final AccessibilityManager O;
    public boolean O0;
    public ArrayList P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public l0 U;
    public EdgeEffect V;
    public EdgeEffect W;
    public final p1 a;
    public EdgeEffect a0;
    public final e b;
    public EdgeEffect b0;
    public w0 c;
    public m0 c0;
    public final a d;
    public int d0;
    public final t e;
    public int e0;
    public final z0 f;
    public VelocityTracker f0;
    public int g0;
    public boolean h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public final int l0;
    public final int m0;
    public final g0 n;
    public final float n0;
    public final float o0;
    public boolean p0;
    public final b1 q0;
    public final Rect r;
    public q r0;
    public final Rect s;
    public final h s0;
    public final s4.z0 t0;
    public s0 u0;
    public final RectF v;
    public ArrayList v0;
    public h0 w;
    public boolean w0;
    public o0 x;
    public boolean x0;
    public final ArrayList y;
    public final k2.g0 y0;
    public boolean z0;

    static {
        Q0 = Build.VERSION.SDK_INT >= 23;
        R0 = true;
        S0 = true;
        T0 = new l2(3);
    }

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
        if (layoutParams instanceof p0) {
            return ((p0) layoutParams).a;
        }
        return null;
    }

    private k getScrollingChildHelper() {
        if (this.C0 == null) {
            this.C0 = new k(this);
        }
        return this.C0;
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

    public final void A0(int i10) {
        getScrollingChildHelper().h(i10);
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

    public void B0() {
        y0 y0Var;
        setScrollState(0);
        b1 b1Var = this.q0;
        RecyclerView recyclerView = b1Var.h;
        if (recyclerView.N0) {
            recyclerView.removeCallbacks(b1Var);
            b1Var.c.abortAnimation();
        }
        o0 o0Var = this.x;
        if (o0Var == null || (y0Var = o0Var.e) == null) {
            return;
        }
        y0Var.h();
    }

    public final String C() {
        String sb2;
        StringBuilder sb3 = new StringBuilder(" ");
        sb3.append(super.toString());
        sb3.append(", adapter:");
        sb3.append(this.w);
        sb3.append(", layout:");
        sb3.append(this.x);
        sb3.append(", context:");
        sb3.append(getContext());
        sb3.append(", ainfo:");
        sb3.append(this.M0);
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

    public final void D(s4.z0 z0Var) {
        if (getScrollState() != 2) {
            z0Var.getClass();
            return;
        }
        OverScroller overScroller = this.q0.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        z0Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View E(float f7, float f10) {
        for (int y3 = this.e.y() - 1; y3 >= 0; y3--) {
            View x10 = this.e.x(y3);
            float translationX = x10.getTranslationX();
            float translationY = x10.getTranslationY();
            if (f7 >= x10.getLeft() + translationX && f7 <= x10.getRight() + translationX && f10 >= x10.getTop() + translationY && f10 <= x10.getBottom() + translationY) {
                return x10;
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
        int y3 = this.e.y();
        if (y3 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i11 = TLObject.FLAG_31;
        for (int i12 = 0; i12 < y3; i12++) {
            c1 U = U(this.e.x(i12));
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
        int E = this.e.E();
        for (int i11 = 0; i11 < E; i11++) {
            c1 U = U(this.e.D(i11));
            if (U != null && !U.j() && N(U) == i10) {
                if (!((ArrayList) this.e.b).contains(U.a)) {
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
        int E = this.e.E();
        c1 c1Var = null;
        for (int i11 = 0; i11 < E; i11++) {
            c1 U = U(this.e.D(i11));
            if (U != null && !U.j()) {
                if (z10) {
                    if (U.c != i10) {
                        continue;
                    }
                    if (((ArrayList) this.e.b).contains(U.a)) {
                        return U;
                    }
                    c1Var = U;
                } else {
                    if (U.c() != i10) {
                        continue;
                    }
                    if (((ArrayList) this.e.b).contains(U.a)) {
                    }
                }
            }
        }
        return c1Var;
    }

    public final void M(q0.a aVar) {
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
        return this.w.b ? c1Var.e : c1Var.c;
    }

    public final c1 T(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return U(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final View V(int i10) {
        ArrayList arrayList = (ArrayList) this.e.b;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return null;
        }
        return (View) arrayList.get(i10);
    }

    public final Rect W(View view) {
        p0 p0Var = (p0) view.getLayoutParams();
        boolean z10 = p0Var.c;
        Rect rect = p0Var.b;
        if (z10) {
            s4.z0 z0Var = this.t0;
            if (!z0Var.g || (!p0Var.a.m() && !p0Var.a.h())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.y;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Rect rect2 = this.r;
                    rect2.set(0, 0, 0, 0);
                    ((n0) arrayList.get(i10)).a(rect2, view, this, z0Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                p0Var.c = false;
                return rect;
            }
        }
        return rect;
    }

    public final n0 X(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 < 0 || i10 >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(a4.a.k(i10, itemDecorationCount, " is an invalid index for size "));
        }
        return (n0) this.y.get(i10);
    }

    public final void Y(long j3, c1 c1Var, c1 c1Var2) {
        int y3 = this.e.y();
        for (int i10 = 0; i10 < y3; i10++) {
            c1 U = U(this.e.x(i10));
            if (U != c1Var && Q(U) == j3) {
                h0 h0Var = this.w;
                if (h0Var == null || !h0Var.b) {
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
        if (this.y.size() == 0) {
            return;
        }
        o0 o0Var = this.x;
        if (o0Var != null) {
            o0Var.b("Cannot invalidate item decorations during a scroll or layout");
        }
        d0();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        o0 o0Var = this.x;
        if (o0Var != null) {
            o0Var.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final boolean b0() {
        return this.S > 0;
    }

    public final void c0(int i10) {
        if (this.x == null) {
            return;
        }
        setScrollState(2);
        this.x.n0(i10);
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p0) && this.x.f((p0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        o0 o0Var = this.x;
        if (o0Var == null || !o0Var.d()) {
            return 0;
        }
        return ((c0) this.x).B0(this.t0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        o0 o0Var = this.x;
        if (o0Var != null && o0Var.d()) {
            return this.x.h(this.t0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        o0 o0Var = this.x;
        if (o0Var != null && o0Var.d()) {
            return this.x.i(this.t0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        o0 o0Var = this.x;
        if (o0Var != null && o0Var.e()) {
            return this.x.j(this.t0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        o0 o0Var = this.x;
        if (o0Var != null && o0Var.e()) {
            return this.x.k(this.t0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        o0 o0Var = this.x;
        if (o0Var != null && o0Var.e()) {
            return this.x.l(this.t0);
        }
        return 0;
    }

    public final void d0() {
        int E = this.e.E();
        for (int i10 = 0; i10 < E; i10++) {
            ((p0) this.e.D(i10).getLayoutParams()).c = true;
        }
        ArrayList arrayList = (ArrayList) this.b.e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            p0 p0Var = (p0) ((c1) arrayList.get(i11)).a.getLayoutParams();
            if (p0Var != null) {
                p0Var.c = true;
            }
        }
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
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ((n0) arrayList.get(i10)).c(canvas, this);
        }
        Integer num = this.H0;
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
                canvas.translate(0.0f, this.F0);
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
                    canvas.translate(-getWidth(), (-getHeight()) + this.G0);
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
            WeakHashMap weakHashMap = i0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    public final void e0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int E = this.e.E();
        for (int i13 = 0; i13 < E; i13++) {
            c1 U = U(this.e.D(i13));
            if (U != null && !U.r()) {
                int i14 = U.c;
                s4.z0 z0Var = this.t0;
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

    /* JADX WARN: Code restructure failed: missing block: B:103:0x019f, code lost:
    
        if ((r5 * r6) >= 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0169, code lost:
    
        if (r7 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0187, code lost:
    
        if (r5 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x018a, code lost:
    
        if (r7 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x018d, code lost:
    
        if (r5 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0196, code lost:
    
        if ((r5 * r6) <= 0) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015b  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i10) {
        View view2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char c10;
        boolean z10;
        this.x.getClass();
        boolean z11 = true;
        boolean z12 = (this.w == null || this.x == null || b0() || this.L) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        s4.z0 z0Var = this.t0;
        e eVar = this.b;
        if (z12 && (i10 == 2 || i10 == 1)) {
            if (this.x.e()) {
                if (focusFinder.findNextFocus(this, view, i10 == 2 ? 130 : 33) == null) {
                    z10 = true;
                    if (!z10 && this.x.d()) {
                        RecyclerView recyclerView = this.x.b;
                        WeakHashMap weakHashMap = i0.a;
                        z10 = focusFinder.findNextFocus(this, view, !((recyclerView.getLayoutDirection() != 1) ^ (i10 != 2)) ? 66 : 17) != null;
                    }
                    if (z10) {
                        p();
                        if (F(view) != null) {
                            y0();
                            this.x.R(view, i10, eVar, z0Var);
                            z0(false);
                        }
                        return null;
                    }
                    view2 = focusFinder.findNextFocus(this, view, i10);
                    if (view2 == null) {
                    }
                    if (view2 != null) {
                        if (view != null) {
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
                            RecyclerView recyclerView2 = this.x.b;
                            WeakHashMap weakHashMap2 = i0.a;
                            if (recyclerView2.getLayoutDirection() != 1) {
                            }
                            i11 = rect.left;
                            i12 = rect2.left;
                            if (i11 >= i12) {
                            }
                            i13 = 1;
                            i14 = rect.top;
                            i15 = rect2.top;
                            if (i14 >= i15) {
                            }
                            c10 = 1;
                            if (i10 == 1) {
                            }
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
                RecyclerView recyclerView3 = this.x.b;
                WeakHashMap weakHashMap3 = i0.a;
                if (focusFinder.findNextFocus(this, view, !((recyclerView3.getLayoutDirection() != 1) ^ (i10 != 2)) ? 66 : 17) != null) {
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
                    y0();
                    view2 = this.x.R(view, i10, eVar, z0Var);
                    z0(false);
                }
                return null;
            }
            view2 = findNextFocus;
            if (view2 == null && !view2.hasFocusable()) {
                if (getFocusedChild() == null) {
                    return super.focusSearch(view, i10);
                }
                q0(view2, null);
                return view;
            }
            if (view2 != null && view2 != this && view2 != view && F(view2) != null) {
                if (view != null && F(view) != null) {
                    int width3 = view.getWidth();
                    int height3 = view.getHeight();
                    Rect rect3 = this.r;
                    rect3.set(0, 0, width3, height3);
                    int width22 = view2.getWidth();
                    int height22 = view2.getHeight();
                    Rect rect22 = this.s;
                    rect22.set(0, 0, width22, height22);
                    offsetDescendantRectToMyCoords(view, rect3);
                    offsetDescendantRectToMyCoords(view2, rect22);
                    RecyclerView recyclerView22 = this.x.b;
                    WeakHashMap weakHashMap22 = i0.a;
                    int i16 = recyclerView22.getLayoutDirection() != 1 ? -1 : 1;
                    i11 = rect3.left;
                    i12 = rect22.left;
                    if ((i11 >= i12 || rect3.right <= i12) && rect3.right < rect22.right) {
                        i13 = 1;
                    } else {
                        int i17 = rect3.right;
                        int i18 = rect22.right;
                        i13 = ((i17 > i18 || i11 >= i18) && i11 > i12) ? -1 : 0;
                    }
                    i14 = rect3.top;
                    i15 = rect22.top;
                    if ((i14 >= i15 || rect3.bottom <= i15) && rect3.bottom < rect22.bottom) {
                        c10 = 1;
                    } else {
                        int i19 = rect3.bottom;
                        int i20 = rect22.bottom;
                        c10 = ((i19 > i20 || i14 >= i20) && i14 > i15) ? (char) 65535 : (char) 0;
                    }
                    if (i10 == 1) {
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

    public final void g0() {
        this.S++;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o0 o0Var = this.x;
        if (o0Var != null) {
            return o0Var.n();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + C());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o0 o0Var = this.x;
        if (o0Var != null) {
            return o0Var.o(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + C());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h0 getAdapter() {
        return this.w;
    }

    public int getAttachedScrapChildCount() {
        return ((ArrayList) this.b.c).size();
    }

    @Override // android.view.View
    public int getBaseline() {
        o0 o0Var = this.x;
        if (o0Var == null) {
            return super.getBaseline();
        }
        o0Var.getClass();
        return -1;
    }

    public int getBottomGlowOffset() {
        return this.G0;
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
        return this.A0;
    }

    public float getCurrentVelocity() {
        VelocityTracker velocityTracker = this.f0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.m0);
        return this.f0.getYVelocity();
    }

    public l0 getEdgeEffectFactory() {
        return this.U;
    }

    public int getHiddenChildCount() {
        return ((ArrayList) this.e.b).size();
    }

    public m0 getItemAnimator() {
        return this.c0;
    }

    public int getItemDecorationCount() {
        return this.y.size();
    }

    public o0 getLayoutManager() {
        return this.x;
    }

    public int getMaxFlingVelocity() {
        return this.m0;
    }

    public int getMinFlingVelocity() {
        return this.l0;
    }

    public long getNanoTime() {
        if (S0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public q0 getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.p0;
    }

    public u0 getRecycledViewPool() {
        return this.b.c();
    }

    public int getScrollState() {
        return this.d0;
    }

    public int getTopGlowOffset() {
        return this.F0;
    }

    public final void h(c1 c1Var) {
        View view = c1Var.a;
        boolean z10 = view.getParent() == this;
        this.b.k(T(view));
        if (c1Var.l()) {
            this.e.o(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z10) {
            this.e.m(view, -1, true);
            return;
        }
        t tVar = this.e;
        int indexOfChild = ((RecyclerView) ((d) tVar.c).b).indexOfChild(view);
        if (indexOfChild >= 0) {
            ((n) tVar.d).H(indexOfChild);
            tVar.G(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void h0(boolean z10) {
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
                ArrayList arrayList = this.J0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c1 c1Var = (c1) arrayList.get(size);
                    if (c1Var.a.getParent() == this && !c1Var.r() && (i10 = c1Var.s) != -1) {
                        View view = c1Var.a;
                        WeakHashMap weakHashMap = i0.a;
                        view.setImportantForAccessibility(i10);
                        c1Var.s = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(n0 n0Var) {
        o0 o0Var = this.x;
        if (o0Var != null) {
            o0Var.b("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.y;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(n0Var);
        d0();
        requestLayout();
    }

    public final void i0(MotionEvent motionEvent) {
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

    public final void j(s0 s0Var) {
        if (this.v0 == null) {
            this.v0 = new ArrayList();
        }
        this.v0.add(s0Var);
    }

    public final void k(EdgeEffect edgeEffect) {
        Integer num;
        if (edgeEffect == null || (num = this.H0) == null) {
            return;
        }
        edgeEffect.setColor(num.intValue());
    }

    public final void l(String str) {
        if (b0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + C());
        }
        if (this.T > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + C()));
        }
    }

    public final void l0() {
        if (this.z0 || !this.G) {
            return;
        }
        WeakHashMap weakHashMap = i0.a;
        postOnAnimation(this.K0);
        this.z0 = true;
    }

    public final void m0(boolean z10) {
        this.R = z10 | this.R;
        this.Q = true;
        int E = this.e.E();
        for (int i10 = 0; i10 < E; i10++) {
            c1 U = U(this.e.D(i10));
            if (U != null && !U.r()) {
                U.a(6);
            }
        }
        d0();
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
        h0 h0Var = ((RecyclerView) eVar.h).w;
        if (h0Var == null || !h0Var.b) {
            eVar.e();
        }
    }

    public final void n() {
        int E = this.e.E();
        for (int i10 = 0; i10 < E; i10++) {
            c1 U = U(this.e.D(i10));
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

    public final void n0(c1 c1Var, b2.q0 q0Var) {
        c1Var.p(0, 8192);
        boolean z10 = this.t0.h;
        z0 z0Var = this.f;
        if (z10 && c1Var.m() && !c1Var.j() && !c1Var.r()) {
            ((i) z0Var.c).k(c1Var, Q(c1Var));
        }
        f fVar = (f) z0Var.b;
        i1 i1Var = (i1) fVar.get(c1Var);
        if (i1Var == null) {
            i1Var = i1.a();
            fVar.put(c1Var, i1Var);
        }
        i1Var.b = q0Var;
        i1Var.a |= 4;
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
            WeakHashMap weakHashMap = i0.a;
            postInvalidateOnAnimation();
        }
    }

    public final void o0() {
        m0 m0Var = this.c0;
        if (m0Var != null) {
            m0Var.g();
        }
        o0 o0Var = this.x;
        e eVar = this.b;
        if (o0Var != null) {
            o0Var.g0(eVar);
            this.x.h0(eVar);
        }
        ((ArrayList) eVar.c).clear();
        eVar.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r1 >= 30.0f) goto L22;
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
        o0 o0Var = this.x;
        if (o0Var != null) {
            o0Var.getClass();
        }
        this.z0 = false;
        if (S0) {
            ThreadLocal threadLocal = q.e;
            q qVar = (q) threadLocal.get();
            this.r0 = qVar;
            if (qVar == null) {
                q qVar2 = new q();
                qVar2.a = new ArrayList();
                qVar2.d = new ArrayList();
                this.r0 = qVar2;
                WeakHashMap weakHashMap = i0.a;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    f7 = display.getRefreshRate();
                }
                f7 = 60.0f;
                q qVar3 = this.r0;
                qVar3.c = (long) (1.0E9f / f7);
                threadLocal.set(qVar3);
            }
            this.r0.a.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        q qVar;
        super.onDetachedFromWindow();
        m0 m0Var = this.c0;
        if (m0Var != null) {
            m0Var.g();
        }
        B0();
        this.G = false;
        this.J0.clear();
        removeCallbacks(this.K0);
        this.f.getClass();
        while (i1.d.a() != null) {
        }
        if (!S0 || (qVar = this.r0) == null) {
            return;
        }
        qVar.a.remove(this);
        this.r0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((n0) arrayList.get(i10)).b(canvas, this);
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
        if (this.x != null && !this.L && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f7 = this.x.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.x.d()) {
                    f10 = motionEvent.getAxisValue(10);
                    if (f7 == 0.0f || f10 != 0.0f) {
                        s0((int) (f10 * this.n0), (int) (f7 * this.o0), motionEvent);
                    }
                }
                f10 = 0.0f;
                if (f7 == 0.0f) {
                }
                s0((int) (f10 * this.n0), (int) (f7 * this.o0), motionEvent);
            } else {
                if ((motionEvent.getSource() & TLObject.FLAG_22) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.x.e()) {
                        f7 = -axisValue;
                        f10 = 0.0f;
                        if (f7 == 0.0f) {
                        }
                        s0((int) (f10 * this.n0), (int) (f7 * this.o0), motionEvent);
                    } else if (this.x.d()) {
                        f10 = axisValue;
                        f7 = 0.0f;
                        if (f7 == 0.0f) {
                        }
                        s0((int) (f10 * this.n0), (int) (f7 * this.o0), motionEvent);
                    }
                }
                f7 = 0.0f;
                f10 = 0.0f;
                if (f7 == 0.0f) {
                }
                s0((int) (f10 * this.n0), (int) (f7 * this.o0), motionEvent);
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
                r0();
                setScrollState(0);
                return true;
            }
            o0 o0Var = this.x;
            if (o0Var != null) {
                boolean d = o0Var.d();
                boolean e7 = this.x.e();
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
                        A0(1);
                    }
                    int[] iArr = this.E0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i10 = d;
                    if (e7) {
                        i10 = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i10, 0);
                } else if (actionMasked == 1) {
                    this.f0.clear();
                    A0(0);
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
                        if (e7 && Math.abs(i12) > this.k0) {
                            this.j0 = y10;
                            z10 = true;
                        }
                        if (z10) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    r0();
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
                    i0(motionEvent);
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
        int i14 = g.a;
        Trace.beginSection("RV OnLayout");
        s();
        Trace.endSection();
        this.I = true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.x == null) {
            q(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        o0 o0Var = this.x;
        e eVar = this.b;
        s4.z0 z0Var = this.t0;
        o0Var.d0(eVar, z0Var, i10, i11);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.w == null) {
            return;
        }
        if (z0Var.d == 1) {
            t();
        }
        this.x.q0(i10, i11);
        z0Var.i = true;
        u();
        this.x.s0(i10, i11);
        c0 c0Var = (c0) this.x;
        if (c0Var.l == 1073741824 || c0Var.k == 1073741824) {
            return;
        }
        int r10 = c0Var.r();
        for (int i12 = 0; i12 < r10; i12++) {
            ViewGroup.LayoutParams layoutParams = c0Var.q(i12).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                this.x.q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                z0Var.i = true;
                u();
                this.x.s0(i10, i11);
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (b0()) {
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
        o0 o0Var = this.x;
        if (o0Var == null || (parcelable2 = this.c.c) == null) {
            return;
        }
        c0 c0Var = (c0) o0Var;
        if (parcelable2 instanceof b0) {
            c0Var.B = (b0) parcelable2;
            c0Var.l0();
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
        o0 o0Var = this.x;
        if (o0Var != null) {
            w0Var.c = o0Var.e0();
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
                r0();
                setScrollState(0);
                return true;
            }
            o0 o0Var = this.x;
            if (o0Var != null) {
                boolean d = o0Var.d();
                boolean e7 = this.x.e();
                if (this.f0 == null) {
                    this.f0 = VelocityTracker.obtain();
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.E0;
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
                    if (e7) {
                        i10 = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i10, 0);
                } else {
                    if (actionMasked == 1) {
                        this.f0.addMovement(obtain);
                        VelocityTracker velocityTracker = this.f0;
                        int i11 = this.m0;
                        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, i11);
                        float f7 = d != 0 ? -this.f0.getXVelocity(this.e0) : 0.0f;
                        float f10 = e7 ? -this.f0.getYVelocity(this.e0) : 0.0f;
                        if (f7 != 0.0f || f10 != 0.0f) {
                            int i12 = (int) f7;
                            int i13 = (int) f10;
                            o0 o0Var2 = this.x;
                            if (o0Var2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.L) {
                                boolean d10 = o0Var2.d();
                                boolean e10 = this.x.e();
                                int i14 = this.l0;
                                if (d10 == 0 || Math.abs(i12) < i14) {
                                    i12 = 0;
                                }
                                if (!e10 || Math.abs(i13) < i14) {
                                    i13 = 0;
                                }
                                if (i12 != 0 || i13 != 0) {
                                    float f11 = i12;
                                    float f12 = i13;
                                    if (!dispatchNestedPreFling(f11, f12)) {
                                        boolean z12 = d10 != 0 || e10;
                                        dispatchNestedFling(f11, f12, z12);
                                        int i15 = d10;
                                        if (z12) {
                                            if (e10) {
                                                i15 = (d10 ? 1 : 0) | 2;
                                            }
                                            getScrollingChildHelper().g(i15, 1);
                                            int i16 = -i11;
                                            int max = Math.max(i16, Math.min(i12, i11));
                                            int max2 = Math.max(i16, Math.min(i13, i11));
                                            b1 b1Var = this.q0;
                                            RecyclerView recyclerView = b1Var.h;
                                            recyclerView.setScrollState(2);
                                            b1Var.b = 0;
                                            b1Var.a = 0;
                                            Interpolator interpolator = b1Var.d;
                                            l2 l2Var = T0;
                                            if (interpolator != l2Var) {
                                                b1Var.d = l2Var;
                                                b1Var.c = new OverScroller(recyclerView.getContext(), l2Var);
                                            }
                                            b1Var.c.fling(0, 0, max, max2, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                            b1Var.a();
                                            r0();
                                            obtain.recycle();
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                        setScrollState(0);
                        r0();
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
                        int i17 = this.i0 - x11;
                        int i18 = this.j0 - y10;
                        int[] iArr2 = this.I0;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        boolean v = v(i17, i18, 0, iArr2, this.D0);
                        int[] iArr3 = this.D0;
                        if (v) {
                            i17 -= iArr2[0];
                            i18 -= iArr2[1];
                            obtain.offsetLocation(iArr3[0], iArr3[1]);
                            iArr[0] = iArr[0] + iArr3[0];
                            iArr[1] = iArr[1] + iArr3[1];
                        }
                        if (this.d0 != 1) {
                            if (d != 0) {
                                int abs = Math.abs(i17);
                                int i19 = this.k0;
                                if (abs > i19) {
                                    i17 = i17 > 0 ? i17 - i19 : i17 + i19;
                                    z11 = true;
                                    if (e7) {
                                        int abs2 = Math.abs(i18);
                                        int i20 = this.k0;
                                        if (abs2 > i20) {
                                            i18 = i18 > 0 ? i18 - i20 : i18 + i20;
                                            z11 = true;
                                        }
                                    }
                                    if (z11) {
                                        setScrollState(1);
                                    }
                                }
                            }
                            z11 = false;
                            if (e7) {
                            }
                            if (z11) {
                            }
                        }
                        if (this.d0 == 1) {
                            this.i0 = x11 - iArr3[0];
                            this.j0 = y10 - iArr3[1];
                            if (s0(d != 0 ? i17 : 0, e7 ? i18 : 0, obtain)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            q qVar = this.r0;
                            if (qVar != null && (i17 != 0 || i18 != 0)) {
                                qVar.a(this, i17, i18);
                            }
                        }
                    } else if (actionMasked == 3) {
                        r0();
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
                        i0(motionEvent);
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
            int i10 = g.a;
            Trace.beginSection("RV FullInvalidate");
            s();
            Trace.endSection();
            return;
        }
        a aVar = this.d;
        if (aVar.h()) {
            int i11 = aVar.b;
            if ((i11 & 4) == 0 || (i11 & 11) != 0) {
                if (aVar.h()) {
                    int i12 = g.a;
                    Trace.beginSection("RV FullInvalidate");
                    s();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i13 = g.a;
            Trace.beginSection("RV PartialInvalidate");
            y0();
            g0();
            aVar.l();
            if (!this.K) {
                t tVar = this.e;
                int y3 = tVar.y();
                int i14 = 0;
                while (true) {
                    if (i14 < y3) {
                        c1 U = U(tVar.x(i14));
                        if (U != null && !U.r() && U.m()) {
                            s();
                            break;
                        }
                        i14++;
                    } else {
                        aVar.c();
                        break;
                    }
                }
            }
            z0(true);
            h0(true);
            Trace.endSection();
        }
    }

    public final void p0(n0 n0Var) {
        o0 o0Var = this.x;
        if (o0Var != null) {
            o0Var.b("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.y;
        arrayList.remove(n0Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        d0();
        requestLayout();
    }

    public final void q(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = i0.a;
        setMeasuredDimension(o0.g(i10, paddingRight, getMinimumWidth()), o0.g(i11, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void q0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.r;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p0) {
            p0 p0Var = (p0) layoutParams;
            if (!p0Var.c) {
                Rect rect2 = p0Var.b;
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
        this.x.k0(this, view, this.r, !this.I, view2 == null);
    }

    public final void r(View view) {
        c1 U = U(view);
        h0 h0Var = this.w;
        if (h0Var != null && U != null) {
            h0Var.z(U);
        }
        ArrayList arrayList = this.P;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                y yVar = (y) this.P.get(size);
                yVar.o(view);
                c1 T = yVar.H.T(view);
                if (T != null) {
                    c1 c1Var = yVar.c;
                    if (c1Var == null || T != c1Var) {
                        yVar.j(T, false);
                        if (yVar.a.remove(T.a)) {
                            yVar.x.a(yVar.H, T);
                        }
                    } else {
                        yVar.p(null, 0);
                    }
                }
            }
        }
    }

    public final void r0() {
        VelocityTracker velocityTracker = this.f0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z10 = false;
        A0(0);
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
            WeakHashMap weakHashMap = i0.a;
            postInvalidateOnAnimation();
        }
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
        y0 y0Var = this.x.e;
        if ((y0Var == null || !y0Var.e) && !b0() && view2 != null) {
            q0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.x.k0(this, view, rect, z10, false);
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

    /* JADX WARN: Code restructure failed: missing block: B:45:0x036f, code lost:
    
        if (((java.util.ArrayList) r20.e.b).contains(getFocusedChild()) == false) goto L240;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x041c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        i1 i1Var;
        int i10;
        boolean r10;
        int i11;
        int i12;
        int i13;
        int i14;
        c1 c1Var;
        View findViewById;
        boolean z10;
        if (this.w == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.x == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        s4.z0 z0Var = this.t0;
        boolean z11 = false;
        z0Var.i = false;
        int i15 = 1;
        if (z0Var.d == 1) {
            t();
            this.x.p0(this);
            u();
        } else {
            a aVar = this.d;
            if ((((ArrayList) aVar.e).isEmpty() || ((ArrayList) aVar.d).isEmpty()) && this.x.m == getWidth() && this.x.n == getHeight()) {
                this.x.p0(this);
            } else {
                this.x.p0(this);
                u();
            }
        }
        z0Var.a(4);
        y0();
        g0();
        z0Var.d = 1;
        boolean z12 = z0Var.j;
        e eVar = this.b;
        z0 z0Var2 = this.f;
        if (z12) {
            try {
                int y3 = this.e.y() - 1;
                while (y3 >= 0) {
                    c1 U = U(this.e.x(y3));
                    if (U != null && !U.r()) {
                        long Q = Q(U);
                        this.c0.getClass();
                        b2.q0 q0Var = new b2.q0();
                        View view = U.a;
                        q0Var.a = view.getLeft();
                        q0Var.b = view.getTop();
                        view.getRight();
                        view.getBottom();
                        i iVar = (i) z0Var2.c;
                        f fVar = (f) z0Var2.b;
                        c1 c1Var2 = (c1) iVar.f(Q);
                        if (c1Var2 == null || c1Var2.r()) {
                            z0Var2.f(U, q0Var);
                        } else {
                            i1 i1Var2 = (i1) fVar.get(c1Var2);
                            boolean z13 = (i1Var2 == null || (i1Var2.a & i15) == 0) ? false : true;
                            i1 i1Var3 = (i1) fVar.get(U);
                            boolean z14 = (i1Var3 == null || (i1Var3.a & i15) == 0) ? false : true;
                            if (z13 && c1Var2 == U) {
                                z0Var2.f(U, q0Var);
                            } else {
                                try {
                                    b2.q0 D = z0Var2.D(c1Var2, 4);
                                    z0Var2.f(U, q0Var);
                                    b2.q0 D2 = z0Var2.D(U, 8);
                                    if (D == null) {
                                        Y(Q, U, c1Var2);
                                    } else {
                                        c1Var2.q(false);
                                        if (z13) {
                                            h(c1Var2);
                                        }
                                        if (c1Var2 != U) {
                                            if (z14) {
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
                                        int i16 = D.a;
                                        int i17 = D.b;
                                        if (U.r()) {
                                            i13 = D.a;
                                            i14 = D.b;
                                        } else {
                                            i13 = D2.a;
                                            i14 = D2.b;
                                        }
                                        if (f1Var.q(c1Var2, U, D, i16, i17, i13, i14)) {
                                            l0();
                                        }
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    StringBuilder sb2 = new StringBuilder();
                                    for (int y10 = this.e.y() - 1; y10 >= 0; y10--) {
                                        c1 U2 = U(this.e.x(y10));
                                        if (U2 != null && !U2.r()) {
                                            sb2.append("Holder at" + y10 + " " + U2 + "\n");
                                        }
                                    }
                                    throw new RuntimeException(sb2.toString(), e);
                                }
                            }
                        }
                        y3--;
                        i15 = 1;
                    }
                    y3--;
                    i15 = 1;
                }
                f fVar2 = (f) z0Var2.b;
                int i18 = fVar2.c - 1;
                while (i18 >= 0) {
                    c1 c1Var3 = (c1) fVar2.e(i18);
                    try {
                        i1Var = (i1) fVar2.f(i18);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        i1Var = null;
                    }
                    if (i1Var != null) {
                        int i19 = i1Var.a;
                        int i20 = i19 & 3;
                        u4 u4Var = this.L0;
                        if (i20 == 3) {
                            u4Var.R(c1Var3);
                        } else if ((i19 & 1) != 0) {
                            b2.q0 q0Var2 = i1Var.b;
                            if (q0Var2 == null) {
                                u4Var.R(c1Var3);
                            } else {
                                u4Var.O(c1Var3, q0Var2, i1Var.c);
                            }
                        } else if ((i19 & 14) == 14) {
                            b2.q0 q0Var3 = i1Var.b;
                            b2.q0 q0Var4 = i1Var.c;
                            RecyclerView recyclerView = (RecyclerView) u4Var.b;
                            c1Var3.q(z11);
                            if (recyclerView.c0.a(c1Var3, q0Var3, q0Var4)) {
                                recyclerView.l0();
                            }
                        } else if ((i19 & 12) == 12) {
                            b2.q0 q0Var5 = i1Var.b;
                            b2.q0 q0Var6 = i1Var.c;
                            u4Var.getClass();
                            c1Var3.q(z11);
                            RecyclerView recyclerView2 = (RecyclerView) u4Var.b;
                            if (recyclerView2.Q) {
                                f1 f1Var2 = (f1) recyclerView2.c0;
                                f1Var2.getClass();
                                int i21 = q0Var5.a;
                                int i22 = q0Var5.b;
                                if (c1Var3.r()) {
                                    i12 = q0Var5.a;
                                    i11 = q0Var5.b;
                                } else {
                                    int i23 = q0Var6.a;
                                    i11 = q0Var6.b;
                                    i12 = i23;
                                }
                                if (f1Var2.q(c1Var3, c1Var3, q0Var5, i21, i22, i12, i11)) {
                                    recyclerView2.l0();
                                }
                            } else {
                                f1 f1Var3 = (f1) recyclerView2.c0;
                                f1Var3.getClass();
                                int i24 = q0Var5.a;
                                int i25 = q0Var6.a;
                                if (i24 == i25 && q0Var5.b == q0Var6.b) {
                                    f1Var3.v(c1Var3);
                                    r10 = false;
                                } else {
                                    r10 = f1Var3.r(c1Var3, q0Var5, i24, q0Var5.b, i25, q0Var6.b);
                                }
                                if (r10) {
                                    recyclerView2.l0();
                                }
                            }
                        } else if ((i19 & 4) != 0) {
                            u4Var.O(c1Var3, i1Var.b, null);
                        } else if ((i19 & 8) != 0) {
                            b2.q0 q0Var7 = i1Var.b;
                            b2.q0 q0Var8 = i1Var.c;
                            RecyclerView recyclerView3 = (RecyclerView) u4Var.b;
                            i10 = 0;
                            c1Var3.q(false);
                            if (recyclerView3.c0.a(c1Var3, q0Var7, q0Var8)) {
                                recyclerView3.l0();
                            }
                            i1Var.a = i10;
                            i1Var.b = null;
                            i1Var.c = null;
                            i1.d.i(i1Var);
                        }
                        i10 = 0;
                        i1Var.a = i10;
                        i1Var.b = null;
                        i1Var.c = null;
                        i1.d.i(i1Var);
                    }
                    i18--;
                    z11 = false;
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        View view2 = null;
        this.x.h0(eVar);
        z0Var.b = z0Var.e;
        this.Q = false;
        this.R = false;
        z0Var.j = false;
        z0Var.k = false;
        this.x.f = false;
        ArrayList arrayList = (ArrayList) eVar.d;
        if (arrayList != null) {
            arrayList.clear();
        }
        o0 o0Var = this.x;
        if (o0Var.j) {
            o0Var.i = 0;
            o0Var.j = false;
            eVar.l();
        }
        this.x.c0(z0Var);
        h0(true);
        z0(false);
        ((f) z0Var2.b).clear();
        ((i) z0Var2.c).b();
        int[] iArr = this.B0;
        int i26 = iArr[0];
        int i27 = iArr[1];
        I(iArr);
        if ((iArr[0] == i26 && iArr[1] == i27) ? false : true) {
            x(0, 0);
        }
        if (this.p0 && this.w != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j3 = z0Var.m;
            if (j3 != -1 && (z10 = this.w.b) && z10) {
                int E = this.e.E();
                c1Var = null;
                int i28 = 0;
                while (true) {
                    if (i28 >= E) {
                        break;
                    }
                    c1 U3 = U(this.e.D(i28));
                    if (U3 != null && !U3.j() && U3.e == j3) {
                        if (!((ArrayList) this.e.b).contains(U3.a)) {
                            c1Var = U3;
                            break;
                        }
                        c1Var = U3;
                    }
                    i28++;
                }
            } else {
                c1Var = null;
            }
            if (c1Var != null) {
                View view3 = c1Var.a;
                if (!((ArrayList) this.e.b).contains(view3) && view3.hasFocusable()) {
                    view2 = view3;
                    if (view2 != null) {
                        int i29 = z0Var.n;
                        if (i29 != -1 && (findViewById = view2.findViewById(i29)) != null && findViewById.isFocusable()) {
                            view2 = findViewById;
                        }
                        view2.requestFocus();
                    }
                }
            }
            if (this.e.y() > 0) {
                int i30 = z0Var.l;
                if (i30 == -1) {
                    i30 = 0;
                }
                int b10 = z0Var.b();
                for (int i31 = i30; i31 < b10; i31++) {
                    c1 K = K(i31);
                    if (K == null) {
                        break;
                    }
                    View view4 = K.a;
                    if (view4.hasFocusable()) {
                        view2 = view4;
                        break;
                    }
                }
                int min = Math.min(b10, i30) - 1;
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s0(int i10, int i11, MotionEvent motionEvent) {
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        p();
        h0 h0Var = this.w;
        int[] iArr = this.I0;
        if (h0Var != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            t0(i10, i11, iArr);
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
        if (!this.y.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        w(i12, i13, i14, i15, this.D0, 0, iArr);
        int i16 = i14 - iArr[0];
        int i17 = i15 - iArr[1];
        int i18 = this.i0;
        int[] iArr2 = this.D0;
        int i19 = iArr2[0];
        this.i0 = i18 - i19;
        int i20 = this.j0;
        int i21 = iArr2[1];
        this.j0 = i20 - i21;
        if (motionEvent != null) {
            motionEvent.offsetLocation(i19, i21);
        }
        int[] iArr3 = this.E0;
        iArr3[0] = iArr3[0] + iArr2[0];
        iArr3[1] = iArr3[1] + iArr2[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x10 = motionEvent.getX();
                float f7 = i16;
                float y3 = motionEvent.getY();
                float f10 = i17;
                if (f7 < 0.0f) {
                    z();
                    b.a(this.V, (-f7) / getWidth(), 1.0f - (y3 / getHeight()));
                } else if (f7 > 0.0f) {
                    A();
                    b.a(this.a0, f7 / getWidth(), y3 / getHeight());
                } else {
                    z10 = false;
                    if (f10 >= 0.0f) {
                        B();
                        b.a(this.W, (-f10) / getHeight(), x10 / getWidth());
                    } else {
                        if (f10 > 0.0f) {
                            y();
                            b.a(this.b0, f10 / getHeight(), 1.0f - (x10 / getWidth()));
                        }
                        if (!z10 || f7 != 0.0f || f10 != 0.0f) {
                            WeakHashMap weakHashMap = i0.a;
                            postInvalidateOnAnimation();
                        }
                    }
                    z10 = true;
                    if (!z10) {
                    }
                    WeakHashMap weakHashMap2 = i0.a;
                    postInvalidateOnAnimation();
                }
                z10 = true;
                if (f10 >= 0.0f) {
                }
                z10 = true;
                if (!z10) {
                }
                WeakHashMap weakHashMap22 = i0.a;
                postInvalidateOnAnimation();
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

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        o0 o0Var = this.x;
        if (o0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.L) {
            return;
        }
        boolean d = o0Var.d();
        boolean e7 = this.x.e();
        if (d || e7) {
            if (!d) {
                i10 = 0;
            }
            if (!e7) {
                i11 = 0;
            }
            s0(i10, i11, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!b0()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.N |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(e1 e1Var) {
        this.A0 = e1Var;
        i0.k(this, e1Var);
    }

    public void setAdapter(h0 h0Var) {
        setLayoutFrozen(false);
        h0 h0Var2 = this.w;
        p1 p1Var = this.a;
        if (h0Var2 != null) {
            h0Var2.a.unregisterObserver(p1Var);
            this.w.getClass();
        }
        o0();
        a aVar = this.d;
        aVar.m((ArrayList) aVar.d);
        aVar.m((ArrayList) aVar.e);
        aVar.b = 0;
        h0 h0Var3 = this.w;
        this.w = h0Var;
        if (h0Var != null) {
            h0Var.B(p1Var);
        }
        o0 o0Var = this.x;
        if (o0Var != null) {
            o0Var.Q();
        }
        this.b.d(h0Var3, this.w);
        this.t0.f = true;
        m0(false);
        requestLayout();
    }

    public void setAdditionalDebugInfo(String str) {
        this.M0 = str;
    }

    public void setBottomGlowOffset(int i10) {
        this.G0 = i10;
    }

    public void setChildDrawingOrderCallback(k0 k0Var) {
        if (k0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(k0Var != null);
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

    public void setEdgeEffectFactory(l0 l0Var) {
        l0Var.getClass();
        this.U = l0Var;
        this.b0 = null;
        this.W = null;
        this.a0 = null;
        this.V = null;
    }

    public void setGlowColor(int i10) {
        this.H0 = Integer.valueOf(i10);
    }

    public void setHasFixedSize(boolean z10) {
        this.H = z10;
    }

    public void setItemAnimator(m0 m0Var) {
        m0 m0Var2 = this.c0;
        if (m0Var2 != null) {
            m0Var2.g();
            this.c0.a = null;
        }
        this.c0 = m0Var;
        if (m0Var != null) {
            m0Var.a = this.y0;
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

    public void setLayoutManager(o0 o0Var) {
        if (o0Var == this.x) {
            return;
        }
        B0();
        o0 o0Var2 = this.x;
        e eVar = this.b;
        if (o0Var2 != null) {
            m0 m0Var = this.c0;
            if (m0Var != null) {
                m0Var.g();
            }
            this.x.g0(eVar);
            this.x.h0(eVar);
            ((ArrayList) eVar.c).clear();
            eVar.e();
            if (this.G) {
                this.x.getClass();
            }
            this.x.t0(null);
            this.x = null;
        } else {
            ((ArrayList) eVar.c).clear();
            eVar.e();
        }
        this.e.L();
        this.x = o0Var;
        if (o0Var != null) {
            if (o0Var.b != null) {
                throw new IllegalArgumentException("LayoutManager " + o0Var + " is already attached to a RecyclerView:" + o0Var.b.C());
            }
            o0Var.t0(this);
            if (this.G) {
                this.x.getClass();
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
        k scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = i0.a;
            a0.k(viewGroup);
        }
        scrollingChildHelper.d = z10;
    }

    @Deprecated
    public void setOnScrollListener(s0 s0Var) {
        this.u0 = s0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.p0 = z10;
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
            b1 b1Var = this.q0;
            RecyclerView recyclerView = b1Var.h;
            if (recyclerView.N0) {
                recyclerView.removeCallbacks(b1Var);
                b1Var.c.abortAnimation();
            }
            o0 o0Var = this.x;
            if (o0Var != null && (y0Var = o0Var.e) != null) {
                y0Var.h();
            }
        }
        o0 o0Var2 = this.x;
        if (o0Var2 != null) {
            o0Var2.f0();
        }
        j0(i10);
        s0 s0Var = this.u0;
        if (s0Var != null) {
            s0Var.a(this, i10);
        }
        ArrayList arrayList = this.v0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((s0) this.v0.get(size)).a(this, i10);
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
        this.F0 = i10;
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
                B0();
                return;
            }
            this.L = false;
            if (this.K && this.x != null && this.w != null) {
                requestLayout();
            }
            this.K = false;
        }
    }

    public final void t() {
        i1 i1Var;
        View F;
        boolean z10;
        s4.z0 z0Var = this.t0;
        z0Var.a(1);
        D(z0Var);
        z0Var.i = false;
        y0();
        z0 z0Var2 = this.f;
        f fVar = (f) z0Var2.b;
        f fVar2 = (f) z0Var2.b;
        fVar.clear();
        i iVar = (i) z0Var2.c;
        iVar.b();
        g0();
        if (this.Q) {
            a aVar = this.d;
            aVar.m((ArrayList) aVar.d);
            aVar.m((ArrayList) aVar.e);
            aVar.b = 0;
            if (this.R) {
                this.x.W(this);
            }
        }
        if (this.c0 == null || !this.x.y0()) {
            this.d.d();
        } else {
            this.d.l();
        }
        boolean z11 = this.w0 || this.x0;
        boolean z12 = this.I && this.c0 != null && ((z10 = this.Q) || z11 || this.x.f) && (!z10 || this.w.b);
        z0Var.j = z12;
        z0Var.k = z12 && z11 && !this.Q && this.c0 != null && this.x.y0();
        c1 c1Var = null;
        View focusedChild = (this.p0 && hasFocus() && this.w != null) ? getFocusedChild() : null;
        if (focusedChild != null && (F = F(focusedChild)) != null) {
            c1Var = T(F);
        }
        if (c1Var == null) {
            z0Var.m = -1L;
            z0Var.l = -1;
            z0Var.n = -1;
        } else {
            z0Var.m = this.w.b ? c1Var.e : -1L;
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
        z0Var.h = z0Var.j && this.x0;
        this.x0 = false;
        this.w0 = false;
        z0Var.g = z0Var.k;
        z0Var.e = this.w.h();
        I(this.B0);
        if (z0Var.j) {
            int y3 = this.e.y();
            for (int i10 = 0; i10 < y3; i10++) {
                c1 U = U(this.e.x(i10));
                if (!U.r() && (!U.h() || this.w.b)) {
                    b2.q0 l4 = this.c0.l(z0Var, U, m0.b(U), U.d());
                    i1 i1Var2 = (i1) fVar2.get(U);
                    if (i1Var2 == null) {
                        i1Var2 = i1.a();
                        fVar2.put(U, i1Var2);
                    }
                    i1Var2.b = l4;
                    i1Var2.a |= 4;
                    if (z0Var.h && U.m() && !U.j() && !U.r() && !U.h()) {
                        iVar.k(U, Q(U));
                    }
                }
            }
        }
        if (z0Var.k) {
            int E = this.e.E();
            for (int i11 = 0; i11 < E; i11++) {
                c1 U2 = U(this.e.D(i11));
                if (!U2.r()) {
                    if (U2.d == -1) {
                        U2.d = U2.c;
                    }
                    U2.h = U2.c;
                }
            }
            boolean z13 = z0Var.f;
            z0Var.f = false;
            this.x.b0(this.b, z0Var);
            z0Var.f = z13;
            for (int i12 = 0; i12 < this.e.y(); i12++) {
                c1 U3 = U(this.e.x(i12));
                if (!U3.r() && ((i1Var = (i1) fVar2.get(U3)) == null || (i1Var.a & 4) == 0)) {
                    int b10 = m0.b(U3);
                    boolean e7 = U3.e(8192);
                    if (!e7) {
                        b10 |= 4096;
                    }
                    b2.q0 l10 = this.c0.l(z0Var, U3, b10, U3.d());
                    if (e7) {
                        n0(U3, l10);
                    } else {
                        i1 i1Var3 = (i1) fVar2.get(U3);
                        if (i1Var3 == null) {
                            i1Var3 = i1.a();
                            fVar2.put(U3, i1Var3);
                        }
                        i1Var3.a |= 2;
                        i1Var3.b = l10;
                    }
                }
            }
            n();
        } else {
            n();
        }
        h0(true);
        z0(false);
        z0Var.d = 2;
    }

    public final void t0(int i10, int i11, int[] iArr) {
        c1 c1Var;
        y0();
        g0();
        int i12 = g.a;
        Trace.beginSection("RV Scroll");
        s4.z0 z0Var = this.t0;
        D(z0Var);
        e eVar = this.b;
        int m0 = i10 != 0 ? this.x.m0(i10, eVar, z0Var) : 0;
        int o02 = i11 != 0 ? this.x.o0(i11, eVar, z0Var) : 0;
        Trace.endSection();
        t tVar = this.e;
        int y3 = tVar.y();
        for (int i13 = 0; i13 < y3; i13++) {
            View x10 = tVar.x(i13);
            c1 T = T(x10);
            if (T != null && (c1Var = T.k) != null) {
                View view = c1Var.a;
                int left = x10.getLeft();
                int top = x10.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        h0(true);
        z0(false);
        if (iArr != null) {
            iArr[0] = m0;
            iArr[1] = o02;
        }
    }

    public final void u() {
        y0();
        g0();
        s4.z0 z0Var = this.t0;
        z0Var.a(6);
        this.d.d();
        z0Var.e = this.w.h();
        z0Var.c = 0;
        z0Var.g = false;
        this.x.b0(this.b, z0Var);
        z0Var.f = false;
        this.c = null;
        z0Var.j = z0Var.j && this.c0 != null;
        z0Var.d = 4;
        h0(true);
        z0(false);
    }

    public final void u0(int i10) {
        if (this.L) {
            return;
        }
        B0();
        o0 o0Var = this.x;
        if (o0Var == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            o0Var.n0(i10);
            awakenScrollBars();
        }
    }

    public boolean v(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, i12, iArr, iArr2);
    }

    public final void v0(int i10, int i11, Interpolator interpolator) {
        o0 o0Var = this.x;
        if (o0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.L) {
            return;
        }
        if (!o0Var.d()) {
            i10 = 0;
        }
        if (!this.x.e()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.q0.b(i10, i11, TLObject.FLAG_31, interpolator);
    }

    public final void w(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().d(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public final void w0(int i10, int i11, Interpolator interpolator) {
        if (this.x == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.L) {
            return;
        }
        if (!this.x.e()) {
            i10 = 0;
        }
        if (i10 != 0) {
            this.q0.b(0, i10, i11, interpolator);
        }
    }

    public final void x(int i10, int i11) {
        this.T++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        k0(i10, i11);
        s0 s0Var = this.u0;
        if (s0Var != null) {
            s0Var.b(this, i10, i11);
        }
        ArrayList arrayList = this.v0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((s0) this.v0.get(size)).b(this, i10, i11);
            }
        }
        this.T--;
    }

    public final void x0(int i10) {
        if (this.L) {
            return;
        }
        o0 o0Var = this.x;
        if (o0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            o0Var.v0(this, this.t0, i10);
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

    public final void y0() {
        int i10 = this.J + 1;
        this.J = i10;
        if (i10 != 1 || this.L) {
            return;
        }
        this.K = false;
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

    public final void z0(boolean z10) {
        if (this.J < 1) {
            this.J = 1;
        }
        if (!z10 && !this.L) {
            this.K = false;
        }
        if (this.J == 1) {
            if (z10 && this.K && !this.L && this.x != null && this.w != null) {
                s();
            }
            if (!this.L) {
                this.K = false;
            }
        }
        this.J--;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        float a2;
        float a10;
        this.a = new p1(this, 2);
        this.b = new e(this);
        this.f = new z0(16);
        this.n = new g0(this, 0);
        this.r = new Rect();
        this.s = new Rect();
        this.v = new RectF();
        this.y = new ArrayList();
        this.E = new ArrayList();
        this.J = 0;
        this.Q = false;
        this.R = false;
        this.S = 0;
        this.T = 0;
        this.U = new l0();
        this.c0 = new j();
        this.d0 = 0;
        this.e0 = -1;
        this.n0 = Float.MIN_VALUE;
        this.o0 = Float.MIN_VALUE;
        int i11 = 1;
        this.p0 = true;
        this.q0 = new b1(this);
        this.s0 = S0 ? new h() : null;
        s4.z0 z0Var = new s4.z0();
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
        this.t0 = z0Var;
        this.w0 = false;
        this.x0 = false;
        k2.g0 g0Var = new k2.g0(this, 21);
        this.y0 = g0Var;
        this.z0 = false;
        this.B0 = new int[2];
        this.D0 = new int[2];
        this.E0 = new int[2];
        this.F0 = 0;
        this.G0 = 0;
        this.H0 = null;
        this.I0 = new int[2];
        this.J0 = new ArrayList();
        this.K0 = new g0(this, i11);
        this.L0 = new u4(this, 23);
        this.N0 = true;
        this.O0 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, P0, i10, 0);
            this.h = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.h = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.k0 = viewConfiguration.getScaledTouchSlop();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            Method method = j0.a;
            a2 = c2.d.f(viewConfiguration);
        } else {
            a2 = j0.a(viewConfiguration, context);
        }
        this.n0 = a2;
        if (i12 >= 26) {
            a10 = c2.d.g(viewConfiguration);
        } else {
            a10 = j0.a(viewConfiguration, context);
        }
        this.o0 = a10;
        this.l0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.m0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.c0.a = g0Var;
        this.d = new a(new ih.h(this));
        this.e = new t(new d(this, 25));
        WeakHashMap weakHashMap = i0.a;
        if ((i12 >= 26 ? r0.c0.a(this) : 0) == 0 && i12 >= 26) {
            r0.c0.b(this, 8);
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
        o0 o0Var = this.x;
        if (o0Var != null) {
            return o0Var.p(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + C());
    }

    public void f0(View view) {
    }

    public void j0(int i10) {
    }

    public void setOnFlingListener(q0 q0Var) {
    }

    public void setRecyclerListener(v0 v0Var) {
    }

    public void k0(int i10, int i11) {
    }
}
