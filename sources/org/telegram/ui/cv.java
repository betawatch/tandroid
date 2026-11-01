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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class cv extends org.telegram.ui.ActionBar.k2 {
    public static final org.telegram.ui.Components.rq0 y = new org.telegram.ui.Components.rq0(2);
    public zx a;
    public ContactsActivity b;
    public org.telegram.ui.ActionBar.t0 c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public bv[] f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public int w;
    public boolean x;

    public static void Z(cv cvVar, TLRPC.User user) {
        if (org.telegram.messenger.wp.E2(user)) {
            org.telegram.ui.Components.s4.v0(org.telegram.messenger.dd.L0(2131751106, null), cvVar);
        } else {
            org.telegram.messenger.wp.r1(cvVar.currentAccount).w(user.id);
            org.telegram.ui.Components.s4.v0(org.telegram.messenger.dd.L0(2131743787, null), cvVar);
        }
        cvVar.finishFragment();
    }

    public static void o0(cv cvVar, float f7) {
        bv[] bvVarArr = cvVar.f;
        cvVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < bvVarArr.length; i10++) {
            int i11 = (int) f7;
            bvVarArr[i10].d.setPinnedSectionOffsetY(i11);
            ag.b1 b1Var = bvVarArr[i10].e;
            if (b1Var != null) {
                b1Var.setPinnedSectionOffsetY(i11);
            }
        }
        cvVar.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
        zx zxVar = this.a;
        if (zxVar != null) {
            zxVar.addThemeColorKeys(hashSet);
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.addThemeColorKeys(hashSet);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        float f7;
        ContactsActivity contactsActivity = this.b;
        zx zxVar = this.a;
        bv[] bvVarArr = this.f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131753687, null));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f10 = 44.0f;
        this.actionBar.setExtraHeight(org.telegram.messenger.i0.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new ar(this, 17));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.t0 a2 = this.actionBar.p().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new ag.l3(this, 10);
        this.c = a2;
        a2.setSearchFieldHint(org.telegram.messenger.dd.L0(2131745853, null));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, w7.b6.e(-1, 44, 83));
        this.e.setDelegate(new e(this, 13));
        this.w = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        av avVar = new av(this, context);
        this.fragmentView = avVar;
        avVar.setWillNotDraw(false);
        zxVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i10 = 0;
        while (i10 < bvVarArr.length) {
            bv bvVar = new bv(this, context);
            bvVarArr[i10] = bvVar;
            avVar.addView(bvVar, w7.b6.c(-1.0f, -1));
            if (i10 == 0) {
                bv bvVar2 = bvVarArr[i10];
                bvVar2.a = zxVar;
                f7 = f10;
                bvVar2.d = zxVar.e0[0].a;
                zxVar.Y3();
                jx jxVar = zxVar.C0;
                bvVar2.e = jxVar != null ? jxVar.a0 : null;
            } else {
                f7 = f10;
                if (i10 == 1) {
                    bv bvVar3 = bvVarArr[i10];
                    bvVar3.a = contactsActivity;
                    bvVar3.d = contactsActivity.d;
                    bvVar3.setVisibility(8);
                }
            }
            bvVarArr[i10].d.setScrollingTouchSlop(1);
            bv bvVar4 = bvVarArr[i10];
            bvVar4.b = (FrameLayout) bvVar4.a.getFragmentView();
            bv bvVar5 = bvVarArr[i10];
            bvVar5.c = bvVar5.a.getActionBar();
            bv bvVar6 = bvVarArr[i10];
            bvVar6.addView(bvVar6.b, w7.b6.c(-1.0f, -1));
            org.telegram.messenger.i0.E2(bvVarArr[i10].c);
            bv bvVar7 = bvVarArr[i10];
            bvVar7.addView(bvVar7.c, w7.b6.c(-2.0f, -1));
            bvVarArr[i10].c.setVisibility(8);
            int i11 = 0;
            while (i11 < 2) {
                org.telegram.ui.Components.uk0 uk0Var = i11 == 0 ? bvVarArr[i10].d : bvVarArr[i10].e;
                if (uk0Var != null) {
                    uk0Var.setClipToPadding(false);
                    uk0Var.setOnScrollListener(new bi.t3(7, this, uk0Var.getOnScrollListener()));
                }
                i11++;
            }
            i10++;
            f10 = f7;
        }
        float f11 = f10;
        avVar.addView(this.actionBar, w7.b6.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, org.telegram.messenger.dd.L0(2131753690, null), null);
            this.e.a(1, org.telegram.messenger.dd.L0(2131753689, null), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.i0.L(f11));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                bvVarArr[0].f = currentTabId;
            }
            this.e.c();
        }
        r0(false);
        this.x = this.e.getCurrentTabId() == this.e.getFirstTabId();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.e.getSelectorDrawable()}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.L8));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.x;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        zx zxVar = this.a;
        if (zxVar != null) {
            zxVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        zx zxVar = this.a;
        if (zxVar != null) {
            zxVar.onPause();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        zx zxVar = this.a;
        if (zxVar != null) {
            zxVar.onResume();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            zx zxVar = this.a;
            if (zxVar != null && zxVar.fragmentView != null) {
                zxVar.onThemeColorsChanged();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            ContactsActivity contactsActivity = this.b;
            if (contactsActivity == null || contactsActivity.fragmentView == null) {
                return;
            }
            contactsActivity.onThemeColorsChanged();
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    public final void q0(TLRPC.User user) {
        if (user == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String L0 = org.telegram.messenger.dd.L0(2131753692, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("AreYouSureBlockContact2", null, 2131754119, org.telegram.messenger.i5.m(0, user.first_name, user.last_name)));
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131753693, null), new org.telegram.ui.Components.f2(29, this, user));
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
        showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
        }
    }

    public final void r0(boolean z10) {
        bv[] bvVarArr = this.f;
        for (int i10 = 0; i10 < bvVarArr.length; i10++) {
            bvVarArr[i10].d.C0();
            ag.b1 b1Var = bvVarArr[i10].e;
            if (b1Var != null) {
                b1Var.C0();
            }
        }
        int i11 = 0;
        while (i11 < 2) {
            org.telegram.ui.Components.uk0 uk0Var = i11 == 0 ? bvVarArr[z10 ? 1 : 0].d : bvVarArr[z10 ? 1 : 0].e;
            if (uk0Var != null) {
                uk0Var.getAdapter();
                uk0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((s4.a0) uk0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
            i11++;
        }
    }
}
