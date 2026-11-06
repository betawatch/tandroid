package androidx.recyclerview.widget;

import a0.h;
import a8.ua;
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
import bi.sd;
import h2.f;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jg.n1;
import jh.g;
import m4.d0;
import org.telegram.messenger.a8;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.uy;
import org.telegram.ui.hy0;
import q0.a;
import r0.c0;
import r0.i0;
import r0.j;
import u0.b;
import v4.a0;
import v4.a1;
import v4.b0;
import v4.b1;
import v4.c1;
import v4.d1;
import v4.e1;
import v4.f0;
import v4.f1;
import v4.g0;
import v4.j0;
import v4.j1;
import v4.k;
import v4.k0;
import v4.l0;
import v4.m0;
import v4.n0;
import v4.o0;
import v4.p0;
import v4.q;
import v4.q0;
import v4.r0;
import v4.s0;
import v4.u0;
import v4.v0;
import v4.w0;
import v4.x0;
import v4.z0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] Q0 = {R.attr.clipToPadding};
    public static final sd R0 = new sd(5);
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
    public final f0 L0;
    public boolean M;
    public final g M0;
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
    public final n1 a;
    public EdgeEffect a0;
    public final v0 b;
    public EdgeEffect b0;
    public x0 c;
    public l0 c0;
    public final ug.k0 d;
    public int d0;
    public final hy0 e;
    public int e0;
    public final d0 f;
    public VelocityTracker f0;
    public int g0;
    public boolean h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public q0 l0;
    public final int m0;
    public final f0 n;
    public final int n0;
    public final float o0;
    public final float p0;
    public boolean q0;
    public final Rect r;
    public final c1 r0;
    public final Rect s;
    public q s0;
    public final f t0;
    public final a1 u0;
    public s0 v0;
    public final RectF w;
    public ArrayList w0;
    public g0 x;
    public boolean x0;
    public n0 y;
    public boolean y0;
    public final g z0;

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
        for (int i7 = 0; i7 < childCount; i7++) {
            RecyclerView J = J(viewGroup.getChildAt(i7));
            if (J != null) {
                return J;
            }
        }
        return null;
    }

    public static int R(View view) {
        d1 U = U(view);
        if (U != null) {
            return U.b();
        }
        return -1;
    }

    public static int S(View view) {
        d1 U = U(view);
        if (U != null) {
            return U.c();
        }
        return -1;
    }

    public static d1 U(View view) {
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

    public static void m(d1 d1Var) {
        WeakReference weakReference = d1Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == d1Var.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            d1Var.b = null;
        }
    }

    public final void A() {
        if (this.a0 != null) {
            return;
        }
        EdgeEffect a10 = this.U.a(this, 2);
        this.a0 = a10;
        if (this.h) {
            a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a10.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
        k(this.a0);
    }

    public final void A0(boolean z9) {
        if (this.J < 1) {
            this.J = 1;
        }
        if (!z9 && !this.L) {
            this.K = false;
        }
        if (this.J == 1) {
            if (z9 && this.K && !this.L && this.y != null && this.x != null) {
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
        EdgeEffect a10 = this.U.a(this, 1);
        this.W = a10;
        if (this.h) {
            a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a10.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
        k(this.W);
    }

    public final void B0(int i7) {
        getScrollingChildHelper().h(i7);
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
        z0 z0Var;
        setScrollState(0);
        c1 c1Var = this.r0;
        RecyclerView recyclerView = c1Var.h;
        if (recyclerView.O0) {
            recyclerView.removeCallbacks(c1Var);
            c1Var.c.abortAnimation();
        }
        n0 n0Var = this.y;
        if (n0Var == null || (z0Var = n0Var.e) == null) {
            return;
        }
        z0Var.h();
    }

    public final void D(a1 a1Var) {
        if (getScrollState() != 2) {
            a1Var.getClass();
            return;
        }
        OverScroller overScroller = this.r0.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        a1Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View E(float f10, float f11) {
        for (int v = this.e.v() - 1; v >= 0; v--) {
            View u10 = this.e.u(v);
            float translationX = u10.getTranslationX();
            float translationY = u10.getTranslationY();
            if (f10 >= u10.getLeft() + translationX && f10 <= u10.getRight() + translationX && f11 >= u10.getTop() + translationY && f11 <= u10.getBottom() + translationY) {
                return u10;
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

    public final d1 G(View view) {
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
        for (int i7 = 0; i7 < size; i7++) {
            r0 r0Var = (r0) arrayList.get(i7);
            if (r0Var.b(this, motionEvent) && action != 3) {
                this.F = r0Var;
                return true;
            }
        }
        return false;
    }

    public final void I(int[] iArr) {
        int v = this.e.v();
        if (v == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i10 = TLObject.FLAG_31;
        for (int i11 = 0; i11 < v; i11++) {
            d1 U = U(this.e.u(i11));
            if (U != null && !U.r()) {
                int c10 = U.c();
                if (c10 < i7) {
                    i7 = c10;
                }
                if (c10 > i10) {
                    i10 = c10;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i10;
    }

    public final d1 K(int i7) {
        d1 d1Var = null;
        if (this.Q) {
            return null;
        }
        int B = this.e.B();
        for (int i10 = 0; i10 < B; i10++) {
            d1 U = U(this.e.A(i10));
            if (U != null && !U.j() && N(U) == i7) {
                if (!((ArrayList) this.e.d).contains(U.a)) {
                    return U;
                }
                d1Var = U;
            }
        }
        return d1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d1 L(int i7, boolean z9) {
        int B = this.e.B();
        d1 d1Var = null;
        for (int i10 = 0; i10 < B; i10++) {
            d1 U = U(this.e.A(i10));
            if (U != null && !U.j()) {
                if (z9) {
                    if (U.c != i7) {
                        continue;
                    }
                    if (((ArrayList) this.e.d).contains(U.a)) {
                        return U;
                    }
                    d1Var = U;
                } else {
                    if (U.c() != i7) {
                        continue;
                    }
                    if (((ArrayList) this.e.d).contains(U.a)) {
                    }
                }
            }
        }
        return d1Var;
    }

    public final void M(a aVar) {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            aVar.accept(getChildAt(i7));
        }
        for (int i10 = 0; i10 < getHiddenChildCount(); i10++) {
            aVar.accept(V(i10));
        }
        for (int i11 = 0; i11 < getAttachedScrapChildCount(); i11++) {
            aVar.accept(O(i11));
        }
    }

    public final int N(d1 d1Var) {
        if (d1Var.e(524) || !d1Var.g()) {
            return -1;
        }
        int i7 = d1Var.c;
        ArrayList arrayList = (ArrayList) this.d.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            v4.a aVar = (v4.a) arrayList.get(i10);
            int i11 = aVar.a;
            if (i11 != 1) {
                if (i11 == 2) {
                    int i12 = aVar.b;
                    if (i12 <= i7) {
                        int i13 = aVar.d;
                        if (i12 + i13 > i7) {
                            return -1;
                        }
                        i7 -= i13;
                    } else {
                        continue;
                    }
                } else if (i11 == 8) {
                    int i14 = aVar.b;
                    if (i14 == i7) {
                        i7 = aVar.d;
                    } else {
                        if (i14 < i7) {
                            i7--;
                        }
                        if (aVar.d <= i7) {
                            i7++;
                        }
                    }
                }
            } else if (aVar.b <= i7) {
                i7 += aVar.d;
            }
        }
        return i7;
    }

    public final View O(int i7) {
        if (i7 < 0) {
            return null;
        }
        v0 v0Var = this.b;
        if (i7 >= ((ArrayList) v0Var.c).size()) {
            return null;
        }
        return ((d1) ((ArrayList) v0Var.c).get(i7)).a;
    }

    public final View P(int i7) {
        if (i7 < 0) {
            return null;
        }
        v0 v0Var = this.b;
        if (i7 >= ((ArrayList) v0Var.e).size()) {
            return null;
        }
        return ((d1) ((ArrayList) v0Var.e).get(i7)).a;
    }

    public final long Q(d1 d1Var) {
        return this.x.b ? d1Var.e : d1Var.c;
    }

    public final d1 T(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return U(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final View V(int i7) {
        ArrayList arrayList = (ArrayList) this.e.d;
        if (i7 < 0 || i7 >= arrayList.size()) {
            return null;
        }
        return (View) arrayList.get(i7);
    }

    public final Rect W(View view) {
        o0 o0Var = (o0) view.getLayoutParams();
        boolean z9 = o0Var.c;
        Rect rect = o0Var.b;
        if (z9) {
            a1 a1Var = this.u0;
            if (!a1Var.g || (!o0Var.a.m() && !o0Var.a.h())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.D;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    Rect rect2 = this.r;
                    rect2.set(0, 0, 0, 0);
                    ((m0) arrayList.get(i7)).e(rect2, view, this, a1Var);
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

    public final m0 X(int i7) {
        int itemDecorationCount = getItemDecorationCount();
        if (i7 < 0 || i7 >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(com.google.android.recaptcha.internal.a.j(i7, " is an invalid index for size ", itemDecorationCount));
        }
        return (m0) this.D.get(i7);
    }

    public final void Y(long j3, d1 d1Var, d1 d1Var2) {
        int v = this.e.v();
        for (int i7 = 0; i7 < v; i7++) {
            d1 U = U(this.e.u(i7));
            if (U != d1Var && Q(U) == j3) {
                g0 g0Var = this.x;
                if (g0Var == null || !g0Var.b) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + U + " \n View Holder 2:" + d1Var + C());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + U + " \n View Holder 2:" + d1Var + C());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d1Var2 + " cannot be found but it is necessary for " + d1Var + C());
    }

    public final boolean Z() {
        return !this.I || this.Q || this.d.g();
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
    public final void addFocusables(ArrayList arrayList, int i7, int i10) {
        n0 n0Var = this.y;
        if (n0Var != null) {
            n0Var.getClass();
        }
        super.addFocusables(arrayList, i7, i10);
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
        return ((b0) this.y).B0(this.u0);
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

    public final void d0(int i7) {
        if (this.y == null) {
            return;
        }
        setScrollState(2);
        this.y.n0(i7);
        awakenScrollBars();
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z9) {
        return getScrollingChildHelper().a(f10, f11, z9);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i7, int i10, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i7, i10, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i7, int i10, int i11, int i12, int[] iArr) {
        return getScrollingChildHelper().d(i7, i10, i11, i12, iArr, 0, null);
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
        boolean z9;
        super.draw(canvas);
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i7 = 0; i7 < size; i7++) {
            ((m0) arrayList.get(i7)).g(canvas, this);
        }
        Integer num = this.I0;
        if (num == null || num.intValue() != 0) {
            EdgeEffect edgeEffect = this.V;
            if (edgeEffect == null || edgeEffect.isFinished()) {
                z9 = false;
            } else {
                int save = canvas.save();
                int paddingBottom = this.h ? getPaddingBottom() : 0;
                canvas.rotate(270.0f);
                canvas.translate((-getHeight()) + paddingBottom, 0.0f);
                EdgeEffect edgeEffect2 = this.V;
                z9 = edgeEffect2 != null && edgeEffect2.draw(canvas);
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
                z9 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
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
                z9 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
                canvas.restoreToCount(save3);
            }
            EdgeEffect edgeEffect7 = this.b0;
            if (edgeEffect7 == null || edgeEffect7.isFinished()) {
                z10 = z9;
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
                    z10 = true;
                }
                z10 |= z9;
                canvas.restoreToCount(save4);
            }
        }
        if ((z10 || this.c0 == null || arrayList.size() <= 0 || !this.c0.k()) ? z10 : true) {
            WeakHashMap weakHashMap = i0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    public final void e0() {
        int B = this.e.B();
        for (int i7 = 0; i7 < B; i7++) {
            ((o0) this.e.A(i7).getLayoutParams()).c = true;
        }
        ArrayList arrayList = (ArrayList) this.b.e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            o0 o0Var = (o0) ((d1) arrayList.get(i10)).a.getLayoutParams();
            if (o0Var != null) {
                o0Var.c = true;
            }
        }
    }

    public final void f0(int i7, int i10, boolean z9) {
        int i11 = i7 + i10;
        int B = this.e.B();
        for (int i12 = 0; i12 < B; i12++) {
            d1 U = U(this.e.A(i12));
            if (U != null && !U.r()) {
                int i13 = U.c;
                a1 a1Var = this.u0;
                if (i13 >= i11) {
                    U.n(-i10, z9);
                    a1Var.f = true;
                } else if (i13 >= i7) {
                    U.a(8);
                    U.n(-i10, z9);
                    U.c = i7 - 1;
                    a1Var.f = true;
                }
            }
        }
        v0 v0Var = this.b;
        ArrayList arrayList = (ArrayList) v0Var.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d1 d1Var = (d1) arrayList.get(size);
            if (d1Var != null) {
                int i14 = d1Var.c;
                if (i14 >= i11) {
                    d1Var.n(-i10, z9);
                } else if (i14 >= i7) {
                    d1Var.a(8);
                    v0Var.f(size);
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
    public final View focusSearch(View view, int i7) {
        View view2;
        int i10;
        char c10;
        boolean z9;
        this.y.getClass();
        boolean z10 = true;
        boolean z11 = (this.x == null || this.y == null || c0() || this.L) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        a1 a1Var = this.u0;
        v0 v0Var = this.b;
        if (z11 && (i7 == 2 || i7 == 1)) {
            if (this.y.e()) {
                if (focusFinder.findNextFocus(this, view, i7 == 2 ? qs.O1 : 33) == null) {
                    z9 = true;
                    if (!z9 && this.y.d()) {
                        RecyclerView recyclerView = this.y.b;
                        WeakHashMap weakHashMap = i0.a;
                        z9 = focusFinder.findNextFocus(this, view, !((recyclerView.getLayoutDirection() != 1) ^ (i7 != 2)) ? 66 : 17) != null;
                    }
                    if (z9) {
                        p();
                        if (F(view) != null) {
                            z0();
                            this.y.R(view, i7, v0Var, a1Var);
                            A0(false);
                        }
                        return null;
                    }
                    view2 = focusFinder.findNextFocus(this, view, i7);
                    if (view2 == null) {
                    }
                    if (view2 != null) {
                        if (F(view2) != null) {
                        }
                        if (z10) {
                        }
                    }
                    z10 = false;
                    if (z10) {
                    }
                }
            }
            z9 = false;
            if (!z9) {
                RecyclerView recyclerView2 = this.y.b;
                WeakHashMap weakHashMap2 = i0.a;
                if (focusFinder.findNextFocus(this, view, !((recyclerView2.getLayoutDirection() != 1) ^ (i7 != 2)) ? 66 : 17) != null) {
                }
            }
            if (z9) {
            }
            view2 = focusFinder.findNextFocus(this, view, i7);
            if (view2 == null) {
            }
            if (view2 != null) {
            }
            z10 = false;
            if (z10) {
            }
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i7);
            if (findNextFocus == null && z11) {
                p();
                if (F(view) != null) {
                    z0();
                    view2 = this.y.R(view, i7, v0Var, a1Var);
                    A0(false);
                }
                return null;
            }
            view2 = findNextFocus;
            if (view2 == null && !view2.hasFocusable()) {
                if (getFocusedChild() == null) {
                    return super.focusSearch(view, i7);
                }
                r0(view2, null);
                return view;
            }
            if (view2 != null && view2 != this && view2 != view) {
                if (F(view2) != null) {
                    z10 = false;
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
                    WeakHashMap weakHashMap3 = i0.a;
                    int i11 = recyclerView3.getLayoutDirection() == 1 ? -1 : 1;
                    int i12 = rect.left;
                    int i13 = rect2.left;
                    if ((i12 < i13 || rect.right <= i13) && rect.right < rect2.right) {
                        i10 = 1;
                    } else {
                        int i14 = rect.right;
                        int i15 = rect2.right;
                        i10 = ((i14 > i15 || i12 >= i15) && i12 > i13) ? -1 : 0;
                    }
                    int i16 = rect.top;
                    int i17 = rect2.top;
                    if ((i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom) {
                        c10 = 1;
                    } else {
                        int i18 = rect.bottom;
                        int i19 = rect2.bottom;
                        c10 = ((i18 > i19 || i16 >= i19) && i16 > i17) ? (char) 65535 : (char) 0;
                    }
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 17) {
                                if (i7 != 33) {
                                    if (i7 != 66) {
                                        if (i7 != 130) {
                                            throw new IllegalArgumentException("Invalid direction: " + i7 + C());
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
                return z10 ? view2 : super.focusSearch(view, i7);
            }
            z10 = false;
            if (z10) {
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
    public final int getChildDrawingOrder(int i7, int i10) {
        return super.getChildDrawingOrder(i7, i10);
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

    public final void h(d1 d1Var) {
        View view = d1Var.a;
        boolean z9 = view.getParent() == this;
        this.b.k(T(view));
        if (d1Var.l()) {
            this.e.l(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z9) {
            this.e.k(-1, view, true);
            return;
        }
        hy0 hy0Var = this.e;
        int indexOfChild = ((RecyclerView) ((uy) hy0Var.b).b).indexOfChild(view);
        if (indexOfChild >= 0) {
            ((ua) hy0Var.c).I(indexOfChild);
            hy0Var.D(view);
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

    public final void i0(boolean z9) {
        int i7;
        AccessibilityManager accessibilityManager;
        int i10 = this.S - 1;
        this.S = i10;
        if (i10 < 1) {
            this.S = 0;
            if (z9) {
                int i11 = this.N;
                this.N = 0;
                if (i11 != 0 && (accessibilityManager = this.O) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i11);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.K0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    d1 d1Var = (d1) arrayList.get(size);
                    if (d1Var.a.getParent() == this && !d1Var.r() && (i7 = d1Var.s) != -1) {
                        View view = d1Var.a;
                        WeakHashMap weakHashMap = i0.a;
                        view.setImportantForAccessibility(i7);
                        d1Var.s = -1;
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

    public final void j(s0 s0Var) {
        if (this.w0 == null) {
            this.w0 = new ArrayList();
        }
        this.w0.add(s0Var);
    }

    public final void j0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.e0) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.e0 = motionEvent.getPointerId(i7);
            int x10 = (int) (motionEvent.getX(i7) + 0.5f);
            this.i0 = x10;
            this.g0 = x10;
            int y10 = (int) (motionEvent.getY(i7) + 0.5f);
            this.j0 = y10;
            this.h0 = y10;
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
        int B = this.e.B();
        for (int i7 = 0; i7 < B; i7++) {
            d1 U = U(this.e.A(i7));
            if (U != null && !U.r()) {
                U.d = -1;
                U.g = -1;
            }
        }
        v0 v0Var = this.b;
        ArrayList arrayList = (ArrayList) v0Var.c;
        ArrayList arrayList2 = (ArrayList) v0Var.e;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            d1 d1Var = (d1) arrayList2.get(i10);
            d1Var.d = -1;
            d1Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            d1 d1Var2 = (d1) arrayList.get(i11);
            d1Var2.d = -1;
            d1Var2.g = -1;
        }
        ArrayList arrayList3 = (ArrayList) v0Var.d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                d1 d1Var3 = (d1) ((ArrayList) v0Var.d).get(i12);
                d1Var3.d = -1;
                d1Var3.g = -1;
            }
        }
    }

    public final void n0(boolean z9) {
        this.R = z9 | this.R;
        this.Q = true;
        int B = this.e.B();
        for (int i7 = 0; i7 < B; i7++) {
            d1 U = U(this.e.A(i7));
            if (U != null && !U.r()) {
                U.a(6);
            }
        }
        e0();
        v0 v0Var = this.b;
        ArrayList arrayList = (ArrayList) v0Var.e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            d1 d1Var = (d1) arrayList.get(i10);
            if (d1Var != null) {
                d1Var.a(6);
                d1Var.a(1024);
            }
        }
        g0 g0Var = ((RecyclerView) v0Var.h).x;
        if (g0Var == null || !g0Var.b) {
            v0Var.e();
        }
    }

    public final void o(int i7, int i10) {
        boolean z9;
        EdgeEffect edgeEffect = this.V;
        if (edgeEffect == null || edgeEffect.isFinished() || i7 <= 0) {
            z9 = false;
        } else {
            this.V.onRelease();
            z9 = this.V.isFinished();
        }
        EdgeEffect edgeEffect2 = this.a0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i7 < 0) {
            this.a0.onRelease();
            z9 |= this.a0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.W;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i10 > 0) {
            this.W.onRelease();
            z9 |= this.W.isFinished();
        }
        EdgeEffect edgeEffect4 = this.b0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i10 < 0) {
            this.b0.onRelease();
            z9 |= this.b0.isFinished();
        }
        if (z9) {
            WeakHashMap weakHashMap = i0.a;
            postInvalidateOnAnimation();
        }
    }

    public final void o0(d1 d1Var, e2.r0 r0Var) {
        d1Var.p(0, TLObject.FLAG_13);
        boolean z9 = this.u0.h;
        d0 d0Var = this.f;
        if (z9 && d1Var.m() && !d1Var.j() && !d1Var.r()) {
            ((h) d0Var.b).k(d1Var, Q(d1Var));
        }
        a0.f fVar = (a0.f) d0Var.a;
        j1 j1Var = (j1) fVar.get(d1Var);
        if (j1Var == null) {
            j1Var = j1.a();
            fVar.put(d1Var, j1Var);
        }
        j1Var.b = r0Var;
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
        float f10;
        super.onAttachedToWindow();
        this.S = 0;
        this.G = true;
        this.I = this.I && !isLayoutRequested();
        n0 n0Var = this.y;
        if (n0Var != null) {
            n0Var.getClass();
        }
        this.A0 = false;
        ThreadLocal threadLocal = q.e;
        q qVar = (q) threadLocal.get();
        this.s0 = qVar;
        if (qVar == null) {
            q qVar2 = new q();
            qVar2.a = new ArrayList();
            qVar2.d = new ArrayList();
            this.s0 = qVar2;
            WeakHashMap weakHashMap = i0.a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f10 = display.getRefreshRate();
            }
            f10 = 60.0f;
            q qVar3 = this.s0;
            qVar3.c = (long) (1.0E9f / f10);
            threadLocal.set(qVar3);
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
        while (j1.d.a() != null) {
        }
        q qVar = this.s0;
        if (qVar != null) {
            qVar.a.remove(this);
            this.s0 = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((m0) arrayList.get(i7)).f(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float f11;
        if (this.y != null && !this.L && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f10 = this.y.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.y.d()) {
                    f11 = motionEvent.getAxisValue(10);
                    if (f10 == 0.0f || f11 != 0.0f) {
                        t0((int) (f11 * this.o0), (int) (f10 * this.p0), motionEvent);
                    }
                }
                f11 = 0.0f;
                if (f10 == 0.0f) {
                }
                t0((int) (f11 * this.o0), (int) (f10 * this.p0), motionEvent);
            } else {
                if ((motionEvent.getSource() & TLObject.FLAG_22) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.y.e()) {
                        f10 = -axisValue;
                        f11 = 0.0f;
                        if (f10 == 0.0f) {
                        }
                        t0((int) (f11 * this.o0), (int) (f10 * this.p0), motionEvent);
                    } else if (this.y.d()) {
                        f11 = axisValue;
                        f10 = 0.0f;
                        if (f10 == 0.0f) {
                        }
                        t0((int) (f11 * this.o0), (int) (f10 * this.p0), motionEvent);
                    }
                }
                f10 = 0.0f;
                f11 = 0.0f;
                if (f10 == 0.0f) {
                }
                t0((int) (f11 * this.o0), (int) (f10 * this.p0), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z9;
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
                boolean e10 = this.y.e();
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
                    int y10 = (int) (motionEvent.getY() + 0.5f);
                    this.j0 = y10;
                    this.h0 = y10;
                    if (this.d0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        B0(1);
                    }
                    int[] iArr = this.F0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i7 = d;
                    if (e10) {
                        i7 = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i7, 0);
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
                    int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.d0 != 1) {
                        int i10 = x11 - this.g0;
                        int i11 = y11 - this.h0;
                        if (d == 0 || Math.abs(i10) <= this.k0) {
                            z9 = false;
                        } else {
                            this.i0 = x11;
                            z9 = true;
                        }
                        if (e10 && Math.abs(i11) > this.k0) {
                            this.j0 = y11;
                            z9 = true;
                        }
                        if (z9) {
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
                    int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.j0 = y12;
                    this.h0 = y12;
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
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = n0.g.a;
        Trace.beginSection("RV OnLayout");
        s();
        Trace.endSection();
        this.I = true;
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        if (this.y == null) {
            q(i7, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        n0 n0Var = this.y;
        v0 v0Var = this.b;
        a1 a1Var = this.u0;
        n0Var.d0(v0Var, a1Var, i7, i10);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.x == null) {
            return;
        }
        if (a1Var.d == 1) {
            t();
        }
        this.y.q0(i7, i10);
        a1Var.i = true;
        u();
        this.y.s0(i7, i10);
        b0 b0Var = (b0) this.y;
        if (b0Var.l == 1073741824 || b0Var.k == 1073741824) {
            return;
        }
        int r10 = b0Var.r();
        for (int i11 = 0; i11 < r10; i11++) {
            ViewGroup.LayoutParams layoutParams = b0Var.q(i11).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                this.y.q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                a1Var.i = true;
                u();
                this.y.s0(i7, i10);
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (c0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i7, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof x0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x0 x0Var = (x0) parcelable;
        this.c = x0Var;
        super.onRestoreInstanceState(x0Var.a);
        n0 n0Var = this.y;
        if (n0Var == null || (parcelable2 = this.c.c) == null) {
            return;
        }
        b0 b0Var = (b0) n0Var;
        if (parcelable2 instanceof a0) {
            b0Var.B = (a0) parcelable2;
            b0Var.l0();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        x0 x0Var = new x0(super.onSaveInstanceState());
        x0 x0Var2 = this.c;
        if (x0Var2 != null) {
            x0Var.c = x0Var2.c;
            return x0Var;
        }
        n0 n0Var = this.y;
        if (n0Var != null) {
            x0Var.c = n0Var.e0();
            return x0Var;
        }
        x0Var.c = null;
        return x0Var;
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 == i11 && i10 == i12) {
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
        boolean z9;
        boolean z10;
        if (!this.L && !this.M) {
            r0 r0Var = this.F;
            if (r0Var == null) {
                z9 = motionEvent.getAction() == 0 ? false : H(motionEvent);
            } else {
                r0Var.a(this, motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.F = null;
                }
                z9 = true;
            }
            if (z9) {
                s0();
                setScrollState(0);
                return true;
            }
            n0 n0Var = this.y;
            if (n0Var != null) {
                boolean d = n0Var.d();
                boolean e10 = this.y.e();
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
                    int y10 = (int) (motionEvent.getY() + 0.5f);
                    this.j0 = y10;
                    this.h0 = y10;
                    int i7 = d;
                    if (e10) {
                        i7 = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i7, 0);
                } else {
                    if (actionMasked == 1) {
                        this.f0.addMovement(obtain);
                        VelocityTracker velocityTracker = this.f0;
                        int i10 = this.n0;
                        velocityTracker.computeCurrentVelocity(1000, i10);
                        float f10 = d != 0 ? -this.f0.getXVelocity(this.e0) : 0.0f;
                        float f11 = e10 ? -this.f0.getYVelocity(this.e0) : 0.0f;
                        if (f10 != 0.0f || f11 != 0.0f) {
                            int i11 = (int) f10;
                            int i12 = (int) f11;
                            n0 n0Var2 = this.y;
                            if (n0Var2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.L) {
                                int d2 = n0Var2.d();
                                boolean e11 = this.y.e();
                                int i13 = this.m0;
                                if (d2 == 0 || Math.abs(i11) < i13) {
                                    i11 = 0;
                                }
                                if (!e11 || Math.abs(i12) < i13) {
                                    i12 = 0;
                                }
                                if (i11 != 0 || i12 != 0) {
                                    float f12 = i11;
                                    float f13 = i12;
                                    if (!dispatchNestedPreFling(f12, f13)) {
                                        boolean z11 = d2 != 0 || e11;
                                        dispatchNestedFling(f12, f13, z11);
                                        q0 q0Var = this.l0;
                                        if (q0Var == null || !q0Var.a(i11, i12)) {
                                            if (z11) {
                                                if (e11) {
                                                    d2 = (d2 == true ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().g(d2, 1);
                                                int i14 = -i10;
                                                int max = Math.max(i14, Math.min(i11, i10));
                                                int max2 = Math.max(i14, Math.min(i12, i10));
                                                c1 c1Var = this.r0;
                                                RecyclerView recyclerView = c1Var.h;
                                                recyclerView.setScrollState(2);
                                                c1Var.b = 0;
                                                c1Var.a = 0;
                                                Interpolator interpolator = c1Var.d;
                                                sd sdVar = R0;
                                                if (interpolator != sdVar) {
                                                    c1Var.d = sdVar;
                                                    c1Var.c = new OverScroller(recyclerView.getContext(), sdVar);
                                                }
                                                c1Var.c.fling(0, 0, max, max2, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                c1Var.a();
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
                        int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i15 = this.i0 - x11;
                        int i16 = this.j0 - y11;
                        int[] iArr2 = this.J0;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        boolean v = v(i15, i16, 0, iArr2, this.E0);
                        int[] iArr3 = this.E0;
                        if (v) {
                            i15 -= iArr2[0];
                            i16 -= iArr2[1];
                            obtain.offsetLocation(iArr3[0], iArr3[1]);
                            iArr[0] = iArr[0] + iArr3[0];
                            iArr[1] = iArr[1] + iArr3[1];
                        }
                        if (this.d0 != 1) {
                            if (d != 0) {
                                int abs = Math.abs(i15);
                                int i17 = this.k0;
                                if (abs > i17) {
                                    i15 = i15 > 0 ? i15 - i17 : i15 + i17;
                                    z10 = true;
                                    if (e10) {
                                        int abs2 = Math.abs(i16);
                                        int i18 = this.k0;
                                        if (abs2 > i18) {
                                            i16 = i16 > 0 ? i16 - i18 : i16 + i18;
                                            z10 = true;
                                        }
                                    }
                                    if (z10) {
                                        setScrollState(1);
                                    }
                                }
                            }
                            z10 = false;
                            if (e10) {
                            }
                            if (z10) {
                            }
                        }
                        if (this.d0 == 1) {
                            this.i0 = x11 - iArr3[0];
                            this.j0 = y11 - iArr3[1];
                            if (t0(d != 0 ? i15 : 0, e10 ? i16 : 0, obtain)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            q qVar = this.s0;
                            if (qVar != null && (i15 != 0 || i16 != 0)) {
                                qVar.a(this, i15, i16);
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
                        int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.j0 = y12;
                        this.h0 = y12;
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
            int i7 = n0.g.a;
            Trace.beginSection("RV FullInvalidate");
            s();
            Trace.endSection();
            return;
        }
        ug.k0 k0Var = this.d;
        if (k0Var.g()) {
            int i10 = k0Var.b;
            if ((i10 & 4) == 0 || (i10 & 11) != 0) {
                if (k0Var.g()) {
                    int i11 = n0.g.a;
                    Trace.beginSection("RV FullInvalidate");
                    s();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i12 = n0.g.a;
            Trace.beginSection("RV PartialInvalidate");
            z0();
            h0();
            k0Var.k();
            if (!this.K) {
                hy0 hy0Var = this.e;
                int v = hy0Var.v();
                int i13 = 0;
                while (true) {
                    if (i13 < v) {
                        d1 U = U(hy0Var.u(i13));
                        if (U != null && !U.r() && U.m()) {
                            s();
                            break;
                        }
                        i13++;
                    } else {
                        k0Var.b();
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
        v0 v0Var = this.b;
        if (n0Var != null) {
            n0Var.g0(v0Var);
            this.y.h0(v0Var);
        }
        ((ArrayList) v0Var.c).clear();
        v0Var.e();
    }

    public final void q(int i7, int i10) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = i0.a;
        setMeasuredDimension(n0.g(i7, paddingRight, getMinimumWidth()), n0.g(i10, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
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
        d1 U = U(view);
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
    public final void removeDetachedView(View view, boolean z9) {
        d1 U = U(view);
        if (U != null) {
            if (U.l()) {
                U.l &= -257;
            } else if (!U.r()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + U + C());
            }
        }
        view.clearAnimation();
        r(view);
        super.removeDetachedView(view, z9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        z0 z0Var = this.y.e;
        if ((z0Var == null || !z0Var.e) && !c0() && view2 != null) {
            r0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        return this.y.k0(this, view, rect, z9, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z9) {
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((r0) arrayList.get(i7)).c(z9);
        }
        super.requestDisallowInterceptTouchEvent(z9);
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
        boolean z9;
        ?? r11;
        boolean r10;
        int i7;
        int i10;
        int i11;
        int i12;
        d1 d1Var;
        View findViewById;
        boolean z10;
        if (this.x == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.y == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        a1 a1Var = this.u0;
        boolean z11 = false;
        a1Var.i = false;
        boolean z12 = true;
        if (a1Var.d == 1) {
            t();
            this.y.p0(this);
            u();
        } else {
            ug.k0 k0Var = this.d;
            if ((((ArrayList) k0Var.e).isEmpty() || ((ArrayList) k0Var.d).isEmpty()) && this.y.m == getWidth() && this.y.n == getHeight()) {
                this.y.p0(this);
            } else {
                this.y.p0(this);
                u();
            }
        }
        a1Var.a(4);
        z0();
        h0();
        a1Var.d = 1;
        boolean z13 = a1Var.j;
        v0 v0Var = this.b;
        d0 d0Var = this.f;
        if (z13) {
            try {
                for (int v = this.e.v() - 1; v >= 0; v--) {
                    d1 U = U(this.e.u(v));
                    if (U != null && !U.r()) {
                        long Q = Q(U);
                        this.c0.getClass();
                        e2.r0 r0Var = new e2.r0();
                        View view = U.a;
                        r0Var.a = view.getLeft();
                        r0Var.b = view.getTop();
                        view.getRight();
                        view.getBottom();
                        h hVar = (h) d0Var.b;
                        a0.f fVar = (a0.f) d0Var.a;
                        d1 d1Var2 = (d1) hVar.f(Q);
                        if (d1Var2 == null || d1Var2.r()) {
                            d0Var.s(U, r0Var);
                        } else {
                            j1 j1Var2 = (j1) fVar.get(d1Var2);
                            ?? r15 = (j1Var2 == null || (j1Var2.a & 1) == 0) ? false : true;
                            j1 j1Var3 = (j1) fVar.get(U);
                            ?? r14 = (j1Var3 == null || (j1Var3.a & 1) == 0) ? false : true;
                            if (r15 == true && d1Var2 == U) {
                                d0Var.s(U, r0Var);
                            } else {
                                e2.r0 o02 = d0Var.o0(d1Var2, 4);
                                d0Var.s(U, r0Var);
                                e2.r0 o03 = d0Var.o0(U, 8);
                                if (o02 == null) {
                                    Y(Q, U, d1Var2);
                                } else {
                                    d1Var2.q(false);
                                    if (r15 != false) {
                                        h(d1Var2);
                                    }
                                    if (d1Var2 != U) {
                                        if (r14 != false) {
                                            h(U);
                                        }
                                        d1Var2.j = U;
                                        h(d1Var2);
                                        v0Var.k(d1Var2);
                                        U.q(false);
                                        U.k = d1Var2;
                                    }
                                    f1 f1Var = (f1) this.c0;
                                    f1Var.getClass();
                                    int i13 = o02.a;
                                    int i14 = o02.b;
                                    if (U.r()) {
                                        i11 = o02.a;
                                        i12 = o02.b;
                                    } else {
                                        i11 = o03.a;
                                        i12 = o03.b;
                                    }
                                    if (f1Var.q(d1Var2, U, o02, i13, i14, i11, i12)) {
                                        m0();
                                    }
                                }
                            }
                        }
                    }
                }
                a0.f fVar2 = (a0.f) d0Var.a;
                int i15 = fVar2.c - 1;
                while (i15 >= 0) {
                    d1 d1Var3 = (d1) fVar2.f(i15);
                    try {
                        j1Var = (j1) fVar2.g(i15);
                    } catch (Exception e10) {
                        a8.g(e10, z12);
                        j1Var = null;
                    }
                    if (j1Var == null) {
                        z9 = z12;
                    } else {
                        int i16 = j1Var.a;
                        int i17 = i16 & 3;
                        g gVar = this.M0;
                        if (i17 == 3) {
                            gVar.b(d1Var3);
                        } else if ((i16 & 1) != 0) {
                            e2.r0 r0Var2 = j1Var.b;
                            if (r0Var2 == null) {
                                gVar.b(d1Var3);
                            } else {
                                gVar.a(d1Var3, r0Var2, j1Var.c);
                            }
                        } else if ((i16 & 14) == 14) {
                            e2.r0 r0Var3 = j1Var.b;
                            e2.r0 r0Var4 = j1Var.c;
                            RecyclerView recyclerView = gVar.a;
                            d1Var3.q(z11);
                            if (recyclerView.c0.a(d1Var3, r0Var3, r0Var4)) {
                                recyclerView.m0();
                            }
                        } else {
                            if ((i16 & 12) == 12) {
                                e2.r0 r0Var5 = j1Var.b;
                                e2.r0 r0Var6 = j1Var.c;
                                gVar.getClass();
                                d1Var3.q(z11);
                                RecyclerView recyclerView2 = gVar.a;
                                if (recyclerView2.Q) {
                                    f1 f1Var2 = (f1) recyclerView2.c0;
                                    f1Var2.getClass();
                                    int i18 = r0Var5.a;
                                    int i19 = r0Var5.b;
                                    if (d1Var3.r()) {
                                        i10 = r0Var5.a;
                                        z9 = z12;
                                        i7 = r0Var5.b;
                                    } else {
                                        z9 = z12;
                                        int i20 = r0Var6.a;
                                        i7 = r0Var6.b;
                                        i10 = i20;
                                    }
                                    if (f1Var2.q(d1Var3, d1Var3, r0Var5, i18, i19, i10, i7)) {
                                        recyclerView2.m0();
                                    }
                                } else {
                                    z9 = z12;
                                    f1 f1Var3 = (f1) recyclerView2.c0;
                                    f1Var3.getClass();
                                    int i21 = r0Var5.a;
                                    int i22 = r0Var6.a;
                                    if (i21 == i22 && r0Var5.b == r0Var6.b) {
                                        f1Var3.v(d1Var3);
                                        r10 = false;
                                    } else {
                                        r10 = f1Var3.r(d1Var3, r0Var5, i21, r0Var5.b, i22, r0Var6.b);
                                    }
                                    if (r10) {
                                        recyclerView2.m0();
                                    }
                                }
                            } else {
                                z9 = z12;
                                if ((i16 & 4) != 0) {
                                    gVar.a(d1Var3, j1Var.b, null);
                                } else if ((i16 & 8) != 0) {
                                    e2.r0 r0Var7 = j1Var.b;
                                    e2.r0 r0Var8 = j1Var.c;
                                    RecyclerView recyclerView3 = gVar.a;
                                    r11 = 0;
                                    r11 = 0;
                                    d1Var3.q(false);
                                    if (recyclerView3.c0.a(d1Var3, r0Var7, r0Var8)) {
                                        recyclerView3.m0();
                                    }
                                    j1Var.a = r11;
                                    j1Var.b = null;
                                    j1Var.c = null;
                                    j1.d.q(j1Var);
                                }
                            }
                            r11 = 0;
                            j1Var.a = r11;
                            j1Var.b = null;
                            j1Var.c = null;
                            j1.d.q(j1Var);
                        }
                        r11 = z11;
                        z9 = z12;
                        j1Var.a = r11;
                        j1Var.b = null;
                        j1Var.c = null;
                        j1.d.q(j1Var);
                    }
                    i15--;
                    z12 = z9;
                    z11 = false;
                }
            } catch (Exception e11) {
                StringBuilder sb2 = new StringBuilder();
                for (int v10 = this.e.v() - 1; v10 >= 0; v10--) {
                    d1 U2 = U(this.e.u(v10));
                    if (U2 != null && !U2.r()) {
                        sb2.append("Holder at" + v10 + " " + U2 + "\n");
                    }
                }
                throw new RuntimeException(sb2.toString(), e11);
            }
        }
        boolean z14 = z12;
        View view2 = null;
        this.y.h0(v0Var);
        a1Var.b = a1Var.e;
        this.Q = false;
        this.R = false;
        a1Var.j = false;
        a1Var.k = false;
        this.y.f = false;
        ArrayList arrayList = (ArrayList) v0Var.d;
        if (arrayList != null) {
            arrayList.clear();
        }
        n0 n0Var = this.y;
        if (n0Var.j) {
            n0Var.i = 0;
            n0Var.j = false;
            v0Var.l();
        }
        this.y.c0(a1Var);
        i0(z14);
        A0(false);
        ((a0.f) d0Var.a).clear();
        ((h) d0Var.b).b();
        int[] iArr = this.C0;
        int i23 = iArr[0];
        int i24 = iArr[z14 ? 1 : 0];
        I(iArr);
        if ((iArr[0] == i23 && iArr[z14 ? 1 : 0] == i24) ? false : true) {
            x(0, 0);
        }
        if (this.q0 && this.x != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j3 = a1Var.m;
            if (j3 != -1 && (z10 = this.x.b) && z10) {
                int B = this.e.B();
                d1Var = null;
                int i25 = 0;
                while (true) {
                    if (i25 >= B) {
                        break;
                    }
                    d1 U3 = U(this.e.A(i25));
                    if (U3 != null && !U3.j() && U3.e == j3) {
                        if (!((ArrayList) this.e.d).contains(U3.a)) {
                            d1Var = U3;
                            break;
                        }
                        d1Var = U3;
                    }
                    i25++;
                }
            } else {
                d1Var = null;
            }
            if (d1Var != null) {
                View view3 = d1Var.a;
                if (!((ArrayList) this.e.d).contains(view3) && view3.hasFocusable()) {
                    view2 = view3;
                    if (view2 != null) {
                        int i26 = a1Var.n;
                        if (i26 != -1 && (findViewById = view2.findViewById(i26)) != null && findViewById.isFocusable()) {
                            view2 = findViewById;
                        }
                        view2.requestFocus();
                    }
                }
            }
            if (this.e.v() > 0) {
                int i27 = a1Var.l;
                if (i27 == -1) {
                    i27 = 0;
                }
                int b10 = a1Var.b();
                for (int i28 = i27; i28 < b10; i28++) {
                    d1 K = K(i28);
                    if (K == null) {
                        break;
                    }
                    View view4 = K.a;
                    if (view4.hasFocusable()) {
                        view2 = view4;
                        break;
                    }
                }
                int min = Math.min(b10, i27) - 1;
                while (true) {
                    if (min < 0) {
                        break;
                    }
                    d1 K2 = K(min);
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
        a1Var.m = -1L;
        a1Var.l = -1;
        a1Var.n = -1;
    }

    public final void s0() {
        VelocityTracker velocityTracker = this.f0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z9 = false;
        B0(0);
        EdgeEffect edgeEffect = this.V;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z9 = this.V.isFinished();
        }
        EdgeEffect edgeEffect2 = this.W;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z9 |= this.W.isFinished();
        }
        EdgeEffect edgeEffect3 = this.a0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z9 |= this.a0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.b0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z9 |= this.b0.isFinished();
        }
        if (z9) {
            WeakHashMap weakHashMap = i0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i7, int i10) {
        n0 n0Var = this.y;
        if (n0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.L) {
            return;
        }
        boolean d = n0Var.d();
        boolean e10 = this.y.e();
        if (d || e10) {
            if (!d) {
                i7 = 0;
            }
            if (!e10) {
                i10 = 0;
            }
            t0(i7, i10, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i7, int i10) {
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
        i0.j(this, e1Var);
    }

    public void setAdapter(g0 g0Var) {
        setLayoutFrozen(false);
        g0 g0Var2 = this.x;
        n1 n1Var = this.a;
        if (g0Var2 != null) {
            g0Var2.a.unregisterObserver(n1Var);
            this.x.getClass();
        }
        p0();
        ug.k0 k0Var = this.d;
        k0Var.l((ArrayList) k0Var.d);
        k0Var.l((ArrayList) k0Var.e);
        k0Var.b = 0;
        g0 g0Var3 = this.x;
        this.x = g0Var;
        if (g0Var != null) {
            g0Var.B(n1Var);
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

    public void setBottomGlowOffset(int i7) {
        this.H0 = i7;
    }

    public void setChildDrawingOrderCallback(j0 j0Var) {
        if (j0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(j0Var != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z9) {
        if (z9 != this.h) {
            this.b0 = null;
            this.W = null;
            this.a0 = null;
            this.V = null;
        }
        this.h = z9;
        super.setClipToPadding(z9);
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

    public void setGlowColor(int i7) {
        this.I0 = Integer.valueOf(i7);
    }

    public void setHasFixedSize(boolean z9) {
        this.H = z9;
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

    public void setItemViewCacheSize(int i7) {
        v0 v0Var = this.b;
        v0Var.a = i7;
        v0Var.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z9) {
        suppressLayout(z9);
    }

    public void setLayoutManager(n0 n0Var) {
        if (n0Var == this.y) {
            return;
        }
        C0();
        n0 n0Var2 = this.y;
        v0 v0Var = this.b;
        if (n0Var2 != null) {
            l0 l0Var = this.c0;
            if (l0Var != null) {
                l0Var.g();
            }
            this.y.g0(v0Var);
            this.y.h0(v0Var);
            ((ArrayList) v0Var.c).clear();
            v0Var.e();
            if (this.G) {
                this.y.getClass();
            }
            this.y.t0(null);
            this.y = null;
        } else {
            ((ArrayList) v0Var.c).clear();
            v0Var.e();
        }
        this.e.G();
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
        v0Var.l();
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
    public void setNestedScrollingEnabled(boolean z9) {
        j scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = i0.a;
            r0.a0.j(viewGroup);
        }
        scrollingChildHelper.d = z9;
    }

    public void setOnFlingListener(q0 q0Var) {
        this.l0 = q0Var;
    }

    @Deprecated
    public void setOnScrollListener(s0 s0Var) {
        this.v0 = s0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z9) {
        this.q0 = z9;
    }

    public void setRecycledViewPool(u0 u0Var) {
        v0 v0Var = this.b;
        if (((u0) v0Var.g) != null) {
            r1.b--;
        }
        v0Var.g = u0Var;
        if (u0Var == null || ((RecyclerView) v0Var.h).getAdapter() == null) {
            return;
        }
        ((u0) v0Var.g).b++;
    }

    public void setScrollState(int i7) {
        z0 z0Var;
        if (i7 == this.d0) {
            return;
        }
        this.d0 = i7;
        if (i7 != 2) {
            c1 c1Var = this.r0;
            RecyclerView recyclerView = c1Var.h;
            if (recyclerView.O0) {
                recyclerView.removeCallbacks(c1Var);
                c1Var.c.abortAnimation();
            }
            n0 n0Var = this.y;
            if (n0Var != null && (z0Var = n0Var.e) != null) {
                z0Var.h();
            }
        }
        n0 n0Var2 = this.y;
        if (n0Var2 != null) {
            n0Var2.f0();
        }
        k0(i7);
        s0 s0Var = this.v0;
        if (s0Var != null) {
            s0Var.a(this, i7);
        }
        ArrayList arrayList = this.w0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((s0) this.w0.get(size)).a(this, i7);
            }
        }
    }

    public void setScrollingTouchSlop(int i7) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i7 != 0) {
            if (i7 == 1) {
                this.k0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i7 + "; using default value");
        }
        this.k0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setTopGlowOffset(int i7) {
        this.G0 = i7;
    }

    public void setViewCacheExtension(b1 b1Var) {
        this.b.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i7) {
        return getScrollingChildHelper().g(i7, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z9) {
        if (z9 != this.L) {
            l("Do not suppressLayout in layout or scroll");
            if (z9) {
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
        boolean z9;
        a1 a1Var = this.u0;
        a1Var.a(1);
        D(a1Var);
        a1Var.i = false;
        z0();
        d0 d0Var = this.f;
        a0.f fVar = (a0.f) d0Var.a;
        a0.f fVar2 = (a0.f) d0Var.a;
        fVar.clear();
        h hVar = (h) d0Var.b;
        hVar.b();
        h0();
        if (this.Q) {
            ug.k0 k0Var = this.d;
            k0Var.l((ArrayList) k0Var.d);
            k0Var.l((ArrayList) k0Var.e);
            k0Var.b = 0;
            if (this.R) {
                this.y.W(this);
            }
        }
        if (this.c0 == null || !this.y.y0()) {
            this.d.c();
        } else {
            this.d.k();
        }
        boolean z10 = this.x0 || this.y0;
        boolean z11 = this.I && this.c0 != null && ((z9 = this.Q) || z10 || this.y.f) && (!z9 || this.x.b);
        a1Var.j = z11;
        a1Var.k = z11 && z10 && !this.Q && this.c0 != null && this.y.y0();
        d1 d1Var = null;
        View focusedChild = (this.q0 && hasFocus() && this.x != null) ? getFocusedChild() : null;
        if (focusedChild != null && (F = F(focusedChild)) != null) {
            d1Var = T(F);
        }
        if (d1Var == null) {
            a1Var.m = -1L;
            a1Var.l = -1;
            a1Var.n = -1;
        } else {
            a1Var.m = this.x.b ? d1Var.e : -1L;
            a1Var.l = this.Q ? -1 : d1Var.j() ? d1Var.d : d1Var.b();
            View view = d1Var.a;
            int id2 = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id2 = view.getId();
                }
            }
            a1Var.n = id2;
        }
        a1Var.h = a1Var.j && this.y0;
        this.y0 = false;
        this.x0 = false;
        a1Var.g = a1Var.k;
        a1Var.e = this.x.b();
        I(this.C0);
        if (a1Var.j) {
            int v = this.e.v();
            for (int i7 = 0; i7 < v; i7++) {
                d1 U = U(this.e.u(i7));
                if (!U.r() && (!U.h() || this.x.b)) {
                    e2.r0 l10 = this.c0.l(a1Var, U, l0.b(U), U.d());
                    j1 j1Var2 = (j1) fVar2.get(U);
                    if (j1Var2 == null) {
                        j1Var2 = j1.a();
                        fVar2.put(U, j1Var2);
                    }
                    j1Var2.b = l10;
                    j1Var2.a |= 4;
                    if (a1Var.h && U.m() && !U.j() && !U.r() && !U.h()) {
                        hVar.k(U, Q(U));
                    }
                }
            }
        }
        if (a1Var.k) {
            int B = this.e.B();
            for (int i10 = 0; i10 < B; i10++) {
                d1 U2 = U(this.e.A(i10));
                if (!U2.r()) {
                    if (U2.d == -1) {
                        U2.d = U2.c;
                    }
                    U2.h = U2.c;
                }
            }
            boolean z12 = a1Var.f;
            a1Var.f = false;
            this.y.b0(this.b, a1Var);
            a1Var.f = z12;
            for (int i11 = 0; i11 < this.e.v(); i11++) {
                d1 U3 = U(this.e.u(i11));
                if (!U3.r() && ((j1Var = (j1) fVar2.get(U3)) == null || (j1Var.a & 4) == 0)) {
                    int b10 = l0.b(U3);
                    boolean e10 = U3.e(TLObject.FLAG_13);
                    if (!e10) {
                        b10 |= TLObject.FLAG_12;
                    }
                    e2.r0 l11 = this.c0.l(a1Var, U3, b10, U3.d());
                    if (e10) {
                        o0(U3, l11);
                    } else {
                        j1 j1Var3 = (j1) fVar2.get(U3);
                        if (j1Var3 == null) {
                            j1Var3 = j1.a();
                            fVar2.put(U3, j1Var3);
                        }
                        j1Var3.a |= 2;
                        j1Var3.b = l11;
                    }
                }
            }
            n();
        } else {
            n();
        }
        i0(true);
        A0(false);
        a1Var.d = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t0(int i7, int i10, MotionEvent motionEvent) {
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z9;
        p();
        g0 g0Var = this.x;
        int[] iArr = this.J0;
        if (g0Var != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            u0(i7, i10, iArr);
            i11 = iArr[0];
            i12 = iArr[1];
            i13 = i7 - i11;
            i14 = i10 - i12;
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (!this.D.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        w(i11, i12, i13, i14, this.E0, 0, iArr);
        int i15 = i13 - iArr[0];
        int i16 = i14 - iArr[1];
        int i17 = this.i0;
        int[] iArr2 = this.E0;
        int i18 = iArr2[0];
        this.i0 = i17 - i18;
        int i19 = this.j0;
        int i20 = iArr2[1];
        this.j0 = i19 - i20;
        if (motionEvent != null) {
            motionEvent.offsetLocation(i18, i20);
        }
        int[] iArr3 = this.F0;
        iArr3[0] = iArr3[0] + iArr2[0];
        iArr3[1] = iArr3[1] + iArr2[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x10 = motionEvent.getX();
                float f10 = i15;
                float y10 = motionEvent.getY();
                float f11 = i16;
                Integer num = this.I0;
                if (num == null || num.intValue() != 0) {
                    if (f10 < 0.0f) {
                        z();
                        b.a(this.V, (-f10) / getWidth(), 1.0f - (y10 / getHeight()));
                    } else if (f10 > 0.0f) {
                        A();
                        b.a(this.a0, f10 / getWidth(), y10 / getHeight());
                    } else {
                        z9 = false;
                        if (f11 >= 0.0f) {
                            B();
                            b.a(this.W, (-f11) / getHeight(), x10 / getWidth());
                        } else {
                            if (f11 > 0.0f) {
                                y();
                                b.a(this.b0, f11 / getHeight(), 1.0f - (x10 / getWidth()));
                            }
                            if (!z9 || f10 != 0.0f || f11 != 0.0f) {
                                WeakHashMap weakHashMap = i0.a;
                                postInvalidateOnAnimation();
                            }
                        }
                        z9 = true;
                        if (!z9) {
                        }
                        WeakHashMap weakHashMap2 = i0.a;
                        postInvalidateOnAnimation();
                    }
                    z9 = true;
                    if (f11 >= 0.0f) {
                    }
                    z9 = true;
                    if (!z9) {
                    }
                    WeakHashMap weakHashMap22 = i0.a;
                    postInvalidateOnAnimation();
                }
            }
            o(i7, i10);
        }
        if (i11 != 0 || i12 != 0) {
            x(i11, i12);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i11 == 0 && i12 == 0) ? false : true;
    }

    public final void u() {
        z0();
        h0();
        a1 a1Var = this.u0;
        a1Var.a(6);
        this.d.c();
        a1Var.e = this.x.b();
        a1Var.c = 0;
        a1Var.g = false;
        this.y.b0(this.b, a1Var);
        a1Var.f = false;
        this.c = null;
        a1Var.j = a1Var.j && this.c0 != null;
        a1Var.d = 4;
        i0(true);
        A0(false);
    }

    public final void u0(int i7, int i10, int[] iArr) {
        d1 d1Var;
        z0();
        h0();
        int i11 = n0.g.a;
        Trace.beginSection("RV Scroll");
        a1 a1Var = this.u0;
        D(a1Var);
        v0 v0Var = this.b;
        int m0 = i7 != 0 ? this.y.m0(i7, v0Var, a1Var) : 0;
        int o02 = i10 != 0 ? this.y.o0(i10, v0Var, a1Var) : 0;
        Trace.endSection();
        hy0 hy0Var = this.e;
        int v = hy0Var.v();
        for (int i12 = 0; i12 < v; i12++) {
            View u10 = hy0Var.u(i12);
            d1 T = T(u10);
            if (T != null && (d1Var = T.k) != null) {
                View view = d1Var.a;
                int left = u10.getLeft();
                int top = u10.getTop();
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

    public boolean v(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i7, i10, i11, iArr, iArr2);
    }

    public final void v0(int i7) {
        if (this.L) {
            return;
        }
        C0();
        n0 n0Var = this.y;
        if (n0Var == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            n0Var.n0(i7);
            awakenScrollBars();
        }
    }

    public final void w(int i7, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        getScrollingChildHelper().d(i7, i10, i11, i12, iArr, i13, iArr2);
    }

    public final void w0(int i7, int i10, Interpolator interpolator) {
        n0 n0Var = this.y;
        if (n0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.L) {
            return;
        }
        if (!n0Var.d()) {
            i7 = 0;
        }
        if (!this.y.e()) {
            i10 = 0;
        }
        if (i7 == 0 && i10 == 0) {
            return;
        }
        this.r0.b(i7, i10, TLObject.FLAG_31, interpolator);
    }

    public final void x(int i7, int i10) {
        this.T++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i7, scrollY - i10);
        l0(i10);
        s0 s0Var = this.v0;
        if (s0Var != null) {
            s0Var.b(this, i7, i10);
        }
        ArrayList arrayList = this.w0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((s0) this.w0.get(size)).b(this, i7, i10);
            }
        }
        this.T--;
    }

    public final void x0(int i7, int i10, Interpolator interpolator) {
        if (this.y == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.L) {
            return;
        }
        if (!this.y.e()) {
            i7 = 0;
        }
        if (i7 != 0) {
            this.r0.b(0, i7, i10, interpolator);
        }
    }

    public final void y() {
        if (this.b0 != null) {
            return;
        }
        EdgeEffect a10 = this.U.a(this, 3);
        this.b0 = a10;
        if (this.h) {
            a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a10.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
        k(this.b0);
    }

    public final void y0(int i7) {
        if (this.L) {
            return;
        }
        n0 n0Var = this.y;
        if (n0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            n0Var.v0(this, this.u0, i7);
        }
    }

    public final void z() {
        if (this.V != null) {
            return;
        }
        EdgeEffect a10 = this.U.a(this, 0);
        this.V = a10;
        if (this.h) {
            a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a10.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
        k(this.V);
    }

    public final void z0() {
        int i7 = this.J + 1;
        this.J = i7;
        if (i7 != 1 || this.L) {
            return;
        }
        this.K = false;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        float a10;
        float a11;
        this.a = new n1(this, 2);
        this.b = new v0(this);
        this.f = new d0(29);
        this.n = new f0(this, 0);
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
        this.c0 = new k();
        this.d0 = 0;
        this.e0 = -1;
        this.o0 = Float.MIN_VALUE;
        this.p0 = Float.MIN_VALUE;
        this.q0 = true;
        this.r0 = new c1(this);
        this.t0 = new f();
        a1 a1Var = new a1();
        a1Var.a = -1;
        a1Var.b = 0;
        a1Var.c = 0;
        a1Var.d = 1;
        a1Var.e = 0;
        a1Var.f = false;
        a1Var.g = false;
        a1Var.h = false;
        a1Var.i = false;
        a1Var.j = false;
        a1Var.k = false;
        this.u0 = a1Var;
        this.x0 = false;
        this.y0 = false;
        g gVar = new g(this);
        this.z0 = gVar;
        this.A0 = false;
        this.C0 = new int[2];
        this.E0 = new int[2];
        this.F0 = new int[2];
        this.G0 = 0;
        this.H0 = 0;
        this.I0 = null;
        this.J0 = new int[2];
        this.K0 = new ArrayList();
        this.L0 = new f0(this, 1);
        this.M0 = new g(this);
        this.O0 = true;
        this.P0 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q0, i7, 0);
            this.h = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.h = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.k0 = viewConfiguration.getScaledTouchSlop();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            Method method = r0.j0.a;
            a10 = z6.a.c(viewConfiguration);
        } else {
            a10 = r0.j0.a(viewConfiguration, context);
        }
        this.o0 = a10;
        if (i10 >= 26) {
            a11 = z6.a.d(viewConfiguration);
        } else {
            a11 = r0.j0.a(viewConfiguration, context);
        }
        this.p0 = a11;
        this.m0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.n0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.c0.a = gVar;
        this.d = new ug.k0(new qt(this, 22));
        this.e = new hy0(new uy(this, 25));
        WeakHashMap weakHashMap = i0.a;
        if ((i10 >= 26 ? c0.a(this) : 0) == 0 && i10 >= 26) {
            c0.b(this, 8);
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

    public void k0(int i7) {
    }

    public void l0(int i7) {
    }

    public void setRecyclerListener(w0 w0Var) {
    }
}
