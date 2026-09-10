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
import b2.q0;
import bi.h;
import g.c0;
import java.util.WeakHashMap;
import l.x;
import m.i3;
import m.j1;
import m.k1;
import m.n3;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import r0.a0;
import r0.a1;
import r0.b1;
import r0.i0;
import r0.i1;
import r0.l;
import r0.l1;
import r0.m;
import r0.x0;
import r0.y;
import r0.y0;
import r0.z0;
import v7.v7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements j1, l, m {
    public static final int[] R = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public final Rect E;
    public final Rect F;
    public l1 G;
    public l1 H;
    public l1 I;
    public l1 J;
    public m.b K;
    public OverScroller L;
    public ViewPropertyAnimator M;
    public final h N;
    public final m.a O;
    public final m.a P;
    public final q0 Q;
    public int a;
    public int b;
    public ContentFrameLayout c;
    public ActionBarContainer d;
    public k1 e;
    public Drawable f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public int w;
    public int x;
    public final Rect y;

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public static boolean a(View view, Rect rect, boolean z10) {
        boolean z11;
        m.c cVar = (m.c) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) cVar).leftMargin = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) cVar).topMargin = i13;
            z11 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) cVar).rightMargin = i15;
            z11 = true;
        }
        if (z10) {
            int i16 = ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) cVar).bottomMargin = i17;
                return true;
            }
        }
        return z11;
    }

    @Override // r0.l
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(viewGroup, i10, i11, i12, i13);
        }
    }

    public final void c() {
        removeCallbacks(this.O);
        removeCallbacks(this.P);
        ViewPropertyAnimator viewPropertyAnimator = this.M;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof m.c;
    }

    public final void d(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(R);
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.h = context.getApplicationInfo().targetSdkVersion < 19;
        this.L = new OverScroller(context);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        if (this.f == null || this.h) {
            return;
        }
        if (this.d.getVisibility() == 0) {
            i10 = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
        } else {
            i10 = 0;
        }
        this.f.setBounds(0, i10, getWidth(), this.f.getIntrinsicHeight() + i10);
        this.f.draw(canvas);
    }

    public final void e(int i10) {
        f();
        if (i10 == 2) {
            ((n3) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i10 == 5) {
            ((n3) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void f() {
        k1 wrapper;
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof k1) {
                wrapper = (k1) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.e = wrapper;
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final void g(Menu menu, x xVar) {
        f();
        n3 n3Var = (n3) this.e;
        Toolbar toolbar = n3Var.a;
        if (n3Var.m == null) {
            n3Var.m = new m.h(toolbar.getContext());
        }
        m.h hVar = n3Var.m;
        hVar.e = xVar;
        l.l lVar = (l.l) menu;
        if (lVar == null && toolbar.a == null) {
            return;
        }
        toolbar.f();
        l.l lVar2 = toolbar.a.F;
        if (lVar2 == lVar) {
            return;
        }
        if (lVar2 != null) {
            lVar2.r(toolbar.d0);
            lVar2.r(toolbar.e0);
        }
        if (toolbar.e0 == null) {
            toolbar.e0 = new i3(toolbar);
        }
        hVar.G = true;
        if (lVar != null) {
            lVar.b(hVar, toolbar.s);
            lVar.b(toolbar.e0, toolbar.s);
        } else {
            hVar.i(toolbar.s, null);
            toolbar.e0.i(toolbar.s, null);
            hVar.e();
            toolbar.e0.e();
        }
        toolbar.a.setPopupTheme(toolbar.v);
        toolbar.a.setPresenter(hVar);
        toolbar.d0 = hVar;
        toolbar.t();
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
        q0 q0Var = this.Q;
        return q0Var.b | q0Var.a;
    }

    public CharSequence getTitle() {
        f();
        return ((n3) this.e).a.getTitle();
    }

    @Override // r0.m
    public final void h(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        b(viewGroup, i10, i11, i12, i13, i14);
    }

    @Override // r0.l
    public final void n(int i10, View view) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // r0.l
    public final boolean o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        f();
        l1 h = l1.h(this, windowInsets);
        boolean a2 = a(this.d, new Rect(h.b(), h.d(), h.c(), h.a()), false);
        WeakHashMap weakHashMap = i0.a;
        Rect rect = this.y;
        a0.b(this, h, rect);
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        i1 i1Var = h.a;
        l1 m10 = i1Var.m(i10, i11, i12, i13);
        this.G = m10;
        boolean z10 = true;
        if (!this.H.equals(m10)) {
            this.H = this.G;
            a2 = true;
        }
        Rect rect2 = this.E;
        if (rect2.equals(rect)) {
            z10 = a2;
        } else {
            rect2.set(rect);
        }
        if (z10) {
            requestLayout();
        }
        return i1Var.a().a.c().a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d(getContext());
        WeakHashMap weakHashMap = i0.a;
        y.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                m.c cVar = (m.c) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) cVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        f();
        measureChildWithMargins(this.d, i10, 0, i11, 0);
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
        Rect rect = this.y;
        Rect rect2 = this.F;
        rect2.set(rect);
        l1 l1Var = this.G;
        this.I = l1Var;
        if (this.n || z10) {
            i0.c b10 = i0.c.b(l1Var.b(), this.I.d() + measuredHeight, this.I.c(), this.I.a());
            l1 l1Var2 = this.I;
            int i12 = Build.VERSION.SDK_INT;
            b1 a1Var = i12 >= 34 ? new a1(l1Var2) : i12 >= 30 ? new z0(l1Var2) : i12 >= 29 ? new y0(l1Var2) : new x0(l1Var2);
            a1Var.g(b10);
            this.I = a1Var.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.I = l1Var.a.m(0, measuredHeight, 0, 0);
        }
        a(this.c, rect2, true);
        if (!this.J.equals(this.I)) {
            l1 l1Var3 = this.I;
            this.J = l1Var3;
            i0.b(this.c, l1Var3);
        }
        measureChildWithMargins(this.c, i10, 0, i11, 0);
        m.c cVar2 = (m.c) this.c.getLayoutParams();
        int max3 = Math.max(max, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin + ((ViewGroup.MarginLayoutParams) cVar2).rightMargin);
        int max4 = Math.max(max2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) cVar2).topMargin + ((ViewGroup.MarginLayoutParams) cVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f7, float f10, boolean z10) {
        if (!this.s || !z10) {
            return false;
        }
        this.L.fling(0, 0, 0, (int) f10, 0, 0, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (this.L.getFinalY() > this.d.getHeight()) {
            c();
            this.P.run();
        } else {
            c();
            this.O.run();
        }
        this.v = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.w + i11;
        this.w = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        c0 c0Var;
        bc.d dVar;
        this.Q.a = i10;
        this.w = getActionBarHideOffset();
        c();
        m.b bVar = this.K;
        if (bVar == null || (dVar = (c0Var = (c0) bVar).s) == null) {
            return;
        }
        dVar.a();
        c0Var.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.s;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.s || this.v) {
            return;
        }
        if (this.w <= this.d.getHeight()) {
            c();
            postDelayed(this.O, 600L);
        } else {
            c();
            postDelayed(this.P, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        f();
        int i11 = this.x ^ i10;
        this.x = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        m.b bVar = this.K;
        if (bVar != null) {
            c0 c0Var = (c0) bVar;
            c0Var.o = !z11;
            if (z10 || !z11) {
                if (c0Var.p) {
                    c0Var.p = false;
                    c0Var.d(true);
                }
            } else if (!c0Var.p) {
                c0Var.p = true;
                c0Var.d(true);
            }
        }
        if ((i11 & 256) == 0 || this.K == null) {
            return;
        }
        WeakHashMap weakHashMap = i0.a;
        y.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.b = i10;
        m.b bVar = this.K;
        if (bVar != null) {
            ((c0) bVar).n = i10;
        }
    }

    @Override // r0.l
    public final void r(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    public void setActionBarHideOffset(int i10) {
        c();
        this.d.setTranslationY(-Math.max(0, Math.min(i10, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(m.b bVar) {
        this.K = bVar;
        if (getWindowToken() != null) {
            ((c0) this.K).n = this.b;
            int i10 = this.x;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
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
            c();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        f();
        n3 n3Var = (n3) this.e;
        n3Var.d = i10 != 0 ? v7.b(n3Var.a.getContext(), i10) : null;
        n3Var.c();
    }

    public void setLogo(int i10) {
        f();
        n3 n3Var = (n3) this.e;
        n3Var.e = i10 != 0 ? v7.b(n3Var.a.getContext(), i10) : null;
        n3Var.c();
    }

    public void setOverlayMode(boolean z10) {
        this.n = z10;
        this.h = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    @Override // m.j1
    public void setWindowCallback(Window.Callback callback) {
        f();
        ((n3) this.e).k = callback;
    }

    @Override // m.j1
    public void setWindowTitle(CharSequence charSequence) {
        f();
        n3 n3Var = (n3) this.e;
        if (n3Var.g) {
            return;
        }
        Toolbar toolbar = n3Var.a;
        n3Var.h = charSequence;
        if ((n3Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (n3Var.g) {
                i0.l(toolbar.getRootView(), charSequence);
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
        this.y = new Rect();
        this.E = new Rect();
        this.F = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        l1 l1Var = l1.b;
        this.G = l1Var;
        this.H = l1Var;
        this.I = l1Var;
        this.J = l1Var;
        this.N = new h(this, 15);
        this.O = new m.a(this, 0);
        this.P = new m.a(this, 1);
        d(context);
        this.Q = new q0();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new m.c(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        f();
        n3 n3Var = (n3) this.e;
        n3Var.d = drawable;
        n3Var.c();
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // r0.l
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
    }
}
