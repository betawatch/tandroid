package androidx.appcompat.widget;

import a5.e;
import ag.m0;
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
import g.a0;
import h7.s7;
import java.util.WeakHashMap;
import k.j;
import l.k;
import l.w;
import m.i;
import m.j3;
import m.k1;
import m.l1;
import m.o3;
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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
    public final m0 J;
    public final m.b K;
    public final m.b L;
    public final e M;
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
        int i10 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) dVar).leftMargin = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) dVar).topMargin = i13;
            z11 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) dVar).rightMargin = i15;
            z11 = true;
        }
        if (z10) {
            int i16 = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = i17;
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
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(viewGroup, i10, i11, i12, i13);
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
            ((o3) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i10 == 5) {
            ((o3) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i10 != 109) {
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
        o3 o3Var = (o3) this.e;
        Toolbar toolbar = o3Var.a;
        if (o3Var.m == null) {
            o3Var.m = new i(toolbar.getContext());
        }
        i iVar = o3Var.m;
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
            toolbar.a0 = new j3(toolbar);
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
        e eVar = this.M;
        return eVar.b | eVar.a;
    }

    public CharSequence getTitle() {
        f();
        return ((o3) this.e).a.getTitle();
    }

    @Override // r0.n
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c(viewGroup, i10, i11, i12, i13, i14);
    }

    @Override // r0.m
    public final void n(int i10, View view) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // r0.m
    public final boolean o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
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
        j1 j1Var = h.a;
        m1 m10 = j1Var.m(i10, i11, i12, i13);
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                m.d dVar = (m.d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) dVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        f();
        measureChildWithMargins(this.d, i10, 0, i11, 0);
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
            int i12 = Build.VERSION.SDK_INT;
            c1 b1Var = i12 >= 34 ? new b1(m1Var2) : i12 >= 30 ? new a1(m1Var2) : i12 >= 29 ? new z0(m1Var2) : new y0(m1Var2);
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
        measureChildWithMargins(this.c, i10, 0, i11, 0);
        m.d dVar2 = (m.d) this.c.getLayoutParams();
        int max3 = Math.max(max, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) dVar2).leftMargin + ((ViewGroup.MarginLayoutParams) dVar2).rightMargin);
        int max4 = Math.max(max2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar2).topMargin + ((ViewGroup.MarginLayoutParams) dVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f9, float f10, boolean z10) {
        if (!this.s || !z10) {
            return false;
        }
        this.H.fling(0, 0, 0, (int) f10, 0, 0, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID);
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
    public final boolean onNestedPreFling(View view, float f9, float f10) {
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
        this.M.a = i10;
        this.w = getActionBarHideOffset();
        b();
        m.c cVar = this.G;
        if (cVar == null || (jVar = (a0Var = (a0) cVar).s) == null) {
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
            postDelayed(this.K, 600L);
        } else {
            b();
            postDelayed(this.L, 600L);
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
        if ((i11 & 256) == 0 || this.G == null) {
            return;
        }
        WeakHashMap weakHashMap = j0.a;
        z.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.b = i10;
        m.c cVar = this.G;
        if (cVar != null) {
            ((a0) cVar).n = i10;
        }
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

    public void setActionBarVisibilityCallback(m.c cVar) {
        this.G = cVar;
        if (getWindowToken() != null) {
            ((a0) this.G).n = this.b;
            int i10 = this.x;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
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

    public void setIcon(int i10) {
        f();
        o3 o3Var = (o3) this.e;
        o3Var.d = i10 != 0 ? s7.b(o3Var.a.getContext(), i10) : null;
        o3Var.c();
    }

    public void setLogo(int i10) {
        f();
        o3 o3Var = (o3) this.e;
        o3Var.e = i10 != 0 ? s7.b(o3Var.a.getContext(), i10) : null;
        o3Var.c();
    }

    public void setOverlayMode(boolean z10) {
        this.n = z10;
        this.h = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    @Override // m.k1
    public void setWindowCallback(Window.Callback callback) {
        f();
        ((o3) this.e).k = callback;
    }

    @Override // m.k1
    public void setWindowTitle(CharSequence charSequence) {
        f();
        o3 o3Var = (o3) this.e;
        if (o3Var.g) {
            return;
        }
        Toolbar toolbar = o3Var.a;
        o3Var.h = charSequence;
        if ((o3Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (o3Var.g) {
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
        this.J = new m0(this, 25);
        this.K = new m.b(this, 0);
        this.L = new m.b(this, 1);
        d(context);
        this.M = new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new m.d(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        f();
        o3 o3Var = (o3) this.e;
        o3Var.d = drawable;
        o3Var.c();
    }

    public void setShowingForActionMode(boolean z10) {
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
