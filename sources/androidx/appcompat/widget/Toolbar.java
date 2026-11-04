package androidx.appcompat.widget;

import a3.o;
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
import androidx.mediarouter.app.w;
import b8.ae;
import b8.oc;
import gi.v5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k4.j;
import l.k;
import l.m;
import m.d3;
import m.e3;
import m.f3;
import m.g3;
import m.h;
import m.h3;
import m.i3;
import m.j3;
import m.k1;
import m.k3;
import m.o2;
import m.r3;
import m.u;
import m.v;
import m.z0;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import r0.i0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public final int E;
    public final int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public o2 K;
    public int L;
    public int M;
    public final int N;
    public CharSequence O;
    public CharSequence P;
    public ColorStateList Q;
    public ColorStateList R;
    public boolean S;
    public boolean T;
    public final ArrayList U;
    public final ArrayList V;
    public final int[] W;
    public ActionMenuView a;
    public final p7.d a0;
    public z0 b;
    public ArrayList b0;
    public z0 c;
    public final v5 c0;
    public u d;
    public k3 d0;
    public v e;
    public h e0;
    public final Drawable f;
    public f3 f0;
    public boolean g0;
    public final CharSequence h;
    public OnBackInvokedCallback h0;
    public OnBackInvokedDispatcher i0;
    public boolean j0;
    public final o k0;
    public u n;
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
        for (int i3 = 0; i3 < menu.size(); i3++) {
            arrayList.add(menu.getItem(i3));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new k.h(getContext());
    }

    public static g3 h() {
        g3 g3Var = new g3(-2, -2);
        g3Var.b = 0;
        g3Var.a = 8388627;
        return g3Var;
    }

    public static g3 i(ViewGroup.LayoutParams layoutParams) {
        boolean z10 = layoutParams instanceof g3;
        if (z10) {
            g3 g3Var = (g3) layoutParams;
            g3 g3Var2 = new g3(g3Var);
            g3Var2.b = 0;
            g3Var2.b = g3Var.b;
            return g3Var2;
        }
        if (z10) {
            g3 g3Var3 = new g3((g3) layoutParams);
            g3Var3.b = 0;
            return g3Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            g3 g3Var4 = new g3(layoutParams);
            g3Var4.b = 0;
            return g3Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        g3 g3Var5 = new g3(marginLayoutParams);
        g3Var5.b = 0;
        ((ViewGroup.MarginLayoutParams) g3Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) g3Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) g3Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) g3Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return g3Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i3, ArrayList arrayList) {
        WeakHashMap weakHashMap = i0.a;
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, getLayoutDirection());
        arrayList.clear();
        if (!z10) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                g3 g3Var = (g3) childAt.getLayoutParams();
                if (g3Var.b == 0 && s(childAt)) {
                    int i11 = g3Var.a;
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
            g3 g3Var2 = (g3) childAt2.getLayoutParams();
            if (g3Var2.b == 0 && s(childAt2)) {
                int i13 = g3Var2.a;
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

    public final void b(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g3 h = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (g3) layoutParams;
        h.b = 1;
        if (!z10 || this.r == null) {
            addView(view, h);
        } else {
            view.setLayoutParams(h);
            this.V.add(view);
        }
    }

    public final void c() {
        if (this.n == null) {
            u uVar = new u(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.n = uVar;
            uVar.setImageDrawable(this.f);
            this.n.setContentDescription(this.h);
            g3 h = h();
            h.a = (this.E & hs.x1) | 8388611;
            h.b = 2;
            this.n.setLayoutParams(h);
            this.n.setOnClickListener(new w(this, 7));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g3);
    }

    public final void d() {
        if (this.K == null) {
            o2 o2Var = new o2();
            o2Var.a = 0;
            o2Var.b = 0;
            o2Var.c = TLObject.FLAG_31;
            o2Var.d = TLObject.FLAG_31;
            o2Var.e = 0;
            o2Var.f = 0;
            o2Var.g = false;
            o2Var.h = false;
            this.K = o2Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.G == null) {
            k kVar = (k) actionMenuView.getMenu();
            if (this.f0 == null) {
                this.f0 = new f3(this);
            }
            this.a.setExpandedActionViewsExclusive(true);
            kVar.b(this.f0, this.s);
            t();
        }
    }

    public final void f() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.setPopupTheme(this.w);
            this.a.setOnMenuItemClickListener(this.c0);
            ActionMenuView actionMenuView2 = this.a;
            hi.d dVar = new hi.d(this, 10);
            actionMenuView2.getClass();
            actionMenuView2.L = dVar;
            g3 h = h();
            h.a = (this.E & hs.x1) | 8388613;
            this.a.setLayoutParams(h);
            b(this.a, false);
        }
    }

    public final void g() {
        if (this.d == null) {
            this.d = new u(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            g3 h = h();
            h.a = (this.E & hs.x1) | 8388611;
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
        o2 o2Var = this.K;
        if (o2Var != null) {
            return o2Var.g ? o2Var.a : o2Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i3 = this.M;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        o2 o2Var = this.K;
        if (o2Var != null) {
            return o2Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        o2 o2Var = this.K;
        if (o2Var != null) {
            return o2Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        o2 o2Var = this.K;
        if (o2Var != null) {
            return o2Var.g ? o2Var.b : o2Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i3 = this.L;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        k kVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (kVar = actionMenuView.G) == null || !kVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.M, 0));
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
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.L, 0)) : getContentInsetStart();
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
        return this.e0;
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
        return this.P;
    }

    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.O;
    }

    public int getTitleMarginBottom() {
        return this.J;
    }

    public int getTitleMarginEnd() {
        return this.H;
    }

    public int getTitleMarginStart() {
        return this.G;
    }

    public int getTitleMarginTop() {
        return this.I;
    }

    public final TextView getTitleTextView() {
        return this.b;
    }

    public k1 getWrapper() {
        Drawable drawable;
        if (this.d0 == null) {
            k3 k3Var = new k3();
            k3Var.n = 0;
            k3Var.a = this;
            k3Var.h = getTitle();
            k3Var.i = getSubtitle();
            k3Var.g = k3Var.h != null;
            k3Var.f = getNavigationIcon();
            j F = j.F(getContext(), null, f.a.a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) F.b;
            k3Var.o = F.A(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                k3Var.g = true;
                k3Var.h = text;
                if ((k3Var.b & 8) != 0) {
                    setTitle(text);
                    if (k3Var.g) {
                        i0.k(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                k3Var.i = text2;
                if ((k3Var.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable A = F.A(20);
            if (A != null) {
                k3Var.e = A;
                k3Var.c();
            }
            Drawable A2 = F.A(17);
            if (A2 != null) {
                k3Var.d = A2;
                k3Var.c();
            }
            if (k3Var.f == null && (drawable = k3Var.o) != null) {
                k3Var.f = drawable;
                if ((k3Var.b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            k3Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = k3Var.c;
                if (view != null && (k3Var.b & 16) != 0) {
                    removeView(view);
                }
                k3Var.c = inflate;
                if (inflate != null && (k3Var.b & 16) != 0) {
                    addView(inflate);
                }
                k3Var.a(k3Var.b | 16);
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
                this.K.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.x = resourceId2;
                z0 z0Var = this.b;
                if (z0Var != null) {
                    z0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.y = resourceId3;
                z0 z0Var2 = this.c;
                if (z0Var2 != null) {
                    z0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            F.H();
            if (R.string.abc_action_bar_up_description != k3Var.n) {
                k3Var.n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i3 = k3Var.n;
                    k3Var.j = i3 != 0 ? getContext().getString(i3) : null;
                    k3Var.b();
                }
            }
            k3Var.j = getNavigationContentDescription();
            setNavigationOnClickListener(new j3(k3Var));
            this.d0 = k3Var;
        }
        return this.d0;
    }

    public final int j(int i3, View view) {
        g3 g3Var = (g3) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i3 > 0 ? (measuredHeight - i3) / 2 : 0;
        int i11 = g3Var.a & hs.x1;
        if (i11 != 16 && i11 != 48 && i11 != 80) {
            i11 = this.N & hs.x1;
        }
        if (i11 == 48) {
            return getPaddingTop() - i10;
        }
        if (i11 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) g3Var).bottomMargin) - i10;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) g3Var).topMargin;
        if (i12 < i13) {
            i12 = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) g3Var).bottomMargin;
            if (i14 < i15) {
                i12 = Math.max(0, i12 - (i15 - i14));
            }
        }
        return paddingTop + i12;
    }

    public final void m() {
        ArrayList arrayList = this.b0;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.a0.d).iterator();
        while (it.hasNext()) {
            ((b0) it.next()).a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.b0 = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.V.contains(view);
    }

    public final int o(View view, int i3, int i10, int[] iArr) {
        g3 g3Var = (g3) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) g3Var).leftMargin - iArr[0];
        int max = Math.max(0, i11) + i3;
        iArr[0] = Math.max(0, -i11);
        int j10 = j(i10, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j10, max + measuredWidth, view.getMeasuredHeight() + j10);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) g3Var).rightMargin + max;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.k0);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.T = false;
        }
        if (!this.T) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.T = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.T = false;
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        int i14;
        int max;
        boolean s6;
        boolean s10;
        boolean z11;
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
        boolean z12 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i27 = width - paddingRight;
        int[] iArr = this.W;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i12 - i10) : 0;
        if (!s(this.d)) {
            i13 = paddingLeft;
        } else {
            if (z12) {
                i14 = p(this.d, i27, min, iArr);
                i13 = paddingLeft;
                if (s(this.n)) {
                    if (z12) {
                        i14 = p(this.n, i14, min, iArr);
                    } else {
                        i13 = o(this.n, i13, min, iArr);
                    }
                }
                if (s(this.a)) {
                    if (z12) {
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
                s6 = s(this.b);
                s10 = s(this.c);
                if (s6) {
                    z11 = z12;
                    i15 = 0;
                } else {
                    g3 g3Var = (g3) this.b.getLayoutParams();
                    z11 = z12;
                    i15 = this.b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) g3Var).topMargin + ((ViewGroup.MarginLayoutParams) g3Var).bottomMargin;
                }
                if (!s10) {
                    g3 g3Var2 = (g3) this.c.getLayoutParams();
                    i15 = this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) g3Var2).topMargin + ((ViewGroup.MarginLayoutParams) g3Var2).bottomMargin + i15;
                }
                if (!s6 || s10) {
                    z0 z0Var = !s6 ? this.b : this.c;
                    z0 z0Var2 = !s10 ? this.c : this.b;
                    g3 g3Var3 = (g3) z0Var.getLayoutParams();
                    g3 g3Var4 = (g3) z0Var2.getLayoutParams();
                    int i28 = i15;
                    boolean z13 = (!s6 && this.b.getMeasuredWidth() > 0) || (s10 && this.c.getMeasuredWidth() > 0);
                    i16 = this.N & hs.x1;
                    int i29 = max;
                    if (i16 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) g3Var3).topMargin + this.I;
                    } else if (i16 != 80) {
                        int i30 = (((height - paddingTop2) - paddingBottom) - i28) / 2;
                        int i31 = ((ViewGroup.MarginLayoutParams) g3Var3).topMargin + this.I;
                        if (i30 < i31) {
                            i30 = i31;
                        } else {
                            int i32 = (((height - paddingBottom) - i28) - i30) - paddingTop2;
                            int i33 = ((ViewGroup.MarginLayoutParams) g3Var3).bottomMargin;
                            int i34 = this.J;
                            if (i32 < i33 + i34) {
                                i30 = Math.max(0, i30 - ((((ViewGroup.MarginLayoutParams) g3Var4).bottomMargin + i34) - i32));
                            }
                        }
                        paddingTop = paddingTop2 + i30;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) g3Var4).bottomMargin) - this.J) - i28;
                    }
                    if (z11) {
                        int i35 = (z13 ? this.G : 0) - iArr[0];
                        max = Math.max(0, i35) + i29;
                        iArr[0] = Math.max(0, -i35);
                        if (s6) {
                            g3 g3Var5 = (g3) this.b.getLayoutParams();
                            int measuredWidth = this.b.getMeasuredWidth() + max;
                            int measuredHeight = this.b.getMeasuredHeight() + paddingTop;
                            this.b.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i17 = measuredWidth + this.H;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) g3Var5).bottomMargin;
                        } else {
                            i17 = max;
                        }
                        if (s10) {
                            int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g3) this.c.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.c.getMeasuredWidth() + max;
                            this.c.layout(max, i36, measuredWidth2, this.c.getMeasuredHeight() + i36);
                            i18 = measuredWidth2 + this.H;
                        } else {
                            i18 = max;
                        }
                        if (z13) {
                            max = Math.max(i17, i18);
                        }
                    } else {
                        int i37 = (z13 ? this.G : 0) - iArr[1];
                        min2 -= Math.max(0, i37);
                        iArr[1] = Math.max(0, -i37);
                        if (s6) {
                            g3 g3Var6 = (g3) this.b.getLayoutParams();
                            int measuredWidth3 = min2 - this.b.getMeasuredWidth();
                            int measuredHeight2 = this.b.getMeasuredHeight() + paddingTop;
                            this.b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i19 = measuredWidth3 - this.H;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) g3Var6).bottomMargin;
                        } else {
                            i19 = min2;
                        }
                        if (s10) {
                            int i38 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g3) this.c.getLayoutParams())).topMargin;
                            this.c.layout(min2 - this.c.getMeasuredWidth(), i38, min2, this.c.getMeasuredHeight() + i38);
                            i20 = min2 - this.H;
                        } else {
                            i20 = min2;
                        }
                        if (z13) {
                            min2 = Math.min(i19, i20);
                        }
                        max = i29;
                    }
                }
                ArrayList arrayList = this.U;
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
                    g3 g3Var7 = (g3) view.getLayoutParams();
                    int i43 = i40;
                    int i44 = ((ViewGroup.MarginLayoutParams) g3Var7).leftMargin - i41;
                    int i45 = ((ViewGroup.MarginLayoutParams) g3Var7).rightMargin - i43;
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
        s6 = s(this.b);
        s10 = s(this.c);
        if (s6) {
        }
        if (!s10) {
        }
        if (!s6) {
        }
        if (!s6) {
        }
        if (!s10) {
        }
        g3 g3Var32 = (g3) z0Var.getLayoutParams();
        g3 g3Var42 = (g3) z0Var2.getLayoutParams();
        int i282 = i15;
        if (s6) {
        }
        i16 = this.N & hs.x1;
        int i292 = max;
        if (i16 != 48) {
        }
        if (z11) {
        }
        ArrayList arrayList2 = this.U;
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
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean a10 = r3.a(this);
        int i18 = !a10 ? 1 : 0;
        int i19 = 0;
        if (s(this.d)) {
            r(this.d, i3, 0, i10, this.F);
            i11 = k(this.d) + this.d.getMeasuredWidth();
            i12 = Math.max(0, l(this.d) + this.d.getMeasuredHeight());
            i13 = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        if (s(this.n)) {
            r(this.n, i3, 0, i10, this.F);
            i11 = k(this.n) + this.n.getMeasuredWidth();
            i12 = Math.max(i12, l(this.n) + this.n.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.n.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i11);
        int max2 = Math.max(0, currentContentInsetStart - i11);
        int[] iArr = this.W;
        iArr[a10 ? 1 : 0] = max2;
        if (s(this.a)) {
            r(this.a, i3, max, i10, this.F);
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
            max3 += q(this.r, i3, max3, i10, 0, iArr);
            i12 = Math.max(i12, l(this.r) + this.r.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.r.getMeasuredState());
        }
        if (s(this.e)) {
            max3 += q(this.e, i3, max3, i10, 0, iArr);
            i12 = Math.max(i12, l(this.e) + this.e.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (((g3) childAt.getLayoutParams()).b == 0 && s(childAt)) {
                max3 += q(childAt, i3, max3, i10, 0, iArr);
                int max4 = Math.max(i12, l(childAt) + childAt.getMeasuredHeight());
                i13 = View.combineMeasuredStates(i13, childAt.getMeasuredState());
                i12 = max4;
            } else {
                max3 = max3;
            }
        }
        int i21 = max3;
        int i22 = this.I + this.J;
        int i23 = this.G + this.H;
        if (s(this.b)) {
            q(this.b, i3, i21 + i23, i10, i22, iArr);
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
            i17 = Math.max(i17, q(this.c, i3, i21 + i23, i10, i22 + i15, iArr));
            i15 += l(this.c) + this.c.getMeasuredHeight();
            i16 = View.combineMeasuredStates(i16, this.c.getMeasuredState());
        }
        int max5 = Math.max(i12, i15);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i21 + i17;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i3, (-16777216) & i16);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, i16 << 16);
        if (this.g0) {
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
        if (!(parcelable instanceof i3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i3 i3Var = (i3) parcelable;
        super.onRestoreInstanceState(i3Var.a);
        ActionMenuView actionMenuView = this.a;
        k kVar = actionMenuView != null ? actionMenuView.G : null;
        int i3 = i3Var.c;
        if (i3 != 0 && this.f0 != null && kVar != null && (findItem = kVar.findItem(i3)) != null) {
            findItem.expandActionView();
        }
        if (i3Var.d) {
            o oVar = this.k0;
            removeCallbacks(oVar);
            post(oVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        d();
        o2 o2Var = this.K;
        boolean z10 = i3 == 1;
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
            int i10 = o2Var.d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = o2Var.e;
            }
            o2Var.a = i10;
            int i11 = o2Var.c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = o2Var.f;
            }
            o2Var.b = i11;
            return;
        }
        int i12 = o2Var.c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = o2Var.e;
        }
        o2Var.a = i12;
        int i13 = o2Var.d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = o2Var.f;
        }
        o2Var.b = i13;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        h hVar;
        m mVar;
        i3 i3Var = new i3(super.onSaveInstanceState());
        f3 f3Var = this.f0;
        if (f3Var != null && (mVar = f3Var.b) != null) {
            i3Var.c = mVar.a;
        }
        ActionMenuView actionMenuView = this.a;
        i3Var.d = (actionMenuView == null || (hVar = actionMenuView.K) == null || !hVar.g()) ? false : true;
        return i3Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.S = false;
        }
        if (!this.S) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.S = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.S = false;
        return true;
    }

    public final int p(View view, int i3, int i10, int[] iArr) {
        g3 g3Var = (g3) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) g3Var).rightMargin - iArr[1];
        int max = i3 - Math.max(0, i11);
        iArr[1] = Math.max(0, -i11);
        int j10 = j(i10, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j10, max, view.getMeasuredHeight() + j10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) g3Var).leftMargin);
    }

    public final int q(View view, int i3, int i10, int i11, int i12, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i13 = marginLayoutParams.leftMargin - iArr[0];
        int i14 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i13);
        iArr[1] = Math.max(0, -i14);
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + max + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void r(View view, int i3, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width);
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

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.j0 != z10) {
            this.j0 = z10;
            t();
        }
    }

    public void setCollapseContentDescription(int i3) {
        setCollapseContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setCollapseIcon(int i3) {
        setCollapseIcon(oc.b(getContext(), i3));
    }

    public void setCollapsible(boolean z10) {
        this.g0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i3) {
        if (i3 < 0) {
            i3 = TLObject.FLAG_31;
        }
        if (i3 != this.M) {
            this.M = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i3) {
        if (i3 < 0) {
            i3 = TLObject.FLAG_31;
        }
        if (i3 != this.L) {
            this.L = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i3) {
        setLogo(oc.b(getContext(), i3));
    }

    public void setLogoDescription(int i3) {
        setLogoDescription(getContext().getText(i3));
    }

    public void setNavigationContentDescription(int i3) {
        setNavigationContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setNavigationIcon(int i3) {
        setNavigationIcon(oc.b(getContext(), i3));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i3) {
        if (this.w != i3) {
            this.w = i3;
            if (i3 == 0) {
                this.s = getContext();
            } else {
                this.s = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setSubtitle(int i3) {
        setSubtitle(getContext().getText(i3));
    }

    public void setSubtitleTextColor(int i3) {
        setSubtitleTextColor(ColorStateList.valueOf(i3));
    }

    public void setTitle(int i3) {
        setTitle(getContext().getText(i3));
    }

    public void setTitleMarginBottom(int i3) {
        this.J = i3;
        requestLayout();
    }

    public void setTitleMarginEnd(int i3) {
        this.H = i3;
        requestLayout();
    }

    public void setTitleMarginStart(int i3) {
        this.G = i3;
        requestLayout();
    }

    public void setTitleMarginTop(int i3) {
        this.I = i3;
        requestLayout();
    }

    public void setTitleTextColor(int i3) {
        setTitleTextColor(ColorStateList.valueOf(i3));
    }

    public final void t() {
        boolean z10;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a10 = e3.a(this);
            f3 f3Var = this.f0;
            int i3 = 0;
            if (f3Var != null && f3Var.b != null && a10 != null) {
                WeakHashMap weakHashMap = i0.a;
                if (isAttachedToWindow() && this.j0) {
                    z10 = true;
                    if (!z10 && this.i0 == null) {
                        if (this.h0 == null) {
                            this.h0 = e3.b(new d3(this, i3));
                        }
                        e3.c(a10, this.h0);
                        this.i0 = a10;
                        return;
                    }
                    if (!z10 || (onBackInvokedDispatcher = this.i0) == null) {
                    }
                    e3.d(onBackInvokedDispatcher, this.h0);
                    this.i0 = null;
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
        g3 g3Var = new g3(context, attributeSet);
        g3Var.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.b);
        g3Var.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        g3Var.b = 0;
        return g3Var;
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
                this.V.remove(this.e);
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
            ae.a(this.d, charSequence);
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
                this.V.remove(this.d);
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
                this.V.remove(this.c);
            }
        } else {
            if (this.c == null) {
                Context context = getContext();
                z0 z0Var2 = new z0(context, null);
                this.c = z0Var2;
                z0Var2.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.y;
                if (i3 != 0) {
                    this.c.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.R;
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
        this.P = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.R = colorStateList;
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
                this.V.remove(this.b);
            }
        } else {
            if (this.b == null) {
                Context context = getContext();
                z0 z0Var2 = new z0(context, null);
                this.b = z0Var2;
                z0Var2.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.x;
                if (i3 != 0) {
                    this.b.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.Q;
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
        this.O = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.Q = colorStateList;
        z0 z0Var = this.b;
        if (z0Var != null) {
            z0Var.setTextColor(colorStateList);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.N = 8388627;
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = new int[2];
        this.a0 = new p7.d(new d3(this, 1));
        this.b0 = new ArrayList();
        this.c0 = new v5(this, 12);
        this.k0 = new o(this, 29);
        Context context2 = getContext();
        int[] iArr = f.a.x;
        j F = j.F(context2, attributeSet, iArr, i3);
        i0.i(this, context, iArr, attributeSet, (TypedArray) F.b, i3);
        TypedArray typedArray = (TypedArray) F.b;
        this.x = typedArray.getResourceId(28, 0);
        this.y = typedArray.getResourceId(19, 0);
        this.N = typedArray.getInteger(0, 8388627);
        this.E = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.J = dimensionPixelOffset;
        this.I = dimensionPixelOffset;
        this.H = dimensionPixelOffset;
        this.G = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.G = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.H = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.I = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.J = dimensionPixelOffset5;
        }
        this.F = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, TLObject.FLAG_31);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, TLObject.FLAG_31);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        o2 o2Var = this.K;
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
        this.L = typedArray.getDimensionPixelOffset(10, TLObject.FLAG_31);
        this.M = typedArray.getDimensionPixelOffset(6, TLObject.FLAG_31);
        this.f = F.A(4);
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
        Drawable A = F.A(16);
        if (A != null) {
            setNavigationIcon(A);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable A2 = F.A(11);
        if (A2 != null) {
            setLogo(A2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(F.y(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(F.y(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        F.H();
    }

    public void setOnMenuItemClickListener(h3 h3Var) {
    }
}
