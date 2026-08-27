package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gx0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.BooleanCallback, r0.o, org.telegram.ui.Components.qg0, org.telegram.ui.Components.rk0, FlagSecureReason.FlagSecureCondition, ud.b, j60, org.telegram.ui.Components.rv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ gx0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        int i10 = m1Var.a.f(519).d;
        ProfileActivity profileActivity = this.b;
        profileActivity.h6 = i10;
        FrameLayout frameLayout = profileActivity.o5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.h6 + profileActivity.g6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.o5.setLayoutParams(marginLayoutParams);
            }
        }
        hz0 hz0Var = profileActivity.K;
        if (hz0Var != null) {
            hz0Var.setPagesPaddingBottom(profileActivity.h6 + profileActivity.f6);
            org.telegram.ui.Components.wq0 wq0Var = profileActivity.K.R;
            if (wq0Var != null) {
                wq0Var.setButtonOffset(profileActivity.h6 + profileActivity.g6);
            }
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        ProfileActivity profileActivity = this.b;
        g01 g01Var = profileActivity.e;
        if (g01Var.w || g01Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.v0);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new gx0(profileActivity, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        profileActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView == null) {
            return true;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
        return true;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b;
                profileActivity.getMessagesController().blockPeer(profileActivity.a1);
                if (org.telegram.ui.Components.mc.a(profileActivity)) {
                    org.telegram.ui.Components.mc.d(profileActivity, true).j();
                    break;
                }
                break;
            case 5:
                g01 g01Var = this.b.e;
                g01Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                g01Var.l();
                break;
            default:
                ProfileActivity profileActivity2 = this.b;
                profileActivity2.getClass();
                SharedConfig.pushAuthKey = null;
                SharedConfig.pushAuthKeyId = null;
                SharedConfig.saveConfig();
                profileActivity2.getConnectionsManager().switchBackend(true);
                break;
        }
    }

    @Override // org.telegram.ui.j60
    public void j(int i10, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.b;
        TLRPC.ChatFull chatFull = profileActivity.q2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.q2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.q2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.A2, profileActivity, arrayList, i10, new l3(arrayList2, 5), new l3(profileActivity, 6), new bf0(profileActivity, arrayList2, hashSet, 23));
    }

    @Override // ud.b
    public void o(int i10, float f10, float f11, ud.c cVar) {
        this.b.U4();
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        ProfileActivity profileActivity = this.b;
        return profileActivity.z2 != null || profileActivity.g4();
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        ProfileActivity profileActivity = this.b;
        profileActivity.F1 = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.A2.id), null, profileActivity.A2, Boolean.valueOf(z10));
    }

    @Override // org.telegram.ui.j60
    public /* synthetic */ void i(TLRPC.User user) {
    }

    @Override // ud.b
    public /* synthetic */ void A(float f10, int i10) {
    }
}
