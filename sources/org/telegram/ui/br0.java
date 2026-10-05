package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class br0 extends org.telegram.ui.ActionBar.n2 {
    public static final org.telegram.ui.Components.bs0 y = new org.telegram.ui.Components.bs0(4);
    public final wq0 a;
    public final wq0 b;
    public org.telegram.ui.ActionBar.v0 c;
    public org.telegram.ui.Components.mu d;
    public boolean e;
    public final Paint f;
    public ScrollSlidingTextTabStrip h;
    public final zq0[] n;
    public AnimatorSet r;
    public boolean s;
    public boolean v;
    public boolean w;
    public int x;

    public br0(HashMap hashMap, ArrayList arrayList, int i10, boolean z10, yn ynVar) {
        super(null);
        this.e = true;
        this.f = new Paint();
        this.n = new zq0[2];
        this.a = new wq0(0, null, hashMap, arrayList, i10, z10, ynVar, false);
        this.b = new wq0(1, null, hashMap, arrayList, i10, z10, ynVar, false);
    }

    public static void g0(br0 br0Var, float f7) {
        br0Var.actionBar.setTranslationY(f7);
        int i10 = 0;
        while (true) {
            zq0[] zq0VarArr = br0Var.n;
            if (i10 >= zq0VarArr.length) {
                br0Var.fragmentView.invalidate();
                return;
            } else {
                zq0VarArr[i10].d.setPinnedSectionOffsetY((int) f7);
                i10++;
            }
        }
    }

    public static void h0(br0 br0Var, String str) {
        br0Var.c.getSearchField().setText(str);
        br0Var.c.getSearchField().setSelection(str.length());
        br0Var.actionBar.w();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        zq0[] zq0VarArr;
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.h5, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.j5;
        kVar.setTitleColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.actionBar.A(org.telegram.ui.ActionBar.i6.w0(null, i10, false), false);
        this.actionBar.z(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var != null && ((ActionBarLayout) c5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 16));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 15);
        this.c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.c.getSearchField();
        searchField.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        searchField.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Vd, false));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i11 = org.telegram.ui.ActionBar.i6.Y9;
        int i12 = org.telegram.ui.ActionBar.i6.Z9;
        scrollSlidingTextTabStrip2.L = i11;
        scrollSlidingTextTabStrip2.M = i12;
        scrollSlidingTextTabStrip2.e();
        this.actionBar.addView(this.h, w7.z5.e(-1, 44, 83));
        this.h.setDelegate(new xq0(this));
        this.x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        yq0 yq0Var = new yq0(this, context);
        this.fragmentView = yq0Var;
        yq0Var.setWillNotDraw(false);
        wq0 wq0Var = this.a;
        wq0Var.setParentFragment(this);
        org.telegram.ui.Components.mu muVar = wq0Var.d0;
        this.d = muVar;
        muVar.setSizeNotifierLayout(yq0Var);
        int i13 = 0;
        while (i13 < 4) {
            View view = i13 != 0 ? i13 != 1 ? i13 != 2 ? wq0Var.c0 : wq0Var.b0 : wq0Var.a0 : wq0Var.Z;
            ((ViewGroup) view.getParent()).removeView(view);
            i13++;
        }
        FrameLayout frameLayout = wq0Var.Z;
        k0 k0Var = wq0Var.a0;
        n20 n20Var = wq0Var.b0;
        View view2 = wq0Var.c0;
        org.telegram.ui.Components.mu muVar2 = wq0Var.d0;
        wq0 wq0Var2 = this.b;
        wq0Var2.Z = frameLayout;
        wq0Var2.a0 = k0Var;
        wq0Var2.d0 = muVar2;
        wq0Var2.b0 = n20Var;
        wq0Var2.c0 = view2;
        wq0Var2.q0 = false;
        wq0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            zq0VarArr = this.n;
            if (i14 >= zq0VarArr.length) {
                break;
            }
            zq0 zq0Var = new zq0(this, context);
            zq0VarArr[i14] = zq0Var;
            yq0Var.addView(zq0Var, w7.z5.c(-1.0f, -1));
            if (i14 == 0) {
                zq0 zq0Var2 = zq0VarArr[i14];
                zq0Var2.a = wq0Var;
                zq0Var2.d = wq0Var.K;
            } else if (i14 == 1) {
                zq0 zq0Var3 = zq0VarArr[i14];
                zq0Var3.a = wq0Var2;
                zq0Var3.d = wq0Var2.K;
                zq0Var3.setVisibility(8);
            }
            zq0VarArr[i14].d.setScrollingTouchSlop(1);
            zq0 zq0Var4 = zq0VarArr[i14];
            zq0Var4.b = (FrameLayout) zq0Var4.a.getFragmentView();
            zq0VarArr[i14].d.setClipToPadding(false);
            zq0 zq0Var5 = zq0VarArr[i14];
            zq0Var5.c = zq0Var5.a.getActionBar();
            zq0 zq0Var6 = zq0VarArr[i14];
            zq0Var6.addView(zq0Var6.b, w7.z5.c(-1.0f, -1));
            zq0 zq0Var7 = zq0VarArr[i14];
            zq0Var7.addView(zq0Var7.c, w7.z5.c(-2.0f, -1));
            zq0VarArr[i14].c.setVisibility(8);
            zq0VarArr[i14].d.setOnScrollListener(new ii.n3(7, this, zq0VarArr[i14].d.getOnScrollListener()));
            i14++;
        }
        yq0Var.addView(this.actionBar, w7.z5.c(-2.0f, -1));
        yq0Var.addView(wq0Var.Z, w7.z5.e(-1, 48, 83));
        yq0Var.addView(wq0Var.a0, w7.z5.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        yq0Var.addView(wq0Var.b0, w7.z5.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.h.a(1, LocaleController.getString(R.string.GifsTab2), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                zq0VarArr[0].e = currentTabId;
            }
            this.h.c();
        }
        j0(false);
        this.e = this.h.getCurrentTabId() == this.h.getFirstTabId();
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.h5, false);
        if (Build.VERSION.SDK_INT >= 23 && AndroidUtilities.computePerceivedBrightness(w02) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.i6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.i6.j5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.i6.I5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar2, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, TLObject.FLAG_27, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.i6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c.getSearchField(), 16777216, null, null, null, null, i11));
        int i13 = org.telegram.ui.ActionBar.i6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.i6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, new Drawable[]{this.h.getSelectorDrawable()}, null, i13));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.e;
    }

    public final void j0(boolean z10) {
        zq0[] zq0VarArr;
        int i10 = 0;
        while (true) {
            zq0VarArr = this.n;
            if (i10 >= zq0VarArr.length) {
                break;
            }
            zq0VarArr[i10].d.C0();
            i10++;
        }
        zq0VarArr[z10 ? 1 : 0].d.getAdapter();
        zq0VarArr[z10 ? 1 : 0].d.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((s4.c0) zq0VarArr[z10 ? 1 : 0].d.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        wq0 wq0Var = this.a;
        if (wq0Var != null) {
            wq0Var.onConfigurationChanged(configuration);
        }
        wq0 wq0Var2 = this.b;
        if (wq0Var2 != null) {
            wq0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        wq0 wq0Var = this.a;
        if (wq0Var != null) {
            wq0Var.onFragmentDestroy();
        }
        wq0 wq0Var2 = this.b;
        if (wq0Var2 != null) {
            wq0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        wq0 wq0Var = this.a;
        if (wq0Var != null) {
            wq0Var.onPause();
        }
        wq0 wq0Var2 = this.b;
        if (wq0Var2 != null) {
            wq0Var2.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.v0 v0Var = this.c;
        if (v0Var != null) {
            v0Var.z(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        wq0 wq0Var = this.a;
        if (wq0Var != null) {
            wq0Var.onResume();
        }
        wq0 wq0Var2 = this.b;
        if (wq0Var2 != null) {
            wq0Var2.onResume();
        }
    }
}
