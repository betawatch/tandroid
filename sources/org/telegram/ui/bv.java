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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bv extends org.telegram.ui.ActionBar.r2 {
    public static final org.telegram.ui.Components.rs0 x = new org.telegram.ui.Components.rs0(2);
    public ey a;
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

    public static /* synthetic */ void V(bv bvVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.g5.v0(bvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(bvVar.currentAccount).blockPeer(user.id);
            org.telegram.ui.Components.g5.v0(bvVar, LocaleController.getString(R.string.UserBlocked));
        }
        bvVar.finishFragment();
    }

    public static void k0(bv bvVar, float f7) {
        av[] avVarArr = bvVar.f;
        bvVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < avVarArr.length; i10++) {
            int i11 = (int) f7;
            avVarArr[i10].d.setPinnedSectionOffsetY(i11);
            bi.r1 r1Var = avVarArr[i10].e;
            if (r1Var != null) {
                r1Var.setPinnedSectionOffsetY(i11);
            }
        }
        bvVar.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d6));
        ey eyVar = this.a;
        if (eyVar != null) {
            eyVar.addThemeColorKeys(hashSet);
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.addThemeColorKeys(hashSet);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        float f7;
        ContactsActivity contactsActivity = this.b;
        ey eyVar = this.a;
        av[] avVarArr = this.f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f10 = 44.0f;
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new ga(this, 25));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.l().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new jg.e2(this, 10);
        this.c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, org.telegram.ui.Components.kb1.i(-1, 44, 83));
        this.e.setDelegate(new f(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        zu zuVar = new zu(this, context);
        this.fragmentView = zuVar;
        zuVar.setWillNotDraw(false);
        eyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i10 = 0;
        while (i10 < avVarArr.length) {
            av avVar = new av(this, context);
            avVarArr[i10] = avVar;
            zuVar.addView(avVar, org.telegram.ui.Components.kb1.g(-1.0f, -1));
            if (i10 == 0) {
                av avVar2 = avVarArr[i10];
                avVar2.a = eyVar;
                f7 = f10;
                avVar2.d = eyVar.e0[0].a;
                eyVar.U3();
                mx mxVar = eyVar.C0;
                avVar2.e = mxVar != null ? mxVar.a0 : null;
            } else {
                f7 = f10;
                if (i10 == 1) {
                    av avVar3 = avVarArr[i10];
                    avVar3.a = contactsActivity;
                    avVar3.d = contactsActivity.d;
                    avVar3.setVisibility(8);
                }
            }
            avVarArr[i10].d.setScrollingTouchSlop(1);
            av avVar4 = avVarArr[i10];
            avVar4.b = (FrameLayout) avVar4.a.getFragmentView();
            av avVar5 = avVarArr[i10];
            avVar5.c = avVar5.a.getActionBar();
            av avVar6 = avVarArr[i10];
            avVar6.addView(avVar6.b, org.telegram.ui.Components.kb1.g(-1.0f, -1));
            AndroidUtilities.removeFromParent(avVarArr[i10].c);
            av avVar7 = avVarArr[i10];
            avVar7.addView(avVar7.c, org.telegram.ui.Components.kb1.g(-2.0f, -1));
            avVarArr[i10].c.setVisibility(8);
            int i11 = 0;
            while (i11 < 2) {
                org.telegram.ui.Components.nm0 nm0Var = i11 == 0 ? avVarArr[i10].d : avVarArr[i10].e;
                if (nm0Var != null) {
                    nm0Var.setClipToPadding(false);
                    nm0Var.setOnScrollListener(new ai.u0(6, this, nm0Var.getOnScrollListener()));
                }
                i11++;
            }
            i10++;
            f10 = f7;
        }
        float f11 = f10;
        zuVar.addView(this.actionBar, org.telegram.ui.Components.kb1.g(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(f11));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                avVarArr[0].f = currentTabId;
            }
            this.e.c();
        }
        n0(false);
        this.w = this.e.getCurrentTabId() == this.e.getFirstTabId();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.e.getSelectorDrawable()}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.L8));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.w;
    }

    public final void m0(TLRPC.User user) {
        if (user == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.BlockUser);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.R = string;
        e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
        alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new org.telegram.ui.Components.voip.k1(6, this, user));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
        }
    }

    public final void n0(boolean z10) {
        av[] avVarArr = this.f;
        for (int i10 = 0; i10 < avVarArr.length; i10++) {
            avVarArr[i10].d.C0();
            bi.r1 r1Var = avVarArr[i10].e;
            if (r1Var != null) {
                r1Var.C0();
            }
        }
        int i11 = 0;
        while (i11 < 2) {
            org.telegram.ui.Components.nm0 nm0Var = i11 == 0 ? avVarArr[z10 ? 1 : 0].d : avVarArr[z10 ? 1 : 0].e;
            if (nm0Var != null) {
                nm0Var.getAdapter();
                nm0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((s4.c0) nm0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        ey eyVar = this.a;
        if (eyVar != null) {
            eyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        ey eyVar = this.a;
        if (eyVar != null) {
            eyVar.onPause();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        ey eyVar = this.a;
        if (eyVar != null) {
            eyVar.onResume();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            ey eyVar = this.a;
            if (eyVar != null && eyVar.fragmentView != null) {
                eyVar.onThemeColorsChanged();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            ContactsActivity contactsActivity = this.b;
            if (contactsActivity == null || contactsActivity.fragmentView == null) {
                return;
            }
            contactsActivity.onThemeColorsChanged();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
