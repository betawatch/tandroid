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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class cu extends org.telegram.ui.ActionBar.e2 {
    public static final org.telegram.ui.Components.tp0 y = new org.telegram.ui.Components.tp0(2);
    public yw a;
    public ContactsActivity b;
    public org.telegram.ui.ActionBar.q0 c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public bu[] f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public int w;
    public boolean x;

    public static void Z(cu cuVar, TLRPC.User user) {
        if (org.telegram.messenger.np.F2(user)) {
            org.telegram.ui.Components.t4.t0(org.telegram.messenger.hd.M0(2131751105, null), cuVar);
        } else {
            org.telegram.messenger.np.s1(cuVar.currentAccount).w(user.id);
            org.telegram.ui.Components.t4.t0(org.telegram.messenger.hd.M0(2131743761, null), cuVar);
        }
        cuVar.finishFragment();
    }

    public static void o0(cu cuVar, float f10) {
        bu[] buVarArr = cuVar.f;
        cuVar.actionBar.setTranslationY(f10);
        for (int i7 = 0; i7 < buVarArr.length; i7++) {
            int i10 = (int) f10;
            buVarArr[i7].d.setPinnedSectionOffsetY(i10);
            di.c1 c1Var = buVarArr[i7].e;
            if (c1Var != null) {
                c1Var.setPinnedSectionOffsetY(i10);
            }
        }
        cuVar.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d6));
        yw ywVar = this.a;
        if (ywVar != null) {
            ywVar.addThemeColorKeys(hashSet);
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.addThemeColorKeys(hashSet);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        float f10;
        ContactsActivity contactsActivity = this.b;
        yw ywVar = this.a;
        bu[] buVarArr = this.f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131753687, null));
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f11 = 44.0f;
        this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new p9(this, 27));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, R.drawable.outline_header_search);
        a10.O();
        a10.I = new kg.x1(this, 10);
        this.c = a10;
        a10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745836, null));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, c8.ja.e(-1, 44, 83));
        this.e.setDelegate(new f(this, 13));
        this.w = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        au auVar = new au(this, context);
        this.fragmentView = auVar;
        auVar.setWillNotDraw(false);
        ywVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i7 = 0;
        while (i7 < buVarArr.length) {
            bu buVar = new bu(this, context);
            buVarArr[i7] = buVar;
            auVar.addView(buVar, c8.ja.c(-1.0f, -1));
            if (i7 == 0) {
                bu buVar2 = buVarArr[i7];
                buVar2.a = ywVar;
                f10 = f11;
                buVar2.d = ywVar.f0[0].a;
                ywVar.Y3();
                hw hwVar = ywVar.D0;
                buVar2.e = hwVar != null ? hwVar.b0 : null;
            } else {
                f10 = f11;
                if (i7 == 1) {
                    bu buVar3 = buVarArr[i7];
                    buVar3.a = contactsActivity;
                    buVar3.d = contactsActivity.d;
                    buVar3.setVisibility(8);
                }
            }
            buVarArr[i7].d.setScrollingTouchSlop(1);
            bu buVar4 = buVarArr[i7];
            buVar4.b = (FrameLayout) buVar4.a.getFragmentView();
            bu buVar5 = buVarArr[i7];
            buVar5.c = buVar5.a.getActionBar();
            bu buVar6 = buVarArr[i7];
            buVar6.addView(buVar6.b, c8.ja.c(-1.0f, -1));
            org.telegram.messenger.g0.E2(buVarArr[i7].c);
            bu buVar7 = buVarArr[i7];
            buVar7.addView(buVar7.c, c8.ja.c(-2.0f, -1));
            buVarArr[i7].c.setVisibility(8);
            int i10 = 0;
            while (i10 < 2) {
                org.telegram.ui.Components.uj0 uj0Var = i10 == 0 ? buVarArr[i7].d : buVarArr[i7].e;
                if (uj0Var != null) {
                    uj0Var.setClipToPadding(false);
                    uj0Var.setOnScrollListener(new bi.w3(7, this, uj0Var.getOnScrollListener()));
                }
                i10++;
            }
            i7++;
            f11 = f10;
        }
        float f12 = f11;
        auVar.addView(this.actionBar, c8.ja.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, org.telegram.messenger.hd.M0(2131753690, null), null);
            this.e.a(1, org.telegram.messenger.hd.M0(2131753689, null), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(f12));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                buVarArr[0].f = currentTabId;
            }
            this.e.c();
        }
        r0(false);
        this.x = this.e.getCurrentTabId() == this.e.getFirstTabId();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.e.getSelectorDrawable()}, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.L8));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.x;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        yw ywVar = this.a;
        if (ywVar != null) {
            ywVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onPause() {
        super.onPause();
        yw ywVar = this.a;
        if (ywVar != null) {
            ywVar.onPause();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        yw ywVar = this.a;
        if (ywVar != null) {
            ywVar.onResume();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            yw ywVar = this.a;
            if (ywVar != null && ywVar.fragmentView != null) {
                ywVar.onThemeColorsChanged();
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
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("AreYouSureBlockContact2", null, 2131754119, org.telegram.messenger.g5.m(0, user.first_name, user.last_name)));
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131753693, null), new tr(2, this, user));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
        }
    }

    public final void r0(boolean z10) {
        bu[] buVarArr = this.f;
        for (int i7 = 0; i7 < buVarArr.length; i7++) {
            buVarArr[i7].d.C0();
            di.c1 c1Var = buVarArr[i7].e;
            if (c1Var != null) {
                c1Var.C0();
            }
        }
        int i10 = 0;
        while (i10 < 2) {
            org.telegram.ui.Components.uj0 uj0Var = i10 == 0 ? buVarArr[z10 ? 1 : 0].d : buVarArr[z10 ? 1 : 0].e;
            if (uj0Var != null) {
                uj0Var.getAdapter();
                uj0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((v4.b0) uj0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
            i10++;
        }
    }
}
