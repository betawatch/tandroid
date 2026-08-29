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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cv extends org.telegram.ui.ActionBar.o2 {
    public static final org.telegram.ui.Components.cr0 x = new org.telegram.ui.Components.cr0(2);
    public fy a;
    public ContactsActivity b;
    public org.telegram.ui.ActionBar.w0 c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public bv[] f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public int v;
    public boolean w;

    public static /* synthetic */ void U(cv cvVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.c5.w0(cvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(cvVar.currentAccount).blockPeer(user.id);
            org.telegram.ui.Components.c5.w0(cvVar, LocaleController.getString(R.string.UserBlocked));
        }
        cvVar.finishFragment();
    }

    public static void j0(cv cvVar, float f9) {
        bv[] bvVarArr = cvVar.f;
        cvVar.actionBar.setTranslationY(f9);
        for (int i10 = 0; i10 < bvVarArr.length; i10++) {
            int i11 = (int) f9;
            bvVarArr[i10].d.setPinnedSectionOffsetY(i11);
            jh.e1 e1Var = bvVarArr[i10].e;
            if (e1Var != null) {
                e1Var.setPinnedSectionOffsetY(i11);
            }
        }
        cvVar.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        ContactsActivity contactsActivity = this.b;
        fy fyVar = this.a;
        bv[] bvVarArr = this.f;
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
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 7));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new bb(this, 8);
        this.c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, i7.f6.e(-1, 44, 83));
        this.e.setDelegate(new h(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        av avVar = new av(this, context);
        this.fragmentView = avVar;
        avVar.setWillNotDraw(false);
        fyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        for (int i10 = 0; i10 < bvVarArr.length; i10++) {
            bv bvVar = new bv(this, context);
            bvVarArr[i10] = bvVar;
            avVar.addView(bvVar, i7.f6.c(-1.0f, -1));
            if (i10 == 0) {
                bv bvVar2 = bvVarArr[i10];
                bvVar2.a = fyVar;
                bvVar2.d = fyVar.a0[0].a;
                fyVar.M3();
                ox oxVar = fyVar.y0;
                bvVar2.e = oxVar != null ? oxVar.R : null;
            } else if (i10 == 1) {
                bv bvVar3 = bvVarArr[i10];
                bvVar3.a = contactsActivity;
                bvVar3.d = contactsActivity.f;
                bvVar3.setVisibility(8);
            }
            bvVarArr[i10].d.setScrollingTouchSlop(1);
            bv bvVar4 = bvVarArr[i10];
            bvVar4.b = (FrameLayout) bvVar4.a.getFragmentView();
            bv bvVar5 = bvVarArr[i10];
            bvVar5.c = bvVar5.a.getActionBar();
            bv bvVar6 = bvVarArr[i10];
            bvVar6.addView(bvVar6.b, i7.f6.c(-1.0f, -1));
            AndroidUtilities.removeFromParent(bvVarArr[i10].c);
            bv bvVar7 = bvVarArr[i10];
            bvVar7.addView(bvVar7.c, i7.f6.c(-2.0f, -1));
            bvVarArr[i10].c.setVisibility(8);
            int i11 = 0;
            while (i11 < 2) {
                org.telegram.ui.Components.jl0 jl0Var = i11 == 0 ? bvVarArr[i10].d : bvVarArr[i10].e;
                if (jl0Var != null) {
                    jl0Var.setClipToPadding(false);
                    jl0Var.setOnScrollListener(new hh.l(6, this, jl0Var.getOnScrollListener()));
                }
                i11++;
            }
        }
        avVar.addView(this.actionBar, i7.f6.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                bvVarArr[0].f = currentTabId;
            }
            this.e.c();
        }
        m0(false);
        this.w = this.e.getCurrentTabId() == this.e.getFirstTabId();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, new Drawable[]{this.e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.g6.L8));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.w;
    }

    public final void l0(TLRPC.User user) {
        if (user == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.BlockUser);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
        alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new xr(4, this, user));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
        }
    }

    public final void m0(boolean z10) {
        bv[] bvVarArr = this.f;
        for (int i10 = 0; i10 < bvVarArr.length; i10++) {
            bvVarArr[i10].d.B0();
            jh.e1 e1Var = bvVarArr[i10].e;
            if (e1Var != null) {
                e1Var.B0();
            }
        }
        int i11 = 0;
        while (i11 < 2) {
            org.telegram.ui.Components.jl0 jl0Var = i11 == 0 ? bvVarArr[z10 ? 1 : 0].d : bvVarArr[z10 ? 1 : 0].e;
            if (jl0Var != null) {
                jl0Var.getAdapter();
                jl0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((f2.j0) jl0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        fy fyVar = this.a;
        if (fyVar != null) {
            fyVar.onFragmentDestroy();
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
        fy fyVar = this.a;
        if (fyVar != null) {
            fyVar.onPause();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        fy fyVar = this.a;
        if (fyVar != null) {
            fyVar.onResume();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}
