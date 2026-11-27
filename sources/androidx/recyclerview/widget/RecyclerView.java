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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] R0 = {R.attr.clipToPadding};
    public static final if3 S0 = new if3(3);
    public final pq8 A0;
    public boolean B0;
    public h89 C0;
    public final int[] D0;
    public final ArrayList E;
    public zk7 E0;
    public final ArrayList F;
    public final int[] F0;
    public u79 G;
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
    public final i79 M0;
    public boolean N;
    public final xh4 N0;
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
    public n79 V;
    public EdgeEffect W;
    public final tu7 a;
    public EdgeEffect a0;
    public final oh2 b;
    public EdgeEffect b0;
    public z79 c;
    public EdgeEffect c0;
    public final ia d;
    public o79 d0;
    public final rx6 e;
    public int e0;
    public final k7b f;
    public int f0;
    public VelocityTracker g0;
    public boolean h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public t79 m0;
    public final i79 n;
    public final int n0;
    public final int o0;
    public final float p0;
    public final float q0;
    public final Rect r;
    public boolean r0;
    public final Rect s;
    public final e89 s0;
    public cu4 t0;
    public final pn u0;
    public final c89 v0;
    public final RectF w;
    public v79 w0;
    public j79 x;
    public ArrayList x0;
    public q79 y;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: Multi-variable type inference failed */
    public RecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float a;
        this.a = new tu7(this, (byte) 2);
        this.b = new oh2(this);
        this.f = new k7b((byte) 5);
        this.n = new i79(this, 0 == true ? 1 : 0);
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
        this.V = new n79();
        this.d0 = new zb3();
        this.e0 = 0;
        this.f0 = -1;
        this.p0 = Float.MIN_VALUE;
        this.q0 = Float.MIN_VALUE;
        byte b = 1;
        this.r0 = true;
        this.s0 = new e89(this);
        this.u0 = new pn();
        c89 c89Var = new c89();
        c89Var.a = -1;
        c89Var.b = 0;
        c89Var.c = 0;
        c89Var.d = (byte) 1;
        c89Var.e = 0;
        c89Var.f = false;
        c89Var.g = false;
        c89Var.h = false;
        c89Var.i = false;
        c89Var.j = false;
        c89Var.k = false;
        this.v0 = c89Var;
        this.y0 = false;
        this.z0 = false;
        pq8 pq8Var = new pq8((Object) this, (byte) 4);
        this.A0 = pq8Var;
        this.B0 = false;
        this.D0 = new int[2];
        this.F0 = new int[2];
        this.G0 = new int[2];
        this.H0 = 0;
        this.I0 = 0;
        this.J0 = null;
        this.K0 = new int[2];
        this.L0 = new ArrayList();
        this.M0 = new i79(this, b);
        this.N0 = new xh4((Object) this, (byte) 27);
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
            Method method = jhc.a;
            a = qq5.d(viewConfiguration);
        } else {
            a = jhc.a(viewConfiguration, context);
        }
        this.p0 = a;
        this.q0 = i >= 26 ? qq5.e(viewConfiguration) : jhc.a(viewConfiguration, context);
        this.n0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.o0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.d0.a = pq8Var;
        this.d = new ia(new k09(this, b));
        this.e = new rx6(new i09(this, b));
        WeakHashMap weakHashMap = ihc.a;
        if ((i >= 26 ? chc.a(this) : 0) == 0 && i >= 26) {
            chc.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.P = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new h89(this));
        setDescendantFocusability(262144);
        setNestedScrollingEnabled(true);
    }

    public static RecyclerView K(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView K = K(viewGroup.getChildAt(i));
            if (K != null) {
                return K;
            }
        }
        return null;
    }

    public static int S(View view) {
        f89 V = V(view);
        if (V != null) {
            return V.b();
        }
        return -1;
    }

    public static int T(View view) {
        f89 V = V(view);
        if (V != null) {
            return V.c();
        }
        return -1;
    }

    public static f89 V(View view) {
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof r79) {
            return ((r79) layoutParams).a;
        }
        return null;
    }

    public static void W(View view, Rect rect) {
        r79 r79Var = (r79) view.getLayoutParams();
        Rect rect2 = r79Var.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) r79Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) r79Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) r79Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) r79Var).bottomMargin);
    }

    private zk7 getScrollingChildHelper() {
        zk7 zk7Var = this.E0;
        if (zk7Var != null) {
            return zk7Var;
        }
        zk7 zk7Var2 = new zk7(this);
        this.E0 = zk7Var2;
        return zk7Var2;
    }

    public static void n(f89 f89Var) {
        WeakReference weakReference = f89Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == f89Var.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            f89Var.b = null;
        }
    }

    public final void A() {
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

    public final void A0(int i) {
        if (this.M) {
            return;
        }
        q79 q79Var = this.y;
        if (q79Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            q79Var.u0(this, this.v0, i);
        }
    }

    public final void B() {
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

    public final void B0() {
        int i = this.K + 1;
        this.K = i;
        if (i != 1 || this.M) {
            return;
        }
        this.L = false;
    }

    public final void C() {
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

    public final void C0(boolean z) {
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
                t();
            }
            if (!this.M) {
                this.L = false;
            }
        }
        this.K--;
    }

    public final String D() {
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

    public final void D0(int i) {
        getScrollingChildHelper().h(i);
    }

    public final void E(c89 c89Var) {
        if (getScrollState() != 2) {
            c89Var.getClass();
            return;
        }
        OverScroller overScroller = this.s0.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c89Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public void E0() {
        b89 b89Var;
        setScrollState(0);
        e89 e89Var = this.s0;
        RecyclerView recyclerView = e89Var.h;
        if (recyclerView.P0) {
            recyclerView.removeCallbacks(e89Var);
            e89Var.c.abortAnimation();
        }
        q79 q79Var = this.y;
        if (q79Var == null || (b89Var = q79Var.e) == null) {
            return;
        }
        b89Var.h();
    }

    public View F(float f, float f2) {
        rx6 rx6Var = this.e;
        for (int K = rx6Var.K() - 1; K >= 0; K--) {
            View J = rx6Var.J(K);
            float translationX = J.getTranslationX();
            float translationY = J.getTranslationY();
            if (f >= J.getLeft() + translationX && f <= J.getRight() + translationX && f2 >= J.getTop() + translationY && f2 <= J.getBottom() + translationY) {
                return J;
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
    public final View G(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    public final f89 H(View view) {
        View G = G(view);
        if (G == null) {
            return null;
        }
        return U(G);
    }

    public final boolean I(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            u79 u79Var = (u79) arrayList.get(i);
            if (u79Var.b(this, motionEvent) && action != 3) {
                this.G = u79Var;
                return true;
            }
        }
        return false;
    }

    public final void J(int[] iArr) {
        rx6 rx6Var = this.e;
        int K = rx6Var.K();
        if (K == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i2 = TLObject.FLAG_31;
        for (int i3 = 0; i3 < K; i3++) {
            f89 V = V(rx6Var.J(i3));
            if (V != null && !V.r()) {
                int c = V.c();
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

    public final f89 L(int i) {
        f89 f89Var = null;
        if (this.R) {
            return null;
        }
        rx6 rx6Var = this.e;
        int T = rx6Var.T();
        for (int i2 = 0; i2 < T; i2++) {
            f89 V = V(rx6Var.S(i2));
            if (V != null && !V.j() && O(V) == i) {
                if (!((ArrayList) rx6Var.d).contains(V.a)) {
                    return V;
                }
                f89Var = V;
            }
        }
        return f89Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f89 M(int i, boolean z) {
        rx6 rx6Var = this.e;
        int T = rx6Var.T();
        f89 f89Var = null;
        for (int i2 = 0; i2 < T; i2++) {
            f89 V = V(rx6Var.S(i2));
            if (V != null && !V.j()) {
                if (z) {
                    if (V.c != i) {
                        continue;
                    }
                    if (((ArrayList) rx6Var.d).contains(V.a)) {
                        return V;
                    }
                    f89Var = V;
                } else {
                    if (V.c() != i) {
                        continue;
                    }
                    if (((ArrayList) rx6Var.d).contains(V.a)) {
                    }
                }
            }
        }
        return f89Var;
    }

    public final void N(pt2 pt2Var) {
        for (int i = 0; i < getChildCount(); i++) {
            pt2Var.accept(getChildAt(i));
        }
        for (int i2 = 0; i2 < getHiddenChildCount(); i2++) {
            pt2Var.accept(X(i2));
        }
        for (int i3 = 0; i3 < getAttachedScrapChildCount(); i3++) {
            pt2Var.accept(P(i3));
        }
    }

    public final int O(f89 f89Var) {
        if (f89Var.e(524) || !f89Var.g()) {
            return -1;
        }
        int i = f89Var.c;
        ArrayList arrayList = (ArrayList) this.d.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ha haVar = (ha) arrayList.get(i2);
            byte b = haVar.a;
            if (b != 1) {
                if (b == 2) {
                    int i3 = haVar.b;
                    if (i3 <= i) {
                        int i4 = haVar.d;
                        if (i3 + i4 > i) {
                            return -1;
                        }
                        i -= i4;
                    } else {
                        continue;
                    }
                } else if (b == 8) {
                    int i5 = haVar.b;
                    if (i5 == i) {
                        i = haVar.d;
                    } else {
                        if (i5 < i) {
                            i--;
                        }
                        if (haVar.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (haVar.b <= i) {
                i += haVar.d;
            }
        }
        return i;
    }

    public final View P(int i) {
        if (i < 0) {
            return null;
        }
        oh2 oh2Var = this.b;
        if (i < ((ArrayList) oh2Var.c).size()) {
            return ((f89) ((ArrayList) oh2Var.c).get(i)).a;
        }
        return null;
    }

    public final View Q(int i) {
        if (i < 0) {
            return null;
        }
        oh2 oh2Var = this.b;
        if (i < ((ArrayList) oh2Var.e).size()) {
            return ((f89) ((ArrayList) oh2Var.e).get(i)).a;
        }
        return null;
    }

    public final long R(f89 f89Var) {
        return this.x.b ? f89Var.e : f89Var.c;
    }

    public final f89 U(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return V(view);
        }
        c22.c("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final View X(int i) {
        ArrayList arrayList = (ArrayList) this.e.d;
        if (i < 0 || i >= arrayList.size()) {
            return null;
        }
        return (View) arrayList.get(i);
    }

    public final Rect Y(View view) {
        r79 r79Var = (r79) view.getLayoutParams();
        boolean z = r79Var.c;
        Rect rect = r79Var.b;
        if (z) {
            c89 c89Var = this.v0;
            if (!c89Var.g || (!r79Var.a.m() && !r79Var.a.h())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.E;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect2 = this.r;
                    rect2.set(0, 0, 0, 0);
                    ((p79) arrayList.get(i)).d(rect2, view, this, c89Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                r79Var.c = false;
                return rect;
            }
        }
        return rect;
    }

    public final p79 Z(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return (p79) this.E.get(i);
        }
        su3.g(qd4.m(i, itemDecorationCount, " is an invalid index for size "));
        return null;
    }

    public final void a0(long j, f89 f89Var, f89 f89Var2) {
        rx6 rx6Var = this.e;
        int K = rx6Var.K();
        for (int i = 0; i < K; i++) {
            f89 V = V(rx6Var.J(i));
            if (V != f89Var && R(V) == j) {
                j79 j79Var = this.x;
                if (j79Var == null || !j79Var.b) {
                    StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(V);
                    sb.append(" \n View Holder 2:");
                    sb.append(f89Var);
                    grb.k(sb, D());
                    return;
                }
                StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(V);
                sb2.append(" \n View Holder 2:");
                sb2.append(f89Var);
                grb.k(sb2, D());
                return;
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + f89Var2 + " cannot be found but it is necessary for " + f89Var + D());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        q79 q79Var = this.y;
        if (q79Var != null) {
            q79Var.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final boolean b0() {
        return !this.J || this.R || this.d.g();
    }

    public final void c0() {
        if (this.E.size() == 0) {
            return;
        }
        q79 q79Var = this.y;
        if (q79Var != null) {
            q79Var.b("Cannot invalidate item decorations during a scroll or layout");
        }
        g0();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof r79) && this.y.f((r79) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        q79 q79Var = this.y;
        if (q79Var == null || !q79Var.d()) {
            return 0;
        }
        return ((x46) this.y).A0(this.v0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        q79 q79Var = this.y;
        if (q79Var == null || !q79Var.d()) {
            return 0;
        }
        return this.y.h(this.v0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        q79 q79Var = this.y;
        if (q79Var == null || !q79Var.d()) {
            return 0;
        }
        return this.y.i(this.v0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        q79 q79Var = this.y;
        if (q79Var == null || !q79Var.e()) {
            return 0;
        }
        return this.y.j(this.v0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        q79 q79Var = this.y;
        if (q79Var == null || !q79Var.e()) {
            return 0;
        }
        return this.y.k(this.v0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        q79 q79Var = this.y;
        if (q79Var == null || !q79Var.e()) {
            return 0;
        }
        return this.y.l(this.v0);
    }

    public final boolean d0() {
        o79 o79Var = this.d0;
        return o79Var != null && o79Var.k();
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
            ((p79) arrayList.get(i)).f(canvas, this);
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
            WeakHashMap weakHashMap = ihc.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final boolean e0() {
        return this.T > 0;
    }

    public final void f0(int i) {
        if (this.y == null) {
            return;
        }
        setScrollState(2);
        this.y.m0(i);
        awakenScrollBars();
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
        boolean z2 = (this.x == null || this.y == null || e0() || this.M) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        c89 c89Var = this.v0;
        oh2 oh2Var = this.b;
        if (z2 && (i == 2 || i == 1)) {
            if (this.y.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? jn7.N1 : 33) == null) {
                    z = true;
                    if (!z && this.y.d()) {
                        RecyclerView recyclerView = this.y.b;
                        WeakHashMap weakHashMap = ihc.a;
                        z = focusFinder.findNextFocus(this, view, !((i != 2) ^ (recyclerView.getLayoutDirection() != 1)) ? 66 : 17) != null;
                    }
                    if (z) {
                        q();
                        if (G(view) != null) {
                            B0();
                            this.y.Q(view, i, oh2Var, c89Var);
                            C0(false);
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
                            WeakHashMap weakHashMap2 = ihc.a;
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
                WeakHashMap weakHashMap3 = ihc.a;
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
            q();
            if (G(view) != null) {
                B0();
                view2 = this.y.Q(view, i, oh2Var, c89Var);
                C0(false);
            }
            return null;
        }
        view2 = findNextFocus;
        if (view2 == null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            t0(view2, null);
            return view;
        }
        if (view2 != null && view2 != this && view2 != view && G(view2) != null) {
            if (view != null && G(view) != null) {
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
                WeakHashMap weakHashMap22 = ihc.a;
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
                                        throw new IllegalArgumentException("Invalid direction: " + i + D());
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

    public final void g0() {
        rx6 rx6Var = this.e;
        int T = rx6Var.T();
        for (int i = 0; i < T; i++) {
            ((r79) rx6Var.S(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = (ArrayList) this.b.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            r79 r79Var = (r79) ((f89) arrayList.get(i2)).a.getLayoutParams();
            if (r79Var != null) {
                r79Var.c = true;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        q79 q79Var = this.y;
        if (q79Var != null) {
            return q79Var.n();
        }
        grb.i("RecyclerView has no LayoutManager".concat(D()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        q79 q79Var = this.y;
        if (q79Var != null) {
            return q79Var.o(getContext(), attributeSet);
        }
        grb.i("RecyclerView has no LayoutManager".concat(D()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public j79 getAdapter() {
        return this.x;
    }

    public int getAttachedScrapChildCount() {
        return ((ArrayList) this.b.c).size();
    }

    @Override // android.view.View
    public int getBaseline() {
        q79 q79Var = this.y;
        if (q79Var == null) {
            return super.getBaseline();
        }
        q79Var.getClass();
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

    public h89 getCompatAccessibilityDelegate() {
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

    public n79 getEdgeEffectFactory() {
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

    public o79 getItemAnimator() {
        return this.d0;
    }

    public int getItemDecorationCount() {
        return this.E.size();
    }

    public q79 getLayoutManager() {
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

    public t79 getOnFlingListener() {
        return this.m0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.r0;
    }

    public x79 getRecycledViewPool() {
        oh2 oh2Var = this.b;
        x79 x79Var = (x79) oh2Var.g;
        if (x79Var != null) {
            return x79Var;
        }
        x79 x79Var2 = new x79();
        oh2Var.g = x79Var2;
        return x79Var2;
    }

    public int getScrollState() {
        return this.e0;
    }

    public int getTopGlowOffset() {
        return this.H0;
    }

    public final void h(f89 f89Var) {
        View view = f89Var.a;
        boolean z = view.getParent() == this;
        this.b.l(U(view));
        boolean l = f89Var.l();
        rx6 rx6Var = this.e;
        if (l) {
            rx6Var.s(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            rx6Var.r(-1, view, true);
            return;
        }
        int indexOfChild = ((RecyclerView) ((i09) rx6Var.b).b).indexOfChild(view);
        if (indexOfChild < 0) {
            lq5.q(view, "view is not a child, cannot hide ");
        } else {
            ((zg2) rx6Var.c).B(indexOfChild);
            rx6Var.W(view);
        }
    }

    public final void h0(int i, int i2, boolean z) {
        int i3 = i + i2;
        rx6 rx6Var = this.e;
        int T = rx6Var.T();
        for (int i4 = 0; i4 < T; i4++) {
            f89 V = V(rx6Var.S(i4));
            if (V != null && !V.r()) {
                int i5 = V.c;
                c89 c89Var = this.v0;
                if (i5 >= i3) {
                    V.n(-i2, z);
                    c89Var.f = true;
                } else if (i5 >= i) {
                    V.a(8);
                    V.n(-i2, z);
                    V.c = i - 1;
                    c89Var.f = true;
                }
            }
        }
        oh2 oh2Var = this.b;
        ArrayList arrayList = (ArrayList) oh2Var.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f89 f89Var = (f89) arrayList.get(size);
            if (f89Var != null) {
                int i6 = f89Var.c;
                if (i6 >= i3) {
                    f89Var.n(-i2, z);
                } else if (i6 >= i) {
                    f89Var.a(8);
                    oh2Var.g(size);
                }
            }
        }
        requestLayout();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(p79 p79Var) {
        q79 q79Var = this.y;
        if (q79Var != null) {
            q79Var.b("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(p79Var);
        g0();
        requestLayout();
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

    public final void j(v79 v79Var) {
        ArrayList arrayList = this.x0;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.x0 = arrayList;
        }
        arrayList.add(v79Var);
    }

    public final void j0() {
        this.T++;
    }

    public final void k(EdgeEffect edgeEffect) {
        Integer num;
        if (edgeEffect == null || (num = this.J0) == null) {
            return;
        }
        edgeEffect.setColor(num.intValue());
    }

    public final void k0(boolean z) {
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
                    f89 f89Var = (f89) arrayList.get(size);
                    if (f89Var.a.getParent() == this && !f89Var.r() && (i = f89Var.s) != -1) {
                        View view = f89Var.a;
                        WeakHashMap weakHashMap = ihc.a;
                        view.setImportantForAccessibility(i);
                        f89Var.s = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void l(String str) {
        if (!e0()) {
            if (this.U > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(D()));
            }
        } else if (str == null) {
            grb.i("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(D()));
        } else {
            grb.i(str);
        }
    }

    public final void l0(MotionEvent motionEvent) {
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

    public void m(Canvas canvas, View view, long j) {
        drawChild(canvas, view, j);
    }

    public final void o() {
        rx6 rx6Var = this.e;
        int T = rx6Var.T();
        for (int i = 0; i < T; i++) {
            f89 V = V(rx6Var.S(i));
            if (V != null && !V.r()) {
                V.d = -1;
                V.g = -1;
            }
        }
        oh2 oh2Var = this.b;
        ArrayList arrayList = (ArrayList) oh2Var.c;
        ArrayList arrayList2 = (ArrayList) oh2Var.e;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            f89 f89Var = (f89) arrayList2.get(i2);
            f89Var.d = -1;
            f89Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            f89 f89Var2 = (f89) arrayList.get(i3);
            f89Var2.d = -1;
            f89Var2.g = -1;
        }
        ArrayList arrayList3 = (ArrayList) oh2Var.d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                f89 f89Var3 = (f89) ((ArrayList) oh2Var.d).get(i4);
                f89Var3.d = -1;
                f89Var3.g = -1;
            }
        }
    }

    public final void o0() {
        if (this.B0 || !this.H) {
            return;
        }
        WeakHashMap weakHashMap = ihc.a;
        postOnAnimation(this.M0);
        this.B0 = true;
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
        ThreadLocal threadLocal = cu4.e;
        cu4 cu4Var = (cu4) threadLocal.get();
        this.t0 = cu4Var;
        if (cu4Var == null) {
            cu4 cu4Var2 = new cu4();
            cu4Var2.a = new ArrayList();
            cu4Var2.d = new ArrayList();
            this.t0 = cu4Var2;
            WeakHashMap weakHashMap = ihc.a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            cu4 cu4Var3 = this.t0;
            cu4Var3.c = (long) (1.0E9f / f);
            threadLocal.set(cu4Var3);
        }
        this.t0.a.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o79 o79Var = this.d0;
        if (o79Var != null) {
            o79Var.g();
        }
        E0();
        this.H = false;
        this.L0.clear();
        removeCallbacks(this.M0);
        this.f.getClass();
        while (mhc.d.U() != null) {
        }
        cu4 cu4Var = this.t0;
        if (cu4Var != null) {
            cu4Var.a.remove(this);
            this.t0 = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((p79) arrayList.get(i)).e(canvas, this);
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
                        v0((int) (f2 * this.p0), (int) (f * this.q0), motionEvent);
                    }
                }
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                v0((int) (f2 * this.p0), (int) (f * this.q0), motionEvent);
            } else {
                if ((motionEvent.getSource() & TLObject.FLAG_22) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.y.e()) {
                        f = -axisValue;
                        f2 = 0.0f;
                        if (f == 0.0f) {
                        }
                        v0((int) (f2 * this.p0), (int) (f * this.q0), motionEvent);
                    } else if (this.y.d()) {
                        f2 = axisValue;
                        f = 0.0f;
                        if (f == 0.0f) {
                        }
                        v0((int) (f2 * this.p0), (int) (f * this.q0), motionEvent);
                    }
                }
                f = 0.0f;
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                v0((int) (f2 * this.p0), (int) (f * this.q0), motionEvent);
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
            if (I(motionEvent)) {
                u0();
                setScrollState(0);
                return true;
            }
            q79 q79Var = this.y;
            if (q79Var != null) {
                boolean d = q79Var.d();
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
                        D0(1);
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
                    D0(0);
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
                    u0();
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
                    l0(motionEvent);
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
        int i5 = n1c.a;
        Trace.beginSection("RV OnLayout");
        t();
        Trace.endSection();
        this.J = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.y == null) {
            r(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        q79 q79Var = this.y;
        oh2 oh2Var = this.b;
        c89 c89Var = this.v0;
        q79Var.c0(oh2Var, c89Var, i, i2);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.x == null) {
            return;
        }
        if (c89Var.d == 1) {
            u();
        }
        this.y.p0(i, i2);
        c89Var.i = true;
        v();
        this.y.r0(i, i2);
        x46 x46Var = (x46) this.y;
        if (x46Var.l == 1073741824 || x46Var.k == 1073741824) {
            return;
        }
        int r = x46Var.r();
        for (int i3 = 0; i3 < r; i3++) {
            ViewGroup.LayoutParams layoutParams = x46Var.q(i3).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                this.y.p0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                c89Var.i = true;
                v();
                this.y.r0(i, i2);
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (e0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof z79)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z79 z79Var = (z79) parcelable;
        this.c = z79Var;
        super.onRestoreInstanceState(z79Var.a);
        q79 q79Var = this.y;
        if (q79Var == null || (parcelable2 = this.c.c) == null) {
            return;
        }
        x46 x46Var = (x46) q79Var;
        if (parcelable2 instanceof w46) {
            x46Var.B = (w46) parcelable2;
            x46Var.k0();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        z79 z79Var = new z79(super.onSaveInstanceState());
        z79 z79Var2 = this.c;
        if (z79Var2 != null) {
            z79Var.c = z79Var2.c;
            return z79Var;
        }
        q79 q79Var = this.y;
        if (q79Var != null) {
            z79Var.c = q79Var.d0();
            return z79Var;
        }
        z79Var.c = null;
        return z79Var;
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
            u79 u79Var = this.G;
            if (u79Var == null) {
                z = motionEvent.getAction() == 0 ? false : I(motionEvent);
            } else {
                u79Var.a(this, motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.G = null;
                }
                z = true;
            }
            if (z) {
                u0();
                setScrollState(0);
                return true;
            }
            q79 q79Var = this.y;
            if (q79Var != null) {
                boolean d = q79Var.d();
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
                            q79 q79Var2 = this.y;
                            if (q79Var2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.M) {
                                int d2 = q79Var2.d();
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
                                        t79 t79Var = this.m0;
                                        if (t79Var == null || !t79Var.a(i3, i4)) {
                                            if (z3) {
                                                if (e2) {
                                                    d2 = (d2 == true ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().g(d2, 1);
                                                int i6 = -i2;
                                                int max = Math.max(i6, Math.min(i3, i2));
                                                int max2 = Math.max(i6, Math.min(i4, i2));
                                                e89 e89Var = this.s0;
                                                RecyclerView recyclerView = e89Var.h;
                                                recyclerView.setScrollState(2);
                                                e89Var.b = 0;
                                                e89Var.a = 0;
                                                Interpolator interpolator = e89Var.d;
                                                if3 if3Var = S0;
                                                if (interpolator != if3Var) {
                                                    e89Var.d = if3Var;
                                                    e89Var.c = new OverScroller(recyclerView.getContext(), if3Var);
                                                }
                                                e89Var.c.fling(0, 0, max, max2, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                e89Var.a();
                                            }
                                        }
                                        u0();
                                        obtain.recycle();
                                        return true;
                                    }
                                }
                            }
                        }
                        setScrollState(0);
                        u0();
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
                        boolean w = w(i7, i8, 0, iArr2, this.F0);
                        int[] iArr3 = this.F0;
                        if (w) {
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
                            if (v0(d != 0 ? i7 : 0, e ? i8 : 0, obtain)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            cu4 cu4Var = this.t0;
                            if (cu4Var != null && (i7 != 0 || i8 != 0)) {
                                cu4Var.a(this, i7, i8);
                            }
                        }
                    } else if (actionMasked == 3) {
                        u0();
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
                        l0(motionEvent);
                    }
                }
                this.g0.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p(int i, int i2) {
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
            WeakHashMap weakHashMap = ihc.a;
            postInvalidateOnAnimation();
        }
    }

    public final void p0(boolean z) {
        this.S |= z;
        this.R = true;
        rx6 rx6Var = this.e;
        int T = rx6Var.T();
        for (int i = 0; i < T; i++) {
            f89 V = V(rx6Var.S(i));
            if (V != null && !V.r()) {
                V.a(6);
            }
        }
        g0();
        oh2 oh2Var = this.b;
        ArrayList arrayList = (ArrayList) oh2Var.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            f89 f89Var = (f89) arrayList.get(i2);
            if (f89Var != null) {
                f89Var.a(6);
                f89Var.a(1024);
            }
        }
        j79 j79Var = ((RecyclerView) oh2Var.h).x;
        if (j79Var == null || !j79Var.b) {
            oh2Var.f();
        }
    }

    public final void q() {
        if (!this.J || this.R) {
            int i = n1c.a;
            Trace.beginSection("RV FullInvalidate");
            t();
            Trace.endSection();
            return;
        }
        ia iaVar = this.d;
        if (iaVar.g()) {
            int i2 = iaVar.b;
            if ((i2 & 4) == 0 || (i2 & 11) != 0) {
                if (iaVar.g()) {
                    int i3 = n1c.a;
                    Trace.beginSection("RV FullInvalidate");
                    t();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i4 = n1c.a;
            Trace.beginSection("RV PartialInvalidate");
            B0();
            j0();
            iaVar.k();
            if (!this.L) {
                rx6 rx6Var = this.e;
                int K = rx6Var.K();
                int i5 = 0;
                while (true) {
                    if (i5 < K) {
                        f89 V = V(rx6Var.J(i5));
                        if (V != null && !V.r() && V.m()) {
                            t();
                            break;
                        }
                        i5++;
                    } else {
                        iaVar.b();
                        break;
                    }
                }
            }
            C0(true);
            k0(true);
            Trace.endSection();
        }
    }

    public final void q0(f89 f89Var, l09 l09Var) {
        f89Var.p(0, TLObject.FLAG_13);
        boolean z = this.v0.h;
        k7b k7bVar = this.f;
        if (z && f89Var.m() && !f89Var.j() && !f89Var.r()) {
            ((zh6) k7bVar.c).k(R(f89Var), f89Var);
        }
        qs qsVar = (qs) k7bVar.b;
        mhc mhcVar = (mhc) qsVar.get(f89Var);
        if (mhcVar == null) {
            mhcVar = mhc.a();
            qsVar.put(f89Var, mhcVar);
        }
        mhcVar.b = l09Var;
        mhcVar.a |= 4;
    }

    public final void r(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = ihc.a;
        setMeasuredDimension(q79.g(i, paddingRight, getMinimumWidth()), q79.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void r0() {
        o79 o79Var = this.d0;
        if (o79Var != null) {
            o79Var.g();
        }
        q79 q79Var = this.y;
        oh2 oh2Var = this.b;
        if (q79Var != null) {
            q79Var.f0(oh2Var);
            this.y.g0(oh2Var);
        }
        ((ArrayList) oh2Var.c).clear();
        oh2Var.f();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        f89 V = V(view);
        if (V != null) {
            if (V.l()) {
                V.l &= -257;
            } else if (!V.r()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + V + D());
            }
        }
        view.clearAnimation();
        s(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        b89 b89Var = this.y.e;
        if ((b89Var == null || !b89Var.e) && !e0() && view2 != null) {
            t0(view, view2);
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
            ((u79) arrayList.get(i)).c(z);
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

    public final void s(View view) {
        f89 V = V(view);
        j79 j79Var = this.x;
        if (j79Var != null && V != null) {
            j79Var.z(V);
        }
        ArrayList arrayList = this.Q;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((s79) this.Q.get(size)).b(view);
            }
        }
    }

    public final void s0(p79 p79Var) {
        q79 q79Var = this.y;
        if (q79Var != null) {
            q79Var.b("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.E;
        arrayList.remove(p79Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        g0();
        requestLayout();
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        q79 q79Var = this.y;
        if (q79Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.M) {
            return;
        }
        boolean d = q79Var.d();
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
        v0(i, i2, null);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!e0()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.O |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(h89 h89Var) {
        this.C0 = h89Var;
        ihc.l(this, h89Var);
    }

    public void setAdapter(j79 j79Var) {
        setLayoutFrozen(false);
        j79 j79Var2 = this.x;
        tu7 tu7Var = this.a;
        if (j79Var2 != null) {
            j79Var2.a.unregisterObserver(tu7Var);
            this.x.getClass();
        }
        r0();
        ia iaVar = this.d;
        iaVar.l((ArrayList) iaVar.d);
        iaVar.l((ArrayList) iaVar.e);
        iaVar.b = 0;
        j79 j79Var3 = this.x;
        this.x = j79Var;
        if (j79Var != null) {
            j79Var.B(tu7Var);
        }
        q79 q79Var = this.y;
        if (q79Var != null) {
            q79Var.P();
        }
        this.b.e(j79Var3, this.x);
        this.v0.f = true;
        p0(false);
        requestLayout();
    }

    public void setAdditionalDebugInfo(String str) {
        this.O0 = str;
    }

    public void setBottomGlowOffset(int i) {
        this.I0 = i;
    }

    public void setChildDrawingOrderCallback(m79 m79Var) {
        if (m79Var == null) {
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

    public void setEdgeEffectFactory(n79 n79Var) {
        n79Var.getClass();
        this.V = n79Var;
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

    public void setItemAnimator(o79 o79Var) {
        o79 o79Var2 = this.d0;
        if (o79Var2 != null) {
            o79Var2.g();
            this.d0.a = null;
        }
        this.d0 = o79Var;
        if (o79Var != null) {
            o79Var.a = this.A0;
        }
    }

    public void setItemViewCacheSize(int i) {
        oh2 oh2Var = this.b;
        oh2Var.a = i;
        oh2Var.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(q79 q79Var) {
        if (q79Var == this.y) {
            return;
        }
        E0();
        q79 q79Var2 = this.y;
        oh2 oh2Var = this.b;
        if (q79Var2 != null) {
            o79 o79Var = this.d0;
            if (o79Var != null) {
                o79Var.g();
            }
            this.y.f0(oh2Var);
            this.y.g0(oh2Var);
            ((ArrayList) oh2Var.c).clear();
            oh2Var.f();
            if (this.H) {
                this.y.getClass();
            }
            this.y.s0(null);
            this.y = null;
        } else {
            ((ArrayList) oh2Var.c).clear();
            oh2Var.f();
        }
        this.e.j0();
        this.y = q79Var;
        if (q79Var != null) {
            if (q79Var.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(q79Var);
                String D = q79Var.b.D();
                sb.append(" is already attached to a RecyclerView:");
                sb.append(D);
                throw new IllegalArgumentException(sb.toString());
            }
            q79Var.s0(this);
            if (this.H) {
                this.y.getClass();
            }
        }
        oh2Var.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            lq5.j("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        zk7 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = ihc.a;
            ahc.j(viewGroup);
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(t79 t79Var) {
        this.m0 = t79Var;
    }

    @Deprecated
    public void setOnScrollListener(v79 v79Var) {
        this.w0 = v79Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.r0 = z;
    }

    public void setRecycledViewPool(x79 x79Var) {
        oh2 oh2Var = this.b;
        if (((x79) oh2Var.g) != null) {
            r0.b--;
        }
        oh2Var.g = x79Var;
        if (x79Var == null || ((RecyclerView) oh2Var.h).getAdapter() == null) {
            return;
        }
        ((x79) oh2Var.g).b++;
    }

    public void setScrollState(int i) {
        b89 b89Var;
        if (i != this.e0) {
            this.e0 = i;
            if (i != 2) {
                e89 e89Var = this.s0;
                RecyclerView recyclerView = e89Var.h;
                if (recyclerView.P0) {
                    recyclerView.removeCallbacks(e89Var);
                    e89Var.c.abortAnimation();
                }
                q79 q79Var = this.y;
                if (q79Var != null && (b89Var = q79Var.e) != null) {
                    b89Var.h();
                }
            }
            q79 q79Var2 = this.y;
            if (q79Var2 != null) {
                q79Var2.e0();
            }
            m0(i);
            v79 v79Var = this.w0;
            if (v79Var != null) {
                v79Var.a(this, i);
            }
            ArrayList arrayList = this.x0;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((v79) this.x0.get(size)).a(this, i);
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

    public void setViewCacheExtension(d89 d89Var) {
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
                E0();
                return;
            }
            this.M = false;
            if (this.L && this.y != null && this.x != null) {
                requestLayout();
            }
            this.L = false;
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
    public final void t() {
        mhc mhcVar;
        ?? r12;
        RecyclerView recyclerView;
        boolean r;
        int i;
        boolean z;
        int i2;
        f89 f89Var;
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
        c89 c89Var = this.v0;
        boolean z3 = false;
        c89Var.i = false;
        ?? r4 = 1;
        if (c89Var.d == 1) {
            u();
            this.y.o0(this);
            v();
        } else {
            ia iaVar = this.d;
            if ((((ArrayList) iaVar.e).isEmpty() || ((ArrayList) iaVar.d).isEmpty()) && this.y.m == getWidth() && this.y.n == getHeight()) {
                this.y.o0(this);
            } else {
                this.y.o0(this);
                v();
            }
        }
        c89Var.a(4);
        B0();
        j0();
        c89Var.d = (byte) 1;
        boolean z4 = c89Var.j;
        rx6 rx6Var = this.e;
        oh2 oh2Var = this.b;
        k7b k7bVar = this.f;
        if (z4) {
            try {
                int K = rx6Var.K() - 1;
                while (K >= 0) {
                    f89 V = V(rx6Var.J(K));
                    if (V != null && !V.r()) {
                        long R = R(V);
                        this.d0.getClass();
                        l09 l09Var = new l09((byte) 4);
                        View view = V.a;
                        l09Var.b = view.getLeft();
                        l09Var.c = view.getTop();
                        view.getRight();
                        view.getBottom();
                        zh6 zh6Var = (zh6) k7bVar.c;
                        qs qsVar = (qs) k7bVar.b;
                        f89 f89Var2 = (f89) zh6Var.f(R);
                        if (f89Var2 == null || f89Var2.r()) {
                            z = r4;
                            k7bVar.k(V, l09Var);
                        } else {
                            mhc mhcVar2 = (mhc) qsVar.get(f89Var2);
                            ?? r7 = (mhcVar2 == null || (mhcVar2.a & r4) == 0) ? false : r4;
                            mhc mhcVar3 = (mhc) qsVar.get(V);
                            ?? r15 = (mhcVar3 == null || (mhcVar3.a & r4) == 0) ? false : r4;
                            if (r7 == true && f89Var2 == V) {
                                k7bVar.k(V, l09Var);
                            } else {
                                z = r4;
                                l09 p = k7bVar.p(f89Var2, 4);
                                k7bVar.k(V, l09Var);
                                l09 p2 = k7bVar.p(V, 8);
                                if (p == null) {
                                    a0(R, V, f89Var2);
                                } else {
                                    f89Var2.q(false);
                                    if (r7 != false) {
                                        h(f89Var2);
                                    }
                                    if (f89Var2 != V) {
                                        if (r15 != false) {
                                            h(V);
                                        }
                                        f89Var2.j = V;
                                        h(f89Var2);
                                        oh2Var.l(f89Var2);
                                        V.q(false);
                                        V.k = f89Var2;
                                    }
                                    cma cmaVar = (cma) this.d0;
                                    cmaVar.getClass();
                                    int i3 = p.b;
                                    int i4 = p.c;
                                    if (V.r()) {
                                        i2 = p.b;
                                        p2 = p;
                                    } else {
                                        i2 = p2.b;
                                    }
                                    if (cmaVar.q(f89Var2, V, p, i3, i4, i2, p2.c)) {
                                        o0();
                                    }
                                }
                            }
                        }
                        K--;
                        r4 = z;
                    }
                    z = r4;
                    K--;
                    r4 = z;
                }
                boolean z5 = r4;
                qs qsVar2 = (qs) k7bVar.b;
                int i5 = qsVar2.c - 1;
                while (i5 >= 0) {
                    f89 f89Var3 = (f89) qsVar2.f(i5);
                    try {
                        mhcVar = (mhc) qsVar2.g(i5);
                    } catch (Exception e) {
                        cc4.g(e, z5);
                        mhcVar = null;
                    }
                    if (mhcVar != null) {
                        int i6 = mhcVar.a;
                        int i7 = i6 & 3;
                        xh4 xh4Var = this.N0;
                        if (i7 == 3) {
                            xh4Var.P(f89Var3);
                        } else if ((i6 & 1) != 0) {
                            l09 l09Var2 = mhcVar.b;
                            if (l09Var2 == null) {
                                xh4Var.P(f89Var3);
                            } else {
                                xh4Var.I(f89Var3, l09Var2, mhcVar.c);
                            }
                        } else if ((i6 & 14) == 14) {
                            l09 l09Var3 = mhcVar.b;
                            l09 l09Var4 = mhcVar.c;
                            RecyclerView recyclerView2 = (RecyclerView) xh4Var.b;
                            f89Var3.q(z3);
                            if (recyclerView2.d0.a(f89Var3, l09Var3, l09Var4)) {
                                recyclerView2.o0();
                            }
                        } else {
                            if ((i6 & 12) == 12) {
                                l09 l09Var5 = mhcVar.b;
                                l09 l09Var6 = mhcVar.c;
                                xh4Var.getClass();
                                f89Var3.q(z3);
                                RecyclerView recyclerView3 = (RecyclerView) xh4Var.b;
                                boolean z6 = recyclerView3.R;
                                o79 o79Var = recyclerView3.d0;
                                if (z6) {
                                    cma cmaVar2 = (cma) o79Var;
                                    cmaVar2.getClass();
                                    int i8 = l09Var5.b;
                                    int i9 = l09Var5.c;
                                    if (f89Var3.r()) {
                                        i = l09Var5.b;
                                        l09Var6 = l09Var5;
                                    } else {
                                        i = l09Var6.b;
                                    }
                                    if (cmaVar2.q(f89Var3, f89Var3, l09Var5, i8, i9, i, l09Var6.c)) {
                                        recyclerView3.o0();
                                    }
                                } else {
                                    cma cmaVar3 = (cma) o79Var;
                                    cmaVar3.getClass();
                                    int i10 = l09Var5.b;
                                    int i11 = l09Var6.b;
                                    if (i10 == i11) {
                                        recyclerView = recyclerView3;
                                        if (l09Var5.c == l09Var6.c) {
                                            cmaVar3.v(f89Var3);
                                            r = false;
                                            if (r) {
                                                recyclerView.o0();
                                            }
                                        }
                                    } else {
                                        recyclerView = recyclerView3;
                                    }
                                    r = cmaVar3.r(f89Var3, l09Var5, i10, l09Var5.c, i11, l09Var6.c);
                                    if (r) {
                                    }
                                }
                            } else if ((i6 & 4) != 0) {
                                xh4Var.I(f89Var3, mhcVar.b, null);
                            } else if ((i6 & 8) != 0) {
                                l09 l09Var7 = mhcVar.b;
                                l09 l09Var8 = mhcVar.c;
                                RecyclerView recyclerView4 = (RecyclerView) xh4Var.b;
                                r12 = 0;
                                r12 = 0;
                                f89Var3.q(false);
                                if (recyclerView4.d0.a(f89Var3, l09Var7, l09Var8)) {
                                    recyclerView4.o0();
                                }
                                mhcVar.a = r12;
                                mhcVar.b = null;
                                mhcVar.c = null;
                                mhc.d.r0(mhcVar);
                            }
                            r12 = 0;
                            mhcVar.a = r12;
                            mhcVar.b = null;
                            mhcVar.c = null;
                            mhc.d.r0(mhcVar);
                        }
                        r12 = z3;
                        mhcVar.a = r12;
                        mhcVar.b = null;
                        mhcVar.c = null;
                        mhc.d.r0(mhcVar);
                    }
                    i5--;
                    z3 = false;
                    z5 = true;
                }
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder();
                for (int K2 = rx6Var.K() - 1; K2 >= 0; K2--) {
                    f89 V2 = V(rx6Var.J(K2));
                    if (V2 != null && !V2.r()) {
                        sb.append("Holder at" + K2 + " " + V2 + "\n");
                    }
                }
                throw new RuntimeException(sb.toString(), e2);
            }
        }
        View view2 = null;
        this.y.g0(oh2Var);
        c89Var.b = c89Var.e;
        this.R = false;
        this.S = false;
        c89Var.j = false;
        c89Var.k = false;
        this.y.f = false;
        ArrayList arrayList = (ArrayList) oh2Var.d;
        if (arrayList != null) {
            arrayList.clear();
        }
        q79 q79Var = this.y;
        if (q79Var.j) {
            q79Var.i = 0;
            q79Var.j = false;
            oh2Var.m();
        }
        this.y.b0(c89Var);
        k0(true);
        C0(false);
        ((qs) k7bVar.b).clear();
        ((zh6) k7bVar.c).b();
        int[] iArr = this.D0;
        int i12 = iArr[0];
        int i13 = iArr[1];
        J(iArr);
        if (iArr[0] != i12 || iArr[1] != i13) {
            y(0, 0);
        }
        if (this.r0 && this.x != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j = c89Var.m;
            if (j != -1 && (z2 = this.x.b) && z2) {
                int T = rx6Var.T();
                f89Var = null;
                int i14 = 0;
                while (true) {
                    if (i14 >= T) {
                        break;
                    }
                    f89 V3 = V(rx6Var.S(i14));
                    if (V3 != null && !V3.j() && V3.e == j) {
                        if (!((ArrayList) rx6Var.d).contains(V3.a)) {
                            f89Var = V3;
                            break;
                        }
                        f89Var = V3;
                    }
                    i14++;
                }
            } else {
                f89Var = null;
            }
            if (f89Var != null) {
                View view3 = f89Var.a;
                if (!((ArrayList) rx6Var.d).contains(view3) && view3.hasFocusable()) {
                    view2 = view3;
                    if (view2 != null) {
                        int i15 = c89Var.n;
                        if (i15 != -1 && (findViewById = view2.findViewById(i15)) != null && findViewById.isFocusable()) {
                            view2 = findViewById;
                        }
                        view2.requestFocus();
                    }
                }
            }
            if (rx6Var.K() > 0) {
                int i16 = c89Var.l;
                if (i16 == -1) {
                    i16 = 0;
                }
                int b = c89Var.b();
                for (int i17 = i16; i17 < b; i17++) {
                    f89 L = L(i17);
                    if (L == null) {
                        break;
                    }
                    View view4 = L.a;
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
                    f89 L2 = L(min);
                    if (L2 == null) {
                        break;
                    }
                    View view5 = L2.a;
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
        c89Var.m = -1L;
        c89Var.l = -1;
        c89Var.n = -1;
    }

    public void t0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.r;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof r79) {
            r79 r79Var = (r79) layoutParams;
            if (!r79Var.c) {
                Rect rect2 = r79Var.b;
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

    public final void u() {
        mhc mhcVar;
        View G;
        boolean z;
        c89 c89Var = this.v0;
        c89Var.a(1);
        E(c89Var);
        c89Var.i = false;
        B0();
        k7b k7bVar = this.f;
        qs qsVar = (qs) k7bVar.b;
        qs qsVar2 = (qs) k7bVar.b;
        qsVar.clear();
        zh6 zh6Var = (zh6) k7bVar.c;
        zh6Var.b();
        j0();
        boolean z2 = this.R;
        ia iaVar = this.d;
        if (z2) {
            iaVar.l((ArrayList) iaVar.d);
            iaVar.l((ArrayList) iaVar.e);
            iaVar.b = 0;
            if (this.S) {
                this.y.V(this);
            }
        }
        if (this.d0 != null && this.y.x0()) {
            iaVar.k();
        } else {
            iaVar.c();
        }
        boolean z3 = this.y0 || this.z0;
        boolean z4 = this.J && this.d0 != null && ((z = this.R) || z3 || this.y.f) && (!z || this.x.b);
        c89Var.j = z4;
        c89Var.k = z4 && z3 && !this.R && this.d0 != null && this.y.x0();
        f89 f89Var = null;
        View focusedChild = (this.r0 && hasFocus() && this.x != null) ? getFocusedChild() : null;
        if (focusedChild != null && (G = G(focusedChild)) != null) {
            f89Var = U(G);
        }
        if (f89Var == null) {
            c89Var.m = -1L;
            c89Var.l = -1;
            c89Var.n = -1;
        } else {
            c89Var.m = this.x.b ? f89Var.e : -1L;
            c89Var.l = this.R ? -1 : f89Var.j() ? f89Var.d : f89Var.b();
            View view = f89Var.a;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            c89Var.n = id;
        }
        c89Var.h = c89Var.j && this.z0;
        this.z0 = false;
        this.y0 = false;
        c89Var.g = c89Var.k;
        c89Var.e = this.x.b();
        J(this.D0);
        boolean z5 = c89Var.j;
        rx6 rx6Var = this.e;
        if (z5) {
            int K = rx6Var.K();
            for (int i = 0; i < K; i++) {
                f89 V = V(rx6Var.J(i));
                if (!V.r() && (!V.h() || this.x.b)) {
                    l09 l = this.d0.l(c89Var, V, o79.b(V), V.d());
                    mhc mhcVar2 = (mhc) qsVar2.get(V);
                    if (mhcVar2 == null) {
                        mhcVar2 = mhc.a();
                        qsVar2.put(V, mhcVar2);
                    }
                    mhcVar2.b = l;
                    mhcVar2.a |= 4;
                    if (c89Var.h && V.m() && !V.j() && !V.r() && !V.h()) {
                        zh6Var.k(R(V), V);
                    }
                }
            }
        }
        if (c89Var.k) {
            int T = rx6Var.T();
            for (int i2 = 0; i2 < T; i2++) {
                f89 V2 = V(rx6Var.S(i2));
                if (!V2.r()) {
                    if (V2.d == -1) {
                        V2.d = V2.c;
                    }
                    V2.h = V2.c;
                }
            }
            boolean z6 = c89Var.f;
            c89Var.f = false;
            this.y.a0(this.b, c89Var);
            c89Var.f = z6;
            for (int i3 = 0; i3 < rx6Var.K(); i3++) {
                f89 V3 = V(rx6Var.J(i3));
                if (!V3.r() && ((mhcVar = (mhc) qsVar2.get(V3)) == null || (mhcVar.a & 4) == 0)) {
                    int b = o79.b(V3);
                    boolean e = V3.e(TLObject.FLAG_13);
                    if (!e) {
                        b |= TLObject.FLAG_12;
                    }
                    l09 l2 = this.d0.l(c89Var, V3, b, V3.d());
                    if (e) {
                        q0(V3, l2);
                    } else {
                        mhc mhcVar3 = (mhc) qsVar2.get(V3);
                        if (mhcVar3 == null) {
                            mhcVar3 = mhc.a();
                            qsVar2.put(V3, mhcVar3);
                        }
                        mhcVar3.a |= 2;
                        mhcVar3.b = l2;
                    }
                }
            }
            o();
        } else {
            o();
        }
        k0(true);
        C0(false);
        c89Var.d = (byte) 2;
    }

    public final void u0() {
        VelocityTracker velocityTracker = this.g0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        D0(0);
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
            WeakHashMap weakHashMap = ihc.a;
            postInvalidateOnAnimation();
        }
    }

    public final void v() {
        B0();
        j0();
        c89 c89Var = this.v0;
        c89Var.a(6);
        this.d.c();
        c89Var.e = this.x.b();
        c89Var.c = 0;
        c89Var.g = false;
        this.y.a0(this.b, c89Var);
        c89Var.f = false;
        this.c = null;
        c89Var.j = c89Var.j && this.d0 != null;
        c89Var.d = (byte) 4;
        k0(true);
        C0(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v0(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        q();
        j79 j79Var = this.x;
        int[] iArr = this.K0;
        if (j79Var != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            w0(i, i2, iArr);
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
        x(i3, i4, i5, i6, this.F0, 0, iArr);
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
                        A();
                        et3.a(this.W, (-f) / getWidth(), 1.0f - (y / getHeight()));
                    } else if (f > 0.0f) {
                        B();
                        et3.a(this.b0, f / getWidth(), y / getHeight());
                    } else {
                        z = false;
                        if (f2 >= 0.0f) {
                            C();
                            et3.a(this.a0, (-f2) / getHeight(), x / getWidth());
                        } else {
                            if (f2 > 0.0f) {
                                z();
                                et3.a(this.c0, f2 / getHeight(), 1.0f - (x / getWidth()));
                            }
                            if (!z || f != 0.0f || f2 != 0.0f) {
                                WeakHashMap weakHashMap = ihc.a;
                                postInvalidateOnAnimation();
                            }
                        }
                        z = true;
                        if (!z) {
                        }
                        WeakHashMap weakHashMap2 = ihc.a;
                        postInvalidateOnAnimation();
                    }
                    z = true;
                    if (f2 >= 0.0f) {
                    }
                    z = true;
                    if (!z) {
                    }
                    WeakHashMap weakHashMap22 = ihc.a;
                    postInvalidateOnAnimation();
                }
            }
            p(i, i2);
        }
        if (i3 != 0 || i4 != 0) {
            y(i3, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i3 == 0 && i4 == 0) ? false : true;
    }

    public boolean w(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    public final void w0(int i, int i2, int[] iArr) {
        f89 f89Var;
        B0();
        j0();
        int i3 = n1c.a;
        Trace.beginSection("RV Scroll");
        c89 c89Var = this.v0;
        E(c89Var);
        oh2 oh2Var = this.b;
        int l0 = i != 0 ? this.y.l0(i, oh2Var, c89Var) : 0;
        int n0 = i2 != 0 ? this.y.n0(i2, oh2Var, c89Var) : 0;
        Trace.endSection();
        rx6 rx6Var = this.e;
        int K = rx6Var.K();
        for (int i4 = 0; i4 < K; i4++) {
            View J = rx6Var.J(i4);
            f89 U = U(J);
            if (U != null && (f89Var = U.k) != null) {
                View view = f89Var.a;
                int left = J.getLeft();
                int top = J.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        k0(true);
        C0(false);
        if (iArr != null) {
            iArr[0] = l0;
            iArr[1] = n0;
        }
    }

    public final void x(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void x0(int i) {
        if (this.M) {
            return;
        }
        E0();
        q79 q79Var = this.y;
        if (q79Var == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            q79Var.m0(i);
            awakenScrollBars();
        }
    }

    public final void y(int i, int i2) {
        this.U++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        n0(i2);
        v79 v79Var = this.w0;
        if (v79Var != null) {
            v79Var.b(this, i, i2);
        }
        ArrayList arrayList = this.x0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((v79) this.x0.get(size)).b(this, i, i2);
            }
        }
        this.U--;
    }

    public final void y0(int i, int i2, Interpolator interpolator) {
        q79 q79Var = this.y;
        if (q79Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.M) {
            return;
        }
        if (!q79Var.d()) {
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

    public final void z() {
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

    public final void z0(int i, int i2, Interpolator interpolator) {
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

    public void i0(View view) {
    }

    public void m0(int i) {
    }

    public void n0(int i) {
    }

    public void setRecyclerListener(y79 y79Var) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        q79 q79Var = this.y;
        if (q79Var != null) {
            return q79Var.p(layoutParams);
        }
        grb.i("RecyclerView has no LayoutManager".concat(D()));
        return null;
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}
