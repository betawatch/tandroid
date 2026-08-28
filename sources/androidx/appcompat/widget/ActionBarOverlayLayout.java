package androidx.appcompat.widget;

import ag.e;
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
import d5.p;
import f7.t7;
import g.a0;
import java.util.WeakHashMap;
import l.k;
import l.w;
import m.i;
import m.k1;
import m.k3;
import m.l1;
import m.p3;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import r0.a1;
import r0.b0;
import r0.b1;
import r0.c1;
import r0.j0;
import r0.j1;
import r0.m;
import r0.m1;
import r0.n;
import r0.y0;
import r0.z;
import r0.z0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements k1, m, n {
    public static final int[] N = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public final Rect A;
    public final Rect B;
    public m1 C;
    public m1 D;
    public m1 E;
    public m1 F;
    public m.c G;
    public OverScroller H;
    public ViewPropertyAnimator I;
    public final e J;
    public final m.b K;
    public final m.b L;
    public final p M;
    public int a;
    public int b;
    public ContentFrameLayout c;
    public ActionBarContainer d;
    public l1 e;
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
        m.d dVar = (m.d) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
        int i10 = rect.left;
        if (i9 != i10) {
            ((ViewGroup.MarginLayoutParams) dVar).leftMargin = i10;
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
        int i12 = rect.top;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) dVar).topMargin = i12;
            z11 = true;
        }
        int i13 = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
        int i14 = rect.right;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) dVar).rightMargin = i14;
            z11 = true;
        }
        if (z10) {
            int i15 = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
            int i16 = rect.bottom;
            if (i15 != i16) {
                ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = i16;
                return true;
            }
        }
        return z11;
    }

    public final void b() {
        removeCallbacks(this.K);
        removeCallbacks(this.L);
        ViewPropertyAnimator viewPropertyAnimator = this.I;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // r0.m
    public final void c(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(viewGroup, i9, i10, i11, i12);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof m.d;
    }

    public final void d(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(N);
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.h = context.getApplicationInfo().targetSdkVersion < 19;
        this.H = new OverScroller(context);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i9;
        super.draw(canvas);
        if (this.f == null || this.h) {
            return;
        }
        if (this.d.getVisibility() == 0) {
            i9 = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
        } else {
            i9 = 0;
        }
        this.f.setBounds(0, i9, getWidth(), this.f.getIntrinsicHeight() + i9);
        this.f.draw(canvas);
    }

    public final void e(int i9) {
        f();
        if (i9 == 2) {
            ((p3) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i9 == 5) {
            ((p3) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i9 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void f() {
        l1 wrapper;
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof l1) {
                wrapper = (l1) findViewById;
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

    public final void g(Menu menu, w wVar) {
        f();
        p3 p3Var = (p3) this.e;
        Toolbar toolbar = p3Var.a;
        if (p3Var.m == null) {
            p3Var.m = new i(toolbar.getContext());
        }
        i iVar = p3Var.m;
        iVar.e = wVar;
        k kVar = (k) menu;
        if (kVar == null && toolbar.a == null) {
            return;
        }
        toolbar.f();
        k kVar2 = toolbar.a.B;
        if (kVar2 == kVar) {
            return;
        }
        if (kVar2 != null) {
            kVar2.r(toolbar.W);
            kVar2.r(toolbar.a0);
        }
        if (toolbar.a0 == null) {
            toolbar.a0 = new k3(toolbar);
        }
        iVar.C = true;
        if (kVar != null) {
            kVar.b(iVar, toolbar.s);
            kVar.b(toolbar.a0, toolbar.s);
        } else {
            iVar.i(toolbar.s, null);
            toolbar.a0.i(toolbar.s, null);
            iVar.e();
            toolbar.a0.e();
        }
        toolbar.a.setPopupTheme(toolbar.v);
        toolbar.a.setPresenter(iVar);
        toolbar.W = iVar;
        toolbar.t();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new m.d(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new m.d(getContext(), attributeSet);
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
        p pVar = this.M;
        return pVar.b | pVar.a;
    }

    public CharSequence getTitle() {
        f();
        return ((p3) this.e).a.getTitle();
    }

    @Override // r0.n
    public final void i(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
        c(viewGroup, i9, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        f();
        m1 h = m1.h(this, windowInsets);
        boolean a2 = a(this.d, new Rect(h.b(), h.d(), h.c(), h.a()), false);
        WeakHashMap weakHashMap = j0.a;
        Rect rect = this.y;
        b0.b(this, h, rect);
        int i9 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        j1 j1Var = h.a;
        m1 m10 = j1Var.m(i9, i10, i11, i12);
        this.C = m10;
        boolean z10 = true;
        if (!this.D.equals(m10)) {
            this.D = this.C;
            a2 = true;
        }
        Rect rect2 = this.A;
        if (rect2.equals(rect)) {
            z10 = a2;
        } else {
            rect2.set(rect);
        }
        if (z10) {
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                m.d dVar = (m.d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin + paddingLeft;
                int i15 = ((ViewGroup.MarginLayoutParams) dVar).topMargin + paddingTop;
                childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int measuredHeight;
        f();
        measureChildWithMargins(this.d, i9, 0, i10, 0);
        m.d dVar = (m.d) this.d.getLayoutParams();
        int max = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
        int max2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = j0.a;
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
        Rect rect2 = this.B;
        rect2.set(rect);
        m1 m1Var = this.C;
        this.E = m1Var;
        if (this.n || z10) {
            i0.b b10 = i0.b.b(m1Var.b(), this.E.d() + measuredHeight, this.E.c(), this.E.a());
            m1 m1Var2 = this.E;
            int i11 = Build.VERSION.SDK_INT;
            c1 b1Var = i11 >= 34 ? new b1(m1Var2) : i11 >= 30 ? new a1(m1Var2) : i11 >= 29 ? new z0(m1Var2) : new y0(m1Var2);
            b1Var.g(b10);
            this.E = b1Var.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.E = m1Var.a.m(0, measuredHeight, 0, 0);
        }
        a(this.c, rect2, true);
        if (!this.F.equals(this.E)) {
            m1 m1Var3 = this.E;
            this.F = m1Var3;
            j0.b(this.c, m1Var3);
        }
        measureChildWithMargins(this.c, i9, 0, i10, 0);
        m.d dVar2 = (m.d) this.c.getLayoutParams();
        int max3 = Math.max(max, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) dVar2).leftMargin + ((ViewGroup.MarginLayoutParams) dVar2).rightMargin);
        int max4 = Math.max(max2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar2).topMargin + ((ViewGroup.MarginLayoutParams) dVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i9, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i10, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.s || !z10) {
            return false;
        }
        this.H.fling(0, 0, 0, (int) f11, 0, 0, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (this.H.getFinalY() > this.d.getHeight()) {
            b();
            this.L.run();
        } else {
            b();
            this.K.run();
        }
        this.v = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i9, int i10, int i11, int i12) {
        int i13 = this.w + i10;
        this.w = i13;
        setActionBarHideOffset(i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i9) {
        a0 a0Var;
        jb.d dVar;
        this.M.a = i9;
        this.w = getActionBarHideOffset();
        b();
        m.c cVar = this.G;
        if (cVar == null || (dVar = (a0Var = (a0) cVar).s) == null) {
            return;
        }
        dVar.a();
        a0Var.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i9) {
        if ((i9 & 2) == 0 || this.d.getVisibility() != 0) {
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
            postDelayed(this.K, 600L);
        } else {
            b();
            postDelayed(this.L, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i9) {
        super.onWindowSystemUiVisibilityChanged(i9);
        f();
        int i10 = this.x ^ i9;
        this.x = i9;
        boolean z10 = (i9 & 4) == 0;
        boolean z11 = (i9 & 256) != 0;
        m.c cVar = this.G;
        if (cVar != null) {
            a0 a0Var = (a0) cVar;
            a0Var.o = !z11;
            if (z10 || !z11) {
                if (a0Var.p) {
                    a0Var.p = false;
                    a0Var.d(true);
                }
            } else if (!a0Var.p) {
                a0Var.p = true;
                a0Var.d(true);
            }
        }
        if ((i10 & 256) == 0 || this.G == null) {
            return;
        }
        WeakHashMap weakHashMap = j0.a;
        z.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i9) {
        super.onWindowVisibilityChanged(i9);
        this.b = i9;
        m.c cVar = this.G;
        if (cVar != null) {
            ((a0) cVar).n = i9;
        }
    }

    @Override // r0.m
    public final void p(int i9, View view) {
        if (i9 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // r0.m
    public final boolean q(View view, View view2, int i9, int i10) {
        return i10 == 0 && onStartNestedScroll(view, view2, i9);
    }

    public void setActionBarHideOffset(int i9) {
        b();
        this.d.setTranslationY(-Math.max(0, Math.min(i9, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(m.c cVar) {
        this.G = cVar;
        if (getWindowToken() != null) {
            ((a0) this.G).n = this.b;
            int i9 = this.x;
            if (i9 != 0) {
                onWindowSystemUiVisibilityChanged(i9);
                WeakHashMap weakHashMap = j0.a;
                z.c(this);
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

    public void setIcon(int i9) {
        f();
        p3 p3Var = (p3) this.e;
        p3Var.d = i9 != 0 ? t7.b(p3Var.a.getContext(), i9) : null;
        p3Var.c();
    }

    public void setLogo(int i9) {
        f();
        p3 p3Var = (p3) this.e;
        p3Var.e = i9 != 0 ? t7.b(p3Var.a.getContext(), i9) : null;
        p3Var.c();
    }

    public void setOverlayMode(boolean z10) {
        this.n = z10;
        this.h = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    @Override // m.k1
    public void setWindowCallback(Window.Callback callback) {
        f();
        ((p3) this.e).k = callback;
    }

    @Override // m.k1
    public void setWindowTitle(CharSequence charSequence) {
        f();
        p3 p3Var = (p3) this.e;
        if (p3Var.g) {
            return;
        }
        Toolbar toolbar = p3Var.a;
        p3Var.h = charSequence;
        if ((p3Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (p3Var.g) {
                j0.l(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // r0.m
    public final void t(View view, View view2, int i9, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i9);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.y = new Rect();
        this.A = new Rect();
        this.B = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        m1 m1Var = m1.b;
        this.C = m1Var;
        this.D = m1Var;
        this.E = m1Var;
        this.F = m1Var;
        this.J = new e(this, 29);
        this.K = new m.b(this, 0);
        this.L = new m.b(this, 1);
        d(context);
        this.M = new p();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new m.d(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        f();
        p3 p3Var = (p3) this.e;
        p3Var.d = drawable;
        p3Var.c();
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i9) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i9, int i10, int[] iArr) {
    }

    @Override // r0.m
    public final void E(ViewGroup viewGroup, int i9, int i10, int[] iArr, int i11) {
    }
}
