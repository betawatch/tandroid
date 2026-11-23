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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class PasskeysActivity extends org.telegram.ui.ActionBar.g2 {
    public org.telegram.ui.Components.g51 a;
    public int addPasskeyRow;
    public final ArrayList b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.b = arrayList;
    }

    public static void Z(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str) {
        if (str == null) {
            if (passkey != null) {
                org.telegram.messenger.mp.u1(passkeysActivity.currentAccount).s4(0L, "SETUP_PASSKEY");
                passkeysActivity.d0(passkey);
                return;
            }
            return;
        }
        if ("CANCELLED".equalsIgnoreCase(str)) {
            return;
        }
        if (!"EMPTY".equalsIgnoreCase(str)) {
            org.telegram.ui.Components.kc.b0(passkeysActivity).f0(str, true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
        String N0 = org.telegram.messenger.gd.N0(2131747438, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(2131747439, null);
        org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
    }

    public static /* synthetic */ void a0(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str, int i7) {
        passkeysActivity.b.remove(passkey);
        passkeysActivity.a.g3.O(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.id = str;
        ConnectionsManager.getInstance(passkeysActivity.currentAccount).sendRequestTyped(deletepasskey, new d3.b(1), new xf(passkeysActivity, i7, passkey, 2));
    }

    public static void b0(PasskeysActivity passkeysActivity, org.telegram.ui.Components.n41 n41Var, View view) {
        if (n41Var.d == -1) {
            org.telegram.messenger.jt.b(passkeysActivity.currentAccount, passkeysActivity.getParentActivity(), new ni0(passkeysActivity, 1));
        } else if (n41Var.H != null) {
            passkeysActivity.e0(view);
        }
    }

    public static void c0(PasskeysActivity passkeysActivity) {
        f0(passkeysActivity.currentAccount, passkeysActivity.getParentActivity(), passkeysActivity.resourceProvider, passkeysActivity.b.size() + 1 <= ((org.telegram.messenger.j0) passkeysActivity.getMessagesController().A7.E.b).c);
    }

    public static void f0(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, i6Var, false);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        j3.O = g10;
        org.telegram.ui.Components.qh0 qh0Var = new org.telegram.ui.Components.qh0(context);
        qh0Var.f(R.raw.passkey, org.telegram.messenger.g0.L(115.0f), org.telegram.messenger.g0.L(115.0f), null);
        qh0Var.d();
        g10.addView(qh0Var, c8.na.t(org.telegram.messenger.ks.A1, org.telegram.messenger.ks.A1, 17, 0, 0, 0, 9));
        int i10 = org.telegram.ui.ActionBar.n6.j5;
        TextView b10 = c8.wa.b(context, 18.0f, i10, true, i6Var);
        org.telegram.messenger.f3.k(b10, 17, null, 2131747442);
        g10.addView(b10, c8.na.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b11 = c8.wa.b(context, 14.0f, i10, false, i6Var);
        org.telegram.messenger.f3.k(b11, 17, null, 2131747443);
        g10.addView(b11, c8.na.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        di.h0 h0Var = new di.h0(1, context, i6Var);
        h0Var.a(R.drawable.msg2_permissions, org.telegram.messenger.gd.N0(2131747449, null), org.telegram.messenger.gd.N0(2131747450, null));
        g10.addView(h0Var, c8.na.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        di.h0 h0Var2 = new di.h0(1, context, i6Var);
        h0Var2.a(R.drawable.menu_face, org.telegram.messenger.gd.N0(2131747447, null), org.telegram.messenger.gd.N0(2131747448, null));
        g10.addView(h0Var2, c8.na.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        di.h0 h0Var3 = new di.h0(1, context, i6Var);
        h0Var3.a(R.drawable.menu_privacy, org.telegram.messenger.gd.N0(2131747445, null), org.telegram.messenger.gd.N0(2131747446, null));
        g10.addView(h0Var3, c8.na.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        hi.e g11 = org.telegram.messenger.m10.g(24, context, i6Var, true);
        g11.i(org.telegram.messenger.gd.N0(2131747444, null), false, true);
        g11.setOnClickListener(new fi.k5(g11, context, i7, j3, 6));
        if (z10) {
            g10.addView(g11, c8.na.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        j3.O();
        j3.show();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131747457, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new cv(this, 24));
        FrameLayout frameLayout = new FrameLayout(context);
        int i7 = 0;
        org.telegram.ui.Components.g51 g51Var = new org.telegram.ui.Components.g51(this, new ni0(this, i7), new oi0(this, i7), null);
        this.a = g51Var;
        g51Var.r1();
        this.a.setSectionsDrawBackground(true);
        org.telegram.ui.Components.g51 g51Var2 = this.a;
        g51Var2.g3.r = false;
        frameLayout.addView(g51Var2, c8.na.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(TL_account.Passkey passkey) {
        org.telegram.ui.Components.b51 b51Var;
        this.b.add(passkey);
        org.telegram.ui.Components.g51 g51Var = this.a;
        if (g51Var != null && (b51Var = g51Var.g3) != null) {
            b51Var.O(true);
        }
        org.telegram.ui.Components.fc I = org.telegram.ui.Components.kc.b0(this).I(R.raw.passcode_lock_close, org.telegram.messenger.gd.N0(2131747454, null), org.telegram.messenger.gd.a0(null, null, 2131747455, passkey.name));
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
        qi0 qi0Var = (qi0) viewParent;
        String str = qi0Var.w;
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
        org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(this, qi0Var);
        I.c(R.drawable.msg_delete, org.telegram.messenger.gd.N0(2131751586, null), new org.telegram.ui.Components.kp0(this, passkey, str, i10, 14), true);
        I.X(this.a.U0(qi0Var, false));
        I.a0();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
