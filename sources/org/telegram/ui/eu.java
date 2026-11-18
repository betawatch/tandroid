package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class eu extends org.telegram.ui.ActionBar.h2 {
    public static final org.telegram.ui.Components.bq0 y = new org.telegram.ui.Components.bq0(2);
    public cx a;
    public ContactsActivity b;
    public org.telegram.ui.ActionBar.r0 c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public du[] f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public int w;
    public boolean x;

    public static void Z(eu euVar, TLRPC.User user) {
        if (org.telegram.messenger.mp.L2(user)) {
            org.telegram.ui.Components.b5.t0(org.telegram.messenger.gd.M0(2131751094, null), euVar);
        } else {
            org.telegram.messenger.mp.u1(euVar.currentAccount).w(user.id);
            org.telegram.ui.Components.b5.t0(org.telegram.messenger.gd.M0(2131743524, null), euVar);
        }
        euVar.finishFragment();
    }

    public static void o0(eu euVar, float f10) {
        du[] duVarArr = euVar.f;
        euVar.actionBar.setTranslationY(f10);
        for (int i7 = 0; i7 < duVarArr.length; i7++) {
            int i10 = (int) f10;
            duVarArr[i7].d.setPinnedSectionOffsetY(i10);
            di.b1 b1Var = duVarArr[i7].e;
            if (b1Var != null) {
                b1Var.setPinnedSectionOffsetY(i10);
            }
        }
        euVar.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d6));
        cx cxVar = this.a;
        if (cxVar != null) {
            cxVar.addThemeColorKeys(hashSet);
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.addThemeColorKeys(hashSet);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        float f10;
        ContactsActivity contactsActivity = this.b;
        cx cxVar = this.a;
        du[] duVarArr = this.f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131753685, null));
        org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
        if (s4Var != null && ((ActionBarLayout) s4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f11 = 44.0f;
        this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new x7(this, 29));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.t().a(0, R.drawable.outline_header_search);
        a10.O();
        a10.I = new bi.s1(this, 11);
        this.c = a10;
        a10.setSearchFieldHint(org.telegram.messenger.gd.M0(2131745641, null));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, c8.ma.e(-1, 44, 83));
        this.e.setDelegate(new f(this, 13));
        this.w = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        cu cuVar = new cu(this, context);
        this.fragmentView = cuVar;
        cuVar.setWillNotDraw(false);
        cxVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i7 = 0;
        while (i7 < duVarArr.length) {
            du duVar = new du(this, context);
            duVarArr[i7] = duVar;
            cuVar.addView(duVar, c8.ma.c(-1.0f, -1));
            if (i7 == 0) {
                du duVar2 = duVarArr[i7];
                duVar2.a = cxVar;
                f10 = f11;
                duVar2.d = cxVar.f0[0].a;
                cxVar.Y3();
                kw kwVar = cxVar.D0;
                duVar2.e = kwVar != null ? kwVar.b0 : null;
            } else {
                f10 = f11;
                if (i7 == 1) {
                    du duVar3 = duVarArr[i7];
                    duVar3.a = contactsActivity;
                    duVar3.d = contactsActivity.d;
                    duVar3.setVisibility(8);
                }
            }
            duVarArr[i7].d.setScrollingTouchSlop(1);
            du duVar4 = duVarArr[i7];
            duVar4.b = (FrameLayout) duVar4.a.getFragmentView();
            du duVar5 = duVarArr[i7];
            duVar5.c = duVar5.a.getActionBar();
            du duVar6 = duVarArr[i7];
            duVar6.addView(duVar6.b, c8.ma.c(-1.0f, -1));
            org.telegram.messenger.g0.E2(duVarArr[i7].c);
            du duVar7 = duVarArr[i7];
            duVar7.addView(duVar7.c, c8.ma.c(-2.0f, -1));
            duVarArr[i7].c.setVisibility(8);
            int i10 = 0;
            while (i10 < 2) {
                org.telegram.ui.Components.ck0 ck0Var = i10 == 0 ? duVarArr[i7].d : duVarArr[i7].e;
                if (ck0Var != null) {
                    ck0Var.setClipToPadding(false);
                    ck0Var.setOnScrollListener(new bi.e6(7, this, ck0Var.getOnScrollListener()));
                }
                i10++;
            }
            i7++;
            f11 = f10;
        }
        float f12 = f11;
        cuVar.addView(this.actionBar, c8.ma.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, org.telegram.messenger.gd.M0(2131753688, null), null);
            this.e.a(1, org.telegram.messenger.gd.M0(2131753687, null), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(f12));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                duVarArr[0].f = currentTabId;
            }
            this.e.c();
        }
        r0(false);
        this.x = this.e.getCurrentTabId() == this.e.getFirstTabId();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.e.getSelectorDrawable()}, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.L8));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.x;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        cx cxVar = this.a;
        if (cxVar != null) {
            cxVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onPause() {
        super.onPause();
        cx cxVar = this.a;
        if (cxVar != null) {
            cxVar.onPause();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onResume() {
        super.onResume();
        cx cxVar = this.a;
        if (cxVar != null) {
            cxVar.onResume();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            cx cxVar = this.a;
            if (cxVar != null && cxVar.fragmentView != null) {
                cxVar.onThemeColorsChanged();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            ContactsActivity contactsActivity = this.b;
            if (contactsActivity == null || contactsActivity.fragmentView == null) {
                return;
            }
            contactsActivity.onThemeColorsChanged();
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public final void q0(TLRPC.User user) {
        if (user == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.gd.M0(2131753690, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("AreYouSureBlockContact2", null, 2131754117, org.telegram.messenger.i5.m(0, user.first_name, user.last_name)));
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131753691, null), new at(1, this, user));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
        }
    }

    public final void r0(boolean z10) {
        du[] duVarArr = this.f;
        for (int i7 = 0; i7 < duVarArr.length; i7++) {
            duVarArr[i7].d.C0();
            di.b1 b1Var = duVarArr[i7].e;
            if (b1Var != null) {
                b1Var.C0();
            }
        }
        int i10 = 0;
        while (i10 < 2) {
            org.telegram.ui.Components.ck0 ck0Var = i10 == 0 ? duVarArr[z10 ? 1 : 0].d : duVarArr[z10 ? 1 : 0].e;
            if (ck0Var != null) {
                ck0Var.getAdapter();
                ck0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((v4.c0) ck0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
            i10++;
        }
    }
}
