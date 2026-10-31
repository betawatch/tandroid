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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class PasskeysActivity extends org.telegram.ui.ActionBar.k2 {
    public org.telegram.ui.Components.u51 a;
    public int addPasskeyRow;
    public final ArrayList b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.b = arrayList;
    }

    public static void Y(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str) {
        if (str == null) {
            if (passkey != null) {
                org.telegram.messenger.vp.r1(passkeysActivity.currentAccount).h4(0L, "SETUP_PASSKEY");
                passkeysActivity.c0(passkey);
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
        String L0 = org.telegram.messenger.cd.L0(2131747648, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(2131747649, null);
        i0.a.w(null, 2131747847, alertDialog$Builder, null);
    }

    public static /* synthetic */ void Z(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str, int i10) {
        passkeysActivity.b.remove(passkey);
        passkeysActivity.a.f3.O(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.id = str;
        ConnectionsManager.getInstance(passkeysActivity.currentAccount).sendRequestTyped(deletepasskey, new a3.b(1), new ng(passkeysActivity, i10, passkey, 2));
    }

    public static void a0(PasskeysActivity passkeysActivity, org.telegram.ui.Components.a51 a51Var, View view) {
        if (a51Var.d == -1) {
            org.telegram.messenger.au.b(passkeysActivity.currentAccount, passkeysActivity.getParentActivity(), new sj0(passkeysActivity, 1));
        } else if (a51Var.G != null) {
            passkeysActivity.d0(view);
        }
    }

    public static void b0(PasskeysActivity passkeysActivity) {
        e0(passkeysActivity.currentAccount, passkeysActivity.getParentActivity(), passkeysActivity.resourceProvider, passkeysActivity.b.size() + 1 <= ((org.telegram.messenger.l0) passkeysActivity.getMessagesController().y7.z.a).c);
    }

    public static void e0(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, false);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        f7.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f));
        k10.N = f7;
        org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(context);
        ei0Var.f(R.raw.passkey, org.telegram.messenger.i0.L(115.0f), org.telegram.messenger.i0.L(115.0f), null);
        ei0Var.d();
        f7.addView(ei0Var, w7.b6.t(org.telegram.messenger.zs.A1, org.telegram.messenger.zs.A1, 17, 0, 0, 0, 9));
        int i11 = org.telegram.ui.ActionBar.t6.j5;
        TextView b10 = w7.g6.b(context, 18.0f, i11, true, p6Var);
        org.telegram.messenger.m5.l(b10, 17, null, 2131747652);
        f7.addView(b10, w7.b6.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b11 = w7.g6.b(context, 14.0f, i11, false, p6Var);
        org.telegram.messenger.m5.l(b11, 17, null, 2131747653);
        f7.addView(b11, w7.b6.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        rh.v vVar = new rh.v(1, context, p6Var);
        vVar.a(R.drawable.msg2_permissions, org.telegram.messenger.cd.L0(2131747659, null), org.telegram.messenger.cd.L0(2131747660, null));
        f7.addView(vVar, w7.b6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        rh.v vVar2 = new rh.v(1, context, p6Var);
        vVar2.a(R.drawable.menu_face, org.telegram.messenger.cd.L0(2131747657, null), org.telegram.messenger.cd.L0(2131747658, null));
        f7.addView(vVar2, w7.b6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        rh.v vVar3 = new rh.v(1, context, p6Var);
        vVar3.a(R.drawable.menu_privacy, org.telegram.messenger.cd.L0(2131747655, null), org.telegram.messenger.cd.L0(2131747656, null));
        f7.addView(vVar3, w7.b6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        vh.d i12 = org.telegram.messenger.z20.i(24, context, p6Var, true);
        i12.i(org.telegram.messenger.cd.L0(2131747654, null), false, true);
        i12.setOnClickListener(new ya(i12, context, i10, k10, 3));
        if (z10) {
            f7.addView(i12, w7.b6.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        k10.O();
        k10.show();
    }

    public final void c0(TL_account.Passkey passkey) {
        org.telegram.ui.Components.p51 p51Var;
        this.b.add(passkey);
        org.telegram.ui.Components.u51 u51Var = this.a;
        if (u51Var != null && (p51Var = u51Var.f3) != null) {
            p51Var.O(true);
        }
        org.telegram.ui.Components.wb I = org.telegram.ui.Components.cc.a0(this).I(R.raw.passcode_lock_close, org.telegram.messenger.cd.L0(2131747664, null), org.telegram.messenger.cd.a0(null, null, 2131747665, passkey.name));
        I.j = 5000;
        I.k(true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131747667, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 12));
        FrameLayout frameLayout = new FrameLayout(context);
        int i10 = 0;
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(this, new sj0(this, i10), new tj0(this, i10), null);
        this.a = u51Var;
        u51Var.r1();
        this.a.setSectionsDrawBackground(true);
        org.telegram.ui.Components.u51 u51Var2 = this.a;
        u51Var2.f3.r = false;
        frameLayout.addView(u51Var2, w7.b6.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(View view) {
        ArrayList arrayList;
        boolean z10 = view instanceof ImageView;
        ViewParent viewParent = view;
        if (z10) {
            viewParent = view.getParent();
        }
        vj0 vj0Var = (vj0) viewParent;
        String str = vj0Var.w;
        int i10 = 0;
        while (true) {
            arrayList = this.b;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((TL_account.Passkey) arrayList.get(i10)).id)) {
                break;
            } else {
                i10++;
            }
        }
        int i11 = i10;
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        TL_account.Passkey passkey = (TL_account.Passkey) arrayList.get(i11);
        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(this, vj0Var);
        H.c(R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131751599, null), new org.telegram.ui.Components.c11(this, passkey, str, i11, 7), true);
        H.W(this.a.U0(vj0Var, false));
        H.Z();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
