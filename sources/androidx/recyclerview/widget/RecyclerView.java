package androidx.recyclerview.widget;

import a0.f;
import a0.h;
import a5.m;
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
import androidx.datastore.preferences.protobuf.i;
import d5.p;
import f2.a1;
import f2.b;
import f2.b1;
import f2.c0;
import f2.c1;
import f2.d;
import f2.d1;
import f2.f1;
import f2.g1;
import f2.h0;
import f2.h1;
import f2.i1;
import f2.k1;
import f2.l0;
import f2.m0;
import f2.m1;
import f2.n;
import f2.n1;
import f2.o1;
import f2.p1;
import f2.q0;
import f2.q1;
import f2.r0;
import f2.s1;
import f2.t1;
import f2.u;
import f2.u0;
import f2.v0;
import f2.w0;
import f2.w1;
import f2.x0;
import f2.y0;
import f2.z0;
import fa.c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.g;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import q0.a;
import r0.b0;
import r0.d0;
import r0.j0;
import r0.k0;
import r0.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] L0 = {R.attr.clipToPadding};
    public static final boolean M0;
    public static final boolean N0;
    public static final boolean O0;
    public static final c0 P0;
    public final ArrayList A;
    public final int[] A0;
    public c1 B;
    public int B0;
    public boolean C;
    public int C0;
    public boolean D;
    public Integer D0;
    public boolean E;
    public final int[] E0;
    public int F;
    public final ArrayList F0;
    public boolean G;
    public final q0 G0;
    public boolean H;
    public final c H0;
    public boolean I;
    public String I0;
    public int J;
    public boolean J0;
    public final AccessibilityManager K;
    public boolean K0;
    public ArrayList L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public v0 Q;
    public EdgeEffect R;
    public EdgeEffect S;
    public EdgeEffect T;
    public EdgeEffect U;
    public w0 V;
    public int W;
    public final i1 a;
    public int a0;
    public final g1 b;
    public VelocityTracker b0;
    public k1 c;
    public int c0;
    public final b d;
    public int d0;
    public final m e;
    public int e0;
    public final we.b f;
    public int f0;
    public int g0;
    public boolean h;
    public final int h0;
    public final int i0;
    public final float j0;
    public final float k0;
    public boolean l0;
    public final p1 m0;
    public final q0 n;
    public u n0;
    public final i o0;
    public final n1 p0;
    public d1 q0;
    public final Rect r;
    public ArrayList r0;
    public final Rect s;
    public boolean s0;
    public boolean t0;
    public final x0 u0;
    public final RectF v;
    public boolean v0;
    public r0 w;
    public s1 w0;
    public z0 x;
    public final int[] x0;
    public final ArrayList y;
    public l y0;
    public final int[] z0;

    static {
        M0 = Build.VERSION.SDK_INT >= 23;
        N0 = true;
        O0 = true;
        P0 = new c0(2);
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
        for (int i9 = 0; i9 < childCount; i9++) {
            RecyclerView J = J(viewGroup.getChildAt(i9));
            if (J != null) {
                return J;
            }
        }
        return null;
    }

    public static int R(View view) {
        q1 U = U(view);
        if (U != null) {
            return U.b();
        }
        return -1;
    }

    public static int S(View view) {
        q1 U = U(view);
        if (U != null) {
            return U.c();
        }
        return -1;
    }

    public static q1 U(View view) {
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof a1) {
            return ((a1) layoutParams).a;
        }
        return null;
    }

    private l getScrollingChildHelper() {
        if (this.y0 == null) {
            this.y0 = new l(this);
        }
        return this.y0;
    }

    public static void m(q1 q1Var) {
        WeakReference weakReference = q1Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == q1Var.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            q1Var.b = null;
        }
    }

    public final void A() {
        if (this.T != null) {
            return;
        }
        EdgeEffect a2 = this.Q.a(this, 2);
        this.T = a2;
        if (this.h) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
        k(this.T);
    }

    public final void A0(int i9) {
        getScrollingChildHelper().h(i9);
    }

    public final void B() {
        if (this.S != null) {
            return;
        }
        EdgeEffect a2 = this.Q.a(this, 1);
        this.S = a2;
        if (this.h) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
        k(this.S);
    }

    public void B0() {
        m1 m1Var;
        setScrollState(0);
        p1 p1Var = this.m0;
        RecyclerView recyclerView = p1Var.h;
        if (recyclerView.J0) {
            recyclerView.removeCallbacks(p1Var);
            p1Var.c.abortAnimation();
        }
        z0 z0Var = this.x;
        if (z0Var == null || (m1Var = z0Var.e) == null) {
            return;
        }
        m1Var.h();
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
        sb3.append(this.I0);
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

    public final void D(n1 n1Var) {
        if (getScrollState() != 2) {
            n1Var.getClass();
            return;
        }
        OverScroller overScroller = this.m0.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        n1Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View E(float f10, float f11) {
        for (int q10 = this.e.q() - 1; q10 >= 0; q10--) {
            View p6 = this.e.p(q10);
            float translationX = p6.getTranslationX();
            float translationY = p6.getTranslationY();
            if (f10 >= p6.getLeft() + translationX && f10 <= p6.getRight() + translationX && f11 >= p6.getTop() + translationY && f11 <= p6.getBottom() + translationY) {
                return p6;
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

    public final q1 G(View view) {
        View F = F(view);
        if (F == null) {
            return null;
        }
        return T(F);
    }

    public final boolean H(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            c1 c1Var = (c1) arrayList.get(i9);
            if (c1Var.b(this, motionEvent) && action != 3) {
                this.B = c1Var;
                return true;
            }
        }
        return false;
    }

    public final void I(int[] iArr) {
        int q10 = this.e.q();
        if (q10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i9 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i10 = TLObject.FLAG_31;
        for (int i11 = 0; i11 < q10; i11++) {
            q1 U = U(this.e.p(i11));
            if (U != null && !U.r()) {
                int c10 = U.c();
                if (c10 < i9) {
                    i9 = c10;
                }
                if (c10 > i10) {
                    i10 = c10;
                }
            }
        }
        iArr[0] = i9;
        iArr[1] = i10;
    }

    public final q1 K(int i9) {
        q1 q1Var = null;
        if (this.M) {
            return null;
        }
        int v = this.e.v();
        for (int i10 = 0; i10 < v; i10++) {
            q1 U = U(this.e.u(i10));
            if (U != null && !U.j() && N(U) == i9) {
                if (!((ArrayList) this.e.d).contains(U.a)) {
                    return U;
                }
                q1Var = U;
            }
        }
        return q1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q1 L(int i9, boolean z10) {
        int v = this.e.v();
        q1 q1Var = null;
        for (int i10 = 0; i10 < v; i10++) {
            q1 U = U(this.e.u(i10));
            if (U != null && !U.j()) {
                if (z10) {
                    if (U.c != i9) {
                        continue;
                    }
                    if (((ArrayList) this.e.d).contains(U.a)) {
                        return U;
                    }
                    q1Var = U;
                } else {
                    if (U.c() != i9) {
                        continue;
                    }
                    if (((ArrayList) this.e.d).contains(U.a)) {
                    }
                }
            }
        }
        return q1Var;
    }

    public final void M(a aVar) {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            aVar.accept(getChildAt(i9));
        }
        for (int i10 = 0; i10 < getHiddenChildCount(); i10++) {
            aVar.accept(V(i10));
        }
        for (int i11 = 0; i11 < getAttachedScrapChildCount(); i11++) {
            aVar.accept(O(i11));
        }
    }

    public final int N(q1 q1Var) {
        if (q1Var.e(524) || !q1Var.g()) {
            return -1;
        }
        int i9 = q1Var.c;
        ArrayList arrayList = (ArrayList) this.d.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f2.a aVar = (f2.a) arrayList.get(i10);
            int i11 = aVar.a;
            if (i11 != 1) {
                if (i11 == 2) {
                    int i12 = aVar.b;
                    if (i12 <= i9) {
                        int i13 = aVar.d;
                        if (i12 + i13 > i9) {
                            return -1;
                        }
                        i9 -= i13;
                    } else {
                        continue;
                    }
                } else if (i11 == 8) {
                    int i14 = aVar.b;
                    if (i14 == i9) {
                        i9 = aVar.d;
                    } else {
                        if (i14 < i9) {
                            i9--;
                        }
                        if (aVar.d <= i9) {
                            i9++;
                        }
                    }
                }
            } else if (aVar.b <= i9) {
                i9 += aVar.d;
            }
        }
        return i9;
    }

    public final View O(int i9) {
        if (i9 < 0) {
            return null;
        }
        g1 g1Var = this.b;
        if (i9 >= ((ArrayList) g1Var.c).size()) {
            return null;
        }
        return ((q1) ((ArrayList) g1Var.c).get(i9)).a;
    }

    public final View P(int i9) {
        if (i9 < 0) {
            return null;
        }
        g1 g1Var = this.b;
        if (i9 >= ((ArrayList) g1Var.e).size()) {
            return null;
        }
        return ((q1) ((ArrayList) g1Var.e).get(i9)).a;
    }

    public final long Q(q1 q1Var) {
        return this.w.b ? q1Var.e : q1Var.c;
    }

    public final q1 T(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return U(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final View V(int i9) {
        ArrayList arrayList = (ArrayList) this.e.d;
        if (i9 < 0 || i9 >= arrayList.size()) {
            return null;
        }
        return (View) arrayList.get(i9);
    }

    public final Rect W(View view) {
        a1 a1Var = (a1) view.getLayoutParams();
        boolean z10 = a1Var.c;
        Rect rect = a1Var.b;
        if (z10) {
            n1 n1Var = this.p0;
            if (!n1Var.g || (!a1Var.a.m() && !a1Var.a.h())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.y;
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    Rect rect2 = this.r;
                    rect2.set(0, 0, 0, 0);
                    ((y0) arrayList.get(i9)).a(rect2, view, this, n1Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                a1Var.c = false;
                return rect;
            }
        }
        return rect;
    }

    public final y0 X(int i9) {
        int itemDecorationCount = getItemDecorationCount();
        if (i9 < 0 || i9 >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(e2.c.l(i9, " is an invalid index for size ", itemDecorationCount));
        }
        return (y0) this.y.get(i9);
    }

    public final void Y(long j10, q1 q1Var, q1 q1Var2) {
        int q10 = this.e.q();
        for (int i9 = 0; i9 < q10; i9++) {
            q1 U = U(this.e.p(i9));
            if (U != q1Var && Q(U) == j10) {
                r0 r0Var = this.w;
                if (r0Var == null || !r0Var.b) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + U + " \n View Holder 2:" + q1Var + C());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + U + " \n View Holder 2:" + q1Var + C());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + q1Var2 + " cannot be found but it is necessary for " + q1Var + C());
    }

    public final boolean Z() {
        return !this.E || this.M || this.d.h();
    }

    public final void a0() {
        if (this.y.size() == 0) {
            return;
        }
        z0 z0Var = this.x;
        if (z0Var != null) {
            z0Var.b("Cannot invalidate item decorations during a scroll or layout");
        }
        d0();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i9, int i10) {
        z0 z0Var = this.x;
        if (z0Var != null) {
            z0Var.getClass();
        }
        super.addFocusables(arrayList, i9, i10);
    }

    public final boolean b0() {
        return this.O > 0;
    }

    public final void c0(int i9) {
        if (this.x == null) {
            return;
        }
        setScrollState(2);
        this.x.n0(i9);
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof a1) && this.x.f((a1) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        z0 z0Var = this.x;
        if (z0Var == null || !z0Var.d()) {
            return 0;
        }
        return ((m0) this.x).B0(this.p0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        z0 z0Var = this.x;
        if (z0Var != null && z0Var.d()) {
            return this.x.h(this.p0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        z0 z0Var = this.x;
        if (z0Var != null && z0Var.d()) {
            return this.x.i(this.p0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        z0 z0Var = this.x;
        if (z0Var != null && z0Var.e()) {
            return this.x.j(this.p0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        z0 z0Var = this.x;
        if (z0Var != null && z0Var.e()) {
            return this.x.k(this.p0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        z0 z0Var = this.x;
        if (z0Var != null && z0Var.e()) {
            return this.x.l(this.p0);
        }
        return 0;
    }

    public final void d0() {
        int v = this.e.v();
        for (int i9 = 0; i9 < v; i9++) {
            ((a1) this.e.u(i9).getLayoutParams()).c = true;
        }
        ArrayList arrayList = (ArrayList) this.b.e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a1 a1Var = (a1) ((q1) arrayList.get(i10)).a.getLayoutParams();
            if (a1Var != null) {
                a1Var.c = true;
            }
        }
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
    public final boolean dispatchNestedPreScroll(int i9, int i10, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i9, i10, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i9, int i10, int i11, int i12, int[] iArr) {
        return getScrollingChildHelper().d(i9, i10, i11, i12, iArr, 0, null);
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
        for (int i9 = 0; i9 < size; i9++) {
            ((y0) arrayList.get(i9)).c(canvas, this);
        }
        Integer num = this.D0;
        if (num == null || num.intValue() != 0) {
            EdgeEffect edgeEffect = this.R;
            if (edgeEffect == null || edgeEffect.isFinished()) {
                z10 = false;
            } else {
                int save = canvas.save();
                int paddingBottom = this.h ? getPaddingBottom() : 0;
                canvas.rotate(270.0f);
                canvas.translate((-getHeight()) + paddingBottom, 0.0f);
                EdgeEffect edgeEffect2 = this.R;
                z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
                canvas.restoreToCount(save);
            }
            EdgeEffect edgeEffect3 = this.S;
            if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
                int save2 = canvas.save();
                if (this.h) {
                    canvas.translate(getPaddingLeft(), getPaddingTop());
                }
                canvas.translate(0.0f, this.B0);
                EdgeEffect edgeEffect4 = this.S;
                z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
                canvas.restoreToCount(save2);
            }
            EdgeEffect edgeEffect5 = this.T;
            if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
                int save3 = canvas.save();
                int width = getWidth();
                int paddingTop = this.h ? getPaddingTop() : 0;
                canvas.rotate(90.0f);
                canvas.translate(-paddingTop, -width);
                EdgeEffect edgeEffect6 = this.T;
                z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
                canvas.restoreToCount(save3);
            }
            EdgeEffect edgeEffect7 = this.U;
            if (edgeEffect7 == null || edgeEffect7.isFinished()) {
                z11 = z10;
            } else {
                int save4 = canvas.save();
                canvas.rotate(180.0f);
                if (this.h) {
                    canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
                } else {
                    canvas.translate(-getWidth(), (-getHeight()) + this.C0);
                }
                EdgeEffect edgeEffect8 = this.U;
                if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                    z11 = true;
                }
                z11 |= z10;
                canvas.restoreToCount(save4);
            }
        }
        if ((z11 || this.V == null || arrayList.size() <= 0 || !this.V.k()) ? z11 : true) {
            WeakHashMap weakHashMap = j0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e0(int i9, int i10, boolean z10) {
        int i11 = i9 + i10;
        int v = this.e.v();
        for (int i12 = 0; i12 < v; i12++) {
            q1 U = U(this.e.u(i12));
            if (U != null && !U.r()) {
                int i13 = U.c;
                n1 n1Var = this.p0;
                if (i13 >= i11) {
                    U.n(-i10, z10);
                    n1Var.f = true;
                } else if (i13 >= i9) {
                    U.a(8);
                    U.n(-i10, z10);
                    U.c = i9 - 1;
                    n1Var.f = true;
                }
            }
        }
        g1 g1Var = this.b;
        ArrayList arrayList = (ArrayList) g1Var.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            q1 q1Var = (q1) arrayList.get(size);
            if (q1Var != null) {
                int i14 = q1Var.c;
                if (i14 >= i11) {
                    q1Var.n(-i10, z10);
                } else if (i14 >= i9) {
                    q1Var.a(8);
                    g1Var.f(size);
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
    public final View focusSearch(View view, int i9) {
        View view2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char c10;
        boolean z10;
        this.x.getClass();
        boolean z11 = true;
        boolean z12 = (this.w == null || this.x == null || b0() || this.H) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        n1 n1Var = this.p0;
        g1 g1Var = this.b;
        if (z12 && (i9 == 2 || i9 == 1)) {
            if (this.x.e()) {
                if (focusFinder.findNextFocus(this, view, i9 == 2 ? 130 : 33) == null) {
                    z10 = true;
                    if (!z10 && this.x.d()) {
                        RecyclerView recyclerView = this.x.b;
                        WeakHashMap weakHashMap = j0.a;
                        z10 = focusFinder.findNextFocus(this, view, !((recyclerView.getLayoutDirection() != 1) ^ (i9 != 2)) ? 66 : 17) != null;
                    }
                    if (z10) {
                        p();
                        if (F(view) != null) {
                            y0();
                            this.x.R(view, i9, g1Var, n1Var);
                            z0(false);
                        }
                        return null;
                    }
                    view2 = focusFinder.findNextFocus(this, view, i9);
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
                            WeakHashMap weakHashMap2 = j0.a;
                            if (recyclerView2.getLayoutDirection() != 1) {
                            }
                            i10 = rect.left;
                            i11 = rect2.left;
                            if (i10 >= i11) {
                            }
                            i12 = 1;
                            i13 = rect.top;
                            i14 = rect2.top;
                            if (i13 >= i14) {
                            }
                            c10 = 1;
                            if (i9 == 1) {
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
                WeakHashMap weakHashMap3 = j0.a;
                if (focusFinder.findNextFocus(this, view, !((recyclerView3.getLayoutDirection() != 1) ^ (i9 != 2)) ? 66 : 17) != null) {
                }
            }
            if (z10) {
            }
            view2 = focusFinder.findNextFocus(this, view, i9);
            if (view2 == null) {
            }
            if (view2 != null) {
            }
            z11 = false;
            if (z11) {
            }
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i9);
            if (findNextFocus == null && z12) {
                p();
                if (F(view) != null) {
                    y0();
                    view2 = this.x.R(view, i9, g1Var, n1Var);
                    z0(false);
                }
                return null;
            }
            view2 = findNextFocus;
            if (view2 == null && !view2.hasFocusable()) {
                if (getFocusedChild() == null) {
                    return super.focusSearch(view, i9);
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
                    WeakHashMap weakHashMap22 = j0.a;
                    int i15 = recyclerView22.getLayoutDirection() != 1 ? -1 : 1;
                    i10 = rect3.left;
                    i11 = rect22.left;
                    if ((i10 >= i11 || rect3.right <= i11) && rect3.right < rect22.right) {
                        i12 = 1;
                    } else {
                        int i16 = rect3.right;
                        int i17 = rect22.right;
                        i12 = ((i16 > i17 || i10 >= i17) && i10 > i11) ? -1 : 0;
                    }
                    i13 = rect3.top;
                    i14 = rect22.top;
                    if ((i13 >= i14 || rect3.bottom <= i14) && rect3.bottom < rect22.bottom) {
                        c10 = 1;
                    } else {
                        int i18 = rect3.bottom;
                        int i19 = rect22.bottom;
                        c10 = ((i18 > i19 || i13 >= i19) && i13 > i14) ? (char) 65535 : (char) 0;
                    }
                    if (i9 == 1) {
                        if (i9 != 2) {
                            if (i9 != 17) {
                                if (i9 != 33) {
                                    if (i9 != 66) {
                                        if (i9 != 130) {
                                            throw new IllegalArgumentException("Invalid direction: " + i9 + C());
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
                return z11 ? view2 : super.focusSearch(view, i9);
            }
            z11 = false;
            if (z11) {
            }
        }
    }

    public final void g0() {
        this.O++;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        z0 z0Var = this.x;
        if (z0Var != null) {
            return z0Var.n();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + C());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        z0 z0Var = this.x;
        if (z0Var != null) {
            return z0Var.o(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + C());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public r0 getAdapter() {
        return this.w;
    }

    public int getAttachedScrapChildCount() {
        return ((ArrayList) this.b.c).size();
    }

    @Override // android.view.View
    public int getBaseline() {
        z0 z0Var = this.x;
        if (z0Var == null) {
            return super.getBaseline();
        }
        z0Var.getClass();
        return -1;
    }

    public int getBottomGlowOffset() {
        return this.C0;
    }

    public int getCachedChildCount() {
        return ((ArrayList) this.b.e).size();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i9, int i10) {
        return super.getChildDrawingOrder(i9, i10);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.h;
    }

    public s1 getCompatAccessibilityDelegate() {
        return this.w0;
    }

    public float getCurrentVelocity() {
        VelocityTracker velocityTracker = this.b0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.i0);
        return this.b0.getYVelocity();
    }

    public v0 getEdgeEffectFactory() {
        return this.Q;
    }

    public int getHiddenChildCount() {
        return ((ArrayList) this.e.d).size();
    }

    public w0 getItemAnimator() {
        return this.V;
    }

    public int getItemDecorationCount() {
        return this.y.size();
    }

    public z0 getLayoutManager() {
        return this.x;
    }

    public int getMaxFlingVelocity() {
        return this.i0;
    }

    public int getMinFlingVelocity() {
        return this.h0;
    }

    public long getNanoTime() {
        if (O0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public b1 getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.l0;
    }

    public f1 getRecycledViewPool() {
        return this.b.c();
    }

    public int getScrollState() {
        return this.W;
    }

    public int getTopGlowOffset() {
        return this.B0;
    }

    public final void h(q1 q1Var) {
        View view = q1Var.a;
        boolean z10 = view.getParent() == this;
        this.b.k(T(view));
        if (q1Var.l()) {
            this.e.c(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z10) {
            this.e.a(view, -1, true);
            return;
        }
        m mVar = this.e;
        int indexOfChild = ((RecyclerView) ((k5.i) mVar.b).b).indexOfChild(view);
        if (indexOfChild >= 0) {
            ((d) mVar.c).M(indexOfChild);
            mVar.y(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void h0(boolean z10) {
        int i9;
        AccessibilityManager accessibilityManager;
        int i10 = this.O - 1;
        this.O = i10;
        if (i10 < 1) {
            this.O = 0;
            if (z10) {
                int i11 = this.J;
                this.J = 0;
                if (i11 != 0 && (accessibilityManager = this.K) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i11);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.F0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    q1 q1Var = (q1) arrayList.get(size);
                    if (q1Var.a.getParent() == this && !q1Var.r() && (i9 = q1Var.s) != -1) {
                        View view = q1Var.a;
                        WeakHashMap weakHashMap = j0.a;
                        view.setImportantForAccessibility(i9);
                        q1Var.s = -1;
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

    public final void i(y0 y0Var) {
        z0 z0Var = this.x;
        if (z0Var != null) {
            z0Var.b("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.y;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(y0Var);
        d0();
        requestLayout();
    }

    public final void i0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.a0) {
            int i9 = actionIndex == 0 ? 1 : 0;
            this.a0 = motionEvent.getPointerId(i9);
            int x10 = (int) (motionEvent.getX(i9) + 0.5f);
            this.e0 = x10;
            this.c0 = x10;
            int y10 = (int) (motionEvent.getY(i9) + 0.5f);
            this.f0 = y10;
            this.d0 = y10;
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.C;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.H;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(d1 d1Var) {
        if (this.r0 == null) {
            this.r0 = new ArrayList();
        }
        this.r0.add(d1Var);
    }

    public final void k(EdgeEffect edgeEffect) {
        Integer num;
        if (edgeEffect == null || (num = this.D0) == null) {
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
        if (this.P > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + C()));
        }
    }

    public final void l0() {
        if (this.v0 || !this.C) {
            return;
        }
        WeakHashMap weakHashMap = j0.a;
        postOnAnimation(this.G0);
        this.v0 = true;
    }

    public final void m0(boolean z10) {
        this.N = z10 | this.N;
        this.M = true;
        int v = this.e.v();
        for (int i9 = 0; i9 < v; i9++) {
            q1 U = U(this.e.u(i9));
            if (U != null && !U.r()) {
                U.a(6);
            }
        }
        d0();
        g1 g1Var = this.b;
        ArrayList arrayList = (ArrayList) g1Var.e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            q1 q1Var = (q1) arrayList.get(i10);
            if (q1Var != null) {
                q1Var.a(6);
                q1Var.a(1024);
            }
        }
        r0 r0Var = ((RecyclerView) g1Var.h).w;
        if (r0Var == null || !r0Var.b) {
            g1Var.e();
        }
    }

    public final void n() {
        int v = this.e.v();
        for (int i9 = 0; i9 < v; i9++) {
            q1 U = U(this.e.u(i9));
            if (U != null && !U.r()) {
                U.d = -1;
                U.g = -1;
            }
        }
        g1 g1Var = this.b;
        ArrayList arrayList = (ArrayList) g1Var.c;
        ArrayList arrayList2 = (ArrayList) g1Var.e;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            q1 q1Var = (q1) arrayList2.get(i10);
            q1Var.d = -1;
            q1Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            q1 q1Var2 = (q1) arrayList.get(i11);
            q1Var2.d = -1;
            q1Var2.g = -1;
        }
        ArrayList arrayList3 = (ArrayList) g1Var.d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                q1 q1Var3 = (q1) ((ArrayList) g1Var.d).get(i12);
                q1Var3.d = -1;
                q1Var3.g = -1;
            }
        }
    }

    public final void n0(q1 q1Var, p pVar) {
        q1Var.p(0, 8192);
        boolean z10 = this.p0.h;
        we.b bVar = this.f;
        if (z10 && q1Var.m() && !q1Var.j() && !q1Var.r()) {
            ((h) bVar.c).k(q1Var, Q(q1Var));
        }
        f fVar = (f) bVar.b;
        w1 w1Var = (w1) fVar.get(q1Var);
        if (w1Var == null) {
            w1Var = w1.a();
            fVar.put(q1Var, w1Var);
        }
        w1Var.b = pVar;
        w1Var.a |= 4;
    }

    public final void o(int i9, int i10) {
        boolean z10;
        EdgeEffect edgeEffect = this.R;
        if (edgeEffect == null || edgeEffect.isFinished() || i9 <= 0) {
            z10 = false;
        } else {
            this.R.onRelease();
            z10 = this.R.isFinished();
        }
        EdgeEffect edgeEffect2 = this.T;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i9 < 0) {
            this.T.onRelease();
            z10 |= this.T.isFinished();
        }
        EdgeEffect edgeEffect3 = this.S;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i10 > 0) {
            this.S.onRelease();
            z10 |= this.S.isFinished();
        }
        EdgeEffect edgeEffect4 = this.U;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i10 < 0) {
            this.U.onRelease();
            z10 |= this.U.isFinished();
        }
        if (z10) {
            WeakHashMap weakHashMap = j0.a;
            postInvalidateOnAnimation();
        }
    }

    public final void o0() {
        w0 w0Var = this.V;
        if (w0Var != null) {
            w0Var.g();
        }
        z0 z0Var = this.x;
        g1 g1Var = this.b;
        if (z0Var != null) {
            z0Var.g0(g1Var);
            this.x.h0(g1Var);
        }
        ((ArrayList) g1Var.c).clear();
        g1Var.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        float f10;
        super.onAttachedToWindow();
        this.O = 0;
        this.C = true;
        this.E = this.E && !isLayoutRequested();
        z0 z0Var = this.x;
        if (z0Var != null) {
            z0Var.getClass();
        }
        this.v0 = false;
        if (O0) {
            ThreadLocal threadLocal = u.e;
            u uVar = (u) threadLocal.get();
            this.n0 = uVar;
            if (uVar == null) {
                u uVar2 = new u();
                uVar2.a = new ArrayList();
                uVar2.d = new ArrayList();
                this.n0 = uVar2;
                WeakHashMap weakHashMap = j0.a;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    f10 = display.getRefreshRate();
                }
                f10 = 60.0f;
                u uVar3 = this.n0;
                uVar3.c = (long) (1.0E9f / f10);
                threadLocal.set(uVar3);
            }
            this.n0.a.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        u uVar;
        super.onDetachedFromWindow();
        w0 w0Var = this.V;
        if (w0Var != null) {
            w0Var.g();
        }
        B0();
        this.C = false;
        this.F0.clear();
        removeCallbacks(this.G0);
        this.f.getClass();
        while (w1.d.a() != null) {
        }
        if (!O0 || (uVar = this.n0) == null) {
            return;
        }
        uVar.a.remove(this);
        this.n0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((y0) arrayList.get(i9)).b(canvas, this);
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
        if (this.x != null && !this.H && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f10 = this.x.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.x.d()) {
                    f11 = motionEvent.getAxisValue(10);
                    if (f10 == 0.0f || f11 != 0.0f) {
                        s0((int) (f11 * this.j0), (int) (f10 * this.k0), motionEvent);
                    }
                }
                f11 = 0.0f;
                if (f10 == 0.0f) {
                }
                s0((int) (f11 * this.j0), (int) (f10 * this.k0), motionEvent);
            } else {
                if ((motionEvent.getSource() & TLObject.FLAG_22) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.x.e()) {
                        f10 = -axisValue;
                        f11 = 0.0f;
                        if (f10 == 0.0f) {
                        }
                        s0((int) (f11 * this.j0), (int) (f10 * this.k0), motionEvent);
                    } else if (this.x.d()) {
                        f11 = axisValue;
                        f10 = 0.0f;
                        if (f10 == 0.0f) {
                        }
                        s0((int) (f11 * this.j0), (int) (f10 * this.k0), motionEvent);
                    }
                }
                f10 = 0.0f;
                f11 = 0.0f;
                if (f10 == 0.0f) {
                }
                s0((int) (f11 * this.j0), (int) (f10 * this.k0), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (!this.H) {
            this.B = null;
            if (H(motionEvent)) {
                r0();
                setScrollState(0);
                return true;
            }
            z0 z0Var = this.x;
            if (z0Var != null) {
                boolean d = z0Var.d();
                boolean e10 = this.x.e();
                if (this.b0 == null) {
                    this.b0 = VelocityTracker.obtain();
                }
                this.b0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.I) {
                        this.I = false;
                    }
                    this.a0 = motionEvent.getPointerId(0);
                    int x10 = (int) (motionEvent.getX() + 0.5f);
                    this.e0 = x10;
                    this.c0 = x10;
                    int y10 = (int) (motionEvent.getY() + 0.5f);
                    this.f0 = y10;
                    this.d0 = y10;
                    if (this.W == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        A0(1);
                    }
                    int[] iArr = this.A0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i9 = d;
                    if (e10) {
                        i9 = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i9, 0);
                } else if (actionMasked == 1) {
                    this.b0.clear();
                    A0(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.a0);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.a0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.W != 1) {
                        int i10 = x11 - this.c0;
                        int i11 = y11 - this.d0;
                        if (d == 0 || Math.abs(i10) <= this.g0) {
                            z10 = false;
                        } else {
                            this.e0 = x11;
                            z10 = true;
                        }
                        if (e10 && Math.abs(i11) > this.g0) {
                            this.f0 = y11;
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
                    this.a0 = motionEvent.getPointerId(actionIndex);
                    int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.e0 = x12;
                    this.c0 = x12;
                    int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f0 = y12;
                    this.d0 = y12;
                } else if (actionMasked == 6) {
                    i0(motionEvent);
                }
                if (this.W == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13 = g.a;
        Trace.beginSection("RV OnLayout");
        s();
        Trace.endSection();
        this.E = true;
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        if (this.x == null) {
            q(i9, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i9);
        int mode2 = View.MeasureSpec.getMode(i10);
        z0 z0Var = this.x;
        g1 g1Var = this.b;
        n1 n1Var = this.p0;
        z0Var.d0(g1Var, n1Var, i9, i10);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.w == null) {
            return;
        }
        if (n1Var.d == 1) {
            t();
        }
        this.x.q0(i9, i10);
        n1Var.i = true;
        u();
        this.x.s0(i9, i10);
        m0 m0Var = (m0) this.x;
        if (m0Var.l == 1073741824 || m0Var.k == 1073741824) {
            return;
        }
        int r10 = m0Var.r();
        for (int i11 = 0; i11 < r10; i11++) {
            ViewGroup.LayoutParams layoutParams = m0Var.q(i11).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                this.x.q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                n1Var.i = true;
                u();
                this.x.s0(i9, i10);
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i9, Rect rect) {
        if (b0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i9, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof k1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k1 k1Var = (k1) parcelable;
        this.c = k1Var;
        super.onRestoreInstanceState(k1Var.a);
        z0 z0Var = this.x;
        if (z0Var == null || (parcelable2 = this.c.c) == null) {
            return;
        }
        m0 m0Var = (m0) z0Var;
        if (parcelable2 instanceof l0) {
            m0Var.B = (l0) parcelable2;
            m0Var.l0();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k1 k1Var = new k1(super.onSaveInstanceState());
        k1 k1Var2 = this.c;
        if (k1Var2 != null) {
            k1Var.c = k1Var2.c;
            return k1Var;
        }
        z0 z0Var = this.x;
        if (z0Var != null) {
            k1Var.c = z0Var.e0();
            return k1Var;
        }
        k1Var.c = null;
        return k1Var;
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (i9 == i11 && i10 == i12) {
            return;
        }
        this.U = null;
        this.S = null;
        this.T = null;
        this.R = null;
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
        if (!this.H && !this.I) {
            c1 c1Var = this.B;
            if (c1Var == null) {
                z10 = motionEvent.getAction() == 0 ? false : H(motionEvent);
            } else {
                c1Var.a(this, motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.B = null;
                }
                z10 = true;
            }
            if (z10) {
                r0();
                setScrollState(0);
                return true;
            }
            z0 z0Var = this.x;
            if (z0Var != null) {
                boolean d = z0Var.d();
                boolean e10 = this.x.e();
                if (this.b0 == null) {
                    this.b0 = VelocityTracker.obtain();
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.A0;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                obtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked == 0) {
                    this.a0 = motionEvent.getPointerId(0);
                    int x10 = (int) (motionEvent.getX() + 0.5f);
                    this.e0 = x10;
                    this.c0 = x10;
                    int y10 = (int) (motionEvent.getY() + 0.5f);
                    this.f0 = y10;
                    this.d0 = y10;
                    int i9 = d;
                    if (e10) {
                        i9 = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i9, 0);
                } else {
                    if (actionMasked == 1) {
                        this.b0.addMovement(obtain);
                        VelocityTracker velocityTracker = this.b0;
                        int i10 = this.i0;
                        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, i10);
                        float f10 = d != 0 ? -this.b0.getXVelocity(this.a0) : 0.0f;
                        float f11 = e10 ? -this.b0.getYVelocity(this.a0) : 0.0f;
                        if (f10 != 0.0f || f11 != 0.0f) {
                            int i11 = (int) f10;
                            int i12 = (int) f11;
                            z0 z0Var2 = this.x;
                            if (z0Var2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.H) {
                                boolean d9 = z0Var2.d();
                                boolean e11 = this.x.e();
                                int i13 = this.h0;
                                if (d9 == 0 || Math.abs(i11) < i13) {
                                    i11 = 0;
                                }
                                if (!e11 || Math.abs(i12) < i13) {
                                    i12 = 0;
                                }
                                if (i11 != 0 || i12 != 0) {
                                    float f12 = i11;
                                    float f13 = i12;
                                    if (!dispatchNestedPreFling(f12, f13)) {
                                        boolean z12 = d9 != 0 || e11;
                                        dispatchNestedFling(f12, f13, z12);
                                        int i14 = d9;
                                        if (z12) {
                                            if (e11) {
                                                i14 = (d9 ? 1 : 0) | 2;
                                            }
                                            getScrollingChildHelper().g(i14, 1);
                                            int i15 = -i10;
                                            int max = Math.max(i15, Math.min(i11, i10));
                                            int max2 = Math.max(i15, Math.min(i12, i10));
                                            p1 p1Var = this.m0;
                                            RecyclerView recyclerView = p1Var.h;
                                            recyclerView.setScrollState(2);
                                            p1Var.b = 0;
                                            p1Var.a = 0;
                                            Interpolator interpolator = p1Var.d;
                                            c0 c0Var = P0;
                                            if (interpolator != c0Var) {
                                                p1Var.d = c0Var;
                                                p1Var.c = new OverScroller(recyclerView.getContext(), c0Var);
                                            }
                                            p1Var.c.fling(0, 0, max, max2, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                            p1Var.a();
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
                        int findPointerIndex = motionEvent.findPointerIndex(this.a0);
                        if (findPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.a0 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i16 = this.e0 - x11;
                        int i17 = this.f0 - y11;
                        int[] iArr2 = this.E0;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        boolean v = v(i16, i17, 0, iArr2, this.z0);
                        int[] iArr3 = this.z0;
                        if (v) {
                            i16 -= iArr2[0];
                            i17 -= iArr2[1];
                            obtain.offsetLocation(iArr3[0], iArr3[1]);
                            iArr[0] = iArr[0] + iArr3[0];
                            iArr[1] = iArr[1] + iArr3[1];
                        }
                        if (this.W != 1) {
                            if (d != 0) {
                                int abs = Math.abs(i16);
                                int i18 = this.g0;
                                if (abs > i18) {
                                    i16 = i16 > 0 ? i16 - i18 : i16 + i18;
                                    z11 = true;
                                    if (e10) {
                                        int abs2 = Math.abs(i17);
                                        int i19 = this.g0;
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
                            if (e10) {
                            }
                            if (z11) {
                            }
                        }
                        if (this.W == 1) {
                            this.e0 = x11 - iArr3[0];
                            this.f0 = y11 - iArr3[1];
                            if (s0(d != 0 ? i16 : 0, e10 ? i17 : 0, obtain)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            u uVar = this.n0;
                            if (uVar != null && (i16 != 0 || i17 != 0)) {
                                uVar.a(this, i16, i17);
                            }
                        }
                    } else if (actionMasked == 3) {
                        r0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.a0 = motionEvent.getPointerId(actionIndex);
                        int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.e0 = x12;
                        this.c0 = x12;
                        int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f0 = y12;
                        this.d0 = y12;
                    } else if (actionMasked == 6) {
                        i0(motionEvent);
                    }
                }
                this.b0.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        if (!this.E || this.M) {
            int i9 = g.a;
            Trace.beginSection("RV FullInvalidate");
            s();
            Trace.endSection();
            return;
        }
        b bVar = this.d;
        if (bVar.h()) {
            int i10 = bVar.b;
            if ((i10 & 4) == 0 || (i10 & 11) != 0) {
                if (bVar.h()) {
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
            y0();
            g0();
            bVar.l();
            if (!this.G) {
                m mVar = this.e;
                int q10 = mVar.q();
                int i13 = 0;
                while (true) {
                    if (i13 < q10) {
                        q1 U = U(mVar.p(i13));
                        if (U != null && !U.r() && U.m()) {
                            s();
                            break;
                        }
                        i13++;
                    } else {
                        bVar.c();
                        break;
                    }
                }
            }
            z0(true);
            h0(true);
            Trace.endSection();
        }
    }

    public final void p0(y0 y0Var) {
        z0 z0Var = this.x;
        if (z0Var != null) {
            z0Var.b("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.y;
        arrayList.remove(y0Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        d0();
        requestLayout();
    }

    public final void q(int i9, int i10) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = j0.a;
        setMeasuredDimension(z0.g(i9, paddingRight, getMinimumWidth()), z0.g(i10, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void q0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.r;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof a1) {
            a1 a1Var = (a1) layoutParams;
            if (!a1Var.c) {
                Rect rect2 = a1Var.b;
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
        this.x.k0(this, view, this.r, !this.E, view2 == null);
    }

    public final void r(View view) {
        q1 U = U(view);
        r0 r0Var = this.w;
        if (r0Var != null && U != null) {
            r0Var.z(U);
        }
        ArrayList arrayList = this.L;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                h0 h0Var = (h0) this.L.get(size);
                h0Var.o(view);
                q1 T = h0Var.D.T(view);
                if (T != null) {
                    q1 q1Var = h0Var.c;
                    if (q1Var == null || T != q1Var) {
                        h0Var.j(T, false);
                        if (h0Var.a.remove(T.a)) {
                            h0Var.x.a(h0Var.D, T);
                        }
                    } else {
                        h0Var.p(null, 0);
                    }
                }
            }
        }
    }

    public final void r0() {
        VelocityTracker velocityTracker = this.b0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z10 = false;
        A0(0);
        EdgeEffect edgeEffect = this.R;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.R.isFinished();
        }
        EdgeEffect edgeEffect2 = this.S;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.S.isFinished();
        }
        EdgeEffect edgeEffect3 = this.T;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.T.isFinished();
        }
        EdgeEffect edgeEffect4 = this.U;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.U.isFinished();
        }
        if (z10) {
            WeakHashMap weakHashMap = j0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        q1 U = U(view);
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
        m1 m1Var = this.x.e;
        if ((m1Var == null || !m1Var.e) && !b0() && view2 != null) {
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
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((c1) arrayList.get(i9)).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.F != 0 || this.H) {
            this.G = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x036f, code lost:
    
        if (((java.util.ArrayList) r20.e.d).contains(getFocusedChild()) == false) goto L240;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x041c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        w1 w1Var;
        int i9;
        boolean r10;
        int i10;
        int i11;
        int i12;
        int i13;
        q1 q1Var;
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
        n1 n1Var = this.p0;
        boolean z11 = false;
        n1Var.i = false;
        int i14 = 1;
        if (n1Var.d == 1) {
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
        n1Var.a(4);
        y0();
        g0();
        n1Var.d = 1;
        boolean z12 = n1Var.j;
        g1 g1Var = this.b;
        we.b bVar2 = this.f;
        if (z12) {
            try {
                int q10 = this.e.q() - 1;
                while (q10 >= 0) {
                    q1 U = U(this.e.p(q10));
                    if (U != null && !U.r()) {
                        long Q = Q(U);
                        this.V.getClass();
                        p pVar = new p();
                        View view = U.a;
                        pVar.a = view.getLeft();
                        pVar.b = view.getTop();
                        view.getRight();
                        view.getBottom();
                        h hVar = (h) bVar2.c;
                        f fVar = (f) bVar2.b;
                        q1 q1Var2 = (q1) hVar.f(Q);
                        if (q1Var2 == null || q1Var2.r()) {
                            bVar2.j(U, pVar);
                        } else {
                            w1 w1Var2 = (w1) fVar.get(q1Var2);
                            boolean z13 = (w1Var2 == null || (w1Var2.a & i14) == 0) ? false : true;
                            w1 w1Var3 = (w1) fVar.get(U);
                            boolean z14 = (w1Var3 == null || (w1Var3.a & i14) == 0) ? false : true;
                            if (z13 && q1Var2 == U) {
                                bVar2.j(U, pVar);
                            } else {
                                try {
                                    p J = bVar2.J(q1Var2, 4);
                                    bVar2.j(U, pVar);
                                    p J2 = bVar2.J(U, 8);
                                    if (J == null) {
                                        Y(Q, U, q1Var2);
                                    } else {
                                        q1Var2.q(false);
                                        if (z13) {
                                            h(q1Var2);
                                        }
                                        if (q1Var2 != U) {
                                            if (z14) {
                                                h(U);
                                            }
                                            q1Var2.j = U;
                                            h(q1Var2);
                                            g1Var.k(q1Var2);
                                            U.q(false);
                                            U.k = q1Var2;
                                        }
                                        t1 t1Var = (t1) this.V;
                                        t1Var.getClass();
                                        int i15 = J.a;
                                        int i16 = J.b;
                                        if (U.r()) {
                                            i12 = J.a;
                                            i13 = J.b;
                                        } else {
                                            i12 = J2.a;
                                            i13 = J2.b;
                                        }
                                        if (t1Var.q(q1Var2, U, J, i15, i16, i12, i13)) {
                                            l0();
                                        }
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    StringBuilder sb2 = new StringBuilder();
                                    for (int q11 = this.e.q() - 1; q11 >= 0; q11--) {
                                        q1 U2 = U(this.e.p(q11));
                                        if (U2 != null && !U2.r()) {
                                            sb2.append("Holder at" + q11 + " " + U2 + "\n");
                                        }
                                    }
                                    throw new RuntimeException(sb2.toString(), e);
                                }
                            }
                        }
                        q10--;
                        i14 = 1;
                    }
                    q10--;
                    i14 = 1;
                }
                f fVar2 = (f) bVar2.b;
                int i17 = fVar2.c - 1;
                while (i17 >= 0) {
                    q1 q1Var3 = (q1) fVar2.e(i17);
                    try {
                        w1Var = (w1) fVar2.f(i17);
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        w1Var = null;
                    }
                    if (w1Var != null) {
                        int i18 = w1Var.a;
                        int i19 = i18 & 3;
                        c cVar = this.H0;
                        if (i19 == 3) {
                            cVar.M(q1Var3);
                        } else if ((i18 & 1) != 0) {
                            p pVar2 = w1Var.b;
                            if (pVar2 == null) {
                                cVar.M(q1Var3);
                            } else {
                                cVar.L(q1Var3, pVar2, w1Var.c);
                            }
                        } else if ((i18 & 14) == 14) {
                            p pVar3 = w1Var.b;
                            p pVar4 = w1Var.c;
                            RecyclerView recyclerView = (RecyclerView) cVar.b;
                            q1Var3.q(z11);
                            if (recyclerView.V.a(q1Var3, pVar3, pVar4)) {
                                recyclerView.l0();
                            }
                        } else if ((i18 & 12) == 12) {
                            p pVar5 = w1Var.b;
                            p pVar6 = w1Var.c;
                            cVar.getClass();
                            q1Var3.q(z11);
                            RecyclerView recyclerView2 = (RecyclerView) cVar.b;
                            if (recyclerView2.M) {
                                t1 t1Var2 = (t1) recyclerView2.V;
                                t1Var2.getClass();
                                int i20 = pVar5.a;
                                int i21 = pVar5.b;
                                if (q1Var3.r()) {
                                    i11 = pVar5.a;
                                    i10 = pVar5.b;
                                } else {
                                    int i22 = pVar6.a;
                                    i10 = pVar6.b;
                                    i11 = i22;
                                }
                                if (t1Var2.q(q1Var3, q1Var3, pVar5, i20, i21, i11, i10)) {
                                    recyclerView2.l0();
                                }
                            } else {
                                t1 t1Var3 = (t1) recyclerView2.V;
                                t1Var3.getClass();
                                int i23 = pVar5.a;
                                int i24 = pVar6.a;
                                if (i23 == i24 && pVar5.b == pVar6.b) {
                                    t1Var3.v(q1Var3);
                                    r10 = false;
                                } else {
                                    r10 = t1Var3.r(q1Var3, pVar5, i23, pVar5.b, i24, pVar6.b);
                                }
                                if (r10) {
                                    recyclerView2.l0();
                                }
                            }
                        } else if ((i18 & 4) != 0) {
                            cVar.L(q1Var3, w1Var.b, null);
                        } else if ((i18 & 8) != 0) {
                            p pVar7 = w1Var.b;
                            p pVar8 = w1Var.c;
                            RecyclerView recyclerView3 = (RecyclerView) cVar.b;
                            i9 = 0;
                            q1Var3.q(false);
                            if (recyclerView3.V.a(q1Var3, pVar7, pVar8)) {
                                recyclerView3.l0();
                            }
                            w1Var.a = i9;
                            w1Var.b = null;
                            w1Var.c = null;
                            w1.d.h(w1Var);
                        }
                        i9 = 0;
                        w1Var.a = i9;
                        w1Var.b = null;
                        w1Var.c = null;
                        w1.d.h(w1Var);
                    }
                    i17--;
                    z11 = false;
                }
            } catch (Exception e12) {
                e = e12;
            }
        }
        View view2 = null;
        this.x.h0(g1Var);
        n1Var.b = n1Var.e;
        this.M = false;
        this.N = false;
        n1Var.j = false;
        n1Var.k = false;
        this.x.f = false;
        ArrayList arrayList = (ArrayList) g1Var.d;
        if (arrayList != null) {
            arrayList.clear();
        }
        z0 z0Var = this.x;
        if (z0Var.j) {
            z0Var.i = 0;
            z0Var.j = false;
            g1Var.l();
        }
        this.x.c0(n1Var);
        h0(true);
        z0(false);
        ((f) bVar2.b).clear();
        ((h) bVar2.c).b();
        int[] iArr = this.x0;
        int i25 = iArr[0];
        int i26 = iArr[1];
        I(iArr);
        if ((iArr[0] == i25 && iArr[1] == i26) ? false : true) {
            x(0, 0);
        }
        if (this.l0 && this.w != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j10 = n1Var.m;
            if (j10 != -1 && (z10 = this.w.b) && z10) {
                int v = this.e.v();
                q1Var = null;
                int i27 = 0;
                while (true) {
                    if (i27 >= v) {
                        break;
                    }
                    q1 U3 = U(this.e.u(i27));
                    if (U3 != null && !U3.j() && U3.e == j10) {
                        if (!((ArrayList) this.e.d).contains(U3.a)) {
                            q1Var = U3;
                            break;
                        }
                        q1Var = U3;
                    }
                    i27++;
                }
            } else {
                q1Var = null;
            }
            if (q1Var != null) {
                View view3 = q1Var.a;
                if (!((ArrayList) this.e.d).contains(view3) && view3.hasFocusable()) {
                    view2 = view3;
                    if (view2 != null) {
                        int i28 = n1Var.n;
                        if (i28 != -1 && (findViewById = view2.findViewById(i28)) != null && findViewById.isFocusable()) {
                            view2 = findViewById;
                        }
                        view2.requestFocus();
                    }
                }
            }
            if (this.e.q() > 0) {
                int i29 = n1Var.l;
                if (i29 == -1) {
                    i29 = 0;
                }
                int b10 = n1Var.b();
                for (int i30 = i29; i30 < b10; i30++) {
                    q1 K = K(i30);
                    if (K == null) {
                        break;
                    }
                    View view4 = K.a;
                    if (view4.hasFocusable()) {
                        view2 = view4;
                        break;
                    }
                }
                int min = Math.min(b10, i29) - 1;
                while (true) {
                    if (min < 0) {
                        break;
                    }
                    q1 K2 = K(min);
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
        n1Var.m = -1L;
        n1Var.l = -1;
        n1Var.n = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s0(int i9, int i10, MotionEvent motionEvent) {
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        p();
        r0 r0Var = this.w;
        int[] iArr = this.E0;
        if (r0Var != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            t0(i9, i10, iArr);
            i11 = iArr[0];
            i12 = iArr[1];
            i13 = i9 - i11;
            i14 = i10 - i12;
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (!this.y.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        w(i11, i12, i13, i14, this.z0, 0, iArr);
        int i15 = i13 - iArr[0];
        int i16 = i14 - iArr[1];
        int i17 = this.e0;
        int[] iArr2 = this.z0;
        int i18 = iArr2[0];
        this.e0 = i17 - i18;
        int i19 = this.f0;
        int i20 = iArr2[1];
        this.f0 = i19 - i20;
        if (motionEvent != null) {
            motionEvent.offsetLocation(i18, i20);
        }
        int[] iArr3 = this.A0;
        iArr3[0] = iArr3[0] + iArr2[0];
        iArr3[1] = iArr3[1] + iArr2[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x10 = motionEvent.getX();
                float f10 = i15;
                float y10 = motionEvent.getY();
                float f11 = i16;
                if (f10 < 0.0f) {
                    z();
                    u0.b.a(this.R, (-f10) / getWidth(), 1.0f - (y10 / getHeight()));
                } else if (f10 > 0.0f) {
                    A();
                    u0.b.a(this.T, f10 / getWidth(), y10 / getHeight());
                } else {
                    z10 = false;
                    if (f11 >= 0.0f) {
                        B();
                        u0.b.a(this.S, (-f11) / getHeight(), x10 / getWidth());
                    } else {
                        if (f11 > 0.0f) {
                            y();
                            u0.b.a(this.U, f11 / getHeight(), 1.0f - (x10 / getWidth()));
                        }
                        if (!z10 || f10 != 0.0f || f11 != 0.0f) {
                            WeakHashMap weakHashMap = j0.a;
                            postInvalidateOnAnimation();
                        }
                    }
                    z10 = true;
                    if (!z10) {
                    }
                    WeakHashMap weakHashMap2 = j0.a;
                    postInvalidateOnAnimation();
                }
                z10 = true;
                if (f11 >= 0.0f) {
                }
                z10 = true;
                if (!z10) {
                }
                WeakHashMap weakHashMap22 = j0.a;
                postInvalidateOnAnimation();
            }
            o(i9, i10);
        }
        if (i11 != 0 || i12 != 0) {
            x(i11, i12);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i11 == 0 && i12 == 0) ? false : true;
    }

    @Override // android.view.View
    public final void scrollBy(int i9, int i10) {
        z0 z0Var = this.x;
        if (z0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.H) {
            return;
        }
        boolean d = z0Var.d();
        boolean e10 = this.x.e();
        if (d || e10) {
            if (!d) {
                i9 = 0;
            }
            if (!e10) {
                i10 = 0;
            }
            s0(i9, i10, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i9, int i10) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!b0()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.J |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(s1 s1Var) {
        this.w0 = s1Var;
        j0.k(this, s1Var);
    }

    public void setAdapter(r0 r0Var) {
        setLayoutFrozen(false);
        r0 r0Var2 = this.w;
        i1 i1Var = this.a;
        if (r0Var2 != null) {
            r0Var2.a.unregisterObserver(i1Var);
            this.w.getClass();
        }
        o0();
        b bVar = this.d;
        bVar.m((ArrayList) bVar.d);
        bVar.m((ArrayList) bVar.e);
        bVar.b = 0;
        r0 r0Var3 = this.w;
        this.w = r0Var;
        if (r0Var != null) {
            r0Var.B(i1Var);
        }
        z0 z0Var = this.x;
        if (z0Var != null) {
            z0Var.Q();
        }
        this.b.d(r0Var3, this.w);
        this.p0.f = true;
        m0(false);
        requestLayout();
    }

    public void setAdditionalDebugInfo(String str) {
        this.I0 = str;
    }

    public void setBottomGlowOffset(int i9) {
        this.C0 = i9;
    }

    public void setChildDrawingOrderCallback(u0 u0Var) {
        if (u0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(u0Var != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.h) {
            this.U = null;
            this.S = null;
            this.T = null;
            this.R = null;
        }
        this.h = z10;
        super.setClipToPadding(z10);
        if (this.E) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(v0 v0Var) {
        v0Var.getClass();
        this.Q = v0Var;
        this.U = null;
        this.S = null;
        this.T = null;
        this.R = null;
    }

    public void setGlowColor(int i9) {
        this.D0 = Integer.valueOf(i9);
    }

    public void setHasFixedSize(boolean z10) {
        this.D = z10;
    }

    public void setItemAnimator(w0 w0Var) {
        w0 w0Var2 = this.V;
        if (w0Var2 != null) {
            w0Var2.g();
            this.V.a = null;
        }
        this.V = w0Var;
        if (w0Var != null) {
            w0Var.a = this.u0;
        }
    }

    public void setItemViewCacheSize(int i9) {
        g1 g1Var = this.b;
        g1Var.a = i9;
        g1Var.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(z0 z0Var) {
        if (z0Var == this.x) {
            return;
        }
        B0();
        z0 z0Var2 = this.x;
        g1 g1Var = this.b;
        if (z0Var2 != null) {
            w0 w0Var = this.V;
            if (w0Var != null) {
                w0Var.g();
            }
            this.x.g0(g1Var);
            this.x.h0(g1Var);
            ((ArrayList) g1Var.c).clear();
            g1Var.e();
            if (this.C) {
                this.x.getClass();
            }
            this.x.t0(null);
            this.x = null;
        } else {
            ((ArrayList) g1Var.c).clear();
            g1Var.e();
        }
        this.e.z();
        this.x = z0Var;
        if (z0Var != null) {
            if (z0Var.b != null) {
                throw new IllegalArgumentException("LayoutManager " + z0Var + " is already attached to a RecyclerView:" + z0Var.b.C());
            }
            z0Var.t0(this);
            if (this.C) {
                this.x.getClass();
            }
        }
        g1Var.l();
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
        l scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = j0.a;
            b0.k(viewGroup);
        }
        scrollingChildHelper.d = z10;
    }

    @Deprecated
    public void setOnScrollListener(d1 d1Var) {
        this.q0 = d1Var;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.l0 = z10;
    }

    public void setRecycledViewPool(f1 f1Var) {
        g1 g1Var = this.b;
        if (((f1) g1Var.g) != null) {
            r1.b--;
        }
        g1Var.g = f1Var;
        if (f1Var == null || ((RecyclerView) g1Var.h).getAdapter() == null) {
            return;
        }
        ((f1) g1Var.g).b++;
    }

    public void setScrollState(int i9) {
        m1 m1Var;
        if (i9 == this.W) {
            return;
        }
        this.W = i9;
        if (i9 != 2) {
            p1 p1Var = this.m0;
            RecyclerView recyclerView = p1Var.h;
            if (recyclerView.J0) {
                recyclerView.removeCallbacks(p1Var);
                p1Var.c.abortAnimation();
            }
            z0 z0Var = this.x;
            if (z0Var != null && (m1Var = z0Var.e) != null) {
                m1Var.h();
            }
        }
        z0 z0Var2 = this.x;
        if (z0Var2 != null) {
            z0Var2.f0();
        }
        j0(i9);
        d1 d1Var = this.q0;
        if (d1Var != null) {
            d1Var.a(this, i9);
        }
        ArrayList arrayList = this.r0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((d1) this.r0.get(size)).a(this, i9);
            }
        }
    }

    public void setScrollingTouchSlop(int i9) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i9 != 0) {
            if (i9 == 1) {
                this.g0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i9 + "; using default value");
        }
        this.g0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setTopGlowOffset(int i9) {
        this.B0 = i9;
    }

    public void setViewCacheExtension(o1 o1Var) {
        this.b.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i9) {
        return getScrollingChildHelper().g(i9, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.H) {
            l("Do not suppressLayout in layout or scroll");
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.H = true;
                this.I = true;
                B0();
                return;
            }
            this.H = false;
            if (this.G && this.x != null && this.w != null) {
                requestLayout();
            }
            this.G = false;
        }
    }

    public final void t() {
        w1 w1Var;
        View F;
        boolean z10;
        n1 n1Var = this.p0;
        n1Var.a(1);
        D(n1Var);
        n1Var.i = false;
        y0();
        we.b bVar = this.f;
        f fVar = (f) bVar.b;
        f fVar2 = (f) bVar.b;
        fVar.clear();
        h hVar = (h) bVar.c;
        hVar.b();
        g0();
        if (this.M) {
            b bVar2 = this.d;
            bVar2.m((ArrayList) bVar2.d);
            bVar2.m((ArrayList) bVar2.e);
            bVar2.b = 0;
            if (this.N) {
                this.x.W(this);
            }
        }
        if (this.V == null || !this.x.y0()) {
            this.d.d();
        } else {
            this.d.l();
        }
        boolean z11 = this.s0 || this.t0;
        boolean z12 = this.E && this.V != null && ((z10 = this.M) || z11 || this.x.f) && (!z10 || this.w.b);
        n1Var.j = z12;
        n1Var.k = z12 && z11 && !this.M && this.V != null && this.x.y0();
        q1 q1Var = null;
        View focusedChild = (this.l0 && hasFocus() && this.w != null) ? getFocusedChild() : null;
        if (focusedChild != null && (F = F(focusedChild)) != null) {
            q1Var = T(F);
        }
        if (q1Var == null) {
            n1Var.m = -1L;
            n1Var.l = -1;
            n1Var.n = -1;
        } else {
            n1Var.m = this.w.b ? q1Var.e : -1L;
            n1Var.l = this.M ? -1 : q1Var.j() ? q1Var.d : q1Var.b();
            View view = q1Var.a;
            int id2 = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id2 = view.getId();
                }
            }
            n1Var.n = id2;
        }
        n1Var.h = n1Var.j && this.t0;
        this.t0 = false;
        this.s0 = false;
        n1Var.g = n1Var.k;
        n1Var.e = this.w.h();
        I(this.x0);
        if (n1Var.j) {
            int q10 = this.e.q();
            for (int i9 = 0; i9 < q10; i9++) {
                q1 U = U(this.e.p(i9));
                if (!U.r() && (!U.h() || this.w.b)) {
                    p l10 = this.V.l(n1Var, U, w0.b(U), U.d());
                    w1 w1Var2 = (w1) fVar2.get(U);
                    if (w1Var2 == null) {
                        w1Var2 = w1.a();
                        fVar2.put(U, w1Var2);
                    }
                    w1Var2.b = l10;
                    w1Var2.a |= 4;
                    if (n1Var.h && U.m() && !U.j() && !U.r() && !U.h()) {
                        hVar.k(U, Q(U));
                    }
                }
            }
        }
        if (n1Var.k) {
            int v = this.e.v();
            for (int i10 = 0; i10 < v; i10++) {
                q1 U2 = U(this.e.u(i10));
                if (!U2.r()) {
                    if (U2.d == -1) {
                        U2.d = U2.c;
                    }
                    U2.h = U2.c;
                }
            }
            boolean z13 = n1Var.f;
            n1Var.f = false;
            this.x.b0(this.b, n1Var);
            n1Var.f = z13;
            for (int i11 = 0; i11 < this.e.q(); i11++) {
                q1 U3 = U(this.e.p(i11));
                if (!U3.r() && ((w1Var = (w1) fVar2.get(U3)) == null || (w1Var.a & 4) == 0)) {
                    int b10 = w0.b(U3);
                    boolean e10 = U3.e(8192);
                    if (!e10) {
                        b10 |= 4096;
                    }
                    p l11 = this.V.l(n1Var, U3, b10, U3.d());
                    if (e10) {
                        n0(U3, l11);
                    } else {
                        w1 w1Var3 = (w1) fVar2.get(U3);
                        if (w1Var3 == null) {
                            w1Var3 = w1.a();
                            fVar2.put(U3, w1Var3);
                        }
                        w1Var3.a |= 2;
                        w1Var3.b = l11;
                    }
                }
            }
            n();
        } else {
            n();
        }
        h0(true);
        z0(false);
        n1Var.d = 2;
    }

    public final void t0(int i9, int i10, int[] iArr) {
        q1 q1Var;
        y0();
        g0();
        int i11 = g.a;
        Trace.beginSection("RV Scroll");
        n1 n1Var = this.p0;
        D(n1Var);
        g1 g1Var = this.b;
        int m0 = i9 != 0 ? this.x.m0(i9, g1Var, n1Var) : 0;
        int o02 = i10 != 0 ? this.x.o0(i10, g1Var, n1Var) : 0;
        Trace.endSection();
        m mVar = this.e;
        int q10 = mVar.q();
        for (int i12 = 0; i12 < q10; i12++) {
            View p6 = mVar.p(i12);
            q1 T = T(p6);
            if (T != null && (q1Var = T.k) != null) {
                View view = q1Var.a;
                int left = p6.getLeft();
                int top = p6.getTop();
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
        n1 n1Var = this.p0;
        n1Var.a(6);
        this.d.d();
        n1Var.e = this.w.h();
        n1Var.c = 0;
        n1Var.g = false;
        this.x.b0(this.b, n1Var);
        n1Var.f = false;
        this.c = null;
        n1Var.j = n1Var.j && this.V != null;
        n1Var.d = 4;
        h0(true);
        z0(false);
    }

    public final void u0(int i9) {
        if (this.H) {
            return;
        }
        B0();
        z0 z0Var = this.x;
        if (z0Var == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            z0Var.n0(i9);
            awakenScrollBars();
        }
    }

    public boolean v(int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i9, i10, i11, iArr, iArr2);
    }

    public final void v0(int i9, int i10, Interpolator interpolator) {
        z0 z0Var = this.x;
        if (z0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.H) {
            return;
        }
        if (!z0Var.d()) {
            i9 = 0;
        }
        if (!this.x.e()) {
            i10 = 0;
        }
        if (i9 == 0 && i10 == 0) {
            return;
        }
        this.m0.b(i9, i10, TLObject.FLAG_31, interpolator);
    }

    public final void w(int i9, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        getScrollingChildHelper().d(i9, i10, i11, i12, iArr, i13, iArr2);
    }

    public final void w0(int i9, int i10, Interpolator interpolator) {
        if (this.x == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.H) {
            return;
        }
        if (!this.x.e()) {
            i9 = 0;
        }
        if (i9 != 0) {
            this.m0.b(0, i9, i10, interpolator);
        }
    }

    public final void x(int i9, int i10) {
        this.P++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i9, scrollY - i10);
        k0(i9, i10);
        d1 d1Var = this.q0;
        if (d1Var != null) {
            d1Var.b(this, i9, i10);
        }
        ArrayList arrayList = this.r0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((d1) this.r0.get(size)).b(this, i9, i10);
            }
        }
        this.P--;
    }

    public final void x0(int i9) {
        if (this.H) {
            return;
        }
        z0 z0Var = this.x;
        if (z0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            z0Var.v0(this, this.p0, i9);
        }
    }

    public final void y() {
        if (this.U != null) {
            return;
        }
        EdgeEffect a2 = this.Q.a(this, 3);
        this.U = a2;
        if (this.h) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
        k(this.U);
    }

    public final void y0() {
        int i9 = this.F + 1;
        this.F = i9;
        if (i9 != 1 || this.H) {
            return;
        }
        this.G = false;
    }

    public final void z() {
        if (this.R != null) {
            return;
        }
        EdgeEffect a2 = this.Q.a(this, 0);
        this.R = a2;
        if (this.h) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
        k(this.R);
    }

    public final void z0(boolean z10) {
        if (this.F < 1) {
            this.F = 1;
        }
        if (!z10 && !this.H) {
            this.G = false;
        }
        if (this.F == 1) {
            if (z10 && this.G && !this.H && this.x != null && this.w != null) {
                s();
            }
            if (!this.H) {
                this.G = false;
            }
        }
        this.F--;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        float a2;
        float a3;
        this.a = new i1(this, r1);
        this.b = new g1(this);
        this.f = new we.b(27, (byte) 0);
        this.n = new q0(this, r1);
        this.r = new Rect();
        this.s = new Rect();
        this.v = new RectF();
        this.y = new ArrayList();
        this.A = new ArrayList();
        this.F = 0;
        this.M = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = new v0();
        this.V = new n();
        this.W = 0;
        this.a0 = -1;
        this.j0 = Float.MIN_VALUE;
        this.k0 = Float.MIN_VALUE;
        int i10 = 1;
        this.l0 = true;
        this.m0 = new p1(this);
        this.o0 = O0 ? new i() : null;
        n1 n1Var = new n1();
        n1Var.a = -1;
        n1Var.b = 0;
        n1Var.c = 0;
        n1Var.d = 1;
        n1Var.e = 0;
        n1Var.f = false;
        n1Var.g = false;
        n1Var.h = false;
        n1Var.i = false;
        n1Var.j = false;
        n1Var.k = false;
        this.p0 = n1Var;
        this.s0 = false;
        this.t0 = false;
        x0 x0Var = new x0(this);
        this.u0 = x0Var;
        this.v0 = false;
        this.x0 = new int[2];
        this.z0 = new int[2];
        this.A0 = new int[2];
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = null;
        this.E0 = new int[2];
        this.F0 = new ArrayList();
        this.G0 = new q0(this, i10);
        this.H0 = new c(this, 14);
        this.J0 = true;
        this.K0 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L0, i9, 0);
            this.h = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.h = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.g0 = viewConfiguration.getScaledTouchSlop();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            Method method = k0.a;
            a2 = g6.a.c(viewConfiguration);
        } else {
            a2 = k0.a(viewConfiguration, context);
        }
        this.j0 = a2;
        if (i11 >= 26) {
            a3 = g6.a.d(viewConfiguration);
        } else {
            a3 = k0.a(viewConfiguration, context);
        }
        this.k0 = a3;
        this.h0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.i0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.V.a = x0Var;
        this.d = new b(new android.support.v4.media.c(this, 11));
        this.e = new m(new k5.i(this, 12));
        WeakHashMap weakHashMap = j0.a;
        if ((i11 >= 26 ? d0.a(this) : 0) == 0 && i11 >= 26) {
            d0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.K = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new s1(this));
        setDescendantFocusability(262144);
        setNestedScrollingEnabled(true);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        z0 z0Var = this.x;
        if (z0Var != null) {
            return z0Var.p(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + C());
    }

    public void f0(View view) {
    }

    public void j0(int i9) {
    }

    public void setOnFlingListener(b1 b1Var) {
    }

    public void setRecyclerListener(h1 h1Var) {
    }

    public void k0(int i9, int i10) {
    }
}
