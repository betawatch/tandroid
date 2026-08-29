package androidx.recyclerview.widget;

import a0.f;
import a0.h;
import ag.o1;
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
import androidx.biometric.e;
import androidx.datastore.preferences.protobuf.i;
import ba.a;
import f2.a0;
import f2.a1;
import f2.c1;
import f2.d1;
import f2.e0;
import f2.e1;
import f2.f1;
import f2.h1;
import f2.i0;
import f2.j0;
import f2.j1;
import f2.k1;
import f2.l1;
import f2.m1;
import f2.n0;
import f2.n1;
import f2.o0;
import f2.p0;
import f2.p1;
import f2.q1;
import f2.s;
import f2.s0;
import f2.t0;
import f2.t1;
import f2.u0;
import f2.v0;
import f2.w0;
import f2.x0;
import f2.y0;
import f2.z0;
import ha.c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.g;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import r0.b0;
import r0.d0;
import r0.k0;
import r0.l;
import ze.b;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] L0 = {R.attr.clipToPadding};
    public static final boolean M0;
    public static final boolean N0;
    public static final boolean O0;
    public static final a0 P0;
    public final ArrayList A;
    public final int[] A0;
    public z0 B;
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
    public final n0 G0;
    public boolean H;
    public final o0 H0;
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
    public t0 Q;
    public EdgeEffect R;
    public EdgeEffect S;
    public EdgeEffect T;
    public EdgeEffect U;
    public u0 V;
    public int W;
    public final f1 a;
    public int a0;
    public final d1 b;
    public VelocityTracker b0;
    public h1 c;
    public int c0;
    public final a d;
    public int d0;
    public final e e;
    public int e0;
    public final b f;
    public int f0;
    public int g0;
    public boolean h;
    public final int h0;
    public final int i0;
    public final float j0;
    public final float k0;
    public boolean l0;
    public final m1 m0;
    public final n0 n;
    public s n0;
    public final i o0;
    public final k1 p0;
    public a1 q0;
    public final Rect r;
    public ArrayList r0;
    public final Rect s;
    public boolean s0;
    public boolean t0;
    public final c u0;
    public final RectF v;
    public boolean v0;
    public p0 w;
    public p1 w0;
    public w0 x;
    public final int[] x0;
    public final ArrayList y;
    public l y0;
    public final int[] z0;

    static {
        M0 = Build.VERSION.SDK_INT >= 23;
        N0 = true;
        O0 = true;
        P0 = new a0(2);
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
        n1 U = U(view);
        if (U != null) {
            return U.b();
        }
        return -1;
    }

    public static int S(View view) {
        n1 U = U(view);
        if (U != null) {
            return U.c();
        }
        return -1;
    }

    public static n1 U(View view) {
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof x0) {
            return ((x0) layoutParams).a;
        }
        return null;
    }

    private l getScrollingChildHelper() {
        if (this.y0 == null) {
            this.y0 = new l(this);
        }
        return this.y0;
    }

    public static void m(n1 n1Var) {
        WeakReference weakReference = n1Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == n1Var.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            n1Var.b = null;
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

    public final void A0(int i10) {
        getScrollingChildHelper().h(i10);
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
        j1 j1Var;
        setScrollState(0);
        m1 m1Var = this.m0;
        RecyclerView recyclerView = m1Var.h;
        if (recyclerView.J0) {
            recyclerView.removeCallbacks(m1Var);
            m1Var.c.abortAnimation();
        }
        w0 w0Var = this.x;
        if (w0Var == null || (j1Var = w0Var.e) == null) {
            return;
        }
        j1Var.h();
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

    public final void D(k1 k1Var) {
        if (getScrollState() != 2) {
            k1Var.getClass();
            return;
        }
        OverScroller overScroller = this.m0.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        k1Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View E(float f9, float f10) {
        for (int p10 = this.e.p() - 1; p10 >= 0; p10--) {
            View o10 = this.e.o(p10);
            float translationX = o10.getTranslationX();
            float translationY = o10.getTranslationY();
            if (f9 >= o10.getLeft() + translationX && f9 <= o10.getRight() + translationX && f10 >= o10.getTop() + translationY && f10 <= o10.getBottom() + translationY) {
                return o10;
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

    public final n1 G(View view) {
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
        for (int i10 = 0; i10 < size; i10++) {
            z0 z0Var = (z0) arrayList.get(i10);
            if (z0Var.b(this, motionEvent) && action != 3) {
                this.B = z0Var;
                return true;
            }
        }
        return false;
    }

    public final void I(int[] iArr) {
        int p10 = this.e.p();
        if (p10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i11 = TLObject.FLAG_31;
        for (int i12 = 0; i12 < p10; i12++) {
            n1 U = U(this.e.o(i12));
            if (U != null && !U.r()) {
                int c3 = U.c();
                if (c3 < i10) {
                    i10 = c3;
                }
                if (c3 > i11) {
                    i11 = c3;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public final n1 K(int i10) {
        n1 n1Var = null;
        if (this.M) {
            return null;
        }
        int u10 = this.e.u();
        for (int i11 = 0; i11 < u10; i11++) {
            n1 U = U(this.e.t(i11));
            if (U != null && !U.j() && N(U) == i10) {
                if (!((ArrayList) this.e.d).contains(U.a)) {
                    return U;
                }
                n1Var = U;
            }
        }
        return n1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n1 L(int i10, boolean z10) {
        int u10 = this.e.u();
        n1 n1Var = null;
        for (int i11 = 0; i11 < u10; i11++) {
            n1 U = U(this.e.t(i11));
            if (U != null && !U.j()) {
                if (z10) {
                    if (U.c != i10) {
                        continue;
                    }
                    if (((ArrayList) this.e.d).contains(U.a)) {
                        return U;
                    }
                    n1Var = U;
                } else {
                    if (U.c() != i10) {
                        continue;
                    }
                    if (((ArrayList) this.e.d).contains(U.a)) {
                    }
                }
            }
        }
        return n1Var;
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

    public final int N(n1 n1Var) {
        if (n1Var.e(524) || !n1Var.g()) {
            return -1;
        }
        int i10 = n1Var.c;
        ArrayList arrayList = (ArrayList) this.d.d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            f2.a aVar = (f2.a) arrayList.get(i11);
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
        d1 d1Var = this.b;
        if (i10 >= ((ArrayList) d1Var.c).size()) {
            return null;
        }
        return ((n1) ((ArrayList) d1Var.c).get(i10)).a;
    }

    public final View P(int i10) {
        if (i10 < 0) {
            return null;
        }
        d1 d1Var = this.b;
        if (i10 >= ((ArrayList) d1Var.e).size()) {
            return null;
        }
        return ((n1) ((ArrayList) d1Var.e).get(i10)).a;
    }

    public final long Q(n1 n1Var) {
        return this.w.b ? n1Var.e : n1Var.c;
    }

    public final n1 T(View view) {
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
        x0 x0Var = (x0) view.getLayoutParams();
        boolean z10 = x0Var.c;
        Rect rect = x0Var.b;
        if (z10) {
            k1 k1Var = this.p0;
            if (!k1Var.g || (!x0Var.a.m() && !x0Var.a.h())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.y;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Rect rect2 = this.r;
                    rect2.set(0, 0, 0, 0);
                    ((v0) arrayList.get(i10)).a(rect2, view, this, k1Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                x0Var.c = false;
                return rect;
            }
        }
        return rect;
    }

    public final v0 X(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 < 0 || i10 >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(com.google.android.recaptcha.internal.a.k(i10, " is an invalid index for size ", itemDecorationCount));
        }
        return (v0) this.y.get(i10);
    }

    public final void Y(long j10, n1 n1Var, n1 n1Var2) {
        int p10 = this.e.p();
        for (int i10 = 0; i10 < p10; i10++) {
            n1 U = U(this.e.o(i10));
            if (U != n1Var && Q(U) == j10) {
                p0 p0Var = this.w;
                if (p0Var == null || !p0Var.b) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + U + " \n View Holder 2:" + n1Var + C());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + U + " \n View Holder 2:" + n1Var + C());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + n1Var2 + " cannot be found but it is necessary for " + n1Var + C());
    }

    public final boolean Z() {
        return !this.E || this.M || this.d.h();
    }

    public final void a0() {
        if (this.y.size() == 0) {
            return;
        }
        w0 w0Var = this.x;
        if (w0Var != null) {
            w0Var.b("Cannot invalidate item decorations during a scroll or layout");
        }
        d0();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        w0 w0Var = this.x;
        if (w0Var != null) {
            w0Var.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final boolean b0() {
        return this.O > 0;
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
        return (layoutParams instanceof x0) && this.x.f((x0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        w0 w0Var = this.x;
        if (w0Var == null || !w0Var.d()) {
            return 0;
        }
        return ((j0) this.x).B0(this.p0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        w0 w0Var = this.x;
        if (w0Var != null && w0Var.d()) {
            return this.x.h(this.p0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        w0 w0Var = this.x;
        if (w0Var != null && w0Var.d()) {
            return this.x.i(this.p0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        w0 w0Var = this.x;
        if (w0Var != null && w0Var.e()) {
            return this.x.j(this.p0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        w0 w0Var = this.x;
        if (w0Var != null && w0Var.e()) {
            return this.x.k(this.p0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        w0 w0Var = this.x;
        if (w0Var != null && w0Var.e()) {
            return this.x.l(this.p0);
        }
        return 0;
    }

    public final void d0() {
        int u10 = this.e.u();
        for (int i10 = 0; i10 < u10; i10++) {
            ((x0) this.e.t(i10).getLayoutParams()).c = true;
        }
        ArrayList arrayList = (ArrayList) this.b.e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            x0 x0Var = (x0) ((n1) arrayList.get(i11)).a.getLayoutParams();
            if (x0Var != null) {
                x0Var.c = true;
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f9, float f10, boolean z10) {
        return getScrollingChildHelper().a(f9, f10, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f9, float f10) {
        return getScrollingChildHelper().b(f9, f10);
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
            ((v0) arrayList.get(i10)).c(canvas, this);
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
            WeakHashMap weakHashMap = r0.j0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int u10 = this.e.u();
        for (int i13 = 0; i13 < u10; i13++) {
            n1 U = U(this.e.t(i13));
            if (U != null && !U.r()) {
                int i14 = U.c;
                k1 k1Var = this.p0;
                if (i14 >= i12) {
                    U.n(-i11, z10);
                    k1Var.f = true;
                } else if (i14 >= i10) {
                    U.a(8);
                    U.n(-i11, z10);
                    U.c = i10 - 1;
                    k1Var.f = true;
                }
            }
        }
        d1 d1Var = this.b;
        ArrayList arrayList = (ArrayList) d1Var.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            n1 n1Var = (n1) arrayList.get(size);
            if (n1Var != null) {
                int i15 = n1Var.c;
                if (i15 >= i12) {
                    n1Var.n(-i11, z10);
                } else if (i15 >= i10) {
                    n1Var.a(8);
                    d1Var.f(size);
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
        char c3;
        boolean z10;
        this.x.getClass();
        boolean z11 = true;
        boolean z12 = (this.w == null || this.x == null || b0() || this.H) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        k1 k1Var = this.p0;
        d1 d1Var = this.b;
        if (z12 && (i10 == 2 || i10 == 1)) {
            if (this.x.e()) {
                if (focusFinder.findNextFocus(this, view, i10 == 2 ? 130 : 33) == null) {
                    z10 = true;
                    if (!z10 && this.x.d()) {
                        RecyclerView recyclerView = this.x.b;
                        WeakHashMap weakHashMap = r0.j0.a;
                        z10 = focusFinder.findNextFocus(this, view, !((recyclerView.getLayoutDirection() != 1) ^ (i10 != 2)) ? 66 : 17) != null;
                    }
                    if (z10) {
                        p();
                        if (F(view) != null) {
                            y0();
                            this.x.R(view, i10, d1Var, k1Var);
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
                            WeakHashMap weakHashMap2 = r0.j0.a;
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
                            c3 = 1;
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
                WeakHashMap weakHashMap3 = r0.j0.a;
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
                    view2 = this.x.R(view, i10, d1Var, k1Var);
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
                    WeakHashMap weakHashMap22 = r0.j0.a;
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
                        c3 = 1;
                    } else {
                        int i19 = rect3.bottom;
                        int i20 = rect22.bottom;
                        c3 = ((i19 > i20 || i14 >= i20) && i14 > i15) ? (char) 65535 : (char) 0;
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
                        } else if (c3 <= 0) {
                            if (c3 == 0) {
                            }
                        }
                    } else if (c3 >= 0) {
                        if (c3 == 0) {
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
        this.O++;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        w0 w0Var = this.x;
        if (w0Var != null) {
            return w0Var.n();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + C());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        w0 w0Var = this.x;
        if (w0Var != null) {
            return w0Var.o(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + C());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public p0 getAdapter() {
        return this.w;
    }

    public int getAttachedScrapChildCount() {
        return ((ArrayList) this.b.c).size();
    }

    @Override // android.view.View
    public int getBaseline() {
        w0 w0Var = this.x;
        if (w0Var == null) {
            return super.getBaseline();
        }
        w0Var.getClass();
        return -1;
    }

    public int getBottomGlowOffset() {
        return this.C0;
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

    public p1 getCompatAccessibilityDelegate() {
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

    public t0 getEdgeEffectFactory() {
        return this.Q;
    }

    public int getHiddenChildCount() {
        return ((ArrayList) this.e.d).size();
    }

    public u0 getItemAnimator() {
        return this.V;
    }

    public int getItemDecorationCount() {
        return this.y.size();
    }

    public w0 getLayoutManager() {
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

    public y0 getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.l0;
    }

    public c1 getRecycledViewPool() {
        return this.b.c();
    }

    public int getScrollState() {
        return this.W;
    }

    public int getTopGlowOffset() {
        return this.B0;
    }

    public final void h(n1 n1Var) {
        View view = n1Var.a;
        boolean z10 = view.getParent() == this;
        this.b.k(T(view));
        if (n1Var.l()) {
            this.e.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z10) {
            this.e.a(view, -1, true);
            return;
        }
        e eVar = this.e;
        int indexOfChild = ((RecyclerView) ((o1) eVar.b).b).indexOfChild(view);
        if (indexOfChild >= 0) {
            ((f2.c) eVar.c).J(indexOfChild);
            eVar.y(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void h0(boolean z10) {
        int i10;
        AccessibilityManager accessibilityManager;
        int i11 = this.O - 1;
        this.O = i11;
        if (i11 < 1) {
            this.O = 0;
            if (z10) {
                int i12 = this.J;
                this.J = 0;
                if (i12 != 0 && (accessibilityManager = this.K) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i12);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.F0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    n1 n1Var = (n1) arrayList.get(size);
                    if (n1Var.a.getParent() == this && !n1Var.r() && (i10 = n1Var.s) != -1) {
                        View view = n1Var.a;
                        WeakHashMap weakHashMap = r0.j0.a;
                        view.setImportantForAccessibility(i10);
                        n1Var.s = -1;
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

    public final void i(v0 v0Var) {
        w0 w0Var = this.x;
        if (w0Var != null) {
            w0Var.b("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.y;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(v0Var);
        d0();
        requestLayout();
    }

    public final void i0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.a0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.a0 = motionEvent.getPointerId(i10);
            int x4 = (int) (motionEvent.getX(i10) + 0.5f);
            this.e0 = x4;
            this.c0 = x4;
            int y8 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f0 = y8;
            this.d0 = y8;
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

    public final void j(a1 a1Var) {
        if (this.r0 == null) {
            this.r0 = new ArrayList();
        }
        this.r0.add(a1Var);
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
        WeakHashMap weakHashMap = r0.j0.a;
        postOnAnimation(this.G0);
        this.v0 = true;
    }

    public final void m0(boolean z10) {
        this.N = z10 | this.N;
        this.M = true;
        int u10 = this.e.u();
        for (int i10 = 0; i10 < u10; i10++) {
            n1 U = U(this.e.t(i10));
            if (U != null && !U.r()) {
                U.a(6);
            }
        }
        d0();
        d1 d1Var = this.b;
        ArrayList arrayList = (ArrayList) d1Var.e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            n1 n1Var = (n1) arrayList.get(i11);
            if (n1Var != null) {
                n1Var.a(6);
                n1Var.a(1024);
            }
        }
        p0 p0Var = ((RecyclerView) d1Var.h).w;
        if (p0Var == null || !p0Var.b) {
            d1Var.e();
        }
    }

    public final void n() {
        int u10 = this.e.u();
        for (int i10 = 0; i10 < u10; i10++) {
            n1 U = U(this.e.t(i10));
            if (U != null && !U.r()) {
                U.d = -1;
                U.g = -1;
            }
        }
        d1 d1Var = this.b;
        ArrayList arrayList = (ArrayList) d1Var.c;
        ArrayList arrayList2 = (ArrayList) d1Var.e;
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            n1 n1Var = (n1) arrayList2.get(i11);
            n1Var.d = -1;
            n1Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            n1 n1Var2 = (n1) arrayList.get(i12);
            n1Var2.d = -1;
            n1Var2.g = -1;
        }
        ArrayList arrayList3 = (ArrayList) d1Var.d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                n1 n1Var3 = (n1) ((ArrayList) d1Var.d).get(i13);
                n1Var3.d = -1;
                n1Var3.g = -1;
            }
        }
    }

    public final void n0(n1 n1Var, a5.e eVar) {
        n1Var.p(0, 8192);
        boolean z10 = this.p0.h;
        b bVar = this.f;
        if (z10 && n1Var.m() && !n1Var.j() && !n1Var.r()) {
            ((h) bVar.b).k(n1Var, Q(n1Var));
        }
        f fVar = (f) bVar.a;
        t1 t1Var = (t1) fVar.get(n1Var);
        if (t1Var == null) {
            t1Var = t1.a();
            fVar.put(n1Var, t1Var);
        }
        t1Var.b = eVar;
        t1Var.a |= 4;
    }

    public final void o(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.R;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.R.onRelease();
            z10 = this.R.isFinished();
        }
        EdgeEffect edgeEffect2 = this.T;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.T.onRelease();
            z10 |= this.T.isFinished();
        }
        EdgeEffect edgeEffect3 = this.S;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.S.onRelease();
            z10 |= this.S.isFinished();
        }
        EdgeEffect edgeEffect4 = this.U;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.U.onRelease();
            z10 |= this.U.isFinished();
        }
        if (z10) {
            WeakHashMap weakHashMap = r0.j0.a;
            postInvalidateOnAnimation();
        }
    }

    public final void o0() {
        u0 u0Var = this.V;
        if (u0Var != null) {
            u0Var.g();
        }
        w0 w0Var = this.x;
        d1 d1Var = this.b;
        if (w0Var != null) {
            w0Var.g0(d1Var);
            this.x.h0(d1Var);
        }
        ((ArrayList) d1Var.c).clear();
        d1Var.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        float f9;
        super.onAttachedToWindow();
        this.O = 0;
        this.C = true;
        this.E = this.E && !isLayoutRequested();
        w0 w0Var = this.x;
        if (w0Var != null) {
            w0Var.getClass();
        }
        this.v0 = false;
        if (O0) {
            ThreadLocal threadLocal = s.e;
            s sVar = (s) threadLocal.get();
            this.n0 = sVar;
            if (sVar == null) {
                s sVar2 = new s();
                sVar2.a = new ArrayList();
                sVar2.d = new ArrayList();
                this.n0 = sVar2;
                WeakHashMap weakHashMap = r0.j0.a;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    f9 = display.getRefreshRate();
                }
                f9 = 60.0f;
                s sVar3 = this.n0;
                sVar3.c = (long) (1.0E9f / f9);
                threadLocal.set(sVar3);
            }
            this.n0.a.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        s sVar;
        super.onDetachedFromWindow();
        u0 u0Var = this.V;
        if (u0Var != null) {
            u0Var.g();
        }
        B0();
        this.C = false;
        this.F0.clear();
        removeCallbacks(this.G0);
        this.f.getClass();
        while (t1.d.b() != null) {
        }
        if (!O0 || (sVar = this.n0) == null) {
            return;
        }
        sVar.a.remove(this);
        this.n0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((v0) arrayList.get(i10)).b(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f9;
        float f10;
        if (this.x != null && !this.H && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f9 = this.x.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.x.d()) {
                    f10 = motionEvent.getAxisValue(10);
                    if (f9 == 0.0f || f10 != 0.0f) {
                        s0((int) (f10 * this.j0), (int) (f9 * this.k0), motionEvent);
                    }
                }
                f10 = 0.0f;
                if (f9 == 0.0f) {
                }
                s0((int) (f10 * this.j0), (int) (f9 * this.k0), motionEvent);
            } else {
                if ((motionEvent.getSource() & TLObject.FLAG_22) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.x.e()) {
                        f9 = -axisValue;
                        f10 = 0.0f;
                        if (f9 == 0.0f) {
                        }
                        s0((int) (f10 * this.j0), (int) (f9 * this.k0), motionEvent);
                    } else if (this.x.d()) {
                        f10 = axisValue;
                        f9 = 0.0f;
                        if (f9 == 0.0f) {
                        }
                        s0((int) (f10 * this.j0), (int) (f9 * this.k0), motionEvent);
                    }
                }
                f9 = 0.0f;
                f10 = 0.0f;
                if (f9 == 0.0f) {
                }
                s0((int) (f10 * this.j0), (int) (f9 * this.k0), motionEvent);
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
            w0 w0Var = this.x;
            if (w0Var != null) {
                boolean d = w0Var.d();
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
                    int x4 = (int) (motionEvent.getX() + 0.5f);
                    this.e0 = x4;
                    this.c0 = x4;
                    int y8 = (int) (motionEvent.getY() + 0.5f);
                    this.f0 = y8;
                    this.d0 = y8;
                    if (this.W == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        A0(1);
                    }
                    int[] iArr = this.A0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i10 = d;
                    if (e10) {
                        i10 = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i10, 0);
                } else if (actionMasked == 1) {
                    this.b0.clear();
                    A0(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.a0);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.a0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x10 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y10 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.W != 1) {
                        int i11 = x10 - this.c0;
                        int i12 = y10 - this.d0;
                        if (d == 0 || Math.abs(i11) <= this.g0) {
                            z10 = false;
                        } else {
                            this.e0 = x10;
                            z10 = true;
                        }
                        if (e10 && Math.abs(i12) > this.g0) {
                            this.f0 = y10;
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
                    int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.e0 = x11;
                    this.c0 = x11;
                    int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f0 = y11;
                    this.d0 = y11;
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = g.a;
        Trace.beginSection("RV OnLayout");
        s();
        Trace.endSection();
        this.E = true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.x == null) {
            q(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        w0 w0Var = this.x;
        d1 d1Var = this.b;
        k1 k1Var = this.p0;
        w0Var.d0(d1Var, k1Var, i10, i11);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.w == null) {
            return;
        }
        if (k1Var.d == 1) {
            t();
        }
        this.x.q0(i10, i11);
        k1Var.i = true;
        u();
        this.x.s0(i10, i11);
        j0 j0Var = (j0) this.x;
        if (j0Var.l == 1073741824 || j0Var.k == 1073741824) {
            return;
        }
        int r6 = j0Var.r();
        for (int i12 = 0; i12 < r6; i12++) {
            ViewGroup.LayoutParams layoutParams = j0Var.q(i12).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                this.x.q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                k1Var.i = true;
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
        if (!(parcelable instanceof h1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h1 h1Var = (h1) parcelable;
        this.c = h1Var;
        super.onRestoreInstanceState(h1Var.a);
        w0 w0Var = this.x;
        if (w0Var == null || (parcelable2 = this.c.c) == null) {
            return;
        }
        j0 j0Var = (j0) w0Var;
        if (parcelable2 instanceof i0) {
            j0Var.B = (i0) parcelable2;
            j0Var.l0();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        h1 h1Var = new h1(super.onSaveInstanceState());
        h1 h1Var2 = this.c;
        if (h1Var2 != null) {
            h1Var.c = h1Var2.c;
            return h1Var;
        }
        w0 w0Var = this.x;
        if (w0Var != null) {
            h1Var.c = w0Var.e0();
            return h1Var;
        }
        h1Var.c = null;
        return h1Var;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
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
            z0 z0Var = this.B;
            if (z0Var == null) {
                z10 = motionEvent.getAction() == 0 ? false : H(motionEvent);
            } else {
                z0Var.a(this, motionEvent);
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
            w0 w0Var = this.x;
            if (w0Var != null) {
                boolean d = w0Var.d();
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
                    int x4 = (int) (motionEvent.getX() + 0.5f);
                    this.e0 = x4;
                    this.c0 = x4;
                    int y8 = (int) (motionEvent.getY() + 0.5f);
                    this.f0 = y8;
                    this.d0 = y8;
                    int i10 = d;
                    if (e10) {
                        i10 = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i10, 0);
                } else {
                    if (actionMasked == 1) {
                        this.b0.addMovement(obtain);
                        VelocityTracker velocityTracker = this.b0;
                        int i11 = this.i0;
                        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, i11);
                        float f9 = d != 0 ? -this.b0.getXVelocity(this.a0) : 0.0f;
                        float f10 = e10 ? -this.b0.getYVelocity(this.a0) : 0.0f;
                        if (f9 != 0.0f || f10 != 0.0f) {
                            int i12 = (int) f9;
                            int i13 = (int) f10;
                            w0 w0Var2 = this.x;
                            if (w0Var2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.H) {
                                boolean d10 = w0Var2.d();
                                boolean e11 = this.x.e();
                                int i14 = this.h0;
                                if (d10 == 0 || Math.abs(i12) < i14) {
                                    i12 = 0;
                                }
                                if (!e11 || Math.abs(i13) < i14) {
                                    i13 = 0;
                                }
                                if (i12 != 0 || i13 != 0) {
                                    float f11 = i12;
                                    float f12 = i13;
                                    if (!dispatchNestedPreFling(f11, f12)) {
                                        boolean z12 = d10 != 0 || e11;
                                        dispatchNestedFling(f11, f12, z12);
                                        int i15 = d10;
                                        if (z12) {
                                            if (e11) {
                                                i15 = (d10 ? 1 : 0) | 2;
                                            }
                                            getScrollingChildHelper().g(i15, 1);
                                            int i16 = -i11;
                                            int max = Math.max(i16, Math.min(i12, i11));
                                            int max2 = Math.max(i16, Math.min(i13, i11));
                                            m1 m1Var = this.m0;
                                            RecyclerView recyclerView = m1Var.h;
                                            recyclerView.setScrollState(2);
                                            m1Var.b = 0;
                                            m1Var.a = 0;
                                            Interpolator interpolator = m1Var.d;
                                            a0 a0Var = P0;
                                            if (interpolator != a0Var) {
                                                m1Var.d = a0Var;
                                                m1Var.c = new OverScroller(recyclerView.getContext(), a0Var);
                                            }
                                            m1Var.c.fling(0, 0, max, max2, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                            m1Var.a();
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
                        int x10 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y10 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i17 = this.e0 - x10;
                        int i18 = this.f0 - y10;
                        int[] iArr2 = this.E0;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        boolean v = v(i17, i18, 0, iArr2, this.z0);
                        int[] iArr3 = this.z0;
                        if (v) {
                            i17 -= iArr2[0];
                            i18 -= iArr2[1];
                            obtain.offsetLocation(iArr3[0], iArr3[1]);
                            iArr[0] = iArr[0] + iArr3[0];
                            iArr[1] = iArr[1] + iArr3[1];
                        }
                        if (this.W != 1) {
                            if (d != 0) {
                                int abs = Math.abs(i17);
                                int i19 = this.g0;
                                if (abs > i19) {
                                    i17 = i17 > 0 ? i17 - i19 : i17 + i19;
                                    z11 = true;
                                    if (e10) {
                                        int abs2 = Math.abs(i18);
                                        int i20 = this.g0;
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
                            if (e10) {
                            }
                            if (z11) {
                            }
                        }
                        if (this.W == 1) {
                            this.e0 = x10 - iArr3[0];
                            this.f0 = y10 - iArr3[1];
                            if (s0(d != 0 ? i17 : 0, e10 ? i18 : 0, obtain)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            s sVar = this.n0;
                            if (sVar != null && (i17 != 0 || i18 != 0)) {
                                sVar.a(this, i17, i18);
                            }
                        }
                    } else if (actionMasked == 3) {
                        r0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.a0 = motionEvent.getPointerId(actionIndex);
                        int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.e0 = x11;
                        this.c0 = x11;
                        int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f0 = y11;
                        this.d0 = y11;
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
            if (!this.G) {
                e eVar = this.e;
                int p10 = eVar.p();
                int i14 = 0;
                while (true) {
                    if (i14 < p10) {
                        n1 U = U(eVar.o(i14));
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

    public final void p0(v0 v0Var) {
        w0 w0Var = this.x;
        if (w0Var != null) {
            w0Var.b("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.y;
        arrayList.remove(v0Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        d0();
        requestLayout();
    }

    public final void q(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = r0.j0.a;
        setMeasuredDimension(w0.g(i10, paddingRight, getMinimumWidth()), w0.g(i11, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void q0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.r;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof x0) {
            x0 x0Var = (x0) layoutParams;
            if (!x0Var.c) {
                Rect rect2 = x0Var.b;
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
        n1 U = U(view);
        p0 p0Var = this.w;
        if (p0Var != null && U != null) {
            p0Var.z(U);
        }
        ArrayList arrayList = this.L;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                e0 e0Var = (e0) this.L.get(size);
                e0Var.o(view);
                n1 T = e0Var.D.T(view);
                if (T != null) {
                    n1 n1Var = e0Var.c;
                    if (n1Var == null || T != n1Var) {
                        e0Var.j(T, false);
                        if (e0Var.a.remove(T.a)) {
                            e0Var.x.a(e0Var.D, T);
                        }
                    } else {
                        e0Var.p(null, 0);
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
            WeakHashMap weakHashMap = r0.j0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        n1 U = U(view);
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
        j1 j1Var = this.x.e;
        if ((j1Var == null || !j1Var.e) && !b0() && view2 != null) {
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
        for (int i10 = 0; i10 < size; i10++) {
            ((z0) arrayList.get(i10)).c(z10);
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

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0369, code lost:
    
        if (((java.util.ArrayList) r20.e.d).contains(getFocusedChild()) == false) goto L240;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0416  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        t1 t1Var;
        int i10;
        boolean r6;
        int i11;
        int i12;
        int i13;
        int i14;
        n1 n1Var;
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
        k1 k1Var = this.p0;
        boolean z11 = false;
        k1Var.i = false;
        int i15 = 1;
        if (k1Var.d == 1) {
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
        k1Var.a(4);
        y0();
        g0();
        k1Var.d = 1;
        boolean z12 = k1Var.j;
        d1 d1Var = this.b;
        b bVar = this.f;
        if (z12) {
            try {
                int p10 = this.e.p() - 1;
                while (p10 >= 0) {
                    n1 U = U(this.e.o(p10));
                    if (U != null && !U.r()) {
                        long Q = Q(U);
                        this.V.getClass();
                        a5.e eVar = new a5.e();
                        View view = U.a;
                        eVar.a = view.getLeft();
                        eVar.b = view.getTop();
                        view.getRight();
                        view.getBottom();
                        h hVar = (h) bVar.b;
                        f fVar = (f) bVar.a;
                        n1 n1Var2 = (n1) hVar.f(Q);
                        if (n1Var2 == null || n1Var2.r()) {
                            bVar.k(U, eVar);
                        } else {
                            t1 t1Var2 = (t1) fVar.get(n1Var2);
                            boolean z13 = (t1Var2 == null || (t1Var2.a & i15) == 0) ? false : true;
                            t1 t1Var3 = (t1) fVar.get(U);
                            boolean z14 = (t1Var3 == null || (t1Var3.a & i15) == 0) ? false : true;
                            if (z13 && n1Var2 == U) {
                                bVar.k(U, eVar);
                            } else {
                                try {
                                    a5.e Q2 = bVar.Q(n1Var2, 4);
                                    bVar.k(U, eVar);
                                    a5.e Q3 = bVar.Q(U, 8);
                                    if (Q2 == null) {
                                        Y(Q, U, n1Var2);
                                    } else {
                                        n1Var2.q(false);
                                        if (z13) {
                                            h(n1Var2);
                                        }
                                        if (n1Var2 != U) {
                                            if (z14) {
                                                h(U);
                                            }
                                            n1Var2.j = U;
                                            h(n1Var2);
                                            d1Var.k(n1Var2);
                                            U.q(false);
                                            U.k = n1Var2;
                                        }
                                        q1 q1Var = (q1) this.V;
                                        q1Var.getClass();
                                        int i16 = Q2.a;
                                        int i17 = Q2.b;
                                        if (U.r()) {
                                            i13 = Q2.a;
                                            i14 = Q2.b;
                                        } else {
                                            i13 = Q3.a;
                                            i14 = Q3.b;
                                        }
                                        if (q1Var.q(n1Var2, U, Q2, i16, i17, i13, i14)) {
                                            l0();
                                        }
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    StringBuilder sb2 = new StringBuilder();
                                    for (int p11 = this.e.p() - 1; p11 >= 0; p11--) {
                                        n1 U2 = U(this.e.o(p11));
                                        if (U2 != null && !U2.r()) {
                                            sb2.append("Holder at" + p11 + " " + U2 + "\n");
                                        }
                                    }
                                    throw new RuntimeException(sb2.toString(), e);
                                }
                            }
                        }
                        p10--;
                        i15 = 1;
                    }
                    p10--;
                    i15 = 1;
                }
                f fVar2 = (f) bVar.a;
                int i18 = fVar2.c - 1;
                while (i18 >= 0) {
                    n1 n1Var3 = (n1) fVar2.e(i18);
                    try {
                        t1Var = (t1) fVar2.f(i18);
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        t1Var = null;
                    }
                    if (t1Var != null) {
                        int i19 = t1Var.a;
                        int i20 = i19 & 3;
                        o0 o0Var = this.H0;
                        if (i20 == 3) {
                            o0Var.b(n1Var3);
                        } else if ((i19 & 1) != 0) {
                            a5.e eVar2 = t1Var.b;
                            if (eVar2 == null) {
                                o0Var.b(n1Var3);
                            } else {
                                o0Var.a(n1Var3, eVar2, t1Var.c);
                            }
                        } else if ((i19 & 14) == 14) {
                            a5.e eVar3 = t1Var.b;
                            a5.e eVar4 = t1Var.c;
                            RecyclerView recyclerView = o0Var.a;
                            n1Var3.q(z11);
                            if (recyclerView.V.a(n1Var3, eVar3, eVar4)) {
                                recyclerView.l0();
                            }
                        } else if ((i19 & 12) == 12) {
                            a5.e eVar5 = t1Var.b;
                            a5.e eVar6 = t1Var.c;
                            o0Var.getClass();
                            n1Var3.q(z11);
                            RecyclerView recyclerView2 = o0Var.a;
                            if (recyclerView2.M) {
                                q1 q1Var2 = (q1) recyclerView2.V;
                                q1Var2.getClass();
                                int i21 = eVar5.a;
                                int i22 = eVar5.b;
                                if (n1Var3.r()) {
                                    i12 = eVar5.a;
                                    i11 = eVar5.b;
                                } else {
                                    int i23 = eVar6.a;
                                    i11 = eVar6.b;
                                    i12 = i23;
                                }
                                if (q1Var2.q(n1Var3, n1Var3, eVar5, i21, i22, i12, i11)) {
                                    recyclerView2.l0();
                                }
                            } else {
                                q1 q1Var3 = (q1) recyclerView2.V;
                                q1Var3.getClass();
                                int i24 = eVar5.a;
                                int i25 = eVar6.a;
                                if (i24 == i25 && eVar5.b == eVar6.b) {
                                    q1Var3.v(n1Var3);
                                    r6 = false;
                                } else {
                                    r6 = q1Var3.r(n1Var3, eVar5, i24, eVar5.b, i25, eVar6.b);
                                }
                                if (r6) {
                                    recyclerView2.l0();
                                }
                            }
                        } else if ((i19 & 4) != 0) {
                            o0Var.a(n1Var3, t1Var.b, null);
                        } else if ((i19 & 8) != 0) {
                            a5.e eVar7 = t1Var.b;
                            a5.e eVar8 = t1Var.c;
                            RecyclerView recyclerView3 = o0Var.a;
                            i10 = 0;
                            n1Var3.q(false);
                            if (recyclerView3.V.a(n1Var3, eVar7, eVar8)) {
                                recyclerView3.l0();
                            }
                            t1Var.a = i10;
                            t1Var.b = null;
                            t1Var.c = null;
                            t1.d.h(t1Var);
                        }
                        i10 = 0;
                        t1Var.a = i10;
                        t1Var.b = null;
                        t1Var.c = null;
                        t1.d.h(t1Var);
                    }
                    i18--;
                    z11 = false;
                }
            } catch (Exception e12) {
                e = e12;
            }
        }
        View view2 = null;
        this.x.h0(d1Var);
        k1Var.b = k1Var.e;
        this.M = false;
        this.N = false;
        k1Var.j = false;
        k1Var.k = false;
        this.x.f = false;
        ArrayList arrayList = (ArrayList) d1Var.d;
        if (arrayList != null) {
            arrayList.clear();
        }
        w0 w0Var = this.x;
        if (w0Var.j) {
            w0Var.i = 0;
            w0Var.j = false;
            d1Var.l();
        }
        this.x.c0(k1Var);
        h0(true);
        z0(false);
        ((f) bVar.a).clear();
        ((h) bVar.b).b();
        int[] iArr = this.x0;
        int i26 = iArr[0];
        int i27 = iArr[1];
        I(iArr);
        if ((iArr[0] == i26 && iArr[1] == i27) ? false : true) {
            x(0, 0);
        }
        if (this.l0 && this.w != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j10 = k1Var.m;
            if (j10 != -1 && (z10 = this.w.b) && z10) {
                int u10 = this.e.u();
                n1Var = null;
                int i28 = 0;
                while (true) {
                    if (i28 >= u10) {
                        break;
                    }
                    n1 U3 = U(this.e.t(i28));
                    if (U3 != null && !U3.j() && U3.e == j10) {
                        if (!((ArrayList) this.e.d).contains(U3.a)) {
                            n1Var = U3;
                            break;
                        }
                        n1Var = U3;
                    }
                    i28++;
                }
            } else {
                n1Var = null;
            }
            if (n1Var != null) {
                View view3 = n1Var.a;
                if (!((ArrayList) this.e.d).contains(view3) && view3.hasFocusable()) {
                    view2 = view3;
                    if (view2 != null) {
                        int i29 = k1Var.n;
                        if (i29 != -1 && (findViewById = view2.findViewById(i29)) != null && findViewById.isFocusable()) {
                            view2 = findViewById;
                        }
                        view2.requestFocus();
                    }
                }
            }
            if (this.e.p() > 0) {
                int i30 = k1Var.l;
                if (i30 == -1) {
                    i30 = 0;
                }
                int b10 = k1Var.b();
                for (int i31 = i30; i31 < b10; i31++) {
                    n1 K = K(i31);
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
                    n1 K2 = K(min);
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
        k1Var.m = -1L;
        k1Var.l = -1;
        k1Var.n = -1;
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
        p0 p0Var = this.w;
        int[] iArr = this.E0;
        if (p0Var != null) {
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
        w(i12, i13, i14, i15, this.z0, 0, iArr);
        int i16 = i14 - iArr[0];
        int i17 = i15 - iArr[1];
        int i18 = this.e0;
        int[] iArr2 = this.z0;
        int i19 = iArr2[0];
        this.e0 = i18 - i19;
        int i20 = this.f0;
        int i21 = iArr2[1];
        this.f0 = i20 - i21;
        if (motionEvent != null) {
            motionEvent.offsetLocation(i19, i21);
        }
        int[] iArr3 = this.A0;
        iArr3[0] = iArr3[0] + iArr2[0];
        iArr3[1] = iArr3[1] + iArr2[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x4 = motionEvent.getX();
                float f9 = i16;
                float y8 = motionEvent.getY();
                float f10 = i17;
                if (f9 < 0.0f) {
                    z();
                    u0.b.a(this.R, (-f9) / getWidth(), 1.0f - (y8 / getHeight()));
                } else if (f9 > 0.0f) {
                    A();
                    u0.b.a(this.T, f9 / getWidth(), y8 / getHeight());
                } else {
                    z10 = false;
                    if (f10 >= 0.0f) {
                        B();
                        u0.b.a(this.S, (-f10) / getHeight(), x4 / getWidth());
                    } else {
                        if (f10 > 0.0f) {
                            y();
                            u0.b.a(this.U, f10 / getHeight(), 1.0f - (x4 / getWidth()));
                        }
                        if (!z10 || f9 != 0.0f || f10 != 0.0f) {
                            WeakHashMap weakHashMap = r0.j0.a;
                            postInvalidateOnAnimation();
                        }
                    }
                    z10 = true;
                    if (!z10) {
                    }
                    WeakHashMap weakHashMap2 = r0.j0.a;
                    postInvalidateOnAnimation();
                }
                z10 = true;
                if (f10 >= 0.0f) {
                }
                z10 = true;
                if (!z10) {
                }
                WeakHashMap weakHashMap22 = r0.j0.a;
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
        w0 w0Var = this.x;
        if (w0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.H) {
            return;
        }
        boolean d = w0Var.d();
        boolean e10 = this.x.e();
        if (d || e10) {
            if (!d) {
                i10 = 0;
            }
            if (!e10) {
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
            this.J |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(p1 p1Var) {
        this.w0 = p1Var;
        r0.j0.k(this, p1Var);
    }

    public void setAdapter(p0 p0Var) {
        setLayoutFrozen(false);
        p0 p0Var2 = this.w;
        f1 f1Var = this.a;
        if (p0Var2 != null) {
            p0Var2.a.unregisterObserver(f1Var);
            this.w.getClass();
        }
        o0();
        a aVar = this.d;
        aVar.m((ArrayList) aVar.d);
        aVar.m((ArrayList) aVar.e);
        aVar.b = 0;
        p0 p0Var3 = this.w;
        this.w = p0Var;
        if (p0Var != null) {
            p0Var.B(f1Var);
        }
        w0 w0Var = this.x;
        if (w0Var != null) {
            w0Var.Q();
        }
        this.b.d(p0Var3, this.w);
        this.p0.f = true;
        m0(false);
        requestLayout();
    }

    public void setAdditionalDebugInfo(String str) {
        this.I0 = str;
    }

    public void setBottomGlowOffset(int i10) {
        this.C0 = i10;
    }

    public void setChildDrawingOrderCallback(s0 s0Var) {
        if (s0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(s0Var != null);
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

    public void setEdgeEffectFactory(t0 t0Var) {
        t0Var.getClass();
        this.Q = t0Var;
        this.U = null;
        this.S = null;
        this.T = null;
        this.R = null;
    }

    public void setGlowColor(int i10) {
        this.D0 = Integer.valueOf(i10);
    }

    public void setHasFixedSize(boolean z10) {
        this.D = z10;
    }

    public void setItemAnimator(u0 u0Var) {
        u0 u0Var2 = this.V;
        if (u0Var2 != null) {
            u0Var2.g();
            this.V.a = null;
        }
        this.V = u0Var;
        if (u0Var != null) {
            u0Var.a = this.u0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        d1 d1Var = this.b;
        d1Var.a = i10;
        d1Var.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(w0 w0Var) {
        if (w0Var == this.x) {
            return;
        }
        B0();
        w0 w0Var2 = this.x;
        d1 d1Var = this.b;
        if (w0Var2 != null) {
            u0 u0Var = this.V;
            if (u0Var != null) {
                u0Var.g();
            }
            this.x.g0(d1Var);
            this.x.h0(d1Var);
            ((ArrayList) d1Var.c).clear();
            d1Var.e();
            if (this.C) {
                this.x.getClass();
            }
            this.x.t0(null);
            this.x = null;
        } else {
            ((ArrayList) d1Var.c).clear();
            d1Var.e();
        }
        this.e.z();
        this.x = w0Var;
        if (w0Var != null) {
            if (w0Var.b != null) {
                throw new IllegalArgumentException("LayoutManager " + w0Var + " is already attached to a RecyclerView:" + w0Var.b.C());
            }
            w0Var.t0(this);
            if (this.C) {
                this.x.getClass();
            }
        }
        d1Var.l();
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
            WeakHashMap weakHashMap = r0.j0.a;
            b0.k(viewGroup);
        }
        scrollingChildHelper.d = z10;
    }

    @Deprecated
    public void setOnScrollListener(a1 a1Var) {
        this.q0 = a1Var;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.l0 = z10;
    }

    public void setRecycledViewPool(c1 c1Var) {
        d1 d1Var = this.b;
        if (((c1) d1Var.g) != null) {
            r1.b--;
        }
        d1Var.g = c1Var;
        if (c1Var == null || ((RecyclerView) d1Var.h).getAdapter() == null) {
            return;
        }
        ((c1) d1Var.g).b++;
    }

    public void setScrollState(int i10) {
        j1 j1Var;
        if (i10 == this.W) {
            return;
        }
        this.W = i10;
        if (i10 != 2) {
            m1 m1Var = this.m0;
            RecyclerView recyclerView = m1Var.h;
            if (recyclerView.J0) {
                recyclerView.removeCallbacks(m1Var);
                m1Var.c.abortAnimation();
            }
            w0 w0Var = this.x;
            if (w0Var != null && (j1Var = w0Var.e) != null) {
                j1Var.h();
            }
        }
        w0 w0Var2 = this.x;
        if (w0Var2 != null) {
            w0Var2.f0();
        }
        j0(i10);
        a1 a1Var = this.q0;
        if (a1Var != null) {
            a1Var.a(this, i10);
        }
        ArrayList arrayList = this.r0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((a1) this.r0.get(size)).a(this, i10);
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.g0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.g0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setTopGlowOffset(int i10) {
        this.B0 = i10;
    }

    public void setViewCacheExtension(l1 l1Var) {
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
        t1 t1Var;
        View F;
        boolean z10;
        k1 k1Var = this.p0;
        k1Var.a(1);
        D(k1Var);
        k1Var.i = false;
        y0();
        b bVar = this.f;
        f fVar = (f) bVar.a;
        f fVar2 = (f) bVar.a;
        fVar.clear();
        h hVar = (h) bVar.b;
        hVar.b();
        g0();
        if (this.M) {
            a aVar = this.d;
            aVar.m((ArrayList) aVar.d);
            aVar.m((ArrayList) aVar.e);
            aVar.b = 0;
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
        k1Var.j = z12;
        k1Var.k = z12 && z11 && !this.M && this.V != null && this.x.y0();
        n1 n1Var = null;
        View focusedChild = (this.l0 && hasFocus() && this.w != null) ? getFocusedChild() : null;
        if (focusedChild != null && (F = F(focusedChild)) != null) {
            n1Var = T(F);
        }
        if (n1Var == null) {
            k1Var.m = -1L;
            k1Var.l = -1;
            k1Var.n = -1;
        } else {
            k1Var.m = this.w.b ? n1Var.e : -1L;
            k1Var.l = this.M ? -1 : n1Var.j() ? n1Var.d : n1Var.b();
            View view = n1Var.a;
            int id2 = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id2 = view.getId();
                }
            }
            k1Var.n = id2;
        }
        k1Var.h = k1Var.j && this.t0;
        this.t0 = false;
        this.s0 = false;
        k1Var.g = k1Var.k;
        k1Var.e = this.w.h();
        I(this.x0);
        if (k1Var.j) {
            int p10 = this.e.p();
            for (int i10 = 0; i10 < p10; i10++) {
                n1 U = U(this.e.o(i10));
                if (!U.r() && (!U.h() || this.w.b)) {
                    a5.e l10 = this.V.l(k1Var, U, u0.b(U), U.d());
                    t1 t1Var2 = (t1) fVar2.get(U);
                    if (t1Var2 == null) {
                        t1Var2 = t1.a();
                        fVar2.put(U, t1Var2);
                    }
                    t1Var2.b = l10;
                    t1Var2.a |= 4;
                    if (k1Var.h && U.m() && !U.j() && !U.r() && !U.h()) {
                        hVar.k(U, Q(U));
                    }
                }
            }
        }
        if (k1Var.k) {
            int u10 = this.e.u();
            for (int i11 = 0; i11 < u10; i11++) {
                n1 U2 = U(this.e.t(i11));
                if (!U2.r()) {
                    if (U2.d == -1) {
                        U2.d = U2.c;
                    }
                    U2.h = U2.c;
                }
            }
            boolean z13 = k1Var.f;
            k1Var.f = false;
            this.x.b0(this.b, k1Var);
            k1Var.f = z13;
            for (int i12 = 0; i12 < this.e.p(); i12++) {
                n1 U3 = U(this.e.o(i12));
                if (!U3.r() && ((t1Var = (t1) fVar2.get(U3)) == null || (t1Var.a & 4) == 0)) {
                    int b10 = u0.b(U3);
                    boolean e10 = U3.e(8192);
                    if (!e10) {
                        b10 |= 4096;
                    }
                    a5.e l11 = this.V.l(k1Var, U3, b10, U3.d());
                    if (e10) {
                        n0(U3, l11);
                    } else {
                        t1 t1Var3 = (t1) fVar2.get(U3);
                        if (t1Var3 == null) {
                            t1Var3 = t1.a();
                            fVar2.put(U3, t1Var3);
                        }
                        t1Var3.a |= 2;
                        t1Var3.b = l11;
                    }
                }
            }
            n();
        } else {
            n();
        }
        h0(true);
        z0(false);
        k1Var.d = 2;
    }

    public final void t0(int i10, int i11, int[] iArr) {
        n1 n1Var;
        y0();
        g0();
        int i12 = g.a;
        Trace.beginSection("RV Scroll");
        k1 k1Var = this.p0;
        D(k1Var);
        d1 d1Var = this.b;
        int m0 = i10 != 0 ? this.x.m0(i10, d1Var, k1Var) : 0;
        int o02 = i11 != 0 ? this.x.o0(i11, d1Var, k1Var) : 0;
        Trace.endSection();
        e eVar = this.e;
        int p10 = eVar.p();
        for (int i13 = 0; i13 < p10; i13++) {
            View o10 = eVar.o(i13);
            n1 T = T(o10);
            if (T != null && (n1Var = T.k) != null) {
                View view = n1Var.a;
                int left = o10.getLeft();
                int top = o10.getTop();
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
        k1 k1Var = this.p0;
        k1Var.a(6);
        this.d.d();
        k1Var.e = this.w.h();
        k1Var.c = 0;
        k1Var.g = false;
        this.x.b0(this.b, k1Var);
        k1Var.f = false;
        this.c = null;
        k1Var.j = k1Var.j && this.V != null;
        k1Var.d = 4;
        h0(true);
        z0(false);
    }

    public final void u0(int i10) {
        if (this.H) {
            return;
        }
        B0();
        w0 w0Var = this.x;
        if (w0Var == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            w0Var.n0(i10);
            awakenScrollBars();
        }
    }

    public boolean v(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, i12, iArr, iArr2);
    }

    public final void v0(int i10, int i11, Interpolator interpolator) {
        w0 w0Var = this.x;
        if (w0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.H) {
            return;
        }
        if (!w0Var.d()) {
            i10 = 0;
        }
        if (!this.x.e()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.m0.b(i10, i11, TLObject.FLAG_31, interpolator);
    }

    public final void w(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().d(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public final void w0(int i10, int i11, Interpolator interpolator) {
        if (this.x == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.H) {
            return;
        }
        if (!this.x.e()) {
            i10 = 0;
        }
        if (i10 != 0) {
            this.m0.b(0, i10, i11, interpolator);
        }
    }

    public final void x(int i10, int i11) {
        this.P++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        k0(i10, i11);
        a1 a1Var = this.q0;
        if (a1Var != null) {
            a1Var.b(this, i10, i11);
        }
        ArrayList arrayList = this.r0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((a1) this.r0.get(size)).b(this, i10, i11);
            }
        }
        this.P--;
    }

    public final void x0(int i10) {
        if (this.H) {
            return;
        }
        w0 w0Var = this.x;
        if (w0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            w0Var.v0(this, this.p0, i10);
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
        int i10 = this.F + 1;
        this.F = i10;
        if (i10 != 1 || this.H) {
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

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        float a2;
        float a10;
        this.a = new f1(this, r1);
        this.b = new d1(this);
        this.f = new b(24, false);
        this.n = new n0(this, r1);
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
        this.Q = new t0();
        this.V = new f2.l();
        this.W = 0;
        this.a0 = -1;
        this.j0 = Float.MIN_VALUE;
        this.k0 = Float.MIN_VALUE;
        int i11 = 1;
        this.l0 = true;
        this.m0 = new m1(this);
        this.o0 = O0 ? new i() : null;
        k1 k1Var = new k1();
        k1Var.a = -1;
        k1Var.b = 0;
        k1Var.c = 0;
        k1Var.d = 1;
        k1Var.e = 0;
        k1Var.f = false;
        k1Var.g = false;
        k1Var.h = false;
        k1Var.i = false;
        k1Var.j = false;
        k1Var.k = false;
        this.p0 = k1Var;
        this.s0 = false;
        this.t0 = false;
        c cVar = new c(this, 16);
        this.u0 = cVar;
        this.v0 = false;
        this.x0 = new int[2];
        this.z0 = new int[2];
        this.A0 = new int[2];
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = null;
        this.E0 = new int[2];
        this.F0 = new ArrayList();
        this.G0 = new n0(this, i11);
        this.H0 = new o0(this);
        this.J0 = true;
        this.K0 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L0, i10, 0);
            this.h = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.h = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.g0 = viewConfiguration.getScaledTouchSlop();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            Method method = k0.a;
            a2 = i6.a.d(viewConfiguration);
        } else {
            a2 = k0.a(viewConfiguration, context);
        }
        this.j0 = a2;
        if (i12 >= 26) {
            a10 = i6.a.e(viewConfiguration);
        } else {
            a10 = k0.a(viewConfiguration, context);
        }
        this.k0 = a10;
        this.h0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.i0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.V.a = cVar;
        this.d = new a(new za.c(this, 13));
        this.e = new e(new o1(this, 12));
        WeakHashMap weakHashMap = r0.j0.a;
        if ((i12 >= 26 ? d0.a(this) : 0) == 0 && i12 >= 26) {
            d0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.K = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new p1(this));
        setDescendantFocusability(262144);
        setNestedScrollingEnabled(true);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        w0 w0Var = this.x;
        if (w0Var != null) {
            return w0Var.p(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + C());
    }

    public void f0(View view) {
    }

    public void j0(int i10) {
    }

    public void setOnFlingListener(y0 y0Var) {
    }

    public void setRecyclerListener(e1 e1Var) {
    }

    public void k0(int i10, int i11) {
    }
}
