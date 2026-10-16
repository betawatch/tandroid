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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class kr0 extends org.telegram.ui.ActionBar.m2 {
    public static final org.telegram.ui.Components.js0 y = new org.telegram.ui.Components.js0(4);
    public final fr0 a;
    public final fr0 b;
    public org.telegram.ui.ActionBar.u0 c;
    public org.telegram.ui.Components.vu d;
    public boolean e;
    public final Paint f;
    public ScrollSlidingTextTabStrip h;
    public final ir0[] n;
    public AnimatorSet r;
    public boolean s;
    public boolean v;
    public boolean w;
    public int x;

    public kr0(HashMap hashMap, ArrayList arrayList, int i10, boolean z10, fo foVar) {
        super(null);
        this.e = true;
        this.f = new Paint();
        this.n = new ir0[2];
        this.a = new fr0(0, null, hashMap, arrayList, i10, z10, foVar, false);
        this.b = new fr0(1, null, hashMap, arrayList, i10, z10, foVar, false);
    }

    public static void g0(kr0 kr0Var, float f7) {
        kr0Var.actionBar.setTranslationY(f7);
        int i10 = 0;
        while (true) {
            ir0[] ir0VarArr = kr0Var.n;
            if (i10 >= ir0VarArr.length) {
                kr0Var.fragmentView.invalidate();
                return;
            } else {
                ir0VarArr[i10].d.setPinnedSectionOffsetY((int) f7);
                i10++;
            }
        }
    }

    public static void h0(kr0 kr0Var, String str) {
        kr0Var.c.getSearchField().setText(str);
        kr0Var.c.getSearchField().setSelection(str.length());
        kr0Var.actionBar.x();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        ir0[] ir0VarArr;
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.h5, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.j5;
        kVar.setTitleColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        this.actionBar.D(org.telegram.ui.ActionBar.g6.x0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f7 = 44.0f;
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 18));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 14);
        this.c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.c.getSearchField();
        searchField.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        searchField.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Vd, false));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i11 = org.telegram.ui.ActionBar.g6.Y9;
        int i12 = org.telegram.ui.ActionBar.g6.Z9;
        scrollSlidingTextTabStrip2.L = i11;
        scrollSlidingTextTabStrip2.M = i12;
        scrollSlidingTextTabStrip2.d();
        this.actionBar.addView(this.h, w7.z5.e(-1, 44, 83));
        this.h.setDelegate(new gr0(this));
        this.x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        hr0 hr0Var = new hr0(this, context);
        this.fragmentView = hr0Var;
        hr0Var.setWillNotDraw(false);
        fr0 fr0Var = this.a;
        fr0Var.setParentFragment(this);
        org.telegram.ui.Components.vu vuVar = fr0Var.d0;
        this.d = vuVar;
        vuVar.setSizeNotifierLayout(hr0Var);
        int i13 = 0;
        while (i13 < 4) {
            View view = i13 != 0 ? i13 != 1 ? i13 != 2 ? fr0Var.c0 : fr0Var.b0 : fr0Var.a0 : fr0Var.Z;
            ((ViewGroup) view.getParent()).removeView(view);
            i13++;
        }
        FrameLayout frameLayout = fr0Var.Z;
        l0 l0Var = fr0Var.a0;
        x50 x50Var = fr0Var.b0;
        View view2 = fr0Var.c0;
        org.telegram.ui.Components.vu vuVar2 = fr0Var.d0;
        fr0 fr0Var2 = this.b;
        fr0Var2.Z = frameLayout;
        fr0Var2.a0 = l0Var;
        fr0Var2.d0 = vuVar2;
        fr0Var2.b0 = x50Var;
        fr0Var2.c0 = view2;
        fr0Var2.q0 = false;
        fr0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            ir0VarArr = this.n;
            if (i14 >= ir0VarArr.length) {
                break;
            }
            ir0 ir0Var = new ir0(this, context);
            ir0VarArr[i14] = ir0Var;
            float f10 = f7;
            hr0Var.addView(ir0Var, w7.z5.d(-1.0f, -1));
            if (i14 == 0) {
                ir0 ir0Var2 = ir0VarArr[i14];
                ir0Var2.a = fr0Var;
                ir0Var2.d = fr0Var.K;
            } else if (i14 == 1) {
                ir0 ir0Var3 = ir0VarArr[i14];
                ir0Var3.a = fr0Var2;
                ir0Var3.d = fr0Var2.K;
                ir0Var3.setVisibility(8);
            }
            ir0VarArr[i14].d.setScrollingTouchSlop(1);
            ir0 ir0Var4 = ir0VarArr[i14];
            ir0Var4.b = (FrameLayout) ir0Var4.a.getFragmentView();
            ir0VarArr[i14].d.setClipToPadding(false);
            ir0 ir0Var5 = ir0VarArr[i14];
            ir0Var5.c = ir0Var5.a.getActionBar();
            ir0 ir0Var6 = ir0VarArr[i14];
            ir0Var6.addView(ir0Var6.b, w7.z5.d(-1.0f, -1));
            ir0 ir0Var7 = ir0VarArr[i14];
            ir0Var7.addView(ir0Var7.c, w7.z5.d(-2.0f, -1));
            ir0VarArr[i14].c.setVisibility(8);
            ir0VarArr[i14].d.setOnScrollListener(new ji.n3(7, this, ir0VarArr[i14].d.getOnScrollListener()));
            i14++;
            f7 = f10;
        }
        float f11 = f7;
        hr0Var.addView(this.actionBar, w7.z5.d(-2.0f, -1));
        hr0Var.addView(fr0Var.Z, w7.z5.e(-1, 48, 83));
        hr0Var.addView(fr0Var.a0, w7.z5.a(60.0f, 0.0f, 0.0f, 12.0f, 10.0f, 60, 85));
        hr0Var.addView(fr0Var.b0, w7.z5.a(24.0f, 0.0f, 0.0f, -2.0f, 9.0f, 42, 85));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.h.a(1, LocaleController.getString(R.string.GifsTab2), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(f11));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                ir0VarArr[0].e = currentTabId;
            }
            this.h.c();
        }
        j0(false);
        this.e = this.h.getCurrentTabId() == this.h.getFirstTabId();
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.h5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.g6.I5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar2, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, TLObject.FLAG_27, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c.getSearchField(), 16777216, null, null, null, null, i11));
        int i13 = org.telegram.ui.ActionBar.g6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, new Drawable[]{this.h.getSelectorDrawable()}, null, i13));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.e;
    }

    public final void j0(boolean z10) {
        ir0[] ir0VarArr;
        int i10 = 0;
        while (true) {
            ir0VarArr = this.n;
            if (i10 >= ir0VarArr.length) {
                break;
            }
            ir0VarArr[i10].d.B0();
            i10++;
        }
        ir0VarArr[z10 ? 1 : 0].d.getAdapter();
        ir0VarArr[z10 ? 1 : 0].d.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((s4.b0) ir0VarArr[z10 ? 1 : 0].d.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        fr0 fr0Var = this.a;
        if (fr0Var != null) {
            fr0Var.onConfigurationChanged(configuration);
        }
        fr0 fr0Var2 = this.b;
        if (fr0Var2 != null) {
            fr0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        fr0 fr0Var = this.a;
        if (fr0Var != null) {
            fr0Var.onFragmentDestroy();
        }
        fr0 fr0Var2 = this.b;
        if (fr0Var2 != null) {
            fr0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onPause() {
        super.onPause();
        fr0 fr0Var = this.a;
        if (fr0Var != null) {
            fr0Var.onPause();
        }
        fr0 fr0Var2 = this.b;
        if (fr0Var2 != null) {
            fr0Var2.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.u0 u0Var = this.c;
        if (u0Var != null) {
            u0Var.z(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        fr0 fr0Var = this.a;
        if (fr0Var != null) {
            fr0Var.onResume();
        }
        fr0 fr0Var2 = this.b;
        if (fr0Var2 != null) {
            fr0Var2.onResume();
        }
    }
}
