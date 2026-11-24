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
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements si7, ti7 {
    public static final int[] S = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public final Rect E;
    public final Rect F;
    public final Rect G;
    public vxc H;
    public vxc I;
    public vxc J;
    public vxc K;
    public c8 L;
    public OverScroller M;
    public ViewPropertyAnimator N;
    public final g0 O;
    public final b8 P;
    public final b8 Q;
    public final zw8 R;
    public int a;
    public int b;
    public ContentFrameLayout c;
    public ActionBarContainer d;
    public g93 e;
    public Drawable f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public int x;
    public int y;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.E = new Rect();
        this.F = new Rect();
        this.G = new Rect();
        vxc vxcVar = vxc.b;
        this.H = vxcVar;
        this.I = vxcVar;
        this.J = vxcVar;
        this.K = vxcVar;
        this.O = new g0(this, (byte) 2);
        this.P = new b8(this, (byte) 0);
        this.Q = new b8(this, (byte) 1);
        c(context);
        this.R = new zw8((byte) 3);
    }

    public static boolean a(View view, Rect rect, boolean z) {
        boolean z2;
        d8 d8Var = (d8) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) d8Var).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) d8Var).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) d8Var).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) d8Var).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) d8Var).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) d8Var).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) d8Var).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) d8Var).bottomMargin = i8;
                return true;
            }
        }
        return z2;
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
        return layoutParams instanceof d8;
    }

    public final void d(int i) {
        e();
        if (i == 2) {
            ((itb) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((itb) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f == null || this.h) {
            return;
        }
        if (this.d.getVisibility() == 0) {
            i = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
        } else {
            i = 0;
        }
        this.f.setBounds(0, i, getWidth(), this.f.getIntrinsicHeight() + i);
        this.f.draw(canvas);
    }

    public final void e() {
        g93 wrapper;
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof g93) {
                wrapper = (g93) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    sc8.j("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.e = wrapper;
        }
    }

    public final void f(yz6 yz6Var, r07 r07Var) {
        e();
        itb itbVar = (itb) this.e;
        Toolbar toolbar = itbVar.a;
        b9 b9Var = itbVar.m;
        if (b9Var == null) {
            b9Var = new b9(toolbar.getContext());
            itbVar.m = b9Var;
        }
        b9Var.e = r07Var;
        if (yz6Var == null && toolbar.a == null) {
            return;
        }
        toolbar.f();
        yz6 yz6Var2 = toolbar.a.G;
        if (yz6Var2 == yz6Var) {
            return;
        }
        if (yz6Var2 != null) {
            yz6Var2.r(toolbar.e0);
            yz6Var2.r(toolbar.f0);
        }
        if (toolbar.f0 == null) {
            toolbar.f0 = new dtb(toolbar);
        }
        b9Var.H = true;
        Context context = toolbar.s;
        if (yz6Var != null) {
            yz6Var.b(b9Var, context);
            yz6Var.b(toolbar.f0, toolbar.s);
        } else {
            b9Var.k(context, null);
            toolbar.f0.k(toolbar.s, null);
            b9Var.j();
            toolbar.f0.j();
        }
        toolbar.a.setPopupTheme(toolbar.w);
        toolbar.a.setPresenter(b9Var);
        toolbar.e0 = b9Var;
        toolbar.t();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d8(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d8(getContext(), attributeSet);
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
        return ((itb) this.e).a.getTitle();
    }

    @Override // si7
    public final void k(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // ti7
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m(view, i, i2, i3, i4, i5);
    }

    @Override // si7
    public final void m(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // si7
    public final boolean n(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        e();
        vxc h = vxc.h(this, windowInsets);
        boolean a = a(this.d, new Rect(h.b(), h.d(), h.c(), h.a()), false);
        WeakHashMap weakHashMap = jdc.a;
        Rect rect = this.E;
        bdc.b(this, h, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        sxc sxcVar = h.a;
        vxc m = sxcVar.m(i, i2, i3, i4);
        this.H = m;
        boolean z = true;
        if (!this.I.equals(m)) {
            this.I = this.H;
            a = true;
        }
        Rect rect2 = this.F;
        if (rect2.equals(rect)) {
            z = a;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return sxcVar.a().a.c().a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(getContext());
        WeakHashMap weakHashMap = jdc.a;
        zcc.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                d8 d8Var = (d8) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) d8Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) d8Var).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        e();
        measureChildWithMargins(this.d, i, 0, i2, 0);
        d8 d8Var = (d8) this.d.getLayoutParams();
        int max = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) d8Var).leftMargin + ((ViewGroup.MarginLayoutParams) d8Var).rightMargin);
        int max2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) d8Var).topMargin + ((ViewGroup.MarginLayoutParams) d8Var).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = jdc.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
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
        vxc vxcVar = this.H;
        this.J = vxcVar;
        if (this.n || z) {
            io5 b = io5.b(vxcVar.b(), this.J.d() + measuredHeight, this.J.c(), this.J.a());
            vxc vxcVar2 = this.J;
            int i3 = Build.VERSION.SDK_INT;
            lxc kxcVar = i3 >= 34 ? new kxc(vxcVar2) : i3 >= 30 ? new jxc(vxcVar2) : i3 >= 29 ? new ixc(vxcVar2) : new hxc(vxcVar2);
            kxcVar.g(b);
            this.J = kxcVar.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.J = vxcVar.a.m(0, measuredHeight, 0, 0);
        }
        a(this.c, rect2, true);
        if (!this.K.equals(this.J)) {
            vxc vxcVar3 = this.J;
            this.K = vxcVar3;
            jdc.b(this.c, vxcVar3);
        }
        measureChildWithMargins(this.c, i, 0, i2, 0);
        d8 d8Var2 = (d8) this.c.getLayoutParams();
        int max3 = Math.max(max, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) d8Var2).leftMargin + ((ViewGroup.MarginLayoutParams) d8Var2).rightMargin);
        int max4 = Math.max(max2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) d8Var2).topMargin + ((ViewGroup.MarginLayoutParams) d8Var2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.s || !z) {
            return false;
        }
        this.M.fling(0, 0, 0, (int) f2, 0, 0, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID);
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
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.x + i2;
        this.x = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        zwc zwcVar;
        cfc cfcVar;
        this.R.b = i;
        this.x = getActionBarHideOffset();
        b();
        c8 c8Var = this.L;
        if (c8Var == null || (cfcVar = (zwcVar = (zwc) c8Var).s) == null) {
            return;
        }
        cfcVar.a();
        zwcVar.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.d.getVisibility() != 0) {
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
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        e();
        int i2 = this.y ^ i;
        this.y = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        c8 c8Var = this.L;
        if (c8Var != null) {
            zwc zwcVar = (zwc) c8Var;
            zwcVar.o = !z2;
            if (z || !z2) {
                if (zwcVar.p) {
                    zwcVar.p = false;
                    zwcVar.d(true);
                }
            } else if (!zwcVar.p) {
                zwcVar.p = true;
                zwcVar.d(true);
            }
        }
        if ((i2 & 256) == 0 || this.L == null) {
            return;
        }
        WeakHashMap weakHashMap = jdc.a;
        zcc.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        c8 c8Var = this.L;
        if (c8Var != null) {
            ((zwc) c8Var).n = i;
        }
    }

    @Override // si7
    public final void q(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public void setActionBarHideOffset(int i) {
        b();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(c8 c8Var) {
        this.L = c8Var;
        if (getWindowToken() != null) {
            ((zwc) this.L).n = this.b;
            int i = this.y;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = jdc.a;
                zcc.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.r = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.s) {
            this.s = z;
            if (z) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        e();
        itb itbVar = (itb) this.e;
        itbVar.d = i != 0 ? hmd.a(itbVar.a.getContext(), i) : null;
        itbVar.c();
    }

    public void setLogo(int i) {
        e();
        itb itbVar = (itb) this.e;
        itbVar.e = i != 0 ? hmd.a(itbVar.a.getContext(), i) : null;
        itbVar.c();
    }

    public void setOverlayMode(boolean z) {
        this.n = z;
        this.h = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setWindowCallback(Window.Callback callback) {
        e();
        ((itb) this.e).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        e();
        itb itbVar = (itb) this.e;
        if (itbVar.g) {
            return;
        }
        Toolbar toolbar = itbVar.a;
        itbVar.h = charSequence;
        if ((itbVar.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (itbVar.g) {
                jdc.l(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new d8(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        e();
        itb itbVar = (itb) this.e;
        itbVar.d = drawable;
        itbVar.c();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // si7
    public final void r(View view, int i, int i2, int[] iArr, int i3) {
    }
}
