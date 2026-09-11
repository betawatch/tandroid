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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ov extends org.telegram.ui.ActionBar.n2 {
    public static final org.telegram.ui.Components.ir0 x = new org.telegram.ui.Components.ir0(2);
    public uy a;
    public ContactsActivity b;
    public org.telegram.ui.ActionBar.v0 c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public nv[] f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public int v;
    public boolean w;

    public static /* synthetic */ void U(ov ovVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.e5.w0(ovVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(ovVar.currentAccount).blockPeer(user.id);
            org.telegram.ui.Components.e5.w0(ovVar, LocaleController.getString(R.string.UserBlocked));
        }
        ovVar.finishFragment();
    }

    public static void j0(ov ovVar, float f7) {
        nv[] nvVarArr = ovVar.f;
        ovVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < nvVarArr.length; i10++) {
            int i11 = (int) f7;
            nvVarArr[i10].d.setPinnedSectionOffsetY(i11);
            bi.o0 o0Var = nvVarArr[i10].e;
            if (o0Var != null) {
                o0Var.setPinnedSectionOffsetY(i11);
            }
        }
        ovVar.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        ContactsActivity contactsActivity = this.b;
        uy uyVar = this.a;
        nv[] nvVarArr = this.f;
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
        this.actionBar.setActionBarMenuOnItemClick(new ic(this, 21));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 9);
        this.c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, w7.x5.e(-1, 44, 83));
        this.e.setDelegate(new g(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        mv mvVar = new mv(this, context);
        this.fragmentView = mvVar;
        mvVar.setWillNotDraw(false);
        uyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        for (int i10 = 0; i10 < nvVarArr.length; i10++) {
            nv nvVar = new nv(this, context);
            nvVarArr[i10] = nvVar;
            mvVar.addView(nvVar, w7.x5.c(-1.0f, -1));
            if (i10 == 0) {
                nv nvVar2 = nvVarArr[i10];
                nvVar2.a = uyVar;
                nvVar2.d = uyVar.e0[0].a;
                uyVar.M3();
                ey eyVar = uyVar.C0;
                nvVar2.e = eyVar != null ? eyVar.V : null;
            } else if (i10 == 1) {
                nv nvVar3 = nvVarArr[i10];
                nvVar3.a = contactsActivity;
                nvVar3.d = contactsActivity.f;
                nvVar3.setVisibility(8);
            }
            nvVarArr[i10].d.setScrollingTouchSlop(1);
            nv nvVar4 = nvVarArr[i10];
            nvVar4.b = (FrameLayout) nvVar4.a.getFragmentView();
            nv nvVar5 = nvVarArr[i10];
            nvVar5.c = nvVar5.a.getActionBar();
            nv nvVar6 = nvVarArr[i10];
            nvVar6.addView(nvVar6.b, w7.x5.c(-1.0f, -1));
            AndroidUtilities.removeFromParent(nvVarArr[i10].c);
            nv nvVar7 = nvVarArr[i10];
            nvVar7.addView(nvVar7.c, w7.x5.c(-2.0f, -1));
            nvVarArr[i10].c.setVisibility(8);
            int i11 = 0;
            while (i11 < 2) {
                org.telegram.ui.Components.ll0 ll0Var = i11 == 0 ? nvVarArr[i10].d : nvVarArr[i10].e;
                if (ll0Var != null) {
                    ll0Var.setClipToPadding(false);
                    ll0Var.setOnScrollListener(new ji.l3(5, this, ll0Var.getOnScrollListener()));
                }
                i11++;
            }
        }
        mvVar.addView(this.actionBar, w7.x5.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                nvVarArr[0].f = currentTabId;
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
        alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new org.telegram.ui.Components.b3(25, this, user));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
    }

    public final void m0(boolean z10) {
        nv[] nvVarArr = this.f;
        for (int i10 = 0; i10 < nvVarArr.length; i10++) {
            nvVarArr[i10].d.B0();
            bi.o0 o0Var = nvVarArr[i10].e;
            if (o0Var != null) {
                o0Var.B0();
            }
        }
        int i11 = 0;
        while (i11 < 2) {
            org.telegram.ui.Components.ll0 ll0Var = i11 == 0 ? nvVarArr[z10 ? 1 : 0].d : nvVarArr[z10 ? 1 : 0].e;
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
