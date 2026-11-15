package androidx.recyclerview.widget;

import a0.h;
import a8.va;
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
import c5.c;
import com.google.android.gms.internal.vision.e2;
import h2.f;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jg.m1;
import n0.g;
import org.telegram.messenger.a8;
import org.telegram.messenger.ns;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ff;
import org.telegram.ui.ld0;
import q0.a;
import r0.c0;
import r0.i0;
import r0.j;
import r0.j0;
import tg.x;
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
import v4.g1;
import v4.h0;
import v4.k;
import v4.k0;
import v4.k1;
import v4.l0;
import v4.m0;
import v4.n0;
import v4.o0;
import v4.p0;
import v4.q;
import v4.q0;
import v4.r0;
import v4.s0;
import v4.t0;
import v4.v0;
import v4.w0;
import v4.x0;
import v4.y0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] R0 = {R.attr.clipToPadding};
    public static final c S0 = new c(5);
    public final g0 A0;
    public boolean B0;
    public f1 C0;
    public final int[] D0;
    public final ArrayList E;
    public j E0;
    public final ArrayList F;
    public final int[] F0;
    public s0 G;
    public final int[] G0;
    public boolean H;
    public int H0;
    public boolean I;
    public int I0;
    public boolean J;
    public Integer J0;
    public int K;
    public final int[] K0;
    public boolean L;
    public final ArrayList L0;
    public boolean M;
    public final f0 M0;
    public boolean N;
    public final g0 N0;
    public int O;
    public String O0;
    public final AccessibilityManager P;
    public boolean P0;
    public ArrayList Q;
    public boolean Q0;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public l0 V;
    public EdgeEffect W;
    public final m1 a;
    public EdgeEffect a0;
    public final w0 b;
    public EdgeEffect b0;
    public y0 c;
    public EdgeEffect c0;
    public final ug.l0 d;
    public m0 d0;
    public final ld0 e;
    public int e0;
    public final x f;
    public int f0;
    public VelocityTracker g0;
    public boolean h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public r0 m0;
    public final f0 n;
    public final int n0;
    public final int o0;
    public final float p0;
    public final float q0;
    public final Rect r;
    public boolean r0;
    public final Rect s;
    public final d1 s0;
    public q t0;
    public final f u0;
    public final b1 v0;
    public final RectF w;
    public t0 w0;
    public h0 x;
    public ArrayList x0;
    public o0 y;
    public boolean y0;
    public boolean z0;

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
        if (layoutParams instanceof p0) {
            return ((p0) layoutParams).a;
        }
        return null;
    }

    private j getScrollingChildHelper() {
        if (this.E0 == null) {
            this.E0 = new j(this);
        }
        return this.E0;
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
        if (this.b0 != null) {
            return;
        }
        EdgeEffect a10 = this.V.a(this, 2);
        this.b0 = a10;
        if (this.h) {
            a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a10.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
        k(this.b0);
    }

    public final void A0(boolean z10) {
        if (this.K < 1) {
            this.K = 1;
        }
        if (!z10 && !this.M) {
            this.L = false;
        }
        if (this.K == 1) {
            if (z10 && this.L && !this.M && this.y != null && this.x != null) {
                s();
            }
            if (!this.M) {
                this.L = false;
            }
        }
        this.K--;
    }

    public final void B() {
        if (this.a0 != null) {
            return;
        }
        EdgeEffect a10 = this.V.a(this, 1);
        this.a0 = a10;
        if (this.h) {
            a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a10.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
        k(this.a0);
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
        sb3.append(this.O0);
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
        a1 a1Var;
        setScrollState(0);
        d1 d1Var = this.s0;
        RecyclerView recyclerView = d1Var.h;
        if (recyclerView.P0) {
            recyclerView.removeCallbacks(d1Var);
            d1Var.c.abortAnimation();
        }
        o0 o0Var = this.y;
        if (o0Var == null || (a1Var = o0Var.e) == null) {
            return;
        }
        a1Var.h();
    }

    public final void D(b1 b1Var) {
        if (getScrollState() != 2) {
            b1Var.getClass();
            return;
        }
        OverScroller overScroller = this.s0.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        b1Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View E(float f10, float f11) {
        for (int u10 = this.e.u() - 1; u10 >= 0; u10--) {
            View t6 = this.e.t(u10);
            float translationX = t6.getTranslationX();
            float translationY = t6.getTranslationY();
            if (f10 >= t6.getLeft() + translationX && f10 <= t6.getRight() + translationX && f11 >= t6.getTop() + translationY && f11 <= t6.getBottom() + translationY) {
                return t6;
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
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            s0 s0Var = (s0) arrayList.get(i7);
            if (s0Var.b(this, motionEvent) && action != 3) {
                this.G = s0Var;
                return true;
            }
        }
        return false;
    }

    public final void I(int[] iArr) {
        int u10 = this.e.u();
        if (u10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i10 = TLObject.FLAG_31;
        for (int i11 = 0; i11 < u10; i11++) {
            e1 U = U(this.e.t(i11));
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

    public final e1 K(int i7) {
        e1 e1Var = null;
        if (this.R) {
            return null;
        }
        int z10 = this.e.z();
        for (int i10 = 0; i10 < z10; i10++) {
            e1 U = U(this.e.y(i10));
            if (U != null && !U.j() && N(U) == i7) {
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
    public final e1 L(int i7, boolean z10) {
        int z11 = this.e.z();
        e1 e1Var = null;
        for (int i10 = 0; i10 < z11; i10++) {
            e1 U = U(this.e.y(i10));
            if (U != null && !U.j()) {
                if (z10) {
                    if (U.c != i7) {
                        continue;
                    }
                    if (((ArrayList) this.e.d).contains(U.a)) {
                        return U;
                    }
                    e1Var = U;
                } else {
                    if (U.c() != i7) {
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

    public final int N(e1 e1Var) {
        if (e1Var.e(524) || !e1Var.g()) {
            return -1;
        }
        int i7 = e1Var.c;
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
        w0 w0Var = this.b;
        if (i7 >= ((ArrayList) w0Var.c).size()) {
            return null;
        }
        return ((e1) ((ArrayList) w0Var.c).get(i7)).a;
    }

    public final View P(int i7) {
        if (i7 < 0) {
            return null;
        }
        w0 w0Var = this.b;
        if (i7 >= ((ArrayList) w0Var.e).size()) {
            return null;
        }
        return ((e1) ((ArrayList) w0Var.e).get(i7)).a;
    }

    public final long Q(e1 e1Var) {
        return this.x.b ? e1Var.e : e1Var.c;
    }

    public final e1 T(View view) {
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
        p0 p0Var = (p0) view.getLayoutParams();
        boolean z10 = p0Var.c;
        Rect rect = p0Var.b;
        if (z10) {
            b1 b1Var = this.v0;
            if (!b1Var.g || (!p0Var.a.m() && !p0Var.a.h())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.E;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    Rect rect2 = this.r;
                    rect2.set(0, 0, 0, 0);
                    ((n0) arrayList.get(i7)).e(rect2, view, this, b1Var);
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

    public final n0 X(int i7) {
        int itemDecorationCount = getItemDecorationCount();
        if (i7 < 0 || i7 >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(e2.j(i7, " is an invalid index for size ", itemDecorationCount));
        }
        return (n0) this.E.get(i7);
    }

    public final void Y(long j3, e1 e1Var, e1 e1Var2) {
        int u10 = this.e.u();
        for (int i7 = 0; i7 < u10; i7++) {
            e1 U = U(this.e.t(i7));
            if (U != e1Var && Q(U) == j3) {
                h0 h0Var = this.x;
                if (h0Var == null || !h0Var.b) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + U + " \n View Holder 2:" + e1Var + C());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + U + " \n View Holder 2:" + e1Var + C());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + e1Var2 + " cannot be found but it is necessary for " + e1Var + C());
    }

    public final boolean Z() {
        return !this.J || this.R || this.d.g();
    }

    public final void a0() {
        if (this.E.size() == 0) {
            return;
        }
        o0 o0Var = this.y;
        if (o0Var != null) {
            o0Var.b("Cannot invalidate item decorations during a scroll or layout");
        }
        e0();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i7, int i10) {
        o0 o0Var = this.y;
        if (o0Var != null) {
            o0Var.getClass();
        }
        super.addFocusables(arrayList, i7, i10);
    }

    public final boolean b0() {
        m0 m0Var = this.d0;
        return m0Var != null && m0Var.k();
    }

    public final boolean c0() {
        return this.T > 0;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p0) && this.y.f((p0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        o0 o0Var = this.y;
        if (o0Var == null || !o0Var.d()) {
            return 0;
        }
        return ((b0) this.y).B0(this.v0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        o0 o0Var = this.y;
        if (o0Var != null && o0Var.d()) {
            return this.y.h(this.v0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        o0 o0Var = this.y;
        if (o0Var != null && o0Var.d()) {
            return this.y.i(this.v0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        o0 o0Var = this.y;
        if (o0Var != null && o0Var.e()) {
            return this.y.j(this.v0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        o0 o0Var = this.y;
        if (o0Var != null && o0Var.e()) {
            return this.y.k(this.v0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        o0 o0Var = this.y;
        if (o0Var != null && o0Var.e()) {
            return this.y.l(this.v0);
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
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
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
        boolean z10;
        super.draw(canvas);
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i7 = 0; i7 < size; i7++) {
            ((n0) arrayList.get(i7)).g(canvas, this);
        }
        Integer num = this.J0;
        if (num == null || num.intValue() != 0) {
            EdgeEffect edgeEffect = this.W;
            if (edgeEffect == null || edgeEffect.isFinished()) {
                z10 = false;
            } else {
                int save = canvas.save();
                int paddingBottom = this.h ? getPaddingBottom() : 0;
                canvas.rotate(270.0f);
                canvas.translate((-getHeight()) + paddingBottom, 0.0f);
                EdgeEffect edgeEffect2 = this.W;
                z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
                canvas.restoreToCount(save);
            }
            EdgeEffect edgeEffect3 = this.a0;
            if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
                int save2 = canvas.save();
                if (this.h) {
                    canvas.translate(getPaddingLeft(), getPaddingTop());
                }
                canvas.translate(0.0f, this.H0);
                EdgeEffect edgeEffect4 = this.a0;
                z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
                canvas.restoreToCount(save2);
            }
            EdgeEffect edgeEffect5 = this.b0;
            if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
                int save3 = canvas.save();
                int width = getWidth();
                int paddingTop = this.h ? getPaddingTop() : 0;
                canvas.rotate(90.0f);
                canvas.translate(-paddingTop, -width);
                EdgeEffect edgeEffect6 = this.b0;
                z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
                canvas.restoreToCount(save3);
            }
            EdgeEffect edgeEffect7 = this.c0;
            if (edgeEffect7 == null || edgeEffect7.isFinished()) {
                z11 = z10;
            } else {
                int save4 = canvas.save();
                canvas.rotate(180.0f);
                if (this.h) {
                    canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
                } else {
                    canvas.translate(-getWidth(), (-getHeight()) + this.I0);
                }
                EdgeEffect edgeEffect8 = this.c0;
                if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                    z11 = true;
                }
                z11 |= z10;
                canvas.restoreToCount(save4);
            }
        }
        if ((z11 || this.d0 == null || arrayList.size() <= 0 || !this.d0.k()) ? z11 : true) {
            WeakHashMap weakHashMap = i0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    public final void e0() {
        int z10 = this.e.z();
        for (int i7 = 0; i7 < z10; i7++) {
            ((p0) this.e.y(i7).getLayoutParams()).c = true;
        }
        ArrayList arrayList = (ArrayList) this.b.e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            p0 p0Var = (p0) ((e1) arrayList.get(i10)).a.getLayoutParams();
            if (p0Var != null) {
                p0Var.c = true;
            }
        }
    }

    public final void f0(int i7, int i10, boolean z10) {
        int i11 = i7 + i10;
        int z11 = this.e.z();
        for (int i12 = 0; i12 < z11; i12++) {
            e1 U = U(this.e.y(i12));
            if (U != null && !U.r()) {
                int i13 = U.c;
                b1 b1Var = this.v0;
                if (i13 >= i11) {
                    U.n(-i10, z10);
                    b1Var.f = true;
                } else if (i13 >= i7) {
                    U.a(8);
                    U.n(-i10, z10);
                    U.c = i7 - 1;
                    b1Var.f = true;
                }
            }
        }
        w0 w0Var = this.b;
        ArrayList arrayList = (ArrayList) w0Var.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e1 e1Var = (e1) arrayList.get(size);
            if (e1Var != null) {
                int i14 = e1Var.c;
                if (i14 >= i11) {
                    e1Var.n(-i10, z10);
                } else if (i14 >= i7) {
                    e1Var.a(8);
                    w0Var.f(size);
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
        boolean z10;
        this.y.getClass();
        boolean z11 = true;
        boolean z12 = (this.x == null || this.y == null || c0() || this.M) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        b1 b1Var = this.v0;
        w0 w0Var = this.b;
        if (z12 && (i7 == 2 || i7 == 1)) {
            if (this.y.e()) {
                if (focusFinder.findNextFocus(this, view, i7 == 2 ? ns.O1 : 33) == null) {
                    z10 = true;
                    if (!z10 && this.y.d()) {
                        RecyclerView recyclerView = this.y.b;
                        WeakHashMap weakHashMap = i0.a;
                        z10 = focusFinder.findNextFocus(this, view, !((recyclerView.getLayoutDirection() != 1) ^ (i7 != 2)) ? 66 : 17) != null;
                    }
                    if (z10) {
                        p();
                        if (F(view) != null) {
                            z0();
                            this.y.R(view, i7, w0Var, b1Var);
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
                WeakHashMap weakHashMap2 = i0.a;
                if (focusFinder.findNextFocus(this, view, !((recyclerView2.getLayoutDirection() != 1) ^ (i7 != 2)) ? 66 : 17) != null) {
                }
            }
            if (z10) {
            }
            view2 = focusFinder.findNextFocus(this, view, i7);
            if (view2 == null) {
            }
            if (view2 != null) {
            }
            z11 = false;
            if (z11) {
            }
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i7);
            if (findNextFocus == null && z12) {
                p();
                if (F(view) != null) {
                    z0();
                    view2 = this.y.R(view, i7, w0Var, b1Var);
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
                return z11 ? view2 : super.focusSearch(view, i7);
            }
            z11 = false;
            if (z11) {
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o0 o0Var = this.y;
        if (o0Var != null) {
            return o0Var.n();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + C());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o0 o0Var = this.y;
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
        return this.x;
    }

    public int getAttachedScrapChildCount() {
        return ((ArrayList) this.b.c).size();
    }

    @Override // android.view.View
    public int getBaseline() {
        o0 o0Var = this.y;
        if (o0Var == null) {
            return super.getBaseline();
        }
        o0Var.getClass();
        return -1;
    }

    public int getBottomGlowOffset() {
        return this.I0;
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

    public f1 getCompatAccessibilityDelegate() {
        return this.C0;
    }

    public float getCurrentVelocity() {
        VelocityTracker velocityTracker = this.g0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.o0);
        return this.g0.getYVelocity();
    }

    public l0 getEdgeEffectFactory() {
        return this.V;
    }

    public int getGlowColor() {
        Integer num = this.J0;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int getHiddenChildCount() {
        return ((ArrayList) this.e.d).size();
    }

    public m0 getItemAnimator() {
        return this.d0;
    }

    public int getItemDecorationCount() {
        return this.E.size();
    }

    public o0 getLayoutManager() {
        return this.y;
    }

    public int getMaxFlingVelocity() {
        return this.o0;
    }

    public int getMinFlingVelocity() {
        return this.n0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public r0 getOnFlingListener() {
        return this.m0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.r0;
    }

    public v0 getRecycledViewPool() {
        return this.b.c();
    }

    public int getScrollState() {
        return this.e0;
    }

    public int getTopGlowOffset() {
        return this.H0;
    }

    public final void h(e1 e1Var) {
        View view = e1Var.a;
        boolean z10 = view.getParent() == this;
        this.b.k(T(view));
        if (e1Var.l()) {
            this.e.l(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z10) {
            this.e.k(-1, view, true);
            return;
        }
        ld0 ld0Var = this.e;
        int indexOfChild = ((RecyclerView) ((ff) ld0Var.b).b).indexOfChild(view);
        if (indexOfChild >= 0) {
            ((va) ld0Var.c).A(indexOfChild);
            ld0Var.B(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void h0() {
        this.T++;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(n0 n0Var) {
        o0 o0Var = this.y;
        if (o0Var != null) {
            o0Var.b("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(n0Var);
        e0();
        requestLayout();
    }

    public final void i0(boolean z10) {
        int i7;
        AccessibilityManager accessibilityManager;
        int i10 = this.T - 1;
        this.T = i10;
        if (i10 < 1) {
            this.T = 0;
            if (z10) {
                int i11 = this.O;
                this.O = 0;
                if (i11 != 0 && (accessibilityManager = this.P) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i11);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.L0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    e1 e1Var = (e1) arrayList.get(size);
                    if (e1Var.a.getParent() == this && !e1Var.r() && (i7 = e1Var.s) != -1) {
                        View view = e1Var.a;
                        WeakHashMap weakHashMap = i0.a;
                        view.setImportantForAccessibility(i7);
                        e1Var.s = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.H;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.M;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(t0 t0Var) {
        if (this.x0 == null) {
            this.x0 = new ArrayList();
        }
        this.x0.add(t0Var);
    }

    public final void j0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f0) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f0 = motionEvent.getPointerId(i7);
            int x10 = (int) (motionEvent.getX(i7) + 0.5f);
            this.j0 = x10;
            this.h0 = x10;
            int y10 = (int) (motionEvent.getY(i7) + 0.5f);
            this.k0 = y10;
            this.i0 = y10;
        }
    }

    public final void k(EdgeEffect edgeEffect) {
        Integer num;
        if (edgeEffect == null || (num = this.J0) == null) {
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
        if (this.U > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + C()));
        }
    }

    public final void m0() {
        if (this.B0 || !this.H) {
            return;
        }
        WeakHashMap weakHashMap = i0.a;
        postOnAnimation(this.M0);
        this.B0 = true;
    }

    public final void n() {
        int z10 = this.e.z();
        for (int i7 = 0; i7 < z10; i7++) {
            e1 U = U(this.e.y(i7));
            if (U != null && !U.r()) {
                U.d = -1;
                U.g = -1;
            }
        }
        w0 w0Var = this.b;
        ArrayList arrayList = (ArrayList) w0Var.c;
        ArrayList arrayList2 = (ArrayList) w0Var.e;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            e1 e1Var = (e1) arrayList2.get(i10);
            e1Var.d = -1;
            e1Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            e1 e1Var2 = (e1) arrayList.get(i11);
            e1Var2.d = -1;
            e1Var2.g = -1;
        }
        ArrayList arrayList3 = (ArrayList) w0Var.d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                e1 e1Var3 = (e1) ((ArrayList) w0Var.d).get(i12);
                e1Var3.d = -1;
                e1Var3.g = -1;
            }
        }
    }

    public final void n0(boolean z10) {
        this.S = z10 | this.S;
        this.R = true;
        int z11 = this.e.z();
        for (int i7 = 0; i7 < z11; i7++) {
            e1 U = U(this.e.y(i7));
            if (U != null && !U.r()) {
                U.a(6);
            }
        }
        e0();
        w0 w0Var = this.b;
        ArrayList arrayList = (ArrayList) w0Var.e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            e1 e1Var = (e1) arrayList.get(i10);
            if (e1Var != null) {
                e1Var.a(6);
                e1Var.a(1024);
            }
        }
        h0 h0Var = ((RecyclerView) w0Var.h).x;
        if (h0Var == null || !h0Var.b) {
            w0Var.e();
        }
    }

    public final void o(int i7, int i10) {
        boolean z10;
        EdgeEffect edgeEffect = this.W;
        if (edgeEffect == null || edgeEffect.isFinished() || i7 <= 0) {
            z10 = false;
        } else {
            this.W.onRelease();
            z10 = this.W.isFinished();
        }
        EdgeEffect edgeEffect2 = this.b0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i7 < 0) {
            this.b0.onRelease();
            z10 |= this.b0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.a0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i10 > 0) {
            this.a0.onRelease();
            z10 |= this.a0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.c0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i10 < 0) {
            this.c0.onRelease();
            z10 |= this.c0.isFinished();
        }
        if (z10) {
            WeakHashMap weakHashMap = i0.a;
            postInvalidateOnAnimation();
        }
    }

    public final void o0(e1 e1Var, e2.r0 r0Var) {
        e1Var.p(0, TLObject.FLAG_13);
        boolean z10 = this.v0.h;
        x xVar = this.f;
        if (z10 && e1Var.m() && !e1Var.j() && !e1Var.r()) {
            ((h) xVar.c).k(e1Var, Q(e1Var));
        }
        a0.f fVar = (a0.f) xVar.b;
        k1 k1Var = (k1) fVar.get(e1Var);
        if (k1Var == null) {
            k1Var = k1.a();
            fVar.put(e1Var, k1Var);
        }
        k1Var.b = r0Var;
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
        float f10;
        super.onAttachedToWindow();
        this.T = 0;
        this.H = true;
        this.J = this.J && !isLayoutRequested();
        o0 o0Var = this.y;
        if (o0Var != null) {
            o0Var.getClass();
        }
        this.B0 = false;
        ThreadLocal threadLocal = q.e;
        q qVar = (q) threadLocal.get();
        this.t0 = qVar;
        if (qVar == null) {
            q qVar2 = new q();
            qVar2.a = new ArrayList();
            qVar2.d = new ArrayList();
            this.t0 = qVar2;
            WeakHashMap weakHashMap = i0.a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f10 = display.getRefreshRate();
            }
            f10 = 60.0f;
            q qVar3 = this.t0;
            qVar3.c = (long) (1.0E9f / f10);
            threadLocal.set(qVar3);
        }
        this.t0.a.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m0 m0Var = this.d0;
        if (m0Var != null) {
            m0Var.g();
        }
        C0();
        this.H = false;
        this.L0.clear();
        removeCallbacks(this.M0);
        this.f.getClass();
        while (k1.d.a() != null) {
        }
        q qVar = this.t0;
        if (qVar != null) {
            qVar.a.remove(this);
            this.t0 = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((n0) arrayList.get(i7)).f(canvas, this);
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
        if (this.y != null && !this.M && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f10 = this.y.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.y.d()) {
                    f11 = motionEvent.getAxisValue(10);
                    if (f10 == 0.0f || f11 != 0.0f) {
                        t0((int) (f11 * this.p0), (int) (f10 * this.q0), motionEvent);
                    }
                }
                f11 = 0.0f;
                if (f10 == 0.0f) {
                }
                t0((int) (f11 * this.p0), (int) (f10 * this.q0), motionEvent);
            } else {
                if ((motionEvent.getSource() & TLObject.FLAG_22) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.y.e()) {
                        f10 = -axisValue;
                        f11 = 0.0f;
                        if (f10 == 0.0f) {
                        }
                        t0((int) (f11 * this.p0), (int) (f10 * this.q0), motionEvent);
                    } else if (this.y.d()) {
                        f11 = axisValue;
                        f10 = 0.0f;
                        if (f10 == 0.0f) {
                        }
                        t0((int) (f11 * this.p0), (int) (f10 * this.q0), motionEvent);
                    }
                }
                f10 = 0.0f;
                f11 = 0.0f;
                if (f10 == 0.0f) {
                }
                t0((int) (f11 * this.p0), (int) (f10 * this.q0), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (!this.M) {
            this.G = null;
            if (H(motionEvent)) {
                s0();
                setScrollState(0);
                return true;
            }
            o0 o0Var = this.y;
            if (o0Var != null) {
                boolean d = o0Var.d();
                boolean e10 = this.y.e();
                if (this.g0 == null) {
                    this.g0 = VelocityTracker.obtain();
                }
                this.g0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.N) {
                        this.N = false;
                    }
                    this.f0 = motionEvent.getPointerId(0);
                    int x10 = (int) (motionEvent.getX() + 0.5f);
                    this.j0 = x10;
                    this.h0 = x10;
                    int y10 = (int) (motionEvent.getY() + 0.5f);
                    this.k0 = y10;
                    this.i0 = y10;
                    if (this.e0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        B0(1);
                    }
                    int[] iArr = this.G0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i7 = d;
                    if (e10) {
                        i7 = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i7, 0);
                } else if (actionMasked == 1) {
                    this.g0.clear();
                    B0(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f0);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.e0 != 1) {
                        int i10 = x11 - this.h0;
                        int i11 = y11 - this.i0;
                        if (d == 0 || Math.abs(i10) <= this.l0) {
                            z10 = false;
                        } else {
                            this.j0 = x11;
                            z10 = true;
                        }
                        if (e10 && Math.abs(i11) > this.l0) {
                            this.k0 = y11;
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
                    this.f0 = motionEvent.getPointerId(actionIndex);
                    int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.j0 = x12;
                    this.h0 = x12;
                    int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.k0 = y12;
                    this.i0 = y12;
                } else if (actionMasked == 6) {
                    j0(motionEvent);
                }
                if (this.e0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = g.a;
        Trace.beginSection("RV OnLayout");
        s();
        Trace.endSection();
        this.J = true;
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        if (this.y == null) {
            q(i7, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        o0 o0Var = this.y;
        w0 w0Var = this.b;
        b1 b1Var = this.v0;
        o0Var.d0(w0Var, b1Var, i7, i10);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.x == null) {
            return;
        }
        if (b1Var.d == 1) {
            t();
        }
        this.y.q0(i7, i10);
        b1Var.i = true;
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
                b1Var.i = true;
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
        if (!(parcelable instanceof y0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y0 y0Var = (y0) parcelable;
        this.c = y0Var;
        super.onRestoreInstanceState(y0Var.a);
        o0 o0Var = this.y;
        if (o0Var == null || (parcelable2 = this.c.c) == null) {
            return;
        }
        b0 b0Var = (b0) o0Var;
        if (parcelable2 instanceof a0) {
            b0Var.B = (a0) parcelable2;
            b0Var.l0();
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
        o0 o0Var = this.y;
        if (o0Var != null) {
            y0Var.c = o0Var.e0();
            return y0Var;
        }
        y0Var.c = null;
        return y0Var;
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 == i11 && i10 == i12) {
            return;
        }
        this.c0 = null;
        this.a0 = null;
        this.b0 = null;
        this.W = null;
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
        if (!this.M && !this.N) {
            s0 s0Var = this.G;
            if (s0Var == null) {
                z10 = motionEvent.getAction() == 0 ? false : H(motionEvent);
            } else {
                s0Var.a(this, motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.G = null;
                }
                z10 = true;
            }
            if (z10) {
                s0();
                setScrollState(0);
                return true;
            }
            o0 o0Var = this.y;
            if (o0Var != null) {
                boolean d = o0Var.d();
                boolean e10 = this.y.e();
                if (this.g0 == null) {
                    this.g0 = VelocityTracker.obtain();
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.G0;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                obtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked == 0) {
                    this.f0 = motionEvent.getPointerId(0);
                    int x10 = (int) (motionEvent.getX() + 0.5f);
                    this.j0 = x10;
                    this.h0 = x10;
                    int y10 = (int) (motionEvent.getY() + 0.5f);
                    this.k0 = y10;
                    this.i0 = y10;
                    int i7 = d;
                    if (e10) {
                        i7 = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i7, 0);
                } else {
                    if (actionMasked == 1) {
                        this.g0.addMovement(obtain);
                        VelocityTracker velocityTracker = this.g0;
                        int i10 = this.o0;
                        velocityTracker.computeCurrentVelocity(1000, i10);
                        float f10 = d != 0 ? -this.g0.getXVelocity(this.f0) : 0.0f;
                        float f11 = e10 ? -this.g0.getYVelocity(this.f0) : 0.0f;
                        if (f10 != 0.0f || f11 != 0.0f) {
                            int i11 = (int) f10;
                            int i12 = (int) f11;
                            o0 o0Var2 = this.y;
                            if (o0Var2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.M) {
                                int d2 = o0Var2.d();
                                boolean e11 = this.y.e();
                                int i13 = this.n0;
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
                                        boolean z12 = d2 != 0 || e11;
                                        dispatchNestedFling(f12, f13, z12);
                                        r0 r0Var = this.m0;
                                        if (r0Var == null || !r0Var.a(i11, i12)) {
                                            if (z12) {
                                                if (e11) {
                                                    d2 = (d2 == true ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().g(d2, 1);
                                                int i14 = -i10;
                                                int max = Math.max(i14, Math.min(i11, i10));
                                                int max2 = Math.max(i14, Math.min(i12, i10));
                                                d1 d1Var = this.s0;
                                                RecyclerView recyclerView = d1Var.h;
                                                recyclerView.setScrollState(2);
                                                d1Var.b = 0;
                                                d1Var.a = 0;
                                                Interpolator interpolator = d1Var.d;
                                                c cVar = S0;
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
                        int findPointerIndex = motionEvent.findPointerIndex(this.f0);
                        if (findPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f0 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i15 = this.j0 - x11;
                        int i16 = this.k0 - y11;
                        int[] iArr2 = this.K0;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        boolean v = v(i15, i16, 0, iArr2, this.F0);
                        int[] iArr3 = this.F0;
                        if (v) {
                            i15 -= iArr2[0];
                            i16 -= iArr2[1];
                            obtain.offsetLocation(iArr3[0], iArr3[1]);
                            iArr[0] = iArr[0] + iArr3[0];
                            iArr[1] = iArr[1] + iArr3[1];
                        }
                        if (this.e0 != 1) {
                            if (d != 0) {
                                int abs = Math.abs(i15);
                                int i17 = this.l0;
                                if (abs > i17) {
                                    i15 = i15 > 0 ? i15 - i17 : i15 + i17;
                                    z11 = true;
                                    if (e10) {
                                        int abs2 = Math.abs(i16);
                                        int i18 = this.l0;
                                        if (abs2 > i18) {
                                            i16 = i16 > 0 ? i16 - i18 : i16 + i18;
                                            z11 = true;
                                        }
                                    }
                                    if (z11) {
                                        setScrollState(1);
                                    }
                                }
                            }
                            z11 = false;
                            if (e10) {
                            }
                            if (z11) {
                            }
                        }
                        if (this.e0 == 1) {
                            this.j0 = x11 - iArr3[0];
                            this.k0 = y11 - iArr3[1];
                            if (t0(d != 0 ? i15 : 0, e10 ? i16 : 0, obtain)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            q qVar = this.t0;
                            if (qVar != null && (i15 != 0 || i16 != 0)) {
                                qVar.a(this, i15, i16);
                            }
                        }
                    } else if (actionMasked == 3) {
                        s0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.f0 = motionEvent.getPointerId(actionIndex);
                        int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.j0 = x12;
                        this.h0 = x12;
                        int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.k0 = y12;
                        this.i0 = y12;
                    } else if (actionMasked == 6) {
                        j0(motionEvent);
                    }
                }
                this.g0.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        if (!this.J || this.R) {
            int i7 = g.a;
            Trace.beginSection("RV FullInvalidate");
            s();
            Trace.endSection();
            return;
        }
        ug.l0 l0Var = this.d;
        if (l0Var.g()) {
            int i10 = l0Var.b;
            if ((i10 & 4) == 0 || (i10 & 11) != 0) {
                if (l0Var.g()) {
                    int i11 = g.a;
                    Trace.beginSection("RV FullInvalidate");
                    s();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i12 = g.a;
            Trace.beginSection("RV PartialInvalidate");
            z0();
            h0();
            l0Var.k();
            if (!this.L) {
                ld0 ld0Var = this.e;
                int u10 = ld0Var.u();
                int i13 = 0;
                while (true) {
                    if (i13 < u10) {
                        e1 U = U(ld0Var.t(i13));
                        if (U != null && !U.r() && U.m()) {
                            s();
                            break;
                        }
                        i13++;
                    } else {
                        l0Var.b();
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
        m0 m0Var = this.d0;
        if (m0Var != null) {
            m0Var.g();
        }
        o0 o0Var = this.y;
        w0 w0Var = this.b;
        if (o0Var != null) {
            o0Var.g0(w0Var);
            this.y.h0(w0Var);
        }
        ((ArrayList) w0Var.c).clear();
        w0Var.e();
    }

    public final void q(int i7, int i10) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = i0.a;
        setMeasuredDimension(o0.g(i7, paddingRight, getMinimumWidth()), o0.g(i10, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void q0(n0 n0Var) {
        o0 o0Var = this.y;
        if (o0Var != null) {
            o0Var.b("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.E;
        arrayList.remove(n0Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        e0();
        requestLayout();
    }

    public final void r(View view) {
        e1 U = U(view);
        h0 h0Var = this.x;
        if (h0Var != null && U != null) {
            h0Var.z(U);
        }
        ArrayList arrayList = this.Q;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((q0) this.Q.get(size)).a(view);
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
        this.y.k0(this, view, this.r, !this.J, view2 == null);
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
        a1 a1Var = this.y.e;
        if ((a1Var == null || !a1Var.e) && !c0() && view2 != null) {
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
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((s0) arrayList.get(i7)).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.K != 0 || this.M) {
            this.L = true;
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
        k1 k1Var;
        boolean z10;
        ?? r11;
        boolean r10;
        int i7;
        int i10;
        int i11;
        int i12;
        e1 e1Var;
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
        b1 b1Var = this.v0;
        boolean z12 = false;
        b1Var.i = false;
        boolean z13 = true;
        if (b1Var.d == 1) {
            t();
            this.y.p0(this);
            u();
        } else {
            ug.l0 l0Var = this.d;
            if ((((ArrayList) l0Var.e).isEmpty() || ((ArrayList) l0Var.d).isEmpty()) && this.y.m == getWidth() && this.y.n == getHeight()) {
                this.y.p0(this);
            } else {
                this.y.p0(this);
                u();
            }
        }
        b1Var.a(4);
        z0();
        h0();
        b1Var.d = 1;
        boolean z14 = b1Var.j;
        w0 w0Var = this.b;
        x xVar = this.f;
        if (z14) {
            try {
                for (int u10 = this.e.u() - 1; u10 >= 0; u10--) {
                    e1 U = U(this.e.t(u10));
                    if (U != null && !U.r()) {
                        long Q = Q(U);
                        this.d0.getClass();
                        e2.r0 r0Var = new e2.r0();
                        View view = U.a;
                        r0Var.a = view.getLeft();
                        r0Var.b = view.getTop();
                        view.getRight();
                        view.getBottom();
                        h hVar = (h) xVar.c;
                        a0.f fVar = (a0.f) xVar.b;
                        e1 e1Var2 = (e1) hVar.f(Q);
                        if (e1Var2 == null || e1Var2.r()) {
                            xVar.b(U, r0Var);
                        } else {
                            k1 k1Var2 = (k1) fVar.get(e1Var2);
                            ?? r15 = (k1Var2 == null || (k1Var2.a & 1) == 0) ? false : true;
                            k1 k1Var3 = (k1) fVar.get(U);
                            ?? r14 = (k1Var3 == null || (k1Var3.a & 1) == 0) ? false : true;
                            if (r15 == true && e1Var2 == U) {
                                xVar.b(U, r0Var);
                            } else {
                                e2.r0 e10 = xVar.e(e1Var2, 4);
                                xVar.b(U, r0Var);
                                e2.r0 e11 = xVar.e(U, 8);
                                if (e10 == null) {
                                    Y(Q, U, e1Var2);
                                } else {
                                    e1Var2.q(false);
                                    if (r15 != false) {
                                        h(e1Var2);
                                    }
                                    if (e1Var2 != U) {
                                        if (r14 != false) {
                                            h(U);
                                        }
                                        e1Var2.j = U;
                                        h(e1Var2);
                                        w0Var.k(e1Var2);
                                        U.q(false);
                                        U.k = e1Var2;
                                    }
                                    g1 g1Var = (g1) this.d0;
                                    g1Var.getClass();
                                    int i13 = e10.a;
                                    int i14 = e10.b;
                                    if (U.r()) {
                                        i11 = e10.a;
                                        i12 = e10.b;
                                    } else {
                                        i11 = e11.a;
                                        i12 = e11.b;
                                    }
                                    if (g1Var.q(e1Var2, U, e10, i13, i14, i11, i12)) {
                                        m0();
                                    }
                                }
                            }
                        }
                    }
                }
                a0.f fVar2 = (a0.f) xVar.b;
                int i15 = fVar2.c - 1;
                while (i15 >= 0) {
                    e1 e1Var3 = (e1) fVar2.f(i15);
                    try {
                        k1Var = (k1) fVar2.g(i15);
                    } catch (Exception e12) {
                        a8.g(e12, z13);
                        k1Var = null;
                    }
                    if (k1Var == null) {
                        z10 = z13;
                    } else {
                        int i16 = k1Var.a;
                        int i17 = i16 & 3;
                        g0 g0Var = this.N0;
                        if (i17 == 3) {
                            g0Var.b(e1Var3);
                        } else if ((i16 & 1) != 0) {
                            e2.r0 r0Var2 = k1Var.b;
                            if (r0Var2 == null) {
                                g0Var.b(e1Var3);
                            } else {
                                g0Var.a(e1Var3, r0Var2, k1Var.c);
                            }
                        } else if ((i16 & 14) == 14) {
                            e2.r0 r0Var3 = k1Var.b;
                            e2.r0 r0Var4 = k1Var.c;
                            RecyclerView recyclerView = g0Var.a;
                            e1Var3.q(z12);
                            if (recyclerView.d0.a(e1Var3, r0Var3, r0Var4)) {
                                recyclerView.m0();
                            }
                        } else {
                            if ((i16 & 12) == 12) {
                                e2.r0 r0Var5 = k1Var.b;
                                e2.r0 r0Var6 = k1Var.c;
                                g0Var.getClass();
                                e1Var3.q(z12);
                                RecyclerView recyclerView2 = g0Var.a;
                                if (recyclerView2.R) {
                                    g1 g1Var2 = (g1) recyclerView2.d0;
                                    g1Var2.getClass();
                                    int i18 = r0Var5.a;
                                    int i19 = r0Var5.b;
                                    if (e1Var3.r()) {
                                        i10 = r0Var5.a;
                                        z10 = z13;
                                        i7 = r0Var5.b;
                                    } else {
                                        z10 = z13;
                                        int i20 = r0Var6.a;
                                        i7 = r0Var6.b;
                                        i10 = i20;
                                    }
                                    if (g1Var2.q(e1Var3, e1Var3, r0Var5, i18, i19, i10, i7)) {
                                        recyclerView2.m0();
                                    }
                                } else {
                                    z10 = z13;
                                    g1 g1Var3 = (g1) recyclerView2.d0;
                                    g1Var3.getClass();
                                    int i21 = r0Var5.a;
                                    int i22 = r0Var6.a;
                                    if (i21 == i22 && r0Var5.b == r0Var6.b) {
                                        g1Var3.v(e1Var3);
                                        r10 = false;
                                    } else {
                                        r10 = g1Var3.r(e1Var3, r0Var5, i21, r0Var5.b, i22, r0Var6.b);
                                    }
                                    if (r10) {
                                        recyclerView2.m0();
                                    }
                                }
                            } else {
                                z10 = z13;
                                if ((i16 & 4) != 0) {
                                    g0Var.a(e1Var3, k1Var.b, null);
                                } else if ((i16 & 8) != 0) {
                                    e2.r0 r0Var7 = k1Var.b;
                                    e2.r0 r0Var8 = k1Var.c;
                                    RecyclerView recyclerView3 = g0Var.a;
                                    r11 = 0;
                                    r11 = 0;
                                    e1Var3.q(false);
                                    if (recyclerView3.d0.a(e1Var3, r0Var7, r0Var8)) {
                                        recyclerView3.m0();
                                    }
                                    k1Var.a = r11;
                                    k1Var.b = null;
                                    k1Var.c = null;
                                    k1.d.u(k1Var);
                                }
                            }
                            r11 = 0;
                            k1Var.a = r11;
                            k1Var.b = null;
                            k1Var.c = null;
                            k1.d.u(k1Var);
                        }
                        r11 = z12;
                        z10 = z13;
                        k1Var.a = r11;
                        k1Var.b = null;
                        k1Var.c = null;
                        k1.d.u(k1Var);
                    }
                    i15--;
                    z13 = z10;
                    z12 = false;
                }
            } catch (Exception e13) {
                StringBuilder sb2 = new StringBuilder();
                for (int u11 = this.e.u() - 1; u11 >= 0; u11--) {
                    e1 U2 = U(this.e.t(u11));
                    if (U2 != null && !U2.r()) {
                        sb2.append("Holder at" + u11 + " " + U2 + "\n");
                    }
                }
                throw new RuntimeException(sb2.toString(), e13);
            }
        }
        boolean z15 = z13;
        View view2 = null;
        this.y.h0(w0Var);
        b1Var.b = b1Var.e;
        this.R = false;
        this.S = false;
        b1Var.j = false;
        b1Var.k = false;
        this.y.f = false;
        ArrayList arrayList = (ArrayList) w0Var.d;
        if (arrayList != null) {
            arrayList.clear();
        }
        o0 o0Var = this.y;
        if (o0Var.j) {
            o0Var.i = 0;
            o0Var.j = false;
            w0Var.l();
        }
        this.y.c0(b1Var);
        i0(z15);
        A0(false);
        ((a0.f) xVar.b).clear();
        ((h) xVar.c).b();
        int[] iArr = this.D0;
        int i23 = iArr[0];
        int i24 = iArr[z15 ? 1 : 0];
        I(iArr);
        if ((iArr[0] == i23 && iArr[z15 ? 1 : 0] == i24) ? false : true) {
            x(0, 0);
        }
        if (this.r0 && this.x != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j3 = b1Var.m;
            if (j3 != -1 && (z11 = this.x.b) && z11) {
                int z16 = this.e.z();
                e1Var = null;
                int i25 = 0;
                while (true) {
                    if (i25 >= z16) {
                        break;
                    }
                    e1 U3 = U(this.e.y(i25));
                    if (U3 != null && !U3.j() && U3.e == j3) {
                        if (!((ArrayList) this.e.d).contains(U3.a)) {
                            e1Var = U3;
                            break;
                        }
                        e1Var = U3;
                    }
                    i25++;
                }
            } else {
                e1Var = null;
            }
            if (e1Var != null) {
                View view3 = e1Var.a;
                if (!((ArrayList) this.e.d).contains(view3) && view3.hasFocusable()) {
                    view2 = view3;
                    if (view2 != null) {
                        int i26 = b1Var.n;
                        if (i26 != -1 && (findViewById = view2.findViewById(i26)) != null && findViewById.isFocusable()) {
                            view2 = findViewById;
                        }
                        view2.requestFocus();
                    }
                }
            }
            if (this.e.u() > 0) {
                int i27 = b1Var.l;
                if (i27 == -1) {
                    i27 = 0;
                }
                int b10 = b1Var.b();
                for (int i28 = i27; i28 < b10; i28++) {
                    e1 K = K(i28);
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
        VelocityTracker velocityTracker = this.g0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z10 = false;
        B0(0);
        EdgeEffect edgeEffect = this.W;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.W.isFinished();
        }
        EdgeEffect edgeEffect2 = this.a0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.a0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.b0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.b0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.c0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.c0.isFinished();
        }
        if (z10) {
            WeakHashMap weakHashMap = i0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i7, int i10) {
        o0 o0Var = this.y;
        if (o0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.M) {
            return;
        }
        boolean d = o0Var.d();
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
            this.O |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(f1 f1Var) {
        this.C0 = f1Var;
        i0.j(this, f1Var);
    }

    public void setAdapter(h0 h0Var) {
        setLayoutFrozen(false);
        h0 h0Var2 = this.x;
        m1 m1Var = this.a;
        if (h0Var2 != null) {
            h0Var2.a.unregisterObserver(m1Var);
            this.x.getClass();
        }
        p0();
        ug.l0 l0Var = this.d;
        l0Var.l((ArrayList) l0Var.d);
        l0Var.l((ArrayList) l0Var.e);
        l0Var.b = 0;
        h0 h0Var3 = this.x;
        this.x = h0Var;
        if (h0Var != null) {
            h0Var.B(m1Var);
        }
        o0 o0Var = this.y;
        if (o0Var != null) {
            o0Var.Q();
        }
        this.b.d(h0Var3, this.x);
        this.v0.f = true;
        n0(false);
        requestLayout();
    }

    public void setAdditionalDebugInfo(String str) {
        this.O0 = str;
    }

    public void setBottomGlowOffset(int i7) {
        this.I0 = i7;
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
            this.c0 = null;
            this.a0 = null;
            this.b0 = null;
            this.W = null;
        }
        this.h = z10;
        super.setClipToPadding(z10);
        if (this.J) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l0 l0Var) {
        l0Var.getClass();
        this.V = l0Var;
        this.c0 = null;
        this.a0 = null;
        this.b0 = null;
        this.W = null;
    }

    public void setGlowColor(int i7) {
        this.J0 = Integer.valueOf(i7);
    }

    public void setHasFixedSize(boolean z10) {
        this.I = z10;
    }

    public void setItemAnimator(m0 m0Var) {
        m0 m0Var2 = this.d0;
        if (m0Var2 != null) {
            m0Var2.g();
            this.d0.a = null;
        }
        this.d0 = m0Var;
        if (m0Var != null) {
            m0Var.a = this.A0;
        }
    }

    public void setItemViewCacheSize(int i7) {
        w0 w0Var = this.b;
        w0Var.a = i7;
        w0Var.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(o0 o0Var) {
        if (o0Var == this.y) {
            return;
        }
        C0();
        o0 o0Var2 = this.y;
        w0 w0Var = this.b;
        if (o0Var2 != null) {
            m0 m0Var = this.d0;
            if (m0Var != null) {
                m0Var.g();
            }
            this.y.g0(w0Var);
            this.y.h0(w0Var);
            ((ArrayList) w0Var.c).clear();
            w0Var.e();
            if (this.H) {
                this.y.getClass();
            }
            this.y.t0(null);
            this.y = null;
        } else {
            ((ArrayList) w0Var.c).clear();
            w0Var.e();
        }
        this.e.E();
        this.y = o0Var;
        if (o0Var != null) {
            if (o0Var.b != null) {
                throw new IllegalArgumentException("LayoutManager " + o0Var + " is already attached to a RecyclerView:" + o0Var.b.C());
            }
            o0Var.t0(this);
            if (this.H) {
                this.y.getClass();
            }
        }
        w0Var.l();
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
            WeakHashMap weakHashMap = i0.a;
            r0.a0.j(viewGroup);
        }
        scrollingChildHelper.d = z10;
    }

    public void setOnFlingListener(r0 r0Var) {
        this.m0 = r0Var;
    }

    @Deprecated
    public void setOnScrollListener(t0 t0Var) {
        this.w0 = t0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.r0 = z10;
    }

    public void setRecycledViewPool(v0 v0Var) {
        w0 w0Var = this.b;
        if (((v0) w0Var.g) != null) {
            r1.b--;
        }
        w0Var.g = v0Var;
        if (v0Var == null || ((RecyclerView) w0Var.h).getAdapter() == null) {
            return;
        }
        ((v0) w0Var.g).b++;
    }

    public void setScrollState(int i7) {
        a1 a1Var;
        if (i7 == this.e0) {
            return;
        }
        this.e0 = i7;
        if (i7 != 2) {
            d1 d1Var = this.s0;
            RecyclerView recyclerView = d1Var.h;
            if (recyclerView.P0) {
                recyclerView.removeCallbacks(d1Var);
                d1Var.c.abortAnimation();
            }
            o0 o0Var = this.y;
            if (o0Var != null && (a1Var = o0Var.e) != null) {
                a1Var.h();
            }
        }
        o0 o0Var2 = this.y;
        if (o0Var2 != null) {
            o0Var2.f0();
        }
        k0(i7);
        t0 t0Var = this.w0;
        if (t0Var != null) {
            t0Var.a(this, i7);
        }
        ArrayList arrayList = this.x0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((t0) this.x0.get(size)).a(this, i7);
            }
        }
    }

    public void setScrollingTouchSlop(int i7) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i7 != 0) {
            if (i7 == 1) {
                this.l0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i7 + "; using default value");
        }
        this.l0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setTopGlowOffset(int i7) {
        this.H0 = i7;
    }

    public void setViewCacheExtension(c1 c1Var) {
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
    public final void suppressLayout(boolean z10) {
        if (z10 != this.M) {
            l("Do not suppressLayout in layout or scroll");
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.M = true;
                this.N = true;
                C0();
                return;
            }
            this.M = false;
            if (this.L && this.y != null && this.x != null) {
                requestLayout();
            }
            this.L = false;
        }
    }

    public final void t() {
        k1 k1Var;
        View F;
        boolean z10;
        b1 b1Var = this.v0;
        b1Var.a(1);
        D(b1Var);
        b1Var.i = false;
        z0();
        x xVar = this.f;
        a0.f fVar = (a0.f) xVar.b;
        a0.f fVar2 = (a0.f) xVar.b;
        fVar.clear();
        h hVar = (h) xVar.c;
        hVar.b();
        h0();
        if (this.R) {
            ug.l0 l0Var = this.d;
            l0Var.l((ArrayList) l0Var.d);
            l0Var.l((ArrayList) l0Var.e);
            l0Var.b = 0;
            if (this.S) {
                this.y.W(this);
            }
        }
        if (this.d0 == null || !this.y.y0()) {
            this.d.c();
        } else {
            this.d.k();
        }
        boolean z11 = this.y0 || this.z0;
        boolean z12 = this.J && this.d0 != null && ((z10 = this.R) || z11 || this.y.f) && (!z10 || this.x.b);
        b1Var.j = z12;
        b1Var.k = z12 && z11 && !this.R && this.d0 != null && this.y.y0();
        e1 e1Var = null;
        View focusedChild = (this.r0 && hasFocus() && this.x != null) ? getFocusedChild() : null;
        if (focusedChild != null && (F = F(focusedChild)) != null) {
            e1Var = T(F);
        }
        if (e1Var == null) {
            b1Var.m = -1L;
            b1Var.l = -1;
            b1Var.n = -1;
        } else {
            b1Var.m = this.x.b ? e1Var.e : -1L;
            b1Var.l = this.R ? -1 : e1Var.j() ? e1Var.d : e1Var.b();
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
        b1Var.h = b1Var.j && this.z0;
        this.z0 = false;
        this.y0 = false;
        b1Var.g = b1Var.k;
        b1Var.e = this.x.b();
        I(this.D0);
        if (b1Var.j) {
            int u10 = this.e.u();
            for (int i7 = 0; i7 < u10; i7++) {
                e1 U = U(this.e.t(i7));
                if (!U.r() && (!U.h() || this.x.b)) {
                    e2.r0 l10 = this.d0.l(b1Var, U, m0.b(U), U.d());
                    k1 k1Var2 = (k1) fVar2.get(U);
                    if (k1Var2 == null) {
                        k1Var2 = k1.a();
                        fVar2.put(U, k1Var2);
                    }
                    k1Var2.b = l10;
                    k1Var2.a |= 4;
                    if (b1Var.h && U.m() && !U.j() && !U.r() && !U.h()) {
                        hVar.k(U, Q(U));
                    }
                }
            }
        }
        if (b1Var.k) {
            int z13 = this.e.z();
            for (int i10 = 0; i10 < z13; i10++) {
                e1 U2 = U(this.e.y(i10));
                if (!U2.r()) {
                    if (U2.d == -1) {
                        U2.d = U2.c;
                    }
                    U2.h = U2.c;
                }
            }
            boolean z14 = b1Var.f;
            b1Var.f = false;
            this.y.b0(this.b, b1Var);
            b1Var.f = z14;
            for (int i11 = 0; i11 < this.e.u(); i11++) {
                e1 U3 = U(this.e.t(i11));
                if (!U3.r() && ((k1Var = (k1) fVar2.get(U3)) == null || (k1Var.a & 4) == 0)) {
                    int b10 = m0.b(U3);
                    boolean e10 = U3.e(TLObject.FLAG_13);
                    if (!e10) {
                        b10 |= TLObject.FLAG_12;
                    }
                    e2.r0 l11 = this.d0.l(b1Var, U3, b10, U3.d());
                    if (e10) {
                        o0(U3, l11);
                    } else {
                        k1 k1Var3 = (k1) fVar2.get(U3);
                        if (k1Var3 == null) {
                            k1Var3 = k1.a();
                            fVar2.put(U3, k1Var3);
                        }
                        k1Var3.a |= 2;
                        k1Var3.b = l11;
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
        boolean z10;
        p();
        h0 h0Var = this.x;
        int[] iArr = this.K0;
        if (h0Var != null) {
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
        if (!this.E.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        w(i11, i12, i13, i14, this.F0, 0, iArr);
        int i15 = i13 - iArr[0];
        int i16 = i14 - iArr[1];
        int i17 = this.j0;
        int[] iArr2 = this.F0;
        int i18 = iArr2[0];
        this.j0 = i17 - i18;
        int i19 = this.k0;
        int i20 = iArr2[1];
        this.k0 = i19 - i20;
        if (motionEvent != null) {
            motionEvent.offsetLocation(i18, i20);
        }
        int[] iArr3 = this.G0;
        iArr3[0] = iArr3[0] + iArr2[0];
        iArr3[1] = iArr3[1] + iArr2[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x10 = motionEvent.getX();
                float f10 = i15;
                float y10 = motionEvent.getY();
                float f11 = i16;
                Integer num = this.J0;
                if (num == null || num.intValue() != 0) {
                    if (f10 < 0.0f) {
                        z();
                        b.a(this.W, (-f10) / getWidth(), 1.0f - (y10 / getHeight()));
                    } else if (f10 > 0.0f) {
                        A();
                        b.a(this.b0, f10 / getWidth(), y10 / getHeight());
                    } else {
                        z10 = false;
                        if (f11 >= 0.0f) {
                            B();
                            b.a(this.a0, (-f11) / getHeight(), x10 / getWidth());
                        } else {
                            if (f11 > 0.0f) {
                                y();
                                b.a(this.c0, f11 / getHeight(), 1.0f - (x10 / getWidth()));
                            }
                            if (!z10 || f10 != 0.0f || f11 != 0.0f) {
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
                    if (f11 >= 0.0f) {
                    }
                    z10 = true;
                    if (!z10) {
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
        b1 b1Var = this.v0;
        b1Var.a(6);
        this.d.c();
        b1Var.e = this.x.b();
        b1Var.c = 0;
        b1Var.g = false;
        this.y.b0(this.b, b1Var);
        b1Var.f = false;
        this.c = null;
        b1Var.j = b1Var.j && this.d0 != null;
        b1Var.d = 4;
        i0(true);
        A0(false);
    }

    public final void u0(int i7, int i10, int[] iArr) {
        e1 e1Var;
        z0();
        h0();
        int i11 = g.a;
        Trace.beginSection("RV Scroll");
        b1 b1Var = this.v0;
        D(b1Var);
        w0 w0Var = this.b;
        int m0 = i7 != 0 ? this.y.m0(i7, w0Var, b1Var) : 0;
        int o02 = i10 != 0 ? this.y.o0(i10, w0Var, b1Var) : 0;
        Trace.endSection();
        ld0 ld0Var = this.e;
        int u10 = ld0Var.u();
        for (int i12 = 0; i12 < u10; i12++) {
            View t6 = ld0Var.t(i12);
            e1 T = T(t6);
            if (T != null && (e1Var = T.k) != null) {
                View view = e1Var.a;
                int left = t6.getLeft();
                int top = t6.getTop();
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
        if (this.M) {
            return;
        }
        C0();
        o0 o0Var = this.y;
        if (o0Var == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            o0Var.n0(i7);
            awakenScrollBars();
        }
    }

    public final void w(int i7, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        getScrollingChildHelper().d(i7, i10, i11, i12, iArr, i13, iArr2);
    }

    public final void w0(int i7, int i10, Interpolator interpolator) {
        o0 o0Var = this.y;
        if (o0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.M) {
            return;
        }
        if (!o0Var.d()) {
            i7 = 0;
        }
        if (!this.y.e()) {
            i10 = 0;
        }
        if (i7 == 0 && i10 == 0) {
            return;
        }
        this.s0.b(i7, i10, TLObject.FLAG_31, interpolator);
    }

    public final void x(int i7, int i10) {
        this.U++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i7, scrollY - i10);
        l0(i10);
        t0 t0Var = this.w0;
        if (t0Var != null) {
            t0Var.b(this, i7, i10);
        }
        ArrayList arrayList = this.x0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((t0) this.x0.get(size)).b(this, i7, i10);
            }
        }
        this.U--;
    }

    public final void x0(int i7, int i10, Interpolator interpolator) {
        if (this.y == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.M) {
            return;
        }
        if (!this.y.e()) {
            i7 = 0;
        }
        if (i7 != 0) {
            this.s0.b(0, i7, i10, interpolator);
        }
    }

    public final void y() {
        if (this.c0 != null) {
            return;
        }
        EdgeEffect a10 = this.V.a(this, 3);
        this.c0 = a10;
        if (this.h) {
            a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a10.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
        k(this.c0);
    }

    public final void y0(int i7) {
        if (this.M) {
            return;
        }
        o0 o0Var = this.y;
        if (o0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            o0Var.v0(this, this.v0, i7);
        }
    }

    public final void z() {
        if (this.W != null) {
            return;
        }
        EdgeEffect a10 = this.V.a(this, 0);
        this.W = a10;
        if (this.h) {
            a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a10.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
        k(this.W);
    }

    public final void z0() {
        int i7 = this.K + 1;
        this.K = i7;
        if (i7 != 1 || this.M) {
            return;
        }
        this.L = false;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        float a10;
        float a11;
        this.a = new m1(this, 2);
        this.b = new w0(this);
        this.f = new x(3, (byte) 0);
        this.n = new f0(this, 0);
        this.r = new Rect();
        this.s = new Rect();
        this.w = new RectF();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.K = 0;
        this.R = false;
        this.S = false;
        this.T = 0;
        this.U = 0;
        this.V = new l0();
        this.d0 = new k();
        this.e0 = 0;
        this.f0 = -1;
        this.p0 = Float.MIN_VALUE;
        this.q0 = Float.MIN_VALUE;
        this.r0 = true;
        this.s0 = new d1(this);
        this.u0 = new f();
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
        this.v0 = b1Var;
        this.y0 = false;
        this.z0 = false;
        g0 g0Var = new g0(this);
        this.A0 = g0Var;
        this.B0 = false;
        this.D0 = new int[2];
        this.F0 = new int[2];
        this.G0 = new int[2];
        this.H0 = 0;
        this.I0 = 0;
        this.J0 = null;
        this.K0 = new int[2];
        this.L0 = new ArrayList();
        this.M0 = new f0(this, 1);
        this.N0 = new g0(this);
        this.P0 = true;
        this.Q0 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R0, i7, 0);
            this.h = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.h = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.l0 = viewConfiguration.getScaledTouchSlop();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            Method method = j0.a;
            a10 = z6.a.c(viewConfiguration);
        } else {
            a10 = j0.a(viewConfiguration, context);
        }
        this.p0 = a10;
        if (i10 >= 26) {
            a11 = z6.a.d(viewConfiguration);
        } else {
            a11 = j0.a(viewConfiguration, context);
        }
        this.q0 = a11;
        this.n0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.o0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.d0.a = g0Var;
        this.d = new ug.l0(new jh.g(this));
        this.e = new ld0(new ff(this, 23), (char) 0);
        WeakHashMap weakHashMap = i0.a;
        if ((i10 >= 26 ? c0.a(this) : 0) == 0 && i10 >= 26) {
            c0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.P = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new f1(this));
        setDescendantFocusability(262144);
        setNestedScrollingEnabled(true);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o0 o0Var = this.y;
        if (o0Var != null) {
            return o0Var.p(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + C());
    }

    public void g0(View view) {
    }

    public void k0(int i7) {
    }

    public void l0(int i7) {
    }

    public void setRecyclerListener(x0 x0Var) {
    }
}
