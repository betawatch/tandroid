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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class mq0 extends org.telegram.ui.ActionBar.p2 {
    public static final org.telegram.ui.Components.lr0 y = new org.telegram.ui.Components.lr0(4);
    public final hq0 a;
    public final hq0 b;
    public org.telegram.ui.ActionBar.w0 c;
    public org.telegram.ui.Components.fu d;
    public boolean e;
    public final Paint f;
    public ScrollSlidingTextTabStrip h;
    public final kq0[] n;
    public AnimatorSet r;
    public boolean s;
    public boolean v;
    public boolean w;
    public int x;

    public mq0(HashMap hashMap, ArrayList arrayList, int i10, boolean z4, xn xnVar) {
        super(null);
        this.e = true;
        this.f = new Paint();
        this.n = new kq0[2];
        this.a = new hq0(0, null, hashMap, arrayList, i10, z4, xnVar, false);
        this.b = new hq0(1, null, hashMap, arrayList, i10, z4, xnVar, false);
    }

    public static void g0(mq0 mq0Var, float f10) {
        mq0Var.actionBar.setTranslationY(f10);
        int i10 = 0;
        while (true) {
            kq0[] kq0VarArr = mq0Var.n;
            if (i10 >= kq0VarArr.length) {
                mq0Var.fragmentView.invalidate();
                return;
            } else {
                kq0VarArr[i10].d.setPinnedSectionOffsetY((int) f10);
                i10++;
            }
        }
    }

    public static void h0(mq0 mq0Var, String str) {
        mq0Var.c.getSearchField().setText(str);
        mq0Var.c.getSearchField().setSelection(str.length());
        mq0Var.actionBar.w();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        kq0[] kq0VarArr;
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.h5, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        kVar.setTitleColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        this.actionBar.C(org.telegram.ui.ActionBar.k6.w0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 3));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new fb(this, 13);
        this.c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.c.getSearchField();
        searchField.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        searchField.setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Vd, false));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i11 = org.telegram.ui.ActionBar.k6.Y9;
        int i12 = org.telegram.ui.ActionBar.k6.Z9;
        scrollSlidingTextTabStrip2.I = i11;
        scrollSlidingTextTabStrip2.J = i12;
        scrollSlidingTextTabStrip2.e();
        this.actionBar.addView(this.h, k7.c6.e(-1, 44, 83));
        this.h.setDelegate(new iq0(this));
        this.x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        jq0 jq0Var = new jq0(this, context);
        this.fragmentView = jq0Var;
        jq0Var.setWillNotDraw(false);
        hq0 hq0Var = this.a;
        hq0Var.setParentFragment(this);
        org.telegram.ui.Components.fu fuVar = hq0Var.a0;
        this.d = fuVar;
        fuVar.setSizeNotifierLayout(jq0Var);
        int i13 = 0;
        while (i13 < 4) {
            View view = i13 != 0 ? i13 != 1 ? i13 != 2 ? hq0Var.Z : hq0Var.Y : hq0Var.X : hq0Var.W;
            ((ViewGroup) view.getParent()).removeView(view);
            i13++;
        }
        FrameLayout frameLayout = hq0Var.W;
        l0 l0Var = hq0Var.X;
        fg.h0 h0Var = hq0Var.Y;
        View view2 = hq0Var.Z;
        org.telegram.ui.Components.fu fuVar2 = hq0Var.a0;
        hq0 hq0Var2 = this.b;
        hq0Var2.W = frameLayout;
        hq0Var2.X = l0Var;
        hq0Var2.a0 = fuVar2;
        hq0Var2.Y = h0Var;
        hq0Var2.Z = view2;
        hq0Var2.n0 = false;
        hq0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            kq0VarArr = this.n;
            if (i14 >= kq0VarArr.length) {
                break;
            }
            kq0 kq0Var = new kq0(this, context);
            kq0VarArr[i14] = kq0Var;
            jq0Var.addView(kq0Var, k7.c6.c(-1.0f, -1));
            if (i14 == 0) {
                kq0 kq0Var2 = kq0VarArr[i14];
                kq0Var2.a = hq0Var;
                kq0Var2.d = hq0Var.H;
            } else if (i14 == 1) {
                kq0 kq0Var3 = kq0VarArr[i14];
                kq0Var3.a = hq0Var2;
                kq0Var3.d = hq0Var2.H;
                kq0Var3.setVisibility(8);
            }
            kq0VarArr[i14].d.setScrollingTouchSlop(1);
            kq0 kq0Var4 = kq0VarArr[i14];
            kq0Var4.b = (FrameLayout) kq0Var4.a.getFragmentView();
            kq0VarArr[i14].d.setClipToPadding(false);
            kq0 kq0Var5 = kq0VarArr[i14];
            kq0Var5.c = kq0Var5.a.getActionBar();
            kq0 kq0Var6 = kq0VarArr[i14];
            kq0Var6.addView(kq0Var6.b, k7.c6.c(-1.0f, -1));
            kq0 kq0Var7 = kq0VarArr[i14];
            kq0Var7.addView(kq0Var7.c, k7.c6.c(-2.0f, -1));
            kq0VarArr[i14].c.setVisibility(8);
            kq0VarArr[i14].d.setOnScrollListener(new kh.l(8, this, kq0VarArr[i14].d.getOnScrollListener()));
            i14++;
        }
        jq0Var.addView(this.actionBar, k7.c6.c(-2.0f, -1));
        jq0Var.addView(hq0Var.W, k7.c6.e(-1, 48, 83));
        jq0Var.addView(hq0Var.X, k7.c6.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        jq0Var.addView(hq0Var.Y, k7.c6.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.h.a(1, LocaleController.getString(R.string.GifsTab2), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                kq0VarArr[0].e = currentTabId;
            }
            this.h.c();
        }
        j0(false);
        this.e = this.h.getCurrentTabId() == this.h.getFirstTabId();
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.h5, false);
        if (Build.VERSION.SDK_INT >= 23 && AndroidUtilities.computePerceivedBrightness(w02) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.k6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.k6.I5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar2, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, TLObject.FLAG_27, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.k6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c.getSearchField(), 16777216, null, null, null, null, i11));
        int i13 = org.telegram.ui.ActionBar.k6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.k6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, new Drawable[]{this.h.getSelectorDrawable()}, null, i13));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.e;
    }

    public final void j0(boolean z4) {
        kq0[] kq0VarArr;
        int i10 = 0;
        while (true) {
            kq0VarArr = this.n;
            if (i10 >= kq0VarArr.length) {
                break;
            }
            kq0VarArr[i10].d.B0();
            i10++;
        }
        kq0VarArr[z4 ? 1 : 0].d.getAdapter();
        kq0VarArr[z4 ? 1 : 0].d.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((f2.j0) kq0VarArr[z4 ? 1 : 0].d.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        hq0 hq0Var = this.a;
        if (hq0Var != null) {
            hq0Var.onConfigurationChanged(configuration);
        }
        hq0 hq0Var2 = this.b;
        if (hq0Var2 != null) {
            hq0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        hq0 hq0Var = this.a;
        if (hq0Var != null) {
            hq0Var.onFragmentDestroy();
        }
        hq0 hq0Var2 = this.b;
        if (hq0Var2 != null) {
            hq0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        hq0 hq0Var = this.a;
        if (hq0Var != null) {
            hq0Var.onPause();
        }
        hq0 hq0Var2 = this.b;
        if (hq0Var2 != null) {
            hq0Var2.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.w0 w0Var = this.c;
        if (w0Var != null) {
            w0Var.z(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        hq0 hq0Var = this.a;
        if (hq0Var != null) {
            hq0Var.onResume();
        }
        hq0 hq0Var2 = this.b;
        if (hq0Var2 != null) {
            hq0Var2.onResume();
        }
    }
}
