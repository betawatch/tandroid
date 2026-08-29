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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ex0 implements org.telegram.ui.ActionBar.b2, MessagesStorage.BooleanCallback, r0.o, org.telegram.ui.Components.yg0, org.telegram.ui.Components.bl0, FlagSecureReason.FlagSecureCondition, vd.b, h60, org.telegram.ui.Components.zv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ ex0(ProfileActivity profileActivity, int i10) {
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
            org.telegram.ui.Components.gr0 gr0Var = profileActivity.K.R;
            if (gr0Var != null) {
                gr0Var.setButtonOffset(profileActivity.h6 + profileActivity.g6);
            }
        }
        return r0.m1.b;
    }

    @Override // vd.b
    public void N(int i10, float f9, float f10, vd.c cVar) {
        this.b.U4();
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        ProfileActivity profileActivity = this.b;
        g01 g01Var = profileActivity.e;
        if (g01Var.w || g01Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.v0);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new ex0(profileActivity, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        profileActivity.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView == null) {
            return true;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
        return true;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b;
                profileActivity.getMessagesController().blockPeer(profileActivity.a1);
                if (org.telegram.ui.Components.tc.a(profileActivity)) {
                    org.telegram.ui.Components.tc.d(profileActivity, true).j();
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

    @Override // org.telegram.ui.h60
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
        profileActivity.getMessagesController().addUsersToChat(profileActivity.A2, profileActivity, arrayList, i10, new l3(arrayList2, 5), new l3(profileActivity, 6), new xe0(profileActivity, arrayList2, hashSet, 23));
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

    @Override // org.telegram.ui.h60
    public /* synthetic */ void i(TLRPC.User user) {
    }

    @Override // vd.b
    public /* synthetic */ void z(float f9, int i10) {
    }
}
