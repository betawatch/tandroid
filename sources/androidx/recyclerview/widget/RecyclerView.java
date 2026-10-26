package androidx.recyclerview.widget;

import a0.h;
import a1.g;
import a5.c;
import a8.lg;
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
import b2.v0;
import c2.j;
import e2.f;
import ig.o1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jg.i;
import li.h5;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import q0.a;
import r0.a0;
import r0.i0;
import r0.j0;
import r0.k;
import rf.e;
import s4.a1;
import s4.b;
import s4.b0;
import s4.b1;
import s4.c0;
import s4.c1;
import s4.d;
import s4.d1;
import s4.e1;
import s4.f1;
import s4.g0;
import s4.g1;
import s4.h0;
import s4.k0;
import s4.k1;
import s4.l;
import s4.l0;
import s4.m0;
import s4.n0;
import s4.p0;
import s4.q0;
import s4.r;
import s4.r0;
import s4.s0;
import s4.t0;
import s4.u0;
import s4.w0;
import s4.x0;
import s4.y0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] Q0 = {R.attr.clipToPadding};
    public static final c R0 = new c(5);
    public boolean A0;
    public f1 B0;
    public final int[] C0;
    public k D0;
    public final ArrayList E;
    public final int[] E0;
    public t0 F;
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
    public final g0 L0;
    public boolean M;
    public final i M0;
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
    public l0 U;
    public EdgeEffect V;
    public EdgeEffect W;
    public final o1 a;
    public EdgeEffect a0;
    public final e b;
    public EdgeEffect b0;
    public y0 c;
    public m0 c0;
    public final b d;
    public int d0;
    public final d e;
    public int e0;
    public final m4.c f;
    public VelocityTracker f0;
    public int g0;
    public boolean h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public s0 l0;
    public final int m0;
    public final g0 n;
    public final int n0;
    public final float o0;
    public final float p0;
    public boolean q0;
    public final Rect r;
    public final d1 r0;
    public final Rect s;
    public r s0;
    public final f t0;
    public final b1 u0;
    public final RectF v;
    public u0 v0;
    public h0 w;
    public ArrayList w0;
    public p0 x;
    public boolean x0;
    public final ArrayList y;
    public boolean y0;
    public final h5 z0;

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
        e1 U = U(view);
        if (U != null) {
            return U.b();
        }
        return -1;
    }

    public static int S(View view) {
        e1 U = U(view);
        if (U != null) {
            return U.c();
        }
        return -1;
    }

    public static e1 U(View view) {
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof q0) {
            return ((q0) layoutParams).a;
        }
        return null;
    }

    private k getScrollingChildHelper() {
        if (this.D0 == null) {
            this.D0 = new k(this);
        }
        return this.D0;
    }

    public static void m(e1 e1Var) {
        WeakReference weakReference = e1Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == e1Var.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            e1Var.b = null;
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
            if (z10 && this.K && !this.L && this.x != null && this.w != null) {
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
        sb3.append(this.w);
        sb3.append(", layout:");
        sb3.append(this.x);
        sb3.append(", context:");
        sb3.append(getContext());
        sb3.append(", ainfo:");
        sb3.append(this.N0);
        ArrayList arrayList = (ArrayList) this.d.f;
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
        a1 a1Var;
        setScrollState(0);
        d1 d1Var = this.r0;
        RecyclerView recyclerView = d1Var.h;
        if (recyclerView.O0) {
            recyclerView.removeCallbacks(d1Var);
            d1Var.c.abortAnimation();
        }
        p0 p0Var = this.x;
        if (p0Var == null || (a1Var = p0Var.e) == null) {
            return;
        }
        a1Var.h();
    }

    public final void D(b1 b1Var) {
        if (getScrollState() != 2) {
            b1Var.getClass();
            return;
        }
        OverScroller overScroller = this.r0.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        b1Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View E(float f7, float f10) {
        for (int k10 = this.e.k() - 1; k10 >= 0; k10--) {
            View j10 = this.e.j(k10);
            float translationX = j10.getTranslationX();
            float translationY = j10.getTranslationY();
            if (f7 >= j10.getLeft() + translationX && f7 <= j10.getRight() + translationX && f10 >= j10.getTop() + translationY && f10 <= j10.getBottom() + translationY) {
                return j10;
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

    public final e1 G(View view) {
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
            t0 t0Var = (t0) arrayList.get(i10);
            if (t0Var.b(this, motionEvent) && action != 3) {
                this.F = t0Var;
                return true;
            }
        }
        return false;
    }

    public final void I(int[] iArr) {
        int k10 = this.e.k();
        if (k10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i11 = TLObject.FLAG_31;
        for (int i12 = 0; i12 < k10; i12++) {
            e1 U = U(this.e.j(i12));
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

    public final e1 K(int i10) {
        e1 e1Var = null;
        if (this.Q) {
            return null;
        }
        int o10 = this.e.o();
        for (int i11 = 0; i11 < o10; i11++) {
            e1 U = U(this.e.n(i11));
            if (U != null && !U.j() && N(U) == i10) {
                if (!((ArrayList) this.e.d).contains(U.a)) {
                    return U;
                }
                e1Var = U;
            }
        }
        return e1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e1 L(int i10, boolean z10) {
        int o10 = this.e.o();
        e1 e1Var = null;
        for (int i11 = 0; i11 < o10; i11++) {
            e1 U = U(this.e.n(i11));
            if (U != null && !U.j()) {
                if (z10) {
                    if (U.c != i10) {
                        continue;
                    }
                    if (((ArrayList) this.e.d).contains(U.a)) {
                        return U;
                    }
                    e1Var = U;
                } else {
                    if (U.c() != i10) {
                        continue;
                    }
                    if (((ArrayList) this.e.d).contains(U.a)) {
                    }
                }
            }
        }
        return e1Var;
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

    public final int N(e1 e1Var) {
        if (e1Var.e(524) || !e1Var.g()) {
            return -1;
        }
        int i10 = e1Var.c;
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
        return ((e1) ((ArrayList) eVar.c).get(i10)).a;
    }

    public final View P(int i10) {
        if (i10 < 0) {
            return null;
        }
        e eVar = this.b;
        if (i10 >= ((ArrayList) eVar.e).size()) {
            return null;
        }
        return ((e1) ((ArrayList) eVar.e).get(i10)).a;
    }

    public final long Q(e1 e1Var) {
        return this.w.b ? e1Var.e : e1Var.c;
    }

    public final e1 T(View view) {
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
        q0 q0Var = (q0) view.getLayoutParams();
        boolean z10 = q0Var.c;
        Rect rect = q0Var.b;
        if (z10) {
            b1 b1Var = this.u0;
            if (!b1Var.g || (!q0Var.a.m() && !q0Var.a.h())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.y;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Rect rect2 = this.r;
                    rect2.set(0, 0, 0, 0);
                    ((n0) arrayList.get(i10)).d(rect2, view, this, b1Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                q0Var.c = false;
                return rect;
            }
        }
        return rect;
    }

    public final n0 X(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 < 0 || i10 >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(g.k(i10, itemDecorationCount, " is an invalid index for size "));
        }
        return (n0) this.y.get(i10);
    }

    public final void Y(long j10, e1 e1Var, e1 e1Var2) {
        int k10 = this.e.k();
        for (int i10 = 0; i10 < k10; i10++) {
            e1 U = U(this.e.j(i10));
            if (U != e1Var && Q(U) == j10) {
                h0 h0Var = this.w;
                if (h0Var == null || !h0Var.b) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + U + " \n View Holder 2:" + e1Var + C());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + U + " \n View Holder 2:" + e1Var + C());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + e1Var2 + " cannot be found but it is necessary for " + e1Var + C());
    }

    public final boolean Z() {
        return !this.I || this.Q || this.d.h();
    }

    public final void a0() {
        if (this.y.size() == 0) {
            return;
        }
        p0 p0Var = this.x;
        if (p0Var != null) {
            p0Var.b("Cannot invalidate item decorations during a scroll or layout");
        }
        e0();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        p0 p0Var = this.x;
        if (p0Var != null) {
            p0Var.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final boolean b0() {
        m0 m0Var = this.c0;
        return m0Var != null && m0Var.k();
    }

    public final boolean c0() {
        return this.S > 0;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q0) && this.x.f((q0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        p0 p0Var = this.x;
        if (p0Var == null || !p0Var.d()) {
            return 0;
        }
        return ((c0) this.x).B0(this.u0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        p0 p0Var = this.x;
        if (p0Var != null && p0Var.d()) {
            return this.x.h(this.u0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        p0 p0Var = this.x;
        if (p0Var != null && p0Var.d()) {
            return this.x.i(this.u0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        p0 p0Var = this.x;
        if (p0Var != null && p0Var.e()) {
            return this.x.j(this.u0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        p0 p0Var = this.x;
        if (p0Var != null && p0Var.e()) {
            return this.x.k(this.u0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        p0 p0Var = this.x;
        if (p0Var != null && p0Var.e()) {
            return this.x.l(this.u0);
        }
        return 0;
    }

    public final void d0(int i10) {
        if (this.x == null) {
            return;
        }
        setScrollState(2);
        this.x.n0(i10);
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
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ((n0) arrayList.get(i10)).g(canvas, this);
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
            WeakHashMap weakHashMap = i0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e0() {
        int o10 = this.e.o();
        for (int i10 = 0; i10 < o10; i10++) {
            ((q0) this.e.n(i10).getLayoutParams()).c = true;
        }
        ArrayList arrayList = (ArrayList) this.b.e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            q0 q0Var = (q0) ((e1) arrayList.get(i11)).a.getLayoutParams();
            if (q0Var != null) {
                q0Var.c = true;
            }
        }
    }

    public final void f0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int o10 = this.e.o();
        for (int i13 = 0; i13 < o10; i13++) {
            e1 U = U(this.e.n(i13));
            if (U != null && !U.r()) {
                int i14 = U.c;
                b1 b1Var = this.u0;
                if (i14 >= i12) {
                    U.n(-i11, z10);
                    b1Var.f = true;
                } else if (i14 >= i10) {
                    U.a(8);
                    U.n(-i11, z10);
                    U.c = i10 - 1;
                    b1Var.f = true;
                }
            }
        }
        e eVar = this.b;
        ArrayList arrayList = (ArrayList) eVar.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e1 e1Var = (e1) arrayList.get(size);
            if (e1Var != null) {
                int i15 = e1Var.c;
                if (i15 >= i12) {
                    e1Var.n(-i11, z10);
                } else if (i15 >= i10) {
                    e1Var.a(8);
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
        this.x.getClass();
        boolean z11 = true;
        boolean z12 = (this.w == null || this.x == null || c0() || this.L) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        b1 b1Var = this.u0;
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
                            z0();
                            this.x.R(view, i10, eVar, b1Var);
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
                RecyclerView recyclerView2 = this.x.b;
                WeakHashMap weakHashMap2 = i0.a;
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
                    view2 = this.x.R(view, i10, eVar, b1Var);
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
                    RecyclerView recyclerView3 = this.x.b;
                    WeakHashMap weakHashMap3 = i0.a;
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
        p0 p0Var = this.x;
        if (p0Var != null) {
            return p0Var.n();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + C());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p0 p0Var = this.x;
        if (p0Var != null) {
            return p0Var.o(getContext(), attributeSet);
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
        p0 p0Var = this.x;
        if (p0Var == null) {
            return super.getBaseline();
        }
        p0Var.getClass();
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

    public f1 getCompatAccessibilityDelegate() {
        return this.B0;
    }

    public float getCurrentVelocity() {
        VelocityTracker velocityTracker = this.f0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.n0);
        return this.f0.getYVelocity();
    }

    public l0 getEdgeEffectFactory() {
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

    public m0 getItemAnimator() {
        return this.c0;
    }

    public int getItemDecorationCount() {
        return this.y.size();
    }

    public p0 getLayoutManager() {
        return this.x;
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

    public s0 getOnFlingListener() {
        return this.l0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.q0;
    }

    public w0 getRecycledViewPool() {
        return this.b.c();
    }

    public int getScrollState() {
        return this.d0;
    }

    public int getTopGlowOffset() {
        return this.G0;
    }

    public final void h(e1 e1Var) {
        View view = e1Var.a;
        boolean z10 = view.getParent() == this;
        this.b.k(T(view));
        if (e1Var.l()) {
            this.e.h(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z10) {
            this.e.g(view, -1, true);
            return;
        }
        d dVar = this.e;
        int indexOfChild = ((RecyclerView) ((jg.s0) dVar.b).b).indexOfChild(view);
        if (indexOfChild >= 0) {
            ((lg) dVar.c).D(indexOfChild);
            dVar.p(view);
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

    public final void i(n0 n0Var) {
        p0 p0Var = this.x;
        if (p0Var != null) {
            p0Var.b("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.y;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(n0Var);
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
                    e1 e1Var = (e1) arrayList.get(size);
                    if (e1Var.a.getParent() == this && !e1Var.r() && (i10 = e1Var.s) != -1) {
                        View view = e1Var.a;
                        WeakHashMap weakHashMap = i0.a;
                        view.setImportantForAccessibility(i10);
                        e1Var.s = -1;
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

    public final void j(u0 u0Var) {
        if (this.w0 == null) {
            this.w0 = new ArrayList();
        }
        this.w0.add(u0Var);
    }

    public final void j0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.e0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.e0 = motionEvent.getPointerId(i10);
            int x9 = (int) (motionEvent.getX(i10) + 0.5f);
            this.i0 = x9;
            this.g0 = x9;
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
        WeakHashMap weakHashMap = i0.a;
        postOnAnimation(this.L0);
        this.A0 = true;
    }

    public final void n() {
        int o10 = this.e.o();
        for (int i10 = 0; i10 < o10; i10++) {
            e1 U = U(this.e.n(i10));
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
            e1 e1Var = (e1) arrayList2.get(i11);
            e1Var.d = -1;
            e1Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            e1 e1Var2 = (e1) arrayList.get(i12);
            e1Var2.d = -1;
            e1Var2.g = -1;
        }
        ArrayList arrayList3 = (ArrayList) eVar.d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                e1 e1Var3 = (e1) ((ArrayList) eVar.d).get(i13);
                e1Var3.d = -1;
                e1Var3.g = -1;
            }
        }
    }

    public final void n0(boolean z10) {
        this.R = z10 | this.R;
        this.Q = true;
        int o10 = this.e.o();
        for (int i10 = 0; i10 < o10; i10++) {
            e1 U = U(this.e.n(i10));
            if (U != null && !U.r()) {
                U.a(6);
            }
        }
        e0();
        e eVar = this.b;
        ArrayList arrayList = (ArrayList) eVar.e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            e1 e1Var = (e1) arrayList.get(i11);
            if (e1Var != null) {
                e1Var.a(6);
                e1Var.a(1024);
            }
        }
        h0 h0Var = ((RecyclerView) eVar.h).w;
        if (h0Var == null || !h0Var.b) {
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
            WeakHashMap weakHashMap = i0.a;
            postInvalidateOnAnimation();
        }
    }

    public final void o0(e1 e1Var, v0 v0Var) {
        e1Var.p(0, 8192);
        boolean z10 = this.u0.h;
        m4.c cVar = this.f;
        if (z10 && e1Var.m() && !e1Var.j() && !e1Var.r()) {
            ((h) cVar.c).k(e1Var, Q(e1Var));
        }
        a0.f fVar = (a0.f) cVar.b;
        k1 k1Var = (k1) fVar.get(e1Var);
        if (k1Var == null) {
            k1Var = k1.a();
            fVar.put(e1Var, k1Var);
        }
        k1Var.b = v0Var;
        k1Var.a |= 4;
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
        p0 p0Var = this.x;
        if (p0Var != null) {
            p0Var.getClass();
        }
        this.A0 = false;
        ThreadLocal threadLocal = r.e;
        r rVar = (r) threadLocal.get();
        this.s0 = rVar;
        if (rVar == null) {
            r rVar2 = new r();
            rVar2.a = new ArrayList();
            rVar2.d = new ArrayList();
            this.s0 = rVar2;
            WeakHashMap weakHashMap = i0.a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f7 = display.getRefreshRate();
            }
            f7 = 60.0f;
            r rVar3 = this.s0;
            rVar3.c = (long) (1.0E9f / f7);
            threadLocal.set(rVar3);
        }
        this.s0.a.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m0 m0Var = this.c0;
        if (m0Var != null) {
            m0Var.g();
        }
        C0();
        this.G = false;
        this.K0.clear();
        removeCallbacks(this.L0);
        this.f.getClass();
        while (k1.d.a() != null) {
        }
        r rVar = this.s0;
        if (rVar != null) {
            rVar.a.remove(this);
            this.s0 = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((n0) arrayList.get(i10)).e(canvas, this);
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
                    if (this.x.e()) {
                        f7 = -axisValue;
                        f10 = 0.0f;
                        if (f7 == 0.0f) {
                        }
                        t0((int) (f10 * this.o0), (int) (f7 * this.p0), motionEvent);
                    } else if (this.x.d()) {
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
            p0 p0Var = this.x;
            if (p0Var != null) {
                boolean d = p0Var.d();
                boolean e = this.x.e();
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
                    int x9 = (int) (motionEvent.getX() + 0.5f);
                    this.i0 = x9;
                    this.g0 = x9;
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
                    int x10 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y10 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.d0 != 1) {
                        int i11 = x10 - this.g0;
                        int i12 = y10 - this.h0;
                        if (d == 0 || Math.abs(i11) <= this.k0) {
                            z10 = false;
                        } else {
                            this.i0 = x10;
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
                    int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.i0 = x11;
                    this.g0 = x11;
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
        if (this.x == null) {
            q(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        p0 p0Var = this.x;
        e eVar = this.b;
        b1 b1Var = this.u0;
        p0Var.d0(eVar, b1Var, i10, i11);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.w == null) {
            return;
        }
        if (b1Var.d == 1) {
            t();
        }
        this.x.q0(i10, i11);
        b1Var.i = true;
        u();
        this.x.s0(i10, i11);
        c0 c0Var = (c0) this.x;
        if (c0Var.l == 1073741824 || c0Var.k == 1073741824) {
            return;
        }
        int r6 = c0Var.r();
        for (int i12 = 0; i12 < r6; i12++) {
            ViewGroup.LayoutParams layoutParams = c0Var.q(i12).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                this.x.q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                b1Var.i = true;
                u();
                this.x.s0(i10, i11);
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
        if (!(parcelable instanceof y0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y0 y0Var = (y0) parcelable;
        this.c = y0Var;
        super.onRestoreInstanceState(y0Var.a);
        p0 p0Var = this.x;
        if (p0Var == null || (parcelable2 = this.c.c) == null) {
            return;
        }
        c0 c0Var = (c0) p0Var;
        if (parcelable2 instanceof b0) {
            c0Var.B = (b0) parcelable2;
            c0Var.l0();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        y0 y0Var = new y0(super.onSaveInstanceState());
        y0 y0Var2 = this.c;
        if (y0Var2 != null) {
            y0Var.c = y0Var2.c;
            return y0Var;
        }
        p0 p0Var = this.x;
        if (p0Var != null) {
            y0Var.c = p0Var.e0();
            return y0Var;
        }
        y0Var.c = null;
        return y0Var;
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
            t0 t0Var = this.F;
            if (t0Var == null) {
                z10 = motionEvent.getAction() == 0 ? false : H(motionEvent);
            } else {
                t0Var.a(this, motionEvent);
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
            p0 p0Var = this.x;
            if (p0Var != null) {
                boolean d = p0Var.d();
                boolean e = this.x.e();
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
                    int x9 = (int) (motionEvent.getX() + 0.5f);
                    this.i0 = x9;
                    this.g0 = x9;
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
                        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, i11);
                        float f7 = d != 0 ? -this.f0.getXVelocity(this.e0) : 0.0f;
                        float f10 = e ? -this.f0.getYVelocity(this.e0) : 0.0f;
                        if (f7 != 0.0f || f10 != 0.0f) {
                            int i12 = (int) f7;
                            int i13 = (int) f10;
                            p0 p0Var2 = this.x;
                            if (p0Var2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.L) {
                                int d10 = p0Var2.d();
                                boolean e10 = this.x.e();
                                int i14 = this.m0;
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
                                        s0 s0Var = this.l0;
                                        if (s0Var == null || !s0Var.a(i12, i13)) {
                                            if (z12) {
                                                if (e10) {
                                                    d10 = (d10 == true ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().g(d10, 1);
                                                int i15 = -i11;
                                                int max = Math.max(i15, Math.min(i12, i11));
                                                int max2 = Math.max(i15, Math.min(i13, i11));
                                                d1 d1Var = this.r0;
                                                RecyclerView recyclerView = d1Var.h;
                                                recyclerView.setScrollState(2);
                                                d1Var.b = 0;
                                                d1Var.a = 0;
                                                Interpolator interpolator = d1Var.d;
                                                c cVar = R0;
                                                if (interpolator != cVar) {
                                                    d1Var.d = cVar;
                                                    d1Var.c = new OverScroller(recyclerView.getContext(), cVar);
                                                }
                                                d1Var.c.fling(0, 0, max, max2, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                d1Var.a();
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
                        int x10 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y10 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i16 = this.i0 - x10;
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
                            this.i0 = x10 - iArr3[0];
                            this.j0 = y10 - iArr3[1];
                            if (t0(d != 0 ? i16 : 0, e ? i17 : 0, obtain)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            r rVar = this.s0;
                            if (rVar != null && (i16 != 0 || i17 != 0)) {
                                rVar.a(this, i16, i17);
                            }
                        }
                    } else if (actionMasked == 3) {
                        s0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.e0 = motionEvent.getPointerId(actionIndex);
                        int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.i0 = x11;
                        this.g0 = x11;
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
        b bVar = this.d;
        if (bVar.h()) {
            int i11 = bVar.b;
            if ((i11 & 4) == 0 || (i11 & 11) != 0) {
                if (bVar.h()) {
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
            bVar.l();
            if (!this.K) {
                d dVar = this.e;
                int k10 = dVar.k();
                int i14 = 0;
                while (true) {
                    if (i14 < k10) {
                        e1 U = U(dVar.j(i14));
                        if (U != null && !U.r() && U.m()) {
                            s();
                            break;
                        }
                        i14++;
                    } else {
                        bVar.c();
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
        m0 m0Var = this.c0;
        if (m0Var != null) {
            m0Var.g();
        }
        p0 p0Var = this.x;
        e eVar = this.b;
        if (p0Var != null) {
            p0Var.g0(eVar);
            this.x.h0(eVar);
        }
        ((ArrayList) eVar.c).clear();
        eVar.e();
    }

    public final void q(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = i0.a;
        setMeasuredDimension(p0.g(i10, paddingRight, getMinimumWidth()), p0.g(i11, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void q0(n0 n0Var) {
        p0 p0Var = this.x;
        if (p0Var != null) {
            p0Var.b("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.y;
        arrayList.remove(n0Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        e0();
        requestLayout();
    }

    public final void r(View view) {
        e1 U = U(view);
        h0 h0Var = this.w;
        if (h0Var != null && U != null) {
            h0Var.z(U);
        }
        ArrayList arrayList = this.P;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((r0) this.P.get(size)).a(view);
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
        if (layoutParams instanceof q0) {
            q0 q0Var = (q0) layoutParams;
            if (!q0Var.c) {
                Rect rect2 = q0Var.b;
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

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        e1 U = U(view);
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
        a1 a1Var = this.x.e;
        if ((a1Var == null || !a1Var.e) && !c0() && view2 != null) {
            r0(view, view2);
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
            ((t0) arrayList.get(i10)).c(z10);
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

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0370, code lost:
    
        if (((java.util.ArrayList) r20.e.d).contains(getFocusedChild()) == false) goto L241;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x041d  */
    /* JADX WARN: Type inference failed for: r11v13, types: [int] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        ?? r18;
        k1 k1Var;
        ?? r11;
        boolean r6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        e1 e1Var;
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
        b1 b1Var = this.u0;
        boolean z11 = false;
        b1Var.i = false;
        int i15 = 1;
        if (b1Var.d == 1) {
            t();
            this.x.p0(this);
            u();
        } else {
            b bVar = this.d;
            if ((((ArrayList) bVar.e).isEmpty() || ((ArrayList) bVar.d).isEmpty()) && this.x.m == getWidth() && this.x.n == getHeight()) {
                this.x.p0(this);
            } else {
                this.x.p0(this);
                u();
            }
        }
        b1Var.a(4);
        z0();
        h0();
        b1Var.d = 1;
        boolean z12 = b1Var.j;
        e eVar = this.b;
        m4.c cVar = this.f;
        if (z12) {
            try {
                int k10 = this.e.k() - 1;
                while (k10 >= 0) {
                    e1 U = U(this.e.j(k10));
                    if (U != null && !U.r()) {
                        long Q = Q(U);
                        this.c0.getClass();
                        v0 v0Var = new v0();
                        View view = U.a;
                        v0Var.a = view.getLeft();
                        v0Var.b = view.getTop();
                        view.getRight();
                        view.getBottom();
                        h hVar = (h) cVar.c;
                        a0.f fVar = (a0.f) cVar.b;
                        e1 e1Var2 = (e1) hVar.f(Q);
                        if (e1Var2 == null || e1Var2.r()) {
                            i12 = i15;
                            cVar.a(U, v0Var);
                        } else {
                            k1 k1Var2 = (k1) fVar.get(e1Var2);
                            int i16 = (k1Var2 == null || (k1Var2.a & i15) == 0) ? 0 : i15;
                            k1 k1Var3 = (k1) fVar.get(U);
                            int i17 = (k1Var3 == null || (k1Var3.a & i15) == 0) ? 0 : i15;
                            if (i16 == 0 || e1Var2 != U) {
                                i12 = i15;
                                try {
                                    v0 l02 = cVar.l0(e1Var2, 4);
                                    cVar.a(U, v0Var);
                                    v0 l03 = cVar.l0(U, 8);
                                    if (l02 == null) {
                                        Y(Q, U, e1Var2);
                                    } else {
                                        e1Var2.q(false);
                                        if (i16 != 0) {
                                            h(e1Var2);
                                        }
                                        if (e1Var2 != U) {
                                            if (i17 != 0) {
                                                h(U);
                                            }
                                            e1Var2.j = U;
                                            h(e1Var2);
                                            eVar.k(e1Var2);
                                            U.q(false);
                                            U.k = e1Var2;
                                        }
                                        g1 g1Var = (g1) this.c0;
                                        g1Var.getClass();
                                        int i18 = l02.a;
                                        int i19 = l02.b;
                                        if (U.r()) {
                                            i13 = l02.a;
                                            i14 = l02.b;
                                        } else {
                                            i13 = l03.a;
                                            i14 = l03.b;
                                        }
                                        if (g1Var.q(e1Var2, U, l02, i18, i19, i13, i14)) {
                                            m0();
                                        }
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    StringBuilder sb2 = new StringBuilder();
                                    for (int k11 = this.e.k() - 1; k11 >= 0; k11--) {
                                        e1 U2 = U(this.e.j(k11));
                                        if (U2 != null && !U2.r()) {
                                            sb2.append("Holder at" + k11 + " " + U2 + "\n");
                                        }
                                    }
                                    throw new RuntimeException(sb2.toString(), e);
                                }
                            } else {
                                cVar.a(U, v0Var);
                            }
                        }
                        k10--;
                        i15 = i12;
                    }
                    i12 = i15;
                    k10--;
                    i15 = i12;
                }
                r18 = i15;
                a0.f fVar2 = (a0.f) cVar.b;
                int i20 = fVar2.c - 1;
                while (i20 >= 0) {
                    e1 e1Var3 = (e1) fVar2.e(i20);
                    try {
                        k1Var = (k1) fVar2.f(i20);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        k1Var = null;
                    }
                    if (k1Var != null) {
                        int i21 = k1Var.a;
                        int i22 = i21 & 3;
                        i iVar = this.M0;
                        if (i22 == 3) {
                            iVar.j0(e1Var3);
                        } else if ((i21 & 1) != 0) {
                            v0 v0Var2 = k1Var.b;
                            if (v0Var2 == null) {
                                iVar.j0(e1Var3);
                            } else {
                                iVar.i0(e1Var3, v0Var2, k1Var.c);
                            }
                        } else if ((i21 & 14) == 14) {
                            v0 v0Var3 = k1Var.b;
                            v0 v0Var4 = k1Var.c;
                            RecyclerView recyclerView = (RecyclerView) iVar.a;
                            e1Var3.q(z11);
                            if (recyclerView.c0.a(e1Var3, v0Var3, v0Var4)) {
                                recyclerView.m0();
                            }
                        } else {
                            if ((i21 & 12) == 12) {
                                v0 v0Var5 = k1Var.b;
                                v0 v0Var6 = k1Var.c;
                                iVar.getClass();
                                e1Var3.q(z11);
                                RecyclerView recyclerView2 = (RecyclerView) iVar.a;
                                if (recyclerView2.Q) {
                                    g1 g1Var2 = (g1) recyclerView2.c0;
                                    g1Var2.getClass();
                                    int i23 = v0Var5.a;
                                    int i24 = v0Var5.b;
                                    if (e1Var3.r()) {
                                        i11 = v0Var5.a;
                                        i10 = v0Var5.b;
                                    } else {
                                        int i25 = v0Var6.a;
                                        i10 = v0Var6.b;
                                        i11 = i25;
                                    }
                                    if (g1Var2.q(e1Var3, e1Var3, v0Var5, i23, i24, i11, i10)) {
                                        recyclerView2.m0();
                                    }
                                } else {
                                    g1 g1Var3 = (g1) recyclerView2.c0;
                                    g1Var3.getClass();
                                    int i26 = v0Var5.a;
                                    int i27 = v0Var6.a;
                                    if (i26 == i27 && v0Var5.b == v0Var6.b) {
                                        g1Var3.v(e1Var3);
                                        r6 = false;
                                    } else {
                                        r6 = g1Var3.r(e1Var3, v0Var5, i26, v0Var5.b, i27, v0Var6.b);
                                    }
                                    if (r6) {
                                        recyclerView2.m0();
                                    }
                                }
                            } else if ((i21 & 4) != 0) {
                                iVar.i0(e1Var3, k1Var.b, null);
                            } else if ((i21 & 8) != 0) {
                                v0 v0Var7 = k1Var.b;
                                v0 v0Var8 = k1Var.c;
                                RecyclerView recyclerView3 = (RecyclerView) iVar.a;
                                r11 = 0;
                                r11 = 0;
                                e1Var3.q(false);
                                if (recyclerView3.c0.a(e1Var3, v0Var7, v0Var8)) {
                                    recyclerView3.m0();
                                }
                                k1Var.a = r11;
                                k1Var.b = null;
                                k1Var.c = null;
                                k1.d.r(k1Var);
                            }
                            r11 = 0;
                            k1Var.a = r11;
                            k1Var.b = null;
                            k1Var.c = null;
                            k1.d.r(k1Var);
                        }
                        r11 = z11;
                        k1Var.a = r11;
                        k1Var.b = null;
                        k1Var.c = null;
                        k1.d.r(k1Var);
                    }
                    i20--;
                    z11 = false;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } else {
            r18 = 1;
        }
        View view2 = null;
        this.x.h0(eVar);
        b1Var.b = b1Var.e;
        this.Q = false;
        this.R = false;
        b1Var.j = false;
        b1Var.k = false;
        this.x.f = false;
        ArrayList arrayList = (ArrayList) eVar.d;
        if (arrayList != null) {
            arrayList.clear();
        }
        p0 p0Var = this.x;
        if (p0Var.j) {
            p0Var.i = 0;
            p0Var.j = false;
            eVar.l();
        }
        this.x.c0(b1Var);
        boolean z13 = r18;
        i0(z13);
        A0(false);
        ((a0.f) cVar.b).clear();
        ((h) cVar.c).b();
        int[] iArr = this.C0;
        int i28 = iArr[0];
        int i29 = iArr[z13 ? 1 : 0];
        I(iArr);
        if ((iArr[0] == i28 && iArr[z13 ? 1 : 0] == i29) ? false : true) {
            x(0, 0);
        }
        if (this.q0 && this.w != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j10 = b1Var.m;
            if (j10 != -1 && (z10 = this.w.b) && z10) {
                int o10 = this.e.o();
                e1Var = null;
                int i30 = 0;
                while (true) {
                    if (i30 >= o10) {
                        break;
                    }
                    e1 U3 = U(this.e.n(i30));
                    if (U3 != null && !U3.j() && U3.e == j10) {
                        if (!((ArrayList) this.e.d).contains(U3.a)) {
                            e1Var = U3;
                            break;
                        }
                        e1Var = U3;
                    }
                    i30++;
                }
            } else {
                e1Var = null;
            }
            if (e1Var != null) {
                View view3 = e1Var.a;
                if (!((ArrayList) this.e.d).contains(view3) && view3.hasFocusable()) {
                    view2 = view3;
                    if (view2 != null) {
                        int i31 = b1Var.n;
                        if (i31 != -1 && (findViewById = view2.findViewById(i31)) != null && findViewById.isFocusable()) {
                            view2 = findViewById;
                        }
                        view2.requestFocus();
                    }
                }
            }
            if (this.e.k() > 0) {
                int i32 = b1Var.l;
                if (i32 == -1) {
                    i32 = 0;
                }
                int b10 = b1Var.b();
                for (int i33 = i32; i33 < b10; i33++) {
                    e1 K = K(i33);
                    if (K == null) {
                        break;
                    }
                    View view4 = K.a;
                    if (view4.hasFocusable()) {
                        view2 = view4;
                        break;
                    }
                }
                int min = Math.min(b10, i32) - 1;
                while (true) {
                    if (min < 0) {
                        break;
                    }
                    e1 K2 = K(min);
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
        b1Var.m = -1L;
        b1Var.l = -1;
        b1Var.n = -1;
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
            WeakHashMap weakHashMap = i0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        p0 p0Var = this.x;
        if (p0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.L) {
            return;
        }
        boolean d = p0Var.d();
        boolean e = this.x.e();
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

    public void setAccessibilityDelegateCompat(f1 f1Var) {
        this.B0 = f1Var;
        i0.k(this, f1Var);
    }

    public void setAdapter(h0 h0Var) {
        setLayoutFrozen(false);
        h0 h0Var2 = this.w;
        o1 o1Var = this.a;
        if (h0Var2 != null) {
            h0Var2.a.unregisterObserver(o1Var);
            this.w.getClass();
        }
        p0();
        b bVar = this.d;
        bVar.m((ArrayList) bVar.d);
        bVar.m((ArrayList) bVar.e);
        bVar.b = 0;
        h0 h0Var3 = this.w;
        this.w = h0Var;
        if (h0Var != null) {
            h0Var.B(o1Var);
        }
        p0 p0Var = this.x;
        if (p0Var != null) {
            p0Var.Q();
        }
        this.b.d(h0Var3, this.w);
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
        this.I0 = Integer.valueOf(i10);
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
            m0Var.a = this.z0;
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

    public void setLayoutManager(p0 p0Var) {
        if (p0Var == this.x) {
            return;
        }
        C0();
        p0 p0Var2 = this.x;
        e eVar = this.b;
        if (p0Var2 != null) {
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
        this.e.r();
        this.x = p0Var;
        if (p0Var != null) {
            if (p0Var.b != null) {
                throw new IllegalArgumentException("LayoutManager " + p0Var + " is already attached to a RecyclerView:" + p0Var.b.C());
            }
            p0Var.t0(this);
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
            a0.j(viewGroup);
        }
        scrollingChildHelper.d = z10;
    }

    public void setOnFlingListener(s0 s0Var) {
        this.l0 = s0Var;
    }

    @Deprecated
    public void setOnScrollListener(u0 u0Var) {
        this.v0 = u0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.q0 = z10;
    }

    public void setRecycledViewPool(w0 w0Var) {
        e eVar = this.b;
        if (((w0) eVar.g) != null) {
            r1.b--;
        }
        eVar.g = w0Var;
        if (w0Var == null || ((RecyclerView) eVar.h).getAdapter() == null) {
            return;
        }
        ((w0) eVar.g).b++;
    }

    public void setScrollState(int i10) {
        a1 a1Var;
        if (i10 == this.d0) {
            return;
        }
        this.d0 = i10;
        if (i10 != 2) {
            d1 d1Var = this.r0;
            RecyclerView recyclerView = d1Var.h;
            if (recyclerView.O0) {
                recyclerView.removeCallbacks(d1Var);
                d1Var.c.abortAnimation();
            }
            p0 p0Var = this.x;
            if (p0Var != null && (a1Var = p0Var.e) != null) {
                a1Var.h();
            }
        }
        p0 p0Var2 = this.x;
        if (p0Var2 != null) {
            p0Var2.f0();
        }
        k0(i10);
        u0 u0Var = this.v0;
        if (u0Var != null) {
            u0Var.a(this, i10);
        }
        ArrayList arrayList = this.w0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((u0) this.w0.get(size)).a(this, i10);
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

    public void setViewCacheExtension(c1 c1Var) {
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
            if (this.K && this.x != null && this.w != null) {
                requestLayout();
            }
            this.K = false;
        }
    }

    public final void t() {
        k1 k1Var;
        View F;
        boolean z10;
        b1 b1Var = this.u0;
        b1Var.a(1);
        D(b1Var);
        b1Var.i = false;
        z0();
        m4.c cVar = this.f;
        a0.f fVar = (a0.f) cVar.b;
        a0.f fVar2 = (a0.f) cVar.b;
        fVar.clear();
        h hVar = (h) cVar.c;
        hVar.b();
        h0();
        if (this.Q) {
            b bVar = this.d;
            bVar.m((ArrayList) bVar.d);
            bVar.m((ArrayList) bVar.e);
            bVar.b = 0;
            if (this.R) {
                this.x.W(this);
            }
        }
        if (this.c0 == null || !this.x.y0()) {
            this.d.d();
        } else {
            this.d.l();
        }
        boolean z11 = this.x0 || this.y0;
        boolean z12 = this.I && this.c0 != null && ((z10 = this.Q) || z11 || this.x.f) && (!z10 || this.w.b);
        b1Var.j = z12;
        b1Var.k = z12 && z11 && !this.Q && this.c0 != null && this.x.y0();
        e1 e1Var = null;
        View focusedChild = (this.q0 && hasFocus() && this.w != null) ? getFocusedChild() : null;
        if (focusedChild != null && (F = F(focusedChild)) != null) {
            e1Var = T(F);
        }
        if (e1Var == null) {
            b1Var.m = -1L;
            b1Var.l = -1;
            b1Var.n = -1;
        } else {
            b1Var.m = this.w.b ? e1Var.e : -1L;
            b1Var.l = this.Q ? -1 : e1Var.j() ? e1Var.d : e1Var.b();
            View view = e1Var.a;
            int id2 = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id2 = view.getId();
                }
            }
            b1Var.n = id2;
        }
        b1Var.h = b1Var.j && this.y0;
        this.y0 = false;
        this.x0 = false;
        b1Var.g = b1Var.k;
        b1Var.e = this.w.h();
        I(this.C0);
        if (b1Var.j) {
            int k10 = this.e.k();
            for (int i10 = 0; i10 < k10; i10++) {
                e1 U = U(this.e.j(i10));
                if (!U.r() && (!U.h() || this.w.b)) {
                    v0 l4 = this.c0.l(b1Var, U, m0.b(U), U.d());
                    k1 k1Var2 = (k1) fVar2.get(U);
                    if (k1Var2 == null) {
                        k1Var2 = k1.a();
                        fVar2.put(U, k1Var2);
                    }
                    k1Var2.b = l4;
                    k1Var2.a |= 4;
                    if (b1Var.h && U.m() && !U.j() && !U.r() && !U.h()) {
                        hVar.k(U, Q(U));
                    }
                }
            }
        }
        if (b1Var.k) {
            int o10 = this.e.o();
            for (int i11 = 0; i11 < o10; i11++) {
                e1 U2 = U(this.e.n(i11));
                if (!U2.r()) {
                    if (U2.d == -1) {
                        U2.d = U2.c;
                    }
                    U2.h = U2.c;
                }
            }
            boolean z13 = b1Var.f;
            b1Var.f = false;
            this.x.b0(this.b, b1Var);
            b1Var.f = z13;
            for (int i12 = 0; i12 < this.e.k(); i12++) {
                e1 U3 = U(this.e.j(i12));
                if (!U3.r() && ((k1Var = (k1) fVar2.get(U3)) == null || (k1Var.a & 4) == 0)) {
                    int b10 = m0.b(U3);
                    boolean e = U3.e(8192);
                    if (!e) {
                        b10 |= 4096;
                    }
                    v0 l10 = this.c0.l(b1Var, U3, b10, U3.d());
                    if (e) {
                        o0(U3, l10);
                    } else {
                        k1 k1Var3 = (k1) fVar2.get(U3);
                        if (k1Var3 == null) {
                            k1Var3 = k1.a();
                            fVar2.put(U3, k1Var3);
                        }
                        k1Var3.a |= 2;
                        k1Var3.b = l10;
                    }
                }
            }
            n();
        } else {
            n();
        }
        i0(true);
        A0(false);
        b1Var.d = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dd  */
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
        h0 h0Var = this.w;
        int[] iArr = this.J0;
        if (h0Var != null) {
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
        if (!this.y.isEmpty()) {
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
                float x9 = motionEvent.getX();
                float f7 = i16;
                float y3 = motionEvent.getY();
                float f10 = i17;
                if (f7 < 0.0f) {
                    z();
                    u0.b.a(this.V, (-f7) / getWidth(), 1.0f - (y3 / getHeight()));
                } else if (f7 > 0.0f) {
                    A();
                    u0.b.a(this.a0, f7 / getWidth(), y3 / getHeight());
                } else {
                    z10 = false;
                    if (f10 >= 0.0f) {
                        B();
                        u0.b.a(this.W, (-f10) / getHeight(), x9 / getWidth());
                    } else {
                        if (f10 > 0.0f) {
                            y();
                            u0.b.a(this.b0, f10 / getHeight(), 1.0f - (x9 / getWidth()));
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

    public final void u() {
        z0();
        h0();
        b1 b1Var = this.u0;
        b1Var.a(6);
        this.d.d();
        b1Var.e = this.w.h();
        b1Var.c = 0;
        b1Var.g = false;
        this.x.b0(this.b, b1Var);
        b1Var.f = false;
        this.c = null;
        b1Var.j = b1Var.j && this.c0 != null;
        b1Var.d = 4;
        i0(true);
        A0(false);
    }

    public final void u0(int i10, int i11, int[] iArr) {
        e1 e1Var;
        z0();
        h0();
        int i12 = n0.g.a;
        Trace.beginSection("RV Scroll");
        b1 b1Var = this.u0;
        D(b1Var);
        e eVar = this.b;
        int m0 = i10 != 0 ? this.x.m0(i10, eVar, b1Var) : 0;
        int o02 = i11 != 0 ? this.x.o0(i11, eVar, b1Var) : 0;
        Trace.endSection();
        d dVar = this.e;
        int k10 = dVar.k();
        for (int i13 = 0; i13 < k10; i13++) {
            View j10 = dVar.j(i13);
            e1 T = T(j10);
            if (T != null && (e1Var = T.k) != null) {
                View view = e1Var.a;
                int left = j10.getLeft();
                int top = j10.getTop();
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
        p0 p0Var = this.x;
        if (p0Var == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            p0Var.n0(i10);
            awakenScrollBars();
        }
    }

    public final void w(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().d(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public final void w0(int i10, int i11, Interpolator interpolator) {
        p0 p0Var = this.x;
        if (p0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.L) {
            return;
        }
        if (!p0Var.d()) {
            i10 = 0;
        }
        if (!this.x.e()) {
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
        u0 u0Var = this.v0;
        if (u0Var != null) {
            u0Var.b(this, i10, i11);
        }
        ArrayList arrayList = this.w0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((u0) this.w0.get(size)).b(this, i10, i11);
            }
        }
        this.T--;
    }

    public final void x0(int i10, int i11, Interpolator interpolator) {
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
        p0 p0Var = this.x;
        if (p0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            p0Var.v0(this, this.u0, i10);
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
        this.a = new o1(this, 2);
        this.b = new e(this);
        this.f = new m4.c(18);
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
        this.c0 = new l();
        this.d0 = 0;
        this.e0 = -1;
        this.o0 = Float.MIN_VALUE;
        this.p0 = Float.MIN_VALUE;
        this.q0 = true;
        this.r0 = new d1(this);
        this.t0 = new f();
        b1 b1Var = new b1();
        b1Var.a = -1;
        b1Var.b = 0;
        b1Var.c = 0;
        b1Var.d = 1;
        b1Var.e = 0;
        b1Var.f = false;
        b1Var.g = false;
        b1Var.h = false;
        b1Var.i = false;
        b1Var.j = false;
        b1Var.k = false;
        this.u0 = b1Var;
        this.x0 = false;
        this.y0 = false;
        h5 h5Var = new h5(this);
        this.z0 = h5Var;
        this.A0 = false;
        this.C0 = new int[2];
        this.E0 = new int[2];
        this.F0 = new int[2];
        this.G0 = 0;
        this.H0 = 0;
        this.I0 = null;
        this.J0 = new int[2];
        this.K0 = new ArrayList();
        this.L0 = new g0(this, 1);
        this.M0 = new i(this);
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
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            Method method = j0.a;
            a2 = j.f(viewConfiguration);
        } else {
            a2 = j0.a(viewConfiguration, context);
        }
        this.o0 = a2;
        if (i11 >= 26) {
            a10 = j.g(viewConfiguration);
        } else {
            a10 = j0.a(viewConfiguration, context);
        }
        this.p0 = a10;
        this.m0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.n0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.c0.a = h5Var;
        this.d = new b(new jh.g(this));
        this.e = new d(new jg.s0(this, 29));
        WeakHashMap weakHashMap = i0.a;
        if ((i11 >= 26 ? r0.c0.a(this) : 0) == 0 && i11 >= 26) {
            r0.c0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.O = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new f1(this));
        setDescendantFocusability(262144);
        setNestedScrollingEnabled(true);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p0 p0Var = this.x;
        if (p0Var != null) {
            return p0Var.p(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + C());
    }

    public void g0(View view) {
    }

    public void k0(int i10) {
    }

    public void l0(int i10) {
    }

    public void setRecyclerListener(x0 x0Var) {
    }
}
