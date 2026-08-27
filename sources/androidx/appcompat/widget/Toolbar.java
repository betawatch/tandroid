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
import g7.o7;
import h7.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.h;
import l.l;
import l.n;
import m.a1;
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
import m.p3;
import m.v;
import m.w;
import m.w3;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import r0.j0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public final int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public p2 F;
    public int G;
    public int H;
    public final int I;
    public CharSequence J;
    public CharSequence K;
    public ColorStateList L;
    public ColorStateList M;
    public boolean N;
    public boolean O;
    public final ArrayList P;
    public final ArrayList Q;
    public final int[] R;
    public final j9.a S;
    public ArrayList T;
    public final ga.c U;
    public p3 V;
    public i W;
    public ActionMenuView a;
    public k3 a0;
    public a1 b;
    public boolean b0;
    public a1 c;
    public OnBackInvokedCallback c0;
    public v d;
    public OnBackInvokedDispatcher d0;
    public w e;
    public boolean e0;
    public final Drawable f;
    public final i3 f0;
    public final CharSequence h;
    public v n;
    public View r;
    public Context s;
    public int v;
    public int w;
    public int x;
    public final int y;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.I = 8388627;
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = new int[2];
        this.S = new j9.a(new h3(this, 1));
        this.T = new ArrayList();
        this.U = new ga.c(this, 24);
        this.f0 = new i3(this, 0);
        Context context2 = getContext();
        int[] iArr = f.a.x;
        j9.a G = j9.a.G(context2, attributeSet, iArr, R.attr.toolbarStyle);
        j0.j(this, context, iArr, attributeSet, (TypedArray) G.c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) G.c;
        this.w = typedArray.getResourceId(28, 0);
        this.x = typedArray.getResourceId(19, 0);
        this.I = typedArray.getInteger(0, 8388627);
        this.y = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.E = dimensionPixelOffset;
        this.D = dimensionPixelOffset;
        this.C = dimensionPixelOffset;
        this.B = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.B = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.C = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.D = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.E = dimensionPixelOffset5;
        }
        this.A = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, TLObject.FLAG_31);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, TLObject.FLAG_31);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        p2 p2Var = this.F;
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
        this.G = typedArray.getDimensionPixelOffset(10, TLObject.FLAG_31);
        this.H = typedArray.getDimensionPixelOffset(6, TLObject.FLAG_31);
        this.f = G.y(4);
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
        Drawable y10 = G.y(16);
        if (y10 != null) {
            setNavigationIcon(y10);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable y11 = G.y(11);
        if (y11 != null) {
            setLogo(y11);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(G.x(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(G.x(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        G.I();
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

    public static l3 h() {
        l3 l3Var = new l3(-2, -2);
        l3Var.b = 0;
        l3Var.a = 8388627;
        return l3Var;
    }

    public static l3 i(ViewGroup.LayoutParams layoutParams) {
        boolean z10 = layoutParams instanceof l3;
        if (z10) {
            l3 l3Var = (l3) layoutParams;
            l3 l3Var2 = new l3(l3Var);
            l3Var2.b = 0;
            l3Var2.b = l3Var.b;
            return l3Var2;
        }
        if (z10) {
            l3 l3Var3 = new l3((l3) layoutParams);
            l3Var3.b = 0;
            return l3Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            l3 l3Var4 = new l3(layoutParams);
            l3Var4.b = 0;
            return l3Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        l3 l3Var5 = new l3(marginLayoutParams);
        l3Var5.b = 0;
        ((ViewGroup.MarginLayoutParams) l3Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) l3Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) l3Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) l3Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return l3Var5;
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
        WeakHashMap weakHashMap = j0.a;
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection());
        arrayList.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                l3 l3Var = (l3) childAt.getLayoutParams();
                if (l3Var.b == 0 && s(childAt)) {
                    int i12 = l3Var.a;
                    WeakHashMap weakHashMap2 = j0.a;
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
            l3 l3Var2 = (l3) childAt2.getLayoutParams();
            if (l3Var2.b == 0 && s(childAt2)) {
                int i14 = l3Var2.a;
                WeakHashMap weakHashMap3 = j0.a;
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
        l3 h = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (l3) layoutParams;
        h.b = 1;
        if (!z10 || this.r == null) {
            addView(view, h);
        } else {
            view.setLayoutParams(h);
            this.Q.add(view);
        }
    }

    public final void c() {
        if (this.n == null) {
            v vVar = new v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.n = vVar;
            vVar.setImageDrawable(this.f);
            this.n.setContentDescription(this.h);
            l3 h = h();
            h.a = (this.y & 112) | 8388611;
            h.b = 2;
            this.n.setLayoutParams(h);
            this.n.setOnClickListener(new g.a(this, 2));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof l3);
    }

    public final void d() {
        if (this.F == null) {
            p2 p2Var = new p2();
            p2Var.a = 0;
            p2Var.b = 0;
            p2Var.c = TLObject.FLAG_31;
            p2Var.d = TLObject.FLAG_31;
            p2Var.e = 0;
            p2Var.f = 0;
            p2Var.g = false;
            p2Var.h = false;
            this.F = p2Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.B == null) {
            l lVar = (l) actionMenuView.getMenu();
            if (this.a0 == null) {
                this.a0 = new k3(this);
            }
            this.a.setExpandedActionViewsExclusive(true);
            lVar.b(this.a0, this.s);
            t();
        }
    }

    public final void f() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.a = actionMenuView;
            actionMenuView.setPopupTheme(this.v);
            this.a.setOnMenuItemClickListener(this.U);
            ActionMenuView actionMenuView2 = this.a;
            k5.i iVar = new k5.i(this, 26);
            actionMenuView2.getClass();
            actionMenuView2.G = iVar;
            l3 h = h();
            h.a = (this.y & 112) | 8388613;
            this.a.setLayoutParams(h);
            b(this.a, false);
        }
    }

    public final void g() {
        if (this.d == null) {
            this.d = new v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            l3 h = h();
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
        p2 p2Var = this.F;
        if (p2Var != null) {
            return p2Var.g ? p2Var.a : p2Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.H;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        p2 p2Var = this.F;
        if (p2Var != null) {
            return p2Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        p2 p2Var = this.F;
        if (p2Var != null) {
            return p2Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        p2 p2Var = this.F;
        if (p2Var != null) {
            return p2Var.g ? p2Var.b : p2Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.G;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        l lVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (lVar = actionMenuView.B) == null || !lVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.H, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = j0.a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = j0.a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.G, 0)) : getContentInsetStart();
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
        return this.W;
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
        return this.K;
    }

    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.J;
    }

    public int getTitleMarginBottom() {
        return this.E;
    }

    public int getTitleMarginEnd() {
        return this.C;
    }

    public int getTitleMarginStart() {
        return this.B;
    }

    public int getTitleMarginTop() {
        return this.D;
    }

    public final TextView getTitleTextView() {
        return this.b;
    }

    public l1 getWrapper() {
        Drawable drawable;
        if (this.V == null) {
            p3 p3Var = new p3();
            p3Var.n = 0;
            p3Var.a = this;
            p3Var.h = getTitle();
            p3Var.i = getSubtitle();
            p3Var.g = p3Var.h != null;
            p3Var.f = getNavigationIcon();
            j9.a G = j9.a.G(getContext(), null, f.a.a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) G.c;
            p3Var.o = G.y(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                p3Var.g = true;
                p3Var.h = text;
                if ((p3Var.b & 8) != 0) {
                    setTitle(text);
                    if (p3Var.g) {
                        j0.l(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                p3Var.i = text2;
                if ((p3Var.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable y10 = G.y(20);
            if (y10 != null) {
                p3Var.e = y10;
                p3Var.c();
            }
            Drawable y11 = G.y(17);
            if (y11 != null) {
                p3Var.d = y11;
                p3Var.c();
            }
            if (p3Var.f == null && (drawable = p3Var.o) != null) {
                p3Var.f = drawable;
                if ((p3Var.b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            p3Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = p3Var.c;
                if (view != null && (p3Var.b & 16) != 0) {
                    removeView(view);
                }
                p3Var.c = inflate;
                if (inflate != null && (p3Var.b & 16) != 0) {
                    addView(inflate);
                }
                p3Var.a(p3Var.b | 16);
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
                this.F.a(max, max2);
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
            G.I();
            if (R.string.abc_action_bar_up_description != p3Var.n) {
                p3Var.n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i10 = p3Var.n;
                    p3Var.j = i10 != 0 ? getContext().getString(i10) : null;
                    p3Var.b();
                }
            }
            p3Var.j = getNavigationContentDescription();
            setNavigationOnClickListener(new o3(p3Var));
            this.V = p3Var;
        }
        return this.V;
    }

    public final int j(int i10, View view) {
        l3 l3Var = (l3) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int i12 = l3Var.a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.I & 112;
        }
        if (i12 == 48) {
            return getPaddingTop() - i11;
        }
        if (i12 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) l3Var).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i13 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i14 = ((ViewGroup.MarginLayoutParams) l3Var).topMargin;
        if (i13 < i14) {
            i13 = i14;
        } else {
            int i15 = (((height - paddingBottom) - measuredHeight) - i13) - paddingTop;
            int i16 = ((ViewGroup.MarginLayoutParams) l3Var).bottomMargin;
            if (i15 < i16) {
                i13 = Math.max(0, i13 - (i16 - i15));
            }
        }
        return paddingTop + i13;
    }

    public final void m() {
        ArrayList arrayList = this.T;
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
        Iterator it = ((CopyOnWriteArrayList) this.S.d).iterator();
        while (it.hasNext()) {
            ((b0) it.next()).a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.T = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.Q.contains(view);
    }

    public final int o(View view, int i10, int i11, int[] iArr) {
        l3 l3Var = (l3) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) l3Var).leftMargin - iArr[0];
        int max = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int j10 = j(i11, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j10, max + measuredWidth, view.getMeasuredHeight() + j10);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) l3Var).rightMargin + max;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f0);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.O = false;
        }
        if (!this.O) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.O = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.O = false;
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
        WeakHashMap weakHashMap = j0.a;
        boolean z12 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i28 = width - paddingRight;
        int[] iArr = this.R;
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
                    l3 l3Var = (l3) this.b.getLayoutParams();
                    z11 = z12;
                    i16 = this.b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) l3Var).topMargin + ((ViewGroup.MarginLayoutParams) l3Var).bottomMargin;
                }
                if (!s11) {
                    l3 l3Var2 = (l3) this.c.getLayoutParams();
                    i16 = this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) l3Var2).topMargin + ((ViewGroup.MarginLayoutParams) l3Var2).bottomMargin + i16;
                }
                if (!s10 || s11) {
                    a1 a1Var = !s10 ? this.b : this.c;
                    a1 a1Var2 = !s11 ? this.c : this.b;
                    l3 l3Var3 = (l3) a1Var.getLayoutParams();
                    l3 l3Var4 = (l3) a1Var2.getLayoutParams();
                    int i29 = i16;
                    boolean z13 = (!s10 && this.b.getMeasuredWidth() > 0) || (s11 && this.c.getMeasuredWidth() > 0);
                    i17 = this.I & 112;
                    int i30 = max;
                    if (i17 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) l3Var3).topMargin + this.D;
                    } else if (i17 != 80) {
                        int i31 = (((height - paddingTop2) - paddingBottom) - i29) / 2;
                        int i32 = ((ViewGroup.MarginLayoutParams) l3Var3).topMargin + this.D;
                        if (i31 < i32) {
                            i31 = i32;
                        } else {
                            int i33 = (((height - paddingBottom) - i29) - i31) - paddingTop2;
                            int i34 = ((ViewGroup.MarginLayoutParams) l3Var3).bottomMargin;
                            int i35 = this.E;
                            if (i33 < i34 + i35) {
                                i31 = Math.max(0, i31 - ((((ViewGroup.MarginLayoutParams) l3Var4).bottomMargin + i35) - i33));
                            }
                        }
                        paddingTop = paddingTop2 + i31;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) l3Var4).bottomMargin) - this.E) - i29;
                    }
                    if (z11) {
                        int i36 = (z13 ? this.B : 0) - iArr[0];
                        max = Math.max(0, i36) + i30;
                        iArr[0] = Math.max(0, -i36);
                        if (s10) {
                            l3 l3Var5 = (l3) this.b.getLayoutParams();
                            int measuredWidth = this.b.getMeasuredWidth() + max;
                            int measuredHeight = this.b.getMeasuredHeight() + paddingTop;
                            this.b.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i18 = measuredWidth + this.C;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) l3Var5).bottomMargin;
                        } else {
                            i18 = max;
                        }
                        if (s11) {
                            int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((l3) this.c.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.c.getMeasuredWidth() + max;
                            this.c.layout(max, i37, measuredWidth2, this.c.getMeasuredHeight() + i37);
                            i19 = measuredWidth2 + this.C;
                        } else {
                            i19 = max;
                        }
                        if (z13) {
                            max = Math.max(i18, i19);
                        }
                    } else {
                        int i38 = (z13 ? this.B : 0) - iArr[1];
                        min2 -= Math.max(0, i38);
                        iArr[1] = Math.max(0, -i38);
                        if (s10) {
                            l3 l3Var6 = (l3) this.b.getLayoutParams();
                            int measuredWidth3 = min2 - this.b.getMeasuredWidth();
                            int measuredHeight2 = this.b.getMeasuredHeight() + paddingTop;
                            this.b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i20 = measuredWidth3 - this.C;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) l3Var6).bottomMargin;
                        } else {
                            i20 = min2;
                        }
                        if (s11) {
                            int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((l3) this.c.getLayoutParams())).topMargin;
                            this.c.layout(min2 - this.c.getMeasuredWidth(), i39, min2, this.c.getMeasuredHeight() + i39);
                            i21 = min2 - this.C;
                        } else {
                            i21 = min2;
                        }
                        if (z13) {
                            min2 = Math.min(i20, i21);
                        }
                        max = i30;
                    }
                }
                ArrayList arrayList = this.P;
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
                    l3 l3Var7 = (l3) view.getLayoutParams();
                    int i44 = i41;
                    int i45 = ((ViewGroup.MarginLayoutParams) l3Var7).leftMargin - i42;
                    int i46 = ((ViewGroup.MarginLayoutParams) l3Var7).rightMargin - i44;
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
        l3 l3Var32 = (l3) a1Var.getLayoutParams();
        l3 l3Var42 = (l3) a1Var2.getLayoutParams();
        int i292 = i16;
        if (s10) {
        }
        i17 = this.I & 112;
        int i302 = max;
        if (i17 != 48) {
        }
        if (z11) {
        }
        ArrayList arrayList2 = this.P;
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
        boolean a2 = w3.a(this);
        int i19 = !a2 ? 1 : 0;
        int i20 = 0;
        if (s(this.d)) {
            r(this.d, i10, 0, i11, this.A);
            i12 = k(this.d) + this.d.getMeasuredWidth();
            i13 = Math.max(0, l(this.d) + this.d.getMeasuredHeight());
            i14 = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (s(this.n)) {
            r(this.n, i10, 0, i11, this.A);
            i12 = k(this.n) + this.n.getMeasuredWidth();
            i13 = Math.max(i13, l(this.n) + this.n.getMeasuredHeight());
            i14 = View.combineMeasuredStates(i14, this.n.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i12);
        int max2 = Math.max(0, currentContentInsetStart - i12);
        int[] iArr = this.R;
        iArr[a2 ? 1 : 0] = max2;
        if (s(this.a)) {
            r(this.a, i10, max, i11, this.A);
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
            if (((l3) childAt.getLayoutParams()).b == 0 && s(childAt)) {
                max3 += q(childAt, i10, max3, i11, 0, iArr);
                int max4 = Math.max(i13, l(childAt) + childAt.getMeasuredHeight());
                i14 = View.combineMeasuredStates(i14, childAt.getMeasuredState());
                i13 = max4;
            } else {
                max3 = max3;
            }
        }
        int i22 = max3;
        int i23 = this.D + this.E;
        int i24 = this.B + this.C;
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
        if (this.b0) {
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
        if (!(parcelable instanceof n3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n3 n3Var = (n3) parcelable;
        super.onRestoreInstanceState(n3Var.a);
        ActionMenuView actionMenuView = this.a;
        l lVar = actionMenuView != null ? actionMenuView.B : null;
        int i10 = n3Var.c;
        if (i10 != 0 && this.a0 != null && lVar != null && (findItem = lVar.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (n3Var.d) {
            i3 i3Var = this.f0;
            removeCallbacks(i3Var);
            post(i3Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        d();
        p2 p2Var = this.F;
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
        n nVar;
        n3 n3Var = new n3(super.onSaveInstanceState());
        k3 k3Var = this.a0;
        if (k3Var != null && (nVar = k3Var.b) != null) {
            n3Var.c = nVar.a;
        }
        ActionMenuView actionMenuView = this.a;
        n3Var.d = (actionMenuView == null || (iVar = actionMenuView.F) == null || !iVar.g()) ? false : true;
        return n3Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.N = false;
        }
        if (!this.N) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.N = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.N = false;
        return true;
    }

    public final int p(View view, int i10, int i11, int[] iArr) {
        l3 l3Var = (l3) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) l3Var).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int j10 = j(i11, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j10, max, view.getMeasuredHeight() + j10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) l3Var).leftMargin);
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
        if (this.e0 != z10) {
            this.e0 = z10;
            t();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(o7.b(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.b0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = TLObject.FLAG_31;
        }
        if (i10 != this.H) {
            this.H = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = TLObject.FLAG_31;
        }
        if (i10 != this.G) {
            this.G = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(o7.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(o7.b(getContext(), i10));
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
        this.E = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.C = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.B = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.D = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public final void t() {
        boolean z10;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a2 = j3.a(this);
            k3 k3Var = this.a0;
            int i10 = 0;
            if (k3Var != null && k3Var.b != null && a2 != null) {
                WeakHashMap weakHashMap = j0.a;
                if (isAttachedToWindow() && this.e0) {
                    z10 = true;
                    if (!z10 && this.d0 == null) {
                        if (this.c0 == null) {
                            this.c0 = j3.b(new h3(this, i10));
                        }
                        j3.c(a2, this.c0);
                        this.d0 = a2;
                        return;
                    }
                    if (!z10 || (onBackInvokedDispatcher = this.d0) == null) {
                    }
                    j3.d(onBackInvokedDispatcher, this.c0);
                    this.d0 = null;
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

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        l3 l3Var = new l3(context, attributeSet);
        l3Var.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.b);
        l3Var.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        l3Var.b = 0;
        return l3Var;
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
                this.Q.remove(this.e);
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
            m.a(this.d, charSequence);
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
                this.Q.remove(this.d);
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
                this.Q.remove(this.c);
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
                ColorStateList colorStateList = this.M;
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
        this.K = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.M = colorStateList;
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
                this.Q.remove(this.b);
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
                ColorStateList colorStateList = this.L;
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
        this.J = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.L = colorStateList;
        a1 a1Var = this.b;
        if (a1Var != null) {
            a1Var.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(m3 m3Var) {
    }
}
