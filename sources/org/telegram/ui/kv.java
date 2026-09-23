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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class kv extends org.telegram.ui.ActionBar.n2 {
    public static final org.telegram.ui.Components.jr0 x = new org.telegram.ui.Components.jr0(2);
    public ry a;
    public ContactsActivity b;
    public org.telegram.ui.ActionBar.v0 c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public jv[] f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public int v;
    public boolean w;

    public static /* synthetic */ void U(kv kvVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.e5.w0(kvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(kvVar.currentAccount).blockPeer(user.id);
            org.telegram.ui.Components.e5.w0(kvVar, LocaleController.getString(R.string.UserBlocked));
        }
        kvVar.finishFragment();
    }

    public static void j0(kv kvVar, float f7) {
        jv[] jvVarArr = kvVar.f;
        kvVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < jvVarArr.length; i10++) {
            int i11 = (int) f7;
            jvVarArr[i10].d.setPinnedSectionOffsetY(i11);
            ai.w0 w0Var = jvVarArr[i10].e;
            if (w0Var != null) {
                w0Var.setPinnedSectionOffsetY(i11);
            }
        }
        kvVar.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        ContactsActivity contactsActivity = this.b;
        ry ryVar = this.a;
        jv[] jvVarArr = this.f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var != null && ((ActionBarLayout) c5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new po(this, 20));
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
        iv ivVar = new iv(this, context);
        this.fragmentView = ivVar;
        ivVar.setWillNotDraw(false);
        ryVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        for (int i10 = 0; i10 < jvVarArr.length; i10++) {
            jv jvVar = new jv(this, context);
            jvVarArr[i10] = jvVar;
            ivVar.addView(jvVar, w7.x5.c(-1.0f, -1));
            if (i10 == 0) {
                jv jvVar2 = jvVarArr[i10];
                jvVar2.a = ryVar;
                jvVar2.d = ryVar.e0[0].a;
                ryVar.M3();
                ay ayVar = ryVar.C0;
                jvVar2.e = ayVar != null ? ayVar.V : null;
            } else if (i10 == 1) {
                jv jvVar3 = jvVarArr[i10];
                jvVar3.a = contactsActivity;
                jvVar3.d = contactsActivity.f;
                jvVar3.setVisibility(8);
            }
            jvVarArr[i10].d.setScrollingTouchSlop(1);
            jv jvVar4 = jvVarArr[i10];
            jvVar4.b = (FrameLayout) jvVar4.a.getFragmentView();
            jv jvVar5 = jvVarArr[i10];
            jvVar5.c = jvVar5.a.getActionBar();
            jv jvVar6 = jvVarArr[i10];
            jvVar6.addView(jvVar6.b, w7.x5.c(-1.0f, -1));
            AndroidUtilities.removeFromParent(jvVarArr[i10].c);
            jv jvVar7 = jvVarArr[i10];
            jvVar7.addView(jvVar7.c, w7.x5.c(-2.0f, -1));
            jvVarArr[i10].c.setVisibility(8);
            int i11 = 0;
            while (i11 < 2) {
                org.telegram.ui.Components.ml0 ml0Var = i11 == 0 ? jvVarArr[i10].d : jvVarArr[i10].e;
                if (ml0Var != null) {
                    ml0Var.setClipToPadding(false);
                    ml0Var.setOnScrollListener(new ii.n3(5, this, ml0Var.getOnScrollListener()));
                }
                i11++;
            }
        }
        ivVar.addView(this.actionBar, w7.x5.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                jvVarArr[0].f = currentTabId;
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
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, new Drawable[]{this.e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.h6.L8));
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
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
        }
    }

    public final void m0(boolean z10) {
        jv[] jvVarArr = this.f;
        for (int i10 = 0; i10 < jvVarArr.length; i10++) {
            jvVarArr[i10].d.B0();
            ai.w0 w0Var = jvVarArr[i10].e;
            if (w0Var != null) {
                w0Var.B0();
            }
        }
        int i11 = 0;
        while (i11 < 2) {
            org.telegram.ui.Components.ml0 ml0Var = i11 == 0 ? jvVarArr[z10 ? 1 : 0].d : jvVarArr[z10 ? 1 : 0].e;
            if (ml0Var != null) {
                ml0Var.getAdapter();
                ml0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((s4.c0) ml0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        ry ryVar = this.a;
        if (ryVar != null) {
            ryVar.onFragmentDestroy();
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
        ry ryVar = this.a;
        if (ryVar != null) {
            ryVar.onPause();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        ry ryVar = this.a;
        if (ryVar != null) {
            ryVar.onResume();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}
