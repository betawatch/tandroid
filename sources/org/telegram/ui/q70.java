package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.util.Property;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q70 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener, td.b, xg.d {
    public boolean A;
    public final HashMap B;
    public final ArrayList C;
    public org.telegram.ui.Components.w20 D;
    public int E;
    public int F;
    public int G;
    public final ig.e H;
    public final ng.d I;
    public ig.k J;
    public final ArrayList K;
    public final RectF L;
    public final int a;
    public final td.c b;
    public org.telegram.ui.Components.j10 c;
    public o70 d;
    public org.telegram.ui.ActionBar.w1 e;
    public p70 f;
    public org.telegram.ui.Components.wk0 h;
    public f2.m0 n;
    public org.telegram.ui.Components.gw0 r;
    public m70 s;
    public boolean v;
    public ArrayList w;
    public int x;
    public boolean y;

    public q70() {
        super(null);
        int i9 = Build.VERSION.SDK_INT;
        this.a = i9 >= 31 ? 48 : 0;
        this.b = new td.c(3, this, org.telegram.ui.Components.gr.h, 350L, AndroidUtilities.dp(37.0f));
        this.B = new HashMap();
        this.C = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.K = arrayList;
        RectF rectF = new RectF();
        this.L = rectF;
        arrayList.add(rectF);
        if (i9 >= 31) {
            this.H = new ig.e(false);
            this.I = new ng.d(null);
        } else {
            this.H = null;
            this.I = null;
        }
    }

    public static void T(q70 q70Var, View view, int i9) {
        org.telegram.ui.Cells.p4 p4Var;
        ContactsController.Contact contact;
        if (i9 == 0 && !q70Var.A) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String inviteText = ContactsController.getInstance(q70Var.currentAccount).getInviteText(0);
                intent.putExtra("android.intent.extra.TEXT", inviteText);
                q70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, inviteText), 500);
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.p4) && (contact = (p4Var = (org.telegram.ui.Cells.p4) view).getContact()) != null) {
            org.telegram.ui.Components.w20 w20Var = (org.telegram.ui.Components.w20) q70Var.B.get(contact.key);
            if (w20Var != null) {
                q70Var.f.a(w20Var);
            } else {
                org.telegram.ui.Components.w20 w20Var2 = new org.telegram.ui.Components.w20(q70Var.getParentActivity(), null, contact, true, q70Var.resourceProvider);
                p70 p70Var = q70Var.f;
                ArrayList arrayList = p70Var.c;
                q70 q70Var2 = p70Var.h;
                q70Var2.C.add(w20Var2);
                q70Var2.B.put(w20Var2.getKey(), w20Var2);
                AnimatorSet animatorSet = p70Var.a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    p70Var.a.cancel();
                }
                p70Var.b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                p70Var.a = animatorSet2;
                animatorSet2.addListener(new org.telegram.ui.Components.y11(p70Var, 29));
                p70Var.a.setInterpolator(org.telegram.ui.Components.gr.h);
                p70Var.a.setDuration(320L);
                p70Var.d = w20Var2;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(p70Var.d, (Property<org.telegram.ui.Components.w20, Float>) View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(p70Var.d, (Property<org.telegram.ui.Components.w20, Float>) View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(p70Var.d, (Property<org.telegram.ui.Components.w20, Float>) View.ALPHA, 0.0f, 1.0f));
                p70Var.addView(w20Var2);
                w20Var2.setOnClickListener(q70Var);
            }
            q70Var.c.e(!q70Var.C.isEmpty(), true);
            if (q70Var.A || q70Var.y) {
                return;
            }
            boolean z10 = w20Var == null;
            org.telegram.ui.Components.dp dpVar = p4Var.e;
            if (dpVar != null) {
                dpVar.a(z10, true);
            }
        }
    }

    public static /* synthetic */ void U(q70 q70Var) {
        ArrayList arrayList = q70Var.C;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i9 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ContactsController.Contact contact = ((org.telegram.ui.Components.w20) arrayList.get(i10)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append(contact.phones.get(0));
                if (i10 == 0 && arrayList.size() == 1) {
                    i9 = contact.imported;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", ContactsController.getInstance(q70Var.currentAccount).getInviteText(i9));
            q70Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        q70Var.finishFragment();
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 3) {
            int paddingTop = this.h.getPaddingTop();
            this.d.invalidate();
            Z();
            a0();
            int paddingTop2 = this.h.getPaddingTop();
            if (paddingTop2 != paddingTop) {
                this.h.scrollBy(0, paddingTop - paddingTop2);
            }
        }
    }

    @Override // xg.d
    public final View M() {
        return this.fragmentView;
    }

    public final void X() {
        ig.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.H) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        this.L.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + AndroidUtilities.dp(48.0f) + this.x);
        eVar.g(1, this.K);
        eVar.e(this.J, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    public final void Y() {
        org.telegram.ui.Components.j10 j10Var = this.c;
        if (j10Var != null) {
            j10Var.setTranslationY(-Math.max(this.F, this.G));
        }
    }

    public final void Z() {
        this.h.setPadding(0, AndroidUtilities.dp(4.0f) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.a) + ((int) this.b.e), 0, this.F);
        this.r.setPadding(0, 0, 0, this.F);
    }

    public final void a0() {
        this.d.setTranslationY(this.actionBar.getMeasuredHeight());
    }

    public final void b0() {
        org.telegram.ui.Cells.p4 p4Var;
        ContactsController.Contact contact;
        int childCount = this.h.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = this.h.getChildAt(i9);
            if ((childAt instanceof org.telegram.ui.Cells.p4) && (contact = (p4Var = (org.telegram.ui.Cells.p4) childAt).getContact()) != null) {
                boolean containsKey = this.B.containsKey(contact.key);
                org.telegram.ui.Components.dp dpVar = p4Var.e;
                if (dpVar != null) {
                    dpVar.a(containsKey, true);
                }
            }
        }
    }

    public final void c0() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.w = arrayList;
        Collections.sort(arrayList, new org.telegram.ui.Components.jn0(8));
        org.telegram.ui.Components.gw0 gw0Var = this.r;
        if (gw0Var != null) {
            gw0Var.e(false, true);
        }
        m70 m70Var = this.s;
        if (m70Var != null) {
            m70Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.A = false;
        this.y = false;
        this.C.clear();
        this.B.clear();
        this.D = null;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteFriends));
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 26));
        m0 m0Var = new m0(this, context, 9);
        this.fragmentView = m0Var;
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(this, context, 3);
        this.e = w1Var;
        w1Var.setVerticalScrollBarEnabled(false);
        p70 p70Var = new p70(this, context);
        this.f = p70Var;
        this.e.addView(p70Var, g7.e6.c(108.0f, -1));
        this.d = new o70(this, context, this.e);
        org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
        e00Var.setViewType(6);
        e00Var.w = false;
        org.telegram.ui.Components.gw0 gw0Var = new org.telegram.ui.Components.gw0(context, e00Var, 0, null);
        this.r = gw0Var;
        gw0Var.addView(e00Var, 0);
        this.r.setAnimateLayoutChange(true);
        this.r.d.setText(LocaleController.getString(R.string.NoContacts));
        this.r.e.setText("");
        this.r.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        int i9 = org.telegram.ui.ActionBar.f6.a7;
        m0Var.setBackgroundColor(getThemedColor(i9));
        m0Var.addView(this.r);
        this.n = new f2.m0(1, false);
        this.s = new m70(this, context);
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.h = wk0Var;
        wk0Var.setSections(true);
        this.h.setEmptyView(this.r);
        this.h.setAdapter(this.s);
        this.h.setLayoutManager(this.n);
        this.h.setVerticalScrollBarEnabled(true);
        this.h.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        this.h.setClipToPadding(false);
        m0Var.addView(this.h, g7.e6.d(-1, -1.0f, 119, 0.0f, -this.a, 0.0f, 0.0f));
        this.h.setOnItemClickListener(new i(this, 14));
        this.h.setOnScrollListener(new l3(this, 16));
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        h2Var.l = 180;
        h2Var.invalidateSelf();
        org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(context, this.resourceProvider, false);
        this.c = j10Var;
        j10Var.c.setImageDrawable(h2Var);
        this.c.e(false, false);
        this.c.setContentDescription(LocaleController.getString(R.string.Next));
        this.c.setOnClickListener(new q50(this, 4));
        this.actionBar.setBackgroundColor(getThemedColor(i9));
        org.telegram.ui.Components.wk0 wk0Var2 = this.h;
        Objects.requireNonNull(wk0Var2);
        this.J = new ig.k(wk0Var2, m0Var, new ns(wk0Var2, 0));
        this.h.C0(new j70(this, 0));
        m70 m70Var = this.s;
        if (m70Var != null && !this.A) {
            this.r.setVisibility(m70Var.h() != 2 ? 4 : 0);
        }
        m0Var.addView(this.c, org.telegram.ui.Components.j10.b());
        m0Var.addView(this.actionBar);
        m0Var.addView(this.d, g7.e6.d(-1, -2.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            launchActivity.c1.d.add(this);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        org.telegram.ui.Components.gw0 gw0Var;
        if (i9 == NotificationCenter.contactsImported) {
            c0();
        } else {
            if (i9 != NotificationCenter.contactsDidLoad || (gw0Var = this.r) == null) {
                return;
            }
            gw0Var.e(false, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 19);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 16, new Class[]{org.telegram.ui.Cells.f4.class}, null, null, null, org.telegram.ui.ActionBar.f6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 0, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Zh));
        int i9 = org.telegram.ui.ActionBar.f6.ai;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 0, new Class[]{org.telegram.ui.Cells.p4.class}, null, org.telegram.ui.ActionBar.f6.r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        int i10 = org.telegram.ui.ActionBar.f6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, new Class[]{org.telegram.ui.Components.w20.class}, null, null, null, org.telegram.ui.ActionBar.f6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, new Class[]{org.telegram.ui.Components.w20.class}, null, null, null, org.telegram.ui.ActionBar.f6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, new Class[]{org.telegram.ui.Components.w20.class}, null, null, null, org.telegram.ui.ActionBar.f6.di));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, new Class[]{org.telegram.ui.Components.w20.class}, null, null, null, i10));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // xg.d
    public final void k(r0.m1 m1Var) {
        this.G = m1Var.a.f(8).d;
        Y();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.w20 w20Var = (org.telegram.ui.Components.w20) view;
        if (w20Var.y) {
            this.D = null;
            this.f.a(w20Var);
            this.c.e(!this.C.isEmpty(), true);
            b0();
            return;
        }
        org.telegram.ui.Components.w20 w20Var2 = this.D;
        if (w20Var2 != null) {
            w20Var2.a();
        }
        this.D = w20Var;
        w20Var.b();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsImported);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        c0();
        if (!UserConfig.getInstance(this.currentAccount).contactsReimported) {
            ContactsController.getInstance(this.currentAccount).forceImportContacts();
            UserConfig.getInstance(this.currentAccount).contactsReimported = true;
            UserConfig.getInstance(this.currentAccount).saveConfig(false);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsImported);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.F = i12;
        Z();
        Y();
    }

    @Override // xg.d
    public final /* synthetic */ void K() {
    }

    @Override // xg.d
    public final /* synthetic */ void t() {
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
