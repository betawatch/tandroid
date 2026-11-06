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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class au extends org.telegram.ui.ActionBar.f2 {
    public static final org.telegram.ui.Components.qp0 y = new org.telegram.ui.Components.qp0(2);
    public ww a;
    public ContactsActivity b;
    public org.telegram.ui.ActionBar.r0 c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public zt[] f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public int w;
    public boolean x;

    public static void Z(au auVar, TLRPC.User user) {
        if (org.telegram.messenger.qp.F2(user)) {
            org.telegram.ui.Components.v4.t0(org.telegram.messenger.hd.M0(2131751106, null), auVar);
        } else {
            org.telegram.messenger.qp.s1(auVar.currentAccount).w(user.id);
            org.telegram.ui.Components.v4.t0(org.telegram.messenger.hd.M0(2131743762, null), auVar);
        }
        auVar.finishFragment();
    }

    public static void o0(au auVar, float f10) {
        zt[] ztVarArr = auVar.f;
        auVar.actionBar.setTranslationY(f10);
        for (int i7 = 0; i7 < ztVarArr.length; i7++) {
            int i10 = (int) f10;
            ztVarArr[i7].d.setPinnedSectionOffsetY(i10);
            bi.q1 q1Var = ztVarArr[i7].e;
            if (q1Var != null) {
                q1Var.setPinnedSectionOffsetY(i10);
            }
        }
        auVar.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
        ww wwVar = this.a;
        if (wwVar != null) {
            wwVar.addThemeColorKeys(hashSet);
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.addThemeColorKeys(hashSet);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        float f10;
        ContactsActivity contactsActivity = this.b;
        ww wwVar = this.a;
        zt[] ztVarArr = this.f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131753687, null));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f11 = 44.0f;
        this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new w9(this, 26));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.q().a(0, R.drawable.outline_header_search);
        a10.N();
        a10.H = new kg.v1(this, 10);
        this.c = a10;
        a10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745837, null));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, c8.ha.e(-1, 44, 83));
        this.e.setDelegate(new f(this, 13));
        this.w = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        yt ytVar = new yt(this, context);
        this.fragmentView = ytVar;
        ytVar.setWillNotDraw(false);
        wwVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i7 = 0;
        while (i7 < ztVarArr.length) {
            zt ztVar = new zt(this, context);
            ztVarArr[i7] = ztVar;
            ytVar.addView(ztVar, c8.ha.c(-1.0f, -1));
            if (i7 == 0) {
                zt ztVar2 = ztVarArr[i7];
                ztVar2.a = wwVar;
                f10 = f11;
                ztVar2.d = wwVar.e0[0].a;
                wwVar.Y3();
                fw fwVar = wwVar.C0;
                ztVar2.e = fwVar != null ? fwVar.a0 : null;
            } else {
                f10 = f11;
                if (i7 == 1) {
                    zt ztVar3 = ztVarArr[i7];
                    ztVar3.a = contactsActivity;
                    ztVar3.d = contactsActivity.d;
                    ztVar3.setVisibility(8);
                }
            }
            ztVarArr[i7].d.setScrollingTouchSlop(1);
            zt ztVar4 = ztVarArr[i7];
            ztVar4.b = (FrameLayout) ztVar4.a.getFragmentView();
            zt ztVar5 = ztVarArr[i7];
            ztVar5.c = ztVar5.a.getActionBar();
            zt ztVar6 = ztVarArr[i7];
            ztVar6.addView(ztVar6.b, c8.ha.c(-1.0f, -1));
            org.telegram.messenger.g0.E2(ztVarArr[i7].c);
            zt ztVar7 = ztVarArr[i7];
            ztVar7.addView(ztVar7.c, c8.ha.c(-2.0f, -1));
            ztVarArr[i7].c.setVisibility(8);
            int i10 = 0;
            while (i10 < 2) {
                org.telegram.ui.Components.pj0 pj0Var = i10 == 0 ? ztVarArr[i7].d : ztVarArr[i7].e;
                if (pj0Var != null) {
                    pj0Var.setClipToPadding(false);
                    pj0Var.setOnScrollListener(new ai.o0(6, this, pj0Var.getOnScrollListener()));
                }
                i10++;
            }
            i7++;
            f11 = f10;
        }
        float f12 = f11;
        ytVar.addView(this.actionBar, c8.ha.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, org.telegram.messenger.hd.M0(2131753690, null), null);
            this.e.a(1, org.telegram.messenger.hd.M0(2131753689, null), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(f12));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                ztVarArr[0].f = currentTabId;
            }
            this.e.c();
        }
        r0(false);
        this.x = this.e.getCurrentTabId() == this.e.getFirstTabId();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.e.getSelectorDrawable()}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L8));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.x;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        ww wwVar = this.a;
        if (wwVar != null) {
            wwVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        ww wwVar = this.a;
        if (wwVar != null) {
            wwVar.onPause();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        ww wwVar = this.a;
        if (wwVar != null) {
            wwVar.onResume();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            ww wwVar = this.a;
            if (wwVar != null && wwVar.fragmentView != null) {
                wwVar.onThemeColorsChanged();
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
        String M0 = org.telegram.messenger.hd.M0(2131753692, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("AreYouSureBlockContact2", null, 2131754119, org.telegram.messenger.g5.m(0, user.first_name, user.last_name)));
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131753693, null), new org.telegram.ui.Components.f2(28, this, user));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
        }
    }

    public final void r0(boolean z9) {
        zt[] ztVarArr = this.f;
        for (int i7 = 0; i7 < ztVarArr.length; i7++) {
            ztVarArr[i7].d.C0();
            bi.q1 q1Var = ztVarArr[i7].e;
            if (q1Var != null) {
                q1Var.C0();
            }
        }
        int i10 = 0;
        while (i10 < 2) {
            org.telegram.ui.Components.pj0 pj0Var = i10 == 0 ? ztVarArr[z9 ? 1 : 0].d : ztVarArr[z9 ? 1 : 0].e;
            if (pj0Var != null) {
                pj0Var.getAdapter();
                pj0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((v4.b0) pj0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
            i10++;
        }
    }
}
