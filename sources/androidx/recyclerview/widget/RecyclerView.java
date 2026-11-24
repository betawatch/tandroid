package androidx.recyclerview.widget;

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
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] R0 = {R.attr.clipToPadding};
    public static final oe3 S0 = new oe3(3);
    public final g29 A0;
    public boolean B0;
    public u49 C0;
    public final int[] D0;
    public final ArrayList E;
    public ri7 E0;
    public final ArrayList F;
    public final int[] F0;
    public h49 G;
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
    public final t39 M0;
    public boolean N;
    public final u39 N0;
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
    public a49 V;
    public EdgeEffect W;
    public final nr7 a;
    public EdgeEffect a0;
    public final wg2 b;
    public EdgeEffect b0;
    public m49 c;
    public EdgeEffect c0;
    public final ha d;
    public b49 d0;
    public final mv6 e;
    public int e0;
    public final v8b f;
    public int f0;
    public VelocityTracker g0;
    public boolean h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public g49 m0;
    public final t39 n;
    public final int n0;
    public final int o0;
    public final float p0;
    public final float q0;
    public final Rect r;
    public boolean r0;
    public final Rect s;
    public final r49 s0;
    public yr4 t0;
    public final on u0;
    public final p49 v0;
    public final RectF w;
    public i49 w0;
    public w39 x;
    public ArrayList x0;
    public d49 y;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float a;
        Object[] objArr = 0;
        this.a = new nr7(this, (byte) 2);
        this.b = new wg2(this);
        this.f = new v8b((byte) 4);
        this.n = new t39(this, 0 == true ? 1 : 0);
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
        this.V = new a49();
        this.d0 = new gb3();
        this.e0 = 0;
        this.f0 = -1;
        this.p0 = Float.MIN_VALUE;
        this.q0 = Float.MIN_VALUE;
        byte b = 1;
        this.r0 = true;
        this.s0 = new r49(this);
        this.u0 = new on();
        p49 p49Var = new p49();
        p49Var.a = -1;
        p49Var.b = 0;
        p49Var.c = 0;
        p49Var.d = (byte) 1;
        p49Var.e = 0;
        p49Var.f = false;
        p49Var.g = false;
        p49Var.h = false;
        p49Var.i = false;
        p49Var.j = false;
        p49Var.k = false;
        this.v0 = p49Var;
        this.y0 = false;
        this.z0 = false;
        g29 g29Var = new g29(this, b);
        this.A0 = g29Var;
        this.B0 = false;
        this.D0 = new int[2];
        this.F0 = new int[2];
        this.G0 = new int[2];
        this.H0 = 0;
        this.I0 = 0;
        this.J0 = null;
        this.K0 = new int[2];
        this.L0 = new ArrayList();
        this.M0 = new t39(this, b);
        this.N0 = new u39(this, 0 == true ? 1 : 0);
        this.P0 = true;
        this.Q0 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R0, 0, 0);
            this.h = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.h = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.l0 = viewConfiguration.getScaledTouchSlop();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            Method method = kdc.a;
            a = no5.d(viewConfiguration);
        } else {
            a = kdc.a(viewConfiguration, context);
        }
        this.p0 = a;
        this.q0 = i >= 26 ? no5.e(viewConfiguration) : kdc.a(viewConfiguration, context);
        this.n0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.o0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.d0.a = g29Var;
        this.d = new ha(new v39(this, objArr == true ? 1 : 0));
        this.e = new mv6(new ln8((Object) this, (byte) 3));
        WeakHashMap weakHashMap = jdc.a;
        if ((i >= 26 ? ddc.a(this) : 0) == 0 && i >= 26) {
            ddc.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.P = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new u49(this));
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
        for (int i = 0; i < childCount; i++) {
            RecyclerView J = J(viewGroup.getChildAt(i));
            if (J != null) {
                return J;
            }
        }
        return null;
    }

    public static int R(View view) {
        s49 U = U(view);
        if (U != null) {
            return U.b();
        }
        return -1;
    }

    public static int S(View view) {
        s49 U = U(view);
        if (U != null) {
            return U.c();
        }
        return -1;
    }

    public static s49 U(View view) {
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof e49) {
            return ((e49) layoutParams).a;
        }
        return null;
    }

    public static void V(View view, Rect rect) {
        e49 e49Var = (e49) view.getLayoutParams();
        Rect rect2 = e49Var.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) e49Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) e49Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) e49Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) e49Var).bottomMargin);
    }

    private ri7 getScrollingChildHelper() {
        ri7 ri7Var = this.E0;
        if (ri7Var != null) {
            return ri7Var;
        }
        ri7 ri7Var2 = new ri7(this);
        this.E0 = ri7Var2;
        return ri7Var2;
    }

    public static void m(s49 s49Var) {
        WeakReference weakReference = s49Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == s49Var.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            s49Var.b = null;
        }
    }

    public final void A() {
        if (this.b0 != null) {
            return;
        }
        EdgeEffect a = this.V.a(this, 2);
        this.b0 = a;
        if (this.h) {
            a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
        k(this.b0);
    }

    public final void A0() {
        int i = this.K + 1;
        this.K = i;
        if (i != 1 || this.M) {
            return;
        }
        this.L = false;
    }

    public final void B() {
        if (this.a0 != null) {
            return;
        }
        EdgeEffect a = this.V.a(this, 1);
        this.a0 = a;
        if (this.h) {
            a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
        k(this.a0);
    }

    public final void B0(boolean z) {
        int i = this.K;
        if (i < 1) {
            this.K = 1;
            i = 1;
        }
        if (!z && !this.M) {
            this.L = false;
        }
        if (i == 1) {
            if (z && this.L && !this.M && this.y != null && this.x != null) {
                s();
            }
            if (!this.M) {
                this.L = false;
            }
        }
        this.K--;
    }

    public final String C() {
        StringBuilder sb = new StringBuilder(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.x);
        sb.append(", layout:");
        sb.append(this.y);
        sb.append(", context:");
        sb.append(getContext());
        sb.append(", ainfo:");
        sb.append(this.O0);
        ArrayList arrayList = (ArrayList) this.d.f;
        StringBuilder sb2 = new StringBuilder();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (size < arrayList.size() - 1) {
                sb2.append("\n\n");
            }
            sb2.append((String) arrayList.get(size));
        }
        String sb3 = sb2.toString();
        sb.append(", last notifies:\n");
        sb.append(sb3);
        return sb.toString();
    }

    public final void C0(int i) {
        getScrollingChildHelper().h(i);
    }

    public final void D(p49 p49Var) {
        if (getScrollState() != 2) {
            p49Var.getClass();
            return;
        }
        OverScroller overScroller = this.s0.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        p49Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public void D0() {
        o49 o49Var;
        setScrollState(0);
        r49 r49Var = this.s0;
        RecyclerView recyclerView = r49Var.h;
        if (recyclerView.P0) {
            recyclerView.removeCallbacks(r49Var);
            r49Var.c.abortAnimation();
        }
        d49 d49Var = this.y;
        if (d49Var == null || (o49Var = d49Var.e) == null) {
            return;
        }
        o49Var.h();
    }

    public View E(float f, float f2) {
        mv6 mv6Var = this.e;
        for (int J = mv6Var.J() - 1; J >= 0; J--) {
            View I = mv6Var.I(J);
            float translationX = I.getTranslationX();
            float translationY = I.getTranslationY();
            if (f >= I.getLeft() + translationX && f <= I.getRight() + translationX && f2 >= I.getTop() + translationY && f2 <= I.getBottom() + translationY) {
                return I;
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

    public final s49 G(View view) {
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
        for (int i = 0; i < size; i++) {
            h49 h49Var = (h49) arrayList.get(i);
            if (h49Var.b(this, motionEvent) && action != 3) {
                this.G = h49Var;
                return true;
            }
        }
        return false;
    }

    public final void I(int[] iArr) {
        mv6 mv6Var = this.e;
        int J = mv6Var.J();
        if (J == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i2 = TLObject.FLAG_31;
        for (int i3 = 0; i3 < J; i3++) {
            s49 U = U(mv6Var.I(i3));
            if (U != null && !U.r()) {
                int c = U.c();
                if (c < i) {
                    i = c;
                }
                if (c > i2) {
                    i2 = c;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final s49 K(int i) {
        s49 s49Var = null;
        if (this.R) {
            return null;
        }
        mv6 mv6Var = this.e;
        int R = mv6Var.R();
        for (int i2 = 0; i2 < R; i2++) {
            s49 U = U(mv6Var.Q(i2));
            if (U != null && !U.j() && N(U) == i) {
                if (!((ArrayList) mv6Var.d).contains(U.a)) {
                    return U;
                }
                s49Var = U;
            }
        }
        return s49Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s49 L(int i, boolean z) {
        mv6 mv6Var = this.e;
        int R = mv6Var.R();
        s49 s49Var = null;
        for (int i2 = 0; i2 < R; i2++) {
            s49 U = U(mv6Var.Q(i2));
            if (U != null && !U.j()) {
                if (z) {
                    if (U.c != i) {
                        continue;
                    }
                    if (((ArrayList) mv6Var.d).contains(U.a)) {
                        return U;
                    }
                    s49Var = U;
                } else {
                    if (U.c() != i) {
                        continue;
                    }
                    if (((ArrayList) mv6Var.d).contains(U.a)) {
                    }
                }
            }
        }
        return s49Var;
    }

    public final void M(vs2 vs2Var) {
        for (int i = 0; i < getChildCount(); i++) {
            vs2Var.accept(getChildAt(i));
        }
        for (int i2 = 0; i2 < getHiddenChildCount(); i2++) {
            vs2Var.accept(W(i2));
        }
        for (int i3 = 0; i3 < getAttachedScrapChildCount(); i3++) {
            vs2Var.accept(O(i3));
        }
    }

    public final int N(s49 s49Var) {
        if (s49Var.e(524) || !s49Var.g()) {
            return -1;
        }
        int i = s49Var.c;
        ArrayList arrayList = (ArrayList) this.d.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ga gaVar = (ga) arrayList.get(i2);
            byte b = gaVar.a;
            if (b != 1) {
                if (b == 2) {
                    int i3 = gaVar.b;
                    if (i3 <= i) {
                        int i4 = gaVar.d;
                        if (i3 + i4 > i) {
                            return -1;
                        }
                        i -= i4;
                    } else {
                        continue;
                    }
                } else if (b == 8) {
                    int i5 = gaVar.b;
                    if (i5 == i) {
                        i = gaVar.d;
                    } else {
                        if (i5 < i) {
                            i--;
                        }
                        if (gaVar.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (gaVar.b <= i) {
                i += gaVar.d;
            }
        }
        return i;
    }

    public final View O(int i) {
        if (i < 0) {
            return null;
        }
        wg2 wg2Var = this.b;
        if (i < ((ArrayList) wg2Var.c).size()) {
            return ((s49) ((ArrayList) wg2Var.c).get(i)).a;
        }
        return null;
    }

    public final View P(int i) {
        if (i < 0) {
            return null;
        }
        wg2 wg2Var = this.b;
        if (i < ((ArrayList) wg2Var.e).size()) {
            return ((s49) ((ArrayList) wg2Var.e).get(i)).a;
        }
        return null;
    }

    public final long Q(s49 s49Var) {
        return this.x.b ? s49Var.e : s49Var.c;
    }

    public final s49 T(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return U(view);
        }
        k32.h("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final View W(int i) {
        ArrayList arrayList = (ArrayList) this.e.d;
        if (i < 0 || i >= arrayList.size()) {
            return null;
        }
        return (View) arrayList.get(i);
    }

    public final Rect X(View view) {
        e49 e49Var = (e49) view.getLayoutParams();
        boolean z = e49Var.c;
        Rect rect = e49Var.b;
        if (z) {
            p49 p49Var = this.v0;
            if (!p49Var.g || (!e49Var.a.m() && !e49Var.a.h())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.E;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect2 = this.r;
                    rect2.set(0, 0, 0, 0);
                    ((c49) arrayList.get(i)).e(rect2, view, this, p49Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                e49Var.c = false;
                return rect;
            }
        }
        return rect;
    }

    public final c49 Y(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return (c49) this.E.get(i);
        }
        k93.i(tb4.m(i, itemDecorationCount, " is an invalid index for size "));
        return null;
    }

    public final void Z(long j, s49 s49Var, s49 s49Var2) {
        mv6 mv6Var = this.e;
        int J = mv6Var.J();
        for (int i = 0; i < J; i++) {
            s49 U = U(mv6Var.I(i));
            if (U != s49Var && Q(U) == j) {
                w39 w39Var = this.x;
                if (w39Var == null || !w39Var.b) {
                    StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(U);
                    sb.append(" \n View Holder 2:");
                    sb.append(s49Var);
                    fyb.k(sb, C());
                    return;
                }
                StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(U);
                sb2.append(" \n View Holder 2:");
                sb2.append(s49Var);
                fyb.k(sb2, C());
                return;
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + s49Var2 + " cannot be found but it is necessary for " + s49Var + C());
    }

    public final boolean a0() {
        return !this.J || this.R || this.d.g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        d49 d49Var = this.y;
        if (d49Var != null) {
            d49Var.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0() {
        if (this.E.size() == 0) {
            return;
        }
        d49 d49Var = this.y;
        if (d49Var != null) {
            d49Var.b("Cannot invalidate item decorations during a scroll or layout");
        }
        f0();
        requestLayout();
    }

    public final boolean c0() {
        b49 b49Var = this.d0;
        return b49Var != null && b49Var.k();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e49) && this.y.f((e49) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        d49 d49Var = this.y;
        if (d49Var == null || !d49Var.d()) {
            return 0;
        }
        return ((t26) this.y).A0(this.v0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        d49 d49Var = this.y;
        if (d49Var == null || !d49Var.d()) {
            return 0;
        }
        return this.y.h(this.v0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        d49 d49Var = this.y;
        if (d49Var == null || !d49Var.d()) {
            return 0;
        }
        return this.y.i(this.v0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        d49 d49Var = this.y;
        if (d49Var == null || !d49Var.e()) {
            return 0;
        }
        return this.y.j(this.v0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        d49 d49Var = this.y;
        if (d49Var == null || !d49Var.e()) {
            return 0;
        }
        return this.y.k(this.v0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        d49 d49Var = this.y;
        if (d49Var == null || !d49Var.e()) {
            return 0;
        }
        return this.y.l(this.v0);
    }

    public final boolean d0() {
        return this.T > 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().d(i, i2, i3, i4, iArr, 0, null);
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
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((c49) arrayList.get(i)).g(canvas, this);
        }
        Integer num = this.J0;
        if (num == null || num.intValue() != 0) {
            EdgeEffect edgeEffect = this.W;
            if (edgeEffect == null || edgeEffect.isFinished()) {
                z = false;
            } else {
                int save = canvas.save();
                int paddingBottom = this.h ? getPaddingBottom() : 0;
                canvas.rotate(270.0f);
                canvas.translate((-getHeight()) + paddingBottom, 0.0f);
                EdgeEffect edgeEffect2 = this.W;
                z = edgeEffect2 != null && edgeEffect2.draw(canvas);
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
                z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
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
                z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
                canvas.restoreToCount(save3);
            }
            EdgeEffect edgeEffect7 = this.c0;
            if (edgeEffect7 == null || edgeEffect7.isFinished()) {
                z2 = z;
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
                    z2 = true;
                }
                z2 |= z;
                canvas.restoreToCount(save4);
            }
        }
        if ((z2 || this.d0 == null || arrayList.size() <= 0 || !this.d0.k()) ? z2 : true) {
            WeakHashMap weakHashMap = jdc.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0(int i) {
        if (this.y == null) {
            return;
        }
        setScrollState(2);
        this.y.m0(i);
        awakenScrollBars();
    }

    public final void f0() {
        mv6 mv6Var = this.e;
        int R = mv6Var.R();
        for (int i = 0; i < R; i++) {
            ((e49) mv6Var.Q(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = (ArrayList) this.b.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            e49 e49Var = (e49) ((s49) arrayList.get(i2)).a.getLayoutParams();
            if (e49Var != null) {
                e49Var.c = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0190, code lost:
    
        if ((r5 * r6) >= 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015c, code lost:
    
        if (r16 > 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017a, code lost:
    
        if (r5 > 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017d, code lost:
    
        if (r16 < 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0180, code lost:
    
        if (r5 < 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0188, code lost:
    
        if ((r5 * r6) <= 0) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018b  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        View view2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        char c;
        boolean z;
        this.y.getClass();
        boolean z2 = (this.x == null || this.y == null || d0() || this.M) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        p49 p49Var = this.v0;
        wg2 wg2Var = this.b;
        if (z2 && (i == 2 || i == 1)) {
            if (this.y.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? kk7.N1 : 33) == null) {
                    z = true;
                    if (!z && this.y.d()) {
                        RecyclerView recyclerView = this.y.b;
                        WeakHashMap weakHashMap = jdc.a;
                        z = focusFinder.findNextFocus(this, view, !((i != 2) ^ (recyclerView.getLayoutDirection() != 1)) ? 66 : 17) != null;
                    }
                    if (z) {
                        p();
                        if (F(view) != null) {
                            A0();
                            this.y.Q(view, i, wg2Var, p49Var);
                            B0(false);
                        }
                        return null;
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
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
                            RecyclerView recyclerView2 = this.y.b;
                            WeakHashMap weakHashMap2 = jdc.a;
                            if (recyclerView2.getLayoutDirection() != 1) {
                            }
                            i2 = rect.left;
                            i3 = rect2.left;
                            if (i2 >= i3) {
                            }
                            i5 = 1;
                            i6 = rect.top;
                            i7 = rect2.top;
                            if (i6 >= i7) {
                            }
                            c = 1;
                            if (i == 1) {
                            }
                        }
                        return view2;
                    }
                    return super.focusSearch(view, i);
                }
            }
            z = false;
            if (!z) {
                RecyclerView recyclerView3 = this.y.b;
                WeakHashMap weakHashMap3 = jdc.a;
                if (recyclerView3.getLayoutDirection() != 1) {
                }
                if (focusFinder.findNextFocus(this, view, !((i != 2) ^ (recyclerView3.getLayoutDirection() != 1)) ? 66 : 17) != null) {
                }
            }
            if (z) {
            }
            view2 = focusFinder.findNextFocus(this, view, i);
            if (view2 == null) {
            }
            if (view2 != null) {
            }
            return super.focusSearch(view, i);
        }
        View findNextFocus = focusFinder.findNextFocus(this, view, i);
        if (findNextFocus == null && z2) {
            p();
            if (F(view) != null) {
                A0();
                view2 = this.y.Q(view, i, wg2Var, p49Var);
                B0(false);
            }
            return null;
        }
        view2 = findNextFocus;
        if (view2 == null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            s0(view2, null);
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
                RecyclerView recyclerView22 = this.y.b;
                WeakHashMap weakHashMap22 = jdc.a;
                int i9 = recyclerView22.getLayoutDirection() != 1 ? -1 : 1;
                i2 = rect3.left;
                i3 = rect22.left;
                if ((i2 >= i3 || (i4 = rect3.right) <= i3) && (i4 = rect3.right) < rect22.right) {
                    i5 = 1;
                } else {
                    int i10 = rect22.right;
                    i5 = ((i4 > i10 || i2 >= i10) && i2 > i3) ? -1 : 0;
                }
                i6 = rect3.top;
                i7 = rect22.top;
                if ((i6 >= i7 || (i8 = rect3.bottom) <= i7) && (i8 = rect3.bottom) < rect22.bottom) {
                    c = 1;
                } else {
                    int i11 = rect22.bottom;
                    c = ((i8 > i11 || i6 >= i11) && i6 > i7) ? (char) 65535 : (char) 0;
                }
                if (i == 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i != 66) {
                                    if (i != 130) {
                                        throw new IllegalArgumentException("Invalid direction: " + i + C());
                                    }
                                }
                            }
                        }
                    } else if (c <= 0) {
                        if (c == 0) {
                        }
                    }
                } else if (c >= 0) {
                    if (c == 0) {
                    }
                }
            }
            return view2;
        }
        return super.focusSearch(view, i);
    }

    public final void g0(int i, int i2, boolean z) {
        int i3 = i + i2;
        mv6 mv6Var = this.e;
        int R = mv6Var.R();
        for (int i4 = 0; i4 < R; i4++) {
            s49 U = U(mv6Var.Q(i4));
            if (U != null && !U.r()) {
                int i5 = U.c;
                p49 p49Var = this.v0;
                if (i5 >= i3) {
                    U.n(-i2, z);
                    p49Var.f = true;
                } else if (i5 >= i) {
                    U.a(8);
                    U.n(-i2, z);
                    U.c = i - 1;
                    p49Var.f = true;
                }
            }
        }
        wg2 wg2Var = this.b;
        ArrayList arrayList = (ArrayList) wg2Var.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s49 s49Var = (s49) arrayList.get(size);
            if (s49Var != null) {
                int i6 = s49Var.c;
                if (i6 >= i3) {
                    s49Var.n(-i2, z);
                } else if (i6 >= i) {
                    s49Var.a(8);
                    wg2Var.g(size);
                }
            }
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        d49 d49Var = this.y;
        if (d49Var != null) {
            return d49Var.n();
        }
        sc8.j("RecyclerView has no LayoutManager".concat(C()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        d49 d49Var = this.y;
        if (d49Var != null) {
            return d49Var.o(getContext(), attributeSet);
        }
        sc8.j("RecyclerView has no LayoutManager".concat(C()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public w39 getAdapter() {
        return this.x;
    }

    public int getAttachedScrapChildCount() {
        return ((ArrayList) this.b.c).size();
    }

    @Override // android.view.View
    public int getBaseline() {
        d49 d49Var = this.y;
        if (d49Var == null) {
            return super.getBaseline();
        }
        d49Var.getClass();
        return -1;
    }

    public int getBottomGlowOffset() {
        return this.I0;
    }

    public int getCachedChildCount() {
        return ((ArrayList) this.b.e).size();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.h;
    }

    public u49 getCompatAccessibilityDelegate() {
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

    public a49 getEdgeEffectFactory() {
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

    public b49 getItemAnimator() {
        return this.d0;
    }

    public int getItemDecorationCount() {
        return this.E.size();
    }

    public d49 getLayoutManager() {
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

    public g49 getOnFlingListener() {
        return this.m0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.r0;
    }

    public k49 getRecycledViewPool() {
        wg2 wg2Var = this.b;
        k49 k49Var = (k49) wg2Var.g;
        if (k49Var != null) {
            return k49Var;
        }
        k49 k49Var2 = new k49();
        wg2Var.g = k49Var2;
        return k49Var2;
    }

    public int getScrollState() {
        return this.e0;
    }

    public int getTopGlowOffset() {
        return this.H0;
    }

    public final void h(s49 s49Var) {
        View view = s49Var.a;
        boolean z = view.getParent() == this;
        this.b.l(T(view));
        boolean l = s49Var.l();
        mv6 mv6Var = this.e;
        if (l) {
            mv6Var.n(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            mv6Var.m(-1, view, true);
            return;
        }
        int indexOfChild = ((RecyclerView) ((ln8) mv6Var.b).b).indexOfChild(view);
        if (indexOfChild < 0) {
            w26.i(view, "view is not a child, cannot hide ");
        } else {
            ((hg2) mv6Var.c).D(indexOfChild);
            mv6Var.T(view);
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(c49 c49Var) {
        d49 d49Var = this.y;
        if (d49Var != null) {
            d49Var.b("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(c49Var);
        f0();
        requestLayout();
    }

    public final void i0() {
        this.T++;
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

    public final void j(i49 i49Var) {
        ArrayList arrayList = this.x0;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.x0 = arrayList;
        }
        arrayList.add(i49Var);
    }

    public final void j0(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.T - 1;
        this.T = i2;
        if (i2 < 1) {
            this.T = 0;
            if (z) {
                int i3 = this.O;
                this.O = 0;
                if (i3 != 0 && (accessibilityManager = this.P) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.L0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    s49 s49Var = (s49) arrayList.get(size);
                    if (s49Var.a.getParent() == this && !s49Var.r() && (i = s49Var.s) != -1) {
                        View view = s49Var.a;
                        WeakHashMap weakHashMap = jdc.a;
                        view.setImportantForAccessibility(i);
                        s49Var.s = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void k(EdgeEffect edgeEffect) {
        Integer num;
        if (edgeEffect == null || (num = this.J0) == null) {
            return;
        }
        edgeEffect.setColor(num.intValue());
    }

    public final void k0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.j0 = x;
            this.h0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.k0 = y;
            this.i0 = y;
        }
    }

    public final void l(String str) {
        if (!d0()) {
            if (this.U > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(C()));
            }
        } else if (str == null) {
            sc8.j("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(C()));
        } else {
            sc8.j(str);
        }
    }

    public final void n() {
        mv6 mv6Var = this.e;
        int R = mv6Var.R();
        for (int i = 0; i < R; i++) {
            s49 U = U(mv6Var.Q(i));
            if (U != null && !U.r()) {
                U.d = -1;
                U.g = -1;
            }
        }
        wg2 wg2Var = this.b;
        ArrayList arrayList = (ArrayList) wg2Var.c;
        ArrayList arrayList2 = (ArrayList) wg2Var.e;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            s49 s49Var = (s49) arrayList2.get(i2);
            s49Var.d = -1;
            s49Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            s49 s49Var2 = (s49) arrayList.get(i3);
            s49Var2.d = -1;
            s49Var2.g = -1;
        }
        ArrayList arrayList3 = (ArrayList) wg2Var.d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                s49 s49Var3 = (s49) ((ArrayList) wg2Var.d).get(i4);
                s49Var3.d = -1;
                s49Var3.g = -1;
            }
        }
    }

    public final void n0() {
        if (this.B0 || !this.H) {
            return;
        }
        WeakHashMap weakHashMap = jdc.a;
        postOnAnimation(this.M0);
        this.B0 = true;
    }

    public final void o(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.W;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.W.onRelease();
            z = this.W.isFinished();
        }
        EdgeEffect edgeEffect2 = this.b0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.b0.onRelease();
            z |= this.b0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.a0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.a0.onRelease();
            z |= this.a0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.c0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.c0.onRelease();
            z |= this.c0.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = jdc.a;
            postInvalidateOnAnimation();
        }
    }

    public final void o0(boolean z) {
        this.S |= z;
        this.R = true;
        mv6 mv6Var = this.e;
        int R = mv6Var.R();
        for (int i = 0; i < R; i++) {
            s49 U = U(mv6Var.Q(i));
            if (U != null && !U.r()) {
                U.a(6);
            }
        }
        f0();
        wg2 wg2Var = this.b;
        ArrayList arrayList = (ArrayList) wg2Var.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            s49 s49Var = (s49) arrayList.get(i2);
            if (s49Var != null) {
                s49Var.a(6);
                s49Var.a(1024);
            }
        }
        w39 w39Var = ((RecyclerView) wg2Var.h).x;
        if (w39Var == null || !w39Var.b) {
            wg2Var.f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        if (r1 < 30.0f) goto L14;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        float f;
        super.onAttachedToWindow();
        this.T = 0;
        this.H = true;
        this.J = this.J && !isLayoutRequested();
        this.B0 = false;
        ThreadLocal threadLocal = yr4.e;
        yr4 yr4Var = (yr4) threadLocal.get();
        this.t0 = yr4Var;
        if (yr4Var == null) {
            yr4 yr4Var2 = new yr4();
            yr4Var2.a = new ArrayList();
            yr4Var2.d = new ArrayList();
            this.t0 = yr4Var2;
            WeakHashMap weakHashMap = jdc.a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            yr4 yr4Var3 = this.t0;
            yr4Var3.c = (long) (1.0E9f / f);
            threadLocal.set(yr4Var3);
        }
        this.t0.a.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b49 b49Var = this.d0;
        if (b49Var != null) {
            b49Var.g();
        }
        D0();
        this.H = false;
        this.L0.clear();
        removeCallbacks(this.M0);
        this.f.getClass();
        while (ndc.d.U() != null) {
        }
        yr4 yr4Var = this.t0;
        if (yr4Var != null) {
            yr4Var.a.remove(this);
            this.t0 = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((c49) arrayList.get(i)).f(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.y != null && !this.M && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.y.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.y.d()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (f == 0.0f || f2 != 0.0f) {
                        u0((int) (f2 * this.p0), (int) (f * this.q0), motionEvent);
                    }
                }
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                u0((int) (f2 * this.p0), (int) (f * this.q0), motionEvent);
            } else {
                if ((motionEvent.getSource() & TLObject.FLAG_22) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.y.e()) {
                        f = -axisValue;
                        f2 = 0.0f;
                        if (f == 0.0f) {
                        }
                        u0((int) (f2 * this.p0), (int) (f * this.q0), motionEvent);
                    } else if (this.y.d()) {
                        f2 = axisValue;
                        f = 0.0f;
                        if (f == 0.0f) {
                        }
                        u0((int) (f2 * this.p0), (int) (f * this.q0), motionEvent);
                    }
                }
                f = 0.0f;
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                u0((int) (f2 * this.p0), (int) (f * this.q0), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.M) {
            this.G = null;
            if (H(motionEvent)) {
                t0();
                setScrollState(0);
                return true;
            }
            d49 d49Var = this.y;
            if (d49Var != null) {
                boolean d = d49Var.d();
                boolean e = this.y.e();
                VelocityTracker velocityTracker = this.g0;
                if (velocityTracker == null) {
                    velocityTracker = VelocityTracker.obtain();
                    this.g0 = velocityTracker;
                }
                velocityTracker.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.N) {
                        this.N = false;
                    }
                    this.f0 = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.j0 = x;
                    this.h0 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.k0 = y;
                    this.i0 = y;
                    if (this.e0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        C0(1);
                    }
                    int[] iArr = this.G0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = d;
                    if (e) {
                        i = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i, 0);
                } else if (actionMasked == 1) {
                    this.g0.clear();
                    C0(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f0);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.e0 != 1) {
                        int i2 = x2 - this.h0;
                        int i3 = y2 - this.i0;
                        if (d == 0 || Math.abs(i2) <= this.l0) {
                            z = false;
                        } else {
                            this.j0 = x2;
                            z = true;
                        }
                        if (e && Math.abs(i3) > this.l0) {
                            this.k0 = y2;
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    t0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f0 = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.j0 = x3;
                    this.h0 = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.k0 = y3;
                    this.i0 = y3;
                } else if (actionMasked == 6) {
                    k0(motionEvent);
                }
                if (this.e0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = mxb.a;
        Trace.beginSection("RV OnLayout");
        s();
        Trace.endSection();
        this.J = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.y == null) {
            q(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        d49 d49Var = this.y;
        wg2 wg2Var = this.b;
        p49 p49Var = this.v0;
        d49Var.c0(wg2Var, p49Var, i, i2);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.x == null) {
            return;
        }
        if (p49Var.d == 1) {
            t();
        }
        this.y.p0(i, i2);
        p49Var.i = true;
        u();
        this.y.r0(i, i2);
        t26 t26Var = (t26) this.y;
        if (t26Var.l == 1073741824 || t26Var.k == 1073741824) {
            return;
        }
        int r = t26Var.r();
        for (int i3 = 0; i3 < r; i3++) {
            ViewGroup.LayoutParams layoutParams = t26Var.q(i3).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                this.y.p0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                p49Var.i = true;
                u();
                this.y.r0(i, i2);
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (d0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof m49)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m49 m49Var = (m49) parcelable;
        this.c = m49Var;
        super.onRestoreInstanceState(m49Var.a);
        d49 d49Var = this.y;
        if (d49Var == null || (parcelable2 = this.c.c) == null) {
            return;
        }
        t26 t26Var = (t26) d49Var;
        if (parcelable2 instanceof s26) {
            t26Var.B = (s26) parcelable2;
            t26Var.k0();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        m49 m49Var = new m49(super.onSaveInstanceState());
        m49 m49Var2 = this.c;
        if (m49Var2 != null) {
            m49Var.c = m49Var2.c;
            return m49Var;
        }
        d49 d49Var = this.y;
        if (d49Var != null) {
            m49Var.c = d49Var.d0();
            return m49Var;
        }
        m49Var.c = null;
        return m49Var;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.c0 = null;
        this.a0 = null;
        this.b0 = null;
        this.W = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0132  */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.M && !this.N) {
            h49 h49Var = this.G;
            if (h49Var == null) {
                z = motionEvent.getAction() == 0 ? false : H(motionEvent);
            } else {
                h49Var.a(this, motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.G = null;
                }
                z = true;
            }
            if (z) {
                t0();
                setScrollState(0);
                return true;
            }
            d49 d49Var = this.y;
            if (d49Var != null) {
                boolean d = d49Var.d();
                boolean e = this.y.e();
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
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.j0 = x;
                    this.h0 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.k0 = y;
                    this.i0 = y;
                    int i = d;
                    if (e) {
                        i = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i, 0);
                } else {
                    if (actionMasked == 1) {
                        this.g0.addMovement(obtain);
                        VelocityTracker velocityTracker = this.g0;
                        int i2 = this.o0;
                        velocityTracker.computeCurrentVelocity(1000, i2);
                        float f = d != 0 ? -this.g0.getXVelocity(this.f0) : 0.0f;
                        float f2 = e ? -this.g0.getYVelocity(this.f0) : 0.0f;
                        if (f != 0.0f || f2 != 0.0f) {
                            int i3 = (int) f;
                            int i4 = (int) f2;
                            d49 d49Var2 = this.y;
                            if (d49Var2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.M) {
                                int d2 = d49Var2.d();
                                boolean e2 = this.y.e();
                                int i5 = this.n0;
                                if (d2 == 0 || Math.abs(i3) < i5) {
                                    i3 = 0;
                                }
                                if (!e2 || Math.abs(i4) < i5) {
                                    i4 = 0;
                                }
                                if (i3 != 0 || i4 != 0) {
                                    float f3 = i3;
                                    float f4 = i4;
                                    if (!dispatchNestedPreFling(f3, f4)) {
                                        boolean z3 = d2 != 0 || e2;
                                        dispatchNestedFling(f3, f4, z3);
                                        g49 g49Var = this.m0;
                                        if (g49Var == null || !g49Var.a(i3, i4)) {
                                            if (z3) {
                                                if (e2) {
                                                    d2 = (d2 == true ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().g(d2, 1);
                                                int i6 = -i2;
                                                int max = Math.max(i6, Math.min(i3, i2));
                                                int max2 = Math.max(i6, Math.min(i4, i2));
                                                r49 r49Var = this.s0;
                                                RecyclerView recyclerView = r49Var.h;
                                                recyclerView.setScrollState(2);
                                                r49Var.b = 0;
                                                r49Var.a = 0;
                                                Interpolator interpolator = r49Var.d;
                                                oe3 oe3Var = S0;
                                                if (interpolator != oe3Var) {
                                                    r49Var.d = oe3Var;
                                                    r49Var.c = new OverScroller(recyclerView.getContext(), oe3Var);
                                                }
                                                r49Var.c.fling(0, 0, max, max2, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                r49Var.a();
                                            }
                                        }
                                        t0();
                                        obtain.recycle();
                                        return true;
                                    }
                                }
                            }
                        }
                        setScrollState(0);
                        t0();
                        obtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f0);
                        if (findPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f0 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i7 = this.j0 - x2;
                        int i8 = this.k0 - y2;
                        int[] iArr2 = this.K0;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        boolean v = v(i7, i8, 0, iArr2, this.F0);
                        int[] iArr3 = this.F0;
                        if (v) {
                            i7 -= iArr2[0];
                            i8 -= iArr2[1];
                            obtain.offsetLocation(iArr3[0], iArr3[1]);
                            iArr[0] = iArr[0] + iArr3[0];
                            iArr[1] = iArr[1] + iArr3[1];
                        }
                        if (this.e0 != 1) {
                            if (d != 0) {
                                int abs = Math.abs(i7);
                                int i9 = this.l0;
                                if (abs > i9) {
                                    i7 = i7 > 0 ? i7 - i9 : i7 + i9;
                                    z2 = true;
                                    if (e) {
                                        int abs2 = Math.abs(i8);
                                        int i10 = this.l0;
                                        if (abs2 > i10) {
                                            i8 = i8 > 0 ? i8 - i10 : i8 + i10;
                                            z2 = true;
                                        }
                                    }
                                    if (z2) {
                                        setScrollState(1);
                                    }
                                }
                            }
                            z2 = false;
                            if (e) {
                            }
                            if (z2) {
                            }
                        }
                        if (this.e0 == 1) {
                            this.j0 = x2 - iArr3[0];
                            this.k0 = y2 - iArr3[1];
                            if (u0(d != 0 ? i7 : 0, e ? i8 : 0, obtain)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            yr4 yr4Var = this.t0;
                            if (yr4Var != null && (i7 != 0 || i8 != 0)) {
                                yr4Var.a(this, i7, i8);
                            }
                        }
                    } else if (actionMasked == 3) {
                        t0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.f0 = motionEvent.getPointerId(actionIndex);
                        int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.j0 = x3;
                        this.h0 = x3;
                        int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.k0 = y3;
                        this.i0 = y3;
                    } else if (actionMasked == 6) {
                        k0(motionEvent);
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
            int i = mxb.a;
            Trace.beginSection("RV FullInvalidate");
            s();
            Trace.endSection();
            return;
        }
        ha haVar = this.d;
        if (haVar.g()) {
            int i2 = haVar.b;
            if ((i2 & 4) == 0 || (i2 & 11) != 0) {
                if (haVar.g()) {
                    int i3 = mxb.a;
                    Trace.beginSection("RV FullInvalidate");
                    s();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i4 = mxb.a;
            Trace.beginSection("RV PartialInvalidate");
            A0();
            i0();
            haVar.k();
            if (!this.L) {
                mv6 mv6Var = this.e;
                int J = mv6Var.J();
                int i5 = 0;
                while (true) {
                    if (i5 < J) {
                        s49 U = U(mv6Var.I(i5));
                        if (U != null && !U.r() && U.m()) {
                            s();
                            break;
                        }
                        i5++;
                    } else {
                        haVar.b();
                        break;
                    }
                }
            }
            B0(true);
            j0(true);
            Trace.endSection();
        }
    }

    public final void p0(s49 s49Var, zw8 zw8Var) {
        s49Var.p(0, TLObject.FLAG_13);
        boolean z = this.v0.h;
        v8b v8bVar = this.f;
        if (z && s49Var.m() && !s49Var.j() && !s49Var.r()) {
            ((vf6) v8bVar.c).k(s49Var, Q(s49Var));
        }
        ps psVar = (ps) v8bVar.b;
        ndc ndcVar = (ndc) psVar.get(s49Var);
        if (ndcVar == null) {
            ndcVar = ndc.a();
            psVar.put(s49Var, ndcVar);
        }
        ndcVar.b = zw8Var;
        ndcVar.a |= 4;
    }

    public final void q(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = jdc.a;
        setMeasuredDimension(d49.g(i, paddingRight, getMinimumWidth()), d49.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void q0() {
        b49 b49Var = this.d0;
        if (b49Var != null) {
            b49Var.g();
        }
        d49 d49Var = this.y;
        wg2 wg2Var = this.b;
        if (d49Var != null) {
            d49Var.f0(wg2Var);
            this.y.g0(wg2Var);
        }
        ((ArrayList) wg2Var.c).clear();
        wg2Var.f();
    }

    public final void r(View view) {
        s49 U = U(view);
        w39 w39Var = this.x;
        if (w39Var != null && U != null) {
            w39Var.z(U);
        }
        ArrayList arrayList = this.Q;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((f49) this.Q.get(size)).b(view);
            }
        }
    }

    public final void r0(c49 c49Var) {
        d49 d49Var = this.y;
        if (d49Var != null) {
            d49Var.b("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.E;
        arrayList.remove(c49Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        f0();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        s49 U = U(view);
        if (U != null) {
            if (U.l()) {
                U.l &= -257;
            } else if (!U.r()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + U + C());
            }
        }
        view.clearAnimation();
        r(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        o49 o49Var = this.y.e;
        if ((o49Var == null || !o49Var.e) && !d0() && view2 != null) {
            s0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.y.j0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((h49) arrayList.get(i)).c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.K != 0 || this.M) {
            this.L = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0351, code lost:
    
        if (((java.util.ArrayList) r6.d).contains(getFocusedChild()) != false) goto L164;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03ed  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v9, types: [int] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        ndc ndcVar;
        ?? r12;
        RecyclerView recyclerView;
        boolean r;
        int i;
        boolean z;
        int i2;
        s49 s49Var;
        View findViewById;
        boolean z2;
        if (this.x == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.y == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        p49 p49Var = this.v0;
        boolean z3 = false;
        p49Var.i = false;
        ?? r4 = 1;
        if (p49Var.d == 1) {
            t();
            this.y.o0(this);
            u();
        } else {
            ha haVar = this.d;
            if ((((ArrayList) haVar.e).isEmpty() || ((ArrayList) haVar.d).isEmpty()) && this.y.m == getWidth() && this.y.n == getHeight()) {
                this.y.o0(this);
            } else {
                this.y.o0(this);
                u();
            }
        }
        p49Var.a(4);
        A0();
        i0();
        p49Var.d = (byte) 1;
        boolean z4 = p49Var.j;
        mv6 mv6Var = this.e;
        wg2 wg2Var = this.b;
        v8b v8bVar = this.f;
        if (z4) {
            try {
                int J = mv6Var.J() - 1;
                while (J >= 0) {
                    s49 U = U(mv6Var.I(J));
                    if (U != null && !U.r()) {
                        long Q = Q(U);
                        this.d0.getClass();
                        zw8 zw8Var = new zw8((byte) 4);
                        View view = U.a;
                        zw8Var.b = view.getLeft();
                        zw8Var.c = view.getTop();
                        view.getRight();
                        view.getBottom();
                        vf6 vf6Var = (vf6) v8bVar.c;
                        ps psVar = (ps) v8bVar.b;
                        s49 s49Var2 = (s49) vf6Var.f(Q);
                        if (s49Var2 == null || s49Var2.r()) {
                            z = r4;
                            v8bVar.h(U, zw8Var);
                        } else {
                            ndc ndcVar2 = (ndc) psVar.get(s49Var2);
                            ?? r7 = (ndcVar2 == null || (ndcVar2.a & r4) == 0) ? false : r4;
                            ndc ndcVar3 = (ndc) psVar.get(U);
                            ?? r15 = (ndcVar3 == null || (ndcVar3.a & r4) == 0) ? false : r4;
                            if (r7 == true && s49Var2 == U) {
                                v8bVar.h(U, zw8Var);
                            } else {
                                z = r4;
                                zw8 m = v8bVar.m(s49Var2, 4);
                                v8bVar.h(U, zw8Var);
                                zw8 m2 = v8bVar.m(U, 8);
                                if (m == null) {
                                    Z(Q, U, s49Var2);
                                } else {
                                    s49Var2.q(false);
                                    if (r7 != false) {
                                        h(s49Var2);
                                    }
                                    if (s49Var2 != U) {
                                        if (r15 != false) {
                                            h(U);
                                        }
                                        s49Var2.j = U;
                                        h(s49Var2);
                                        wg2Var.l(s49Var2);
                                        U.q(false);
                                        U.k = s49Var2;
                                    }
                                    hia hiaVar = (hia) this.d0;
                                    hiaVar.getClass();
                                    int i3 = m.b;
                                    int i4 = m.c;
                                    if (U.r()) {
                                        i2 = m.b;
                                        m2 = m;
                                    } else {
                                        i2 = m2.b;
                                    }
                                    if (hiaVar.q(s49Var2, U, m, i3, i4, i2, m2.c)) {
                                        n0();
                                    }
                                }
                            }
                        }
                        J--;
                        r4 = z;
                    }
                    z = r4;
                    J--;
                    r4 = z;
                }
                boolean z5 = r4;
                ps psVar2 = (ps) v8bVar.b;
                int i5 = psVar2.c - 1;
                while (i5 >= 0) {
                    s49 s49Var3 = (s49) psVar2.f(i5);
                    try {
                        ndcVar = (ndc) psVar2.g(i5);
                    } catch (Exception e) {
                        fa4.g(e, z5);
                        ndcVar = null;
                    }
                    if (ndcVar != null) {
                        int i6 = ndcVar.a;
                        int i7 = i6 & 3;
                        u39 u39Var = this.N0;
                        if (i7 == 3) {
                            u39Var.m0(s49Var3);
                        } else if ((i6 & 1) != 0) {
                            zw8 zw8Var2 = ndcVar.b;
                            if (zw8Var2 == null) {
                                u39Var.m0(s49Var3);
                            } else {
                                u39Var.l0(s49Var3, zw8Var2, ndcVar.c);
                            }
                        } else if ((i6 & 14) == 14) {
                            zw8 zw8Var3 = ndcVar.b;
                            zw8 zw8Var4 = ndcVar.c;
                            RecyclerView recyclerView2 = (RecyclerView) u39Var.b;
                            s49Var3.q(z3);
                            if (recyclerView2.d0.a(s49Var3, zw8Var3, zw8Var4)) {
                                recyclerView2.n0();
                            }
                        } else {
                            if ((i6 & 12) == 12) {
                                zw8 zw8Var5 = ndcVar.b;
                                zw8 zw8Var6 = ndcVar.c;
                                u39Var.getClass();
                                s49Var3.q(z3);
                                RecyclerView recyclerView3 = (RecyclerView) u39Var.b;
                                boolean z6 = recyclerView3.R;
                                b49 b49Var = recyclerView3.d0;
                                if (z6) {
                                    hia hiaVar2 = (hia) b49Var;
                                    hiaVar2.getClass();
                                    int i8 = zw8Var5.b;
                                    int i9 = zw8Var5.c;
                                    if (s49Var3.r()) {
                                        i = zw8Var5.b;
                                        zw8Var6 = zw8Var5;
                                    } else {
                                        i = zw8Var6.b;
                                    }
                                    if (hiaVar2.q(s49Var3, s49Var3, zw8Var5, i8, i9, i, zw8Var6.c)) {
                                        recyclerView3.n0();
                                    }
                                } else {
                                    hia hiaVar3 = (hia) b49Var;
                                    hiaVar3.getClass();
                                    int i10 = zw8Var5.b;
                                    int i11 = zw8Var6.b;
                                    if (i10 == i11) {
                                        recyclerView = recyclerView3;
                                        if (zw8Var5.c == zw8Var6.c) {
                                            hiaVar3.v(s49Var3);
                                            r = false;
                                            if (r) {
                                                recyclerView.n0();
                                            }
                                        }
                                    } else {
                                        recyclerView = recyclerView3;
                                    }
                                    r = hiaVar3.r(s49Var3, zw8Var5, i10, zw8Var5.c, i11, zw8Var6.c);
                                    if (r) {
                                    }
                                }
                            } else if ((i6 & 4) != 0) {
                                u39Var.l0(s49Var3, ndcVar.b, null);
                            } else if ((i6 & 8) != 0) {
                                zw8 zw8Var7 = ndcVar.b;
                                zw8 zw8Var8 = ndcVar.c;
                                RecyclerView recyclerView4 = (RecyclerView) u39Var.b;
                                r12 = 0;
                                r12 = 0;
                                s49Var3.q(false);
                                if (recyclerView4.d0.a(s49Var3, zw8Var7, zw8Var8)) {
                                    recyclerView4.n0();
                                }
                                ndcVar.a = r12;
                                ndcVar.b = null;
                                ndcVar.c = null;
                                ndc.d.o0(ndcVar);
                            }
                            r12 = 0;
                            ndcVar.a = r12;
                            ndcVar.b = null;
                            ndcVar.c = null;
                            ndc.d.o0(ndcVar);
                        }
                        r12 = z3;
                        ndcVar.a = r12;
                        ndcVar.b = null;
                        ndcVar.c = null;
                        ndc.d.o0(ndcVar);
                    }
                    i5--;
                    z3 = false;
                    z5 = true;
                }
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder();
                for (int J2 = mv6Var.J() - 1; J2 >= 0; J2--) {
                    s49 U2 = U(mv6Var.I(J2));
                    if (U2 != null && !U2.r()) {
                        sb.append("Holder at" + J2 + " " + U2 + "\n");
                    }
                }
                throw new RuntimeException(sb.toString(), e2);
            }
        }
        View view2 = null;
        this.y.g0(wg2Var);
        p49Var.b = p49Var.e;
        this.R = false;
        this.S = false;
        p49Var.j = false;
        p49Var.k = false;
        this.y.f = false;
        ArrayList arrayList = (ArrayList) wg2Var.d;
        if (arrayList != null) {
            arrayList.clear();
        }
        d49 d49Var = this.y;
        if (d49Var.j) {
            d49Var.i = 0;
            d49Var.j = false;
            wg2Var.m();
        }
        this.y.b0(p49Var);
        j0(true);
        B0(false);
        ((ps) v8bVar.b).clear();
        ((vf6) v8bVar.c).b();
        int[] iArr = this.D0;
        int i12 = iArr[0];
        int i13 = iArr[1];
        I(iArr);
        if (iArr[0] != i12 || iArr[1] != i13) {
            x(0, 0);
        }
        if (this.r0 && this.x != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j = p49Var.m;
            if (j != -1 && (z2 = this.x.b) && z2) {
                int R = mv6Var.R();
                s49Var = null;
                int i14 = 0;
                while (true) {
                    if (i14 >= R) {
                        break;
                    }
                    s49 U3 = U(mv6Var.Q(i14));
                    if (U3 != null && !U3.j() && U3.e == j) {
                        if (!((ArrayList) mv6Var.d).contains(U3.a)) {
                            s49Var = U3;
                            break;
                        }
                        s49Var = U3;
                    }
                    i14++;
                }
            } else {
                s49Var = null;
            }
            if (s49Var != null) {
                View view3 = s49Var.a;
                if (!((ArrayList) mv6Var.d).contains(view3) && view3.hasFocusable()) {
                    view2 = view3;
                    if (view2 != null) {
                        int i15 = p49Var.n;
                        if (i15 != -1 && (findViewById = view2.findViewById(i15)) != null && findViewById.isFocusable()) {
                            view2 = findViewById;
                        }
                        view2.requestFocus();
                    }
                }
            }
            if (mv6Var.J() > 0) {
                int i16 = p49Var.l;
                if (i16 == -1) {
                    i16 = 0;
                }
                int b = p49Var.b();
                for (int i17 = i16; i17 < b; i17++) {
                    s49 K = K(i17);
                    if (K == null) {
                        break;
                    }
                    View view4 = K.a;
                    if (view4.hasFocusable()) {
                        view2 = view4;
                        break;
                    }
                }
                int min = Math.min(b, i16) - 1;
                while (true) {
                    if (min < 0) {
                        break;
                    }
                    s49 K2 = K(min);
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
        p49Var.m = -1L;
        p49Var.l = -1;
        p49Var.n = -1;
    }

    public void s0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.r;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof e49) {
            e49 e49Var = (e49) layoutParams;
            if (!e49Var.c) {
                Rect rect2 = e49Var.b;
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
        this.y.j0(this, view, this.r, !this.J, view2 == null);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        d49 d49Var = this.y;
        if (d49Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.M) {
            return;
        }
        boolean d = d49Var.d();
        boolean e = this.y.e();
        if (!d) {
            if (!e) {
                return;
            } else {
                i = 0;
            }
        }
        if (!e) {
            i2 = 0;
        }
        u0(i, i2, null);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!d0()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.O |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(u49 u49Var) {
        this.C0 = u49Var;
        jdc.k(this, u49Var);
    }

    public void setAdapter(w39 w39Var) {
        setLayoutFrozen(false);
        w39 w39Var2 = this.x;
        nr7 nr7Var = this.a;
        if (w39Var2 != null) {
            w39Var2.a.unregisterObserver(nr7Var);
            this.x.getClass();
        }
        q0();
        ha haVar = this.d;
        haVar.l((ArrayList) haVar.d);
        haVar.l((ArrayList) haVar.e);
        haVar.b = 0;
        w39 w39Var3 = this.x;
        this.x = w39Var;
        if (w39Var != null) {
            w39Var.B(nr7Var);
        }
        d49 d49Var = this.y;
        if (d49Var != null) {
            d49Var.P();
        }
        this.b.e(w39Var3, this.x);
        this.v0.f = true;
        o0(false);
        requestLayout();
    }

    public void setAdditionalDebugInfo(String str) {
        this.O0 = str;
    }

    public void setBottomGlowOffset(int i) {
        this.I0 = i;
    }

    public void setChildDrawingOrderCallback(z39 z39Var) {
        if (z39Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.h) {
            this.c0 = null;
            this.a0 = null;
            this.b0 = null;
            this.W = null;
        }
        this.h = z;
        super.setClipToPadding(z);
        if (this.J) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(a49 a49Var) {
        a49Var.getClass();
        this.V = a49Var;
        this.c0 = null;
        this.a0 = null;
        this.b0 = null;
        this.W = null;
    }

    public void setGlowColor(int i) {
        this.J0 = Integer.valueOf(i);
    }

    public void setHasFixedSize(boolean z) {
        this.I = z;
    }

    public void setItemAnimator(b49 b49Var) {
        b49 b49Var2 = this.d0;
        if (b49Var2 != null) {
            b49Var2.g();
            this.d0.a = null;
        }
        this.d0 = b49Var;
        if (b49Var != null) {
            b49Var.a = this.A0;
        }
    }

    public void setItemViewCacheSize(int i) {
        wg2 wg2Var = this.b;
        wg2Var.a = i;
        wg2Var.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(d49 d49Var) {
        if (d49Var == this.y) {
            return;
        }
        D0();
        d49 d49Var2 = this.y;
        wg2 wg2Var = this.b;
        if (d49Var2 != null) {
            b49 b49Var = this.d0;
            if (b49Var != null) {
                b49Var.g();
            }
            this.y.f0(wg2Var);
            this.y.g0(wg2Var);
            ((ArrayList) wg2Var.c).clear();
            wg2Var.f();
            if (this.H) {
                this.y.getClass();
            }
            this.y.s0(null);
            this.y = null;
        } else {
            ((ArrayList) wg2Var.c).clear();
            wg2Var.f();
        }
        this.e.d0();
        this.y = d49Var;
        if (d49Var != null) {
            if (d49Var.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(d49Var);
                String C = d49Var.b.C();
                sb.append(" is already attached to a RecyclerView:");
                sb.append(C);
                throw new IllegalArgumentException(sb.toString());
            }
            d49Var.s0(this);
            if (this.H) {
                this.y.getClass();
            }
        }
        wg2Var.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            w26.j("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        ri7 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = jdc.a;
            bdc.j(viewGroup);
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(g49 g49Var) {
        this.m0 = g49Var;
    }

    @Deprecated
    public void setOnScrollListener(i49 i49Var) {
        this.w0 = i49Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.r0 = z;
    }

    public void setRecycledViewPool(k49 k49Var) {
        wg2 wg2Var = this.b;
        if (((k49) wg2Var.g) != null) {
            r0.b--;
        }
        wg2Var.g = k49Var;
        if (k49Var == null || ((RecyclerView) wg2Var.h).getAdapter() == null) {
            return;
        }
        ((k49) wg2Var.g).b++;
    }

    public void setScrollState(int i) {
        o49 o49Var;
        if (i != this.e0) {
            this.e0 = i;
            if (i != 2) {
                r49 r49Var = this.s0;
                RecyclerView recyclerView = r49Var.h;
                if (recyclerView.P0) {
                    recyclerView.removeCallbacks(r49Var);
                    r49Var.c.abortAnimation();
                }
                d49 d49Var = this.y;
                if (d49Var != null && (o49Var = d49Var.e) != null) {
                    o49Var.h();
                }
            }
            d49 d49Var2 = this.y;
            if (d49Var2 != null) {
                d49Var2.e0();
            }
            l0(i);
            i49 i49Var = this.w0;
            if (i49Var != null) {
                i49Var.a(this, i);
            }
            ArrayList arrayList = this.x0;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((i49) this.x0.get(size)).a(this, i);
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.l0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.l0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setTopGlowOffset(int i) {
        this.H0 = i;
    }

    public void setViewCacheExtension(q49 q49Var) {
        this.b.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.M) {
            l("Do not suppressLayout in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.M = true;
                this.N = true;
                D0();
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
        ndc ndcVar;
        View F;
        boolean z;
        p49 p49Var = this.v0;
        p49Var.a(1);
        D(p49Var);
        p49Var.i = false;
        A0();
        v8b v8bVar = this.f;
        ps psVar = (ps) v8bVar.b;
        ps psVar2 = (ps) v8bVar.b;
        psVar.clear();
        vf6 vf6Var = (vf6) v8bVar.c;
        vf6Var.b();
        i0();
        boolean z2 = this.R;
        ha haVar = this.d;
        if (z2) {
            haVar.l((ArrayList) haVar.d);
            haVar.l((ArrayList) haVar.e);
            haVar.b = 0;
            if (this.S) {
                this.y.V(this);
            }
        }
        if (this.d0 != null && this.y.x0()) {
            haVar.k();
        } else {
            haVar.c();
        }
        boolean z3 = this.y0 || this.z0;
        boolean z4 = this.J && this.d0 != null && ((z = this.R) || z3 || this.y.f) && (!z || this.x.b);
        p49Var.j = z4;
        p49Var.k = z4 && z3 && !this.R && this.d0 != null && this.y.x0();
        s49 s49Var = null;
        View focusedChild = (this.r0 && hasFocus() && this.x != null) ? getFocusedChild() : null;
        if (focusedChild != null && (F = F(focusedChild)) != null) {
            s49Var = T(F);
        }
        if (s49Var == null) {
            p49Var.m = -1L;
            p49Var.l = -1;
            p49Var.n = -1;
        } else {
            p49Var.m = this.x.b ? s49Var.e : -1L;
            p49Var.l = this.R ? -1 : s49Var.j() ? s49Var.d : s49Var.b();
            View view = s49Var.a;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            p49Var.n = id;
        }
        p49Var.h = p49Var.j && this.z0;
        this.z0 = false;
        this.y0 = false;
        p49Var.g = p49Var.k;
        p49Var.e = this.x.b();
        I(this.D0);
        boolean z5 = p49Var.j;
        mv6 mv6Var = this.e;
        if (z5) {
            int J = mv6Var.J();
            for (int i = 0; i < J; i++) {
                s49 U = U(mv6Var.I(i));
                if (!U.r() && (!U.h() || this.x.b)) {
                    zw8 l = this.d0.l(p49Var, U, b49.b(U), U.d());
                    ndc ndcVar2 = (ndc) psVar2.get(U);
                    if (ndcVar2 == null) {
                        ndcVar2 = ndc.a();
                        psVar2.put(U, ndcVar2);
                    }
                    ndcVar2.b = l;
                    ndcVar2.a |= 4;
                    if (p49Var.h && U.m() && !U.j() && !U.r() && !U.h()) {
                        vf6Var.k(U, Q(U));
                    }
                }
            }
        }
        if (p49Var.k) {
            int R = mv6Var.R();
            for (int i2 = 0; i2 < R; i2++) {
                s49 U2 = U(mv6Var.Q(i2));
                if (!U2.r()) {
                    if (U2.d == -1) {
                        U2.d = U2.c;
                    }
                    U2.h = U2.c;
                }
            }
            boolean z6 = p49Var.f;
            p49Var.f = false;
            this.y.a0(this.b, p49Var);
            p49Var.f = z6;
            for (int i3 = 0; i3 < mv6Var.J(); i3++) {
                s49 U3 = U(mv6Var.I(i3));
                if (!U3.r() && ((ndcVar = (ndc) psVar2.get(U3)) == null || (ndcVar.a & 4) == 0)) {
                    int b = b49.b(U3);
                    boolean e = U3.e(TLObject.FLAG_13);
                    if (!e) {
                        b |= TLObject.FLAG_12;
                    }
                    zw8 l2 = this.d0.l(p49Var, U3, b, U3.d());
                    if (e) {
                        p0(U3, l2);
                    } else {
                        ndc ndcVar3 = (ndc) psVar2.get(U3);
                        if (ndcVar3 == null) {
                            ndcVar3 = ndc.a();
                            psVar2.put(U3, ndcVar3);
                        }
                        ndcVar3.a |= 2;
                        ndcVar3.b = l2;
                    }
                }
            }
            n();
        } else {
            n();
        }
        j0(true);
        B0(false);
        p49Var.d = (byte) 2;
    }

    public final void t0() {
        VelocityTracker velocityTracker = this.g0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        C0(0);
        EdgeEffect edgeEffect = this.W;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.W.isFinished();
        }
        EdgeEffect edgeEffect2 = this.a0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.a0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.b0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.b0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.c0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.c0.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = jdc.a;
            postInvalidateOnAnimation();
        }
    }

    public final void u() {
        A0();
        i0();
        p49 p49Var = this.v0;
        p49Var.a(6);
        this.d.c();
        p49Var.e = this.x.b();
        p49Var.c = 0;
        p49Var.g = false;
        this.y.a0(this.b, p49Var);
        p49Var.f = false;
        this.c = null;
        p49Var.j = p49Var.j && this.d0 != null;
        p49Var.d = (byte) 4;
        j0(true);
        B0(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u0(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        p();
        w39 w39Var = this.x;
        int[] iArr = this.K0;
        if (w39Var != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            v0(i, i2, iArr);
            int i7 = iArr[0];
            int i8 = iArr[1];
            i5 = i - i7;
            i6 = i2 - i8;
            i3 = i7;
            i4 = i8;
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (!this.E.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        w(i3, i4, i5, i6, this.F0, 0, iArr);
        int i9 = i5 - iArr[0];
        int i10 = i6 - iArr[1];
        int i11 = this.j0;
        int[] iArr2 = this.F0;
        int i12 = iArr2[0];
        this.j0 = i11 - i12;
        int i13 = this.k0;
        int i14 = iArr2[1];
        this.k0 = i13 - i14;
        if (motionEvent != null) {
            motionEvent.offsetLocation(i12, i14);
        }
        int[] iArr3 = this.G0;
        iArr3[0] = iArr3[0] + iArr2[0];
        iArr3[1] = iArr3[1] + iArr2[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x = motionEvent.getX();
                float f = i9;
                float y = motionEvent.getY();
                float f2 = i10;
                Integer num = this.J0;
                if (num == null || num.intValue() != 0) {
                    if (f < 0.0f) {
                        z();
                        ms3.a(this.W, (-f) / getWidth(), 1.0f - (y / getHeight()));
                    } else if (f > 0.0f) {
                        A();
                        ms3.a(this.b0, f / getWidth(), y / getHeight());
                    } else {
                        z = false;
                        if (f2 >= 0.0f) {
                            B();
                            ms3.a(this.a0, (-f2) / getHeight(), x / getWidth());
                        } else {
                            if (f2 > 0.0f) {
                                y();
                                ms3.a(this.c0, f2 / getHeight(), 1.0f - (x / getWidth()));
                            }
                            if (!z || f != 0.0f || f2 != 0.0f) {
                                WeakHashMap weakHashMap = jdc.a;
                                postInvalidateOnAnimation();
                            }
                        }
                        z = true;
                        if (!z) {
                        }
                        WeakHashMap weakHashMap2 = jdc.a;
                        postInvalidateOnAnimation();
                    }
                    z = true;
                    if (f2 >= 0.0f) {
                    }
                    z = true;
                    if (!z) {
                    }
                    WeakHashMap weakHashMap22 = jdc.a;
                    postInvalidateOnAnimation();
                }
            }
            o(i, i2);
        }
        if (i3 != 0 || i4 != 0) {
            x(i3, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i3 == 0 && i4 == 0) ? false : true;
    }

    public boolean v(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    public final void v0(int i, int i2, int[] iArr) {
        s49 s49Var;
        A0();
        i0();
        int i3 = mxb.a;
        Trace.beginSection("RV Scroll");
        p49 p49Var = this.v0;
        D(p49Var);
        wg2 wg2Var = this.b;
        int l0 = i != 0 ? this.y.l0(i, wg2Var, p49Var) : 0;
        int n0 = i2 != 0 ? this.y.n0(i2, wg2Var, p49Var) : 0;
        Trace.endSection();
        mv6 mv6Var = this.e;
        int J = mv6Var.J();
        for (int i4 = 0; i4 < J; i4++) {
            View I = mv6Var.I(i4);
            s49 T = T(I);
            if (T != null && (s49Var = T.k) != null) {
                View view = s49Var.a;
                int left = I.getLeft();
                int top = I.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        j0(true);
        B0(false);
        if (iArr != null) {
            iArr[0] = l0;
            iArr[1] = n0;
        }
    }

    public final void w(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void w0(int i) {
        if (this.M) {
            return;
        }
        D0();
        d49 d49Var = this.y;
        if (d49Var == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            d49Var.m0(i);
            awakenScrollBars();
        }
    }

    public final void x(int i, int i2) {
        this.U++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        m0(i2);
        i49 i49Var = this.w0;
        if (i49Var != null) {
            i49Var.b(this, i, i2);
        }
        ArrayList arrayList = this.x0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((i49) this.x0.get(size)).b(this, i, i2);
            }
        }
        this.U--;
    }

    public final void x0(int i, int i2, Interpolator interpolator) {
        d49 d49Var = this.y;
        if (d49Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.M) {
            return;
        }
        if (!d49Var.d()) {
            i = 0;
        }
        if (!this.y.e()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        this.s0.b(i, i2, TLObject.FLAG_31, interpolator);
    }

    public final void y() {
        if (this.c0 != null) {
            return;
        }
        EdgeEffect a = this.V.a(this, 3);
        this.c0 = a;
        if (this.h) {
            a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
        k(this.c0);
    }

    public final void y0(int i, int i2, Interpolator interpolator) {
        if (this.y == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.M) {
            return;
        }
        if (!this.y.e()) {
            i = 0;
        }
        if (i != 0) {
            this.s0.b(0, i, i2, interpolator);
        }
    }

    public final void z() {
        if (this.W != null) {
            return;
        }
        EdgeEffect a = this.V.a(this, 0);
        this.W = a;
        if (this.h) {
            a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
        k(this.W);
    }

    public final void z0(int i) {
        if (this.M) {
            return;
        }
        d49 d49Var = this.y;
        if (d49Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            d49Var.u0(this, this.v0, i);
        }
    }

    public void h0(View view) {
    }

    public void l0(int i) {
    }

    public void m0(int i) {
    }

    public void setRecyclerListener(l49 l49Var) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        d49 d49Var = this.y;
        if (d49Var != null) {
            return d49Var.p(layoutParams);
        }
        sc8.j("RecyclerView has no LayoutManager".concat(C()));
        return null;
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}
