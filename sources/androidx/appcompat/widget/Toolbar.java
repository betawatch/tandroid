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
import androidx.fragment.app.a0;
import c8.i9;
import gf.g;
import h6.m;
import h9.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.h;
import l.k;
import m.a1;
import m.e3;
import m.f3;
import m.g3;
import m.h3;
import m.i;
import m.i3;
import m.j3;
import m.k3;
import m.l1;
import m.l3;
import m.m3;
import m.p2;
import m.t3;
import m.v;
import m.w;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ky0;
import r0.i0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public final int D;
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
    public final ky0 W;
    public ActionMenuView a;
    public ArrayList a0;
    public a1 b;
    public final g b0;
    public a1 c;
    public m3 c0;
    public v d;
    public i d0;
    public w e;
    public h3 e0;
    public final Drawable f;
    public boolean f0;
    public OnBackInvokedCallback g0;
    public final CharSequence h;
    public OnBackInvokedDispatcher h0;
    public boolean i0;
    public final f3 j0;
    public v n;
    public View r;
    public Context s;
    public int w;
    public int x;
    public int y;

    public Toolbar(Context context) {
        this(context, null);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i7 = 0; i7 < menu.size(); i7++) {
            arrayList.add(menu.getItem(i7));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h(getContext());
    }

    public static i3 h() {
        i3 i3Var = new i3(-2, -2);
        i3Var.b = 0;
        i3Var.a = 8388627;
        return i3Var;
    }

    public static i3 i(ViewGroup.LayoutParams layoutParams) {
        boolean z9 = layoutParams instanceof i3;
        if (z9) {
            i3 i3Var = (i3) layoutParams;
            i3 i3Var2 = new i3(i3Var);
            i3Var2.b = 0;
            i3Var2.b = i3Var.b;
            return i3Var2;
        }
        if (z9) {
            i3 i3Var3 = new i3((i3) layoutParams);
            i3Var3.b = 0;
            return i3Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            i3 i3Var4 = new i3(layoutParams);
            i3Var4.b = 0;
            return i3Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        i3 i3Var5 = new i3(marginLayoutParams);
        i3Var5.b = 0;
        ((ViewGroup.MarginLayoutParams) i3Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) i3Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) i3Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) i3Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return i3Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i7, ArrayList arrayList) {
        WeakHashMap weakHashMap = i0.a;
        boolean z9 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, getLayoutDirection());
        arrayList.clear();
        if (!z9) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                i3 i3Var = (i3) childAt.getLayoutParams();
                if (i3Var.b == 0 && s(childAt)) {
                    int i11 = i3Var.a;
                    WeakHashMap weakHashMap2 = i0.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i11, layoutDirection) & 7;
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
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            i3 i3Var2 = (i3) childAt2.getLayoutParams();
            if (i3Var2.b == 0 && s(childAt2)) {
                int i13 = i3Var2.a;
                WeakHashMap weakHashMap3 = i0.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i13, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z9) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        i3 h = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (i3) layoutParams;
        h.b = 1;
        if (!z9 || this.r == null) {
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
            i3 h = h();
            h.a = (this.D & qs.x1) | 8388611;
            h.b = 2;
            this.n.setLayoutParams(h);
            this.n.setOnClickListener(new androidx.mediarouter.app.w(this, 7));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof i3);
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
                this.e0 = new h3(this);
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
            actionMenuView.setPopupTheme(this.w);
            this.a.setOnMenuItemClickListener(this.b0);
            ActionMenuView actionMenuView2 = this.a;
            f1 f1Var = new f1(this, 13);
            actionMenuView2.getClass();
            actionMenuView2.K = f1Var;
            i3 h = h();
            h.a = (this.D & qs.x1) | 8388613;
            this.a.setLayoutParams(h);
            b(this.a, false);
        }
    }

    public final void g() {
        if (this.d == null) {
            this.d = new v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            i3 h = h();
            h.a = (this.D & qs.x1) | 8388611;
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
        int i7 = this.L;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetEnd();
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
        int i7 = this.K;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetStart();
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
        return this.w;
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
            m3 m3Var = new m3();
            m3Var.n = 0;
            m3Var.a = this;
            m3Var.h = getTitle();
            m3Var.i = getSubtitle();
            m3Var.g = m3Var.h != null;
            m3Var.f = getNavigationIcon();
            m x10 = m.x(getContext(), null, f.a.a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) x10.c;
            m3Var.o = x10.p(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                m3Var.g = true;
                m3Var.h = text;
                if ((m3Var.b & 8) != 0) {
                    setTitle(text);
                    if (m3Var.g) {
                        i0.k(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                m3Var.i = text2;
                if ((m3Var.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable p10 = x10.p(20);
            if (p10 != null) {
                m3Var.e = p10;
                m3Var.c();
            }
            Drawable p11 = x10.p(17);
            if (p11 != null) {
                m3Var.d = p11;
                m3Var.c();
            }
            if (m3Var.f == null && (drawable = m3Var.o) != null) {
                m3Var.f = drawable;
                if ((m3Var.b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            m3Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = m3Var.c;
                if (view != null && (m3Var.b & 16) != 0) {
                    removeView(view);
                }
                m3Var.c = inflate;
                if (inflate != null && (m3Var.b & 16) != 0) {
                    addView(inflate);
                }
                m3Var.a(m3Var.b | 16);
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
                this.x = resourceId2;
                a1 a1Var = this.b;
                if (a1Var != null) {
                    a1Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.y = resourceId3;
                a1 a1Var2 = this.c;
                if (a1Var2 != null) {
                    a1Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            x10.C();
            if (R.string.abc_action_bar_up_description != m3Var.n) {
                m3Var.n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i7 = m3Var.n;
                    m3Var.j = i7 != 0 ? getContext().getString(i7) : null;
                    m3Var.b();
                }
            }
            m3Var.j = getNavigationContentDescription();
            setNavigationOnClickListener(new l3(m3Var));
            this.c0 = m3Var;
        }
        return this.c0;
    }

    public final int j(int i7, View view) {
        i3 i3Var = (i3) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i7 > 0 ? (measuredHeight - i7) / 2 : 0;
        int i11 = i3Var.a & qs.x1;
        if (i11 != 16 && i11 != 48 && i11 != 80) {
            i11 = this.M & qs.x1;
        }
        if (i11 == 48) {
            return getPaddingTop() - i10;
        }
        if (i11 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) i3Var).bottomMargin) - i10;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) i3Var).topMargin;
        if (i12 < i13) {
            i12 = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) i3Var).bottomMargin;
            if (i14 < i15) {
                i12 = Math.max(0, i12 - (i15 - i14));
            }
        }
        return paddingTop + i12;
    }

    public final void m() {
        ArrayList arrayList = this.a0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.W.c).iterator();
        while (it.hasNext()) {
            ((a0) it.next()).a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.a0 = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.U.contains(view);
    }

    public final int o(View view, int i7, int i10, int[] iArr) {
        i3 i3Var = (i3) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) i3Var).leftMargin - iArr[0];
        int max = Math.max(0, i11) + i7;
        iArr[0] = Math.max(0, -i11);
        int j3 = j(i10, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j3, max + measuredWidth, view.getMeasuredHeight() + j3);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) i3Var).rightMargin + max;
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int max;
        boolean s5;
        boolean s9;
        boolean z10;
        int i15;
        int i16;
        int paddingTop;
        int i17;
        int i18;
        int i19;
        int i20;
        int size;
        int i21;
        int i22;
        int size2;
        int i23;
        int size3;
        int i24;
        int i25;
        int i26;
        int size4;
        WeakHashMap weakHashMap = i0.a;
        boolean z11 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i27 = width - paddingRight;
        int[] iArr = this.V;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i12 - i10) : 0;
        if (!s(this.d)) {
            i13 = paddingLeft;
        } else {
            if (z11) {
                i14 = p(this.d, i27, min, iArr);
                i13 = paddingLeft;
                if (s(this.n)) {
                    if (z11) {
                        i14 = p(this.n, i14, min, iArr);
                    } else {
                        i13 = o(this.n, i13, min, iArr);
                    }
                }
                if (s(this.a)) {
                    if (z11) {
                        i13 = o(this.a, i13, min, iArr);
                    } else {
                        i14 = p(this.a, i14, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i13);
                iArr[1] = Math.max(0, currentContentInsetRight - (i27 - i14));
                max = Math.max(i13, currentContentInsetLeft);
                int min2 = Math.min(i14, i27 - currentContentInsetRight);
                if (s(this.r)) {
                    if (z11) {
                        min2 = p(this.r, min2, min, iArr);
                    } else {
                        max = o(this.r, max, min, iArr);
                    }
                }
                if (s(this.e)) {
                    if (z11) {
                        min2 = p(this.e, min2, min, iArr);
                    } else {
                        max = o(this.e, max, min, iArr);
                    }
                }
                s5 = s(this.b);
                s9 = s(this.c);
                if (s5) {
                    z10 = z11;
                    i15 = 0;
                } else {
                    i3 i3Var = (i3) this.b.getLayoutParams();
                    z10 = z11;
                    i15 = this.b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) i3Var).topMargin + ((ViewGroup.MarginLayoutParams) i3Var).bottomMargin;
                }
                if (!s9) {
                    i3 i3Var2 = (i3) this.c.getLayoutParams();
                    i15 = this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) i3Var2).topMargin + ((ViewGroup.MarginLayoutParams) i3Var2).bottomMargin + i15;
                }
                if (!s5 || s9) {
                    a1 a1Var = !s5 ? this.b : this.c;
                    a1 a1Var2 = !s9 ? this.c : this.b;
                    i3 i3Var3 = (i3) a1Var.getLayoutParams();
                    i3 i3Var4 = (i3) a1Var2.getLayoutParams();
                    int i28 = i15;
                    boolean z12 = (!s5 && this.b.getMeasuredWidth() > 0) || (s9 && this.c.getMeasuredWidth() > 0);
                    i16 = this.M & qs.x1;
                    int i29 = max;
                    if (i16 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) i3Var3).topMargin + this.H;
                    } else if (i16 != 80) {
                        int i30 = (((height - paddingTop2) - paddingBottom) - i28) / 2;
                        int i31 = ((ViewGroup.MarginLayoutParams) i3Var3).topMargin + this.H;
                        if (i30 < i31) {
                            i30 = i31;
                        } else {
                            int i32 = (((height - paddingBottom) - i28) - i30) - paddingTop2;
                            int i33 = ((ViewGroup.MarginLayoutParams) i3Var3).bottomMargin;
                            int i34 = this.I;
                            if (i32 < i33 + i34) {
                                i30 = Math.max(0, i30 - ((((ViewGroup.MarginLayoutParams) i3Var4).bottomMargin + i34) - i32));
                            }
                        }
                        paddingTop = paddingTop2 + i30;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) i3Var4).bottomMargin) - this.I) - i28;
                    }
                    if (z10) {
                        int i35 = (z12 ? this.F : 0) - iArr[0];
                        max = Math.max(0, i35) + i29;
                        iArr[0] = Math.max(0, -i35);
                        if (s5) {
                            i3 i3Var5 = (i3) this.b.getLayoutParams();
                            int measuredWidth = this.b.getMeasuredWidth() + max;
                            int measuredHeight = this.b.getMeasuredHeight() + paddingTop;
                            this.b.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i17 = measuredWidth + this.G;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) i3Var5).bottomMargin;
                        } else {
                            i17 = max;
                        }
                        if (s9) {
                            int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((i3) this.c.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.c.getMeasuredWidth() + max;
                            this.c.layout(max, i36, measuredWidth2, this.c.getMeasuredHeight() + i36);
                            i18 = measuredWidth2 + this.G;
                        } else {
                            i18 = max;
                        }
                        if (z12) {
                            max = Math.max(i17, i18);
                        }
                    } else {
                        int i37 = (z12 ? this.F : 0) - iArr[1];
                        min2 -= Math.max(0, i37);
                        iArr[1] = Math.max(0, -i37);
                        if (s5) {
                            i3 i3Var6 = (i3) this.b.getLayoutParams();
                            int measuredWidth3 = min2 - this.b.getMeasuredWidth();
                            int measuredHeight2 = this.b.getMeasuredHeight() + paddingTop;
                            this.b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i19 = measuredWidth3 - this.G;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) i3Var6).bottomMargin;
                        } else {
                            i19 = min2;
                        }
                        if (s9) {
                            int i38 = paddingTop + ((ViewGroup.MarginLayoutParams) ((i3) this.c.getLayoutParams())).topMargin;
                            this.c.layout(min2 - this.c.getMeasuredWidth(), i38, min2, this.c.getMeasuredHeight() + i38);
                            i20 = min2 - this.G;
                        } else {
                            i20 = min2;
                        }
                        if (z12) {
                            min2 = Math.min(i19, i20);
                        }
                        max = i29;
                    }
                }
                ArrayList arrayList = this.T;
                a(3, arrayList);
                size = arrayList.size();
                i21 = max;
                for (i22 = 0; i22 < size; i22++) {
                    i21 = o((View) arrayList.get(i22), i21, min, iArr);
                }
                a(5, arrayList);
                size2 = arrayList.size();
                for (i23 = 0; i23 < size2; i23++) {
                    min2 = p((View) arrayList.get(i23), min2, min, iArr);
                }
                a(1, arrayList);
                int i39 = iArr[0];
                int i40 = iArr[1];
                size3 = arrayList.size();
                int i41 = i39;
                i24 = 0;
                int i42 = 0;
                while (i24 < size3) {
                    View view = (View) arrayList.get(i24);
                    i3 i3Var7 = (i3) view.getLayoutParams();
                    int i43 = i40;
                    int i44 = ((ViewGroup.MarginLayoutParams) i3Var7).leftMargin - i41;
                    int i45 = ((ViewGroup.MarginLayoutParams) i3Var7).rightMargin - i43;
                    int max2 = Math.max(0, i44);
                    int max3 = Math.max(0, i45);
                    int max4 = Math.max(0, -i44);
                    int max5 = Math.max(0, -i45);
                    i42 += view.getMeasuredWidth() + max2 + max3;
                    i24++;
                    i41 = max4;
                    i40 = max5;
                }
                i26 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i42 / 2);
                int i46 = i42 + i26;
                if (i26 >= i21) {
                    i21 = i46 > min2 ? i26 - (i46 - min2) : i26;
                }
                size4 = arrayList.size();
                for (i25 = 0; i25 < size4; i25++) {
                    i21 = o((View) arrayList.get(i25), i21, min, iArr);
                }
                arrayList.clear();
            }
            i13 = o(this.d, paddingLeft, min, iArr);
        }
        i14 = i27;
        if (s(this.n)) {
        }
        if (s(this.a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i13);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i27 - i14));
        max = Math.max(i13, currentContentInsetLeft2);
        int min22 = Math.min(i14, i27 - currentContentInsetRight2);
        if (s(this.r)) {
        }
        if (s(this.e)) {
        }
        s5 = s(this.b);
        s9 = s(this.c);
        if (s5) {
        }
        if (!s9) {
        }
        if (!s5) {
        }
        if (!s5) {
        }
        if (!s9) {
        }
        i3 i3Var32 = (i3) a1Var.getLayoutParams();
        i3 i3Var42 = (i3) a1Var2.getLayoutParams();
        int i282 = i15;
        if (s5) {
        }
        i16 = this.M & qs.x1;
        int i292 = max;
        if (i16 != 48) {
        }
        if (z10) {
        }
        ArrayList arrayList2 = this.T;
        a(3, arrayList2);
        size = arrayList2.size();
        i21 = max;
        while (i22 < size) {
        }
        a(5, arrayList2);
        size2 = arrayList2.size();
        while (i23 < size2) {
        }
        a(1, arrayList2);
        int i392 = iArr[0];
        int i402 = iArr[1];
        size3 = arrayList2.size();
        int i412 = i392;
        i24 = 0;
        int i422 = 0;
        while (i24 < size3) {
        }
        i26 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i422 / 2);
        int i462 = i422 + i26;
        if (i26 >= i21) {
        }
        size4 = arrayList2.size();
        while (i25 < size4) {
        }
        arrayList2.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean a10 = t3.a(this);
        int i18 = !a10 ? 1 : 0;
        int i19 = 0;
        if (s(this.d)) {
            r(this.d, i7, 0, i10, this.E);
            i11 = k(this.d) + this.d.getMeasuredWidth();
            i12 = Math.max(0, l(this.d) + this.d.getMeasuredHeight());
            i13 = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        if (s(this.n)) {
            r(this.n, i7, 0, i10, this.E);
            i11 = k(this.n) + this.n.getMeasuredWidth();
            i12 = Math.max(i12, l(this.n) + this.n.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.n.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i11);
        int max2 = Math.max(0, currentContentInsetStart - i11);
        int[] iArr = this.V;
        iArr[a10 ? 1 : 0] = max2;
        if (s(this.a)) {
            r(this.a, i7, max, i10, this.E);
            i14 = k(this.a) + this.a.getMeasuredWidth();
            i12 = Math.max(i12, l(this.a) + this.a.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.a.getMeasuredState());
        } else {
            i14 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i14);
        iArr[i18] = Math.max(0, currentContentInsetEnd - i14);
        if (s(this.r)) {
            max3 += q(this.r, i7, max3, i10, 0, iArr);
            i12 = Math.max(i12, l(this.r) + this.r.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.r.getMeasuredState());
        }
        if (s(this.e)) {
            max3 += q(this.e, i7, max3, i10, 0, iArr);
            i12 = Math.max(i12, l(this.e) + this.e.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (((i3) childAt.getLayoutParams()).b == 0 && s(childAt)) {
                max3 += q(childAt, i7, max3, i10, 0, iArr);
                int max4 = Math.max(i12, l(childAt) + childAt.getMeasuredHeight());
                i13 = View.combineMeasuredStates(i13, childAt.getMeasuredState());
                i12 = max4;
            } else {
                max3 = max3;
            }
        }
        int i21 = max3;
        int i22 = this.H + this.I;
        int i23 = this.F + this.G;
        if (s(this.b)) {
            q(this.b, i7, i21 + i23, i10, i22, iArr);
            int k10 = k(this.b) + this.b.getMeasuredWidth();
            i15 = l(this.b) + this.b.getMeasuredHeight();
            i16 = View.combineMeasuredStates(i13, this.b.getMeasuredState());
            i17 = k10;
        } else {
            i15 = 0;
            i16 = i13;
            i17 = 0;
        }
        if (s(this.c)) {
            i17 = Math.max(i17, q(this.c, i7, i21 + i23, i10, i22 + i15, iArr));
            i15 += l(this.c) + this.c.getMeasuredHeight();
            i16 = View.combineMeasuredStates(i16, this.c.getMeasuredState());
        }
        int max5 = Math.max(i12, i15);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i21 + i17;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i7, (-16777216) & i16);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, i16 << 16);
        if (this.f0) {
            int childCount2 = getChildCount();
            for (int i24 = 0; i24 < childCount2; i24++) {
                View childAt2 = getChildAt(i24);
                if (!s(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i19);
        }
        i19 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i19);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof k3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k3 k3Var = (k3) parcelable;
        super.onRestoreInstanceState(k3Var.a);
        ActionMenuView actionMenuView = this.a;
        k kVar = actionMenuView != null ? actionMenuView.F : null;
        int i7 = k3Var.c;
        if (i7 != 0 && this.e0 != null && kVar != null && (findItem = kVar.findItem(i7)) != null) {
            findItem.expandActionView();
        }
        if (k3Var.d) {
            f3 f3Var = this.j0;
            removeCallbacks(f3Var);
            post(f3Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        d();
        p2 p2Var = this.J;
        boolean z9 = i7 == 1;
        if (z9 == p2Var.g) {
            return;
        }
        p2Var.g = z9;
        if (!p2Var.h) {
            p2Var.a = p2Var.e;
            p2Var.b = p2Var.f;
            return;
        }
        if (z9) {
            int i10 = p2Var.d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = p2Var.e;
            }
            p2Var.a = i10;
            int i11 = p2Var.c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = p2Var.f;
            }
            p2Var.b = i11;
            return;
        }
        int i12 = p2Var.c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = p2Var.e;
        }
        p2Var.a = i12;
        int i13 = p2Var.d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = p2Var.f;
        }
        p2Var.b = i13;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        i iVar;
        l.m mVar;
        k3 k3Var = new k3(super.onSaveInstanceState());
        h3 h3Var = this.e0;
        if (h3Var != null && (mVar = h3Var.b) != null) {
            k3Var.c = mVar.a;
        }
        ActionMenuView actionMenuView = this.a;
        k3Var.d = (actionMenuView == null || (iVar = actionMenuView.J) == null || !iVar.g()) ? false : true;
        return k3Var;
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

    public final int p(View view, int i7, int i10, int[] iArr) {
        i3 i3Var = (i3) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) i3Var).rightMargin - iArr[1];
        int max = i7 - Math.max(0, i11);
        iArr[1] = Math.max(0, -i11);
        int j3 = j(i10, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j3, max, view.getMeasuredHeight() + j3);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) i3Var).leftMargin);
    }

    public final int q(View view, int i7, int i10, int i11, int i12, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i13 = marginLayoutParams.leftMargin - iArr[0];
        int i14 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i13);
        iArr[1] = Math.max(0, -i14);
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + max + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void r(View view, int i7, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i12 >= 0) {
            if (mode != 0) {
                i12 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i12);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z9) {
        if (this.i0 != z9) {
            this.i0 = z9;
            t();
        }
    }

    public void setCollapseContentDescription(int i7) {
        setCollapseContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setCollapseIcon(int i7) {
        setCollapseIcon(b5.a.b(getContext(), i7));
    }

    public void setCollapsible(boolean z9) {
        this.f0 = z9;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i7) {
        if (i7 < 0) {
            i7 = TLObject.FLAG_31;
        }
        if (i7 != this.L) {
            this.L = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i7) {
        if (i7 < 0) {
            i7 = TLObject.FLAG_31;
        }
        if (i7 != this.K) {
            this.K = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i7) {
        setLogo(b5.a.b(getContext(), i7));
    }

    public void setLogoDescription(int i7) {
        setLogoDescription(getContext().getText(i7));
    }

    public void setNavigationContentDescription(int i7) {
        setNavigationContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setNavigationIcon(int i7) {
        setNavigationIcon(b5.a.b(getContext(), i7));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i7) {
        if (this.w != i7) {
            this.w = i7;
            if (i7 == 0) {
                this.s = getContext();
            } else {
                this.s = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setSubtitle(int i7) {
        setSubtitle(getContext().getText(i7));
    }

    public void setSubtitleTextColor(int i7) {
        setSubtitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setTitle(int i7) {
        setTitle(getContext().getText(i7));
    }

    public void setTitleMarginBottom(int i7) {
        this.I = i7;
        requestLayout();
    }

    public void setTitleMarginEnd(int i7) {
        this.G = i7;
        requestLayout();
    }

    public void setTitleMarginStart(int i7) {
        this.F = i7;
        requestLayout();
    }

    public void setTitleMarginTop(int i7) {
        this.H = i7;
        requestLayout();
    }

    public void setTitleTextColor(int i7) {
        setTitleTextColor(ColorStateList.valueOf(i7));
    }

    public final void t() {
        boolean z9;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a10 = g3.a(this);
            h3 h3Var = this.e0;
            int i7 = 0;
            if (h3Var != null && h3Var.b != null && a10 != null) {
                WeakHashMap weakHashMap = i0.a;
                if (isAttachedToWindow() && this.i0) {
                    z9 = true;
                    if (!z9 && this.h0 == null) {
                        if (this.g0 == null) {
                            this.g0 = g3.b(new e3(this, i7));
                        }
                        g3.c(a10, this.g0);
                        this.h0 = a10;
                        return;
                    }
                    if (!z9 || (onBackInvokedDispatcher = this.h0) == null) {
                    }
                    g3.d(onBackInvokedDispatcher, this.g0);
                    this.h0 = null;
                    return;
                }
            }
            z9 = false;
            if (!z9) {
            }
            if (z9) {
            }
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        i3 i3Var = new i3(context, attributeSet);
        i3Var.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.b);
        i3Var.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        i3Var.b = 0;
        return i3Var;
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
            i9.a(this.d, charSequence);
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
                int i7 = this.y;
                if (i7 != 0) {
                    this.c.setTextAppearance(context, i7);
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
                int i7 = this.x;
                if (i7 != 0) {
                    this.b.setTextAppearance(context, i7);
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

    public Toolbar(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.M = 8388627;
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = new int[2];
        this.W = new ky0(new e3(this, 1));
        this.a0 = new ArrayList();
        this.b0 = new g(this, 16);
        this.j0 = new f3(this, 0);
        Context context2 = getContext();
        int[] iArr = f.a.x;
        m x10 = m.x(context2, attributeSet, iArr, i7);
        i0.i(this, context, iArr, attributeSet, (TypedArray) x10.c, i7);
        TypedArray typedArray = (TypedArray) x10.c;
        this.x = typedArray.getResourceId(28, 0);
        this.y = typedArray.getResourceId(19, 0);
        this.M = typedArray.getInteger(0, 8388627);
        this.D = typedArray.getInteger(2, 48);
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
        this.f = x10.p(4);
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
        Drawable p10 = x10.p(16);
        if (p10 != null) {
            setNavigationIcon(p10);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable p11 = x10.p(11);
        if (p11 != null) {
            setLogo(p11);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(x10.o(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(x10.o(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        x10.C();
    }

    public void setOnMenuItemClickListener(j3 j3Var) {
    }
}
