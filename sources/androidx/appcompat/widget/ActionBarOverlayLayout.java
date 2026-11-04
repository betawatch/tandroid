package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import b8.oc;
import d2.t0;
import g.b0;
import ii.v3;
import java.util.WeakHashMap;
import k.j;
import l.w;
import m.f3;
import m.h;
import m.j1;
import m.k3;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import r0.a0;
import r0.a1;
import r0.h1;
import r0.i0;
import r0.k;
import r0.k1;
import r0.l;
import r0.w0;
import r0.x0;
import r0.y;
import r0.y0;
import r0.z0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements j1, k, l {
    public static final int[] S = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public final Rect E;
    public final Rect F;
    public final Rect G;
    public k1 H;
    public k1 I;
    public k1 J;
    public k1 K;
    public m.b L;
    public OverScroller M;
    public ViewPropertyAnimator N;
    public final v3 O;
    public final m.a P;
    public final m.a Q;
    public final t0 R;
    public int a;
    public int b;
    public ContentFrameLayout c;
    public ActionBarContainer d;
    public m.k1 e;
    public Drawable f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public int x;
    public int y;

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public static boolean a(View view, Rect rect, boolean z10) {
        boolean z11;
        m.c cVar = (m.c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        int i10 = rect.left;
        if (i3 != i10) {
            ((ViewGroup.MarginLayoutParams) cVar).leftMargin = i10;
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        int i12 = rect.top;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) cVar).topMargin = i12;
            z11 = true;
        }
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
        int i14 = rect.right;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) cVar).rightMargin = i14;
            z11 = true;
        }
        if (z10) {
            int i15 = ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
            int i16 = rect.bottom;
            if (i15 != i16) {
                ((ViewGroup.MarginLayoutParams) cVar).bottomMargin = i16;
                return true;
            }
        }
        return z11;
    }

    public final void b() {
        removeCallbacks(this.P);
        removeCallbacks(this.Q);
        ViewPropertyAnimator viewPropertyAnimator = this.N;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void c(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(S);
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.h = context.getApplicationInfo().targetSdkVersion < 19;
        this.M = new OverScroller(context);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof m.c;
    }

    public final void d(int i3) {
        e();
        if (i3 == 2) {
            ((k3) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i3 == 5) {
            ((k3) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i3 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i3;
        super.draw(canvas);
        if (this.f == null || this.h) {
            return;
        }
        if (this.d.getVisibility() == 0) {
            i3 = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
        } else {
            i3 = 0;
        }
        this.f.setBounds(0, i3, getWidth(), this.f.getIntrinsicHeight() + i3);
        this.f.draw(canvas);
    }

    public final void e() {
        m.k1 wrapper;
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof m.k1) {
                wrapper = (m.k1) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.e = wrapper;
        }
    }

    public final void f(Menu menu, w wVar) {
        e();
        k3 k3Var = (k3) this.e;
        Toolbar toolbar = k3Var.a;
        if (k3Var.m == null) {
            k3Var.m = new h(toolbar.getContext());
        }
        h hVar = k3Var.m;
        hVar.e = wVar;
        l.k kVar = (l.k) menu;
        if (kVar == null && toolbar.a == null) {
            return;
        }
        toolbar.f();
        l.k kVar2 = toolbar.a.G;
        if (kVar2 == kVar) {
            return;
        }
        if (kVar2 != null) {
            kVar2.r(toolbar.e0);
            kVar2.r(toolbar.f0);
        }
        if (toolbar.f0 == null) {
            toolbar.f0 = new f3(toolbar);
        }
        hVar.H = true;
        if (kVar != null) {
            kVar.b(hVar, toolbar.s);
            kVar.b(toolbar.f0, toolbar.s);
        } else {
            hVar.i(toolbar.s, null);
            toolbar.f0.i(toolbar.s, null);
            hVar.e();
            toolbar.f0.e();
        }
        toolbar.a.setPopupTheme(toolbar.w);
        toolbar.a.setPresenter(hVar);
        toolbar.e0 = hVar;
        toolbar.t();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new m.c(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new m.c(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.R.b();
    }

    public CharSequence getTitle() {
        e();
        return ((k3) this.e).a.getTitle();
    }

    @Override // r0.k
    public final void m(int i3, View view) {
        if (i3 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // r0.l
    public final void n(View view, int i3, int i10, int i11, int i12, int i13, int[] iArr) {
        o(view, i3, i10, i11, i12, i13);
    }

    @Override // r0.k
    public final void o(View view, int i3, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(view, i3, i10, i11, i12);
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        e();
        k1 h = k1.h(this, windowInsets);
        boolean a10 = a(this.d, new Rect(h.b(), h.d(), h.c(), h.a()), false);
        WeakHashMap weakHashMap = i0.a;
        Rect rect = this.E;
        a0.b(this, h, rect);
        int i3 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        h1 h1Var = h.a;
        k1 m10 = h1Var.m(i3, i10, i11, i12);
        this.H = m10;
        boolean z10 = true;
        if (!this.I.equals(m10)) {
            this.I = this.H;
            a10 = true;
        }
        Rect rect2 = this.F;
        if (rect2.equals(rect)) {
            z10 = a10;
        } else {
            rect2.set(rect);
        }
        if (z10) {
            requestLayout();
        }
        return h1Var.a().a.c().a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(getContext());
        WeakHashMap weakHashMap = i0.a;
        y.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                m.c cVar = (m.c) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin + paddingLeft;
                int i15 = ((ViewGroup.MarginLayoutParams) cVar).topMargin + paddingTop;
                childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int measuredHeight;
        e();
        measureChildWithMargins(this.d, i3, 0, i10, 0);
        m.c cVar = (m.c) this.d.getLayoutParams();
        int max = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin);
        int max2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = i0.a;
        boolean z10 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z10) {
            measuredHeight = this.a;
            if (this.r && this.d.getTabContainer() != null) {
                measuredHeight += this.a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.E;
        Rect rect2 = this.G;
        rect2.set(rect);
        k1 k1Var = this.H;
        this.J = k1Var;
        if (this.n || z10) {
            i0.b b10 = i0.b.b(k1Var.b(), this.J.d() + measuredHeight, this.J.c(), this.J.a());
            k1 k1Var2 = this.J;
            int i11 = Build.VERSION.SDK_INT;
            a1 z0Var = i11 >= 34 ? new z0(k1Var2) : i11 >= 30 ? new y0(k1Var2) : i11 >= 29 ? new x0(k1Var2) : new w0(k1Var2);
            z0Var.g(b10);
            this.J = z0Var.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.J = k1Var.a.m(0, measuredHeight, 0, 0);
        }
        a(this.c, rect2, true);
        if (!this.K.equals(this.J)) {
            k1 k1Var3 = this.J;
            this.K = k1Var3;
            i0.b(this.c, k1Var3);
        }
        measureChildWithMargins(this.c, i3, 0, i10, 0);
        m.c cVar2 = (m.c) this.c.getLayoutParams();
        int max3 = Math.max(max, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin + ((ViewGroup.MarginLayoutParams) cVar2).rightMargin);
        int max4 = Math.max(max2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) cVar2).topMargin + ((ViewGroup.MarginLayoutParams) cVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i3, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i10, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.s || !z10) {
            return false;
        }
        this.M.fling(0, 0, 0, (int) f11, 0, 0, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (this.M.getFinalY() > this.d.getHeight()) {
            b();
            this.Q.run();
        } else {
            b();
            this.P.run();
        }
        this.w = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i10, int i11, int i12) {
        int i13 = this.x + i10;
        this.x = i13;
        setActionBarHideOffset(i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        b0 b0Var;
        j jVar;
        this.R.a = i3;
        this.x = getActionBarHideOffset();
        b();
        m.b bVar = this.L;
        if (bVar == null || (jVar = (b0Var = (b0) bVar).s) == null) {
            return;
        }
        jVar.a();
        b0Var.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        if ((i3 & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.s;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.s || this.w) {
            return;
        }
        if (this.x <= this.d.getHeight()) {
            b();
            postDelayed(this.P, 600L);
        } else {
            b();
            postDelayed(this.Q, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i3) {
        super.onWindowSystemUiVisibilityChanged(i3);
        e();
        int i10 = this.y ^ i3;
        this.y = i3;
        boolean z10 = (i3 & 4) == 0;
        boolean z11 = (i3 & 256) != 0;
        m.b bVar = this.L;
        if (bVar != null) {
            b0 b0Var = (b0) bVar;
            b0Var.o = !z11;
            if (z10 || !z11) {
                if (b0Var.p) {
                    b0Var.p = false;
                    b0Var.d(true);
                }
            } else if (!b0Var.p) {
                b0Var.p = true;
                b0Var.d(true);
            }
        }
        if ((i10 & 256) == 0 || this.L == null) {
            return;
        }
        WeakHashMap weakHashMap = i0.a;
        y.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i3) {
        super.onWindowVisibilityChanged(i3);
        this.b = i3;
        m.b bVar = this.L;
        if (bVar != null) {
            ((b0) bVar).n = i3;
        }
    }

    @Override // r0.k
    public final boolean p(View view, View view2, int i3, int i10) {
        return i10 == 0 && onStartNestedScroll(view, view2, i3);
    }

    @Override // r0.k
    public final void s(View view, View view2, int i3, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i3);
        }
    }

    public void setActionBarHideOffset(int i3) {
        b();
        this.d.setTranslationY(-Math.max(0, Math.min(i3, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(m.b bVar) {
        this.L = bVar;
        if (getWindowToken() != null) {
            ((b0) this.L).n = this.b;
            int i3 = this.y;
            if (i3 != 0) {
                onWindowSystemUiVisibilityChanged(i3);
                WeakHashMap weakHashMap = i0.a;
                y.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.r = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.s) {
            this.s = z10;
            if (z10) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i3) {
        e();
        k3 k3Var = (k3) this.e;
        k3Var.d = i3 != 0 ? oc.b(k3Var.a.getContext(), i3) : null;
        k3Var.c();
    }

    public void setLogo(int i3) {
        e();
        k3 k3Var = (k3) this.e;
        k3Var.e = i3 != 0 ? oc.b(k3Var.a.getContext(), i3) : null;
        k3Var.c();
    }

    public void setOverlayMode(boolean z10) {
        this.n = z10;
        this.h = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    @Override // m.j1
    public void setWindowCallback(Window.Callback callback) {
        e();
        ((k3) this.e).k = callback;
    }

    @Override // m.j1
    public void setWindowTitle(CharSequence charSequence) {
        e();
        k3 k3Var = (k3) this.e;
        if (k3Var.g) {
            return;
        }
        Toolbar toolbar = k3Var.a;
        k3Var.h = charSequence;
        if ((k3Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (k3Var.g) {
                i0.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.E = new Rect();
        this.F = new Rect();
        this.G = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        k1 k1Var = k1.b;
        this.H = k1Var;
        this.I = k1Var;
        this.J = k1Var;
        this.K = k1Var;
        this.O = new v3(this, 1);
        this.P = new m.a(this, 0);
        this.Q = new m.a(this, 1);
        c(context);
        this.R = new t0();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new m.c(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        e();
        k3 k3Var = (k3) this.e;
        k3Var.d = drawable;
        k3Var.c();
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i3) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i10, int[] iArr) {
    }

    @Override // r0.k
    public final void t(View view, int i3, int i10, int[] iArr, int i11) {
    }
}
