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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class PasskeysActivity extends org.telegram.ui.ActionBar.n2 {
    public org.telegram.ui.Components.k51 a;
    public int addPasskeyRow;
    public final ArrayList b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.b = arrayList;
    }

    public static void U(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str) {
        if (str == null) {
            if (passkey != null) {
                MessagesController.getInstance(passkeysActivity.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
                passkeysActivity.Y(passkey);
                return;
            }
            return;
        }
        if ("CANCELLED".equalsIgnoreCase(str)) {
            return;
        }
        if (!"EMPTY".equalsIgnoreCase(str)) {
            org.telegram.ui.Components.mc.a0(passkeysActivity).c0(str, true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
        alertDialog$Builder.a.N = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.PasskeyNoOptionsText);
        i0.a.C(R.string.OK, alertDialog$Builder, null);
    }

    public static /* synthetic */ void V(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str, int i10) {
        passkeysActivity.b.remove(passkey);
        passkeysActivity.a.U2.N(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.id = str;
        ConnectionsManager.getInstance(passkeysActivity.currentAccount).sendRequestTyped(deletepasskey, new org.telegram.messenger.a(), new bg(passkeysActivity, i10, passkey, 2));
    }

    public static void W(PasskeysActivity passkeysActivity, org.telegram.ui.Components.n41 n41Var, View view) {
        if (n41Var.d == -1) {
            PasskeysController.create(passkeysActivity.getParentActivity(), passkeysActivity.currentAccount, new cl0(passkeysActivity, 1));
        } else if (n41Var.G != null) {
            passkeysActivity.Z(view);
        }
    }

    public static void X(PasskeysActivity passkeysActivity) {
        a0(passkeysActivity.currentAccount, passkeysActivity.getParentActivity(), passkeysActivity.resourceProvider, passkeysActivity.b.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get());
    }

    public static void a0(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        org.telegram.ui.ActionBar.e3 o10 = org.telegram.messenger.y1.o(context, c6Var, false, false);
        LinearLayout g10 = org.telegram.messenger.y1.g(context, 1);
        g10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        o10.customView = g10;
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        ri0Var.f(R.raw.passkey, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f), null);
        ri0Var.d();
        g10.addView(ri0Var, h7.z5.t(115, 115, 17, 0, 0, 0, 9));
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        TextView b10 = h7.d6.b(context, 18.0f, i11, true, c6Var);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.PasskeyFeatureTitle));
        g10.addView(b10, h7.z5.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b11 = h7.d6.b(context, 14.0f, i11, false, c6Var);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.PasskeyFeatureSubtitle));
        g10.addView(b11, h7.z5.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        hh.f0 f0Var = new hh.f0(context, 1, c6Var);
        f0Var.a(LocaleController.getString(R.string.PasskeyFeature1Title), LocaleController.getString(R.string.PasskeyFeature1Subtitle), R.drawable.msg2_permissions);
        g10.addView(f0Var, h7.z5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        hh.f0 f0Var2 = new hh.f0(context, 1, c6Var);
        f0Var2.a(LocaleController.getString(R.string.PasskeyFeature2Title), LocaleController.getString(R.string.PasskeyFeature2Subtitle), R.drawable.menu_face);
        g10.addView(f0Var2, h7.z5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        hh.f0 f0Var3 = new hh.f0(context, 1, c6Var);
        f0Var3.a(LocaleController.getString(R.string.PasskeyFeature3Title), LocaleController.getString(R.string.PasskeyFeature3Subtitle), R.drawable.menu_privacy);
        g10.addView(f0Var3, h7.z5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        lh.d g11 = org.telegram.messenger.rl.g(24, context, c6Var, true);
        g11.g(LocaleController.getString(R.string.PasskeyFeatureButton), false, true);
        g11.setOnClickListener(new jh.l5(g11, context, i10, o10, 4));
        if (z10) {
            g10.addView(g11, h7.z5.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        o10.fixNavigationBar();
        o10.show();
    }

    public final void Y(TL_account.Passkey passkey) {
        org.telegram.ui.Components.b51 b51Var;
        this.b.add(passkey);
        org.telegram.ui.Components.k51 k51Var = this.a;
        if (k51Var != null && (b51Var = k51Var.U2) != null) {
            b51Var.N(true);
        }
        org.telegram.ui.Components.ec M = org.telegram.ui.Components.mc.a0(this).M(LocaleController.getString(R.string.PasskeyAddedTitle), LocaleController.formatString(R.string.PasskeyAddedText, passkey.name), R.raw.passcode_lock_close);
        M.j = 5000;
        M.k(true);
    }

    public final void Z(View view) {
        ArrayList arrayList;
        int i10;
        boolean z10 = view instanceof ImageView;
        ViewParent viewParent = view;
        if (z10) {
            viewParent = view.getParent();
        }
        fl0 fl0Var = (fl0) viewParent;
        String str = fl0Var.r;
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
        org.telegram.ui.Components.b70 H = org.telegram.ui.Components.b70.H(this, fl0Var);
        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new xs(this, passkey, str, i10, 6), true);
        H.W(this.a.V0(fl0Var, false));
        H.Z();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Passkey));
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 9));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
        org.telegram.ui.Components.k51 k51Var = new org.telegram.ui.Components.k51(this, new cl0(this, 0), new dl0(this, 0), null);
        this.a = k51Var;
        k51Var.p1();
        org.telegram.ui.Components.k51 k51Var2 = this.a;
        k51Var2.U2.r = false;
        frameLayout.addView(k51Var2, h7.z5.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.a);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
