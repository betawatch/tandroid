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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class mv extends org.telegram.ui.ActionBar.n2 {
    public static final org.telegram.ui.Components.ns0 x = new org.telegram.ui.Components.ns0(2);
    public ty a;
    public ContactsActivity b;
    public org.telegram.ui.ActionBar.v0 c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public lv[] f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public int v;
    public boolean w;

    public static /* synthetic */ void U(mv mvVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.g5.v0(mvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(mvVar.currentAccount).blockPeer(user.id);
            org.telegram.ui.Components.g5.v0(mvVar, LocaleController.getString(R.string.UserBlocked));
        }
        mvVar.finishFragment();
    }

    public static void j0(mv mvVar, float f7) {
        lv[] lvVarArr = mvVar.f;
        mvVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < lvVarArr.length; i10++) {
            int i11 = (int) f7;
            lvVarArr[i10].d.setPinnedSectionOffsetY(i11);
            ai.w0 w0Var = lvVarArr[i10].e;
            if (w0Var != null) {
                w0Var.setPinnedSectionOffsetY(i11);
            }
        }
        mvVar.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        float f7;
        ContactsActivity contactsActivity = this.b;
        ty tyVar = this.a;
        lv[] lvVarArr = this.f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f10 = 44.0f;
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new ro(this, 20));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.o().a(0, R.drawable.outline_header_search);
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
        kv kvVar = new kv(this, context);
        this.fragmentView = kvVar;
        kvVar.setWillNotDraw(false);
        tyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i10 = 0;
        while (i10 < lvVarArr.length) {
            lv lvVar = new lv(this, context);
            lvVarArr[i10] = lvVar;
            kvVar.addView(lvVar, w7.x5.d(-1.0f, -1));
            if (i10 == 0) {
                lv lvVar2 = lvVarArr[i10];
                lvVar2.a = tyVar;
                f7 = f10;
                lvVar2.d = tyVar.e0[0].a;
                tyVar.J3();
                dy dyVar = tyVar.C0;
                lvVar2.e = dyVar != null ? dyVar.V : null;
            } else {
                f7 = f10;
                if (i10 == 1) {
                    lv lvVar3 = lvVarArr[i10];
                    lvVar3.a = contactsActivity;
                    lvVar3.d = contactsActivity.f;
                    lvVar3.setVisibility(8);
                }
            }
            lvVarArr[i10].d.setScrollingTouchSlop(1);
            lv lvVar4 = lvVarArr[i10];
            lvVar4.b = (FrameLayout) lvVar4.a.getFragmentView();
            lv lvVar5 = lvVarArr[i10];
            lvVar5.c = lvVar5.a.getActionBar();
            lv lvVar6 = lvVarArr[i10];
            lvVar6.addView(lvVar6.b, w7.x5.d(-1.0f, -1));
            AndroidUtilities.removeFromParent(lvVarArr[i10].c);
            lv lvVar7 = lvVarArr[i10];
            lvVar7.addView(lvVar7.c, w7.x5.d(-2.0f, -1));
            lvVarArr[i10].c.setVisibility(8);
            int i11 = 0;
            while (i11 < 2) {
                org.telegram.ui.Components.qm0 qm0Var = i11 == 0 ? lvVarArr[i10].d : lvVarArr[i10].e;
                if (qm0Var != null) {
                    qm0Var.setClipToPadding(false);
                    qm0Var.setOnScrollListener(new ii.n3(5, this, qm0Var.getOnScrollListener()));
                }
                i11++;
            }
            i10++;
            f10 = f7;
        }
        float f11 = f10;
        kvVar.addView(this.actionBar, w7.x5.d(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(f11));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                lvVarArr[0].f = currentTabId;
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
        alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new org.telegram.ui.Components.y2(26, this, user));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
        }
    }

    public final void m0(boolean z10) {
        lv[] lvVarArr = this.f;
        for (int i10 = 0; i10 < lvVarArr.length; i10++) {
            lvVarArr[i10].d.B0();
            ai.w0 w0Var = lvVarArr[i10].e;
            if (w0Var != null) {
                w0Var.B0();
            }
        }
        int i11 = 0;
        while (i11 < 2) {
            org.telegram.ui.Components.qm0 qm0Var = i11 == 0 ? lvVarArr[z10 ? 1 : 0].d : lvVarArr[z10 ? 1 : 0].e;
            if (qm0Var != null) {
                qm0Var.getAdapter();
                qm0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((s4.d0) qm0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        ty tyVar = this.a;
        if (tyVar != null) {
            tyVar.onFragmentDestroy();
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
        ty tyVar = this.a;
        if (tyVar != null) {
            tyVar.onPause();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        ty tyVar = this.a;
        if (tyVar != null) {
            tyVar.onResume();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}
