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
import c5.e;
import dg.l0;
import g.a0;
import j7.s7;
import java.util.WeakHashMap;
import k.j;
import l.l;
import l.x;
import m.h;
import m.i3;
import m.j1;
import m.k1;
import m.n3;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import r0.a1;
import r0.b0;
import r0.b1;
import r0.c1;
import r0.j0;
import r0.m;
import r0.m1;
import r0.n;
import r0.y0;
import r0.z;
import r0.z0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements j1, m, n {
    public static final int[] O = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public final Rect B;
    public final Rect C;
    public m1 D;
    public m1 E;
    public m1 F;
    public m1 G;
    public m.b H;
    public OverScroller I;
    public ViewPropertyAnimator J;
    public final l0 K;
    public final m.a L;
    public final m.a M;
    public final e N;
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

    public static boolean a(View view, Rect rect, boolean z4) {
        boolean z10;
        m.c cVar = (m.c) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) cVar).leftMargin = i11;
            z10 = true;
        } else {
            z10 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) cVar).topMargin = i13;
            z10 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) cVar).rightMargin = i15;
            z10 = true;
        }
        if (z4) {
            int i16 = ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) cVar).bottomMargin = i17;
                return true;
            }
        }
        return z10;
    }

    public final void b() {
        removeCallbacks(this.L);
        removeCallbacks(this.M);
        ViewPropertyAnimator viewPropertyAnimator = this.J;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // r0.m
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(viewGroup, i10, i11, i12, i13);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof m.c;
    }

    public final void d(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(O);
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.h = context.getApplicationInfo().targetSdkVersion < 19;
        this.I = new OverScroller(context);
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
            n3Var.m = new h(toolbar.getContext());
        }
        h hVar = n3Var.m;
        hVar.e = xVar;
        l lVar = (l) menu;
        if (lVar == null && toolbar.a == null) {
            return;
        }
        toolbar.f();
        l lVar2 = toolbar.a.C;
        if (lVar2 == lVar) {
            return;
        }
        if (lVar2 != null) {
            lVar2.r(toolbar.a0);
            lVar2.r(toolbar.b0);
        }
        if (toolbar.b0 == null) {
            toolbar.b0 = new i3(toolbar);
        }
        hVar.D = true;
        if (lVar != null) {
            lVar.b(hVar, toolbar.s);
            lVar.b(toolbar.b0, toolbar.s);
        } else {
            hVar.i(toolbar.s, null);
            toolbar.b0.i(toolbar.s, null);
            hVar.e();
            toolbar.b0.e();
        }
        toolbar.a.setPopupTheme(toolbar.v);
        toolbar.a.setPresenter(hVar);
        toolbar.a0 = hVar;
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
        e eVar = this.N;
        return eVar.b | eVar.a;
    }

    public CharSequence getTitle() {
        f();
        return ((n3) this.e).a.getTitle();
    }

    @Override // r0.n
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c(viewGroup, i10, i11, i12, i13, i14);
    }

    @Override // r0.m
    public final void o(int i10, View view) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        f();
        m1 h = m1.h(this, windowInsets);
        boolean a2 = a(this.d, new Rect(h.b(), h.d(), h.c(), h.a()), false);
        WeakHashMap weakHashMap = j0.a;
        Rect rect = this.y;
        b0.b(this, h, rect);
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        r0.j1 j1Var = h.a;
        m1 m9 = j1Var.m(i10, i11, i12, i13);
        this.D = m9;
        boolean z4 = true;
        if (!this.E.equals(m9)) {
            this.E = this.D;
            a2 = true;
        }
        Rect rect2 = this.B;
        if (rect2.equals(rect)) {
            z4 = a2;
        } else {
            rect2.set(rect);
        }
        if (z4) {
            requestLayout();
        }
        return j1Var.a().a.c().a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d(getContext());
        WeakHashMap weakHashMap = j0.a;
        z.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
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
        WeakHashMap weakHashMap = j0.a;
        boolean z4 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z4) {
            measuredHeight = this.a;
            if (this.r && this.d.getTabContainer() != null) {
                measuredHeight += this.a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.y;
        Rect rect2 = this.C;
        rect2.set(rect);
        m1 m1Var = this.D;
        this.F = m1Var;
        if (this.n || z4) {
            i0.b b10 = i0.b.b(m1Var.b(), this.F.d() + measuredHeight, this.F.c(), this.F.a());
            m1 m1Var2 = this.F;
            int i12 = Build.VERSION.SDK_INT;
            c1 b1Var = i12 >= 34 ? new b1(m1Var2) : i12 >= 30 ? new a1(m1Var2) : i12 >= 29 ? new z0(m1Var2) : new y0(m1Var2);
            b1Var.g(b10);
            this.F = b1Var.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.F = m1Var.a.m(0, measuredHeight, 0, 0);
        }
        a(this.c, rect2, true);
        if (!this.G.equals(this.F)) {
            m1 m1Var3 = this.F;
            this.G = m1Var3;
            j0.b(this.c, m1Var3);
        }
        measureChildWithMargins(this.c, i10, 0, i11, 0);
        m.c cVar2 = (m.c) this.c.getLayoutParams();
        int max3 = Math.max(max, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin + ((ViewGroup.MarginLayoutParams) cVar2).rightMargin);
        int max4 = Math.max(max2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) cVar2).topMargin + ((ViewGroup.MarginLayoutParams) cVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z4) {
        if (!this.s || !z4) {
            return false;
        }
        this.I.fling(0, 0, 0, (int) f11, 0, 0, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (this.I.getFinalY() > this.d.getHeight()) {
            b();
            this.M.run();
        } else {
            b();
            this.L.run();
        }
        this.v = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
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
        a0 a0Var;
        j jVar;
        this.N.a = i10;
        this.w = getActionBarHideOffset();
        b();
        m.b bVar = this.H;
        if (bVar == null || (jVar = (a0Var = (a0) bVar).s) == null) {
            return;
        }
        jVar.a();
        a0Var.s = null;
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
            b();
            postDelayed(this.L, 600L);
        } else {
            b();
            postDelayed(this.M, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        f();
        int i11 = this.x ^ i10;
        this.x = i10;
        boolean z4 = (i10 & 4) == 0;
        boolean z10 = (i10 & 256) != 0;
        m.b bVar = this.H;
        if (bVar != null) {
            a0 a0Var = (a0) bVar;
            a0Var.o = !z10;
            if (z4 || !z10) {
                if (a0Var.p) {
                    a0Var.p = false;
                    a0Var.d(true);
                }
            } else if (!a0Var.p) {
                a0Var.p = true;
                a0Var.d(true);
            }
        }
        if ((i11 & 256) == 0 || this.H == null) {
            return;
        }
        WeakHashMap weakHashMap = j0.a;
        z.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.b = i10;
        m.b bVar = this.H;
        if (bVar != null) {
            ((a0) bVar).n = i10;
        }
    }

    @Override // r0.m
    public final boolean p(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // r0.m
    public final void s(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    public void setActionBarHideOffset(int i10) {
        b();
        this.d.setTranslationY(-Math.max(0, Math.min(i10, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(m.b bVar) {
        this.H = bVar;
        if (getWindowToken() != null) {
            ((a0) this.H).n = this.b;
            int i10 = this.x;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                WeakHashMap weakHashMap = j0.a;
                z.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z4) {
        this.r = z4;
    }

    public void setHideOnContentScrollEnabled(boolean z4) {
        if (z4 != this.s) {
            this.s = z4;
            if (z4) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        f();
        n3 n3Var = (n3) this.e;
        n3Var.d = i10 != 0 ? s7.b(n3Var.a.getContext(), i10) : null;
        n3Var.c();
    }

    public void setLogo(int i10) {
        f();
        n3 n3Var = (n3) this.e;
        n3Var.e = i10 != 0 ? s7.b(n3Var.a.getContext(), i10) : null;
        n3Var.c();
    }

    public void setOverlayMode(boolean z4) {
        this.n = z4;
        this.h = z4 && getContext().getApplicationInfo().targetSdkVersion < 19;
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
                j0.l(toolbar.getRootView(), charSequence);
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
        this.B = new Rect();
        this.C = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        m1 m1Var = m1.b;
        this.D = m1Var;
        this.E = m1Var;
        this.F = m1Var;
        this.G = m1Var;
        this.K = new l0(this, 9);
        this.L = new m.a(this, 0);
        this.M = new m.a(this, 1);
        d(context);
        this.N = new e();
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

    public void setShowingForActionMode(boolean z4) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // r0.m
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
    }
}
