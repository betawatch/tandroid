package androidx.recyclerview.widget;

import a0.f;
import a0.h;
import a5.n;
import aa.a;
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
import f2.b0;
import f2.b1;
import f2.d1;
import f2.e1;
import f2.f0;
import f2.f1;
import f2.g1;
import f2.i1;
import f2.k1;
import f2.l1;
import f2.m1;
import f2.n1;
import f2.o0;
import f2.o1;
import f2.p0;
import f2.q0;
import f2.q1;
import f2.r1;
import f2.t;
import f2.t0;
import f2.u0;
import f2.u1;
import f2.v0;
import f2.w0;
import f2.x0;
import f2.y0;
import f2.z0;
import ga.c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.g;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import r0.d0;
import r0.j0;
import r0.k0;
import r0.l;
import xe.b;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] L0 = {R.attr.clipToPadding};
    public static final boolean M0;
    public static final boolean N0;
    public static final boolean O0;
    public static final b0 P0;
    public final ArrayList A;
    public final int[] A0;
    public a1 B;
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
    public final o0 G0;
    public boolean H;
    public final p0 H0;
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
    public u0 Q;
    public EdgeEffect R;
    public EdgeEffect S;
    public EdgeEffect T;
    public EdgeEffect U;
    public v0 V;
    public int W;
    public final g1 a;
    public int a0;
    public final e1 b;
    public VelocityTracker b0;
    public i1 c;
    public int c0;
    public final a d;
    public int d0;
    public final n e;
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
    public final n1 m0;
    public final o0 n;
    public t n0;
    public final i o0;
    public final l1 p0;
    public b1 q0;
    public final Rect r;
    public ArrayList r0;
    public final Rect s;
    public boolean s0;
    public boolean t0;
    public final c u0;
    public final RectF v;
    public boolean v0;
    public q0 w;
    public q1 w0;
    public x0 x;
    public final int[] x0;
    public final ArrayList y;
    public l y0;
    public final int[] z0;

    static {
        M0 = Build.VERSION.SDK_INT >= 23;
        N0 = true;
        O0 = true;
        P0 = new b0(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float a2;
        this.a = new g1(this, r0);
        this.b = new e1(this);
        this.f = new b(23, (byte) 0);
        this.n = new o0(this, r0);
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
        this.Q = new u0();
        this.V = new f2.l();
        this.W = 0;
        this.a0 = -1;
        this.j0 = Float.MIN_VALUE;
        this.k0 = Float.MIN_VALUE;
        int i10 = 1;
        this.l0 = true;
        this.m0 = new n1(this);
        this.o0 = O0 ? new i() : null;
        l1 l1Var = new l1();
        l1Var.a = -1;
        l1Var.b = 0;
        l1Var.c = 0;
        l1Var.d = 1;
        l1Var.e = 0;
        l1Var.f = false;
        l1Var.g = false;
        l1Var.h = false;
        l1Var.i = false;
        l1Var.j = false;
        l1Var.k = false;
        this.p0 = l1Var;
        this.s0 = false;
        this.t0 = false;
        c cVar = new c(this, 12);
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
        this.G0 = new o0(this, i10);
        this.H0 = new p0(this);
        this.J0 = true;
        this.K0 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L0, 0, 0);
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
            a2 = h6.a.c(viewConfiguration);
        } else {
            a2 = k0.a(viewConfiguration, context);
        }
        this.j0 = a2;
        this.k0 = i11 >= 26 ? h6.a.d(viewConfiguration) : k0.a(viewConfiguration, context);
        this.h0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.i0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.V.a = cVar;
        int i12 = 13;
        this.d = new a(new ae.b(this, i12));
        this.e = new n(new a9.i(this, i12));
        WeakHashMap weakHashMap = j0.a;
        if ((i11 >= 26 ? d0.a(this) : 0) == 0 && i11 >= 26) {
            d0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.K = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new q1(this));
        setDescendantFocusability(262144);
        setNestedScrollingEnabled(true);
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
        o1 U = U(view);
        if (U != null) {
            return U.b();
        }
        return -1;
    }

    public static int S(View view) {
        o1 U = U(view);
        if (U != null) {
            return U.c();
        }
        return -1;
    }

    public static o1 U(View view) {
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof y0) {
            return ((y0) layoutParams).a;
        }
        return null;
    }

    private l getScrollingChildHelper() {
        if (this.y0 == null) {
            this.y0 = new l(this);
        }
        return this.y0;
    }

    public static void m(o1 o1Var) {
        WeakReference weakReference = o1Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == o1Var.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            o1Var.b = null;
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
        k1 k1Var;
        setScrollState(0);
        n1 n1Var = this.m0;
        RecyclerView recyclerView = n1Var.h;
        if (recyclerView.J0) {
            recyclerView.removeCallbacks(n1Var);
            n1Var.c.abortAnimation();
        }
        x0 x0Var = this.x;
        if (x0Var == null || (k1Var = x0Var.e) == null) {
            return;
        }
        k1Var.h();
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

    public final void D(l1 l1Var) {
        if (getScrollState() != 2) {
            l1Var.getClass();
            return;
        }
        OverScroller overScroller = this.m0.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        l1Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View E(float f10, float f11) {
        for (int o10 = this.e.o() - 1; o10 >= 0; o10--) {
            View n10 = this.e.n(o10);
            float translationX = n10.getTranslationX();
            float translationY = n10.getTranslationY();
            if (f10 >= n10.getLeft() + translationX && f10 <= n10.getRight() + translationX && f11 >= n10.getTop() + translationY && f11 <= n10.getBottom() + translationY) {
                return n10;
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

    public final o1 G(View view) {
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
            a1 a1Var = (a1) arrayList.get(i10);
            if (a1Var.b(this, motionEvent) && action != 3) {
                this.B = a1Var;
                return true;
            }
        }
        return false;
    }

    public final void I(int[] iArr) {
        int o10 = this.e.o();
        if (o10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i11 = TLObject.FLAG_31;
        for (int i12 = 0; i12 < o10; i12++) {
            o1 U = U(this.e.n(i12));
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

    public final o1 K(int i10) {
        o1 o1Var = null;
        if (this.M) {
            return null;
        }
        int t10 = this.e.t();
        for (int i11 = 0; i11 < t10; i11++) {
            o1 U = U(this.e.s(i11));
            if (U != null && !U.j() && N(U) == i10) {
                if (!((ArrayList) this.e.d).contains(U.a)) {
                    return U;
                }
                o1Var = U;
            }
        }
        return o1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o1 L(int i10, boolean z10) {
        int t10 = this.e.t();
        o1 o1Var = null;
        for (int i11 = 0; i11 < t10; i11++) {
            o1 U = U(this.e.s(i11));
            if (U != null && !U.j()) {
                if (z10) {
                    if (U.c != i10) {
                        continue;
                    }
                    if (((ArrayList) this.e.d).contains(U.a)) {
                        return U;
                    }
                    o1Var = U;
                } else {
                    if (U.c() != i10) {
                        continue;
                    }
                    if (((ArrayList) this.e.d).contains(U.a)) {
                    }
                }
            }
        }
        return o1Var;
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

    public final int N(o1 o1Var) {
        if (o1Var.e(524) || !o1Var.g()) {
            return -1;
        }
        int i10 = o1Var.c;
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
        e1 e1Var = this.b;
        if (i10 >= ((ArrayList) e1Var.c).size()) {
            return null;
        }
        return ((o1) ((ArrayList) e1Var.c).get(i10)).a;
    }

    public final View P(int i10) {
        if (i10 < 0) {
            return null;
        }
        e1 e1Var = this.b;
        if (i10 >= ((ArrayList) e1Var.e).size()) {
            return null;
        }
        return ((o1) ((ArrayList) e1Var.e).get(i10)).a;
    }

    public final long Q(o1 o1Var) {
        return this.w.b ? o1Var.e : o1Var.c;
    }

    public final o1 T(View view) {
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
        y0 y0Var = (y0) view.getLayoutParams();
        boolean z10 = y0Var.c;
        Rect rect = y0Var.b;
        if (z10) {
            l1 l1Var = this.p0;
            if (!l1Var.g || (!y0Var.a.m() && !y0Var.a.h())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.y;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Rect rect2 = this.r;
                    rect2.set(0, 0, 0, 0);
                    ((w0) arrayList.get(i10)).a(rect2, view, this, l1Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                y0Var.c = false;
                return rect;
            }
        }
        return rect;
    }

    public final w0 X(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 < 0 || i10 >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(com.google.android.recaptcha.internal.a.l(i10, " is an invalid index for size ", itemDecorationCount));
        }
        return (w0) this.y.get(i10);
    }

    public final void Y(long j10, o1 o1Var, o1 o1Var2) {
        int o10 = this.e.o();
        for (int i10 = 0; i10 < o10; i10++) {
            o1 U = U(this.e.n(i10));
            if (U != o1Var && Q(U) == j10) {
                q0 q0Var = this.w;
                if (q0Var == null || !q0Var.b) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + U + " \n View Holder 2:" + o1Var + C());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + U + " \n View Holder 2:" + o1Var + C());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + o1Var2 + " cannot be found but it is necessary for " + o1Var + C());
    }

    public final boolean Z() {
        return !this.E || this.M || this.d.h();
    }

    public final void a0() {
        if (this.y.size() == 0) {
            return;
        }
        x0 x0Var = this.x;
        if (x0Var != null) {
            x0Var.b("Cannot invalidate item decorations during a scroll or layout");
        }
        d0();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        x0 x0Var = this.x;
        if (x0Var != null) {
            x0Var.getClass();
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
        return (layoutParams instanceof y0) && this.x.f((y0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        x0 x0Var = this.x;
        if (x0Var == null || !x0Var.d()) {
            return 0;
        }
        return ((f2.k0) this.x).B0(this.p0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        x0 x0Var = this.x;
        if (x0Var != null && x0Var.d()) {
            return this.x.h(this.p0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        x0 x0Var = this.x;
        if (x0Var != null && x0Var.d()) {
            return this.x.i(this.p0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        x0 x0Var = this.x;
        if (x0Var != null && x0Var.e()) {
            return this.x.j(this.p0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        x0 x0Var = this.x;
        if (x0Var != null && x0Var.e()) {
            return this.x.k(this.p0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        x0 x0Var = this.x;
        if (x0Var != null && x0Var.e()) {
            return this.x.l(this.p0);
        }
        return 0;
    }

    public final void d0() {
        int t10 = this.e.t();
        for (int i10 = 0; i10 < t10; i10++) {
            ((y0) this.e.s(i10).getLayoutParams()).c = true;
        }
        ArrayList arrayList = (ArrayList) this.b.e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            y0 y0Var = (y0) ((o1) arrayList.get(i11)).a.getLayoutParams();
            if (y0Var != null) {
                y0Var.c = true;
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
            ((w0) arrayList.get(i10)).c(canvas, this);
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

    public final void e0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int t10 = this.e.t();
        for (int i13 = 0; i13 < t10; i13++) {
            o1 U = U(this.e.s(i13));
            if (U != null && !U.r()) {
                int i14 = U.c;
                l1 l1Var = this.p0;
                if (i14 >= i12) {
                    U.n(-i11, z10);
                    l1Var.f = true;
                } else if (i14 >= i10) {
                    U.a(8);
                    U.n(-i11, z10);
                    U.c = i10 - 1;
                    l1Var.f = true;
                }
            }
        }
        e1 e1Var = this.b;
        ArrayList arrayList = (ArrayList) e1Var.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o1 o1Var = (o1) arrayList.get(size);
            if (o1Var != null) {
                int i15 = o1Var.c;
                if (i15 >= i12) {
                    o1Var.n(-i11, z10);
                } else if (i15 >= i10) {
                    o1Var.a(8);
                    e1Var.f(size);
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
        boolean z12 = (this.w == null || this.x == null || b0() || this.H) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        l1 l1Var = this.p0;
        e1 e1Var = this.b;
        if (z12 && (i10 == 2 || i10 == 1)) {
            if (this.x.e()) {
                if (focusFinder.findNextFocus(this, view, i10 == 2 ? 130 : 33) == null) {
                    z10 = true;
                    if (!z10 && this.x.d()) {
                        RecyclerView recyclerView = this.x.b;
                        WeakHashMap weakHashMap = j0.a;
                        z10 = focusFinder.findNextFocus(this, view, !((recyclerView.getLayoutDirection() != 1) ^ (i10 != 2)) ? 66 : 17) != null;
                    }
                    if (z10) {
                        p();
                        if (F(view) != null) {
                            y0();
                            this.x.R(view, i10, e1Var, l1Var);
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
                            WeakHashMap weakHashMap2 = j0.a;
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
                WeakHashMap weakHashMap3 = j0.a;
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
                    view2 = this.x.R(view, i10, e1Var, l1Var);
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
                    WeakHashMap weakHashMap22 = j0.a;
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
        this.O++;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        x0 x0Var = this.x;
        if (x0Var != null) {
            return x0Var.n();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + C());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        x0 x0Var = this.x;
        if (x0Var != null) {
            return x0Var.o(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + C());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public q0 getAdapter() {
        return this.w;
    }

    public int getAttachedScrapChildCount() {
        return ((ArrayList) this.b.c).size();
    }

    @Override // android.view.View
    public int getBaseline() {
        x0 x0Var = this.x;
        if (x0Var == null) {
            return super.getBaseline();
        }
        x0Var.getClass();
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

    public q1 getCompatAccessibilityDelegate() {
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

    public u0 getEdgeEffectFactory() {
        return this.Q;
    }

    public int getHiddenChildCount() {
        return ((ArrayList) this.e.d).size();
    }

    public v0 getItemAnimator() {
        return this.V;
    }

    public int getItemDecorationCount() {
        return this.y.size();
    }

    public x0 getLayoutManager() {
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

    public z0 getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.l0;
    }

    public d1 getRecycledViewPool() {
        return this.b.c();
    }

    public int getScrollState() {
        return this.W;
    }

    public int getTopGlowOffset() {
        return this.B0;
    }

    public final void h(o1 o1Var) {
        View view = o1Var.a;
        boolean z10 = view.getParent() == this;
        this.b.k(T(view));
        if (o1Var.l()) {
            this.e.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z10) {
            this.e.a(view, -1, true);
            return;
        }
        n nVar = this.e;
        int indexOfChild = ((RecyclerView) ((a9.i) nVar.b).b).indexOfChild(view);
        if (indexOfChild >= 0) {
            ((f2.c) nVar.c).M(indexOfChild);
            nVar.v(view);
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
                    o1 o1Var = (o1) arrayList.get(size);
                    if (o1Var.a.getParent() == this && !o1Var.r() && (i10 = o1Var.s) != -1) {
                        View view = o1Var.a;
                        WeakHashMap weakHashMap = j0.a;
                        view.setImportantForAccessibility(i10);
                        o1Var.s = -1;
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

    public final void i(w0 w0Var) {
        x0 x0Var = this.x;
        if (x0Var != null) {
            x0Var.b("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.y;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(w0Var);
        d0();
        requestLayout();
    }

    public final void i0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.a0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.a0 = motionEvent.getPointerId(i10);
            int x8 = (int) (motionEvent.getX(i10) + 0.5f);
            this.e0 = x8;
            this.c0 = x8;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
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

    public final void j(b1 b1Var) {
        if (this.r0 == null) {
            this.r0 = new ArrayList();
        }
        this.r0.add(b1Var);
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
        int t10 = this.e.t();
        for (int i10 = 0; i10 < t10; i10++) {
            o1 U = U(this.e.s(i10));
            if (U != null && !U.r()) {
                U.a(6);
            }
        }
        d0();
        e1 e1Var = this.b;
        ArrayList arrayList = (ArrayList) e1Var.e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o1 o1Var = (o1) arrayList.get(i11);
            if (o1Var != null) {
                o1Var.a(6);
                o1Var.a(1024);
            }
        }
        q0 q0Var = ((RecyclerView) e1Var.h).w;
        if (q0Var == null || !q0Var.b) {
            e1Var.e();
        }
    }

    public final void n() {
        int t10 = this.e.t();
        for (int i10 = 0; i10 < t10; i10++) {
            o1 U = U(this.e.s(i10));
            if (U != null && !U.r()) {
                U.d = -1;
                U.g = -1;
            }
        }
        e1 e1Var = this.b;
        ArrayList arrayList = (ArrayList) e1Var.c;
        ArrayList arrayList2 = (ArrayList) e1Var.e;
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            o1 o1Var = (o1) arrayList2.get(i11);
            o1Var.d = -1;
            o1Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            o1 o1Var2 = (o1) arrayList.get(i12);
            o1Var2.d = -1;
            o1Var2.g = -1;
        }
        ArrayList arrayList3 = (ArrayList) e1Var.d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                o1 o1Var3 = (o1) ((ArrayList) e1Var.d).get(i13);
                o1Var3.d = -1;
                o1Var3.g = -1;
            }
        }
    }

    public final void n0(o1 o1Var, p pVar) {
        o1Var.p(0, 8192);
        boolean z10 = this.p0.h;
        b bVar = this.f;
        if (z10 && o1Var.m() && !o1Var.j() && !o1Var.r()) {
            ((h) bVar.c).k(o1Var, Q(o1Var));
        }
        f fVar = (f) bVar.b;
        u1 u1Var = (u1) fVar.get(o1Var);
        if (u1Var == null) {
            u1Var = u1.a();
            fVar.put(o1Var, u1Var);
        }
        u1Var.b = pVar;
        u1Var.a |= 4;
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
            WeakHashMap weakHashMap = j0.a;
            postInvalidateOnAnimation();
        }
    }

    public final void o0() {
        v0 v0Var = this.V;
        if (v0Var != null) {
            v0Var.g();
        }
        x0 x0Var = this.x;
        e1 e1Var = this.b;
        if (x0Var != null) {
            x0Var.g0(e1Var);
            this.x.h0(e1Var);
        }
        ((ArrayList) e1Var.c).clear();
        e1Var.e();
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
        x0 x0Var = this.x;
        if (x0Var != null) {
            x0Var.getClass();
        }
        this.v0 = false;
        if (O0) {
            ThreadLocal threadLocal = t.e;
            t tVar = (t) threadLocal.get();
            this.n0 = tVar;
            if (tVar == null) {
                t tVar2 = new t();
                tVar2.a = new ArrayList();
                tVar2.d = new ArrayList();
                this.n0 = tVar2;
                WeakHashMap weakHashMap = j0.a;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    f10 = display.getRefreshRate();
                }
                f10 = 60.0f;
                t tVar3 = this.n0;
                tVar3.c = (long) (1.0E9f / f10);
                threadLocal.set(tVar3);
            }
            this.n0.a.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        t tVar;
        super.onDetachedFromWindow();
        v0 v0Var = this.V;
        if (v0Var != null) {
            v0Var.g();
        }
        B0();
        this.C = false;
        this.F0.clear();
        removeCallbacks(this.G0);
        this.f.getClass();
        while (u1.d.b() != null) {
        }
        if (!O0 || (tVar = this.n0) == null) {
            return;
        }
        tVar.a.remove(this);
        this.n0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((w0) arrayList.get(i10)).b(canvas, this);
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
            x0 x0Var = this.x;
            if (x0Var != null) {
                boolean d = x0Var.d();
                boolean e9 = this.x.e();
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
                    int x8 = (int) (motionEvent.getX() + 0.5f);
                    this.e0 = x8;
                    this.c0 = x8;
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
                    int i10 = d;
                    if (e9) {
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
                    int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.W != 1) {
                        int i11 = x10 - this.c0;
                        int i12 = y11 - this.d0;
                        if (d == 0 || Math.abs(i11) <= this.g0) {
                            z10 = false;
                        } else {
                            this.e0 = x10;
                            z10 = true;
                        }
                        if (e9 && Math.abs(i12) > this.g0) {
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
                    int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.e0 = x11;
                    this.c0 = x11;
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
        x0 x0Var = this.x;
        e1 e1Var = this.b;
        l1 l1Var = this.p0;
        x0Var.d0(e1Var, l1Var, i10, i11);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.w == null) {
            return;
        }
        if (l1Var.d == 1) {
            t();
        }
        this.x.q0(i10, i11);
        l1Var.i = true;
        u();
        this.x.s0(i10, i11);
        f2.k0 k0Var = (f2.k0) this.x;
        if (k0Var.l == 1073741824 || k0Var.k == 1073741824) {
            return;
        }
        int r10 = k0Var.r();
        for (int i12 = 0; i12 < r10; i12++) {
            ViewGroup.LayoutParams layoutParams = k0Var.q(i12).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                this.x.q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                l1Var.i = true;
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
        if (!(parcelable instanceof i1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i1 i1Var = (i1) parcelable;
        this.c = i1Var;
        super.onRestoreInstanceState(i1Var.a);
        x0 x0Var = this.x;
        if (x0Var == null || (parcelable2 = this.c.c) == null) {
            return;
        }
        f2.k0 k0Var = (f2.k0) x0Var;
        if (parcelable2 instanceof f2.j0) {
            k0Var.B = (f2.j0) parcelable2;
            k0Var.l0();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        i1 i1Var = new i1(super.onSaveInstanceState());
        i1 i1Var2 = this.c;
        if (i1Var2 != null) {
            i1Var.c = i1Var2.c;
            return i1Var;
        }
        x0 x0Var = this.x;
        if (x0Var != null) {
            i1Var.c = x0Var.e0();
            return i1Var;
        }
        i1Var.c = null;
        return i1Var;
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
            a1 a1Var = this.B;
            if (a1Var == null) {
                z10 = motionEvent.getAction() == 0 ? false : H(motionEvent);
            } else {
                a1Var.a(this, motionEvent);
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
            x0 x0Var = this.x;
            if (x0Var != null) {
                boolean d = x0Var.d();
                boolean e9 = this.x.e();
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
                    int x8 = (int) (motionEvent.getX() + 0.5f);
                    this.e0 = x8;
                    this.c0 = x8;
                    int y10 = (int) (motionEvent.getY() + 0.5f);
                    this.f0 = y10;
                    this.d0 = y10;
                    int i10 = d;
                    if (e9) {
                        i10 = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i10, 0);
                } else {
                    if (actionMasked == 1) {
                        this.b0.addMovement(obtain);
                        VelocityTracker velocityTracker = this.b0;
                        int i11 = this.i0;
                        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, i11);
                        float f10 = d != 0 ? -this.b0.getXVelocity(this.a0) : 0.0f;
                        float f11 = e9 ? -this.b0.getYVelocity(this.a0) : 0.0f;
                        if (f10 != 0.0f || f11 != 0.0f) {
                            int i12 = (int) f10;
                            int i13 = (int) f11;
                            x0 x0Var2 = this.x;
                            if (x0Var2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.H) {
                                boolean d10 = x0Var2.d();
                                boolean e10 = this.x.e();
                                int i14 = this.h0;
                                if (d10 == 0 || Math.abs(i12) < i14) {
                                    i12 = 0;
                                }
                                if (!e10 || Math.abs(i13) < i14) {
                                    i13 = 0;
                                }
                                if (i12 != 0 || i13 != 0) {
                                    float f12 = i12;
                                    float f13 = i13;
                                    if (!dispatchNestedPreFling(f12, f13)) {
                                        boolean z12 = d10 != 0 || e10;
                                        dispatchNestedFling(f12, f13, z12);
                                        int i15 = d10;
                                        if (z12) {
                                            if (e10) {
                                                i15 = (d10 ? 1 : 0) | 2;
                                            }
                                            getScrollingChildHelper().g(i15, 1);
                                            int i16 = -i11;
                                            int max = Math.max(i16, Math.min(i12, i11));
                                            int max2 = Math.max(i16, Math.min(i13, i11));
                                            n1 n1Var = this.m0;
                                            RecyclerView recyclerView = n1Var.h;
                                            recyclerView.setScrollState(2);
                                            n1Var.b = 0;
                                            n1Var.a = 0;
                                            Interpolator interpolator = n1Var.d;
                                            b0 b0Var = P0;
                                            if (interpolator != b0Var) {
                                                n1Var.d = b0Var;
                                                n1Var.c = new OverScroller(recyclerView.getContext(), b0Var);
                                            }
                                            n1Var.c.fling(0, 0, max, max2, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                            n1Var.a();
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
                        int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i17 = this.e0 - x10;
                        int i18 = this.f0 - y11;
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
                                    if (e9) {
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
                            if (e9) {
                            }
                            if (z11) {
                            }
                        }
                        if (this.W == 1) {
                            this.e0 = x10 - iArr3[0];
                            this.f0 = y11 - iArr3[1];
                            if (s0(d != 0 ? i17 : 0, e9 ? i18 : 0, obtain)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            t tVar = this.n0;
                            if (tVar != null && (i17 != 0 || i18 != 0)) {
                                tVar.a(this, i17, i18);
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
                n nVar = this.e;
                int o10 = nVar.o();
                int i14 = 0;
                while (true) {
                    if (i14 < o10) {
                        o1 U = U(nVar.n(i14));
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

    public final void p0(w0 w0Var) {
        x0 x0Var = this.x;
        if (x0Var != null) {
            x0Var.b("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.y;
        arrayList.remove(w0Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        d0();
        requestLayout();
    }

    public final void q(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = j0.a;
        setMeasuredDimension(x0.g(i10, paddingRight, getMinimumWidth()), x0.g(i11, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void q0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.r;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof y0) {
            y0 y0Var = (y0) layoutParams;
            if (!y0Var.c) {
                Rect rect2 = y0Var.b;
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
        o1 U = U(view);
        q0 q0Var = this.w;
        if (q0Var != null && U != null) {
            q0Var.z(U);
        }
        ArrayList arrayList = this.L;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                f0 f0Var = (f0) this.L.get(size);
                f0Var.o(view);
                o1 T = f0Var.D.T(view);
                if (T != null) {
                    o1 o1Var = f0Var.c;
                    if (o1Var == null || T != o1Var) {
                        f0Var.j(T, false);
                        if (f0Var.a.remove(T.a)) {
                            f0Var.x.a(f0Var.D, T);
                        }
                    } else {
                        f0Var.p(null, 0);
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
        o1 U = U(view);
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
        k1 k1Var = this.x.e;
        if ((k1Var == null || !k1Var.e) && !b0() && view2 != null) {
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
            ((a1) arrayList.get(i10)).c(z10);
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
        u1 u1Var;
        int i10;
        boolean r10;
        int i11;
        int i12;
        int i13;
        int i14;
        o1 o1Var;
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
        l1 l1Var = this.p0;
        boolean z11 = false;
        l1Var.i = false;
        int i15 = 1;
        if (l1Var.d == 1) {
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
        l1Var.a(4);
        y0();
        g0();
        l1Var.d = 1;
        boolean z12 = l1Var.j;
        e1 e1Var = this.b;
        b bVar = this.f;
        if (z12) {
            try {
                int o10 = this.e.o() - 1;
                while (o10 >= 0) {
                    o1 U = U(this.e.n(o10));
                    if (U != null && !U.r()) {
                        long Q = Q(U);
                        this.V.getClass();
                        p pVar = new p();
                        View view = U.a;
                        pVar.a = view.getLeft();
                        pVar.b = view.getTop();
                        view.getRight();
                        view.getBottom();
                        h hVar = (h) bVar.c;
                        f fVar = (f) bVar.b;
                        o1 o1Var2 = (o1) hVar.f(Q);
                        if (o1Var2 == null || o1Var2.r()) {
                            bVar.g(U, pVar);
                        } else {
                            u1 u1Var2 = (u1) fVar.get(o1Var2);
                            boolean z13 = (u1Var2 == null || (u1Var2.a & i15) == 0) ? false : true;
                            u1 u1Var3 = (u1) fVar.get(U);
                            boolean z14 = (u1Var3 == null || (u1Var3.a & i15) == 0) ? false : true;
                            if (z13 && o1Var2 == U) {
                                bVar.g(U, pVar);
                            } else {
                                try {
                                    p L = bVar.L(o1Var2, 4);
                                    bVar.g(U, pVar);
                                    p L2 = bVar.L(U, 8);
                                    if (L == null) {
                                        Y(Q, U, o1Var2);
                                    } else {
                                        o1Var2.q(false);
                                        if (z13) {
                                            h(o1Var2);
                                        }
                                        if (o1Var2 != U) {
                                            if (z14) {
                                                h(U);
                                            }
                                            o1Var2.j = U;
                                            h(o1Var2);
                                            e1Var.k(o1Var2);
                                            U.q(false);
                                            U.k = o1Var2;
                                        }
                                        r1 r1Var = (r1) this.V;
                                        r1Var.getClass();
                                        int i16 = L.a;
                                        int i17 = L.b;
                                        if (U.r()) {
                                            i13 = L.a;
                                            i14 = L.b;
                                        } else {
                                            i13 = L2.a;
                                            i14 = L2.b;
                                        }
                                        if (r1Var.q(o1Var2, U, L, i16, i17, i13, i14)) {
                                            l0();
                                        }
                                    }
                                } catch (Exception e9) {
                                    e = e9;
                                    StringBuilder sb2 = new StringBuilder();
                                    for (int o11 = this.e.o() - 1; o11 >= 0; o11--) {
                                        o1 U2 = U(this.e.n(o11));
                                        if (U2 != null && !U2.r()) {
                                            sb2.append("Holder at" + o11 + " " + U2 + "\n");
                                        }
                                    }
                                    throw new RuntimeException(sb2.toString(), e);
                                }
                            }
                        }
                        o10--;
                        i15 = 1;
                    }
                    o10--;
                    i15 = 1;
                }
                f fVar2 = (f) bVar.b;
                int i18 = fVar2.c - 1;
                while (i18 >= 0) {
                    o1 o1Var3 = (o1) fVar2.e(i18);
                    try {
                        u1Var = (u1) fVar2.f(i18);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        u1Var = null;
                    }
                    if (u1Var != null) {
                        int i19 = u1Var.a;
                        int i20 = i19 & 3;
                        p0 p0Var = this.H0;
                        if (i20 == 3) {
                            p0Var.b(o1Var3);
                        } else if ((i19 & 1) != 0) {
                            p pVar2 = u1Var.b;
                            if (pVar2 == null) {
                                p0Var.b(o1Var3);
                            } else {
                                p0Var.a(o1Var3, pVar2, u1Var.c);
                            }
                        } else if ((i19 & 14) == 14) {
                            p pVar3 = u1Var.b;
                            p pVar4 = u1Var.c;
                            RecyclerView recyclerView = p0Var.a;
                            o1Var3.q(z11);
                            if (recyclerView.V.a(o1Var3, pVar3, pVar4)) {
                                recyclerView.l0();
                            }
                        } else if ((i19 & 12) == 12) {
                            p pVar5 = u1Var.b;
                            p pVar6 = u1Var.c;
                            p0Var.getClass();
                            o1Var3.q(z11);
                            RecyclerView recyclerView2 = p0Var.a;
                            if (recyclerView2.M) {
                                r1 r1Var2 = (r1) recyclerView2.V;
                                r1Var2.getClass();
                                int i21 = pVar5.a;
                                int i22 = pVar5.b;
                                if (o1Var3.r()) {
                                    i12 = pVar5.a;
                                    i11 = pVar5.b;
                                } else {
                                    int i23 = pVar6.a;
                                    i11 = pVar6.b;
                                    i12 = i23;
                                }
                                if (r1Var2.q(o1Var3, o1Var3, pVar5, i21, i22, i12, i11)) {
                                    recyclerView2.l0();
                                }
                            } else {
                                r1 r1Var3 = (r1) recyclerView2.V;
                                r1Var3.getClass();
                                int i24 = pVar5.a;
                                int i25 = pVar6.a;
                                if (i24 == i25 && pVar5.b == pVar6.b) {
                                    r1Var3.v(o1Var3);
                                    r10 = false;
                                } else {
                                    r10 = r1Var3.r(o1Var3, pVar5, i24, pVar5.b, i25, pVar6.b);
                                }
                                if (r10) {
                                    recyclerView2.l0();
                                }
                            }
                        } else if ((i19 & 4) != 0) {
                            p0Var.a(o1Var3, u1Var.b, null);
                        } else if ((i19 & 8) != 0) {
                            p pVar7 = u1Var.b;
                            p pVar8 = u1Var.c;
                            RecyclerView recyclerView3 = p0Var.a;
                            i10 = 0;
                            o1Var3.q(false);
                            if (recyclerView3.V.a(o1Var3, pVar7, pVar8)) {
                                recyclerView3.l0();
                            }
                            u1Var.a = i10;
                            u1Var.b = null;
                            u1Var.c = null;
                            u1.d.j(u1Var);
                        }
                        i10 = 0;
                        u1Var.a = i10;
                        u1Var.b = null;
                        u1Var.c = null;
                        u1.d.j(u1Var);
                    }
                    i18--;
                    z11 = false;
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        View view2 = null;
        this.x.h0(e1Var);
        l1Var.b = l1Var.e;
        this.M = false;
        this.N = false;
        l1Var.j = false;
        l1Var.k = false;
        this.x.f = false;
        ArrayList arrayList = (ArrayList) e1Var.d;
        if (arrayList != null) {
            arrayList.clear();
        }
        x0 x0Var = this.x;
        if (x0Var.j) {
            x0Var.i = 0;
            x0Var.j = false;
            e1Var.l();
        }
        this.x.c0(l1Var);
        h0(true);
        z0(false);
        ((f) bVar.b).clear();
        ((h) bVar.c).b();
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
            long j10 = l1Var.m;
            if (j10 != -1 && (z10 = this.w.b) && z10) {
                int t10 = this.e.t();
                o1Var = null;
                int i28 = 0;
                while (true) {
                    if (i28 >= t10) {
                        break;
                    }
                    o1 U3 = U(this.e.s(i28));
                    if (U3 != null && !U3.j() && U3.e == j10) {
                        if (!((ArrayList) this.e.d).contains(U3.a)) {
                            o1Var = U3;
                            break;
                        }
                        o1Var = U3;
                    }
                    i28++;
                }
            } else {
                o1Var = null;
            }
            if (o1Var != null) {
                View view3 = o1Var.a;
                if (!((ArrayList) this.e.d).contains(view3) && view3.hasFocusable()) {
                    view2 = view3;
                    if (view2 != null) {
                        int i29 = l1Var.n;
                        if (i29 != -1 && (findViewById = view2.findViewById(i29)) != null && findViewById.isFocusable()) {
                            view2 = findViewById;
                        }
                        view2.requestFocus();
                    }
                }
            }
            if (this.e.o() > 0) {
                int i30 = l1Var.l;
                if (i30 == -1) {
                    i30 = 0;
                }
                int b10 = l1Var.b();
                for (int i31 = i30; i31 < b10; i31++) {
                    o1 K = K(i31);
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
                    o1 K2 = K(min);
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
        l1Var.m = -1L;
        l1Var.l = -1;
        l1Var.n = -1;
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
        q0 q0Var = this.w;
        int[] iArr = this.E0;
        if (q0Var != null) {
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
                float x8 = motionEvent.getX();
                float f10 = i16;
                float y10 = motionEvent.getY();
                float f11 = i17;
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
                        u0.b.a(this.S, (-f11) / getHeight(), x8 / getWidth());
                    } else {
                        if (f11 > 0.0f) {
                            y();
                            u0.b.a(this.U, f11 / getHeight(), 1.0f - (x8 / getWidth()));
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
        x0 x0Var = this.x;
        if (x0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.H) {
            return;
        }
        boolean d = x0Var.d();
        boolean e9 = this.x.e();
        if (d || e9) {
            if (!d) {
                i10 = 0;
            }
            if (!e9) {
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

    public void setAccessibilityDelegateCompat(q1 q1Var) {
        this.w0 = q1Var;
        j0.k(this, q1Var);
    }

    public void setAdapter(q0 q0Var) {
        setLayoutFrozen(false);
        q0 q0Var2 = this.w;
        g1 g1Var = this.a;
        if (q0Var2 != null) {
            q0Var2.a.unregisterObserver(g1Var);
            this.w.getClass();
        }
        o0();
        a aVar = this.d;
        aVar.m((ArrayList) aVar.d);
        aVar.m((ArrayList) aVar.e);
        aVar.b = 0;
        q0 q0Var3 = this.w;
        this.w = q0Var;
        if (q0Var != null) {
            q0Var.B(g1Var);
        }
        x0 x0Var = this.x;
        if (x0Var != null) {
            x0Var.Q();
        }
        this.b.d(q0Var3, this.w);
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

    public void setChildDrawingOrderCallback(t0 t0Var) {
        if (t0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(t0Var != null);
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

    public void setEdgeEffectFactory(u0 u0Var) {
        u0Var.getClass();
        this.Q = u0Var;
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

    public void setItemAnimator(v0 v0Var) {
        v0 v0Var2 = this.V;
        if (v0Var2 != null) {
            v0Var2.g();
            this.V.a = null;
        }
        this.V = v0Var;
        if (v0Var != null) {
            v0Var.a = this.u0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        e1 e1Var = this.b;
        e1Var.a = i10;
        e1Var.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(x0 x0Var) {
        if (x0Var == this.x) {
            return;
        }
        B0();
        x0 x0Var2 = this.x;
        e1 e1Var = this.b;
        if (x0Var2 != null) {
            v0 v0Var = this.V;
            if (v0Var != null) {
                v0Var.g();
            }
            this.x.g0(e1Var);
            this.x.h0(e1Var);
            ((ArrayList) e1Var.c).clear();
            e1Var.e();
            if (this.C) {
                this.x.getClass();
            }
            this.x.t0(null);
            this.x = null;
        } else {
            ((ArrayList) e1Var.c).clear();
            e1Var.e();
        }
        this.e.x();
        this.x = x0Var;
        if (x0Var != null) {
            if (x0Var.b != null) {
                throw new IllegalArgumentException("LayoutManager " + x0Var + " is already attached to a RecyclerView:" + x0Var.b.C());
            }
            x0Var.t0(this);
            if (this.C) {
                this.x.getClass();
            }
        }
        e1Var.l();
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
            r0.b0.k(viewGroup);
        }
        scrollingChildHelper.d = z10;
    }

    @Deprecated
    public void setOnScrollListener(b1 b1Var) {
        this.q0 = b1Var;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.l0 = z10;
    }

    public void setRecycledViewPool(d1 d1Var) {
        e1 e1Var = this.b;
        if (((d1) e1Var.g) != null) {
            r1.b--;
        }
        e1Var.g = d1Var;
        if (d1Var == null || ((RecyclerView) e1Var.h).getAdapter() == null) {
            return;
        }
        ((d1) e1Var.g).b++;
    }

    public void setScrollState(int i10) {
        k1 k1Var;
        if (i10 == this.W) {
            return;
        }
        this.W = i10;
        if (i10 != 2) {
            n1 n1Var = this.m0;
            RecyclerView recyclerView = n1Var.h;
            if (recyclerView.J0) {
                recyclerView.removeCallbacks(n1Var);
                n1Var.c.abortAnimation();
            }
            x0 x0Var = this.x;
            if (x0Var != null && (k1Var = x0Var.e) != null) {
                k1Var.h();
            }
        }
        x0 x0Var2 = this.x;
        if (x0Var2 != null) {
            x0Var2.f0();
        }
        j0(i10);
        b1 b1Var = this.q0;
        if (b1Var != null) {
            b1Var.a(this, i10);
        }
        ArrayList arrayList = this.r0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b1) this.r0.get(size)).a(this, i10);
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

    public void setViewCacheExtension(m1 m1Var) {
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
        u1 u1Var;
        View F;
        boolean z10;
        l1 l1Var = this.p0;
        l1Var.a(1);
        D(l1Var);
        l1Var.i = false;
        y0();
        b bVar = this.f;
        f fVar = (f) bVar.b;
        f fVar2 = (f) bVar.b;
        fVar.clear();
        h hVar = (h) bVar.c;
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
        l1Var.j = z12;
        l1Var.k = z12 && z11 && !this.M && this.V != null && this.x.y0();
        o1 o1Var = null;
        View focusedChild = (this.l0 && hasFocus() && this.w != null) ? getFocusedChild() : null;
        if (focusedChild != null && (F = F(focusedChild)) != null) {
            o1Var = T(F);
        }
        if (o1Var == null) {
            l1Var.m = -1L;
            l1Var.l = -1;
            l1Var.n = -1;
        } else {
            l1Var.m = this.w.b ? o1Var.e : -1L;
            l1Var.l = this.M ? -1 : o1Var.j() ? o1Var.d : o1Var.b();
            View view = o1Var.a;
            int id2 = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id2 = view.getId();
                }
            }
            l1Var.n = id2;
        }
        l1Var.h = l1Var.j && this.t0;
        this.t0 = false;
        this.s0 = false;
        l1Var.g = l1Var.k;
        l1Var.e = this.w.h();
        I(this.x0);
        if (l1Var.j) {
            int o10 = this.e.o();
            for (int i10 = 0; i10 < o10; i10++) {
                o1 U = U(this.e.n(i10));
                if (!U.r() && (!U.h() || this.w.b)) {
                    p l10 = this.V.l(l1Var, U, v0.b(U), U.d());
                    u1 u1Var2 = (u1) fVar2.get(U);
                    if (u1Var2 == null) {
                        u1Var2 = u1.a();
                        fVar2.put(U, u1Var2);
                    }
                    u1Var2.b = l10;
                    u1Var2.a |= 4;
                    if (l1Var.h && U.m() && !U.j() && !U.r() && !U.h()) {
                        hVar.k(U, Q(U));
                    }
                }
            }
        }
        if (l1Var.k) {
            int t10 = this.e.t();
            for (int i11 = 0; i11 < t10; i11++) {
                o1 U2 = U(this.e.s(i11));
                if (!U2.r()) {
                    if (U2.d == -1) {
                        U2.d = U2.c;
                    }
                    U2.h = U2.c;
                }
            }
            boolean z13 = l1Var.f;
            l1Var.f = false;
            this.x.b0(this.b, l1Var);
            l1Var.f = z13;
            for (int i12 = 0; i12 < this.e.o(); i12++) {
                o1 U3 = U(this.e.n(i12));
                if (!U3.r() && ((u1Var = (u1) fVar2.get(U3)) == null || (u1Var.a & 4) == 0)) {
                    int b10 = v0.b(U3);
                    boolean e9 = U3.e(8192);
                    if (!e9) {
                        b10 |= 4096;
                    }
                    p l11 = this.V.l(l1Var, U3, b10, U3.d());
                    if (e9) {
                        n0(U3, l11);
                    } else {
                        u1 u1Var3 = (u1) fVar2.get(U3);
                        if (u1Var3 == null) {
                            u1Var3 = u1.a();
                            fVar2.put(U3, u1Var3);
                        }
                        u1Var3.a |= 2;
                        u1Var3.b = l11;
                    }
                }
            }
            n();
        } else {
            n();
        }
        h0(true);
        z0(false);
        l1Var.d = 2;
    }

    public final void t0(int i10, int i11, int[] iArr) {
        o1 o1Var;
        y0();
        g0();
        int i12 = g.a;
        Trace.beginSection("RV Scroll");
        l1 l1Var = this.p0;
        D(l1Var);
        e1 e1Var = this.b;
        int m0 = i10 != 0 ? this.x.m0(i10, e1Var, l1Var) : 0;
        int o02 = i11 != 0 ? this.x.o0(i11, e1Var, l1Var) : 0;
        Trace.endSection();
        n nVar = this.e;
        int o10 = nVar.o();
        for (int i13 = 0; i13 < o10; i13++) {
            View n10 = nVar.n(i13);
            o1 T = T(n10);
            if (T != null && (o1Var = T.k) != null) {
                View view = o1Var.a;
                int left = n10.getLeft();
                int top = n10.getTop();
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
        l1 l1Var = this.p0;
        l1Var.a(6);
        this.d.d();
        l1Var.e = this.w.h();
        l1Var.c = 0;
        l1Var.g = false;
        this.x.b0(this.b, l1Var);
        l1Var.f = false;
        this.c = null;
        l1Var.j = l1Var.j && this.V != null;
        l1Var.d = 4;
        h0(true);
        z0(false);
    }

    public final void u0(int i10) {
        if (this.H) {
            return;
        }
        B0();
        x0 x0Var = this.x;
        if (x0Var == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            x0Var.n0(i10);
            awakenScrollBars();
        }
    }

    public boolean v(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, i12, iArr, iArr2);
    }

    public final void v0(int i10, int i11, Interpolator interpolator) {
        x0 x0Var = this.x;
        if (x0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.H) {
            return;
        }
        if (!x0Var.d()) {
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
        b1 b1Var = this.q0;
        if (b1Var != null) {
            b1Var.b(this, i10, i11);
        }
        ArrayList arrayList = this.r0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b1) this.r0.get(size)).b(this, i10, i11);
            }
        }
        this.P--;
    }

    public final void x0(int i10) {
        if (this.H) {
            return;
        }
        x0 x0Var = this.x;
        if (x0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            x0Var.v0(this, this.p0, i10);
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

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        x0 x0Var = this.x;
        if (x0Var != null) {
            return x0Var.p(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + C());
    }

    public void f0(View view) {
    }

    public void j0(int i10) {
    }

    public void setOnFlingListener(z0 z0Var) {
    }

    public void setRecyclerListener(f1 f1Var) {
    }

    public void k0(int i10, int i11) {
    }
}
