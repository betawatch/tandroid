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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class lv extends org.telegram.ui.ActionBar.p2 {
    public static final org.telegram.ui.Components.kr0 x = new org.telegram.ui.Components.kr0(2);
    public py a;
    public ContactsActivity b;
    public org.telegram.ui.ActionBar.w0 c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public kv[] f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public int v;
    public boolean w;

    public static /* synthetic */ void U(lv lvVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.z4.w0(lvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(lvVar.currentAccount).blockPeer(user.id);
            org.telegram.ui.Components.z4.w0(lvVar, LocaleController.getString(R.string.UserBlocked));
        }
        lvVar.finishFragment();
    }

    public static void j0(lv lvVar, float f10) {
        kv[] kvVarArr = lvVar.f;
        lvVar.actionBar.setTranslationY(f10);
        for (int i10 = 0; i10 < kvVarArr.length; i10++) {
            int i11 = (int) f10;
            kvVarArr[i10].d.setPinnedSectionOffsetY(i11);
            mh.d1 d1Var = kvVarArr[i10].e;
            if (d1Var != null) {
                d1Var.setPinnedSectionOffsetY(i11);
            }
        }
        lvVar.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        ContactsActivity contactsActivity = this.b;
        py pyVar = this.a;
        kv[] kvVarArr = this.f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 7));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new fb(this, 8);
        this.c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, k7.c6.e(-1, 44, 83));
        this.e.setDelegate(new h(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        jv jvVar = new jv(this, context);
        this.fragmentView = jvVar;
        jvVar.setWillNotDraw(false);
        pyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        for (int i10 = 0; i10 < kvVarArr.length; i10++) {
            kv kvVar = new kv(this, context);
            kvVarArr[i10] = kvVar;
            jvVar.addView(kvVar, k7.c6.c(-1.0f, -1));
            if (i10 == 0) {
                kv kvVar2 = kvVarArr[i10];
                kvVar2.a = pyVar;
                kvVar2.d = pyVar.b0[0].a;
                pyVar.M3();
                yx yxVar = pyVar.z0;
                kvVar2.e = yxVar != null ? yxVar.S : null;
            } else if (i10 == 1) {
                kv kvVar3 = kvVarArr[i10];
                kvVar3.a = contactsActivity;
                kvVar3.d = contactsActivity.f;
                kvVar3.setVisibility(8);
            }
            kvVarArr[i10].d.setScrollingTouchSlop(1);
            kv kvVar4 = kvVarArr[i10];
            kvVar4.b = (FrameLayout) kvVar4.a.getFragmentView();
            kv kvVar5 = kvVarArr[i10];
            kvVar5.c = kvVar5.a.getActionBar();
            kv kvVar6 = kvVarArr[i10];
            kvVar6.addView(kvVar6.b, k7.c6.c(-1.0f, -1));
            AndroidUtilities.removeFromParent(kvVarArr[i10].c);
            kv kvVar7 = kvVarArr[i10];
            kvVar7.addView(kvVar7.c, k7.c6.c(-2.0f, -1));
            kvVarArr[i10].c.setVisibility(8);
            int i11 = 0;
            while (i11 < 2) {
                org.telegram.ui.Components.sl0 sl0Var = i11 == 0 ? kvVarArr[i10].d : kvVarArr[i10].e;
                if (sl0Var != null) {
                    sl0Var.setClipToPadding(false);
                    sl0Var.setOnScrollListener(new kh.l(6, this, sl0Var.getOnScrollListener()));
                }
                i11++;
            }
        }
        jvVar.addView(this.actionBar, k7.c6.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                kvVarArr[0].f = currentTabId;
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
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.k6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.k6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.k6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, new Drawable[]{this.e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.k6.L8));
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
        d2Var.O = string;
        d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
        alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new rs(3, this, user));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
        }
    }

    public final void m0(boolean z4) {
        kv[] kvVarArr = this.f;
        for (int i10 = 0; i10 < kvVarArr.length; i10++) {
            kvVarArr[i10].d.B0();
            mh.d1 d1Var = kvVarArr[i10].e;
            if (d1Var != null) {
                d1Var.B0();
            }
        }
        int i11 = 0;
        while (i11 < 2) {
            org.telegram.ui.Components.sl0 sl0Var = i11 == 0 ? kvVarArr[z4 ? 1 : 0].d : kvVarArr[z4 ? 1 : 0].e;
            if (sl0Var != null) {
                sl0Var.getAdapter();
                sl0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((f2.j0) sl0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        py pyVar = this.a;
        if (pyVar != null) {
            pyVar.onFragmentDestroy();
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
        py pyVar = this.a;
        if (pyVar != null) {
            pyVar.onPause();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        py pyVar = this.a;
        if (pyVar != null) {
            pyVar.onResume();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}
