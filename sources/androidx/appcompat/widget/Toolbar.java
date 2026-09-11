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
import androidx.activity.i;
import androidx.fragment.app.a0;
import androidx.mediarouter.app.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import l.l;
import l.n;
import m.e3;
import m.f3;
import m.g3;
import m.h;
import m.h3;
import m.i3;
import m.j3;
import m.k1;
import m.k3;
import m.l3;
import m.o2;
import m.s3;
import m.u;
import m.v;
import m.z0;
import m2.t;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import r0.i0;
import v7.u7;
import w7.o;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public final int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public o2 J;
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
    public final t W;
    public ActionMenuView a;
    public ArrayList a0;
    public z0 b;
    public final l.d b0;
    public z0 c;
    public l3 c0;
    public u d;
    public h d0;
    public v e;
    public g3 e0;
    public final Drawable f;
    public boolean f0;
    public OnBackInvokedCallback g0;
    public final CharSequence h;
    public OnBackInvokedDispatcher h0;
    public boolean i0;
    public final i j0;
    public u n;
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
        return new k.h(getContext());
    }

    public static h3 h() {
        h3 h3Var = new h3(-2, -2);
        h3Var.b = 0;
        h3Var.a = 8388627;
        return h3Var;
    }

    public static h3 i(ViewGroup.LayoutParams layoutParams) {
        boolean z10 = layoutParams instanceof h3;
        if (z10) {
            h3 h3Var = (h3) layoutParams;
            h3 h3Var2 = new h3(h3Var);
            h3Var2.b = 0;
            h3Var2.b = h3Var.b;
            return h3Var2;
        }
        if (z10) {
            h3 h3Var3 = new h3((h3) layoutParams);
            h3Var3.b = 0;
            return h3Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            h3 h3Var4 = new h3(layoutParams);
            h3Var4.b = 0;
            return h3Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        h3 h3Var5 = new h3(marginLayoutParams);
        h3Var5.b = 0;
        ((ViewGroup.MarginLayoutParams) h3Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) h3Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) h3Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) h3Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return h3Var5;
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
                h3 h3Var = (h3) childAt.getLayoutParams();
                if (h3Var.b == 0 && s(childAt)) {
                    int i12 = h3Var.a;
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
            h3 h3Var2 = (h3) childAt2.getLayoutParams();
            if (h3Var2.b == 0 && s(childAt2)) {
                int i14 = h3Var2.a;
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
        h3 h = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (h3) layoutParams;
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
            u uVar = new u(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.n = uVar;
            uVar.setImageDrawable(this.f);
            this.n.setContentDescription(this.h);
            h3 h = h();
            h.a = (this.y & 112) | 8388611;
            h.b = 2;
            this.n.setLayoutParams(h);
            this.n.setOnClickListener(new x(this, 7));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof h3);
    }

    public final void d() {
        if (this.J == null) {
            o2 o2Var = new o2();
            o2Var.a = 0;
            o2Var.b = 0;
            o2Var.c = TLObject.FLAG_31;
            o2Var.d = TLObject.FLAG_31;
            o2Var.e = 0;
            o2Var.f = 0;
            o2Var.g = false;
            o2Var.h = false;
            this.J = o2Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.F == null) {
            l lVar = (l) actionMenuView.getMenu();
            if (this.e0 == null) {
                this.e0 = new g3(this);
            }
            this.a.setExpandedActionViewsExclusive(true);
            lVar.b(this.e0, this.s);
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
            xa.c cVar = new xa.c(this, 29);
            actionMenuView2.getClass();
            actionMenuView2.K = cVar;
            h3 h = h();
            h.a = (this.y & 112) | 8388613;
            this.a.setLayoutParams(h);
            b(this.a, false);
        }
    }

    public final void g() {
        if (this.d == null) {
            this.d = new u(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            h3 h = h();
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
        u uVar = this.n;
        if (uVar != null) {
            return uVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        u uVar = this.n;
        if (uVar != null) {
            return uVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        o2 o2Var = this.J;
        if (o2Var != null) {
            return o2Var.g ? o2Var.a : o2Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.L;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        o2 o2Var = this.J;
        if (o2Var != null) {
            return o2Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        o2 o2Var = this.J;
        if (o2Var != null) {
            return o2Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        o2 o2Var = this.J;
        if (o2Var != null) {
            return o2Var.g ? o2Var.b : o2Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.K;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        l lVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (lVar = actionMenuView.F) == null || !lVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.L, 0));
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
        v vVar = this.e;
        if (vVar != null) {
            return vVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        v vVar = this.e;
        if (vVar != null) {
            return vVar.getContentDescription();
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
        u uVar = this.d;
        if (uVar != null) {
            return uVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        u uVar = this.d;
        if (uVar != null) {
            return uVar.getDrawable();
        }
        return null;
    }

    public h getOuterActionMenuPresenter() {
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

    public k1 getWrapper() {
        Drawable drawable;
        if (this.c0 == null) {
            l3 l3Var = new l3();
            l3Var.n = 0;
            l3Var.a = this;
            l3Var.h = getTitle();
            l3Var.i = getSubtitle();
            l3Var.g = l3Var.h != null;
            l3Var.f = getNavigationIcon();
            aa.a y3 = aa.a.y(getContext(), null, f.a.a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) y3.c;
            l3Var.o = y3.r(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                l3Var.g = true;
                l3Var.h = text;
                if ((l3Var.b & 8) != 0) {
                    setTitle(text);
                    if (l3Var.g) {
                        i0.l(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                l3Var.i = text2;
                if ((l3Var.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable r10 = y3.r(20);
            if (r10 != null) {
                l3Var.e = r10;
                l3Var.c();
            }
            Drawable r11 = y3.r(17);
            if (r11 != null) {
                l3Var.d = r11;
                l3Var.c();
            }
            if (l3Var.f == null && (drawable = l3Var.o) != null) {
                l3Var.f = drawable;
                if ((l3Var.b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            l3Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = l3Var.c;
                if (view != null && (l3Var.b & 16) != 0) {
                    removeView(view);
                }
                l3Var.c = inflate;
                if (inflate != null && (l3Var.b & 16) != 0) {
                    addView(inflate);
                }
                l3Var.a(l3Var.b | 16);
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
                z0 z0Var = this.b;
                if (z0Var != null) {
                    z0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.x = resourceId3;
                z0 z0Var2 = this.c;
                if (z0Var2 != null) {
                    z0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            y3.A();
            if (R.string.abc_action_bar_up_description != l3Var.n) {
                l3Var.n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i10 = l3Var.n;
                    l3Var.j = i10 != 0 ? getContext().getString(i10) : null;
                    l3Var.b();
                }
            }
            l3Var.j = getNavigationContentDescription();
            setNavigationOnClickListener(new k3(l3Var));
            this.c0 = l3Var;
        }
        return this.c0;
    }

    public final int j(int i10, View view) {
        h3 h3Var = (h3) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int i12 = h3Var.a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.M & 112;
        }
        if (i12 == 48) {
            return getPaddingTop() - i11;
        }
        if (i12 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) h3Var).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i13 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i14 = ((ViewGroup.MarginLayoutParams) h3Var).topMargin;
        if (i13 < i14) {
            i13 = i14;
        } else {
            int i15 = (((height - paddingBottom) - measuredHeight) - i13) - paddingTop;
            int i16 = ((ViewGroup.MarginLayoutParams) h3Var).bottomMargin;
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
            ((a0) it.next()).a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.a0 = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.U.contains(view);
    }

    public final int o(View view, int i10, int i11, int[] iArr) {
        h3 h3Var = (h3) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) h3Var).leftMargin - iArr[0];
        int max = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int j3 = j(i11, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j3, max + measuredWidth, view.getMeasuredHeight() + j3);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) h3Var).rightMargin + max;
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
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c6 A[LOOP:2: B:47:0x02c4->B:48:0x02c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0319 A[LOOP:3: B:56:0x0317->B:57:0x0319, LOOP_END] */
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
                    h3 h3Var = (h3) this.b.getLayoutParams();
                    z11 = z12;
                    i16 = this.b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) h3Var).topMargin + ((ViewGroup.MarginLayoutParams) h3Var).bottomMargin;
                }
                if (!s11) {
                    h3 h3Var2 = (h3) this.c.getLayoutParams();
                    i16 = this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) h3Var2).topMargin + ((ViewGroup.MarginLayoutParams) h3Var2).bottomMargin + i16;
                }
                if (!s10 || s11) {
                    z0 z0Var = !s10 ? this.b : this.c;
                    z0 z0Var2 = !s11 ? this.c : this.b;
                    h3 h3Var3 = (h3) z0Var.getLayoutParams();
                    h3 h3Var4 = (h3) z0Var2.getLayoutParams();
                    int i29 = i16;
                    boolean z13 = (!s10 && this.b.getMeasuredWidth() > 0) || (s11 && this.c.getMeasuredWidth() > 0);
                    i17 = this.M & 112;
                    int i30 = max;
                    if (i17 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) h3Var3).topMargin + this.H;
                    } else if (i17 != 80) {
                        int i31 = (((height - paddingTop2) - paddingBottom) - i29) / 2;
                        int i32 = ((ViewGroup.MarginLayoutParams) h3Var3).topMargin + this.H;
                        if (i31 < i32) {
                            i31 = i32;
                        } else {
                            int i33 = (((height - paddingBottom) - i29) - i31) - paddingTop2;
                            int i34 = ((ViewGroup.MarginLayoutParams) h3Var3).bottomMargin;
                            int i35 = this.I;
                            if (i33 < i34 + i35) {
                                i31 = Math.max(0, i31 - ((((ViewGroup.MarginLayoutParams) h3Var4).bottomMargin + i35) - i33));
                            }
                        }
                        paddingTop = paddingTop2 + i31;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) h3Var4).bottomMargin) - this.I) - i29;
                    }
                    if (z11) {
                        int i36 = (z13 ? this.F : 0) - iArr[0];
                        max = Math.max(0, i36) + i30;
                        iArr[0] = Math.max(0, -i36);
                        if (s10) {
                            h3 h3Var5 = (h3) this.b.getLayoutParams();
                            int measuredWidth = this.b.getMeasuredWidth() + max;
                            int measuredHeight = this.b.getMeasuredHeight() + paddingTop;
                            this.b.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i18 = measuredWidth + this.G;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) h3Var5).bottomMargin;
                        } else {
                            i18 = max;
                        }
                        if (s11) {
                            int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((h3) this.c.getLayoutParams())).topMargin;
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
                            h3 h3Var6 = (h3) this.b.getLayoutParams();
                            int measuredWidth3 = min2 - this.b.getMeasuredWidth();
                            int measuredHeight2 = this.b.getMeasuredHeight() + paddingTop;
                            this.b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i20 = measuredWidth3 - this.G;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) h3Var6).bottomMargin;
                        } else {
                            i20 = min2;
                        }
                        if (s11) {
                            int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((h3) this.c.getLayoutParams())).topMargin;
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
                    h3 h3Var7 = (h3) view.getLayoutParams();
                    int i44 = i41;
                    int i45 = ((ViewGroup.MarginLayoutParams) h3Var7).leftMargin - i42;
                    int i46 = ((ViewGroup.MarginLayoutParams) h3Var7).rightMargin - i44;
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
        h3 h3Var32 = (h3) z0Var.getLayoutParams();
        h3 h3Var42 = (h3) z0Var2.getLayoutParams();
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
        boolean a2 = s3.a(this);
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
            if (((h3) childAt.getLayoutParams()).b == 0 && s(childAt)) {
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
            i18 = l(this.b) + this.b.getMeasuredHeight();
            i16 = View.combineMeasuredStates(i14, this.b.getMeasuredState());
            i17 = k10;
        } else {
            i16 = i14;
            i17 = 0;
            i18 = 0;
        }
        if (s(this.c)) {
            i17 = Math.max(i17, q(this.c, i10, i22 + i24, i11, i23 + i18, iArr));
            i18 += l(this.c) + this.c.getMeasuredHeight();
            i16 = View.combineMeasuredStates(i16, this.c.getMeasuredState());
        }
        int max5 = Math.max(i13, i18);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i22 + i17;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, (-16777216) & i16);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, i16 << 16);
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
        if (!(parcelable instanceof j3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j3 j3Var = (j3) parcelable;
        super.onRestoreInstanceState(j3Var.a);
        ActionMenuView actionMenuView = this.a;
        l lVar = actionMenuView != null ? actionMenuView.F : null;
        int i10 = j3Var.c;
        if (i10 != 0 && this.e0 != null && lVar != null && (findItem = lVar.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (j3Var.d) {
            i iVar = this.j0;
            removeCallbacks(iVar);
            post(iVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        d();
        o2 o2Var = this.J;
        boolean z10 = i10 == 1;
        if (z10 == o2Var.g) {
            return;
        }
        o2Var.g = z10;
        if (!o2Var.h) {
            o2Var.a = o2Var.e;
            o2Var.b = o2Var.f;
            return;
        }
        if (z10) {
            int i11 = o2Var.d;
            if (i11 == Integer.MIN_VALUE) {
                i11 = o2Var.e;
            }
            o2Var.a = i11;
            int i12 = o2Var.c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = o2Var.f;
            }
            o2Var.b = i12;
            return;
        }
        int i13 = o2Var.c;
        if (i13 == Integer.MIN_VALUE) {
            i13 = o2Var.e;
        }
        o2Var.a = i13;
        int i14 = o2Var.d;
        if (i14 == Integer.MIN_VALUE) {
            i14 = o2Var.f;
        }
        o2Var.b = i14;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        h hVar;
        n nVar;
        j3 j3Var = new j3(super.onSaveInstanceState());
        g3 g3Var = this.e0;
        if (g3Var != null && (nVar = g3Var.b) != null) {
            j3Var.c = nVar.a;
        }
        ActionMenuView actionMenuView = this.a;
        j3Var.d = (actionMenuView == null || (hVar = actionMenuView.J) == null || !hVar.g()) ? false : true;
        return j3Var;
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
        h3 h3Var = (h3) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) h3Var).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int j3 = j(i11, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j3, max, view.getMeasuredHeight() + j3);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) h3Var).leftMargin);
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
        setCollapseIcon(u7.b(getContext(), i10));
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
        setLogo(u7.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(u7.b(getContext(), i10));
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
            OnBackInvokedDispatcher a2 = f3.a(this);
            g3 g3Var = this.e0;
            int i10 = 0;
            if (g3Var != null && g3Var.b != null && a2 != null) {
                WeakHashMap weakHashMap = i0.a;
                if (isAttachedToWindow() && this.i0) {
                    z10 = true;
                    if (!z10 && this.h0 == null) {
                        if (this.g0 == null) {
                            this.g0 = f3.b(new e3(this, i10));
                        }
                        f3.c(a2, this.g0);
                        this.h0 = a2;
                        return;
                    }
                    if (!z10 || (onBackInvokedDispatcher = this.h0) == null) {
                    }
                    f3.d(onBackInvokedDispatcher, this.g0);
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
        h3 h3Var = new h3(context, attributeSet);
        h3Var.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.b);
        h3Var.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        h3Var.b = 0;
        return h3Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        u uVar = this.n;
        if (uVar != null) {
            uVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.n.setImageDrawable(drawable);
        } else {
            u uVar = this.n;
            if (uVar != null) {
                uVar.setImageDrawable(this.f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.e == null) {
                this.e = new v(getContext(), null, 0);
            }
            if (!n(this.e)) {
                b(this.e, true);
            }
        } else {
            v vVar = this.e;
            if (vVar != null && n(vVar)) {
                removeView(this.e);
                this.U.remove(this.e);
            }
        }
        v vVar2 = this.e;
        if (vVar2 != null) {
            vVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.e == null) {
            this.e = new v(getContext(), null, 0);
        }
        v vVar = this.e;
        if (vVar != null) {
            vVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        u uVar = this.d;
        if (uVar != null) {
            uVar.setContentDescription(charSequence);
            o.a(this.d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.d)) {
                b(this.d, true);
            }
        } else {
            u uVar = this.d;
            if (uVar != null && n(uVar)) {
                removeView(this.d);
                this.U.remove(this.d);
            }
        }
        u uVar2 = this.d;
        if (uVar2 != null) {
            uVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            z0 z0Var = this.c;
            if (z0Var != null && n(z0Var)) {
                removeView(this.c);
                this.U.remove(this.c);
            }
        } else {
            if (this.c == null) {
                Context context = getContext();
                z0 z0Var2 = new z0(context, null);
                this.c = z0Var2;
                z0Var2.setSingleLine();
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
        z0 z0Var3 = this.c;
        if (z0Var3 != null) {
            z0Var3.setText(charSequence);
        }
        this.O = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.Q = colorStateList;
        z0 z0Var = this.c;
        if (z0Var != null) {
            z0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            z0 z0Var = this.b;
            if (z0Var != null && n(z0Var)) {
                removeView(this.b);
                this.U.remove(this.b);
            }
        } else {
            if (this.b == null) {
                Context context = getContext();
                z0 z0Var2 = new z0(context, null);
                this.b = z0Var2;
                z0Var2.setSingleLine();
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
        z0 z0Var3 = this.b;
        if (z0Var3 != null) {
            z0Var3.setText(charSequence);
        }
        this.N = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.P = colorStateList;
        z0 z0Var = this.b;
        if (z0Var != null) {
            z0Var.setTextColor(colorStateList);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.M = 8388627;
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = new int[2];
        this.W = new t(new e3(this, 1));
        this.a0 = new ArrayList();
        this.b0 = new l.d(this, 3);
        this.j0 = new i(this, 25);
        Context context2 = getContext();
        int[] iArr = f.a.x;
        aa.a y3 = aa.a.y(context2, attributeSet, iArr, i10);
        i0.j(this, context, iArr, attributeSet, (TypedArray) y3.c, i10);
        TypedArray typedArray = (TypedArray) y3.c;
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
        o2 o2Var = this.J;
        o2Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            o2Var.e = dimensionPixelSize;
            o2Var.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            o2Var.f = dimensionPixelSize2;
            o2Var.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            o2Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.K = typedArray.getDimensionPixelOffset(10, TLObject.FLAG_31);
        this.L = typedArray.getDimensionPixelOffset(6, TLObject.FLAG_31);
        this.f = y3.r(4);
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
        Drawable r10 = y3.r(16);
        if (r10 != null) {
            setNavigationIcon(r10);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable r11 = y3.r(11);
        if (r11 != null) {
            setLogo(r11);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(y3.q(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(y3.q(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        y3.A();
    }

    public void setOnMenuItemClickListener(i3 i3Var) {
    }
}
