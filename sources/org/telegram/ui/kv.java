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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class kv extends org.telegram.ui.ActionBar.p2 {
    public static final org.telegram.ui.Components.kr0 x = new org.telegram.ui.Components.kr0(2);
    public oy a;
    public ContactsActivity b;
    public org.telegram.ui.ActionBar.w0 c;
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
            org.telegram.ui.Components.z4.w0(kvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(kvVar.currentAccount).blockPeer(user.id);
            org.telegram.ui.Components.z4.w0(kvVar, LocaleController.getString(R.string.UserBlocked));
        }
        kvVar.finishFragment();
    }

    public static void j0(kv kvVar, float f10) {
        jv[] jvVarArr = kvVar.f;
        kvVar.actionBar.setTranslationY(f10);
        for (int i10 = 0; i10 < jvVarArr.length; i10++) {
            int i11 = (int) f10;
            jvVarArr[i10].d.setPinnedSectionOffsetY(i11);
            lh.e1 e1Var = jvVarArr[i10].e;
            if (e1Var != null) {
                e1Var.setPinnedSectionOffsetY(i11);
            }
        }
        kvVar.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        ContactsActivity contactsActivity = this.b;
        oy oyVar = this.a;
        jv[] jvVarArr = this.f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).J0) {
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
        this.actionBar.addView(this.e, k7.b6.e(-1, 44, 83));
        this.e.setDelegate(new h(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        iv ivVar = new iv(this, context);
        this.fragmentView = ivVar;
        ivVar.setWillNotDraw(false);
        oyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        for (int i10 = 0; i10 < jvVarArr.length; i10++) {
            jv jvVar = new jv(this, context);
            jvVarArr[i10] = jvVar;
            ivVar.addView(jvVar, k7.b6.c(-1.0f, -1));
            if (i10 == 0) {
                jv jvVar2 = jvVarArr[i10];
                jvVar2.a = oyVar;
                jvVar2.d = oyVar.b0[0].a;
                oyVar.M3();
                xx xxVar = oyVar.z0;
                jvVar2.e = xxVar != null ? xxVar.S : null;
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
            jvVar6.addView(jvVar6.b, k7.b6.c(-1.0f, -1));
            AndroidUtilities.removeFromParent(jvVarArr[i10].c);
            jv jvVar7 = jvVarArr[i10];
            jvVar7.addView(jvVar7.c, k7.b6.c(-2.0f, -1));
            jvVarArr[i10].c.setVisibility(8);
            int i11 = 0;
            while (i11 < 2) {
                org.telegram.ui.Components.sl0 sl0Var = i11 == 0 ? jvVarArr[i10].d : jvVarArr[i10].e;
                if (sl0Var != null) {
                    sl0Var.setClipToPadding(false);
                    sl0Var.setOnScrollListener(new jh.l(6, this, sl0Var.getOnScrollListener()));
                }
                i11++;
            }
        }
        ivVar.addView(this.actionBar, k7.b6.c(-2.0f, -1));
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
        d2Var.O = string;
        d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
        alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new qs(3, this, user));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
    }

    public final void m0(boolean z4) {
        jv[] jvVarArr = this.f;
        for (int i10 = 0; i10 < jvVarArr.length; i10++) {
            jvVarArr[i10].d.B0();
            lh.e1 e1Var = jvVarArr[i10].e;
            if (e1Var != null) {
                e1Var.B0();
            }
        }
        int i11 = 0;
        while (i11 < 2) {
            org.telegram.ui.Components.sl0 sl0Var = i11 == 0 ? jvVarArr[z4 ? 1 : 0].d : jvVarArr[z4 ? 1 : 0].e;
            if (sl0Var != null) {
                sl0Var.getAdapter();
                sl0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((f2.i0) sl0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        oy oyVar = this.a;
        if (oyVar != null) {
            oyVar.onFragmentDestroy();
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
        oy oyVar = this.a;
        if (oyVar != null) {
            oyVar.onPause();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        oy oyVar = this.a;
        if (oyVar != null) {
            oyVar.onResume();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}
