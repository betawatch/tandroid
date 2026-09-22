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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class nv extends org.telegram.ui.ActionBar.n2 {
    public static final org.telegram.ui.Components.jr0 x = new org.telegram.ui.Components.jr0(2);
    public uy a;
    public ContactsActivity b;
    public org.telegram.ui.ActionBar.v0 c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public mv[] f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public int v;
    public boolean w;

    public static /* synthetic */ void U(nv nvVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.c5.w0(nvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(nvVar.currentAccount).blockPeer(user.id);
            org.telegram.ui.Components.c5.w0(nvVar, LocaleController.getString(R.string.UserBlocked));
        }
        nvVar.finishFragment();
    }

    public static void j0(nv nvVar, float f7) {
        mv[] mvVarArr = nvVar.f;
        nvVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < mvVarArr.length; i10++) {
            int i11 = (int) f7;
            mvVarArr[i10].d.setPinnedSectionOffsetY(i11);
            ai.w0 w0Var = mvVarArr[i10].e;
            if (w0Var != null) {
                w0Var.setPinnedSectionOffsetY(i11);
            }
        }
        nvVar.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        ContactsActivity contactsActivity = this.b;
        uy uyVar = this.a;
        mv[] mvVarArr = this.f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new to(this, 20));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 9);
        this.c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, w7.x5.e(-1, 44, 83));
        this.e.setDelegate(new g(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        lv lvVar = new lv(this, context);
        this.fragmentView = lvVar;
        lvVar.setWillNotDraw(false);
        uyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        for (int i10 = 0; i10 < mvVarArr.length; i10++) {
            mv mvVar = new mv(this, context);
            mvVarArr[i10] = mvVar;
            lvVar.addView(mvVar, w7.x5.c(-1.0f, -1));
            if (i10 == 0) {
                mv mvVar2 = mvVarArr[i10];
                mvVar2.a = uyVar;
                mvVar2.d = uyVar.e0[0].a;
                uyVar.M3();
                ey eyVar = uyVar.C0;
                mvVar2.e = eyVar != null ? eyVar.V : null;
            } else if (i10 == 1) {
                mv mvVar3 = mvVarArr[i10];
                mvVar3.a = contactsActivity;
                mvVar3.d = contactsActivity.f;
                mvVar3.setVisibility(8);
            }
            mvVarArr[i10].d.setScrollingTouchSlop(1);
            mv mvVar4 = mvVarArr[i10];
            mvVar4.b = (FrameLayout) mvVar4.a.getFragmentView();
            mv mvVar5 = mvVarArr[i10];
            mvVar5.c = mvVar5.a.getActionBar();
            mv mvVar6 = mvVarArr[i10];
            mvVar6.addView(mvVar6.b, w7.x5.c(-1.0f, -1));
            AndroidUtilities.removeFromParent(mvVarArr[i10].c);
            mv mvVar7 = mvVarArr[i10];
            mvVar7.addView(mvVar7.c, w7.x5.c(-2.0f, -1));
            mvVarArr[i10].c.setVisibility(8);
            int i11 = 0;
            while (i11 < 2) {
                org.telegram.ui.Components.ll0 ll0Var = i11 == 0 ? mvVarArr[i10].d : mvVarArr[i10].e;
                if (ll0Var != null) {
                    ll0Var.setClipToPadding(false);
                    ll0Var.setOnScrollListener(new ii.m3(5, this, ll0Var.getOnScrollListener()));
                }
                i11++;
            }
        }
        lvVar.addView(this.actionBar, w7.x5.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                mvVarArr[0].f = currentTabId;
            }
            this.e.c();
        }
        m0(false);
        this.w = this.e.getCurrentTabId() == this.e.getFirstTabId();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.i6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.i6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.i6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, new Drawable[]{this.e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.i6.L8));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.w;
    }

    public final void l0(TLRPC.User user) {
        if (user == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.BlockUser);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
        alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new org.telegram.ui.Components.mf(24, this, user));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false));
        }
    }

    public final void m0(boolean z10) {
        mv[] mvVarArr = this.f;
        for (int i10 = 0; i10 < mvVarArr.length; i10++) {
            mvVarArr[i10].d.B0();
            ai.w0 w0Var = mvVarArr[i10].e;
            if (w0Var != null) {
                w0Var.B0();
            }
        }
        int i11 = 0;
        while (i11 < 2) {
            org.telegram.ui.Components.ll0 ll0Var = i11 == 0 ? mvVarArr[z10 ? 1 : 0].d : mvVarArr[z10 ? 1 : 0].e;
            if (ll0Var != null) {
                ll0Var.getAdapter();
                ll0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((s4.c0) ll0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        uy uyVar = this.a;
        if (uyVar != null) {
            uyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        uy uyVar = this.a;
        if (uyVar != null) {
            uyVar.onPause();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        uy uyVar = this.a;
        if (uyVar != null) {
            uyVar.onResume();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}
