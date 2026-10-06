package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public class PasskeysActivity extends org.telegram.ui.ActionBar.n2 {
    public org.telegram.ui.Components.e71 a;
    public int addPasskeyRow;
    public final ArrayList b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.b = arrayList;
    }

    public static void S(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str) {
        if (str == null) {
            if (passkey != null) {
                MessagesController.getInstance(passkeysActivity.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
                passkeysActivity.X(passkey);
                return;
            }
            return;
        }
        if ("CANCELLED".equalsIgnoreCase(str)) {
            return;
        }
        if (!"EMPTY".equalsIgnoreCase(str)) {
            org.telegram.ui.Components.yc.a0(passkeysActivity).c0(str, true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.PasskeyNoOptionsText);
        org.telegram.messenger.q.o(R.string.OK, alertDialog$Builder, null);
    }

    public static /* synthetic */ void T(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str, int i10) {
        passkeysActivity.b.remove(passkey);
        passkeysActivity.a.f3.N(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.id = str;
        ConnectionsManager.getInstance(passkeysActivity.currentAccount).sendRequestTyped(deletepasskey, new org.telegram.messenger.a(), new jg(passkeysActivity, i10, passkey, 2));
    }

    public static void U(PasskeysActivity passkeysActivity, org.telegram.ui.Components.h61 h61Var, View view) {
        if (h61Var.d == -1) {
            PasskeysController.create(passkeysActivity.getParentActivity(), passkeysActivity.currentAccount, new ql0(passkeysActivity, 1));
        } else if (h61Var.G != null) {
            passkeysActivity.Y(view);
        }
    }

    public static void W(PasskeysActivity passkeysActivity) {
        Z(passkeysActivity.currentAccount, passkeysActivity.getParentActivity(), passkeysActivity.resourceProvider, passkeysActivity.b.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get());
    }

    public static void Z(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        org.telegram.ui.ActionBar.f3 i11 = org.telegram.messenger.bi.i(1, context, d6Var, false);
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        e7.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        i11.customView = e7;
        org.telegram.ui.Components.nj0 nj0Var = new org.telegram.ui.Components.nj0(context);
        nj0Var.f(R.raw.passkey, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f), null);
        nj0Var.d();
        e7.addView(nj0Var, w7.z5.t(115, 115, 17, 0, 0, 0, 9));
        int i12 = org.telegram.ui.ActionBar.i6.j5;
        TextView b10 = w7.d6.b(context, 18.0f, i12, true, d6Var);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.PasskeyFeatureTitle));
        e7.addView(b10, w7.z5.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b11 = w7.d6.b(context, 14.0f, i12, false, d6Var);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.PasskeyFeatureSubtitle));
        e7.addView(b11, w7.z5.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        yh.s sVar = new yh.s(context, 1, d6Var);
        sVar.a(LocaleController.getString(R.string.PasskeyFeature1Title), LocaleController.getString(R.string.PasskeyFeature1Subtitle), R.drawable.msg2_permissions);
        e7.addView(sVar, w7.z5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        yh.s sVar2 = new yh.s(context, 1, d6Var);
        sVar2.a(LocaleController.getString(R.string.PasskeyFeature2Title), LocaleController.getString(R.string.PasskeyFeature2Subtitle), R.drawable.menu_face);
        e7.addView(sVar2, w7.z5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        yh.s sVar3 = new yh.s(context, 1, d6Var);
        sVar3.a(LocaleController.getString(R.string.PasskeyFeature3Title), LocaleController.getString(R.string.PasskeyFeature3Subtitle), R.drawable.menu_privacy);
        e7.addView(sVar3, w7.z5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        ci.d f7 = org.telegram.messenger.bi.f(24, context, d6Var, true);
        f7.g(LocaleController.getString(R.string.PasskeyFeatureButton), false, true);
        f7.setOnClickListener(new ai.t7(f7, context, i10, i11, 4));
        if (z10) {
            e7.addView(f7, w7.z5.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        i11.fixNavigationBar();
        i11.show();
    }

    public final void X(TL_account.Passkey passkey) {
        org.telegram.ui.Components.w61 w61Var;
        this.b.add(passkey);
        org.telegram.ui.Components.e71 e71Var = this.a;
        if (e71Var != null && (w61Var = e71Var.f3) != null) {
            w61Var.N(true);
        }
        org.telegram.ui.Components.rc M = org.telegram.ui.Components.yc.a0(this).M(LocaleController.getString(R.string.PasskeyAddedTitle), LocaleController.formatString(R.string.PasskeyAddedText, passkey.name), R.raw.passcode_lock_close);
        M.j = 5000;
        M.k(true);
    }

    public final void Y(View view) {
        ArrayList arrayList;
        int i10;
        boolean z10 = view instanceof ImageView;
        ViewParent viewParent = view;
        if (z10) {
            viewParent = view.getParent();
        }
        sl0 sl0Var = (sl0) viewParent;
        String str = sl0Var.r;
        int i11 = 0;
        while (true) {
            arrayList = this.b;
            if (i11 >= arrayList.size()) {
                i10 = -1;
                break;
            } else {
                if (str.equals(((TL_account.Passkey) arrayList.get(i11)).id)) {
                    i10 = i11;
                    break;
                }
                i11++;
            }
        }
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        TL_account.Passkey passkey = (TL_account.Passkey) arrayList.get(i10);
        org.telegram.ui.Components.b80 H = org.telegram.ui.Components.b80.H(this, sl0Var);
        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.r21(this, passkey, str, i10, 7), true);
        H.W(this.a.V0(sl0Var, false));
        H.Z();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Passkey));
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 13));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.e71 e71Var = new org.telegram.ui.Components.e71(this, new ql0(this, 0), new jl0(this, 1), null);
        this.a = e71Var;
        e71Var.r1();
        this.a.setSectionsDrawBackground(true);
        org.telegram.ui.Components.e71 e71Var2 = this.a;
        e71Var2.f3.r = false;
        frameLayout.addView(e71Var2, w7.z5.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }
}
