package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class PasskeysActivity extends org.telegram.ui.ActionBar.e2 {
    public org.telegram.ui.Components.u41 a;
    public int addPasskeyRow;
    public final ArrayList b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.b = arrayList;
    }

    public static void Z(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str) {
        if (str == null) {
            if (passkey != null) {
                org.telegram.messenger.np.s1(passkeysActivity.currentAccount).k4(0L, "SETUP_PASSKEY");
                passkeysActivity.d0(passkey);
                return;
            }
            return;
        }
        if ("CANCELLED".equalsIgnoreCase(str)) {
            return;
        }
        if (!"EMPTY".equalsIgnoreCase(str)) {
            org.telegram.ui.Components.cc.a0(passkeysActivity).e0(str, true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131747632, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131747633, null);
        i5.c.C(null, 2131747831, alertDialog$Builder, null);
    }

    public static /* synthetic */ void a0(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str, int i7) {
        passkeysActivity.b.remove(passkey);
        passkeysActivity.a.g3.O(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.id = str;
        ConnectionsManager.getInstance(passkeysActivity.currentAccount).sendRequestTyped(deletepasskey, new d3.b(1), new vf(passkeysActivity, i7, passkey, 2));
    }

    public static void b0(PasskeysActivity passkeysActivity, org.telegram.ui.Components.b41 b41Var, View view) {
        if (b41Var.d == -1) {
            org.telegram.messenger.mt.b(passkeysActivity.currentAccount, passkeysActivity.getParentActivity(), new mi0(passkeysActivity, 1));
        } else if (b41Var.G != null) {
            passkeysActivity.e0(view);
        }
    }

    public static void c0(PasskeysActivity passkeysActivity) {
        f0(passkeysActivity.currentAccount, passkeysActivity.getParentActivity(), passkeysActivity.resourceProvider, passkeysActivity.b.size() + 1 <= ((org.telegram.messenger.j0) passkeysActivity.getMessagesController().y7.z.b).c);
    }

    public static void f0(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        k10.O = f10;
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
        fh0Var.f(R.raw.passkey, org.telegram.messenger.g0.L(115.0f), org.telegram.messenger.g0.L(115.0f), null);
        fh0Var.d();
        f10.addView(fh0Var, c8.ja.t(org.telegram.messenger.ns.A1, org.telegram.messenger.ns.A1, 17, 0, 0, 0, 9));
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        TextView b10 = c8.sa.b(context, 18.0f, i10, true, e6Var);
        org.telegram.messenger.k5.l(b10, 17, null, 2131747636);
        f10.addView(b10, c8.ja.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b11 = c8.sa.b(context, 14.0f, i10, false, e6Var);
        org.telegram.messenger.k5.l(b11, 17, null, 2131747637);
        f10.addView(b11, c8.ja.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        di.h0 h0Var = new di.h0(1, context, e6Var);
        h0Var.a(R.drawable.msg2_permissions, org.telegram.messenger.hd.M0(2131747643, null), org.telegram.messenger.hd.M0(2131747644, null));
        f10.addView(h0Var, c8.ja.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        di.h0 h0Var2 = new di.h0(1, context, e6Var);
        h0Var2.a(R.drawable.menu_face, org.telegram.messenger.hd.M0(2131747641, null), org.telegram.messenger.hd.M0(2131747642, null));
        f10.addView(h0Var2, c8.ja.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        di.h0 h0Var3 = new di.h0(1, context, e6Var);
        h0Var3.a(R.drawable.menu_privacy, org.telegram.messenger.hd.M0(2131747639, null), org.telegram.messenger.hd.M0(2131747640, null));
        f10.addView(h0Var3, c8.ja.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        hi.d g10 = org.telegram.messenger.i20.g(24, context, e6Var, true);
        g10.i(org.telegram.messenger.hd.M0(2131747638, null), false, true);
        g10.setOnClickListener(new fi.l5(g10, context, i7, k10, 4));
        if (z10) {
            f10.addView(g10, c8.ja.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        k10.O();
        k10.show();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747651, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new lx(this, 22));
        FrameLayout frameLayout = new FrameLayout(context);
        int i7 = 0;
        org.telegram.ui.Components.u41 u41Var = new org.telegram.ui.Components.u41(this, new mi0(this, i7), new ni0(this, i7), null);
        this.a = u41Var;
        u41Var.r1();
        this.a.setSectionsDrawBackground(true);
        org.telegram.ui.Components.u41 u41Var2 = this.a;
        u41Var2.g3.r = false;
        frameLayout.addView(u41Var2, c8.ja.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(TL_account.Passkey passkey) {
        org.telegram.ui.Components.p41 p41Var;
        this.b.add(passkey);
        org.telegram.ui.Components.u41 u41Var = this.a;
        if (u41Var != null && (p41Var = u41Var.g3) != null) {
            p41Var.O(true);
        }
        org.telegram.ui.Components.xb I = org.telegram.ui.Components.cc.a0(this).I(R.raw.passcode_lock_close, org.telegram.messenger.hd.M0(2131747648, null), org.telegram.messenger.hd.a0(null, null, 2131747649, passkey.name));
        I.j = 5000;
        I.k(true);
    }

    public final void e0(View view) {
        ArrayList arrayList;
        boolean z10 = view instanceof ImageView;
        ViewParent viewParent = view;
        if (z10) {
            viewParent = view.getParent();
        }
        pi0 pi0Var = (pi0) viewParent;
        String str = pi0Var.w;
        int i7 = 0;
        while (true) {
            arrayList = this.b;
            if (i7 >= arrayList.size()) {
                i7 = -1;
                break;
            } else if (str.equals(((TL_account.Passkey) arrayList.get(i7)).id)) {
                break;
            } else {
                i7++;
            }
        }
        int i10 = i7;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        TL_account.Passkey passkey = (TL_account.Passkey) arrayList.get(i10);
        org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(this, pi0Var);
        H.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751598, null), new org.telegram.ui.Components.sp0(this, passkey, str, i10, 12), true);
        H.W(this.a.U0(pi0Var, false));
        H.Z();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
