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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class pv extends org.telegram.ui.ActionBar.p2 {
    public static final org.telegram.ui.Components.sr0 x = new org.telegram.ui.Components.sr0(2);
    public wy a;
    public ContactsActivity b;
    public org.telegram.ui.ActionBar.w0 c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public ov[] f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public int v;
    public boolean w;

    public static /* synthetic */ void U(pv pvVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.d5.w0(pvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(pvVar.currentAccount).blockPeer(user.id);
            org.telegram.ui.Components.d5.w0(pvVar, LocaleController.getString(R.string.UserBlocked));
        }
        pvVar.finishFragment();
    }

    public static void j0(pv pvVar, float f7) {
        ov[] ovVarArr = pvVar.f;
        pvVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < ovVarArr.length; i10++) {
            int i11 = (int) f7;
            ovVarArr[i10].d.setPinnedSectionOffsetY(i11);
            bi.y1 y1Var = ovVarArr[i10].e;
            if (y1Var != null) {
                y1Var.setPinnedSectionOffsetY(i11);
            }
        }
        pvVar.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        ContactsActivity contactsActivity = this.b;
        wy wyVar = this.a;
        ov[] ovVarArr = this.f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new vo(this, 20));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new gg.m2(this, 9);
        this.c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, w7.a6.e(-1, 44, 83));
        this.e.setDelegate(new g(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        nv nvVar = new nv(this, context);
        this.fragmentView = nvVar;
        nvVar.setWillNotDraw(false);
        wyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        for (int i10 = 0; i10 < ovVarArr.length; i10++) {
            ov ovVar = new ov(this, context);
            ovVarArr[i10] = ovVar;
            nvVar.addView(ovVar, w7.a6.c(-1.0f, -1));
            if (i10 == 0) {
                ov ovVar2 = ovVarArr[i10];
                ovVar2.a = wyVar;
                ovVar2.d = wyVar.e0[0].a;
                wyVar.M3();
                gy gyVar = wyVar.C0;
                ovVar2.e = gyVar != null ? gyVar.V : null;
            } else if (i10 == 1) {
                ov ovVar3 = ovVarArr[i10];
                ovVar3.a = contactsActivity;
                ovVar3.d = contactsActivity.f;
                ovVar3.setVisibility(8);
            }
            ovVarArr[i10].d.setScrollingTouchSlop(1);
            ov ovVar4 = ovVarArr[i10];
            ovVar4.b = (FrameLayout) ovVar4.a.getFragmentView();
            ov ovVar5 = ovVarArr[i10];
            ovVar5.c = ovVar5.a.getActionBar();
            ov ovVar6 = ovVarArr[i10];
            ovVar6.addView(ovVar6.b, w7.a6.c(-1.0f, -1));
            AndroidUtilities.removeFromParent(ovVarArr[i10].c);
            ov ovVar7 = ovVarArr[i10];
            ovVar7.addView(ovVar7.c, w7.a6.c(-2.0f, -1));
            ovVarArr[i10].c.setVisibility(8);
            int i11 = 0;
            while (i11 < 2) {
                org.telegram.ui.Components.vl0 vl0Var = i11 == 0 ? ovVarArr[i10].d : ovVarArr[i10].e;
                if (vl0Var != null) {
                    vl0Var.setClipToPadding(false);
                    vl0Var.setOnScrollListener(new hi.p3(5, this, vl0Var.getOnScrollListener()));
                }
                i11++;
            }
        }
        nvVar.addView(this.actionBar, w7.a6.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                ovVarArr[0].f = currentTabId;
            }
            this.e.c();
        }
        m0(false);
        this.w = this.e.getCurrentTabId() == this.e.getFirstTabId();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, new Drawable[]{this.e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.j6.L8));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.w;
    }

    public final void l0(TLRPC.User user) {
        if (user == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.BlockUser);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.R = string;
        d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
        alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new org.telegram.ui.Components.km(20, this, user));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
    }

    public final void m0(boolean z10) {
        ov[] ovVarArr = this.f;
        for (int i10 = 0; i10 < ovVarArr.length; i10++) {
            ovVarArr[i10].d.B0();
            bi.y1 y1Var = ovVarArr[i10].e;
            if (y1Var != null) {
                y1Var.B0();
            }
        }
        int i11 = 0;
        while (i11 < 2) {
            org.telegram.ui.Components.vl0 vl0Var = i11 == 0 ? ovVarArr[z10 ? 1 : 0].d : ovVarArr[z10 ? 1 : 0].e;
            if (vl0Var != null) {
                vl0Var.getAdapter();
                vl0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((s4.c0) vl0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        wy wyVar = this.a;
        if (wyVar != null) {
            wyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        wy wyVar = this.a;
        if (wyVar != null) {
            wyVar.onPause();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        wy wyVar = this.a;
        if (wyVar != null) {
            wyVar.onResume();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}
