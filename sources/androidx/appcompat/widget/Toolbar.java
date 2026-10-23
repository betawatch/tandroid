package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.h;
import k2.w0;
import l.k;
import l.m;
import m.a1;
import m.g3;
import m.h3;
import m.i;
import m.i3;
import m.j3;
import m.k3;
import m.l1;
import m.l3;
import m.m3;
import m.n3;
import m.o3;
import m.p2;
import m.v;
import m.v3;
import m.w;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import r0.i0;
import v7.q7;
import w7.q;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public final int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public p2 J;
    public int K;
    public int L;
    public final int M;
    public CharSequence N;
    public CharSequence O;
    public ColorStateList P;
    public ColorStateList Q;
    public boolean R;
    public boolean S;
    public final ArrayList T;
    public final ArrayList U;
    public final int[] V;
    public final g3 W;
    public ActionMenuView a;
    public ArrayList a0;
    public a1 b;
    public final le.b b0;
    public a1 c;
    public o3 c0;
    public v d;
    public i d0;
    public w e;
    public j3 e0;
    public final Drawable f;
    public boolean f0;
    public OnBackInvokedCallback g0;
    public final CharSequence h;
    public OnBackInvokedDispatcher h0;
    public boolean i0;
    public final androidx.activity.i j0;
    public v n;
    public View r;
    public Context s;
    public int v;
    public int w;
    public int x;
    public final int y;

    public Toolbar(Context context) {
        this(context, null);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h(getContext());
    }

    public static k3 h() {
        k3 k3Var = new k3(-2, -2);
        k3Var.b = 0;
        k3Var.a = 8388627;
        return k3Var;
    }

    public static k3 i(ViewGroup.LayoutParams layoutParams) {
        boolean z10 = layoutParams instanceof k3;
        if (z10) {
            k3 k3Var = (k3) layoutParams;
            k3 k3Var2 = new k3(k3Var);
            k3Var2.b = 0;
            k3Var2.b = k3Var.b;
            return k3Var2;
        }
        if (z10) {
            k3 k3Var3 = new k3((k3) layoutParams);
            k3Var3.b = 0;
            return k3Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            k3 k3Var4 = new k3(layoutParams);
            k3Var4.b = 0;
            return k3Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        k3 k3Var5 = new k3(marginLayoutParams);
        k3Var5.b = 0;
        ((ViewGroup.MarginLayoutParams) k3Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) k3Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) k3Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) k3Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return k3Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i10, ArrayList arrayList) {
        WeakHashMap weakHashMap = i0.a;
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection());
        arrayList.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                k3 k3Var = (k3) childAt.getLayoutParams();
                if (k3Var.b == 0 && s(childAt)) {
                    int i12 = k3Var.a;
                    WeakHashMap weakHashMap2 = i0.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i12, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i13 = childCount - 1; i13 >= 0; i13--) {
            View childAt2 = getChildAt(i13);
            k3 k3Var2 = (k3) childAt2.getLayoutParams();
            if (k3Var2.b == 0 && s(childAt2)) {
                int i14 = k3Var2.a;
                WeakHashMap weakHashMap3 = i0.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i14, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        k3 h = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (k3) layoutParams;
        h.b = 1;
        if (!z10 || this.r == null) {
            addView(view, h);
        } else {
            view.setLayoutParams(h);
            this.U.add(view);
        }
    }

    public final void c() {
        if (this.n == null) {
            v vVar = new v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.n = vVar;
            vVar.setImageDrawable(this.f);
            this.n.setContentDescription(this.h);
            k3 h = h();
            h.a = (this.y & 112) | 8388611;
            h.b = 2;
            this.n.setLayoutParams(h);
            this.n.setOnClickListener(new androidx.mediarouter.app.w(this, 7));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof k3);
    }

    public final void d() {
        if (this.J == null) {
            p2 p2Var = new p2();
            p2Var.a = 0;
            p2Var.b = 0;
            p2Var.c = TLObject.FLAG_31;
            p2Var.d = TLObject.FLAG_31;
            p2Var.e = 0;
            p2Var.f = 0;
            p2Var.g = false;
            p2Var.h = false;
            this.J = p2Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.F == null) {
            k kVar = (k) actionMenuView.getMenu();
            if (this.e0 == null) {
                this.e0 = new j3(this);
            }
            this.a.setExpandedActionViewsExclusive(true);
            kVar.b(this.e0, this.s);
            t();
        }
    }

    public final void f() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.setPopupTheme(this.v);
            this.a.setOnMenuItemClickListener(this.b0);
            ActionMenuView actionMenuView2 = this.a;
            w0 w0Var = new w0(this, 5);
            actionMenuView2.getClass();
            actionMenuView2.K = w0Var;
            k3 h = h();
            h.a = (this.y & 112) | 8388613;
            this.a.setLayoutParams(h);
            b(this.a, false);
        }
    }

    public final void g() {
        if (this.d == null) {
            this.d = new v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            k3 h = h();
            h.a = (this.y & 112) | 8388611;
            this.d.setLayoutParams(h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        v vVar = this.n;
        if (vVar != null) {
            return vVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        v vVar = this.n;
        if (vVar != null) {
            return vVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        p2 p2Var = this.J;
        if (p2Var != null) {
            return p2Var.g ? p2Var.a : p2Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.L;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        p2 p2Var = this.J;
        if (p2Var != null) {
            return p2Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        p2 p2Var = this.J;
        if (p2Var != null) {
            return p2Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        p2 p2Var = this.J;
        if (p2Var != null) {
            return p2Var.g ? p2Var.b : p2Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.K;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        k kVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (kVar = actionMenuView.F) == null || !kVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.L, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = i0.a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = i0.a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.K, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        w wVar = this.e;
        if (wVar != null) {
            return wVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        w wVar = this.e;
        if (wVar != null) {
            return wVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.a.getMenu();
    }

    public View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        v vVar = this.d;
        if (vVar != null) {
            return vVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        v vVar = this.d;
        if (vVar != null) {
            return vVar.getDrawable();
        }
        return null;
    }

    public i getOuterActionMenuPresenter() {
        return this.d0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.s;
    }

    public int getPopupTheme() {
        return this.v;
    }

    public CharSequence getSubtitle() {
        return this.O;
    }

    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.N;
    }

    public int getTitleMarginBottom() {
        return this.I;
    }

    public int getTitleMarginEnd() {
        return this.G;
    }

    public int getTitleMarginStart() {
        return this.F;
    }

    public int getTitleMarginTop() {
        return this.H;
    }

    public final TextView getTitleTextView() {
        return this.b;
    }

    public l1 getWrapper() {
        Drawable drawable;
        if (this.c0 == null) {
            o3 o3Var = new o3();
            o3Var.n = 0;
            o3Var.a = this;
            o3Var.h = getTitle();
            o3Var.i = getSubtitle();
            o3Var.g = o3Var.h != null;
            o3Var.f = getNavigationIcon();
            g3 P = g3.P(getContext(), null, f.a.a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) P.c;
            o3Var.o = P.F(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                o3Var.g = true;
                o3Var.h = text;
                if ((o3Var.b & 8) != 0) {
                    setTitle(text);
                    if (o3Var.g) {
                        i0.k(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                o3Var.i = text2;
                if ((o3Var.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable F = P.F(20);
            if (F != null) {
                o3Var.e = F;
                o3Var.c();
            }
            Drawable F2 = P.F(17);
            if (F2 != null) {
                o3Var.d = F2;
                o3Var.c();
            }
            if (o3Var.f == null && (drawable = o3Var.o) != null) {
                o3Var.f = drawable;
                if ((o3Var.b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            o3Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = o3Var.c;
                if (view != null && (o3Var.b & 16) != 0) {
                    removeView(view);
                }
                o3Var.c = inflate;
                if (inflate != null && (o3Var.b & 16) != 0) {
                    addView(inflate);
                }
                o3Var.a(o3Var.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.J.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.w = resourceId2;
                a1 a1Var = this.b;
                if (a1Var != null) {
                    a1Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.x = resourceId3;
                a1 a1Var2 = this.c;
                if (a1Var2 != null) {
                    a1Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            P.Q();
            if (R.string.abc_action_bar_up_description != o3Var.n) {
                o3Var.n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i10 = o3Var.n;
                    o3Var.j = i10 != 0 ? getContext().getString(i10) : null;
                    o3Var.b();
                }
            }
            o3Var.j = getNavigationContentDescription();
            setNavigationOnClickListener(new n3(o3Var));
            this.c0 = o3Var;
        }
        return this.c0;
    }

    public final int j(int i10, View view) {
        k3 k3Var = (k3) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int i12 = k3Var.a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.M & 112;
        }
        if (i12 == 48) {
            return getPaddingTop() - i11;
        }
        if (i12 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) k3Var).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i13 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i14 = ((ViewGroup.MarginLayoutParams) k3Var).topMargin;
        if (i13 < i14) {
            i13 = i14;
        } else {
            int i15 = (((height - paddingBottom) - measuredHeight) - i13) - paddingTop;
            int i16 = ((ViewGroup.MarginLayoutParams) k3Var).bottomMargin;
            if (i15 < i16) {
                i13 = Math.max(0, i13 - (i16 - i15));
            }
        }
        return paddingTop + i13;
    }

    public final void m() {
        ArrayList arrayList = this.a0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.W.c).iterator();
        while (it.hasNext()) {
            ((b0) it.next()).a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.a0 = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.U.contains(view);
    }

    public final int o(View view, int i10, int i11, int[] iArr) {
        k3 k3Var = (k3) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) k3Var).leftMargin - iArr[0];
        int max = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int j10 = j(i11, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j10, max + measuredWidth, view.getMeasuredHeight() + j10);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) k3Var).rightMargin + max;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.j0);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.S = false;
        }
        if (!this.S) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.S = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.S = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028f A[LOOP:0: B:39:0x028d->B:40:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a7 A[LOOP:1: B:43:0x02a5->B:44:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c7 A[LOOP:2: B:47:0x02c5->B:48:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x031a A[LOOP:3: B:56:0x0318->B:57:0x031a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int max;
        boolean s10;
        boolean s11;
        boolean z11;
        int i16;
        int i17;
        int paddingTop;
        int i18;
        int i19;
        int i20;
        int i21;
        int size;
        int i22;
        int i23;
        int size2;
        int i24;
        int size3;
        int i25;
        int i26;
        int i27;
        int size4;
        WeakHashMap weakHashMap = i0.a;
        boolean z12 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i28 = width - paddingRight;
        int[] iArr = this.V;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i13 - i11) : 0;
        if (!s(this.d)) {
            i14 = paddingLeft;
        } else {
            if (z12) {
                i15 = p(this.d, i28, min, iArr);
                i14 = paddingLeft;
                if (s(this.n)) {
                    if (z12) {
                        i15 = p(this.n, i15, min, iArr);
                    } else {
                        i14 = o(this.n, i14, min, iArr);
                    }
                }
                if (s(this.a)) {
                    if (z12) {
                        i14 = o(this.a, i14, min, iArr);
                    } else {
                        i15 = p(this.a, i15, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i14);
                iArr[1] = Math.max(0, currentContentInsetRight - (i28 - i15));
                max = Math.max(i14, currentContentInsetLeft);
                int min2 = Math.min(i15, i28 - currentContentInsetRight);
                if (s(this.r)) {
                    if (z12) {
                        min2 = p(this.r, min2, min, iArr);
                    } else {
                        max = o(this.r, max, min, iArr);
                    }
                }
                if (s(this.e)) {
                    if (z12) {
                        min2 = p(this.e, min2, min, iArr);
                    } else {
                        max = o(this.e, max, min, iArr);
                    }
                }
                s10 = s(this.b);
                s11 = s(this.c);
                if (s10) {
                    z11 = z12;
                    i16 = 0;
                } else {
                    k3 k3Var = (k3) this.b.getLayoutParams();
                    z11 = z12;
                    i16 = this.b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) k3Var).topMargin + ((ViewGroup.MarginLayoutParams) k3Var).bottomMargin;
                }
                if (!s11) {
                    k3 k3Var2 = (k3) this.c.getLayoutParams();
                    i16 = this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) k3Var2).topMargin + ((ViewGroup.MarginLayoutParams) k3Var2).bottomMargin + i16;
                }
                if (!s10 || s11) {
                    a1 a1Var = !s10 ? this.b : this.c;
                    a1 a1Var2 = !s11 ? this.c : this.b;
                    k3 k3Var3 = (k3) a1Var.getLayoutParams();
                    k3 k3Var4 = (k3) a1Var2.getLayoutParams();
                    int i29 = i16;
                    boolean z13 = (!s10 && this.b.getMeasuredWidth() > 0) || (s11 && this.c.getMeasuredWidth() > 0);
                    i17 = this.M & 112;
                    int i30 = max;
                    if (i17 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) k3Var3).topMargin + this.H;
                    } else if (i17 != 80) {
                        int i31 = (((height - paddingTop2) - paddingBottom) - i29) / 2;
                        int i32 = ((ViewGroup.MarginLayoutParams) k3Var3).topMargin + this.H;
                        if (i31 < i32) {
                            i31 = i32;
                        } else {
                            int i33 = (((height - paddingBottom) - i29) - i31) - paddingTop2;
                            int i34 = ((ViewGroup.MarginLayoutParams) k3Var3).bottomMargin;
                            int i35 = this.I;
                            if (i33 < i34 + i35) {
                                i31 = Math.max(0, i31 - ((((ViewGroup.MarginLayoutParams) k3Var4).bottomMargin + i35) - i33));
                            }
                        }
                        paddingTop = paddingTop2 + i31;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) k3Var4).bottomMargin) - this.I) - i29;
                    }
                    if (z11) {
                        int i36 = (z13 ? this.F : 0) - iArr[0];
                        max = Math.max(0, i36) + i30;
                        iArr[0] = Math.max(0, -i36);
                        if (s10) {
                            k3 k3Var5 = (k3) this.b.getLayoutParams();
                            int measuredWidth = this.b.getMeasuredWidth() + max;
                            int measuredHeight = this.b.getMeasuredHeight() + paddingTop;
                            this.b.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i18 = measuredWidth + this.G;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) k3Var5).bottomMargin;
                        } else {
                            i18 = max;
                        }
                        if (s11) {
                            int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((k3) this.c.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.c.getMeasuredWidth() + max;
                            this.c.layout(max, i37, measuredWidth2, this.c.getMeasuredHeight() + i37);
                            i19 = measuredWidth2 + this.G;
                        } else {
                            i19 = max;
                        }
                        if (z13) {
                            max = Math.max(i18, i19);
                        }
                    } else {
                        int i38 = (z13 ? this.F : 0) - iArr[1];
                        min2 -= Math.max(0, i38);
                        iArr[1] = Math.max(0, -i38);
                        if (s10) {
                            k3 k3Var6 = (k3) this.b.getLayoutParams();
                            int measuredWidth3 = min2 - this.b.getMeasuredWidth();
                            int measuredHeight2 = this.b.getMeasuredHeight() + paddingTop;
                            this.b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i20 = measuredWidth3 - this.G;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) k3Var6).bottomMargin;
                        } else {
                            i20 = min2;
                        }
                        if (s11) {
                            int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((k3) this.c.getLayoutParams())).topMargin;
                            this.c.layout(min2 - this.c.getMeasuredWidth(), i39, min2, this.c.getMeasuredHeight() + i39);
                            i21 = min2 - this.G;
                        } else {
                            i21 = min2;
                        }
                        if (z13) {
                            min2 = Math.min(i20, i21);
                        }
                        max = i30;
                    }
                }
                ArrayList arrayList = this.T;
                a(3, arrayList);
                size = arrayList.size();
                i22 = max;
                for (i23 = 0; i23 < size; i23++) {
                    i22 = o((View) arrayList.get(i23), i22, min, iArr);
                }
                a(5, arrayList);
                size2 = arrayList.size();
                for (i24 = 0; i24 < size2; i24++) {
                    min2 = p((View) arrayList.get(i24), min2, min, iArr);
                }
                a(1, arrayList);
                int i40 = iArr[0];
                int i41 = iArr[1];
                size3 = arrayList.size();
                int i42 = i40;
                i25 = 0;
                int i43 = 0;
                while (i25 < size3) {
                    View view = (View) arrayList.get(i25);
                    k3 k3Var7 = (k3) view.getLayoutParams();
                    int i44 = i41;
                    int i45 = ((ViewGroup.MarginLayoutParams) k3Var7).leftMargin - i42;
                    int i46 = ((ViewGroup.MarginLayoutParams) k3Var7).rightMargin - i44;
                    int max2 = Math.max(0, i45);
                    int max3 = Math.max(0, i46);
                    int max4 = Math.max(0, -i45);
                    int max5 = Math.max(0, -i46);
                    i43 += view.getMeasuredWidth() + max2 + max3;
                    i25++;
                    i42 = max4;
                    i41 = max5;
                }
                i27 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i43 / 2);
                int i47 = i43 + i27;
                if (i27 >= i22) {
                    i22 = i47 > min2 ? i27 - (i47 - min2) : i27;
                }
                size4 = arrayList.size();
                for (i26 = 0; i26 < size4; i26++) {
                    i22 = o((View) arrayList.get(i26), i22, min, iArr);
                }
                arrayList.clear();
            }
            i14 = o(this.d, paddingLeft, min, iArr);
        }
        i15 = i28;
        if (s(this.n)) {
        }
        if (s(this.a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i14);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i28 - i15));
        max = Math.max(i14, currentContentInsetLeft2);
        int min22 = Math.min(i15, i28 - currentContentInsetRight2);
        if (s(this.r)) {
        }
        if (s(this.e)) {
        }
        s10 = s(this.b);
        s11 = s(this.c);
        if (s10) {
        }
        if (!s11) {
        }
        if (!s10) {
        }
        if (!s10) {
        }
        if (!s11) {
        }
        k3 k3Var32 = (k3) a1Var.getLayoutParams();
        k3 k3Var42 = (k3) a1Var2.getLayoutParams();
        int i292 = i16;
        if (s10) {
        }
        i17 = this.M & 112;
        int i302 = max;
        if (i17 != 48) {
        }
        if (z11) {
        }
        ArrayList arrayList2 = this.T;
        a(3, arrayList2);
        size = arrayList2.size();
        i22 = max;
        while (i23 < size) {
        }
        a(5, arrayList2);
        size2 = arrayList2.size();
        while (i24 < size2) {
        }
        a(1, arrayList2);
        int i402 = iArr[0];
        int i412 = iArr[1];
        size3 = arrayList2.size();
        int i422 = i402;
        i25 = 0;
        int i432 = 0;
        while (i25 < size3) {
        }
        i27 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i432 / 2);
        int i472 = i432 + i27;
        if (i27 >= i22) {
        }
        size4 = arrayList2.size();
        while (i26 < size4) {
        }
        arrayList2.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean a2 = v3.a(this);
        int i19 = !a2 ? 1 : 0;
        int i20 = 0;
        if (s(this.d)) {
            r(this.d, i10, 0, i11, this.E);
            i12 = k(this.d) + this.d.getMeasuredWidth();
            i13 = Math.max(0, l(this.d) + this.d.getMeasuredHeight());
            i14 = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (s(this.n)) {
            r(this.n, i10, 0, i11, this.E);
            i12 = k(this.n) + this.n.getMeasuredWidth();
            i13 = Math.max(i13, l(this.n) + this.n.getMeasuredHeight());
            i14 = View.combineMeasuredStates(i14, this.n.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i12);
        int max2 = Math.max(0, currentContentInsetStart - i12);
        int[] iArr = this.V;
        iArr[a2 ? 1 : 0] = max2;
        if (s(this.a)) {
            r(this.a, i10, max, i11, this.E);
            i15 = k(this.a) + this.a.getMeasuredWidth();
            i13 = Math.max(i13, l(this.a) + this.a.getMeasuredHeight());
            i14 = View.combineMeasuredStates(i14, this.a.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i15);
        iArr[i19] = Math.max(0, currentContentInsetEnd - i15);
        if (s(this.r)) {
            max3 += q(this.r, i10, max3, i11, 0, iArr);
            i13 = Math.max(i13, l(this.r) + this.r.getMeasuredHeight());
            i14 = View.combineMeasuredStates(i14, this.r.getMeasuredState());
        }
        if (s(this.e)) {
            max3 += q(this.e, i10, max3, i11, 0, iArr);
            i13 = Math.max(i13, l(this.e) + this.e.getMeasuredHeight());
            i14 = View.combineMeasuredStates(i14, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (((k3) childAt.getLayoutParams()).b == 0 && s(childAt)) {
                max3 += q(childAt, i10, max3, i11, 0, iArr);
                int max4 = Math.max(i13, l(childAt) + childAt.getMeasuredHeight());
                i14 = View.combineMeasuredStates(i14, childAt.getMeasuredState());
                i13 = max4;
            } else {
                max3 = max3;
            }
        }
        int i22 = max3;
        int i23 = this.H + this.I;
        int i24 = this.F + this.G;
        if (s(this.b)) {
            q(this.b, i10, i22 + i24, i11, i23, iArr);
            int k10 = k(this.b) + this.b.getMeasuredWidth();
            i16 = l(this.b) + this.b.getMeasuredHeight();
            i17 = View.combineMeasuredStates(i14, this.b.getMeasuredState());
            i18 = k10;
        } else {
            i16 = 0;
            i17 = i14;
            i18 = 0;
        }
        if (s(this.c)) {
            i18 = Math.max(i18, q(this.c, i10, i22 + i24, i11, i23 + i16, iArr));
            i16 += l(this.c) + this.c.getMeasuredHeight();
            i17 = View.combineMeasuredStates(i17, this.c.getMeasuredState());
        }
        int max5 = Math.max(i13, i16);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i22 + i18;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, (-16777216) & i17);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, i17 << 16);
        if (this.f0) {
            int childCount2 = getChildCount();
            for (int i25 = 0; i25 < childCount2; i25++) {
                View childAt2 = getChildAt(i25);
                if (!s(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i20);
        }
        i20 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i20);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof m3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m3 m3Var = (m3) parcelable;
        super.onRestoreInstanceState(m3Var.a);
        ActionMenuView actionMenuView = this.a;
        k kVar = actionMenuView != null ? actionMenuView.F : null;
        int i10 = m3Var.c;
        if (i10 != 0 && this.e0 != null && kVar != null && (findItem = kVar.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (m3Var.d) {
            androidx.activity.i iVar = this.j0;
            removeCallbacks(iVar);
            post(iVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        d();
        p2 p2Var = this.J;
        boolean z10 = i10 == 1;
        if (z10 == p2Var.g) {
            return;
        }
        p2Var.g = z10;
        if (!p2Var.h) {
            p2Var.a = p2Var.e;
            p2Var.b = p2Var.f;
            return;
        }
        if (z10) {
            int i11 = p2Var.d;
            if (i11 == Integer.MIN_VALUE) {
                i11 = p2Var.e;
            }
            p2Var.a = i11;
            int i12 = p2Var.c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = p2Var.f;
            }
            p2Var.b = i12;
            return;
        }
        int i13 = p2Var.c;
        if (i13 == Integer.MIN_VALUE) {
            i13 = p2Var.e;
        }
        p2Var.a = i13;
        int i14 = p2Var.d;
        if (i14 == Integer.MIN_VALUE) {
            i14 = p2Var.f;
        }
        p2Var.b = i14;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        i iVar;
        m mVar;
        m3 m3Var = new m3(super.onSaveInstanceState());
        j3 j3Var = this.e0;
        if (j3Var != null && (mVar = j3Var.b) != null) {
            m3Var.c = mVar.a;
        }
        ActionMenuView actionMenuView = this.a;
        m3Var.d = (actionMenuView == null || (iVar = actionMenuView.J) == null || !iVar.g()) ? false : true;
        return m3Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.R = false;
        }
        if (!this.R) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.R = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.R = false;
        return true;
    }

    public final int p(View view, int i10, int i11, int[] iArr) {
        k3 k3Var = (k3) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) k3Var).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int j10 = j(i11, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j10, max, view.getMeasuredHeight() + j10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) k3Var).leftMargin);
    }

    public final int q(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void r(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.i0 != z10) {
            this.i0 = z10;
            t();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(q7.b(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.f0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = TLObject.FLAG_31;
        }
        if (i10 != this.L) {
            this.L = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = TLObject.FLAG_31;
        }
        if (i10 != this.K) {
            this.K = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(q7.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(q7.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.v != i10) {
            this.v = i10;
            if (i10 == 0) {
                this.s = getContext();
            } else {
                this.s = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.I = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.G = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.F = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.H = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public final void t() {
        boolean z10;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a2 = i3.a(this);
            j3 j3Var = this.e0;
            int i10 = 0;
            if (j3Var != null && j3Var.b != null && a2 != null) {
                WeakHashMap weakHashMap = i0.a;
                if (isAttachedToWindow() && this.i0) {
                    z10 = true;
                    if (!z10 && this.h0 == null) {
                        if (this.g0 == null) {
                            this.g0 = i3.b(new h3(this, i10));
                        }
                        i3.c(a2, this.g0);
                        this.h0 = a2;
                        return;
                    }
                    if (!z10 || (onBackInvokedDispatcher = this.h0) == null) {
                    }
                    i3.d(onBackInvokedDispatcher, this.g0);
                    this.h0 = null;
                    return;
                }
            }
            z10 = false;
            if (!z10) {
            }
            if (z10) {
            }
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        k3 k3Var = new k3(context, attributeSet);
        k3Var.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.b);
        k3Var.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        k3Var.b = 0;
        return k3Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        v vVar = this.n;
        if (vVar != null) {
            vVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.n.setImageDrawable(drawable);
        } else {
            v vVar = this.n;
            if (vVar != null) {
                vVar.setImageDrawable(this.f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.e == null) {
                this.e = new w(getContext(), null, 0);
            }
            if (!n(this.e)) {
                b(this.e, true);
            }
        } else {
            w wVar = this.e;
            if (wVar != null && n(wVar)) {
                removeView(this.e);
                this.U.remove(this.e);
            }
        }
        w wVar2 = this.e;
        if (wVar2 != null) {
            wVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.e == null) {
            this.e = new w(getContext(), null, 0);
        }
        w wVar = this.e;
        if (wVar != null) {
            wVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        v vVar = this.d;
        if (vVar != null) {
            vVar.setContentDescription(charSequence);
            q.a(this.d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.d)) {
                b(this.d, true);
            }
        } else {
            v vVar = this.d;
            if (vVar != null && n(vVar)) {
                removeView(this.d);
                this.U.remove(this.d);
            }
        }
        v vVar2 = this.d;
        if (vVar2 != null) {
            vVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            a1 a1Var = this.c;
            if (a1Var != null && n(a1Var)) {
                removeView(this.c);
                this.U.remove(this.c);
            }
        } else {
            if (this.c == null) {
                Context context = getContext();
                a1 a1Var2 = new a1(context, null);
                this.c = a1Var2;
                a1Var2.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.x;
                if (i10 != 0) {
                    this.c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.Q;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!n(this.c)) {
                b(this.c, true);
            }
        }
        a1 a1Var3 = this.c;
        if (a1Var3 != null) {
            a1Var3.setText(charSequence);
        }
        this.O = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.Q = colorStateList;
        a1 a1Var = this.c;
        if (a1Var != null) {
            a1Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            a1 a1Var = this.b;
            if (a1Var != null && n(a1Var)) {
                removeView(this.b);
                this.U.remove(this.b);
            }
        } else {
            if (this.b == null) {
                Context context = getContext();
                a1 a1Var2 = new a1(context, null);
                this.b = a1Var2;
                a1Var2.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.w;
                if (i10 != 0) {
                    this.b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.P;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!n(this.b)) {
                b(this.b, true);
            }
        }
        a1 a1Var3 = this.b;
        if (a1Var3 != null) {
            a1Var3.setText(charSequence);
        }
        this.N = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.P = colorStateList;
        a1 a1Var = this.b;
        if (a1Var != null) {
            a1Var.setTextColor(colorStateList);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.M = 8388627;
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = new int[2];
        int i11 = 1;
        this.W = new g3(new h3(this, i11));
        this.a0 = new ArrayList();
        this.b0 = new le.b(this, i11);
        this.j0 = new androidx.activity.i(this, 27);
        Context context2 = getContext();
        int[] iArr = f.a.x;
        g3 P = g3.P(context2, attributeSet, iArr, i10);
        i0.i(this, context, iArr, attributeSet, (TypedArray) P.c, i10);
        TypedArray typedArray = (TypedArray) P.c;
        this.w = typedArray.getResourceId(28, 0);
        this.x = typedArray.getResourceId(19, 0);
        this.M = typedArray.getInteger(0, 8388627);
        this.y = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.I = dimensionPixelOffset;
        this.H = dimensionPixelOffset;
        this.G = dimensionPixelOffset;
        this.F = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.F = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.G = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.H = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.I = dimensionPixelOffset5;
        }
        this.E = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, TLObject.FLAG_31);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, TLObject.FLAG_31);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        p2 p2Var = this.J;
        p2Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            p2Var.e = dimensionPixelSize;
            p2Var.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            p2Var.f = dimensionPixelSize2;
            p2Var.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            p2Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.K = typedArray.getDimensionPixelOffset(10, TLObject.FLAG_31);
        this.L = typedArray.getDimensionPixelOffset(6, TLObject.FLAG_31);
        this.f = P.F(4);
        this.h = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.s = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable F = P.F(16);
        if (F != null) {
            setNavigationIcon(F);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable F2 = P.F(11);
        if (F2 != null) {
            setLogo(F2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(P.E(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(P.E(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        P.Q();
    }

    public void setOnMenuItemClickListener(l3 l3Var) {
    }
}
