package androidx.recyclerview.widget;

import a0.h;
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
import androidx.biometric.f0;
import androidx.datastore.preferences.protobuf.i;
import bf.b;
import bf.f;
import da.a;
import e2.c;
import f2.a0;
import f2.b1;
import f2.c1;
import f2.d1;
import f2.e0;
import f2.f1;
import f2.h0;
import f2.h1;
import f2.i0;
import f2.i1;
import f2.j1;
import f2.k1;
import f2.l1;
import f2.m0;
import f2.n0;
import f2.n1;
import f2.o0;
import f2.o1;
import f2.q1;
import f2.r0;
import f2.s;
import f2.s0;
import f2.t0;
import f2.u0;
import f2.v0;
import f2.w0;
import f2.x0;
import f2.y0;
import f2.z0;
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
import r0.j0;
import r0.k0;
import r0.l;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] M0 = {R.attr.clipToPadding};
    public static final boolean N0;
    public static final boolean O0;
    public static final boolean P0;
    public static final a0 Q0;
    public final int[] A0;
    public final ArrayList B;
    public final int[] B0;
    public y0 C;
    public int C0;
    public boolean D;
    public int D0;
    public boolean E;
    public Integer E0;
    public boolean F;
    public final int[] F0;
    public int G;
    public final ArrayList G0;
    public boolean H;
    public final m0 H0;
    public boolean I;
    public final f0 I0;
    public boolean J;
    public String J0;
    public int K;
    public boolean K0;
    public final AccessibilityManager L;
    public boolean L0;
    public ArrayList M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public s0 R;
    public EdgeEffect S;
    public EdgeEffect T;
    public EdgeEffect U;
    public EdgeEffect V;
    public t0 W;
    public final d1 a;
    public int a0;
    public final f b;
    public int b0;
    public f1 c;
    public VelocityTracker c0;
    public final a d;
    public int d0;
    public final e e;
    public int e0;
    public final b f;
    public int f0;
    public int g0;
    public boolean h;
    public int h0;
    public final int i0;
    public final int j0;
    public final float k0;
    public final float l0;
    public boolean m0;
    public final m0 n;
    public final k1 n0;
    public s o0;
    public final i p0;
    public final i1 q0;
    public final Rect r;
    public z0 r0;
    public final Rect s;
    public ArrayList s0;
    public boolean t0;
    public boolean u0;
    public final RectF v;
    public final o5.i v0;
    public o0 w;
    public boolean w0;
    public v0 x;
    public n1 x0;
    public final ArrayList y;
    public final int[] y0;
    public l z0;

    static {
        N0 = Build.VERSION.SDK_INT >= 23;
        O0 = true;
        P0 = true;
        Q0 = new a0(2);
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
        l1 U = U(view);
        if (U != null) {
            return U.b();
        }
        return -1;
    }

    public static int S(View view) {
        l1 U = U(view);
        if (U != null) {
            return U.c();
        }
        return -1;
    }

    public static l1 U(View view) {
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof w0) {
            return ((w0) layoutParams).a;
        }
        return null;
    }

    private l getScrollingChildHelper() {
        if (this.z0 == null) {
            this.z0 = new l(this);
        }
        return this.z0;
    }

    public static void m(l1 l1Var) {
        WeakReference weakReference = l1Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == l1Var.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            l1Var.b = null;
        }
    }

    public final void A() {
        if (this.U != null) {
            return;
        }
        EdgeEffect a2 = this.R.a(this, 2);
        this.U = a2;
        if (this.h) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
        k(this.U);
    }

    public final void A0(int i10) {
        getScrollingChildHelper().h(i10);
    }

    public final void B() {
        if (this.T != null) {
            return;
        }
        EdgeEffect a2 = this.R.a(this, 1);
        this.T = a2;
        if (this.h) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
        k(this.T);
    }

    public void B0() {
        h1 h1Var;
        setScrollState(0);
        k1 k1Var = this.n0;
        RecyclerView recyclerView = k1Var.h;
        if (recyclerView.K0) {
            recyclerView.removeCallbacks(k1Var);
            k1Var.c.abortAnimation();
        }
        v0 v0Var = this.x;
        if (v0Var == null || (h1Var = v0Var.e) == null) {
            return;
        }
        h1Var.h();
    }

    public final String C() {
        String sb;
        StringBuilder sb2 = new StringBuilder(" ");
        sb2.append(super.toString());
        sb2.append(", adapter:");
        sb2.append(this.w);
        sb2.append(", layout:");
        sb2.append(this.x);
        sb2.append(", context:");
        sb2.append(getContext());
        sb2.append(", ainfo:");
        sb2.append(this.J0);
        ArrayList arrayList = (ArrayList) this.d.h;
        if (arrayList == null) {
            sb = null;
        } else {
            StringBuilder sb3 = new StringBuilder();
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (size < arrayList.size() - 1) {
                    sb3.append("\n\n");
                }
                sb3.append((String) arrayList.get(size));
            }
            sb = sb3.toString();
        }
        if (sb != null) {
            sb2.append(", last notifies:\n");
            sb2.append(sb);
        }
        return sb2.toString();
    }

    public final void D(i1 i1Var) {
        if (getScrollState() != 2) {
            i1Var.getClass();
            return;
        }
        OverScroller overScroller = this.n0.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        i1Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View E(float f10, float f11) {
        for (int r10 = this.e.r() - 1; r10 >= 0; r10--) {
            View q10 = this.e.q(r10);
            float translationX = q10.getTranslationX();
            float translationY = q10.getTranslationY();
            if (f10 >= q10.getLeft() + translationX && f10 <= q10.getRight() + translationX && f11 >= q10.getTop() + translationY && f11 <= q10.getBottom() + translationY) {
                return q10;
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

    public final l1 G(View view) {
        View F = F(view);
        if (F == null) {
            return null;
        }
        return T(F);
    }

    public final boolean H(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            y0 y0Var = (y0) arrayList.get(i10);
            if (y0Var.b(this, motionEvent) && action != 3) {
                this.C = y0Var;
                return true;
            }
        }
        return false;
    }

    public final void I(int[] iArr) {
        int r10 = this.e.r();
        if (r10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i11 = TLObject.FLAG_31;
        for (int i12 = 0; i12 < r10; i12++) {
            l1 U = U(this.e.q(i12));
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

    public final l1 K(int i10) {
        l1 l1Var = null;
        if (this.N) {
            return null;
        }
        int v = this.e.v();
        for (int i11 = 0; i11 < v; i11++) {
            l1 U = U(this.e.u(i11));
            if (U != null && !U.j() && N(U) == i10) {
                if (!((ArrayList) this.e.d).contains(U.a)) {
                    return U;
                }
                l1Var = U;
            }
        }
        return l1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l1 L(int i10, boolean z4) {
        int v = this.e.v();
        l1 l1Var = null;
        for (int i11 = 0; i11 < v; i11++) {
            l1 U = U(this.e.u(i11));
            if (U != null && !U.j()) {
                if (z4) {
                    if (U.c != i10) {
                        continue;
                    }
                    if (((ArrayList) this.e.d).contains(U.a)) {
                        return U;
                    }
                    l1Var = U;
                } else {
                    if (U.c() != i10) {
                        continue;
                    }
                    if (((ArrayList) this.e.d).contains(U.a)) {
                    }
                }
            }
        }
        return l1Var;
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

    public final int N(l1 l1Var) {
        if (l1Var.e(524) || !l1Var.g()) {
            return -1;
        }
        int i10 = l1Var.c;
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
        f fVar = this.b;
        if (i10 >= ((ArrayList) fVar.c).size()) {
            return null;
        }
        return ((l1) ((ArrayList) fVar.c).get(i10)).a;
    }

    public final View P(int i10) {
        if (i10 < 0) {
            return null;
        }
        f fVar = this.b;
        if (i10 >= ((ArrayList) fVar.e).size()) {
            return null;
        }
        return ((l1) ((ArrayList) fVar.e).get(i10)).a;
    }

    public final long Q(l1 l1Var) {
        return this.w.b ? l1Var.e : l1Var.c;
    }

    public final l1 T(View view) {
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
        w0 w0Var = (w0) view.getLayoutParams();
        boolean z4 = w0Var.c;
        Rect rect = w0Var.b;
        if (z4) {
            i1 i1Var = this.q0;
            if (!i1Var.g || (!w0Var.a.m() && !w0Var.a.h())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.y;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Rect rect2 = this.r;
                    rect2.set(0, 0, 0, 0);
                    ((u0) arrayList.get(i10)).a(rect2, view, this, i1Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                w0Var.c = false;
                return rect;
            }
        }
        return rect;
    }

    public final u0 X(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 < 0 || i10 >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(c.h(i10, " is an invalid index for size ", itemDecorationCount));
        }
        return (u0) this.y.get(i10);
    }

    public final void Y(long j10, l1 l1Var, l1 l1Var2) {
        int r10 = this.e.r();
        for (int i10 = 0; i10 < r10; i10++) {
            l1 U = U(this.e.q(i10));
            if (U != l1Var && Q(U) == j10) {
                o0 o0Var = this.w;
                if (o0Var == null || !o0Var.b) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + U + " \n View Holder 2:" + l1Var + C());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + U + " \n View Holder 2:" + l1Var + C());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + l1Var2 + " cannot be found but it is necessary for " + l1Var + C());
    }

    public final boolean Z() {
        return !this.F || this.N || this.d.h();
    }

    public final void a0() {
        if (this.y.size() == 0) {
            return;
        }
        v0 v0Var = this.x;
        if (v0Var != null) {
            v0Var.b("Cannot invalidate item decorations during a scroll or layout");
        }
        d0();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        v0 v0Var = this.x;
        if (v0Var != null) {
            v0Var.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final boolean b0() {
        return this.P > 0;
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
        return (layoutParams instanceof w0) && this.x.f((w0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        v0 v0Var = this.x;
        if (v0Var == null || !v0Var.d()) {
            return 0;
        }
        return ((i0) this.x).B0(this.q0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        v0 v0Var = this.x;
        if (v0Var != null && v0Var.d()) {
            return this.x.h(this.q0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        v0 v0Var = this.x;
        if (v0Var != null && v0Var.d()) {
            return this.x.i(this.q0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        v0 v0Var = this.x;
        if (v0Var != null && v0Var.e()) {
            return this.x.j(this.q0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        v0 v0Var = this.x;
        if (v0Var != null && v0Var.e()) {
            return this.x.k(this.q0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        v0 v0Var = this.x;
        if (v0Var != null && v0Var.e()) {
            return this.x.l(this.q0);
        }
        return 0;
    }

    public final void d0() {
        int v = this.e.v();
        for (int i10 = 0; i10 < v; i10++) {
            ((w0) this.e.u(i10).getLayoutParams()).c = true;
        }
        ArrayList arrayList = (ArrayList) this.b.e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            w0 w0Var = (w0) ((l1) arrayList.get(i11)).a.getLayoutParams();
            if (w0Var != null) {
                w0Var.c = true;
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z4) {
        return getScrollingChildHelper().a(f10, f11, z4);
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
        boolean z4;
        super.draw(canvas);
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ((u0) arrayList.get(i10)).c(canvas, this);
        }
        Integer num = this.E0;
        if (num == null || num.intValue() != 0) {
            EdgeEffect edgeEffect = this.S;
            if (edgeEffect == null || edgeEffect.isFinished()) {
                z4 = false;
            } else {
                int save = canvas.save();
                int paddingBottom = this.h ? getPaddingBottom() : 0;
                canvas.rotate(270.0f);
                canvas.translate((-getHeight()) + paddingBottom, 0.0f);
                EdgeEffect edgeEffect2 = this.S;
                z4 = edgeEffect2 != null && edgeEffect2.draw(canvas);
                canvas.restoreToCount(save);
            }
            EdgeEffect edgeEffect3 = this.T;
            if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
                int save2 = canvas.save();
                if (this.h) {
                    canvas.translate(getPaddingLeft(), getPaddingTop());
                }
                canvas.translate(0.0f, this.C0);
                EdgeEffect edgeEffect4 = this.T;
                z4 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
                canvas.restoreToCount(save2);
            }
            EdgeEffect edgeEffect5 = this.U;
            if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
                int save3 = canvas.save();
                int width = getWidth();
                int paddingTop = this.h ? getPaddingTop() : 0;
                canvas.rotate(90.0f);
                canvas.translate(-paddingTop, -width);
                EdgeEffect edgeEffect6 = this.U;
                z4 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
                canvas.restoreToCount(save3);
            }
            EdgeEffect edgeEffect7 = this.V;
            if (edgeEffect7 == null || edgeEffect7.isFinished()) {
                z10 = z4;
            } else {
                int save4 = canvas.save();
                canvas.rotate(180.0f);
                if (this.h) {
                    canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
                } else {
                    canvas.translate(-getWidth(), (-getHeight()) + this.D0);
                }
                EdgeEffect edgeEffect8 = this.V;
                if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                    z10 = true;
                }
                z10 |= z4;
                canvas.restoreToCount(save4);
            }
        }
        if ((z10 || this.W == null || arrayList.size() <= 0 || !this.W.k()) ? z10 : true) {
            WeakHashMap weakHashMap = j0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e0(int i10, int i11, boolean z4) {
        int i12 = i10 + i11;
        int v = this.e.v();
        for (int i13 = 0; i13 < v; i13++) {
            l1 U = U(this.e.u(i13));
            if (U != null && !U.r()) {
                int i14 = U.c;
                i1 i1Var = this.q0;
                if (i14 >= i12) {
                    U.n(-i11, z4);
                    i1Var.f = true;
                } else if (i14 >= i10) {
                    U.a(8);
                    U.n(-i11, z4);
                    U.c = i10 - 1;
                    i1Var.f = true;
                }
            }
        }
        f fVar = this.b;
        ArrayList arrayList = (ArrayList) fVar.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            l1 l1Var = (l1) arrayList.get(size);
            if (l1Var != null) {
                int i15 = l1Var.c;
                if (i15 >= i12) {
                    l1Var.n(-i11, z4);
                } else if (i15 >= i10) {
                    l1Var.a(8);
                    fVar.f(size);
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
        boolean z4;
        this.x.getClass();
        boolean z10 = true;
        boolean z11 = (this.w == null || this.x == null || b0() || this.I) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        i1 i1Var = this.q0;
        f fVar = this.b;
        if (z11 && (i10 == 2 || i10 == 1)) {
            if (this.x.e()) {
                if (focusFinder.findNextFocus(this, view, i10 == 2 ? 130 : 33) == null) {
                    z4 = true;
                    if (!z4 && this.x.d()) {
                        RecyclerView recyclerView = this.x.b;
                        WeakHashMap weakHashMap = j0.a;
                        z4 = focusFinder.findNextFocus(this, view, !((recyclerView.getLayoutDirection() != 1) ^ (i10 != 2)) ? 66 : 17) != null;
                    }
                    if (z4) {
                        p();
                        if (F(view) != null) {
                            y0();
                            this.x.R(view, i10, fVar, i1Var);
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
                            c3 = 1;
                            if (i10 == 1) {
                            }
                        }
                        if (z10) {
                        }
                    }
                    z10 = false;
                    if (z10) {
                    }
                }
            }
            z4 = false;
            if (!z4) {
                RecyclerView recyclerView3 = this.x.b;
                WeakHashMap weakHashMap3 = j0.a;
                if (focusFinder.findNextFocus(this, view, !((recyclerView3.getLayoutDirection() != 1) ^ (i10 != 2)) ? 66 : 17) != null) {
                }
            }
            if (z4) {
            }
            view2 = focusFinder.findNextFocus(this, view, i10);
            if (view2 == null) {
            }
            if (view2 != null) {
            }
            z10 = false;
            if (z10) {
            }
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (findNextFocus == null && z11) {
                p();
                if (F(view) != null) {
                    y0();
                    view2 = this.x.R(view, i10, fVar, i1Var);
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
                return z10 ? view2 : super.focusSearch(view, i10);
            }
            z10 = false;
            if (z10) {
            }
        }
    }

    public final void g0() {
        this.P++;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        v0 v0Var = this.x;
        if (v0Var != null) {
            return v0Var.n();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + C());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        v0 v0Var = this.x;
        if (v0Var != null) {
            return v0Var.o(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + C());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public o0 getAdapter() {
        return this.w;
    }

    public int getAttachedScrapChildCount() {
        return ((ArrayList) this.b.c).size();
    }

    @Override // android.view.View
    public int getBaseline() {
        v0 v0Var = this.x;
        if (v0Var == null) {
            return super.getBaseline();
        }
        v0Var.getClass();
        return -1;
    }

    public int getBottomGlowOffset() {
        return this.D0;
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

    public n1 getCompatAccessibilityDelegate() {
        return this.x0;
    }

    public float getCurrentVelocity() {
        VelocityTracker velocityTracker = this.c0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.j0);
        return this.c0.getYVelocity();
    }

    public s0 getEdgeEffectFactory() {
        return this.R;
    }

    public int getHiddenChildCount() {
        return ((ArrayList) this.e.d).size();
    }

    public t0 getItemAnimator() {
        return this.W;
    }

    public int getItemDecorationCount() {
        return this.y.size();
    }

    public v0 getLayoutManager() {
        return this.x;
    }

    public int getMaxFlingVelocity() {
        return this.j0;
    }

    public int getMinFlingVelocity() {
        return this.i0;
    }

    public long getNanoTime() {
        if (P0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public x0 getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.m0;
    }

    public b1 getRecycledViewPool() {
        return this.b.c();
    }

    public int getScrollState() {
        return this.a0;
    }

    public int getTopGlowOffset() {
        return this.C0;
    }

    public final void h(l1 l1Var) {
        View view = l1Var.a;
        boolean z4 = view.getParent() == this;
        this.b.k(T(view));
        if (l1Var.l()) {
            this.e.h(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z4) {
            this.e.f(view, -1, true);
            return;
        }
        e eVar = this.e;
        int indexOfChild = ((RecyclerView) ((a3.c) eVar.b).b).indexOfChild(view);
        if (indexOfChild >= 0) {
            ((f2.c) eVar.c).G(indexOfChild);
            eVar.x(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void h0(boolean z4) {
        int i10;
        AccessibilityManager accessibilityManager;
        int i11 = this.P - 1;
        this.P = i11;
        if (i11 < 1) {
            this.P = 0;
            if (z4) {
                int i12 = this.K;
                this.K = 0;
                if (i12 != 0 && (accessibilityManager = this.L) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i12);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.G0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    l1 l1Var = (l1) arrayList.get(size);
                    if (l1Var.a.getParent() == this && !l1Var.r() && (i10 = l1Var.s) != -1) {
                        View view = l1Var.a;
                        WeakHashMap weakHashMap = j0.a;
                        view.setImportantForAccessibility(i10);
                        l1Var.s = -1;
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

    public final void i(u0 u0Var) {
        v0 v0Var = this.x;
        if (v0Var != null) {
            v0Var.b("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.y;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(u0Var);
        d0();
        requestLayout();
    }

    public final void i0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.b0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.b0 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f0 = x10;
            this.d0 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.g0 = y10;
            this.e0 = y10;
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.D;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.I;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(z0 z0Var) {
        if (this.s0 == null) {
            this.s0 = new ArrayList();
        }
        this.s0.add(z0Var);
    }

    public final void k(EdgeEffect edgeEffect) {
        Integer num;
        if (edgeEffect == null || (num = this.E0) == null) {
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
        if (this.Q > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + C()));
        }
    }

    public final void l0() {
        if (this.w0 || !this.D) {
            return;
        }
        WeakHashMap weakHashMap = j0.a;
        postOnAnimation(this.H0);
        this.w0 = true;
    }

    public final void m0(boolean z4) {
        this.O = z4 | this.O;
        this.N = true;
        int v = this.e.v();
        for (int i10 = 0; i10 < v; i10++) {
            l1 U = U(this.e.u(i10));
            if (U != null && !U.r()) {
                U.a(6);
            }
        }
        d0();
        f fVar = this.b;
        ArrayList arrayList = (ArrayList) fVar.e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            l1 l1Var = (l1) arrayList.get(i11);
            if (l1Var != null) {
                l1Var.a(6);
                l1Var.a(1024);
            }
        }
        o0 o0Var = ((RecyclerView) fVar.h).w;
        if (o0Var == null || !o0Var.b) {
            fVar.e();
        }
    }

    public final void n() {
        int v = this.e.v();
        for (int i10 = 0; i10 < v; i10++) {
            l1 U = U(this.e.u(i10));
            if (U != null && !U.r()) {
                U.d = -1;
                U.g = -1;
            }
        }
        f fVar = this.b;
        ArrayList arrayList = (ArrayList) fVar.c;
        ArrayList arrayList2 = (ArrayList) fVar.e;
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            l1 l1Var = (l1) arrayList2.get(i11);
            l1Var.d = -1;
            l1Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            l1 l1Var2 = (l1) arrayList.get(i12);
            l1Var2.d = -1;
            l1Var2.g = -1;
        }
        ArrayList arrayList3 = (ArrayList) fVar.d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                l1 l1Var3 = (l1) ((ArrayList) fVar.d).get(i13);
                l1Var3.d = -1;
                l1Var3.g = -1;
            }
        }
    }

    public final void n0(l1 l1Var, c5.e eVar) {
        l1Var.p(0, 8192);
        boolean z4 = this.q0.h;
        b bVar = this.f;
        if (z4 && l1Var.m() && !l1Var.j() && !l1Var.r()) {
            ((h) bVar.c).k(l1Var, Q(l1Var));
        }
        a0.f fVar = (a0.f) bVar.b;
        q1 q1Var = (q1) fVar.get(l1Var);
        if (q1Var == null) {
            q1Var = q1.a();
            fVar.put(l1Var, q1Var);
        }
        q1Var.b = eVar;
        q1Var.a |= 4;
    }

    public final void o(int i10, int i11) {
        boolean z4;
        EdgeEffect edgeEffect = this.S;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z4 = false;
        } else {
            this.S.onRelease();
            z4 = this.S.isFinished();
        }
        EdgeEffect edgeEffect2 = this.U;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.U.onRelease();
            z4 |= this.U.isFinished();
        }
        EdgeEffect edgeEffect3 = this.T;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.T.onRelease();
            z4 |= this.T.isFinished();
        }
        EdgeEffect edgeEffect4 = this.V;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.V.onRelease();
            z4 |= this.V.isFinished();
        }
        if (z4) {
            WeakHashMap weakHashMap = j0.a;
            postInvalidateOnAnimation();
        }
    }

    public final void o0() {
        t0 t0Var = this.W;
        if (t0Var != null) {
            t0Var.g();
        }
        v0 v0Var = this.x;
        f fVar = this.b;
        if (v0Var != null) {
            v0Var.g0(fVar);
            this.x.h0(fVar);
        }
        ((ArrayList) fVar.c).clear();
        fVar.e();
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
        this.P = 0;
        this.D = true;
        this.F = this.F && !isLayoutRequested();
        v0 v0Var = this.x;
        if (v0Var != null) {
            v0Var.getClass();
        }
        this.w0 = false;
        if (P0) {
            ThreadLocal threadLocal = s.e;
            s sVar = (s) threadLocal.get();
            this.o0 = sVar;
            if (sVar == null) {
                s sVar2 = new s();
                sVar2.a = new ArrayList();
                sVar2.d = new ArrayList();
                this.o0 = sVar2;
                WeakHashMap weakHashMap = j0.a;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    f10 = display.getRefreshRate();
                }
                f10 = 60.0f;
                s sVar3 = this.o0;
                sVar3.c = (long) (1.0E9f / f10);
                threadLocal.set(sVar3);
            }
            this.o0.a.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        s sVar;
        super.onDetachedFromWindow();
        t0 t0Var = this.W;
        if (t0Var != null) {
            t0Var.g();
        }
        B0();
        this.D = false;
        this.G0.clear();
        removeCallbacks(this.H0);
        this.f.getClass();
        while (q1.d.b() != null) {
        }
        if (!P0 || (sVar = this.o0) == null) {
            return;
        }
        sVar.a.remove(this);
        this.o0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((u0) arrayList.get(i10)).b(canvas, this);
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
        if (this.x != null && !this.I && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f10 = this.x.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.x.d()) {
                    f11 = motionEvent.getAxisValue(10);
                    if (f10 == 0.0f || f11 != 0.0f) {
                        s0((int) (f11 * this.k0), (int) (f10 * this.l0), motionEvent);
                    }
                }
                f11 = 0.0f;
                if (f10 == 0.0f) {
                }
                s0((int) (f11 * this.k0), (int) (f10 * this.l0), motionEvent);
            } else {
                if ((motionEvent.getSource() & TLObject.FLAG_22) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.x.e()) {
                        f10 = -axisValue;
                        f11 = 0.0f;
                        if (f10 == 0.0f) {
                        }
                        s0((int) (f11 * this.k0), (int) (f10 * this.l0), motionEvent);
                    } else if (this.x.d()) {
                        f11 = axisValue;
                        f10 = 0.0f;
                        if (f10 == 0.0f) {
                        }
                        s0((int) (f11 * this.k0), (int) (f10 * this.l0), motionEvent);
                    }
                }
                f10 = 0.0f;
                f11 = 0.0f;
                if (f10 == 0.0f) {
                }
                s0((int) (f11 * this.k0), (int) (f10 * this.l0), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        if (!this.I) {
            this.C = null;
            if (H(motionEvent)) {
                r0();
                setScrollState(0);
                return true;
            }
            v0 v0Var = this.x;
            if (v0Var != null) {
                boolean d = v0Var.d();
                boolean e = this.x.e();
                if (this.c0 == null) {
                    this.c0 = VelocityTracker.obtain();
                }
                this.c0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.J) {
                        this.J = false;
                    }
                    this.b0 = motionEvent.getPointerId(0);
                    int x10 = (int) (motionEvent.getX() + 0.5f);
                    this.f0 = x10;
                    this.d0 = x10;
                    int y10 = (int) (motionEvent.getY() + 0.5f);
                    this.g0 = y10;
                    this.e0 = y10;
                    if (this.a0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        A0(1);
                    }
                    int[] iArr = this.B0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i10 = d;
                    if (e) {
                        i10 = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i10, 0);
                } else if (actionMasked == 1) {
                    this.c0.clear();
                    A0(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.b0);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.b0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.a0 != 1) {
                        int i11 = x11 - this.d0;
                        int i12 = y11 - this.e0;
                        if (d == 0 || Math.abs(i11) <= this.h0) {
                            z4 = false;
                        } else {
                            this.f0 = x11;
                            z4 = true;
                        }
                        if (e && Math.abs(i12) > this.h0) {
                            this.g0 = y11;
                            z4 = true;
                        }
                        if (z4) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    r0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.b0 = motionEvent.getPointerId(actionIndex);
                    int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f0 = x12;
                    this.d0 = x12;
                    int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.g0 = y12;
                    this.e0 = y12;
                } else if (actionMasked == 6) {
                    i0(motionEvent);
                }
                if (this.a0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14 = g.a;
        Trace.beginSection("RV OnLayout");
        s();
        Trace.endSection();
        this.F = true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.x == null) {
            q(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        v0 v0Var = this.x;
        f fVar = this.b;
        i1 i1Var = this.q0;
        v0Var.d0(fVar, i1Var, i10, i11);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.w == null) {
            return;
        }
        if (i1Var.d == 1) {
            t();
        }
        this.x.q0(i10, i11);
        i1Var.i = true;
        u();
        this.x.s0(i10, i11);
        i0 i0Var = (i0) this.x;
        if (i0Var.l == 1073741824 || i0Var.k == 1073741824) {
            return;
        }
        int r10 = i0Var.r();
        for (int i12 = 0; i12 < r10; i12++) {
            ViewGroup.LayoutParams layoutParams = i0Var.q(i12).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                this.x.q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                i1Var.i = true;
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
        if (!(parcelable instanceof f1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f1 f1Var = (f1) parcelable;
        this.c = f1Var;
        super.onRestoreInstanceState(f1Var.a);
        v0 v0Var = this.x;
        if (v0Var == null || (parcelable2 = this.c.c) == null) {
            return;
        }
        i0 i0Var = (i0) v0Var;
        if (parcelable2 instanceof h0) {
            i0Var.B = (h0) parcelable2;
            i0Var.l0();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        f1 f1Var = new f1(super.onSaveInstanceState());
        f1 f1Var2 = this.c;
        if (f1Var2 != null) {
            f1Var.c = f1Var2.c;
            return f1Var;
        }
        v0 v0Var = this.x;
        if (v0Var != null) {
            f1Var.c = v0Var.e0();
            return f1Var;
        }
        f1Var.c = null;
        return f1Var;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        this.V = null;
        this.T = null;
        this.U = null;
        this.S = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0138  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z10;
        if (!this.I && !this.J) {
            y0 y0Var = this.C;
            if (y0Var == null) {
                z4 = motionEvent.getAction() == 0 ? false : H(motionEvent);
            } else {
                y0Var.a(this, motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.C = null;
                }
                z4 = true;
            }
            if (z4) {
                r0();
                setScrollState(0);
                return true;
            }
            v0 v0Var = this.x;
            if (v0Var != null) {
                boolean d = v0Var.d();
                boolean e = this.x.e();
                if (this.c0 == null) {
                    this.c0 = VelocityTracker.obtain();
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.B0;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                obtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked == 0) {
                    this.b0 = motionEvent.getPointerId(0);
                    int x10 = (int) (motionEvent.getX() + 0.5f);
                    this.f0 = x10;
                    this.d0 = x10;
                    int y10 = (int) (motionEvent.getY() + 0.5f);
                    this.g0 = y10;
                    this.e0 = y10;
                    int i10 = d;
                    if (e) {
                        i10 = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i10, 0);
                } else {
                    if (actionMasked == 1) {
                        this.c0.addMovement(obtain);
                        VelocityTracker velocityTracker = this.c0;
                        int i11 = this.j0;
                        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, i11);
                        float f10 = d != 0 ? -this.c0.getXVelocity(this.b0) : 0.0f;
                        float f11 = e ? -this.c0.getYVelocity(this.b0) : 0.0f;
                        if (f10 != 0.0f || f11 != 0.0f) {
                            int i12 = (int) f10;
                            int i13 = (int) f11;
                            v0 v0Var2 = this.x;
                            if (v0Var2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.I) {
                                boolean d10 = v0Var2.d();
                                boolean e6 = this.x.e();
                                int i14 = this.i0;
                                if (d10 == 0 || Math.abs(i12) < i14) {
                                    i12 = 0;
                                }
                                if (!e6 || Math.abs(i13) < i14) {
                                    i13 = 0;
                                }
                                if (i12 != 0 || i13 != 0) {
                                    float f12 = i12;
                                    float f13 = i13;
                                    if (!dispatchNestedPreFling(f12, f13)) {
                                        boolean z11 = d10 != 0 || e6;
                                        dispatchNestedFling(f12, f13, z11);
                                        int i15 = d10;
                                        if (z11) {
                                            if (e6) {
                                                i15 = (d10 ? 1 : 0) | 2;
                                            }
                                            getScrollingChildHelper().g(i15, 1);
                                            int i16 = -i11;
                                            int max = Math.max(i16, Math.min(i12, i11));
                                            int max2 = Math.max(i16, Math.min(i13, i11));
                                            k1 k1Var = this.n0;
                                            RecyclerView recyclerView = k1Var.h;
                                            recyclerView.setScrollState(2);
                                            k1Var.b = 0;
                                            k1Var.a = 0;
                                            Interpolator interpolator = k1Var.d;
                                            a0 a0Var = Q0;
                                            if (interpolator != a0Var) {
                                                k1Var.d = a0Var;
                                                k1Var.c = new OverScroller(recyclerView.getContext(), a0Var);
                                            }
                                            k1Var.c.fling(0, 0, max, max2, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                            k1Var.a();
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
                        int findPointerIndex = motionEvent.findPointerIndex(this.b0);
                        if (findPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.b0 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i17 = this.f0 - x11;
                        int i18 = this.g0 - y11;
                        int[] iArr2 = this.F0;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        boolean v = v(i17, i18, 0, iArr2, this.A0);
                        int[] iArr3 = this.A0;
                        if (v) {
                            i17 -= iArr2[0];
                            i18 -= iArr2[1];
                            obtain.offsetLocation(iArr3[0], iArr3[1]);
                            iArr[0] = iArr[0] + iArr3[0];
                            iArr[1] = iArr[1] + iArr3[1];
                        }
                        if (this.a0 != 1) {
                            if (d != 0) {
                                int abs = Math.abs(i17);
                                int i19 = this.h0;
                                if (abs > i19) {
                                    i17 = i17 > 0 ? i17 - i19 : i17 + i19;
                                    z10 = true;
                                    if (e) {
                                        int abs2 = Math.abs(i18);
                                        int i20 = this.h0;
                                        if (abs2 > i20) {
                                            i18 = i18 > 0 ? i18 - i20 : i18 + i20;
                                            z10 = true;
                                        }
                                    }
                                    if (z10) {
                                        setScrollState(1);
                                    }
                                }
                            }
                            z10 = false;
                            if (e) {
                            }
                            if (z10) {
                            }
                        }
                        if (this.a0 == 1) {
                            this.f0 = x11 - iArr3[0];
                            this.g0 = y11 - iArr3[1];
                            if (s0(d != 0 ? i17 : 0, e ? i18 : 0, obtain)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            s sVar = this.o0;
                            if (sVar != null && (i17 != 0 || i18 != 0)) {
                                sVar.a(this, i17, i18);
                            }
                        }
                    } else if (actionMasked == 3) {
                        r0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.b0 = motionEvent.getPointerId(actionIndex);
                        int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.f0 = x12;
                        this.d0 = x12;
                        int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.g0 = y12;
                        this.e0 = y12;
                    } else if (actionMasked == 6) {
                        i0(motionEvent);
                    }
                }
                this.c0.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        if (!this.F || this.N) {
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
            if (!this.H) {
                e eVar = this.e;
                int r10 = eVar.r();
                int i14 = 0;
                while (true) {
                    if (i14 < r10) {
                        l1 U = U(eVar.q(i14));
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

    public final void p0(u0 u0Var) {
        v0 v0Var = this.x;
        if (v0Var != null) {
            v0Var.b("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.y;
        arrayList.remove(u0Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        d0();
        requestLayout();
    }

    public final void q(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = j0.a;
        setMeasuredDimension(v0.g(i10, paddingRight, getMinimumWidth()), v0.g(i11, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void q0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.r;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof w0) {
            w0 w0Var = (w0) layoutParams;
            if (!w0Var.c) {
                Rect rect2 = w0Var.b;
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
        this.x.k0(this, view, this.r, !this.F, view2 == null);
    }

    public final void r(View view) {
        l1 U = U(view);
        o0 o0Var = this.w;
        if (o0Var != null && U != null) {
            o0Var.z(U);
        }
        ArrayList arrayList = this.M;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                e0 e0Var = (e0) this.M.get(size);
                e0Var.o(view);
                l1 T = e0Var.E.T(view);
                if (T != null) {
                    l1 l1Var = e0Var.c;
                    if (l1Var == null || T != l1Var) {
                        e0Var.j(T, false);
                        if (e0Var.a.remove(T.a)) {
                            e0Var.x.a(e0Var.E, T);
                        }
                    } else {
                        e0Var.p(null, 0);
                    }
                }
            }
        }
    }

    public final void r0() {
        VelocityTracker velocityTracker = this.c0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z4 = false;
        A0(0);
        EdgeEffect edgeEffect = this.S;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z4 = this.S.isFinished();
        }
        EdgeEffect edgeEffect2 = this.T;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z4 |= this.T.isFinished();
        }
        EdgeEffect edgeEffect3 = this.U;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z4 |= this.U.isFinished();
        }
        EdgeEffect edgeEffect4 = this.V;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z4 |= this.V.isFinished();
        }
        if (z4) {
            WeakHashMap weakHashMap = j0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z4) {
        l1 U = U(view);
        if (U != null) {
            if (U.l()) {
                U.l &= -257;
            } else if (!U.r()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + U + C());
            }
        }
        view.clearAnimation();
        r(view);
        super.removeDetachedView(view, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        h1 h1Var = this.x.e;
        if ((h1Var == null || !h1Var.e) && !b0() && view2 != null) {
            q0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        return this.x.k0(this, view, rect, z4, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z4) {
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((y0) arrayList.get(i10)).c(z4);
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.G != 0 || this.I) {
            this.H = true;
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
        q1 q1Var;
        int i10;
        boolean r10;
        int i11;
        int i12;
        int i13;
        int i14;
        l1 l1Var;
        View findViewById;
        boolean z4;
        if (this.w == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.x == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        i1 i1Var = this.q0;
        boolean z10 = false;
        i1Var.i = false;
        int i15 = 1;
        if (i1Var.d == 1) {
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
        i1Var.a(4);
        y0();
        g0();
        i1Var.d = 1;
        boolean z11 = i1Var.j;
        f fVar = this.b;
        b bVar = this.f;
        if (z11) {
            try {
                int r11 = this.e.r() - 1;
                while (r11 >= 0) {
                    l1 U = U(this.e.q(r11));
                    if (U != null && !U.r()) {
                        long Q = Q(U);
                        this.W.getClass();
                        c5.e eVar = new c5.e();
                        View view = U.a;
                        eVar.a = view.getLeft();
                        eVar.b = view.getTop();
                        view.getRight();
                        view.getBottom();
                        h hVar = (h) bVar.c;
                        a0.f fVar2 = (a0.f) bVar.b;
                        l1 l1Var2 = (l1) hVar.f(Q);
                        if (l1Var2 == null || l1Var2.r()) {
                            bVar.t(U, eVar);
                        } else {
                            q1 q1Var2 = (q1) fVar2.get(l1Var2);
                            boolean z12 = (q1Var2 == null || (q1Var2.a & i15) == 0) ? false : true;
                            q1 q1Var3 = (q1) fVar2.get(U);
                            boolean z13 = (q1Var3 == null || (q1Var3.a & i15) == 0) ? false : true;
                            if (z12 && l1Var2 == U) {
                                bVar.t(U, eVar);
                            } else {
                                try {
                                    c5.e W = bVar.W(l1Var2, 4);
                                    bVar.t(U, eVar);
                                    c5.e W2 = bVar.W(U, 8);
                                    if (W == null) {
                                        Y(Q, U, l1Var2);
                                    } else {
                                        l1Var2.q(false);
                                        if (z12) {
                                            h(l1Var2);
                                        }
                                        if (l1Var2 != U) {
                                            if (z13) {
                                                h(U);
                                            }
                                            l1Var2.j = U;
                                            h(l1Var2);
                                            fVar.k(l1Var2);
                                            U.q(false);
                                            U.k = l1Var2;
                                        }
                                        o1 o1Var = (o1) this.W;
                                        o1Var.getClass();
                                        int i16 = W.a;
                                        int i17 = W.b;
                                        if (U.r()) {
                                            i13 = W.a;
                                            i14 = W.b;
                                        } else {
                                            i13 = W2.a;
                                            i14 = W2.b;
                                        }
                                        if (o1Var.q(l1Var2, U, W, i16, i17, i13, i14)) {
                                            l0();
                                        }
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    StringBuilder sb = new StringBuilder();
                                    for (int r12 = this.e.r() - 1; r12 >= 0; r12--) {
                                        l1 U2 = U(this.e.q(r12));
                                        if (U2 != null && !U2.r()) {
                                            sb.append("Holder at" + r12 + " " + U2 + "\n");
                                        }
                                    }
                                    throw new RuntimeException(sb.toString(), e);
                                }
                            }
                        }
                        r11--;
                        i15 = 1;
                    }
                    r11--;
                    i15 = 1;
                }
                a0.f fVar3 = (a0.f) bVar.b;
                int i18 = fVar3.c - 1;
                while (i18 >= 0) {
                    l1 l1Var3 = (l1) fVar3.e(i18);
                    try {
                        q1Var = (q1) fVar3.f(i18);
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        q1Var = null;
                    }
                    if (q1Var != null) {
                        int i19 = q1Var.a;
                        int i20 = i19 & 3;
                        f0 f0Var = this.I0;
                        if (i20 == 3) {
                            f0Var.w(l1Var3);
                        } else if ((i19 & 1) != 0) {
                            c5.e eVar2 = q1Var.b;
                            if (eVar2 == null) {
                                f0Var.w(l1Var3);
                            } else {
                                f0Var.s(l1Var3, eVar2, q1Var.c);
                            }
                        } else if ((i19 & 14) == 14) {
                            c5.e eVar3 = q1Var.b;
                            c5.e eVar4 = q1Var.c;
                            RecyclerView recyclerView = (RecyclerView) f0Var.b;
                            l1Var3.q(z10);
                            if (recyclerView.W.a(l1Var3, eVar3, eVar4)) {
                                recyclerView.l0();
                            }
                        } else if ((i19 & 12) == 12) {
                            c5.e eVar5 = q1Var.b;
                            c5.e eVar6 = q1Var.c;
                            f0Var.getClass();
                            l1Var3.q(z10);
                            RecyclerView recyclerView2 = (RecyclerView) f0Var.b;
                            if (recyclerView2.N) {
                                o1 o1Var2 = (o1) recyclerView2.W;
                                o1Var2.getClass();
                                int i21 = eVar5.a;
                                int i22 = eVar5.b;
                                if (l1Var3.r()) {
                                    i12 = eVar5.a;
                                    i11 = eVar5.b;
                                } else {
                                    int i23 = eVar6.a;
                                    i11 = eVar6.b;
                                    i12 = i23;
                                }
                                if (o1Var2.q(l1Var3, l1Var3, eVar5, i21, i22, i12, i11)) {
                                    recyclerView2.l0();
                                }
                            } else {
                                o1 o1Var3 = (o1) recyclerView2.W;
                                o1Var3.getClass();
                                int i24 = eVar5.a;
                                int i25 = eVar6.a;
                                if (i24 == i25 && eVar5.b == eVar6.b) {
                                    o1Var3.v(l1Var3);
                                    r10 = false;
                                } else {
                                    r10 = o1Var3.r(l1Var3, eVar5, i24, eVar5.b, i25, eVar6.b);
                                }
                                if (r10) {
                                    recyclerView2.l0();
                                }
                            }
                        } else if ((i19 & 4) != 0) {
                            f0Var.s(l1Var3, q1Var.b, null);
                        } else if ((i19 & 8) != 0) {
                            c5.e eVar7 = q1Var.b;
                            c5.e eVar8 = q1Var.c;
                            RecyclerView recyclerView3 = (RecyclerView) f0Var.b;
                            i10 = 0;
                            l1Var3.q(false);
                            if (recyclerView3.W.a(l1Var3, eVar7, eVar8)) {
                                recyclerView3.l0();
                            }
                            q1Var.a = i10;
                            q1Var.b = null;
                            q1Var.c = null;
                            q1.d.h(q1Var);
                        }
                        i10 = 0;
                        q1Var.a = i10;
                        q1Var.b = null;
                        q1Var.c = null;
                        q1.d.h(q1Var);
                    }
                    i18--;
                    z10 = false;
                }
            } catch (Exception e10) {
                e = e10;
            }
        }
        View view2 = null;
        this.x.h0(fVar);
        i1Var.b = i1Var.e;
        this.N = false;
        this.O = false;
        i1Var.j = false;
        i1Var.k = false;
        this.x.f = false;
        ArrayList arrayList = (ArrayList) fVar.d;
        if (arrayList != null) {
            arrayList.clear();
        }
        v0 v0Var = this.x;
        if (v0Var.j) {
            v0Var.i = 0;
            v0Var.j = false;
            fVar.l();
        }
        this.x.c0(i1Var);
        h0(true);
        z0(false);
        ((a0.f) bVar.b).clear();
        ((h) bVar.c).b();
        int[] iArr = this.y0;
        int i26 = iArr[0];
        int i27 = iArr[1];
        I(iArr);
        if ((iArr[0] == i26 && iArr[1] == i27) ? false : true) {
            x(0, 0);
        }
        if (this.m0 && this.w != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j10 = i1Var.m;
            if (j10 != -1 && (z4 = this.w.b) && z4) {
                int v = this.e.v();
                l1Var = null;
                int i28 = 0;
                while (true) {
                    if (i28 >= v) {
                        break;
                    }
                    l1 U3 = U(this.e.u(i28));
                    if (U3 != null && !U3.j() && U3.e == j10) {
                        if (!((ArrayList) this.e.d).contains(U3.a)) {
                            l1Var = U3;
                            break;
                        }
                        l1Var = U3;
                    }
                    i28++;
                }
            } else {
                l1Var = null;
            }
            if (l1Var != null) {
                View view3 = l1Var.a;
                if (!((ArrayList) this.e.d).contains(view3) && view3.hasFocusable()) {
                    view2 = view3;
                    if (view2 != null) {
                        int i29 = i1Var.n;
                        if (i29 != -1 && (findViewById = view2.findViewById(i29)) != null && findViewById.isFocusable()) {
                            view2 = findViewById;
                        }
                        view2.requestFocus();
                    }
                }
            }
            if (this.e.r() > 0) {
                int i30 = i1Var.l;
                if (i30 == -1) {
                    i30 = 0;
                }
                int b10 = i1Var.b();
                for (int i31 = i30; i31 < b10; i31++) {
                    l1 K = K(i31);
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
                    l1 K2 = K(min);
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
        i1Var.m = -1L;
        i1Var.l = -1;
        i1Var.n = -1;
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
        boolean z4;
        p();
        o0 o0Var = this.w;
        int[] iArr = this.F0;
        if (o0Var != null) {
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
        w(i12, i13, i14, i15, this.A0, 0, iArr);
        int i16 = i14 - iArr[0];
        int i17 = i15 - iArr[1];
        int i18 = this.f0;
        int[] iArr2 = this.A0;
        int i19 = iArr2[0];
        this.f0 = i18 - i19;
        int i20 = this.g0;
        int i21 = iArr2[1];
        this.g0 = i20 - i21;
        if (motionEvent != null) {
            motionEvent.offsetLocation(i19, i21);
        }
        int[] iArr3 = this.B0;
        iArr3[0] = iArr3[0] + iArr2[0];
        iArr3[1] = iArr3[1] + iArr2[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x10 = motionEvent.getX();
                float f10 = i16;
                float y10 = motionEvent.getY();
                float f11 = i17;
                if (f10 < 0.0f) {
                    z();
                    u0.b.a(this.S, (-f10) / getWidth(), 1.0f - (y10 / getHeight()));
                } else if (f10 > 0.0f) {
                    A();
                    u0.b.a(this.U, f10 / getWidth(), y10 / getHeight());
                } else {
                    z4 = false;
                    if (f11 >= 0.0f) {
                        B();
                        u0.b.a(this.T, (-f11) / getHeight(), x10 / getWidth());
                    } else {
                        if (f11 > 0.0f) {
                            y();
                            u0.b.a(this.V, f11 / getHeight(), 1.0f - (x10 / getWidth()));
                        }
                        if (!z4 || f10 != 0.0f || f11 != 0.0f) {
                            WeakHashMap weakHashMap = j0.a;
                            postInvalidateOnAnimation();
                        }
                    }
                    z4 = true;
                    if (!z4) {
                    }
                    WeakHashMap weakHashMap2 = j0.a;
                    postInvalidateOnAnimation();
                }
                z4 = true;
                if (f11 >= 0.0f) {
                }
                z4 = true;
                if (!z4) {
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
        v0 v0Var = this.x;
        if (v0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.I) {
            return;
        }
        boolean d = v0Var.d();
        boolean e = this.x.e();
        if (d || e) {
            if (!d) {
                i10 = 0;
            }
            if (!e) {
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
            this.K |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(n1 n1Var) {
        this.x0 = n1Var;
        j0.k(this, n1Var);
    }

    public void setAdapter(o0 o0Var) {
        setLayoutFrozen(false);
        o0 o0Var2 = this.w;
        d1 d1Var = this.a;
        if (o0Var2 != null) {
            o0Var2.a.unregisterObserver(d1Var);
            this.w.getClass();
        }
        o0();
        a aVar = this.d;
        aVar.m((ArrayList) aVar.d);
        aVar.m((ArrayList) aVar.e);
        aVar.b = 0;
        o0 o0Var3 = this.w;
        this.w = o0Var;
        if (o0Var != null) {
            o0Var.B(d1Var);
        }
        v0 v0Var = this.x;
        if (v0Var != null) {
            v0Var.Q();
        }
        this.b.d(o0Var3, this.w);
        this.q0.f = true;
        m0(false);
        requestLayout();
    }

    public void setAdditionalDebugInfo(String str) {
        this.J0 = str;
    }

    public void setBottomGlowOffset(int i10) {
        this.D0 = i10;
    }

    public void setChildDrawingOrderCallback(r0 r0Var) {
        if (r0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(r0Var != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z4) {
        if (z4 != this.h) {
            this.V = null;
            this.T = null;
            this.U = null;
            this.S = null;
        }
        this.h = z4;
        super.setClipToPadding(z4);
        if (this.F) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(s0 s0Var) {
        s0Var.getClass();
        this.R = s0Var;
        this.V = null;
        this.T = null;
        this.U = null;
        this.S = null;
    }

    public void setGlowColor(int i10) {
        this.E0 = Integer.valueOf(i10);
    }

    public void setHasFixedSize(boolean z4) {
        this.E = z4;
    }

    public void setItemAnimator(t0 t0Var) {
        t0 t0Var2 = this.W;
        if (t0Var2 != null) {
            t0Var2.g();
            this.W.a = null;
        }
        this.W = t0Var;
        if (t0Var != null) {
            t0Var.a = this.v0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        f fVar = this.b;
        fVar.a = i10;
        fVar.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z4) {
        suppressLayout(z4);
    }

    public void setLayoutManager(v0 v0Var) {
        if (v0Var == this.x) {
            return;
        }
        B0();
        v0 v0Var2 = this.x;
        f fVar = this.b;
        if (v0Var2 != null) {
            t0 t0Var = this.W;
            if (t0Var != null) {
                t0Var.g();
            }
            this.x.g0(fVar);
            this.x.h0(fVar);
            ((ArrayList) fVar.c).clear();
            fVar.e();
            if (this.D) {
                this.x.getClass();
            }
            this.x.t0(null);
            this.x = null;
        } else {
            ((ArrayList) fVar.c).clear();
            fVar.e();
        }
        this.e.y();
        this.x = v0Var;
        if (v0Var != null) {
            if (v0Var.b != null) {
                throw new IllegalArgumentException("LayoutManager " + v0Var + " is already attached to a RecyclerView:" + v0Var.b.C());
            }
            v0Var.t0(this);
            if (this.D) {
                this.x.getClass();
            }
        }
        fVar.l();
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
    public void setNestedScrollingEnabled(boolean z4) {
        l scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = j0.a;
            b0.k(viewGroup);
        }
        scrollingChildHelper.d = z4;
    }

    @Deprecated
    public void setOnScrollListener(z0 z0Var) {
        this.r0 = z0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z4) {
        this.m0 = z4;
    }

    public void setRecycledViewPool(b1 b1Var) {
        f fVar = this.b;
        if (((b1) fVar.g) != null) {
            r1.b--;
        }
        fVar.g = b1Var;
        if (b1Var == null || ((RecyclerView) fVar.h).getAdapter() == null) {
            return;
        }
        ((b1) fVar.g).b++;
    }

    public void setScrollState(int i10) {
        h1 h1Var;
        if (i10 == this.a0) {
            return;
        }
        this.a0 = i10;
        if (i10 != 2) {
            k1 k1Var = this.n0;
            RecyclerView recyclerView = k1Var.h;
            if (recyclerView.K0) {
                recyclerView.removeCallbacks(k1Var);
                k1Var.c.abortAnimation();
            }
            v0 v0Var = this.x;
            if (v0Var != null && (h1Var = v0Var.e) != null) {
                h1Var.h();
            }
        }
        v0 v0Var2 = this.x;
        if (v0Var2 != null) {
            v0Var2.f0();
        }
        j0(i10);
        z0 z0Var = this.r0;
        if (z0Var != null) {
            z0Var.a(this, i10);
        }
        ArrayList arrayList = this.s0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((z0) this.s0.get(size)).a(this, i10);
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.h0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.h0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setTopGlowOffset(int i10) {
        this.C0 = i10;
    }

    public void setViewCacheExtension(j1 j1Var) {
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
    public final void suppressLayout(boolean z4) {
        if (z4 != this.I) {
            l("Do not suppressLayout in layout or scroll");
            if (z4) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.I = true;
                this.J = true;
                B0();
                return;
            }
            this.I = false;
            if (this.H && this.x != null && this.w != null) {
                requestLayout();
            }
            this.H = false;
        }
    }

    public final void t() {
        q1 q1Var;
        View F;
        boolean z4;
        i1 i1Var = this.q0;
        i1Var.a(1);
        D(i1Var);
        i1Var.i = false;
        y0();
        b bVar = this.f;
        a0.f fVar = (a0.f) bVar.b;
        a0.f fVar2 = (a0.f) bVar.b;
        fVar.clear();
        h hVar = (h) bVar.c;
        hVar.b();
        g0();
        if (this.N) {
            a aVar = this.d;
            aVar.m((ArrayList) aVar.d);
            aVar.m((ArrayList) aVar.e);
            aVar.b = 0;
            if (this.O) {
                this.x.W(this);
            }
        }
        if (this.W == null || !this.x.y0()) {
            this.d.d();
        } else {
            this.d.l();
        }
        boolean z10 = this.t0 || this.u0;
        boolean z11 = this.F && this.W != null && ((z4 = this.N) || z10 || this.x.f) && (!z4 || this.w.b);
        i1Var.j = z11;
        i1Var.k = z11 && z10 && !this.N && this.W != null && this.x.y0();
        l1 l1Var = null;
        View focusedChild = (this.m0 && hasFocus() && this.w != null) ? getFocusedChild() : null;
        if (focusedChild != null && (F = F(focusedChild)) != null) {
            l1Var = T(F);
        }
        if (l1Var == null) {
            i1Var.m = -1L;
            i1Var.l = -1;
            i1Var.n = -1;
        } else {
            i1Var.m = this.w.b ? l1Var.e : -1L;
            i1Var.l = this.N ? -1 : l1Var.j() ? l1Var.d : l1Var.b();
            View view = l1Var.a;
            int id2 = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id2 = view.getId();
                }
            }
            i1Var.n = id2;
        }
        i1Var.h = i1Var.j && this.u0;
        this.u0 = false;
        this.t0 = false;
        i1Var.g = i1Var.k;
        i1Var.e = this.w.h();
        I(this.y0);
        if (i1Var.j) {
            int r10 = this.e.r();
            for (int i10 = 0; i10 < r10; i10++) {
                l1 U = U(this.e.q(i10));
                if (!U.r() && (!U.h() || this.w.b)) {
                    c5.e l10 = this.W.l(i1Var, U, t0.b(U), U.d());
                    q1 q1Var2 = (q1) fVar2.get(U);
                    if (q1Var2 == null) {
                        q1Var2 = q1.a();
                        fVar2.put(U, q1Var2);
                    }
                    q1Var2.b = l10;
                    q1Var2.a |= 4;
                    if (i1Var.h && U.m() && !U.j() && !U.r() && !U.h()) {
                        hVar.k(U, Q(U));
                    }
                }
            }
        }
        if (i1Var.k) {
            int v = this.e.v();
            for (int i11 = 0; i11 < v; i11++) {
                l1 U2 = U(this.e.u(i11));
                if (!U2.r()) {
                    if (U2.d == -1) {
                        U2.d = U2.c;
                    }
                    U2.h = U2.c;
                }
            }
            boolean z12 = i1Var.f;
            i1Var.f = false;
            this.x.b0(this.b, i1Var);
            i1Var.f = z12;
            for (int i12 = 0; i12 < this.e.r(); i12++) {
                l1 U3 = U(this.e.q(i12));
                if (!U3.r() && ((q1Var = (q1) fVar2.get(U3)) == null || (q1Var.a & 4) == 0)) {
                    int b10 = t0.b(U3);
                    boolean e = U3.e(8192);
                    if (!e) {
                        b10 |= 4096;
                    }
                    c5.e l11 = this.W.l(i1Var, U3, b10, U3.d());
                    if (e) {
                        n0(U3, l11);
                    } else {
                        q1 q1Var3 = (q1) fVar2.get(U3);
                        if (q1Var3 == null) {
                            q1Var3 = q1.a();
                            fVar2.put(U3, q1Var3);
                        }
                        q1Var3.a |= 2;
                        q1Var3.b = l11;
                    }
                }
            }
            n();
        } else {
            n();
        }
        h0(true);
        z0(false);
        i1Var.d = 2;
    }

    public final void t0(int i10, int i11, int[] iArr) {
        l1 l1Var;
        y0();
        g0();
        int i12 = g.a;
        Trace.beginSection("RV Scroll");
        i1 i1Var = this.q0;
        D(i1Var);
        f fVar = this.b;
        int m0 = i10 != 0 ? this.x.m0(i10, fVar, i1Var) : 0;
        int o02 = i11 != 0 ? this.x.o0(i11, fVar, i1Var) : 0;
        Trace.endSection();
        e eVar = this.e;
        int r10 = eVar.r();
        for (int i13 = 0; i13 < r10; i13++) {
            View q10 = eVar.q(i13);
            l1 T = T(q10);
            if (T != null && (l1Var = T.k) != null) {
                View view = l1Var.a;
                int left = q10.getLeft();
                int top = q10.getTop();
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
        i1 i1Var = this.q0;
        i1Var.a(6);
        this.d.d();
        i1Var.e = this.w.h();
        i1Var.c = 0;
        i1Var.g = false;
        this.x.b0(this.b, i1Var);
        i1Var.f = false;
        this.c = null;
        i1Var.j = i1Var.j && this.W != null;
        i1Var.d = 4;
        h0(true);
        z0(false);
    }

    public final void u0(int i10) {
        if (this.I) {
            return;
        }
        B0();
        v0 v0Var = this.x;
        if (v0Var == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            v0Var.n0(i10);
            awakenScrollBars();
        }
    }

    public boolean v(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, i12, iArr, iArr2);
    }

    public final void v0(int i10, int i11, Interpolator interpolator) {
        v0 v0Var = this.x;
        if (v0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.I) {
            return;
        }
        if (!v0Var.d()) {
            i10 = 0;
        }
        if (!this.x.e()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.n0.b(i10, i11, TLObject.FLAG_31, interpolator);
    }

    public final void w(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().d(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public final void w0(int i10, int i11, Interpolator interpolator) {
        if (this.x == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.I) {
            return;
        }
        if (!this.x.e()) {
            i10 = 0;
        }
        if (i10 != 0) {
            this.n0.b(0, i10, i11, interpolator);
        }
    }

    public final void x(int i10, int i11) {
        this.Q++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        k0(i10, i11);
        z0 z0Var = this.r0;
        if (z0Var != null) {
            z0Var.b(this, i10, i11);
        }
        ArrayList arrayList = this.s0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((z0) this.s0.get(size)).b(this, i10, i11);
            }
        }
        this.Q--;
    }

    public final void x0(int i10) {
        if (this.I) {
            return;
        }
        v0 v0Var = this.x;
        if (v0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            v0Var.v0(this, this.q0, i10);
        }
    }

    public final void y() {
        if (this.V != null) {
            return;
        }
        EdgeEffect a2 = this.R.a(this, 3);
        this.V = a2;
        if (this.h) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
        k(this.V);
    }

    public final void y0() {
        int i10 = this.G + 1;
        this.G = i10;
        if (i10 != 1 || this.I) {
            return;
        }
        this.H = false;
    }

    public final void z() {
        if (this.S != null) {
            return;
        }
        EdgeEffect a2 = this.R.a(this, 0);
        this.S = a2;
        if (this.h) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
        k(this.S);
    }

    public final void z0(boolean z4) {
        if (this.G < 1) {
            this.G = 1;
        }
        if (!z4 && !this.I) {
            this.H = false;
        }
        if (this.G == 1) {
            if (z4 && this.H && !this.I && this.x != null && this.w != null) {
                s();
            }
            if (!this.I) {
                this.H = false;
            }
        }
        this.G--;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        float a2;
        float a10;
        this.a = new d1(this, r1);
        this.b = new f(this);
        this.f = new b(28, (byte) 0);
        this.n = new m0(this, r1);
        this.r = new Rect();
        this.s = new Rect();
        this.v = new RectF();
        this.y = new ArrayList();
        this.B = new ArrayList();
        this.G = 0;
        this.N = false;
        this.O = false;
        this.P = 0;
        this.Q = 0;
        this.R = new s0();
        this.W = new f2.l();
        this.a0 = 0;
        this.b0 = -1;
        this.k0 = Float.MIN_VALUE;
        this.l0 = Float.MIN_VALUE;
        int i11 = 1;
        this.m0 = true;
        this.n0 = new k1(this);
        this.p0 = P0 ? new i() : null;
        i1 i1Var = new i1();
        i1Var.a = -1;
        i1Var.b = 0;
        i1Var.c = 0;
        i1Var.d = 1;
        i1Var.e = 0;
        i1Var.f = false;
        i1Var.g = false;
        i1Var.h = false;
        i1Var.i = false;
        i1Var.j = false;
        i1Var.k = false;
        this.q0 = i1Var;
        this.t0 = false;
        this.u0 = false;
        o5.i iVar = new o5.i(this, 15);
        this.v0 = iVar;
        this.w0 = false;
        this.y0 = new int[2];
        this.A0 = new int[2];
        this.B0 = new int[2];
        this.C0 = 0;
        this.D0 = 0;
        this.E0 = null;
        this.F0 = new int[2];
        this.G0 = new ArrayList();
        this.H0 = new m0(this, i11);
        this.I0 = new f0(this, 10);
        this.K0 = true;
        this.L0 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, M0, i10, 0);
            this.h = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.h = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.h0 = viewConfiguration.getScaledTouchSlop();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            Method method = k0.a;
            a2 = k6.a.d(viewConfiguration);
        } else {
            a2 = k0.a(viewConfiguration, context);
        }
        this.k0 = a2;
        if (i12 >= 26) {
            a10 = k6.a.e(viewConfiguration);
        } else {
            a10 = k0.a(viewConfiguration, context);
        }
        this.l0 = a10;
        this.i0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.j0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.W.a = iVar;
        this.d = new a(new n0(this));
        this.e = new e(new a3.c(this, 12));
        WeakHashMap weakHashMap = j0.a;
        if ((i12 >= 26 ? d0.a(this) : 0) == 0 && i12 >= 26) {
            d0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.L = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new n1(this));
        setDescendantFocusability(262144);
        setNestedScrollingEnabled(true);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        v0 v0Var = this.x;
        if (v0Var != null) {
            return v0Var.p(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + C());
    }

    public void f0(View view) {
    }

    public void j0(int i10) {
    }

    public void setOnFlingListener(x0 x0Var) {
    }

    public void setRecyclerListener(c1 c1Var) {
    }

    public void k0(int i10, int i11) {
    }
}
