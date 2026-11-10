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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class du extends org.telegram.ui.ActionBar.f2 {
    public static final org.telegram.ui.Components.qp0 y = new org.telegram.ui.Components.qp0(2);
    public zw a;
    public ContactsActivity b;
    public org.telegram.ui.ActionBar.r0 c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public cu[] f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public int w;
    public boolean x;

    public static void Z(du duVar, TLRPC.User user) {
        if (org.telegram.messenger.qp.F2(user)) {
            org.telegram.ui.Components.u4.t0(org.telegram.messenger.id.M0(2131751105, null), duVar);
        } else {
            org.telegram.messenger.qp.s1(duVar.currentAccount).w(user.id);
            org.telegram.ui.Components.u4.t0(org.telegram.messenger.id.M0(2131743761, null), duVar);
        }
        duVar.finishFragment();
    }

    public static void o0(du duVar, float f10) {
        cu[] cuVarArr = duVar.f;
        duVar.actionBar.setTranslationY(f10);
        for (int i7 = 0; i7 < cuVarArr.length; i7++) {
            int i10 = (int) f10;
            cuVarArr[i7].d.setPinnedSectionOffsetY(i10);
            bi.q1 q1Var = cuVarArr[i7].e;
            if (q1Var != null) {
                q1Var.setPinnedSectionOffsetY(i10);
            }
        }
        duVar.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d6));
        zw zwVar = this.a;
        if (zwVar != null) {
            zwVar.addThemeColorKeys(hashSet);
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
        zw zwVar = this.a;
        cu[] cuVarArr = this.f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(org.telegram.messenger.id.M0(2131753687, null));
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f11 = 44.0f;
        this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new w9(this, 26));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.s().a(0, R.drawable.outline_header_search);
        a10.N();
        a10.H = new kg.v1(this, 10);
        this.c = a10;
        a10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, c8.ha.e(-1, 44, 83));
        this.e.setDelegate(new f(this, 13));
        this.w = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        bu buVar = new bu(this, context);
        this.fragmentView = buVar;
        buVar.setWillNotDraw(false);
        zwVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i7 = 0;
        while (i7 < cuVarArr.length) {
            cu cuVar = new cu(this, context);
            cuVarArr[i7] = cuVar;
            buVar.addView(cuVar, c8.ha.c(-1.0f, -1));
            if (i7 == 0) {
                cu cuVar2 = cuVarArr[i7];
                cuVar2.a = zwVar;
                f10 = f11;
                cuVar2.d = zwVar.e0[0].a;
                zwVar.Y3();
                iw iwVar = zwVar.C0;
                cuVar2.e = iwVar != null ? iwVar.a0 : null;
            } else {
                f10 = f11;
                if (i7 == 1) {
                    cu cuVar3 = cuVarArr[i7];
                    cuVar3.a = contactsActivity;
                    cuVar3.d = contactsActivity.d;
                    cuVar3.setVisibility(8);
                }
            }
            cuVarArr[i7].d.setScrollingTouchSlop(1);
            cu cuVar4 = cuVarArr[i7];
            cuVar4.b = (FrameLayout) cuVar4.a.getFragmentView();
            cu cuVar5 = cuVarArr[i7];
            cuVar5.c = cuVar5.a.getActionBar();
            cu cuVar6 = cuVarArr[i7];
            cuVar6.addView(cuVar6.b, c8.ha.c(-1.0f, -1));
            org.telegram.messenger.g0.E2(cuVarArr[i7].c);
            cu cuVar7 = cuVarArr[i7];
            cuVar7.addView(cuVar7.c, c8.ha.c(-2.0f, -1));
            cuVarArr[i7].c.setVisibility(8);
            int i10 = 0;
            while (i10 < 2) {
                org.telegram.ui.Components.pj0 pj0Var = i10 == 0 ? cuVarArr[i7].d : cuVarArr[i7].e;
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
        buVar.addView(this.actionBar, c8.ha.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, org.telegram.messenger.id.M0(2131753690, null), null);
            this.e.a(1, org.telegram.messenger.id.M0(2131753689, null), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(f12));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                cuVarArr[0].f = currentTabId;
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
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.e.getSelectorDrawable()}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.L8));
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
        zw zwVar = this.a;
        if (zwVar != null) {
            zwVar.onFragmentDestroy();
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
        zw zwVar = this.a;
        if (zwVar != null) {
            zwVar.onPause();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        zw zwVar = this.a;
        if (zwVar != null) {
            zwVar.onResume();
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
            zw zwVar = this.a;
            if (zwVar != null && zwVar.fragmentView != null) {
                zwVar.onThemeColorsChanged();
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
        String M0 = org.telegram.messenger.id.M0(2131753692, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("AreYouSureBlockContact2", null, 2131754119, org.telegram.messenger.g5.m(0, user.first_name, user.last_name)));
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131753693, null), new org.telegram.ui.Components.e2(28, this, user));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
        }
    }

    public final void r0(boolean z9) {
        cu[] cuVarArr = this.f;
        for (int i7 = 0; i7 < cuVarArr.length; i7++) {
            cuVarArr[i7].d.C0();
            bi.q1 q1Var = cuVarArr[i7].e;
            if (q1Var != null) {
                q1Var.C0();
            }
        }
        int i10 = 0;
        while (i10 < 2) {
            org.telegram.ui.Components.pj0 pj0Var = i10 == 0 ? cuVarArr[z9 ? 1 : 0].d : cuVarArr[z9 ? 1 : 0].e;
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
