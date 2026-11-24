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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public final int E;
    public final int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public om9 K;
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
    public final xl3 a0;
    public sq b;
    public ArrayList b0;
    public sq c;
    public final ln8 c0;
    public jp d;
    public itb d0;
    public lp e;
    public b9 e0;
    public final Drawable f;
    public dtb f0;
    public boolean g0;
    public final CharSequence h;
    public OnBackInvokedCallback h0;
    public OnBackInvokedDispatcher i0;
    public boolean j0;
    public final xia k0;
    public jp n;
    public View r;
    public Context s;
    public int w;
    public int x;
    public int y;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.N = 8388627;
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = new int[2];
        this.a0 = new xl3(new btb(this, (byte) 1));
        this.b0 = new ArrayList();
        this.c0 = new ln8((Object) this, (byte) 21);
        this.k0 = new xia((Object) this, (byte) 9);
        Context context2 = getContext();
        int[] iArr = jy8.x;
        vk9 v = vk9.v(context2, attributeSet, iArr, R.attr.toolbarStyle);
        jdc.j(this, context, iArr, attributeSet, (TypedArray) v.c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) v.c;
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
        om9 om9Var = this.K;
        om9Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            om9Var.e = dimensionPixelSize;
            om9Var.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            om9Var.f = dimensionPixelSize2;
            om9Var.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            om9Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.L = typedArray.getDimensionPixelOffset(10, TLObject.FLAG_31);
        this.M = typedArray.getDimensionPixelOffset(6, TLObject.FLAG_31);
        this.f = v.n(4);
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
        Drawable n = v.n(16);
        if (n != null) {
            setNavigationIcon(n);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable n2 = v.n(11);
        if (n2 != null) {
            setLogo(n2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(v.m(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(v.m(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        v.y();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new xbb(getContext());
    }

    public static etb h() {
        etb etbVar = new etb(-2, -2);
        etbVar.b = (byte) 0;
        etbVar.a = 8388627;
        return etbVar;
    }

    public static etb i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof etb;
        if (z) {
            etb etbVar = (etb) layoutParams;
            etb etbVar2 = new etb(etbVar);
            etbVar2.b = (byte) 0;
            etbVar2.b = etbVar.b;
            return etbVar2;
        }
        if (z) {
            etb etbVar3 = new etb((etb) layoutParams);
            etbVar3.b = (byte) 0;
            return etbVar3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            etb etbVar4 = new etb(layoutParams);
            etbVar4.b = (byte) 0;
            return etbVar4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        etb etbVar5 = new etb(marginLayoutParams);
        etbVar5.b = (byte) 0;
        ((ViewGroup.MarginLayoutParams) etbVar5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) etbVar5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) etbVar5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) etbVar5).bottomMargin = marginLayoutParams.bottomMargin;
        return etbVar5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        WeakHashMap weakHashMap = jdc.a;
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                etb etbVar = (etb) childAt.getLayoutParams();
                if (etbVar.b == 0 && s(childAt)) {
                    int i3 = etbVar.a;
                    WeakHashMap weakHashMap2 = jdc.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
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
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            etb etbVar2 = (etb) childAt2.getLayoutParams();
            if (etbVar2.b == 0 && s(childAt2)) {
                int i5 = etbVar2.a;
                WeakHashMap weakHashMap3 = jdc.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        etb h = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (etb) layoutParams;
        h.b = (byte) 1;
        if (!z || this.r == null) {
            addView(view, h);
        } else {
            view.setLayoutParams(h);
            this.V.add(view);
        }
    }

    public final void c() {
        if (this.n == null) {
            jp jpVar = new jp(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.n = jpVar;
            jpVar.setImageDrawable(this.f);
            this.n.setContentDescription(this.h);
            etb h = h();
            h.a = (this.E & kk7.w1) | 8388611;
            h.b = (byte) 2;
            this.n.setLayoutParams(h);
            this.n.setOnClickListener(new g6(this, (byte) 16));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof etb);
    }

    public final void d() {
        if (this.K == null) {
            om9 om9Var = new om9();
            om9Var.a = 0;
            om9Var.b = 0;
            om9Var.c = TLObject.FLAG_31;
            om9Var.d = TLObject.FLAG_31;
            om9Var.e = 0;
            om9Var.f = 0;
            om9Var.g = false;
            om9Var.h = false;
            this.K = om9Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.G == null) {
            yz6 yz6Var = (yz6) actionMenuView.getMenu();
            if (this.f0 == null) {
                this.f0 = new dtb(this);
            }
            this.a.setExpandedActionViewsExclusive(true);
            yz6Var.b(this.f0, this.s);
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
            v39 v39Var = new v39(this, (byte) 17);
            actionMenuView2.getClass();
            actionMenuView2.L = v39Var;
            etb h = h();
            h.a = (this.E & kk7.w1) | 8388613;
            this.a.setLayoutParams(h);
            b(this.a, false);
        }
    }

    public final void g() {
        if (this.d == null) {
            this.d = new jp(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            etb h = h();
            h.a = (this.E & kk7.w1) | 8388611;
            this.d.setLayoutParams(h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        etb etbVar = new etb(context, attributeSet);
        etbVar.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jy8.b);
        etbVar.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        etbVar.b = (byte) 0;
        return etbVar;
    }

    public CharSequence getCollapseContentDescription() {
        jp jpVar = this.n;
        if (jpVar != null) {
            return jpVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        jp jpVar = this.n;
        if (jpVar != null) {
            return jpVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        om9 om9Var = this.K;
        if (om9Var != null) {
            return om9Var.g ? om9Var.a : om9Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.M;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        om9 om9Var = this.K;
        if (om9Var != null) {
            return om9Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        om9 om9Var = this.K;
        if (om9Var != null) {
            return om9Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        om9 om9Var = this.K;
        if (om9Var != null) {
            return om9Var.g ? om9Var.b : om9Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.L;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        yz6 yz6Var;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (yz6Var = actionMenuView.G) == null || !yz6Var.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.M, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = jdc.a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = jdc.a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.L, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        lp lpVar = this.e;
        if (lpVar != null) {
            return lpVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        lp lpVar = this.e;
        if (lpVar != null) {
            return lpVar.getContentDescription();
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
        jp jpVar = this.d;
        if (jpVar != null) {
            return jpVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        jp jpVar = this.d;
        if (jpVar != null) {
            return jpVar.getDrawable();
        }
        return null;
    }

    public b9 getOuterActionMenuPresenter() {
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

    public g93 getWrapper() {
        Drawable drawable;
        itb itbVar = this.d0;
        if (itbVar == null) {
            itbVar = new itb();
            itbVar.n = 0;
            itbVar.a = this;
            itbVar.h = getTitle();
            itbVar.i = getSubtitle();
            itbVar.g = itbVar.h != null;
            itbVar.f = getNavigationIcon();
            vk9 v = vk9.v(getContext(), null, jy8.a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) v.c;
            itbVar.o = v.n(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                itbVar.g = true;
                itbVar.h = text;
                if ((itbVar.b & 8) != 0) {
                    setTitle(text);
                    if (itbVar.g) {
                        jdc.l(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                itbVar.i = text2;
                if ((itbVar.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable n = v.n(20);
            if (n != null) {
                itbVar.e = n;
                itbVar.c();
            }
            Drawable n2 = v.n(17);
            if (n2 != null) {
                itbVar.d = n2;
                itbVar.c();
            }
            if (itbVar.f == null && (drawable = itbVar.o) != null) {
                itbVar.f = drawable;
                if ((itbVar.b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            itbVar.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = itbVar.c;
                if (view != null && (itbVar.b & 16) != 0) {
                    removeView(view);
                }
                itbVar.c = inflate;
                if (inflate != null && (itbVar.b & 16) != 0) {
                    addView(inflate);
                }
                itbVar.a(itbVar.b | 16);
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
                sq sqVar = this.b;
                if (sqVar != null) {
                    sqVar.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.y = resourceId3;
                sq sqVar2 = this.c;
                if (sqVar2 != null) {
                    sqVar2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            v.y();
            if (R.string.abc_action_bar_up_description != itbVar.n) {
                itbVar.n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = itbVar.n;
                    itbVar.j = i != 0 ? getContext().getString(i) : null;
                    itbVar.b();
                }
            }
            itbVar.j = getNavigationContentDescription();
            setNavigationOnClickListener(new fc3(itbVar));
            this.d0 = itbVar;
        }
        return itbVar;
    }

    public final int j(int i, View view) {
        etb etbVar = (etb) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = etbVar.a & kk7.w1;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.N & kk7.w1;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) etbVar).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) etbVar).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) etbVar).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    public final void m() {
        ArrayList arrayList = this.b0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.a0.c).iterator();
        while (it.hasNext()) {
            ((zn4) it.next()).a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.b0 = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.V.contains(view);
    }

    public final int o(View view, int i, int i2, int[] iArr) {
        etb etbVar = (etb) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) etbVar).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int j = j(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j, max + measuredWidth, view.getMeasuredHeight() + j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) etbVar).rightMargin + max;
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

    /* JADX WARN: Removed duplicated region for block: B:102:0x0298 A[LOOP:1: B:101:0x0296->B:102:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b8 A[LOOP:2: B:105:0x02b6->B:106:0x02b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x030a A[LOOP:3: B:114:0x0308->B:115:0x030a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0280 A[LOOP:0: B:97:0x027e->B:98:0x0280, LOOP_END] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean s;
        boolean s2;
        boolean z2;
        int i7;
        sq sqVar;
        int size;
        int i8;
        int i9;
        int size2;
        int i10;
        int size3;
        int i11;
        int i12;
        int i13;
        int size4;
        int i14;
        int paddingTop;
        int i15;
        int i16;
        int i17;
        int i18;
        WeakHashMap weakHashMap = jdc.a;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i19 = width - paddingRight;
        int[] iArr = this.W;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (s(this.d)) {
            jp jpVar = this.d;
            if (z3) {
                i6 = p(jpVar, i19, min, iArr);
                i5 = paddingLeft;
                if (s(this.n)) {
                    jp jpVar2 = this.n;
                    if (z3) {
                        i6 = p(jpVar2, i6, min, iArr);
                    } else {
                        i5 = o(jpVar2, i5, min, iArr);
                    }
                }
                if (s(this.a)) {
                    ActionMenuView actionMenuView = this.a;
                    if (z3) {
                        i5 = o(actionMenuView, i5, min, iArr);
                    } else {
                        i6 = p(actionMenuView, i6, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i5);
                iArr[1] = Math.max(0, currentContentInsetRight - (i19 - i6));
                int max = Math.max(i5, currentContentInsetLeft);
                int min2 = Math.min(i6, i19 - currentContentInsetRight);
                if (s(this.r)) {
                    View view = this.r;
                    if (z3) {
                        min2 = p(view, min2, min, iArr);
                    } else {
                        max = o(view, max, min, iArr);
                    }
                }
                if (s(this.e)) {
                    lp lpVar = this.e;
                    if (z3) {
                        min2 = p(lpVar, min2, min, iArr);
                    } else {
                        max = o(lpVar, max, min, iArr);
                    }
                }
                s = s(this.b);
                s2 = s(this.c);
                if (s) {
                    z2 = z3;
                    i7 = 0;
                } else {
                    etb etbVar = (etb) this.b.getLayoutParams();
                    z2 = z3;
                    i7 = this.b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) etbVar).topMargin + ((ViewGroup.MarginLayoutParams) etbVar).bottomMargin;
                }
                if (s2) {
                    etb etbVar2 = (etb) this.c.getLayoutParams();
                    i7 = this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) etbVar2).topMargin + ((ViewGroup.MarginLayoutParams) etbVar2).bottomMargin + i7;
                }
                if (s) {
                    if (s2) {
                        sqVar = this.c;
                    }
                    ArrayList arrayList = this.U;
                    a(3, arrayList);
                    size = arrayList.size();
                    i8 = max;
                    for (i9 = 0; i9 < size; i9++) {
                        i8 = o((View) arrayList.get(i9), i8, min, iArr);
                    }
                    a(5, arrayList);
                    size2 = arrayList.size();
                    for (i10 = 0; i10 < size2; i10++) {
                        min2 = p((View) arrayList.get(i10), min2, min, iArr);
                    }
                    a(1, arrayList);
                    int i20 = iArr[0];
                    int i21 = iArr[1];
                    size3 = arrayList.size();
                    int i22 = i20;
                    i11 = 0;
                    int i23 = 0;
                    while (i11 < size3) {
                        View view2 = (View) arrayList.get(i11);
                        etb etbVar3 = (etb) view2.getLayoutParams();
                        int i24 = i21;
                        int i25 = ((ViewGroup.MarginLayoutParams) etbVar3).leftMargin - i22;
                        int i26 = ((ViewGroup.MarginLayoutParams) etbVar3).rightMargin - i24;
                        int max2 = Math.max(0, i25);
                        int max3 = Math.max(0, i26);
                        int max4 = Math.max(0, -i25);
                        int max5 = Math.max(0, -i26);
                        i23 += view2.getMeasuredWidth() + max2 + max3;
                        i11++;
                        i22 = max4;
                        i21 = max5;
                    }
                    i13 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i23 / 2);
                    int i27 = i23 + i13;
                    if (i13 >= i8) {
                        i8 = i27 > min2 ? i13 - (i27 - min2) : i13;
                    }
                    size4 = arrayList.size();
                    for (i12 = 0; i12 < size4; i12++) {
                        i8 = o((View) arrayList.get(i12), i8, min, iArr);
                    }
                    arrayList.clear();
                }
                sqVar = this.b;
                sq sqVar2 = !s2 ? this.c : this.b;
                etb etbVar4 = (etb) sqVar.getLayoutParams();
                etb etbVar5 = (etb) sqVar2.getLayoutParams();
                int i28 = i7;
                boolean z4 = (!s && this.b.getMeasuredWidth() > 0) || (s2 && this.c.getMeasuredWidth() > 0);
                i14 = this.N & kk7.w1;
                int i29 = max;
                if (i14 != 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) etbVar4).topMargin + this.I;
                } else if (i14 != 80) {
                    int i30 = (((height - paddingTop2) - paddingBottom) - i28) / 2;
                    int i31 = ((ViewGroup.MarginLayoutParams) etbVar4).topMargin + this.I;
                    if (i30 < i31) {
                        i30 = i31;
                    } else {
                        int i32 = (((height - paddingBottom) - i28) - i30) - paddingTop2;
                        int i33 = ((ViewGroup.MarginLayoutParams) etbVar4).bottomMargin;
                        int i34 = this.J;
                        if (i32 < i33 + i34) {
                            i30 = Math.max(0, i30 - ((((ViewGroup.MarginLayoutParams) etbVar5).bottomMargin + i34) - i32));
                        }
                    }
                    paddingTop = paddingTop2 + i30;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) etbVar5).bottomMargin) - this.J) - i28;
                }
                if (z2) {
                    int i35 = (z4 ? this.G : 0) - iArr[0];
                    max = Math.max(0, i35) + i29;
                    iArr[0] = Math.max(0, -i35);
                    if (s) {
                        etb etbVar6 = (etb) this.b.getLayoutParams();
                        int measuredWidth = this.b.getMeasuredWidth() + max;
                        int measuredHeight = this.b.getMeasuredHeight() + paddingTop;
                        this.b.layout(max, paddingTop, measuredWidth, measuredHeight);
                        i15 = measuredWidth + this.H;
                        paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) etbVar6).bottomMargin;
                    } else {
                        i15 = max;
                    }
                    if (s2) {
                        int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((etb) this.c.getLayoutParams())).topMargin;
                        int measuredWidth2 = this.c.getMeasuredWidth() + max;
                        this.c.layout(max, i36, measuredWidth2, this.c.getMeasuredHeight() + i36);
                        i16 = measuredWidth2 + this.H;
                    } else {
                        i16 = max;
                    }
                    if (z4) {
                        max = Math.max(i15, i16);
                    }
                } else {
                    int i37 = (z4 ? this.G : 0) - iArr[1];
                    min2 -= Math.max(0, i37);
                    iArr[1] = Math.max(0, -i37);
                    if (s) {
                        etb etbVar7 = (etb) this.b.getLayoutParams();
                        int measuredWidth3 = min2 - this.b.getMeasuredWidth();
                        int measuredHeight2 = this.b.getMeasuredHeight() + paddingTop;
                        this.b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                        i17 = measuredWidth3 - this.H;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) etbVar7).bottomMargin;
                    } else {
                        i17 = min2;
                    }
                    if (s2) {
                        int i38 = paddingTop + ((ViewGroup.MarginLayoutParams) ((etb) this.c.getLayoutParams())).topMargin;
                        this.c.layout(min2 - this.c.getMeasuredWidth(), i38, min2, this.c.getMeasuredHeight() + i38);
                        i18 = min2 - this.H;
                    } else {
                        i18 = min2;
                    }
                    if (z4) {
                        min2 = Math.min(i17, i18);
                    }
                    max = i29;
                }
                ArrayList arrayList2 = this.U;
                a(3, arrayList2);
                size = arrayList2.size();
                i8 = max;
                while (i9 < size) {
                }
                a(5, arrayList2);
                size2 = arrayList2.size();
                while (i10 < size2) {
                }
                a(1, arrayList2);
                int i202 = iArr[0];
                int i212 = iArr[1];
                size3 = arrayList2.size();
                int i222 = i202;
                i11 = 0;
                int i232 = 0;
                while (i11 < size3) {
                }
                i13 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i232 / 2);
                int i272 = i232 + i13;
                if (i13 >= i8) {
                }
                size4 = arrayList2.size();
                while (i12 < size4) {
                }
                arrayList2.clear();
            }
            i5 = o(jpVar, paddingLeft, min, iArr);
        } else {
            i5 = paddingLeft;
        }
        i6 = i19;
        if (s(this.n)) {
        }
        if (s(this.a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i5);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i19 - i6));
        int max6 = Math.max(i5, currentContentInsetLeft2);
        int min22 = Math.min(i6, i19 - currentContentInsetRight2);
        if (s(this.r)) {
        }
        if (s(this.e)) {
        }
        s = s(this.b);
        s2 = s(this.c);
        if (s) {
        }
        if (s2) {
        }
        if (s) {
        }
        if (!s2) {
        }
        etb etbVar42 = (etb) sqVar.getLayoutParams();
        etb etbVar52 = (etb) sqVar2.getLayoutParams();
        int i282 = i7;
        if (s) {
        }
        i14 = this.N & kk7.w1;
        int i292 = max6;
        if (i14 != 48) {
        }
        if (z2) {
        }
        ArrayList arrayList22 = this.U;
        a(3, arrayList22);
        size = arrayList22.size();
        i8 = max6;
        while (i9 < size) {
        }
        a(5, arrayList22);
        size2 = arrayList22.size();
        while (i10 < size2) {
        }
        a(1, arrayList22);
        int i2022 = iArr[0];
        int i2122 = iArr[1];
        size3 = arrayList22.size();
        int i2222 = i2022;
        i11 = 0;
        int i2322 = 0;
        while (i11 < size3) {
        }
        i13 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i2322 / 2);
        int i2722 = i2322 + i13;
        if (i13 >= i8) {
        }
        size4 = arrayList22.size();
        while (i12 < size4) {
        }
        arrayList22.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean a = gfc.a(this);
        int i10 = !a ? 1 : 0;
        int i11 = 0;
        if (s(this.d)) {
            r(this.d, i, 0, i2, this.F);
            i3 = k(this.d) + this.d.getMeasuredWidth();
            i4 = Math.max(0, l(this.d) + this.d.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (s(this.n)) {
            r(this.n, i, 0, i2, this.F);
            i3 = k(this.n) + this.n.getMeasuredWidth();
            i4 = Math.max(i4, l(this.n) + this.n.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.n.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        int[] iArr = this.W;
        iArr[a ? 1 : 0] = max2;
        if (s(this.a)) {
            r(this.a, i, max, i2, this.F);
            i6 = k(this.a) + this.a.getMeasuredWidth();
            i4 = Math.max(i4, l(this.a) + this.a.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i6);
        iArr[i10] = Math.max(0, currentContentInsetEnd - i6);
        if (s(this.r)) {
            max3 += q(this.r, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.r) + this.r.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.r.getMeasuredState());
        }
        if (s(this.e)) {
            max3 += q(this.e, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.e) + this.e.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((etb) childAt.getLayoutParams()).b == 0 && s(childAt)) {
                max3 += q(childAt, i, max3, i2, 0, iArr);
                int max4 = Math.max(i4, l(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
                i4 = max4;
            } else {
                max3 = max3;
            }
        }
        int i13 = max3;
        int i14 = this.I + this.J;
        int i15 = this.G + this.H;
        if (s(this.b)) {
            q(this.b, i, i13 + i15, i2, i14, iArr);
            int k = k(this.b) + this.b.getMeasuredWidth();
            i7 = l(this.b) + this.b.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i5, this.b.getMeasuredState());
            i9 = k;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (s(this.c)) {
            i9 = Math.max(i9, q(this.c, i, i13 + i15, i2, i14 + i7, iArr));
            i7 += l(this.c) + this.c.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i8, this.c.getMeasuredState());
        }
        int max5 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i13 + i9;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (this.g0) {
            int childCount2 = getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt2 = getChildAt(i16);
                if (!s(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i11);
        }
        i11 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof gtb)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        gtb gtbVar = (gtb) parcelable;
        super.onRestoreInstanceState(gtbVar.a);
        ActionMenuView actionMenuView = this.a;
        yz6 yz6Var = actionMenuView != null ? actionMenuView.G : null;
        int i = gtbVar.c;
        if (i != 0 && this.f0 != null && yz6Var != null && (findItem = yz6Var.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (gtbVar.d) {
            xia xiaVar = this.k0;
            removeCallbacks(xiaVar);
            post(xiaVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        om9 om9Var = this.K;
        boolean z = i == 1;
        if (z == om9Var.g) {
            return;
        }
        om9Var.g = z;
        if (!om9Var.h) {
            om9Var.a = om9Var.e;
            om9Var.b = om9Var.f;
            return;
        }
        if (z) {
            int i2 = om9Var.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = om9Var.e;
            }
            om9Var.a = i2;
            int i3 = om9Var.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = om9Var.f;
            }
            om9Var.b = i3;
            return;
        }
        int i4 = om9Var.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = om9Var.e;
        }
        om9Var.a = i4;
        int i5 = om9Var.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = om9Var.f;
        }
        om9Var.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        b9 b9Var;
        c07 c07Var;
        gtb gtbVar = new gtb(super.onSaveInstanceState());
        dtb dtbVar = this.f0;
        if (dtbVar != null && (c07Var = dtbVar.b) != null) {
            gtbVar.c = c07Var.a;
        }
        ActionMenuView actionMenuView = this.a;
        gtbVar.d = (actionMenuView == null || (b9Var = actionMenuView.K) == null || !b9Var.f()) ? false : true;
        return gtbVar;
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

    public final int p(View view, int i, int i2, int[] iArr) {
        etb etbVar = (etb) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) etbVar).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int j = j(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j, max, view.getMeasuredHeight() + j);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) etbVar).leftMargin);
    }

    public final int q(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void r(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, TLObject.FLAG_30);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.j0 != z) {
            this.j0 = z;
            t();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        jp jpVar = this.n;
        if (jpVar != null) {
            jpVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.n.setImageDrawable(drawable);
        } else {
            jp jpVar = this.n;
            if (jpVar != null) {
                jpVar.setImageDrawable(this.f);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.g0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = TLObject.FLAG_31;
        }
        if (i != this.M) {
            this.M = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = TLObject.FLAG_31;
        }
        if (i != this.L) {
            this.L = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        lp lpVar = this.e;
        if (drawable != null) {
            if (lpVar == null) {
                lpVar = new lp(getContext(), null, 0);
                this.e = lpVar;
            }
            if (!n(lpVar)) {
                b(this.e, true);
            }
        } else if (lpVar != null && n(lpVar)) {
            removeView(this.e);
            this.V.remove(this.e);
        }
        lp lpVar2 = this.e;
        if (lpVar2 != null) {
            lpVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.e == null) {
            this.e = new lp(getContext(), null, 0);
        }
        lp lpVar = this.e;
        if (lpVar != null) {
            lpVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        jp jpVar = this.d;
        if (jpVar != null) {
            jpVar.setContentDescription(charSequence);
            uve.a(this.d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.d)) {
                b(this.d, true);
            }
        } else {
            jp jpVar = this.d;
            if (jpVar != null && n(jpVar)) {
                removeView(this.d);
                this.V.remove(this.d);
            }
        }
        jp jpVar2 = this.d;
        if (jpVar2 != null) {
            jpVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.w != i) {
            this.w = i;
            if (i == 0) {
                this.s = getContext();
            } else {
                this.s = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        sq sqVar = this.c;
        if (!isEmpty) {
            if (sqVar == null) {
                Context context = getContext();
                sq sqVar2 = new sq(context, null);
                this.c = sqVar2;
                sqVar2.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.y;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.R;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!n(this.c)) {
                b(this.c, true);
            }
        } else if (sqVar != null && n(sqVar)) {
            removeView(this.c);
            this.V.remove(this.c);
        }
        sq sqVar3 = this.c;
        if (sqVar3 != null) {
            sqVar3.setText(charSequence);
        }
        this.P = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.R = colorStateList;
        sq sqVar = this.c;
        if (sqVar != null) {
            sqVar.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        sq sqVar = this.b;
        if (!isEmpty) {
            if (sqVar == null) {
                Context context = getContext();
                sq sqVar2 = new sq(context, null);
                this.b = sqVar2;
                sqVar2.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.x;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.Q;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!n(this.b)) {
                b(this.b, true);
            }
        } else if (sqVar != null && n(sqVar)) {
            removeView(this.b);
            this.V.remove(this.b);
        }
        sq sqVar3 = this.b;
        if (sqVar3 != null) {
            sqVar3.setText(charSequence);
        }
        this.O = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.J = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.H = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.G = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.I = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.Q = colorStateList;
        sq sqVar = this.b;
        if (sqVar != null) {
            sqVar.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t() {
        boolean z;
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        OnBackInvokedDispatcher a = ctb.a(this);
        dtb dtbVar = this.f0;
        byte b = 0;
        if (dtbVar != null && dtbVar.b != null && a != null) {
            WeakHashMap weakHashMap = jdc.a;
            if (isAttachedToWindow() && this.j0) {
                z = true;
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.i0;
                if (z) {
                    if (onBackInvokedDispatcher != null) {
                        ctb.d(onBackInvokedDispatcher, this.h0);
                        this.i0 = null;
                        return;
                    }
                    return;
                }
                if (onBackInvokedDispatcher == null) {
                    OnBackInvokedCallback onBackInvokedCallback = this.h0;
                    if (onBackInvokedCallback == null) {
                        onBackInvokedCallback = ctb.b(new btb(this, b));
                        this.h0 = onBackInvokedCallback;
                    }
                    ctb.c(a, onBackInvokedCallback);
                    this.i0 = a;
                    return;
                }
                return;
            }
        }
        z = false;
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.i0;
        if (z) {
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(hmd.a(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setOnMenuItemClickListener(ftb ftbVar) {
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(hmd.a(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(hmd.a(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
