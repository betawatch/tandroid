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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public final int E;
    public final int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public po9 K;
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
    public final in3 a0;
    public sr b;
    public ArrayList b0;
    public sr c;
    public final cf9 c0;
    public jq d;
    public jvb d0;
    public lq e;
    public b9 e0;
    public final Drawable f;
    public evb f0;
    public boolean g0;
    public final CharSequence h;
    public OnBackInvokedCallback h0;
    public OnBackInvokedDispatcher i0;
    public boolean j0;
    public final zka k0;
    public jq n;
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
        this.a0 = new in3(new cvb(this, (byte) 1));
        this.b0 = new ArrayList();
        this.c0 = new cf9((Object) this, (byte) 15);
        this.k0 = new zka((Object) this, (byte) 9);
        Context context2 = getContext();
        int[] iArr = k09.x;
        wm9 v = wm9.v(context2, attributeSet, iArr, R.attr.toolbarStyle);
        kfc.j(this, context, iArr, attributeSet, (TypedArray) v.c, R.attr.toolbarStyle);
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
        po9 po9Var = this.K;
        po9Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            po9Var.e = dimensionPixelSize;
            po9Var.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            po9Var.f = dimensionPixelSize2;
            po9Var.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            po9Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.L = typedArray.getDimensionPixelOffset(10, TLObject.FLAG_31);
        this.M = typedArray.getDimensionPixelOffset(6, TLObject.FLAG_31);
        this.f = v.j(4);
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
        Drawable j = v.j(16);
        if (j != null) {
            setNavigationIcon(j);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable j2 = v.j(11);
        if (j2 != null) {
            setLogo(j2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(v.i(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(v.i(20));
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
        return new zdb(getContext());
    }

    public static fvb h() {
        fvb fvbVar = new fvb(-2, -2);
        fvbVar.b = (byte) 0;
        fvbVar.a = 8388627;
        return fvbVar;
    }

    public static fvb i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof fvb;
        if (z) {
            fvb fvbVar = (fvb) layoutParams;
            fvb fvbVar2 = new fvb(fvbVar);
            fvbVar2.b = (byte) 0;
            fvbVar2.b = fvbVar.b;
            return fvbVar2;
        }
        if (z) {
            fvb fvbVar3 = new fvb((fvb) layoutParams);
            fvbVar3.b = (byte) 0;
            return fvbVar3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            fvb fvbVar4 = new fvb(layoutParams);
            fvbVar4.b = (byte) 0;
            return fvbVar4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        fvb fvbVar5 = new fvb(marginLayoutParams);
        fvbVar5.b = (byte) 0;
        ((ViewGroup.MarginLayoutParams) fvbVar5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) fvbVar5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) fvbVar5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) fvbVar5).bottomMargin = marginLayoutParams.bottomMargin;
        return fvbVar5;
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
        WeakHashMap weakHashMap = kfc.a;
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                fvb fvbVar = (fvb) childAt.getLayoutParams();
                if (fvbVar.b == 0 && s(childAt)) {
                    int i3 = fvbVar.a;
                    WeakHashMap weakHashMap2 = kfc.a;
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
            fvb fvbVar2 = (fvb) childAt2.getLayoutParams();
            if (fvbVar2.b == 0 && s(childAt2)) {
                int i5 = fvbVar2.a;
                WeakHashMap weakHashMap3 = kfc.a;
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
        fvb h = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (fvb) layoutParams;
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
            jq jqVar = new jq(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.n = jqVar;
            jqVar.setImageDrawable(this.f);
            this.n.setContentDescription(this.h);
            fvb h = h();
            h.a = (this.E & nm7.w1) | 8388611;
            h.b = (byte) 2;
            this.n.setLayoutParams(h);
            this.n.setOnClickListener(new g6(this, (byte) 16));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof fvb);
    }

    public final void d() {
        if (this.K == null) {
            po9 po9Var = new po9();
            po9Var.a = 0;
            po9Var.b = 0;
            po9Var.c = TLObject.FLAG_31;
            po9Var.d = TLObject.FLAG_31;
            po9Var.e = 0;
            po9Var.f = 0;
            po9Var.g = false;
            po9Var.h = false;
            this.K = po9Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.G == null) {
            y17 y17Var = (y17) actionMenuView.getMenu();
            if (this.f0 == null) {
                this.f0 = new evb(this);
            }
            this.a.setExpandedActionViewsExclusive(true);
            y17Var.b(this.f0, this.s);
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
            oo8 oo8Var = new oo8(this, (byte) 20);
            actionMenuView2.getClass();
            actionMenuView2.L = oo8Var;
            fvb h = h();
            h.a = (this.E & nm7.w1) | 8388613;
            this.a.setLayoutParams(h);
            b(this.a, false);
        }
    }

    public final void g() {
        if (this.d == null) {
            this.d = new jq(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            fvb h = h();
            h.a = (this.E & nm7.w1) | 8388611;
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
        fvb fvbVar = new fvb(context, attributeSet);
        fvbVar.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k09.b);
        fvbVar.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        fvbVar.b = (byte) 0;
        return fvbVar;
    }

    public CharSequence getCollapseContentDescription() {
        jq jqVar = this.n;
        if (jqVar != null) {
            return jqVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        jq jqVar = this.n;
        if (jqVar != null) {
            return jqVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        po9 po9Var = this.K;
        if (po9Var != null) {
            return po9Var.g ? po9Var.a : po9Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.M;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        po9 po9Var = this.K;
        if (po9Var != null) {
            return po9Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        po9 po9Var = this.K;
        if (po9Var != null) {
            return po9Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        po9 po9Var = this.K;
        if (po9Var != null) {
            return po9Var.g ? po9Var.b : po9Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.L;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        y17 y17Var;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (y17Var = actionMenuView.G) == null || !y17Var.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.M, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = kfc.a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = kfc.a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.L, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        lq lqVar = this.e;
        if (lqVar != null) {
            return lqVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        lq lqVar = this.e;
        if (lqVar != null) {
            return lqVar.getContentDescription();
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
        jq jqVar = this.d;
        if (jqVar != null) {
            return jqVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        jq jqVar = this.d;
        if (jqVar != null) {
            return jqVar.getDrawable();
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

    public sa3 getWrapper() {
        Drawable drawable;
        jvb jvbVar = this.d0;
        if (jvbVar == null) {
            jvbVar = new jvb();
            jvbVar.n = 0;
            jvbVar.a = this;
            jvbVar.h = getTitle();
            jvbVar.i = getSubtitle();
            jvbVar.g = jvbVar.h != null;
            jvbVar.f = getNavigationIcon();
            wm9 v = wm9.v(getContext(), null, k09.a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) v.c;
            jvbVar.o = v.j(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                jvbVar.g = true;
                jvbVar.h = text;
                if ((jvbVar.b & 8) != 0) {
                    setTitle(text);
                    if (jvbVar.g) {
                        kfc.l(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                jvbVar.i = text2;
                if ((jvbVar.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable j = v.j(20);
            if (j != null) {
                jvbVar.e = j;
                jvbVar.c();
            }
            Drawable j2 = v.j(17);
            if (j2 != null) {
                jvbVar.d = j2;
                jvbVar.c();
            }
            if (jvbVar.f == null && (drawable = jvbVar.o) != null) {
                jvbVar.f = drawable;
                if ((jvbVar.b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            jvbVar.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = jvbVar.c;
                if (view != null && (jvbVar.b & 16) != 0) {
                    removeView(view);
                }
                jvbVar.c = inflate;
                if (inflate != null && (jvbVar.b & 16) != 0) {
                    addView(inflate);
                }
                jvbVar.a(jvbVar.b | 16);
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
                sr srVar = this.b;
                if (srVar != null) {
                    srVar.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.y = resourceId3;
                sr srVar2 = this.c;
                if (srVar2 != null) {
                    srVar2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            v.y();
            if (R.string.abc_action_bar_up_description != jvbVar.n) {
                jvbVar.n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = jvbVar.n;
                    jvbVar.j = i != 0 ? getContext().getString(i) : null;
                    jvbVar.b();
                }
            }
            jvbVar.j = getNavigationContentDescription();
            setNavigationOnClickListener(new sd3(jvbVar));
            this.d0 = jvbVar;
        }
        return jvbVar;
    }

    public final int j(int i, View view) {
        fvb fvbVar = (fvb) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = fvbVar.a & nm7.w1;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.N & nm7.w1;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fvbVar).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) fvbVar).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) fvbVar).bottomMargin;
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
            ((aq4) it.next()).a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.b0 = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.V.contains(view);
    }

    public final int o(View view, int i, int i2, int[] iArr) {
        fvb fvbVar = (fvb) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) fvbVar).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int j = j(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j, max + measuredWidth, view.getMeasuredHeight() + j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) fvbVar).rightMargin + max;
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
        sr srVar;
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
        WeakHashMap weakHashMap = kfc.a;
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
            jq jqVar = this.d;
            if (z3) {
                i6 = p(jqVar, i19, min, iArr);
                i5 = paddingLeft;
                if (s(this.n)) {
                    jq jqVar2 = this.n;
                    if (z3) {
                        i6 = p(jqVar2, i6, min, iArr);
                    } else {
                        i5 = o(jqVar2, i5, min, iArr);
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
                    lq lqVar = this.e;
                    if (z3) {
                        min2 = p(lqVar, min2, min, iArr);
                    } else {
                        max = o(lqVar, max, min, iArr);
                    }
                }
                s = s(this.b);
                s2 = s(this.c);
                if (s) {
                    z2 = z3;
                    i7 = 0;
                } else {
                    fvb fvbVar = (fvb) this.b.getLayoutParams();
                    z2 = z3;
                    i7 = this.b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fvbVar).topMargin + ((ViewGroup.MarginLayoutParams) fvbVar).bottomMargin;
                }
                if (s2) {
                    fvb fvbVar2 = (fvb) this.c.getLayoutParams();
                    i7 = this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fvbVar2).topMargin + ((ViewGroup.MarginLayoutParams) fvbVar2).bottomMargin + i7;
                }
                if (s) {
                    if (s2) {
                        srVar = this.c;
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
                        fvb fvbVar3 = (fvb) view2.getLayoutParams();
                        int i24 = i21;
                        int i25 = ((ViewGroup.MarginLayoutParams) fvbVar3).leftMargin - i22;
                        int i26 = ((ViewGroup.MarginLayoutParams) fvbVar3).rightMargin - i24;
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
                srVar = this.b;
                sr srVar2 = !s2 ? this.c : this.b;
                fvb fvbVar4 = (fvb) srVar.getLayoutParams();
                fvb fvbVar5 = (fvb) srVar2.getLayoutParams();
                int i28 = i7;
                boolean z4 = (!s && this.b.getMeasuredWidth() > 0) || (s2 && this.c.getMeasuredWidth() > 0);
                i14 = this.N & nm7.w1;
                int i29 = max;
                if (i14 != 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) fvbVar4).topMargin + this.I;
                } else if (i14 != 80) {
                    int i30 = (((height - paddingTop2) - paddingBottom) - i28) / 2;
                    int i31 = ((ViewGroup.MarginLayoutParams) fvbVar4).topMargin + this.I;
                    if (i30 < i31) {
                        i30 = i31;
                    } else {
                        int i32 = (((height - paddingBottom) - i28) - i30) - paddingTop2;
                        int i33 = ((ViewGroup.MarginLayoutParams) fvbVar4).bottomMargin;
                        int i34 = this.J;
                        if (i32 < i33 + i34) {
                            i30 = Math.max(0, i30 - ((((ViewGroup.MarginLayoutParams) fvbVar5).bottomMargin + i34) - i32));
                        }
                    }
                    paddingTop = paddingTop2 + i30;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) fvbVar5).bottomMargin) - this.J) - i28;
                }
                if (z2) {
                    int i35 = (z4 ? this.G : 0) - iArr[0];
                    max = Math.max(0, i35) + i29;
                    iArr[0] = Math.max(0, -i35);
                    if (s) {
                        fvb fvbVar6 = (fvb) this.b.getLayoutParams();
                        int measuredWidth = this.b.getMeasuredWidth() + max;
                        int measuredHeight = this.b.getMeasuredHeight() + paddingTop;
                        this.b.layout(max, paddingTop, measuredWidth, measuredHeight);
                        i15 = measuredWidth + this.H;
                        paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) fvbVar6).bottomMargin;
                    } else {
                        i15 = max;
                    }
                    if (s2) {
                        int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((fvb) this.c.getLayoutParams())).topMargin;
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
                        fvb fvbVar7 = (fvb) this.b.getLayoutParams();
                        int measuredWidth3 = min2 - this.b.getMeasuredWidth();
                        int measuredHeight2 = this.b.getMeasuredHeight() + paddingTop;
                        this.b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                        i17 = measuredWidth3 - this.H;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) fvbVar7).bottomMargin;
                    } else {
                        i17 = min2;
                    }
                    if (s2) {
                        int i38 = paddingTop + ((ViewGroup.MarginLayoutParams) ((fvb) this.c.getLayoutParams())).topMargin;
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
            i5 = o(jqVar, paddingLeft, min, iArr);
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
        fvb fvbVar42 = (fvb) srVar.getLayoutParams();
        fvb fvbVar52 = (fvb) srVar2.getLayoutParams();
        int i282 = i7;
        if (s) {
        }
        i14 = this.N & nm7.w1;
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
        boolean a = ghc.a(this);
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
            if (((fvb) childAt.getLayoutParams()).b == 0 && s(childAt)) {
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
        if (!(parcelable instanceof hvb)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        hvb hvbVar = (hvb) parcelable;
        super.onRestoreInstanceState(hvbVar.a);
        ActionMenuView actionMenuView = this.a;
        y17 y17Var = actionMenuView != null ? actionMenuView.G : null;
        int i = hvbVar.c;
        if (i != 0 && this.f0 != null && y17Var != null && (findItem = y17Var.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (hvbVar.d) {
            zka zkaVar = this.k0;
            removeCallbacks(zkaVar);
            post(zkaVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        po9 po9Var = this.K;
        boolean z = i == 1;
        if (z == po9Var.g) {
            return;
        }
        po9Var.g = z;
        if (!po9Var.h) {
            po9Var.a = po9Var.e;
            po9Var.b = po9Var.f;
            return;
        }
        if (z) {
            int i2 = po9Var.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = po9Var.e;
            }
            po9Var.a = i2;
            int i3 = po9Var.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = po9Var.f;
            }
            po9Var.b = i3;
            return;
        }
        int i4 = po9Var.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = po9Var.e;
        }
        po9Var.a = i4;
        int i5 = po9Var.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = po9Var.f;
        }
        po9Var.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        b9 b9Var;
        c27 c27Var;
        hvb hvbVar = new hvb(super.onSaveInstanceState());
        evb evbVar = this.f0;
        if (evbVar != null && (c27Var = evbVar.b) != null) {
            hvbVar.c = c27Var.a;
        }
        ActionMenuView actionMenuView = this.a;
        hvbVar.d = (actionMenuView == null || (b9Var = actionMenuView.K) == null || !b9Var.f()) ? false : true;
        return hvbVar;
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
        fvb fvbVar = (fvb) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) fvbVar).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int j = j(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j, max, view.getMeasuredHeight() + j);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) fvbVar).leftMargin);
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
        jq jqVar = this.n;
        if (jqVar != null) {
            jqVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.n.setImageDrawable(drawable);
        } else {
            jq jqVar = this.n;
            if (jqVar != null) {
                jqVar.setImageDrawable(this.f);
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
        lq lqVar = this.e;
        if (drawable != null) {
            if (lqVar == null) {
                lqVar = new lq(getContext(), null, 0);
                this.e = lqVar;
            }
            if (!n(lqVar)) {
                b(this.e, true);
            }
        } else if (lqVar != null && n(lqVar)) {
            removeView(this.e);
            this.V.remove(this.e);
        }
        lq lqVar2 = this.e;
        if (lqVar2 != null) {
            lqVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.e == null) {
            this.e = new lq(getContext(), null, 0);
        }
        lq lqVar = this.e;
        if (lqVar != null) {
            lqVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        jq jqVar = this.d;
        if (jqVar != null) {
            jqVar.setContentDescription(charSequence);
            wxe.a(this.d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.d)) {
                b(this.d, true);
            }
        } else {
            jq jqVar = this.d;
            if (jqVar != null && n(jqVar)) {
                removeView(this.d);
                this.V.remove(this.d);
            }
        }
        jq jqVar2 = this.d;
        if (jqVar2 != null) {
            jqVar2.setImageDrawable(drawable);
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
        sr srVar = this.c;
        if (!isEmpty) {
            if (srVar == null) {
                Context context = getContext();
                sr srVar2 = new sr(context, null);
                this.c = srVar2;
                srVar2.setSingleLine();
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
        } else if (srVar != null && n(srVar)) {
            removeView(this.c);
            this.V.remove(this.c);
        }
        sr srVar3 = this.c;
        if (srVar3 != null) {
            srVar3.setText(charSequence);
        }
        this.P = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.R = colorStateList;
        sr srVar = this.c;
        if (srVar != null) {
            srVar.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        sr srVar = this.b;
        if (!isEmpty) {
            if (srVar == null) {
                Context context = getContext();
                sr srVar2 = new sr(context, null);
                this.b = srVar2;
                srVar2.setSingleLine();
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
        } else if (srVar != null && n(srVar)) {
            removeView(this.b);
            this.V.remove(this.b);
        }
        sr srVar3 = this.b;
        if (srVar3 != null) {
            srVar3.setText(charSequence);
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
        sr srVar = this.b;
        if (srVar != null) {
            srVar.setTextColor(colorStateList);
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
        OnBackInvokedDispatcher a = dvb.a(this);
        evb evbVar = this.f0;
        byte b = 0;
        if (evbVar != null && evbVar.b != null && a != null) {
            WeakHashMap weakHashMap = kfc.a;
            if (isAttachedToWindow() && this.j0) {
                z = true;
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.i0;
                if (z) {
                    if (onBackInvokedDispatcher != null) {
                        dvb.d(onBackInvokedDispatcher, this.h0);
                        this.i0 = null;
                        return;
                    }
                    return;
                }
                if (onBackInvokedDispatcher == null) {
                    OnBackInvokedCallback onBackInvokedCallback = this.h0;
                    if (onBackInvokedCallback == null) {
                        onBackInvokedCallback = dvb.b(new cvb(this, b));
                        this.h0 = onBackInvokedCallback;
                    }
                    dvb.c(a, onBackInvokedCallback);
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
        setCollapseIcon(kod.a(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setOnMenuItemClickListener(gvb gvbVar) {
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(kod.a(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(kod.a(getContext(), i));
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
