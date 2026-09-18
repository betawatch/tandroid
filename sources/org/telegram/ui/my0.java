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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class my0 implements org.telegram.ui.ActionBar.b2, MessagesStorage.BooleanCallback, r0.n, org.telegram.ui.Components.dh0, org.telegram.ui.Components.cl0, FlagSecureReason.FlagSecureCondition, le.d, b70, org.telegram.ui.Components.iw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ my0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // le.d
    public void D(int i10, float f7, float f10, le.e eVar) {
        this.b.U4();
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = l1Var.a.f(519).d;
        ProfileActivity profileActivity = this.b;
        profileActivity.l6 = i10;
        FrameLayout frameLayout = profileActivity.s5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.l6 + profileActivity.k6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.s5.setLayoutParams(marginLayoutParams);
            }
        }
        n01 n01Var = profileActivity.O;
        if (n01Var != null) {
            n01Var.setPagesPaddingBottom(profileActivity.l6 + profileActivity.j6);
            org.telegram.ui.Components.or0 or0Var = profileActivity.O.V;
            if (or0Var != null) {
                or0Var.setButtonOffset(profileActivity.l6 + profileActivity.k6);
            }
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        ProfileActivity profileActivity = this.b;
        l11 l11Var = profileActivity.e;
        if (l11Var.w || l11Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.z0);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new my0(profileActivity, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        profileActivity.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView == null) {
            return true;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        return true;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b;
                profileActivity.getMessagesController().blockPeer(profileActivity.e1);
                if (org.telegram.ui.Components.vc.a(profileActivity)) {
                    org.telegram.ui.Components.vc.d(profileActivity, true).j();
                    break;
                }
                break;
            case 5:
                l11 l11Var = this.b.e;
                l11Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                l11Var.l();
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

    @Override // org.telegram.ui.b70
    public void j(int i10, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.b;
        TLRPC.ChatFull chatFull = profileActivity.u2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.u2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.u2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.E2, profileActivity, arrayList, i10, new g3(arrayList2, 5), new g3(profileActivity, 6), new rf0(profileActivity, arrayList2, hashSet, 23));
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        ProfileActivity profileActivity = this.b;
        return profileActivity.D2 != null || profileActivity.g4();
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        ProfileActivity profileActivity = this.b;
        profileActivity.J1 = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.E2.id), null, profileActivity.E2, Boolean.valueOf(z10));
    }

    @Override // org.telegram.ui.b70
    public /* synthetic */ void i(TLRPC.User user) {
    }

    @Override // le.d
    public /* synthetic */ void C(float f7, int i10) {
    }
}
