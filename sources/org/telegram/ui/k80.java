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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class k80 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener, le.d, ph.d {
    public boolean E;
    public final HashMap F;
    public final ArrayList G;
    public org.telegram.ui.Components.q30 H;
    public int I;
    public int J;
    public int K;
    public final ah.i L;
    public final fh.d M;
    public ah.n N;
    public final ArrayList O;
    public final RectF P;
    public final int a;
    public final le.e b;
    public org.telegram.ui.Components.c20 c;
    public i80 d;
    public org.telegram.ui.ActionBar.v1 e;
    public j80 f;
    public org.telegram.ui.Components.zl0 h;
    public s4.c0 n;
    public org.telegram.ui.Components.ux0 r;
    public g80 s;
    public boolean v;
    public ArrayList w;
    public int x;
    public boolean y;

    public k80() {
        super(null);
        int i10 = Build.VERSION.SDK_INT;
        this.a = i10 >= 31 ? 48 : 0;
        this.b = new le.e(3, this, org.telegram.ui.Components.tr.h, 350L, AndroidUtilities.dp(37.0f));
        this.F = new HashMap();
        this.G = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.O = arrayList;
        RectF rectF = new RectF();
        this.P = rectF;
        arrayList.add(rectF);
        if (i10 >= 31) {
            this.L = new ah.i();
            this.M = new fh.d(null);
        } else {
            this.L = null;
            this.M = null;
        }
    }

    public static void S(k80 k80Var, View view, int i10) {
        org.telegram.ui.Cells.p4 p4Var;
        ContactsController.Contact contact;
        if (i10 == 0 && !k80Var.E) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String inviteText = ContactsController.getInstance(k80Var.currentAccount).getInviteText(0);
                intent.putExtra("android.intent.extra.TEXT", inviteText);
                k80Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, inviteText), 500);
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.p4) && (contact = (p4Var = (org.telegram.ui.Cells.p4) view).getContact()) != null) {
            org.telegram.ui.Components.q30 q30Var = (org.telegram.ui.Components.q30) k80Var.F.get(contact.key);
            if (q30Var != null) {
                k80Var.f.a(q30Var);
            } else {
                org.telegram.ui.Components.q30 q30Var2 = new org.telegram.ui.Components.q30(k80Var.getParentActivity(), null, contact, true, k80Var.resourceProvider);
                j80 j80Var = k80Var.f;
                ArrayList arrayList = j80Var.c;
                k80 k80Var2 = j80Var.h;
                k80Var2.G.add(q30Var2);
                k80Var2.F.put(q30Var2.getKey(), q30Var2);
                AnimatorSet animatorSet = j80Var.a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    j80Var.a.cancel();
                }
                j80Var.b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                j80Var.a = animatorSet2;
                animatorSet2.addListener(new org.telegram.ui.Components.b91(j80Var, 24));
                j80Var.a.setInterpolator(org.telegram.ui.Components.tr.h);
                j80Var.a.setDuration(320L);
                j80Var.d = q30Var2;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(j80Var.d, (Property<org.telegram.ui.Components.q30, Float>) View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(j80Var.d, (Property<org.telegram.ui.Components.q30, Float>) View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(j80Var.d, (Property<org.telegram.ui.Components.q30, Float>) View.ALPHA, 0.0f, 1.0f));
                j80Var.addView(q30Var2);
                q30Var2.setOnClickListener(k80Var);
            }
            k80Var.c.e(!k80Var.G.isEmpty(), true);
            if (k80Var.E || k80Var.y) {
                return;
            }
            boolean z10 = q30Var == null;
            org.telegram.ui.Components.qp qpVar = p4Var.e;
            if (qpVar != null) {
                qpVar.a(z10, true);
            }
        }
    }

    public static /* synthetic */ void T(k80 k80Var) {
        ArrayList arrayList = k80Var.G;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ContactsController.Contact contact = ((org.telegram.ui.Components.q30) arrayList.get(i11)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append(contact.phones.get(0));
                if (i11 == 0 && arrayList.size() == 1) {
                    i10 = contact.imported;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", ContactsController.getInstance(k80Var.currentAccount).getInviteText(i10));
            k80Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        k80Var.finishFragment();
    }

    @Override // ph.d
    public final View L() {
        return this.fragmentView;
    }

    public final void X() {
        ah.i iVar;
        if (Build.VERSION.SDK_INT < 31 || (iVar = this.L) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        this.P.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + AndroidUtilities.dp(48.0f) + this.x);
        iVar.g(1, this.O);
        iVar.e(this.N, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    public final void Y() {
        org.telegram.ui.Components.c20 c20Var = this.c;
        if (c20Var != null) {
            c20Var.setTranslationY(-Math.max(this.J, this.K));
        }
    }

    public final void Z() {
        this.h.setPadding(0, AndroidUtilities.dp(4.0f) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.a) + ((int) this.b.e), 0, this.J);
        this.r.setPadding(0, 0, 0, this.J);
    }

    @Override // le.d
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 3) {
            int paddingTop = this.h.getPaddingTop();
            this.d.invalidate();
            Z();
            b0();
            int paddingTop2 = this.h.getPaddingTop();
            if (paddingTop2 != paddingTop) {
                this.h.scrollBy(0, paddingTop - paddingTop2);
            }
        }
    }

    public final void b0() {
        this.d.setTranslationY(this.actionBar.getMeasuredHeight());
    }

    public final void c0() {
        org.telegram.ui.Cells.p4 p4Var;
        ContactsController.Contact contact;
        int childCount = this.h.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.h.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.p4) && (contact = (p4Var = (org.telegram.ui.Cells.p4) childAt).getContact()) != null) {
                boolean containsKey = this.F.containsKey(contact.key);
                org.telegram.ui.Components.qp qpVar = p4Var.e;
                if (qpVar != null) {
                    qpVar.a(containsKey, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.E = false;
        this.y = false;
        this.G.clear();
        this.F.clear();
        this.H = null;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteFriends));
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 1));
        k0 k0Var = new k0(this, context, 9);
        this.fragmentView = k0Var;
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 3);
        this.e = v1Var;
        v1Var.setVerticalScrollBarEnabled(false);
        j80 j80Var = new j80(this, context);
        this.f = j80Var;
        this.e.addView(j80Var, w7.z5.c(108.0f, -1));
        this.d = new i80(this, context, this.e);
        org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(context, null);
        w00Var.setViewType(6);
        w00Var.w = false;
        org.telegram.ui.Components.ux0 ux0Var = new org.telegram.ui.Components.ux0(context, w00Var, 0, null);
        this.r = ux0Var;
        ux0Var.addView(w00Var, 0);
        this.r.setAnimateLayoutChange(true);
        this.r.d.setText(LocaleController.getString(R.string.NoContacts));
        this.r.e.setText("");
        this.r.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        int i10 = org.telegram.ui.ActionBar.i6.a7;
        k0Var.setBackgroundColor(getThemedColor(i10));
        this.n = new s4.c0(1, false);
        this.s = new g80(this, context);
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.h = zl0Var;
        zl0Var.setSections(true);
        this.h.setEmptyView(this.r);
        this.h.setAdapter(this.s);
        this.h.setLayoutManager(this.n);
        this.h.setVerticalScrollBarEnabled(true);
        this.h.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        this.h.setClipToPadding(false);
        k0Var.addView(this.h, w7.z5.d(-1, -1.0f, 119, 0.0f, -this.a, 0.0f, 0.0f));
        k0Var.addView(this.r);
        this.h.setOnItemClickListener(new i(this, 14));
        this.h.setOnScrollListener(new i3(this, 17));
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        g2Var.l = 180;
        g2Var.invalidateSelf();
        org.telegram.ui.Components.c20 c20Var = new org.telegram.ui.Components.c20(context, this.resourceProvider, false);
        this.c = c20Var;
        c20Var.c.setImageDrawable(g2Var);
        this.c.e(false, false);
        this.c.setContentDescription(LocaleController.getString(R.string.Next));
        this.c.setOnClickListener(new j60(this, 4));
        this.actionBar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.Components.zl0 zl0Var2 = this.h;
        Objects.requireNonNull(zl0Var2);
        this.N = new ah.n(zl0Var2, k0Var, new vs(zl0Var2, 0));
        this.h.D0(new d80(this, 0));
        g80 g80Var = this.s;
        if (g80Var != null && !this.E) {
            this.r.setVisibility(g80Var.h() != 2 ? 4 : 0);
        }
        k0Var.addView(this.c, org.telegram.ui.Components.c20.b());
        k0Var.addView(this.actionBar);
        k0Var.addView(this.d, w7.z5.d(-1, -2.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.g1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.w = arrayList;
        Collections.sort(arrayList, new ff(22));
        org.telegram.ui.Components.ux0 ux0Var = this.r;
        if (ux0Var != null) {
            ux0Var.e(false, true);
        }
        g80 g80Var = this.s;
        if (g80Var != null) {
            g80Var.l();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.ux0 ux0Var;
        if (i10 == NotificationCenter.contactsImported) {
            d0();
        } else {
            if (i10 != NotificationCenter.contactsDidLoad || (ux0Var = this.r) == null) {
                return;
            }
            ux0Var.e(false, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 19);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.k0, null, null, org.telegram.ui.ActionBar.i6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 16, new Class[]{org.telegram.ui.Cells.f4.class}, null, null, null, org.telegram.ui.ActionBar.i6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 0, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Zh));
        int i10 = org.telegram.ui.ActionBar.i6.ai;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 0, new Class[]{org.telegram.ui.Cells.p4.class}, null, org.telegram.ui.ActionBar.i6.r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        int i11 = org.telegram.ui.ActionBar.i6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f, 0, new Class[]{org.telegram.ui.Components.q30.class}, null, null, null, org.telegram.ui.ActionBar.i6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f, 0, new Class[]{org.telegram.ui.Components.q30.class}, null, null, null, org.telegram.ui.ActionBar.i6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f, 0, new Class[]{org.telegram.ui.Components.q30.class}, null, null, null, org.telegram.ui.ActionBar.i6.di));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f, 0, new Class[]{org.telegram.ui.Components.q30.class}, null, null, null, i11));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // ph.d
    public final void j(r0.l1 l1Var) {
        this.K = l1Var.a.f(8).d;
        Y();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.q30 q30Var = (org.telegram.ui.Components.q30) view;
        if (q30Var.y) {
            this.H = null;
            this.f.a(q30Var);
            this.c.e(!this.G.isEmpty(), true);
            c0();
            return;
        }
        org.telegram.ui.Components.q30 q30Var2 = this.H;
        if (q30Var2 != null) {
            q30Var2.a();
        }
        this.H = q30Var;
        q30Var.b();
    }

    @Override // org.telegram.ui.ActionBar.n2
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

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsImported);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.J = i13;
        Z();
        Y();
    }

    @Override // ph.d
    public final /* synthetic */ void J() {
    }

    @Override // ph.d
    public final /* synthetic */ void s() {
    }

    @Override // le.d
    public final /* synthetic */ void V(float f7, int i10) {
    }
}
