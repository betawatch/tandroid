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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] R0 = {R.attr.clipToPadding};
    public static final bg3 S0 = new bg3(3);
    public final et8 A0;
    public boolean B0;
    public w69 C0;
    public final int[] D0;
    public final ArrayList E;
    public tk7 E0;
    public final ArrayList F;
    public final int[] F0;
    public j69 G;
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
    public final w59 M0;
    public boolean N;
    public final x59 N0;
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
    public c69 V;
    public EdgeEffect W;
    public final ot7 a;
    public EdgeEffect a0;
    public final ki2 b;
    public EdgeEffect b0;
    public o69 c;
    public EdgeEffect c0;
    public final ha d;
    public d69 d0;
    public final mx6 e;
    public int e0;
    public final xab f;
    public int f0;
    public VelocityTracker g0;
    public boolean h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public i69 m0;
    public final w59 n;
    public final int n0;
    public final int o0;
    public final float p0;
    public final float q0;
    public final Rect r;
    public boolean r0;
    public final Rect s;
    public final t69 s0;
    public zt4 t0;
    public final po u0;
    public final r69 v0;
    public final RectF w;
    public k69 w0;
    public y59 x;
    public ArrayList x0;
    public f69 y;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: Multi-variable type inference failed */
    public RecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float a;
        this.a = new ot7(this, (byte) 2);
        this.b = new ki2(this);
        byte b = 4;
        this.f = new xab((byte) 4);
        this.n = new w59(this, 0 == true ? 1 : 0);
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
        this.V = new c69();
        this.d0 = new sc3();
        this.e0 = 0;
        this.f0 = -1;
        this.p0 = Float.MIN_VALUE;
        this.q0 = Float.MIN_VALUE;
        this.r0 = true;
        this.s0 = new t69(this);
        this.u0 = new po();
        r69 r69Var = new r69();
        r69Var.a = -1;
        r69Var.b = 0;
        r69Var.c = 0;
        r69Var.d = (byte) 1;
        r69Var.e = 0;
        r69Var.f = false;
        r69Var.g = false;
        r69Var.h = false;
        r69Var.i = false;
        r69Var.j = false;
        r69Var.k = false;
        this.v0 = r69Var;
        this.y0 = false;
        this.z0 = false;
        et8 et8Var = new et8((Object) this, (byte) 3);
        this.A0 = et8Var;
        this.B0 = false;
        this.D0 = new int[2];
        this.F0 = new int[2];
        this.G0 = new int[2];
        this.H0 = 0;
        this.I0 = 0;
        this.J0 = null;
        this.K0 = new int[2];
        this.L0 = new ArrayList();
        this.M0 = new w59(this, (byte) 1);
        this.N0 = new x59(this, 0 == true ? 1 : 0);
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
        byte b2 = 26;
        if (i >= 26) {
            Method method = lfc.a;
            a = nq5.d(viewConfiguration);
        } else {
            a = lfc.a(viewConfiguration, context);
        }
        this.p0 = a;
        this.q0 = i >= 26 ? nq5.e(viewConfiguration) : lfc.a(viewConfiguration, context);
        this.n0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.o0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.d0.a = et8Var;
        this.d = new ha(new oo8(this, b));
        this.e = new mx6(new ai4(this, b2));
        WeakHashMap weakHashMap = kfc.a;
        if ((i >= 26 ? efc.a(this) : 0) == 0 && i >= 26) {
            efc.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.P = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new w69(this));
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
        u69 U = U(view);
        if (U != null) {
            return U.b();
        }
        return -1;
    }

    public static int S(View view) {
        u69 U = U(view);
        if (U != null) {
            return U.c();
        }
        return -1;
    }

    public static u69 U(View view) {
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof g69) {
            return ((g69) layoutParams).a;
        }
        return null;
    }

    public static void V(View view, Rect rect) {
        g69 g69Var = (g69) view.getLayoutParams();
        Rect rect2 = g69Var.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) g69Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) g69Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) g69Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) g69Var).bottomMargin);
    }

    private tk7 getScrollingChildHelper() {
        tk7 tk7Var = this.E0;
        if (tk7Var != null) {
            return tk7Var;
        }
        tk7 tk7Var2 = new tk7(this);
        this.E0 = tk7Var2;
        return tk7Var2;
    }

    public static void m(u69 u69Var) {
        WeakReference weakReference = u69Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == u69Var.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            u69Var.b = null;
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

    public final void D(r69 r69Var) {
        if (getScrollState() != 2) {
            r69Var.getClass();
            return;
        }
        OverScroller overScroller = this.s0.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        r69Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public void D0() {
        q69 q69Var;
        setScrollState(0);
        t69 t69Var = this.s0;
        RecyclerView recyclerView = t69Var.h;
        if (recyclerView.P0) {
            recyclerView.removeCallbacks(t69Var);
            t69Var.c.abortAnimation();
        }
        f69 f69Var = this.y;
        if (f69Var == null || (q69Var = f69Var.e) == null) {
            return;
        }
        q69Var.h();
    }

    public View E(float f, float f2) {
        mx6 mx6Var = this.e;
        for (int L = mx6Var.L() - 1; L >= 0; L--) {
            View K = mx6Var.K(L);
            float translationX = K.getTranslationX();
            float translationY = K.getTranslationY();
            if (f >= K.getLeft() + translationX && f <= K.getRight() + translationX && f2 >= K.getTop() + translationY && f2 <= K.getBottom() + translationY) {
                return K;
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

    public final u69 G(View view) {
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
            j69 j69Var = (j69) arrayList.get(i);
            if (j69Var.b(this, motionEvent) && action != 3) {
                this.G = j69Var;
                return true;
            }
        }
        return false;
    }

    public final void I(int[] iArr) {
        mx6 mx6Var = this.e;
        int L = mx6Var.L();
        if (L == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i2 = TLObject.FLAG_31;
        for (int i3 = 0; i3 < L; i3++) {
            u69 U = U(mx6Var.K(i3));
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

    public final u69 K(int i) {
        u69 u69Var = null;
        if (this.R) {
            return null;
        }
        mx6 mx6Var = this.e;
        int T = mx6Var.T();
        for (int i2 = 0; i2 < T; i2++) {
            u69 U = U(mx6Var.S(i2));
            if (U != null && !U.j() && N(U) == i) {
                if (!((ArrayList) mx6Var.d).contains(U.a)) {
                    return U;
                }
                u69Var = U;
            }
        }
        return u69Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u69 L(int i, boolean z) {
        mx6 mx6Var = this.e;
        int T = mx6Var.T();
        u69 u69Var = null;
        for (int i2 = 0; i2 < T; i2++) {
            u69 U = U(mx6Var.S(i2));
            if (U != null && !U.j()) {
                if (z) {
                    if (U.c != i) {
                        continue;
                    }
                    if (((ArrayList) mx6Var.d).contains(U.a)) {
                        return U;
                    }
                    u69Var = U;
                } else {
                    if (U.c() != i) {
                        continue;
                    }
                    if (((ArrayList) mx6Var.d).contains(U.a)) {
                    }
                }
            }
        }
        return u69Var;
    }

    public final void M(gu2 gu2Var) {
        for (int i = 0; i < getChildCount(); i++) {
            gu2Var.accept(getChildAt(i));
        }
        for (int i2 = 0; i2 < getHiddenChildCount(); i2++) {
            gu2Var.accept(W(i2));
        }
        for (int i3 = 0; i3 < getAttachedScrapChildCount(); i3++) {
            gu2Var.accept(O(i3));
        }
    }

    public final int N(u69 u69Var) {
        if (u69Var.e(524) || !u69Var.g()) {
            return -1;
        }
        int i = u69Var.c;
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
        ki2 ki2Var = this.b;
        if (i < ((ArrayList) ki2Var.c).size()) {
            return ((u69) ((ArrayList) ki2Var.c).get(i)).a;
        }
        return null;
    }

    public final View P(int i) {
        if (i < 0) {
            return null;
        }
        ki2 ki2Var = this.b;
        if (i < ((ArrayList) ki2Var.e).size()) {
            return ((u69) ((ArrayList) ki2Var.e).get(i)).a;
        }
        return null;
    }

    public final long Q(u69 u69Var) {
        return this.x.b ? u69Var.e : u69Var.c;
    }

    public final u69 T(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return U(view);
        }
        a32.f("View ", view, " is not a direct child of ", this);
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
        g69 g69Var = (g69) view.getLayoutParams();
        boolean z = g69Var.c;
        Rect rect = g69Var.b;
        if (z) {
            r69 r69Var = this.v0;
            if (!r69Var.g || (!g69Var.a.m() && !g69Var.a.h())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.E;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect2 = this.r;
                    rect2.set(0, 0, 0, 0);
                    ((e69) arrayList.get(i)).d(rect2, view, this, r69Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                g69Var.c = false;
                return rect;
            }
        }
        return rect;
    }

    public final e69 Y(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return (e69) this.E.get(i);
        }
        wa3.i(td4.n(i, itemDecorationCount, " is an invalid index for size "));
        return null;
    }

    public final void Z(long j, u69 u69Var, u69 u69Var2) {
        mx6 mx6Var = this.e;
        int L = mx6Var.L();
        for (int i = 0; i < L; i++) {
            u69 U = U(mx6Var.K(i));
            if (U != u69Var && Q(U) == j) {
                y59 y59Var = this.x;
                if (y59Var == null || !y59Var.b) {
                    StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(U);
                    sb.append(" \n View Holder 2:");
                    sb.append(u69Var);
                    rjb.l(sb, C());
                    return;
                }
                StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(U);
                sb2.append(" \n View Holder 2:");
                sb2.append(u69Var);
                rjb.l(sb2, C());
                return;
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + u69Var2 + " cannot be found but it is necessary for " + u69Var + C());
    }

    public final boolean a0() {
        return !this.J || this.R || this.d.g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        f69 f69Var = this.y;
        if (f69Var != null) {
            f69Var.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0() {
        if (this.E.size() == 0) {
            return;
        }
        f69 f69Var = this.y;
        if (f69Var != null) {
            f69Var.b("Cannot invalidate item decorations during a scroll or layout");
        }
        f0();
        requestLayout();
    }

    public final boolean c0() {
        d69 d69Var = this.d0;
        return d69Var != null && d69Var.k();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g69) && this.y.f((g69) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        f69 f69Var = this.y;
        if (f69Var == null || !f69Var.d()) {
            return 0;
        }
        return ((u46) this.y).A0(this.v0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        f69 f69Var = this.y;
        if (f69Var == null || !f69Var.d()) {
            return 0;
        }
        return this.y.h(this.v0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        f69 f69Var = this.y;
        if (f69Var == null || !f69Var.d()) {
            return 0;
        }
        return this.y.i(this.v0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        f69 f69Var = this.y;
        if (f69Var == null || !f69Var.e()) {
            return 0;
        }
        return this.y.j(this.v0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        f69 f69Var = this.y;
        if (f69Var == null || !f69Var.e()) {
            return 0;
        }
        return this.y.k(this.v0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        f69 f69Var = this.y;
        if (f69Var == null || !f69Var.e()) {
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
            ((e69) arrayList.get(i)).f(canvas, this);
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
            WeakHashMap weakHashMap = kfc.a;
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
        mx6 mx6Var = this.e;
        int T = mx6Var.T();
        for (int i = 0; i < T; i++) {
            ((g69) mx6Var.S(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = (ArrayList) this.b.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            g69 g69Var = (g69) ((u69) arrayList.get(i2)).a.getLayoutParams();
            if (g69Var != null) {
                g69Var.c = true;
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
        r69 r69Var = this.v0;
        ki2 ki2Var = this.b;
        if (z2 && (i == 2 || i == 1)) {
            if (this.y.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? nm7.N1 : 33) == null) {
                    z = true;
                    if (!z && this.y.d()) {
                        RecyclerView recyclerView = this.y.b;
                        WeakHashMap weakHashMap = kfc.a;
                        z = focusFinder.findNextFocus(this, view, !((i != 2) ^ (recyclerView.getLayoutDirection() != 1)) ? 66 : 17) != null;
                    }
                    if (z) {
                        p();
                        if (F(view) != null) {
                            A0();
                            this.y.Q(view, i, ki2Var, r69Var);
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
                            WeakHashMap weakHashMap2 = kfc.a;
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
                WeakHashMap weakHashMap3 = kfc.a;
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
                view2 = this.y.Q(view, i, ki2Var, r69Var);
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
                WeakHashMap weakHashMap22 = kfc.a;
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
        mx6 mx6Var = this.e;
        int T = mx6Var.T();
        for (int i4 = 0; i4 < T; i4++) {
            u69 U = U(mx6Var.S(i4));
            if (U != null && !U.r()) {
                int i5 = U.c;
                r69 r69Var = this.v0;
                if (i5 >= i3) {
                    U.n(-i2, z);
                    r69Var.f = true;
                } else if (i5 >= i) {
                    U.a(8);
                    U.n(-i2, z);
                    U.c = i - 1;
                    r69Var.f = true;
                }
            }
        }
        ki2 ki2Var = this.b;
        ArrayList arrayList = (ArrayList) ki2Var.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u69 u69Var = (u69) arrayList.get(size);
            if (u69Var != null) {
                int i6 = u69Var.c;
                if (i6 >= i3) {
                    u69Var.n(-i2, z);
                } else if (i6 >= i) {
                    u69Var.a(8);
                    ki2Var.g(size);
                }
            }
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        f69 f69Var = this.y;
        if (f69Var != null) {
            return f69Var.n();
        }
        dq9.m("RecyclerView has no LayoutManager".concat(C()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        f69 f69Var = this.y;
        if (f69Var != null) {
            return f69Var.o(getContext(), attributeSet);
        }
        dq9.m("RecyclerView has no LayoutManager".concat(C()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public y59 getAdapter() {
        return this.x;
    }

    public int getAttachedScrapChildCount() {
        return ((ArrayList) this.b.c).size();
    }

    @Override // android.view.View
    public int getBaseline() {
        f69 f69Var = this.y;
        if (f69Var == null) {
            return super.getBaseline();
        }
        f69Var.getClass();
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

    public w69 getCompatAccessibilityDelegate() {
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

    public c69 getEdgeEffectFactory() {
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

    public d69 getItemAnimator() {
        return this.d0;
    }

    public int getItemDecorationCount() {
        return this.E.size();
    }

    public f69 getLayoutManager() {
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

    public i69 getOnFlingListener() {
        return this.m0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.r0;
    }

    public m69 getRecycledViewPool() {
        ki2 ki2Var = this.b;
        m69 m69Var = (m69) ki2Var.g;
        if (m69Var != null) {
            return m69Var;
        }
        m69 m69Var2 = new m69();
        ki2Var.g = m69Var2;
        return m69Var2;
    }

    public int getScrollState() {
        return this.e0;
    }

    public int getTopGlowOffset() {
        return this.H0;
    }

    public final void h(u69 u69Var) {
        View view = u69Var.a;
        boolean z = view.getParent() == this;
        this.b.l(T(view));
        boolean l = u69Var.l();
        mx6 mx6Var = this.e;
        if (l) {
            mx6Var.t(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            mx6Var.r(-1, view, true);
            return;
        }
        int indexOfChild = ((RecyclerView) ((ai4) mx6Var.b).b).indexOfChild(view);
        if (indexOfChild < 0) {
            u36.i(view, "view is not a child, cannot hide ");
        } else {
            ((vh2) mx6Var.c).C(indexOfChild);
            mx6Var.V(view);
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(e69 e69Var) {
        f69 f69Var = this.y;
        if (f69Var != null) {
            f69Var.b("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(e69Var);
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

    public final void j(k69 k69Var) {
        ArrayList arrayList = this.x0;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.x0 = arrayList;
        }
        arrayList.add(k69Var);
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
                    u69 u69Var = (u69) arrayList.get(size);
                    if (u69Var.a.getParent() == this && !u69Var.r() && (i = u69Var.s) != -1) {
                        View view = u69Var.a;
                        WeakHashMap weakHashMap = kfc.a;
                        view.setImportantForAccessibility(i);
                        u69Var.s = -1;
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
            dq9.m("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(C()));
        } else {
            dq9.m(str);
        }
    }

    public final void n() {
        mx6 mx6Var = this.e;
        int T = mx6Var.T();
        for (int i = 0; i < T; i++) {
            u69 U = U(mx6Var.S(i));
            if (U != null && !U.r()) {
                U.d = -1;
                U.g = -1;
            }
        }
        ki2 ki2Var = this.b;
        ArrayList arrayList = (ArrayList) ki2Var.c;
        ArrayList arrayList2 = (ArrayList) ki2Var.e;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            u69 u69Var = (u69) arrayList2.get(i2);
            u69Var.d = -1;
            u69Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            u69 u69Var2 = (u69) arrayList.get(i3);
            u69Var2.d = -1;
            u69Var2.g = -1;
        }
        ArrayList arrayList3 = (ArrayList) ki2Var.d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                u69 u69Var3 = (u69) ((ArrayList) ki2Var.d).get(i4);
                u69Var3.d = -1;
                u69Var3.g = -1;
            }
        }
    }

    public final void n0() {
        if (this.B0 || !this.H) {
            return;
        }
        WeakHashMap weakHashMap = kfc.a;
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
            WeakHashMap weakHashMap = kfc.a;
            postInvalidateOnAnimation();
        }
    }

    public final void o0(boolean z) {
        this.S |= z;
        this.R = true;
        mx6 mx6Var = this.e;
        int T = mx6Var.T();
        for (int i = 0; i < T; i++) {
            u69 U = U(mx6Var.S(i));
            if (U != null && !U.r()) {
                U.a(6);
            }
        }
        f0();
        ki2 ki2Var = this.b;
        ArrayList arrayList = (ArrayList) ki2Var.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            u69 u69Var = (u69) arrayList.get(i2);
            if (u69Var != null) {
                u69Var.a(6);
                u69Var.a(1024);
            }
        }
        y59 y59Var = ((RecyclerView) ki2Var.h).x;
        if (y59Var == null || !y59Var.b) {
            ki2Var.f();
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
        ThreadLocal threadLocal = zt4.e;
        zt4 zt4Var = (zt4) threadLocal.get();
        this.t0 = zt4Var;
        if (zt4Var == null) {
            zt4 zt4Var2 = new zt4();
            zt4Var2.a = new ArrayList();
            zt4Var2.d = new ArrayList();
            this.t0 = zt4Var2;
            WeakHashMap weakHashMap = kfc.a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            zt4 zt4Var3 = this.t0;
            zt4Var3.c = (long) (1.0E9f / f);
            threadLocal.set(zt4Var3);
        }
        this.t0.a.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d69 d69Var = this.d0;
        if (d69Var != null) {
            d69Var.g();
        }
        D0();
        this.H = false;
        this.L0.clear();
        removeCallbacks(this.M0);
        this.f.getClass();
        while (ofc.d.U() != null) {
        }
        zt4 zt4Var = this.t0;
        if (zt4Var != null) {
            zt4Var.a.remove(this);
            this.t0 = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((e69) arrayList.get(i)).e(canvas, this);
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
            f69 f69Var = this.y;
            if (f69Var != null) {
                boolean d = f69Var.d();
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
        int i5 = ozb.a;
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
        f69 f69Var = this.y;
        ki2 ki2Var = this.b;
        r69 r69Var = this.v0;
        f69Var.c0(ki2Var, r69Var, i, i2);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.x == null) {
            return;
        }
        if (r69Var.d == 1) {
            t();
        }
        this.y.p0(i, i2);
        r69Var.i = true;
        u();
        this.y.r0(i, i2);
        u46 u46Var = (u46) this.y;
        if (u46Var.l == 1073741824 || u46Var.k == 1073741824) {
            return;
        }
        int r = u46Var.r();
        for (int i3 = 0; i3 < r; i3++) {
            ViewGroup.LayoutParams layoutParams = u46Var.q(i3).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                this.y.p0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                r69Var.i = true;
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
        if (!(parcelable instanceof o69)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o69 o69Var = (o69) parcelable;
        this.c = o69Var;
        super.onRestoreInstanceState(o69Var.a);
        f69 f69Var = this.y;
        if (f69Var == null || (parcelable2 = this.c.c) == null) {
            return;
        }
        u46 u46Var = (u46) f69Var;
        if (parcelable2 instanceof t46) {
            u46Var.B = (t46) parcelable2;
            u46Var.k0();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        o69 o69Var = new o69(super.onSaveInstanceState());
        o69 o69Var2 = this.c;
        if (o69Var2 != null) {
            o69Var.c = o69Var2.c;
            return o69Var;
        }
        f69 f69Var = this.y;
        if (f69Var != null) {
            o69Var.c = f69Var.d0();
            return o69Var;
        }
        o69Var.c = null;
        return o69Var;
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
            j69 j69Var = this.G;
            if (j69Var == null) {
                z = motionEvent.getAction() == 0 ? false : H(motionEvent);
            } else {
                j69Var.a(this, motionEvent);
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
            f69 f69Var = this.y;
            if (f69Var != null) {
                boolean d = f69Var.d();
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
                            f69 f69Var2 = this.y;
                            if (f69Var2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.M) {
                                int d2 = f69Var2.d();
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
                                        i69 i69Var = this.m0;
                                        if (i69Var == null || !i69Var.a(i3, i4)) {
                                            if (z3) {
                                                if (e2) {
                                                    d2 = (d2 == true ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().g(d2, 1);
                                                int i6 = -i2;
                                                int max = Math.max(i6, Math.min(i3, i2));
                                                int max2 = Math.max(i6, Math.min(i4, i2));
                                                t69 t69Var = this.s0;
                                                RecyclerView recyclerView = t69Var.h;
                                                recyclerView.setScrollState(2);
                                                t69Var.b = 0;
                                                t69Var.a = 0;
                                                Interpolator interpolator = t69Var.d;
                                                bg3 bg3Var = S0;
                                                if (interpolator != bg3Var) {
                                                    t69Var.d = bg3Var;
                                                    t69Var.c = new OverScroller(recyclerView.getContext(), bg3Var);
                                                }
                                                t69Var.c.fling(0, 0, max, max2, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                t69Var.a();
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
                            zt4 zt4Var = this.t0;
                            if (zt4Var != null && (i7 != 0 || i8 != 0)) {
                                zt4Var.a(this, i7, i8);
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
            int i = ozb.a;
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
                    int i3 = ozb.a;
                    Trace.beginSection("RV FullInvalidate");
                    s();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i4 = ozb.a;
            Trace.beginSection("RV PartialInvalidate");
            A0();
            i0();
            haVar.k();
            if (!this.L) {
                mx6 mx6Var = this.e;
                int L = mx6Var.L();
                int i5 = 0;
                while (true) {
                    if (i5 < L) {
                        u69 U = U(mx6Var.K(i5));
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

    public final void p0(u69 u69Var, az8 az8Var) {
        u69Var.p(0, TLObject.FLAG_13);
        boolean z = this.v0.h;
        xab xabVar = this.f;
        if (z && u69Var.m() && !u69Var.j() && !u69Var.r()) {
            ((vh6) xabVar.c).k(u69Var, Q(u69Var));
        }
        qt qtVar = (qt) xabVar.b;
        ofc ofcVar = (ofc) qtVar.get(u69Var);
        if (ofcVar == null) {
            ofcVar = ofc.a();
            qtVar.put(u69Var, ofcVar);
        }
        ofcVar.b = az8Var;
        ofcVar.a |= 4;
    }

    public final void q(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = kfc.a;
        setMeasuredDimension(f69.g(i, paddingRight, getMinimumWidth()), f69.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void q0() {
        d69 d69Var = this.d0;
        if (d69Var != null) {
            d69Var.g();
        }
        f69 f69Var = this.y;
        ki2 ki2Var = this.b;
        if (f69Var != null) {
            f69Var.f0(ki2Var);
            this.y.g0(ki2Var);
        }
        ((ArrayList) ki2Var.c).clear();
        ki2Var.f();
    }

    public final void r(View view) {
        u69 U = U(view);
        y59 y59Var = this.x;
        if (y59Var != null && U != null) {
            y59Var.z(U);
        }
        ArrayList arrayList = this.Q;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((h69) this.Q.get(size)).b(view);
            }
        }
    }

    public final void r0(e69 e69Var) {
        f69 f69Var = this.y;
        if (f69Var != null) {
            f69Var.b("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.E;
        arrayList.remove(e69Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        f0();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        u69 U = U(view);
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
        q69 q69Var = this.y.e;
        if ((q69Var == null || !q69Var.e) && !d0() && view2 != null) {
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
            ((j69) arrayList.get(i)).c(z);
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
        ofc ofcVar;
        ?? r12;
        RecyclerView recyclerView;
        boolean r;
        int i;
        boolean z;
        int i2;
        u69 u69Var;
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
        r69 r69Var = this.v0;
        boolean z3 = false;
        r69Var.i = false;
        ?? r4 = 1;
        if (r69Var.d == 1) {
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
        r69Var.a(4);
        A0();
        i0();
        r69Var.d = (byte) 1;
        boolean z4 = r69Var.j;
        mx6 mx6Var = this.e;
        ki2 ki2Var = this.b;
        xab xabVar = this.f;
        if (z4) {
            try {
                int L = mx6Var.L() - 1;
                while (L >= 0) {
                    u69 U = U(mx6Var.K(L));
                    if (U != null && !U.r()) {
                        long Q = Q(U);
                        this.d0.getClass();
                        az8 az8Var = new az8((byte) 4);
                        View view = U.a;
                        az8Var.b = view.getLeft();
                        az8Var.c = view.getTop();
                        view.getRight();
                        view.getBottom();
                        vh6 vh6Var = (vh6) xabVar.c;
                        qt qtVar = (qt) xabVar.b;
                        u69 u69Var2 = (u69) vh6Var.f(Q);
                        if (u69Var2 == null || u69Var2.r()) {
                            z = r4;
                            xabVar.h(U, az8Var);
                        } else {
                            ofc ofcVar2 = (ofc) qtVar.get(u69Var2);
                            ?? r7 = (ofcVar2 == null || (ofcVar2.a & r4) == 0) ? false : r4;
                            ofc ofcVar3 = (ofc) qtVar.get(U);
                            ?? r15 = (ofcVar3 == null || (ofcVar3.a & r4) == 0) ? false : r4;
                            if (r7 == true && u69Var2 == U) {
                                xabVar.h(U, az8Var);
                            } else {
                                z = r4;
                                az8 m = xabVar.m(u69Var2, 4);
                                xabVar.h(U, az8Var);
                                az8 m2 = xabVar.m(U, 8);
                                if (m == null) {
                                    Z(Q, U, u69Var2);
                                } else {
                                    u69Var2.q(false);
                                    if (r7 != false) {
                                        h(u69Var2);
                                    }
                                    if (u69Var2 != U) {
                                        if (r15 != false) {
                                            h(U);
                                        }
                                        u69Var2.j = U;
                                        h(u69Var2);
                                        ki2Var.l(u69Var2);
                                        U.q(false);
                                        U.k = u69Var2;
                                    }
                                    jka jkaVar = (jka) this.d0;
                                    jkaVar.getClass();
                                    int i3 = m.b;
                                    int i4 = m.c;
                                    if (U.r()) {
                                        i2 = m.b;
                                        m2 = m;
                                    } else {
                                        i2 = m2.b;
                                    }
                                    if (jkaVar.q(u69Var2, U, m, i3, i4, i2, m2.c)) {
                                        n0();
                                    }
                                }
                            }
                        }
                        L--;
                        r4 = z;
                    }
                    z = r4;
                    L--;
                    r4 = z;
                }
                boolean z5 = r4;
                qt qtVar2 = (qt) xabVar.b;
                int i5 = qtVar2.c - 1;
                while (i5 >= 0) {
                    u69 u69Var3 = (u69) qtVar2.f(i5);
                    try {
                        ofcVar = (ofc) qtVar2.g(i5);
                    } catch (Exception e) {
                        fc4.g(e, z5);
                        ofcVar = null;
                    }
                    if (ofcVar != null) {
                        int i6 = ofcVar.a;
                        int i7 = i6 & 3;
                        x59 x59Var = this.N0;
                        if (i7 == 3) {
                            x59Var.l0(u69Var3);
                        } else if ((i6 & 1) != 0) {
                            az8 az8Var2 = ofcVar.b;
                            if (az8Var2 == null) {
                                x59Var.l0(u69Var3);
                            } else {
                                x59Var.k0(u69Var3, az8Var2, ofcVar.c);
                            }
                        } else if ((i6 & 14) == 14) {
                            az8 az8Var3 = ofcVar.b;
                            az8 az8Var4 = ofcVar.c;
                            RecyclerView recyclerView2 = (RecyclerView) x59Var.b;
                            u69Var3.q(z3);
                            if (recyclerView2.d0.a(u69Var3, az8Var3, az8Var4)) {
                                recyclerView2.n0();
                            }
                        } else {
                            if ((i6 & 12) == 12) {
                                az8 az8Var5 = ofcVar.b;
                                az8 az8Var6 = ofcVar.c;
                                x59Var.getClass();
                                u69Var3.q(z3);
                                RecyclerView recyclerView3 = (RecyclerView) x59Var.b;
                                boolean z6 = recyclerView3.R;
                                d69 d69Var = recyclerView3.d0;
                                if (z6) {
                                    jka jkaVar2 = (jka) d69Var;
                                    jkaVar2.getClass();
                                    int i8 = az8Var5.b;
                                    int i9 = az8Var5.c;
                                    if (u69Var3.r()) {
                                        i = az8Var5.b;
                                        az8Var6 = az8Var5;
                                    } else {
                                        i = az8Var6.b;
                                    }
                                    if (jkaVar2.q(u69Var3, u69Var3, az8Var5, i8, i9, i, az8Var6.c)) {
                                        recyclerView3.n0();
                                    }
                                } else {
                                    jka jkaVar3 = (jka) d69Var;
                                    jkaVar3.getClass();
                                    int i10 = az8Var5.b;
                                    int i11 = az8Var6.b;
                                    if (i10 == i11) {
                                        recyclerView = recyclerView3;
                                        if (az8Var5.c == az8Var6.c) {
                                            jkaVar3.v(u69Var3);
                                            r = false;
                                            if (r) {
                                                recyclerView.n0();
                                            }
                                        }
                                    } else {
                                        recyclerView = recyclerView3;
                                    }
                                    r = jkaVar3.r(u69Var3, az8Var5, i10, az8Var5.c, i11, az8Var6.c);
                                    if (r) {
                                    }
                                }
                            } else if ((i6 & 4) != 0) {
                                x59Var.k0(u69Var3, ofcVar.b, null);
                            } else if ((i6 & 8) != 0) {
                                az8 az8Var7 = ofcVar.b;
                                az8 az8Var8 = ofcVar.c;
                                RecyclerView recyclerView4 = (RecyclerView) x59Var.b;
                                r12 = 0;
                                r12 = 0;
                                u69Var3.q(false);
                                if (recyclerView4.d0.a(u69Var3, az8Var7, az8Var8)) {
                                    recyclerView4.n0();
                                }
                                ofcVar.a = r12;
                                ofcVar.b = null;
                                ofcVar.c = null;
                                ofc.d.p0(ofcVar);
                            }
                            r12 = 0;
                            ofcVar.a = r12;
                            ofcVar.b = null;
                            ofcVar.c = null;
                            ofc.d.p0(ofcVar);
                        }
                        r12 = z3;
                        ofcVar.a = r12;
                        ofcVar.b = null;
                        ofcVar.c = null;
                        ofc.d.p0(ofcVar);
                    }
                    i5--;
                    z3 = false;
                    z5 = true;
                }
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder();
                for (int L2 = mx6Var.L() - 1; L2 >= 0; L2--) {
                    u69 U2 = U(mx6Var.K(L2));
                    if (U2 != null && !U2.r()) {
                        sb.append("Holder at" + L2 + " " + U2 + "\n");
                    }
                }
                throw new RuntimeException(sb.toString(), e2);
            }
        }
        View view2 = null;
        this.y.g0(ki2Var);
        r69Var.b = r69Var.e;
        this.R = false;
        this.S = false;
        r69Var.j = false;
        r69Var.k = false;
        this.y.f = false;
        ArrayList arrayList = (ArrayList) ki2Var.d;
        if (arrayList != null) {
            arrayList.clear();
        }
        f69 f69Var = this.y;
        if (f69Var.j) {
            f69Var.i = 0;
            f69Var.j = false;
            ki2Var.m();
        }
        this.y.b0(r69Var);
        j0(true);
        B0(false);
        ((qt) xabVar.b).clear();
        ((vh6) xabVar.c).b();
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
            long j = r69Var.m;
            if (j != -1 && (z2 = this.x.b) && z2) {
                int T = mx6Var.T();
                u69Var = null;
                int i14 = 0;
                while (true) {
                    if (i14 >= T) {
                        break;
                    }
                    u69 U3 = U(mx6Var.S(i14));
                    if (U3 != null && !U3.j() && U3.e == j) {
                        if (!((ArrayList) mx6Var.d).contains(U3.a)) {
                            u69Var = U3;
                            break;
                        }
                        u69Var = U3;
                    }
                    i14++;
                }
            } else {
                u69Var = null;
            }
            if (u69Var != null) {
                View view3 = u69Var.a;
                if (!((ArrayList) mx6Var.d).contains(view3) && view3.hasFocusable()) {
                    view2 = view3;
                    if (view2 != null) {
                        int i15 = r69Var.n;
                        if (i15 != -1 && (findViewById = view2.findViewById(i15)) != null && findViewById.isFocusable()) {
                            view2 = findViewById;
                        }
                        view2.requestFocus();
                    }
                }
            }
            if (mx6Var.L() > 0) {
                int i16 = r69Var.l;
                if (i16 == -1) {
                    i16 = 0;
                }
                int b = r69Var.b();
                for (int i17 = i16; i17 < b; i17++) {
                    u69 K = K(i17);
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
                    u69 K2 = K(min);
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
        r69Var.m = -1L;
        r69Var.l = -1;
        r69Var.n = -1;
    }

    public void s0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.r;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof g69) {
            g69 g69Var = (g69) layoutParams;
            if (!g69Var.c) {
                Rect rect2 = g69Var.b;
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
        f69 f69Var = this.y;
        if (f69Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.M) {
            return;
        }
        boolean d = f69Var.d();
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

    public void setAccessibilityDelegateCompat(w69 w69Var) {
        this.C0 = w69Var;
        kfc.k(this, w69Var);
    }

    public void setAdapter(y59 y59Var) {
        setLayoutFrozen(false);
        y59 y59Var2 = this.x;
        ot7 ot7Var = this.a;
        if (y59Var2 != null) {
            y59Var2.a.unregisterObserver(ot7Var);
            this.x.getClass();
        }
        q0();
        ha haVar = this.d;
        haVar.l((ArrayList) haVar.d);
        haVar.l((ArrayList) haVar.e);
        haVar.b = 0;
        y59 y59Var3 = this.x;
        this.x = y59Var;
        if (y59Var != null) {
            y59Var.B(ot7Var);
        }
        f69 f69Var = this.y;
        if (f69Var != null) {
            f69Var.P();
        }
        this.b.e(y59Var3, this.x);
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

    public void setChildDrawingOrderCallback(b69 b69Var) {
        if (b69Var == null) {
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

    public void setEdgeEffectFactory(c69 c69Var) {
        c69Var.getClass();
        this.V = c69Var;
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

    public void setItemAnimator(d69 d69Var) {
        d69 d69Var2 = this.d0;
        if (d69Var2 != null) {
            d69Var2.g();
            this.d0.a = null;
        }
        this.d0 = d69Var;
        if (d69Var != null) {
            d69Var.a = this.A0;
        }
    }

    public void setItemViewCacheSize(int i) {
        ki2 ki2Var = this.b;
        ki2Var.a = i;
        ki2Var.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(f69 f69Var) {
        if (f69Var == this.y) {
            return;
        }
        D0();
        f69 f69Var2 = this.y;
        ki2 ki2Var = this.b;
        if (f69Var2 != null) {
            d69 d69Var = this.d0;
            if (d69Var != null) {
                d69Var.g();
            }
            this.y.f0(ki2Var);
            this.y.g0(ki2Var);
            ((ArrayList) ki2Var.c).clear();
            ki2Var.f();
            if (this.H) {
                this.y.getClass();
            }
            this.y.s0(null);
            this.y = null;
        } else {
            ((ArrayList) ki2Var.c).clear();
            ki2Var.f();
        }
        this.e.h0();
        this.y = f69Var;
        if (f69Var != null) {
            if (f69Var.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(f69Var);
                String C = f69Var.b.C();
                sb.append(" is already attached to a RecyclerView:");
                sb.append(C);
                throw new IllegalArgumentException(sb.toString());
            }
            f69Var.s0(this);
            if (this.H) {
                this.y.getClass();
            }
        }
        ki2Var.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            u36.j("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        tk7 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = kfc.a;
            cfc.j(viewGroup);
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(i69 i69Var) {
        this.m0 = i69Var;
    }

    @Deprecated
    public void setOnScrollListener(k69 k69Var) {
        this.w0 = k69Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.r0 = z;
    }

    public void setRecycledViewPool(m69 m69Var) {
        ki2 ki2Var = this.b;
        if (((m69) ki2Var.g) != null) {
            r0.b--;
        }
        ki2Var.g = m69Var;
        if (m69Var == null || ((RecyclerView) ki2Var.h).getAdapter() == null) {
            return;
        }
        ((m69) ki2Var.g).b++;
    }

    public void setScrollState(int i) {
        q69 q69Var;
        if (i != this.e0) {
            this.e0 = i;
            if (i != 2) {
                t69 t69Var = this.s0;
                RecyclerView recyclerView = t69Var.h;
                if (recyclerView.P0) {
                    recyclerView.removeCallbacks(t69Var);
                    t69Var.c.abortAnimation();
                }
                f69 f69Var = this.y;
                if (f69Var != null && (q69Var = f69Var.e) != null) {
                    q69Var.h();
                }
            }
            f69 f69Var2 = this.y;
            if (f69Var2 != null) {
                f69Var2.e0();
            }
            l0(i);
            k69 k69Var = this.w0;
            if (k69Var != null) {
                k69Var.a(this, i);
            }
            ArrayList arrayList = this.x0;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((k69) this.x0.get(size)).a(this, i);
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

    public void setViewCacheExtension(s69 s69Var) {
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
        ofc ofcVar;
        View F;
        boolean z;
        r69 r69Var = this.v0;
        r69Var.a(1);
        D(r69Var);
        r69Var.i = false;
        A0();
        xab xabVar = this.f;
        qt qtVar = (qt) xabVar.b;
        qt qtVar2 = (qt) xabVar.b;
        qtVar.clear();
        vh6 vh6Var = (vh6) xabVar.c;
        vh6Var.b();
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
        r69Var.j = z4;
        r69Var.k = z4 && z3 && !this.R && this.d0 != null && this.y.x0();
        u69 u69Var = null;
        View focusedChild = (this.r0 && hasFocus() && this.x != null) ? getFocusedChild() : null;
        if (focusedChild != null && (F = F(focusedChild)) != null) {
            u69Var = T(F);
        }
        if (u69Var == null) {
            r69Var.m = -1L;
            r69Var.l = -1;
            r69Var.n = -1;
        } else {
            r69Var.m = this.x.b ? u69Var.e : -1L;
            r69Var.l = this.R ? -1 : u69Var.j() ? u69Var.d : u69Var.b();
            View view = u69Var.a;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            r69Var.n = id;
        }
        r69Var.h = r69Var.j && this.z0;
        this.z0 = false;
        this.y0 = false;
        r69Var.g = r69Var.k;
        r69Var.e = this.x.b();
        I(this.D0);
        boolean z5 = r69Var.j;
        mx6 mx6Var = this.e;
        if (z5) {
            int L = mx6Var.L();
            for (int i = 0; i < L; i++) {
                u69 U = U(mx6Var.K(i));
                if (!U.r() && (!U.h() || this.x.b)) {
                    az8 l = this.d0.l(r69Var, U, d69.b(U), U.d());
                    ofc ofcVar2 = (ofc) qtVar2.get(U);
                    if (ofcVar2 == null) {
                        ofcVar2 = ofc.a();
                        qtVar2.put(U, ofcVar2);
                    }
                    ofcVar2.b = l;
                    ofcVar2.a |= 4;
                    if (r69Var.h && U.m() && !U.j() && !U.r() && !U.h()) {
                        vh6Var.k(U, Q(U));
                    }
                }
            }
        }
        if (r69Var.k) {
            int T = mx6Var.T();
            for (int i2 = 0; i2 < T; i2++) {
                u69 U2 = U(mx6Var.S(i2));
                if (!U2.r()) {
                    if (U2.d == -1) {
                        U2.d = U2.c;
                    }
                    U2.h = U2.c;
                }
            }
            boolean z6 = r69Var.f;
            r69Var.f = false;
            this.y.a0(this.b, r69Var);
            r69Var.f = z6;
            for (int i3 = 0; i3 < mx6Var.L(); i3++) {
                u69 U3 = U(mx6Var.K(i3));
                if (!U3.r() && ((ofcVar = (ofc) qtVar2.get(U3)) == null || (ofcVar.a & 4) == 0)) {
                    int b = d69.b(U3);
                    boolean e = U3.e(TLObject.FLAG_13);
                    if (!e) {
                        b |= TLObject.FLAG_12;
                    }
                    az8 l2 = this.d0.l(r69Var, U3, b, U3.d());
                    if (e) {
                        p0(U3, l2);
                    } else {
                        ofc ofcVar3 = (ofc) qtVar2.get(U3);
                        if (ofcVar3 == null) {
                            ofcVar3 = ofc.a();
                            qtVar2.put(U3, ofcVar3);
                        }
                        ofcVar3.a |= 2;
                        ofcVar3.b = l2;
                    }
                }
            }
            n();
        } else {
            n();
        }
        j0(true);
        B0(false);
        r69Var.d = (byte) 2;
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
            WeakHashMap weakHashMap = kfc.a;
            postInvalidateOnAnimation();
        }
    }

    public final void u() {
        A0();
        i0();
        r69 r69Var = this.v0;
        r69Var.a(6);
        this.d.c();
        r69Var.e = this.x.b();
        r69Var.c = 0;
        r69Var.g = false;
        this.y.a0(this.b, r69Var);
        r69Var.f = false;
        this.c = null;
        r69Var.j = r69Var.j && this.d0 != null;
        r69Var.d = (byte) 4;
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
        y59 y59Var = this.x;
        int[] iArr = this.K0;
        if (y59Var != null) {
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
                        wt3.a(this.W, (-f) / getWidth(), 1.0f - (y / getHeight()));
                    } else if (f > 0.0f) {
                        A();
                        wt3.a(this.b0, f / getWidth(), y / getHeight());
                    } else {
                        z = false;
                        if (f2 >= 0.0f) {
                            B();
                            wt3.a(this.a0, (-f2) / getHeight(), x / getWidth());
                        } else {
                            if (f2 > 0.0f) {
                                y();
                                wt3.a(this.c0, f2 / getHeight(), 1.0f - (x / getWidth()));
                            }
                            if (!z || f != 0.0f || f2 != 0.0f) {
                                WeakHashMap weakHashMap = kfc.a;
                                postInvalidateOnAnimation();
                            }
                        }
                        z = true;
                        if (!z) {
                        }
                        WeakHashMap weakHashMap2 = kfc.a;
                        postInvalidateOnAnimation();
                    }
                    z = true;
                    if (f2 >= 0.0f) {
                    }
                    z = true;
                    if (!z) {
                    }
                    WeakHashMap weakHashMap22 = kfc.a;
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
        u69 u69Var;
        A0();
        i0();
        int i3 = ozb.a;
        Trace.beginSection("RV Scroll");
        r69 r69Var = this.v0;
        D(r69Var);
        ki2 ki2Var = this.b;
        int l0 = i != 0 ? this.y.l0(i, ki2Var, r69Var) : 0;
        int n0 = i2 != 0 ? this.y.n0(i2, ki2Var, r69Var) : 0;
        Trace.endSection();
        mx6 mx6Var = this.e;
        int L = mx6Var.L();
        for (int i4 = 0; i4 < L; i4++) {
            View K = mx6Var.K(i4);
            u69 T = T(K);
            if (T != null && (u69Var = T.k) != null) {
                View view = u69Var.a;
                int left = K.getLeft();
                int top = K.getTop();
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
        f69 f69Var = this.y;
        if (f69Var == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            f69Var.m0(i);
            awakenScrollBars();
        }
    }

    public final void x(int i, int i2) {
        this.U++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        m0(i2);
        k69 k69Var = this.w0;
        if (k69Var != null) {
            k69Var.b(this, i, i2);
        }
        ArrayList arrayList = this.x0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((k69) this.x0.get(size)).b(this, i, i2);
            }
        }
        this.U--;
    }

    public final void x0(int i, int i2, Interpolator interpolator) {
        f69 f69Var = this.y;
        if (f69Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.M) {
            return;
        }
        if (!f69Var.d()) {
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
        f69 f69Var = this.y;
        if (f69Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            f69Var.u0(this, this.v0, i);
        }
    }

    public void h0(View view) {
    }

    public void l0(int i) {
    }

    public void m0(int i) {
    }

    public void setRecyclerListener(n69 n69Var) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        f69 f69Var = this.y;
        if (f69Var != null) {
            return f69Var.p(layoutParams);
        }
        dq9.m("RecyclerView has no LayoutManager".concat(C()));
        return null;
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}
