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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class e80 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener, xd.b, ch.d {
    public boolean B;
    public final HashMap C;
    public final ArrayList D;
    public org.telegram.ui.Components.o30 E;
    public int F;
    public int G;
    public int H;
    public final ng.e I;
    public final sg.d J;
    public ng.k K;
    public final ArrayList L;
    public final RectF M;
    public final int a;
    public final xd.c b;
    public org.telegram.ui.Components.a20 c;
    public c80 d;
    public org.telegram.ui.ActionBar.x1 e;
    public d80 f;
    public org.telegram.ui.Components.rl0 h;
    public f2.i0 n;
    public org.telegram.ui.Components.zw0 r;
    public a80 s;
    public boolean v;
    public ArrayList w;
    public int x;
    public boolean y;

    public e80() {
        super(null);
        int i10 = Build.VERSION.SDK_INT;
        this.a = i10 >= 31 ? 48 : 0;
        this.b = new xd.c(3, this, org.telegram.ui.Components.mr.h, 350L, AndroidUtilities.dp(37.0f));
        this.C = new HashMap();
        this.D = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.L = arrayList;
        RectF rectF = new RectF();
        this.M = rectF;
        arrayList.add(rectF);
        if (i10 >= 31) {
            this.I = new ng.e(false);
            this.J = new sg.d(null);
        } else {
            this.I = null;
            this.J = null;
        }
    }

    public static void U(e80 e80Var, View view, int i10) {
        org.telegram.ui.Cells.o4 o4Var;
        ContactsController.Contact contact;
        if (i10 == 0 && !e80Var.B) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String inviteText = ContactsController.getInstance(e80Var.currentAccount).getInviteText(0);
                intent.putExtra("android.intent.extra.TEXT", inviteText);
                e80Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, inviteText), 500);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.o4) && (contact = (o4Var = (org.telegram.ui.Cells.o4) view).getContact()) != null) {
            org.telegram.ui.Components.o30 o30Var = (org.telegram.ui.Components.o30) e80Var.C.get(contact.key);
            if (o30Var != null) {
                e80Var.f.a(o30Var);
            } else {
                org.telegram.ui.Components.o30 o30Var2 = new org.telegram.ui.Components.o30(e80Var.getParentActivity(), null, contact, true, e80Var.resourceProvider);
                d80 d80Var = e80Var.f;
                ArrayList arrayList = d80Var.c;
                e80 e80Var2 = d80Var.h;
                e80Var2.D.add(o30Var2);
                e80Var2.C.put(o30Var2.getKey(), o30Var2);
                AnimatorSet animatorSet = d80Var.a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    d80Var.a.cancel();
                }
                d80Var.b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                d80Var.a = animatorSet2;
                animatorSet2.addListener(new org.telegram.ui.Components.f91(d80Var, 22));
                d80Var.a.setInterpolator(org.telegram.ui.Components.mr.h);
                d80Var.a.setDuration(320L);
                d80Var.d = o30Var2;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(d80Var.d, (Property<org.telegram.ui.Components.o30, Float>) View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(d80Var.d, (Property<org.telegram.ui.Components.o30, Float>) View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(d80Var.d, (Property<org.telegram.ui.Components.o30, Float>) View.ALPHA, 0.0f, 1.0f));
                d80Var.addView(o30Var2);
                o30Var2.setOnClickListener(e80Var);
            }
            e80Var.c.e(!e80Var.D.isEmpty(), true);
            if (e80Var.B || e80Var.y) {
                return;
            }
            boolean z4 = o30Var == null;
            org.telegram.ui.Components.kp kpVar = o4Var.e;
            if (kpVar != null) {
                kpVar.a(z4, true);
            }
        }
    }

    public static /* synthetic */ void V(e80 e80Var) {
        ArrayList arrayList = e80Var.D;
        try {
            StringBuilder sb = new StringBuilder();
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ContactsController.Contact contact = ((org.telegram.ui.Components.o30) arrayList.get(i11)).getContact();
                if (sb.length() != 0) {
                    sb.append(';');
                }
                sb.append(contact.phones.get(0));
                if (i11 == 0 && arrayList.size() == 1) {
                    i10 = contact.imported;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb.toString()));
            intent.putExtra("sms_body", ContactsController.getInstance(e80Var.currentAccount).getInviteText(i10));
            e80Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
        e80Var.finishFragment();
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 3) {
            int paddingTop = this.h.getPaddingTop();
            this.d.invalidate();
            a0();
            b0();
            int paddingTop2 = this.h.getPaddingTop();
            if (paddingTop2 != paddingTop) {
                this.h.scrollBy(0, paddingTop - paddingTop2);
            }
        }
    }

    @Override // ch.d
    public final View N() {
        return this.fragmentView;
    }

    public final void Y() {
        ng.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.I) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        this.M.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + AndroidUtilities.dp(48.0f) + this.x);
        eVar.g(1, this.L);
        eVar.e(this.K, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    public final void Z() {
        org.telegram.ui.Components.a20 a20Var = this.c;
        if (a20Var != null) {
            a20Var.setTranslationY(-Math.max(this.G, this.H));
        }
    }

    public final void a0() {
        this.h.setPadding(0, AndroidUtilities.dp(4.0f) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.a) + ((int) this.b.e), 0, this.G);
        this.r.setPadding(0, 0, 0, this.G);
    }

    public final void b0() {
        this.d.setTranslationY(this.actionBar.getMeasuredHeight());
    }

    public final void c0() {
        org.telegram.ui.Cells.o4 o4Var;
        ContactsController.Contact contact;
        int childCount = this.h.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.h.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.o4) && (contact = (o4Var = (org.telegram.ui.Cells.o4) childAt).getContact()) != null) {
                boolean containsKey = this.C.containsKey(contact.key);
                org.telegram.ui.Components.kp kpVar = o4Var.e;
                if (kpVar != null) {
                    kpVar.a(containsKey, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.B = false;
        this.y = false;
        this.D.clear();
        this.C.clear();
        this.E = null;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteFriends));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 18));
        n0 n0Var = new n0(this, context, 9);
        this.fragmentView = n0Var;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(this, context, 3);
        this.e = x1Var;
        x1Var.setVerticalScrollBarEnabled(false);
        d80 d80Var = new d80(this, context);
        this.f = d80Var;
        this.e.addView(d80Var, k7.b6.c(108.0f, -1));
        this.d = new c80(this, context, this.e);
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        u00Var.setViewType(6);
        u00Var.w = false;
        org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(context, u00Var, 0, null);
        this.r = zw0Var;
        zw0Var.addView(u00Var, 0);
        this.r.setAnimateLayoutChange(true);
        this.r.d.setText(LocaleController.getString(R.string.NoContacts));
        this.r.e.setText("");
        this.r.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        int i10 = org.telegram.ui.ActionBar.j6.a7;
        n0Var.setBackgroundColor(getThemedColor(i10));
        n0Var.addView(this.r);
        this.n = new f2.i0(1, false);
        this.s = new a80(this, context);
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
        this.h = rl0Var;
        rl0Var.setSections(true);
        this.h.setEmptyView(this.r);
        this.h.setAdapter(this.s);
        this.h.setLayoutManager(this.n);
        this.h.setVerticalScrollBarEnabled(true);
        this.h.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        this.h.setClipToPadding(false);
        n0Var.addView(this.h, k7.b6.d(-1, -1.0f, 119, 0.0f, -this.a, 0.0f, 0.0f));
        this.h.setOnItemClickListener(new j(this, 14));
        this.h.setOnScrollListener(new n3(this, 16));
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        i2Var.l = 180;
        i2Var.invalidateSelf();
        org.telegram.ui.Components.a20 a20Var = new org.telegram.ui.Components.a20(context, this.resourceProvider, false);
        this.c = a20Var;
        a20Var.c.setImageDrawable(i2Var);
        this.c.e(false, false);
        this.c.setContentDescription(LocaleController.getString(R.string.Next));
        this.c.setOnClickListener(new g60(this, 4));
        this.actionBar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.Components.rl0 rl0Var2 = this.h;
        Objects.requireNonNull(rl0Var2);
        this.K = new ng.k(rl0Var2, n0Var, new vs(rl0Var2, 0));
        this.h.C0(new x70(this, 0));
        a80 a80Var = this.s;
        if (a80Var != null && !this.B) {
            this.r.setVisibility(a80Var.h() != 2 ? 4 : 0);
        }
        n0Var.addView(this.c, org.telegram.ui.Components.a20.b());
        n0Var.addView(this.actionBar);
        n0Var.addView(this.d, k7.b6.d(-1, -2.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null) {
            launchActivity.d1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.w = arrayList;
        Collections.sort(arrayList, new eu(3));
        org.telegram.ui.Components.zw0 zw0Var = this.r;
        if (zw0Var != null) {
            zw0Var.e(false, true);
        }
        a80 a80Var = this.s;
        if (a80Var != null) {
            a80Var.l();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.zw0 zw0Var;
        if (i10 == NotificationCenter.contactsImported) {
            d0();
        } else {
            if (i10 != NotificationCenter.contactsDidLoad || (zw0Var = this.r) == null) {
                return;
            }
            zw0Var.e(false, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 19);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 16, new Class[]{org.telegram.ui.Cells.e4.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Zh));
        int i10 = org.telegram.ui.ActionBar.j6.ai;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 262148, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 262148, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{org.telegram.ui.Cells.o4.class}, null, org.telegram.ui.ActionBar.j6.r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        int i11 = org.telegram.ui.ActionBar.j6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 0, new Class[]{org.telegram.ui.Components.o30.class}, null, null, null, org.telegram.ui.ActionBar.j6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 0, new Class[]{org.telegram.ui.Components.o30.class}, null, null, null, org.telegram.ui.ActionBar.j6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 0, new Class[]{org.telegram.ui.Components.o30.class}, null, null, null, org.telegram.ui.ActionBar.j6.di));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 0, new Class[]{org.telegram.ui.Components.o30.class}, null, null, null, i11));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // ch.d
    public final void k(r0.m1 m1Var) {
        this.H = m1Var.a.f(8).d;
        Z();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.o30 o30Var = (org.telegram.ui.Components.o30) view;
        if (o30Var.y) {
            this.E = null;
            this.f.a(o30Var);
            this.c.e(!this.D.isEmpty(), true);
            c0();
            return;
        }
        org.telegram.ui.Components.o30 o30Var2 = this.E;
        if (o30Var2 != null) {
            o30Var2.a();
        }
        this.E = o30Var;
        o30Var.b();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsImported);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        d0();
        if (!UserConfig.getInstance(this.currentAccount).contactsReimported) {
            ContactsController.getInstance(this.currentAccount).forceImportContacts();
            UserConfig.getInstance(this.currentAccount).contactsReimported = true;
            UserConfig.getInstance(this.currentAccount).saveConfig(false);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsImported);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.G = i13;
        a0();
        Z();
    }

    @Override // ch.d
    public final /* synthetic */ void J() {
    }

    @Override // ch.d
    public final /* synthetic */ void t() {
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
