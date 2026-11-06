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
import e2.r0;
import g.b0;
import java.util.WeakHashMap;
import l.w;
import m.h3;
import m.i;
import m.k1;
import m.l1;
import m.m3;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import r0.a0;
import r0.a1;
import r0.h1;
import r0.i0;
import r0.k;
import r0.l;
import r0.w0;
import r0.x0;
import r0.y;
import r0.y0;
import r0.z0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements k1, k, l {
    public static final int[] R = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public final Rect D;
    public final Rect E;
    public final Rect F;
    public r0.k1 G;
    public r0.k1 H;
    public r0.k1 I;
    public r0.k1 J;
    public m.c K;
    public OverScroller L;
    public ViewPropertyAnimator M;
    public final m.a N;
    public final m.b O;
    public final m.b P;
    public final r0 Q;
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
    public boolean w;
    public int x;
    public int y;

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public static boolean a(View view, Rect rect, boolean z9) {
        boolean z10;
        m.d dVar = (m.d) view.getLayoutParams();
        int i7 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
        int i10 = rect.left;
        if (i7 != i10) {
            ((ViewGroup.MarginLayoutParams) dVar).leftMargin = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
        int i12 = rect.top;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) dVar).topMargin = i12;
            z10 = true;
        }
        int i13 = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
        int i14 = rect.right;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) dVar).rightMargin = i14;
            z10 = true;
        }
        if (z9) {
            int i15 = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
            int i16 = rect.bottom;
            if (i15 != i16) {
                ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = i16;
                return true;
            }
        }
        return z10;
    }

    public final void b() {
        removeCallbacks(this.O);
        removeCallbacks(this.P);
        ViewPropertyAnimator viewPropertyAnimator = this.M;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void c(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(R);
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.h = context.getApplicationInfo().targetSdkVersion < 19;
        this.L = new OverScroller(context);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof m.d;
    }

    public final void d(int i7) {
        e();
        if (i7 == 2) {
            ((m3) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i7 == 5) {
            ((m3) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i7 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i7;
        super.draw(canvas);
        if (this.f == null || this.h) {
            return;
        }
        if (this.d.getVisibility() == 0) {
            i7 = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
        } else {
            i7 = 0;
        }
        this.f.setBounds(0, i7, getWidth(), this.f.getIntrinsicHeight() + i7);
        this.f.draw(canvas);
    }

    public final void e() {
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

    public final void f(Menu menu, w wVar) {
        e();
        m3 m3Var = (m3) this.e;
        Toolbar toolbar = m3Var.a;
        if (m3Var.m == null) {
            m3Var.m = new i(toolbar.getContext());
        }
        i iVar = m3Var.m;
        iVar.e = wVar;
        l.k kVar = (l.k) menu;
        if (kVar == null && toolbar.a == null) {
            return;
        }
        toolbar.f();
        l.k kVar2 = toolbar.a.F;
        if (kVar2 == kVar) {
            return;
        }
        if (kVar2 != null) {
            kVar2.r(toolbar.d0);
            kVar2.r(toolbar.e0);
        }
        if (toolbar.e0 == null) {
            toolbar.e0 = new h3(toolbar);
        }
        iVar.G = true;
        if (kVar != null) {
            kVar.b(iVar, toolbar.s);
            kVar.b(toolbar.e0, toolbar.s);
        } else {
            iVar.i(toolbar.s, null);
            toolbar.e0.i(toolbar.s, null);
            iVar.e();
            toolbar.e0.e();
        }
        toolbar.a.setPopupTheme(toolbar.w);
        toolbar.a.setPresenter(iVar);
        toolbar.d0 = iVar;
        toolbar.t();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
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
        return this.Q.b();
    }

    public CharSequence getTitle() {
        e();
        return ((m3) this.e).a.getTitle();
    }

    @Override // r0.k
    public final void k(int i7, View view) {
        if (i7 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // r0.l
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        m(view, i7, i10, i11, i12, i13);
    }

    @Override // r0.k
    public final void m(View view, int i7, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(view, i7, i10, i11, i12);
        }
    }

    @Override // r0.k
    public final boolean o(View view, View view2, int i7, int i10) {
        return i10 == 0 && onStartNestedScroll(view, view2, i7);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        e();
        r0.k1 h = r0.k1.h(this, windowInsets);
        boolean a10 = a(this.d, new Rect(h.b(), h.d(), h.c(), h.a()), false);
        WeakHashMap weakHashMap = i0.a;
        Rect rect = this.D;
        a0.b(this, h, rect);
        int i7 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        h1 h1Var = h.a;
        r0.k1 m10 = h1Var.m(i7, i10, i11, i12);
        this.G = m10;
        boolean z9 = true;
        if (!this.H.equals(m10)) {
            this.H = this.G;
            a10 = true;
        }
        Rect rect2 = this.E;
        if (rect2.equals(rect)) {
            z9 = a10;
        } else {
            rect2.set(rect);
        }
        if (z9) {
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
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
    public final void onMeasure(int i7, int i10) {
        int measuredHeight;
        e();
        measureChildWithMargins(this.d, i7, 0, i10, 0);
        m.d dVar = (m.d) this.d.getLayoutParams();
        int max = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
        int max2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = i0.a;
        boolean z9 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z9) {
            measuredHeight = this.a;
            if (this.r && this.d.getTabContainer() != null) {
                measuredHeight += this.a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.D;
        Rect rect2 = this.F;
        rect2.set(rect);
        r0.k1 k1Var = this.G;
        this.I = k1Var;
        if (this.n || z9) {
            i0.b b10 = i0.b.b(k1Var.b(), this.I.d() + measuredHeight, this.I.c(), this.I.a());
            r0.k1 k1Var2 = this.I;
            int i11 = Build.VERSION.SDK_INT;
            a1 z0Var = i11 >= 34 ? new z0(k1Var2) : i11 >= 30 ? new y0(k1Var2) : i11 >= 29 ? new x0(k1Var2) : new w0(k1Var2);
            z0Var.g(b10);
            this.I = z0Var.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.I = k1Var.a.m(0, measuredHeight, 0, 0);
        }
        a(this.c, rect2, true);
        if (!this.J.equals(this.I)) {
            r0.k1 k1Var3 = this.I;
            this.J = k1Var3;
            i0.b(this.c, k1Var3);
        }
        measureChildWithMargins(this.c, i7, 0, i10, 0);
        m.d dVar2 = (m.d) this.c.getLayoutParams();
        int max3 = Math.max(max, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) dVar2).leftMargin + ((ViewGroup.MarginLayoutParams) dVar2).rightMargin);
        int max4 = Math.max(max2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar2).topMargin + ((ViewGroup.MarginLayoutParams) dVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i7, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i10, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        if (!this.s || !z9) {
            return false;
        }
        this.L.fling(0, 0, 0, (int) f11, 0, 0, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (this.L.getFinalY() > this.d.getHeight()) {
            b();
            this.P.run();
        } else {
            b();
            this.O.run();
        }
        this.w = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        int i13 = this.x + i10;
        this.x = i13;
        setActionBarHideOffset(i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        b0 b0Var;
        ac.d dVar;
        this.Q.a = i7;
        this.x = getActionBarHideOffset();
        b();
        m.c cVar = this.K;
        if (cVar == null || (dVar = (b0Var = (b0) cVar).s) == null) {
            return;
        }
        dVar.a();
        b0Var.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        if ((i7 & 2) == 0 || this.d.getVisibility() != 0) {
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
            postDelayed(this.O, 600L);
        } else {
            b();
            postDelayed(this.P, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i7) {
        super.onWindowSystemUiVisibilityChanged(i7);
        e();
        int i10 = this.y ^ i7;
        this.y = i7;
        boolean z9 = (i7 & 4) == 0;
        boolean z10 = (i7 & 256) != 0;
        m.c cVar = this.K;
        if (cVar != null) {
            b0 b0Var = (b0) cVar;
            b0Var.o = !z10;
            if (z9 || !z10) {
                if (b0Var.p) {
                    b0Var.p = false;
                    b0Var.d(true);
                }
            } else if (!b0Var.p) {
                b0Var.p = true;
                b0Var.d(true);
            }
        }
        if ((i10 & 256) == 0 || this.K == null) {
            return;
        }
        WeakHashMap weakHashMap = i0.a;
        y.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        this.b = i7;
        m.c cVar = this.K;
        if (cVar != null) {
            ((b0) cVar).n = i7;
        }
    }

    @Override // r0.k
    public final void r(View view, View view2, int i7, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }

    public void setActionBarHideOffset(int i7) {
        b();
        this.d.setTranslationY(-Math.max(0, Math.min(i7, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(m.c cVar) {
        this.K = cVar;
        if (getWindowToken() != null) {
            ((b0) this.K).n = this.b;
            int i7 = this.y;
            if (i7 != 0) {
                onWindowSystemUiVisibilityChanged(i7);
                WeakHashMap weakHashMap = i0.a;
                y.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z9) {
        this.r = z9;
    }

    public void setHideOnContentScrollEnabled(boolean z9) {
        if (z9 != this.s) {
            this.s = z9;
            if (z9) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i7) {
        e();
        m3 m3Var = (m3) this.e;
        m3Var.d = i7 != 0 ? b5.a.b(m3Var.a.getContext(), i7) : null;
        m3Var.c();
    }

    public void setLogo(int i7) {
        e();
        m3 m3Var = (m3) this.e;
        m3Var.e = i7 != 0 ? b5.a.b(m3Var.a.getContext(), i7) : null;
        m3Var.c();
    }

    public void setOverlayMode(boolean z9) {
        this.n = z9;
        this.h = z9 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    @Override // m.k1
    public void setWindowCallback(Window.Callback callback) {
        e();
        ((m3) this.e).k = callback;
    }

    @Override // m.k1
    public void setWindowTitle(CharSequence charSequence) {
        e();
        m3 m3Var = (m3) this.e;
        if (m3Var.g) {
            return;
        }
        Toolbar toolbar = m3Var.a;
        m3Var.h = charSequence;
        if ((m3Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (m3Var.g) {
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
        this.D = new Rect();
        this.E = new Rect();
        this.F = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        r0.k1 k1Var = r0.k1.b;
        this.G = k1Var;
        this.H = k1Var;
        this.I = k1Var;
        this.J = k1Var;
        this.N = new m.a(this, 0);
        this.O = new m.b(this, 0);
        this.P = new m.b(this, 1);
        c(context);
        this.Q = new r0();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new m.d(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        e();
        m3 m3Var = (m3) this.e;
        m3Var.d = drawable;
        m3Var.c();
    }

    public void setShowingForActionMode(boolean z9) {
    }

    public void setUiOptions(int i7) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
    }

    @Override // r0.k
    public final void s(View view, int i7, int i10, int[] iArr, int i11) {
    }
}
