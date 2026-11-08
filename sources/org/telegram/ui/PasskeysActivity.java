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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public class PasskeysActivity extends org.telegram.ui.ActionBar.f2 {
    public org.telegram.ui.Components.q41 a;
    public int addPasskeyRow;
    public final ArrayList b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.b = arrayList;
    }

    public static void Z(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str) {
        if (str == null) {
            if (passkey != null) {
                org.telegram.messenger.qp.s1(passkeysActivity.currentAccount).k4(0L, "SETUP_PASSKEY");
                passkeysActivity.d0(passkey);
                return;
            }
            return;
        }
        if ("CANCELLED".equalsIgnoreCase(str)) {
            return;
        }
        if (!"EMPTY".equalsIgnoreCase(str)) {
            org.telegram.ui.Components.hc.a0(passkeysActivity).e0(str, true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131747633, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131747634, null);
        jg.g.C(null, 2131747832, alertDialog$Builder, null);
    }

    public static /* synthetic */ void a0(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str, int i7) {
        passkeysActivity.b.remove(passkey);
        passkeysActivity.a.f3.O(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.id = str;
        ConnectionsManager.getInstance(passkeysActivity.currentAccount).sendRequestTyped(deletepasskey, new d3.b(1), new ag(passkeysActivity, i7, passkey, 2));
    }

    public static void b0(PasskeysActivity passkeysActivity, org.telegram.ui.Components.x31 x31Var, View view) {
        if (x31Var.d == -1) {
            org.telegram.messenger.pt.b(passkeysActivity.currentAccount, passkeysActivity.getParentActivity(), new ki0(passkeysActivity, 1));
        } else if (x31Var.G != null) {
            passkeysActivity.e0(view);
        }
    }

    public static void c0(PasskeysActivity passkeysActivity) {
        f0(passkeysActivity.currentAccount, passkeysActivity.getParentActivity(), passkeysActivity.resourceProvider, passkeysActivity.b.size() + 1 <= ((org.telegram.messenger.j0) passkeysActivity.getMessagesController().x7.z.b).c);
    }

    public static void f0(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, f6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        l10.N = f10;
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(context);
        ch0Var.f(R.raw.passkey, org.telegram.messenger.g0.L(115.0f), org.telegram.messenger.g0.L(115.0f), null);
        ch0Var.d();
        f10.addView(ch0Var, c8.ha.t(org.telegram.messenger.qs.A1, org.telegram.messenger.qs.A1, 17, 0, 0, 0, 9));
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        TextView b10 = c8.qa.b(context, 18.0f, i10, true, f6Var);
        org.telegram.messenger.k5.m(b10, 17, null, 2131747637);
        f10.addView(b10, c8.ha.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b11 = c8.qa.b(context, 14.0f, i10, false, f6Var);
        org.telegram.messenger.k5.m(b11, 17, null, 2131747638);
        f10.addView(b11, c8.ha.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        bi.q0 q0Var = new bi.q0(1, context, f6Var);
        q0Var.a(R.drawable.msg2_permissions, org.telegram.messenger.id.M0(2131747644, null), org.telegram.messenger.id.M0(2131747645, null));
        f10.addView(q0Var, c8.ha.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        bi.q0 q0Var2 = new bi.q0(1, context, f6Var);
        q0Var2.a(R.drawable.menu_face, org.telegram.messenger.id.M0(2131747642, null), org.telegram.messenger.id.M0(2131747643, null));
        f10.addView(q0Var2, c8.ha.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        bi.q0 q0Var3 = new bi.q0(1, context, f6Var);
        q0Var3.a(R.drawable.menu_privacy, org.telegram.messenger.id.M0(2131747640, null), org.telegram.messenger.id.M0(2131747641, null));
        f10.addView(q0Var3, c8.ha.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        h.i(org.telegram.messenger.id.M0(2131747639, null), false, true);
        h.setOnClickListener(new di.t5(h, context, i7, l10, 4));
        if (z9) {
            f10.addView(h, c8.ha.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        l10.N();
        l10.show();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131747652, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, 21));
        FrameLayout frameLayout = new FrameLayout(context);
        int i7 = 0;
        org.telegram.ui.Components.q41 q41Var = new org.telegram.ui.Components.q41(this, new ki0(this, i7), new li0(this, i7), null);
        this.a = q41Var;
        q41Var.r1();
        this.a.setSectionsDrawBackground(true);
        org.telegram.ui.Components.q41 q41Var2 = this.a;
        q41Var2.f3.r = false;
        frameLayout.addView(q41Var2, c8.ha.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(TL_account.Passkey passkey) {
        org.telegram.ui.Components.l41 l41Var;
        this.b.add(passkey);
        org.telegram.ui.Components.q41 q41Var = this.a;
        if (q41Var != null && (l41Var = q41Var.f3) != null) {
            l41Var.O(true);
        }
        org.telegram.ui.Components.cc I = org.telegram.ui.Components.hc.a0(this).I(R.raw.passcode_lock_close, org.telegram.messenger.id.M0(2131747649, null), org.telegram.messenger.id.a0(null, null, 2131747650, passkey.name));
        I.j = 5000;
        I.k(true);
    }

    public final void e0(View view) {
        ArrayList arrayList;
        boolean z9 = view instanceof ImageView;
        ViewParent viewParent = view;
        if (z9) {
            viewParent = view.getParent();
        }
        ni0 ni0Var = (ni0) viewParent;
        String str = ni0Var.w;
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
        org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(this, ni0Var);
        H.c(R.drawable.msg_delete, org.telegram.messenger.id.M0(2131751599, null), new org.telegram.ui.Components.pp0(this, passkey, str, i10, 12), true);
        H.W(this.a.U0(ni0Var, false));
        H.Z();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
