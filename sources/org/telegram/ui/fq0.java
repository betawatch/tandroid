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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fq0 extends org.telegram.ui.ActionBar.n2 {
    public static final org.telegram.ui.Components.sq0 y = new org.telegram.ui.Components.sq0(4);
    public final aq0 a;
    public final aq0 b;
    public org.telegram.ui.ActionBar.v0 c;
    public org.telegram.ui.Components.tt d;
    public boolean e;
    public final Paint f;
    public ScrollSlidingTextTabStrip h;
    public final dq0[] n;
    public AnimatorSet r;
    public boolean s;
    public boolean v;
    public boolean w;
    public int x;

    public fq0(HashMap hashMap, ArrayList arrayList, int i10, boolean z10, rn rnVar) {
        super(null);
        this.e = true;
        this.f = new Paint();
        this.n = new dq0[2];
        this.a = new aq0(0, null, hashMap, arrayList, i10, z10, rnVar, false);
        this.b = new aq0(1, null, hashMap, arrayList, i10, z10, rnVar, false);
    }

    public static void g0(fq0 fq0Var, float f10) {
        fq0Var.actionBar.setTranslationY(f10);
        int i10 = 0;
        while (true) {
            dq0[] dq0VarArr = fq0Var.n;
            if (i10 >= dq0VarArr.length) {
                fq0Var.fragmentView.invalidate();
                return;
            } else {
                dq0VarArr[i10].d.setPinnedSectionOffsetY((int) f10);
                i10++;
            }
        }
    }

    public static void h0(fq0 fq0Var, String str) {
        fq0Var.c.getSearchField().setText(str);
        fq0Var.c.getSearchField().setSelection(str.length());
        fq0Var.actionBar.x();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        dq0[] dq0VarArr;
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.j5;
        kVar.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.actionBar.D(org.telegram.ui.ActionBar.g6.w0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 12));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new db(this, 13);
        this.c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.c.getSearchField();
        searchField.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        searchField.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Vd, false));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i11 = org.telegram.ui.ActionBar.g6.Y9;
        int i12 = org.telegram.ui.ActionBar.g6.Z9;
        scrollSlidingTextTabStrip2.H = i11;
        scrollSlidingTextTabStrip2.I = i12;
        scrollSlidingTextTabStrip2.d();
        this.actionBar.addView(this.h, h7.z5.e(-1, 44, 83));
        this.h.setDelegate(new bq0(this));
        this.x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        cq0 cq0Var = new cq0(this, context);
        this.fragmentView = cq0Var;
        cq0Var.setWillNotDraw(false);
        aq0 aq0Var = this.a;
        aq0Var.setParentFragment(this);
        org.telegram.ui.Components.tt ttVar = aq0Var.Z;
        this.d = ttVar;
        ttVar.setSizeNotifierLayout(cq0Var);
        int i13 = 0;
        while (i13 < 4) {
            View view = i13 != 0 ? i13 != 1 ? i13 != 2 ? aq0Var.Y : aq0Var.X : aq0Var.W : aq0Var.V;
            ((ViewGroup) view.getParent()).removeView(view);
            i13++;
        }
        FrameLayout frameLayout = aq0Var.V;
        n0 n0Var = aq0Var.W;
        aj0 aj0Var = aq0Var.X;
        View view2 = aq0Var.Y;
        org.telegram.ui.Components.tt ttVar2 = aq0Var.Z;
        aq0 aq0Var2 = this.b;
        aq0Var2.V = frameLayout;
        aq0Var2.W = n0Var;
        aq0Var2.Z = ttVar2;
        aq0Var2.X = aj0Var;
        aq0Var2.Y = view2;
        aq0Var2.m0 = false;
        aq0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            dq0VarArr = this.n;
            if (i14 >= dq0VarArr.length) {
                break;
            }
            dq0 dq0Var = new dq0(this, context);
            dq0VarArr[i14] = dq0Var;
            cq0Var.addView(dq0Var, h7.z5.c(-1.0f, -1));
            if (i14 == 0) {
                dq0 dq0Var2 = dq0VarArr[i14];
                dq0Var2.a = aq0Var;
                dq0Var2.d = aq0Var.G;
            } else if (i14 == 1) {
                dq0 dq0Var3 = dq0VarArr[i14];
                dq0Var3.a = aq0Var2;
                dq0Var3.d = aq0Var2.G;
                dq0Var3.setVisibility(8);
            }
            dq0VarArr[i14].d.setScrollingTouchSlop(1);
            dq0 dq0Var4 = dq0VarArr[i14];
            dq0Var4.b = (FrameLayout) dq0Var4.a.getFragmentView();
            dq0VarArr[i14].d.setClipToPadding(false);
            dq0 dq0Var5 = dq0VarArr[i14];
            dq0Var5.c = dq0Var5.a.getActionBar();
            dq0 dq0Var6 = dq0VarArr[i14];
            dq0Var6.addView(dq0Var6.b, h7.z5.c(-1.0f, -1));
            dq0 dq0Var7 = dq0VarArr[i14];
            dq0Var7.addView(dq0Var7.c, h7.z5.c(-2.0f, -1));
            dq0VarArr[i14].c.setVisibility(8);
            dq0VarArr[i14].d.setOnScrollListener(new fh.l(8, this, dq0VarArr[i14].d.getOnScrollListener()));
            i14++;
        }
        cq0Var.addView(this.actionBar, h7.z5.c(-2.0f, -1));
        cq0Var.addView(aq0Var.V, h7.z5.e(-1, 48, 83));
        cq0Var.addView(aq0Var.W, h7.z5.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        cq0Var.addView(aq0Var.X, h7.z5.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.h.a(1, LocaleController.getString(R.string.GifsTab2), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                dq0VarArr[0].e = currentTabId;
            }
            this.h.c();
        }
        j0(false);
        this.e = this.h.getCurrentTabId() == this.h.getFirstTabId();
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false);
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

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.e;
    }

    public final void j0(boolean z10) {
        dq0[] dq0VarArr;
        int i10 = 0;
        while (true) {
            dq0VarArr = this.n;
            if (i10 >= dq0VarArr.length) {
                break;
            }
            dq0VarArr[i10].d.B0();
            i10++;
        }
        dq0VarArr[z10 ? 1 : 0].d.getAdapter();
        dq0VarArr[z10 ? 1 : 0].d.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((f2.k0) dq0VarArr[z10 ? 1 : 0].d.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        aq0 aq0Var = this.a;
        if (aq0Var != null) {
            aq0Var.onConfigurationChanged(configuration);
        }
        aq0 aq0Var2 = this.b;
        if (aq0Var2 != null) {
            aq0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        aq0 aq0Var = this.a;
        if (aq0Var != null) {
            aq0Var.onFragmentDestroy();
        }
        aq0 aq0Var2 = this.b;
        if (aq0Var2 != null) {
            aq0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        aq0 aq0Var = this.a;
        if (aq0Var != null) {
            aq0Var.onPause();
        }
        aq0 aq0Var2 = this.b;
        if (aq0Var2 != null) {
            aq0Var2.onPause();
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
        aq0 aq0Var = this.a;
        if (aq0Var != null) {
            aq0Var.onResume();
        }
        aq0 aq0Var2 = this.b;
        if (aq0Var2 != null) {
            aq0Var2.onResume();
        }
    }
}
