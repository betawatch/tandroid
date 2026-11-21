package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class fn0 extends org.telegram.ui.ActionBar.g2 {
    public static final org.telegram.ui.Components.dq0 E = new org.telegram.ui.Components.dq0(4);
    public final cn0 a;
    public final cn0 b;
    public org.telegram.ui.ActionBar.q0 c;
    public org.telegram.ui.Components.yt d;
    public boolean e;
    public final Paint f;
    public ScrollSlidingTextTabStrip h;
    public final org.telegram.ui.ActionBar.y4[] n;
    public AnimatorSet r;
    public boolean s;
    public boolean w;
    public boolean x;
    public int y;

    public fn0(HashMap hashMap, ArrayList arrayList, int i7, boolean z10, bn bnVar) {
        super(null);
        this.e = true;
        this.f = new Paint();
        this.n = new org.telegram.ui.ActionBar.y4[2];
        this.a = new cn0(0, null, hashMap, arrayList, i7, z10, bnVar, false);
        this.b = new cn0(1, null, hashMap, arrayList, i7, z10, bnVar, false);
    }

    public static void l0(fn0 fn0Var, float f10) {
        fn0Var.actionBar.setTranslationY(f10);
        int i7 = 0;
        while (true) {
            org.telegram.ui.ActionBar.y4[] y4VarArr = fn0Var.n;
            if (i7 >= y4VarArr.length) {
                fn0Var.fragmentView.invalidate();
                return;
            } else {
                ((org.telegram.ui.Components.ek0) y4VarArr[i7].f).setPinnedSectionOffsetY((int) f10);
                i7++;
            }
        }
    }

    public static void m0(fn0 fn0Var, String str) {
        fn0Var.c.getSearchField().setText(str);
        fn0Var.c.getSearchField().setSelection(str.length());
        fn0Var.actionBar.B();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        cn0 cn0Var = this.a;
        if (cn0Var != null) {
            cn0Var.addThemeColorKeys(hashSet);
        }
        cn0 cn0Var2 = this.b;
        if (cn0Var2 != null) {
            cn0Var2.addThemeColorKeys(hashSet);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.y4[] y4VarArr;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.l(kVar, 5, i7, null);
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 1, i7, null);
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 3, org.telegram.ui.ActionBar.m6.I5, null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        int i10 = 0;
        if (r4Var != null && ((ActionBarLayout) r4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f10 = 44.0f;
        this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new dv(this, 28));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, R.drawable.outline_header_search);
        a10.O();
        a10.I = new bi.w1(this, 19);
        this.c = a10;
        a10.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745565, null));
        EditTextBoldCursor searchField = this.c.getSearchField();
        org.telegram.ui.ActionBar.t6.U(searchField, i7, null);
        org.telegram.ui.ActionBar.t6.v(searchField, i7, null);
        org.telegram.ui.ActionBar.t6.D(searchField, org.telegram.ui.ActionBar.m6.Me, null);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i11 = org.telegram.ui.ActionBar.m6.Y9;
        int i12 = org.telegram.ui.ActionBar.m6.Z9;
        scrollSlidingTextTabStrip2.M = i11;
        scrollSlidingTextTabStrip2.N = i12;
        scrollSlidingTextTabStrip2.updateColors();
        this.actionBar.addView(this.h, c8.ma.e(-1, 44, 83));
        this.h.setDelegate(new dn0(this, i10));
        this.y = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        en0 en0Var = new en0(this, context);
        this.fragmentView = en0Var;
        en0Var.setWillNotDraw(false);
        cn0 cn0Var = this.a;
        cn0Var.setParentFragment(this);
        org.telegram.ui.Components.yt ytVar = cn0Var.e0;
        this.d = ytVar;
        ytVar.setSizeNotifierLayout(en0Var);
        int i13 = 0;
        while (i13 < 4) {
            View view = i13 != 0 ? i13 != 1 ? i13 != 2 ? cn0Var.d0 : cn0Var.c0 : cn0Var.b0 : cn0Var.a0;
            ((ViewGroup) view.getParent()).removeView(view);
            i13++;
        }
        FrameLayout frameLayout = cn0Var.a0;
        k0 k0Var = cn0Var.b0;
        uv uvVar = cn0Var.c0;
        View view2 = cn0Var.d0;
        org.telegram.ui.Components.yt ytVar2 = cn0Var.e0;
        cn0 cn0Var2 = this.b;
        cn0Var2.a0 = frameLayout;
        cn0Var2.b0 = k0Var;
        cn0Var2.e0 = ytVar2;
        cn0Var2.c0 = uvVar;
        cn0Var2.d0 = view2;
        cn0Var2.r0 = false;
        cn0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            y4VarArr = this.n;
            if (i14 >= y4VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.y4 y4Var = new org.telegram.ui.ActionBar.y4(this, context);
            y4VarArr[i14] = y4Var;
            float f11 = f10;
            en0Var.addView(y4Var, c8.ma.c(-1.0f, -1));
            if (i14 == 0) {
                org.telegram.ui.ActionBar.y4 y4Var2 = y4VarArr[i14];
                y4Var2.c = cn0Var;
                y4Var2.f = cn0Var.L;
            } else if (i14 == 1) {
                org.telegram.ui.ActionBar.y4 y4Var3 = y4VarArr[i14];
                y4Var3.c = cn0Var2;
                y4Var3.f = cn0Var2.L;
                y4Var3.setVisibility(8);
            }
            ((org.telegram.ui.Components.ek0) y4VarArr[i14].f).setScrollingTouchSlop(1);
            org.telegram.ui.ActionBar.y4 y4Var4 = y4VarArr[i14];
            y4Var4.d = (FrameLayout) ((org.telegram.ui.ActionBar.g2) y4Var4.c).getFragmentView();
            ((org.telegram.ui.Components.ek0) y4VarArr[i14].f).setClipToPadding(false);
            org.telegram.ui.ActionBar.y4 y4Var5 = y4VarArr[i14];
            y4Var5.e = ((org.telegram.ui.ActionBar.g2) y4Var5.c).getActionBar();
            org.telegram.ui.ActionBar.y4 y4Var6 = y4VarArr[i14];
            y4Var6.addView((FrameLayout) y4Var6.d, c8.ma.c(-1.0f, -1));
            org.telegram.ui.ActionBar.y4 y4Var7 = y4VarArr[i14];
            y4Var7.addView((org.telegram.ui.ActionBar.k) y4Var7.e, c8.ma.c(-2.0f, -1));
            ((org.telegram.ui.ActionBar.k) y4VarArr[i14].e).setVisibility(8);
            ((org.telegram.ui.Components.ek0) y4VarArr[i14].f).setOnScrollListener(new bi.h6(9, this, ((org.telegram.ui.Components.ek0) y4VarArr[i14].f).getOnScrollListener()));
            i14++;
            f10 = f11;
        }
        float f12 = f10;
        en0Var.addView(this.actionBar, c8.ma.c(-2.0f, -1));
        en0Var.addView(cn0Var.a0, c8.ma.e(-1, 48, 83));
        en0Var.addView(cn0Var.b0, c8.ma.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        en0Var.addView(cn0Var.c0, c8.ma.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, org.telegram.messenger.gd.N0(2131749077, null), null);
            this.h.a(1, org.telegram.messenger.gd.N0(2131750451, null), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(f12));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                y4VarArr[0].b = currentTabId;
            }
            this.h.c();
        }
        o0(false);
        this.e = this.h.getCurrentTabId() == this.h.getFirstTabId();
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | TLObject.FLAG_13);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Me));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.c.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.j5));
        int i7 = org.telegram.ui.ActionBar.m6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.h.getSelectorDrawable()}, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.e;
    }

    public final void o0(boolean z10) {
        org.telegram.ui.ActionBar.y4[] y4VarArr;
        int i7 = 0;
        while (true) {
            y4VarArr = this.n;
            if (i7 >= y4VarArr.length) {
                break;
            }
            ((org.telegram.ui.Components.ek0) y4VarArr[i7].f).C0();
            i7++;
        }
        ((org.telegram.ui.Components.ek0) y4VarArr[z10 ? 1 : 0].f).getAdapter();
        ((org.telegram.ui.Components.ek0) y4VarArr[z10 ? 1 : 0].f).setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((v4.c0) ((org.telegram.ui.Components.ek0) y4VarArr[z10 ? 1 : 0].f).getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        cn0 cn0Var = this.a;
        if (cn0Var != null) {
            cn0Var.onConfigurationChanged(configuration);
        }
        cn0 cn0Var2 = this.b;
        if (cn0Var2 != null) {
            cn0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        cn0 cn0Var = this.a;
        if (cn0Var != null) {
            cn0Var.onFragmentDestroy();
        }
        cn0 cn0Var2 = this.b;
        if (cn0Var2 != null) {
            cn0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onPause() {
        super.onPause();
        cn0 cn0Var = this.a;
        if (cn0Var != null) {
            cn0Var.onPause();
        }
        cn0 cn0Var2 = this.b;
        if (cn0Var2 != null) {
            cn0Var2.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.q0 q0Var = this.c;
        if (q0Var != null) {
            q0Var.G(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        cn0 cn0Var = this.a;
        if (cn0Var != null) {
            cn0Var.onResume();
        }
        cn0 cn0Var2 = this.b;
        if (cn0Var2 != null) {
            cn0Var2.onResume();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.q0 q0Var = this.c;
            if (q0Var != null && q0Var.getSearchField() != null) {
                this.c.getSearchField().setCursorColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.j5, false));
            }
            if (this.fragmentView != null) {
                boolean z10 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, false)) >= 0.721f;
                int systemUiVisibility = this.fragmentView.getSystemUiVisibility();
                int i7 = z10 ? systemUiVisibility | TLObject.FLAG_13 : systemUiVisibility & (-8193);
                if (i7 != systemUiVisibility) {
                    this.fragmentView.setSystemUiVisibility(i7);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            cn0 cn0Var = this.a;
            if (cn0Var != null && cn0Var.fragmentView != null) {
                cn0Var.onThemeColorsChanged();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        try {
            cn0 cn0Var2 = this.b;
            if (cn0Var2 == null || cn0Var2.fragmentView == null) {
                return;
            }
            cn0Var2.onThemeColorsChanged();
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
    }
}
