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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bv extends org.telegram.ui.ActionBar.o2 {
    public static final org.telegram.ui.Components.rq0 x = new org.telegram.ui.Components.rq0(2);
    public dy a;
    public ContactsActivity b;
    public org.telegram.ui.ActionBar.w0 c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public av[] f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public int v;
    public boolean w;

    public static /* synthetic */ void T(bv bvVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.y4.w0(bvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(bvVar.currentAccount).blockPeer(user.id);
            org.telegram.ui.Components.y4.w0(bvVar, LocaleController.getString(R.string.UserBlocked));
        }
        bvVar.finishFragment();
    }

    public static void i0(bv bvVar, float f10) {
        av[] avVarArr = bvVar.f;
        bvVar.actionBar.setTranslationY(f10);
        for (int i9 = 0; i9 < avVarArr.length; i9++) {
            int i10 = (int) f10;
            avVarArr[i9].d.setPinnedSectionOffsetY(i10);
            gh.f1 f1Var = avVarArr[i9].e;
            if (f1Var != null) {
                f1Var.setPinnedSectionOffsetY(i10);
            }
        }
        bvVar.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        ContactsActivity contactsActivity = this.b;
        dy dyVar = this.a;
        av[] avVarArr = this.f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 15));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new cb(this, 8);
        this.c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, g7.e6.e(-1, 44, 83));
        this.e.setDelegate(new g(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        zu zuVar = new zu(this, context);
        this.fragmentView = zuVar;
        zuVar.setWillNotDraw(false);
        dyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        for (int i9 = 0; i9 < avVarArr.length; i9++) {
            av avVar = new av(this, context);
            avVarArr[i9] = avVar;
            zuVar.addView(avVar, g7.e6.c(-1.0f, -1));
            if (i9 == 0) {
                av avVar2 = avVarArr[i9];
                avVar2.a = dyVar;
                avVar2.d = dyVar.a0[0].a;
                dyVar.M3();
                mx mxVar = dyVar.y0;
                avVar2.e = mxVar != null ? mxVar.R : null;
            } else if (i9 == 1) {
                av avVar3 = avVarArr[i9];
                avVar3.a = contactsActivity;
                avVar3.d = contactsActivity.f;
                avVar3.setVisibility(8);
            }
            avVarArr[i9].d.setScrollingTouchSlop(1);
            av avVar4 = avVarArr[i9];
            avVar4.b = (FrameLayout) avVar4.a.getFragmentView();
            av avVar5 = avVarArr[i9];
            avVar5.c = avVar5.a.getActionBar();
            av avVar6 = avVarArr[i9];
            avVar6.addView(avVar6.b, g7.e6.c(-1.0f, -1));
            AndroidUtilities.removeFromParent(avVarArr[i9].c);
            av avVar7 = avVarArr[i9];
            avVar7.addView(avVar7.c, g7.e6.c(-2.0f, -1));
            avVarArr[i9].c.setVisibility(8);
            int i10 = 0;
            while (i10 < 2) {
                org.telegram.ui.Components.wk0 wk0Var = i10 == 0 ? avVarArr[i9].d : avVarArr[i9].e;
                if (wk0Var != null) {
                    wk0Var.setClipToPadding(false);
                    wk0Var.setOnScrollListener(new eh.n(6, this, wk0Var.getOnScrollListener()));
                }
                i10++;
            }
        }
        zuVar.addView(this.actionBar, g7.e6.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                avVarArr[0].f = currentTabId;
            }
            this.e.c();
        }
        l0(false);
        this.w = this.e.getCurrentTabId() == this.e.getFirstTabId();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.f6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.f6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.f6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, new Drawable[]{this.e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.f6.L8));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.w;
    }

    public final void k0(TLRPC.User user) {
        if (user == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.BlockUser);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
        alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new yr(4, this, user));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
        }
    }

    public final void l0(boolean z10) {
        av[] avVarArr = this.f;
        for (int i9 = 0; i9 < avVarArr.length; i9++) {
            avVarArr[i9].d.B0();
            gh.f1 f1Var = avVarArr[i9].e;
            if (f1Var != null) {
                f1Var.B0();
            }
        }
        int i10 = 0;
        while (i10 < 2) {
            org.telegram.ui.Components.wk0 wk0Var = i10 == 0 ? avVarArr[z10 ? 1 : 0].d : avVarArr[z10 ? 1 : 0].e;
            if (wk0Var != null) {
                wk0Var.getAdapter();
                wk0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((f2.m0) wk0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        dy dyVar = this.a;
        if (dyVar != null) {
            dyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        dy dyVar = this.a;
        if (dyVar != null) {
            dyVar.onPause();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        dy dyVar = this.a;
        if (dyVar != null) {
            dyVar.onResume();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}
