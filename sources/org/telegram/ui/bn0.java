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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class bn0 extends org.telegram.ui.ActionBar.e2 {
    public static final org.telegram.ui.Components.tp0 E = new org.telegram.ui.Components.tp0(4);
    public final ym0 a;
    public final ym0 b;
    public org.telegram.ui.ActionBar.q0 c;
    public org.telegram.ui.Components.rt d;
    public boolean e;
    public final Paint f;
    public ScrollSlidingTextTabStrip h;
    public final org.telegram.ui.ActionBar.v4[] n;
    public AnimatorSet r;
    public boolean s;
    public boolean w;
    public boolean x;
    public int y;

    public bn0(HashMap hashMap, ArrayList arrayList, int i7, boolean z10, an anVar) {
        super(null);
        this.e = true;
        this.f = new Paint();
        this.n = new org.telegram.ui.ActionBar.v4[2];
        this.a = new ym0(0, null, hashMap, arrayList, i7, z10, anVar, false);
        this.b = new ym0(1, null, hashMap, arrayList, i7, z10, anVar, false);
    }

    public static void l0(bn0 bn0Var, float f10) {
        bn0Var.actionBar.setTranslationY(f10);
        int i7 = 0;
        while (true) {
            org.telegram.ui.ActionBar.v4[] v4VarArr = bn0Var.n;
            if (i7 >= v4VarArr.length) {
                bn0Var.fragmentView.invalidate();
                return;
            } else {
                ((org.telegram.ui.Components.uj0) v4VarArr[i7].f).setPinnedSectionOffsetY((int) f10);
                i7++;
            }
        }
    }

    public static void m0(bn0 bn0Var, String str) {
        bn0Var.c.getSearchField().setText(str);
        bn0Var.c.getSearchField().setSelection(str.length());
        bn0Var.actionBar.B();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        ym0 ym0Var = this.a;
        if (ym0Var != null) {
            ym0Var.addThemeColorKeys(hashSet);
        }
        ym0 ym0Var2 = this.b;
        if (ym0Var2 != null) {
            ym0Var2.addThemeColorKeys(hashSet);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.v4[] v4VarArr;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.h5, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.l(kVar, 5, i7, null);
        org.telegram.ui.ActionBar.q6.l(this.actionBar, 1, i7, null);
        org.telegram.ui.ActionBar.q6.l(this.actionBar, 3, org.telegram.ui.ActionBar.j6.I5, null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        int i10 = 0;
        if (o4Var != null && ((ActionBarLayout) o4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f10 = 44.0f;
        this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new lx(this, 26));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, R.drawable.outline_header_search);
        a10.O();
        a10.I = new kg.x1(this, 18);
        this.c = a10;
        a10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745761, null));
        EditTextBoldCursor searchField = this.c.getSearchField();
        org.telegram.ui.ActionBar.q6.U(searchField, i7, null);
        org.telegram.ui.ActionBar.q6.v(searchField, i7, null);
        org.telegram.ui.ActionBar.q6.D(searchField, org.telegram.ui.ActionBar.j6.Me, null);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i11 = org.telegram.ui.ActionBar.j6.Y9;
        int i12 = org.telegram.ui.ActionBar.j6.Z9;
        scrollSlidingTextTabStrip2.M = i11;
        scrollSlidingTextTabStrip2.N = i12;
        scrollSlidingTextTabStrip2.updateColors();
        this.actionBar.addView(this.h, c8.ja.e(-1, 44, 83));
        this.h.setDelegate(new zm0(this, i10));
        this.y = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        an0 an0Var = new an0(this, context);
        this.fragmentView = an0Var;
        an0Var.setWillNotDraw(false);
        ym0 ym0Var = this.a;
        ym0Var.setParentFragment(this);
        org.telegram.ui.Components.rt rtVar = ym0Var.e0;
        this.d = rtVar;
        rtVar.setSizeNotifierLayout(an0Var);
        int i13 = 0;
        while (i13 < 4) {
            View view = i13 != 0 ? i13 != 1 ? i13 != 2 ? ym0Var.d0 : ym0Var.c0 : ym0Var.b0 : ym0Var.a0;
            ((ViewGroup) view.getParent()).removeView(view);
            i13++;
        }
        FrameLayout frameLayout = ym0Var.a0;
        k0 k0Var = ym0Var.b0;
        rv rvVar = ym0Var.c0;
        View view2 = ym0Var.d0;
        org.telegram.ui.Components.rt rtVar2 = ym0Var.e0;
        ym0 ym0Var2 = this.b;
        ym0Var2.a0 = frameLayout;
        ym0Var2.b0 = k0Var;
        ym0Var2.e0 = rtVar2;
        ym0Var2.c0 = rvVar;
        ym0Var2.d0 = view2;
        ym0Var2.r0 = false;
        ym0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            v4VarArr = this.n;
            if (i14 >= v4VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.v4 v4Var = new org.telegram.ui.ActionBar.v4(this, context);
            v4VarArr[i14] = v4Var;
            float f11 = f10;
            an0Var.addView(v4Var, c8.ja.c(-1.0f, -1));
            if (i14 == 0) {
                org.telegram.ui.ActionBar.v4 v4Var2 = v4VarArr[i14];
                v4Var2.c = ym0Var;
                v4Var2.f = ym0Var.L;
            } else if (i14 == 1) {
                org.telegram.ui.ActionBar.v4 v4Var3 = v4VarArr[i14];
                v4Var3.c = ym0Var2;
                v4Var3.f = ym0Var2.L;
                v4Var3.setVisibility(8);
            }
            ((org.telegram.ui.Components.uj0) v4VarArr[i14].f).setScrollingTouchSlop(1);
            org.telegram.ui.ActionBar.v4 v4Var4 = v4VarArr[i14];
            v4Var4.d = (FrameLayout) ((org.telegram.ui.ActionBar.e2) v4Var4.c).getFragmentView();
            ((org.telegram.ui.Components.uj0) v4VarArr[i14].f).setClipToPadding(false);
            org.telegram.ui.ActionBar.v4 v4Var5 = v4VarArr[i14];
            v4Var5.e = ((org.telegram.ui.ActionBar.e2) v4Var5.c).getActionBar();
            org.telegram.ui.ActionBar.v4 v4Var6 = v4VarArr[i14];
            v4Var6.addView((FrameLayout) v4Var6.d, c8.ja.c(-1.0f, -1));
            org.telegram.ui.ActionBar.v4 v4Var7 = v4VarArr[i14];
            v4Var7.addView((org.telegram.ui.ActionBar.k) v4Var7.e, c8.ja.c(-2.0f, -1));
            ((org.telegram.ui.ActionBar.k) v4VarArr[i14].e).setVisibility(8);
            ((org.telegram.ui.Components.uj0) v4VarArr[i14].f).setOnScrollListener(new bi.w3(9, this, ((org.telegram.ui.Components.uj0) v4VarArr[i14].f).getOnScrollListener()));
            i14++;
            f10 = f11;
        }
        float f12 = f10;
        an0Var.addView(this.actionBar, c8.ja.c(-2.0f, -1));
        an0Var.addView(ym0Var.a0, c8.ja.e(-1, 48, 83));
        an0Var.addView(ym0Var.b0, c8.ja.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        an0Var.addView(ym0Var.c0, c8.ja.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, org.telegram.messenger.hd.M0(2131749270, null), null);
            this.h.a(1, org.telegram.messenger.hd.M0(2131750468, null), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(f12));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                v4VarArr[0].b = currentTabId;
            }
            this.h.c();
        }
        o0(false);
        this.e = this.h.getCurrentTabId() == this.h.getFirstTabId();
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | TLObject.FLAG_13);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Me));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.c.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.j5));
        int i7 = org.telegram.ui.ActionBar.j6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.h.getSelectorDrawable()}, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.e;
    }

    public final void o0(boolean z10) {
        org.telegram.ui.ActionBar.v4[] v4VarArr;
        int i7 = 0;
        while (true) {
            v4VarArr = this.n;
            if (i7 >= v4VarArr.length) {
                break;
            }
            ((org.telegram.ui.Components.uj0) v4VarArr[i7].f).C0();
            i7++;
        }
        ((org.telegram.ui.Components.uj0) v4VarArr[z10 ? 1 : 0].f).getAdapter();
        ((org.telegram.ui.Components.uj0) v4VarArr[z10 ? 1 : 0].f).setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((v4.b0) ((org.telegram.ui.Components.uj0) v4VarArr[z10 ? 1 : 0].f).getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ym0 ym0Var = this.a;
        if (ym0Var != null) {
            ym0Var.onConfigurationChanged(configuration);
        }
        ym0 ym0Var2 = this.b;
        if (ym0Var2 != null) {
            ym0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        ym0 ym0Var = this.a;
        if (ym0Var != null) {
            ym0Var.onFragmentDestroy();
        }
        ym0 ym0Var2 = this.b;
        if (ym0Var2 != null) {
            ym0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onPause() {
        super.onPause();
        ym0 ym0Var = this.a;
        if (ym0Var != null) {
            ym0Var.onPause();
        }
        ym0 ym0Var2 = this.b;
        if (ym0Var2 != null) {
            ym0Var2.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.q0 q0Var = this.c;
        if (q0Var != null) {
            q0Var.G(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        ym0 ym0Var = this.a;
        if (ym0Var != null) {
            ym0Var.onResume();
        }
        ym0 ym0Var2 = this.b;
        if (ym0Var2 != null) {
            ym0Var2.onResume();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.q0 q0Var = this.c;
            if (q0Var != null && q0Var.getSearchField() != null) {
                this.c.getSearchField().setCursorColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.j5, false));
            }
            if (this.fragmentView != null) {
                boolean z10 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, false)) >= 0.721f;
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
            ym0 ym0Var = this.a;
            if (ym0Var != null && ym0Var.fragmentView != null) {
                ym0Var.onThemeColorsChanged();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        try {
            ym0 ym0Var2 = this.b;
            if (ym0Var2 == null || ym0Var2.fragmentView == null) {
                return;
            }
            ym0Var2.onThemeColorsChanged();
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
    }
}
