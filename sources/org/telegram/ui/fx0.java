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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fx0 implements org.telegram.ui.ActionBar.b2, MessagesStorage.BooleanCallback, r0.o, org.telegram.ui.Components.og0, org.telegram.ui.Components.ok0, FlagSecureReason.FlagSecureCondition, td.b, f60, org.telegram.ui.Components.pv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ fx0(ProfileActivity profileActivity, int i9) {
        this.a = i9;
        this.b = profileActivity;
    }

    @Override // td.b
    public void J0(int i9, float f10, float f11, td.c cVar) {
        this.b.U4();
    }

    @Override // r0.o
    public r0.m1 L0(View view, r0.m1 m1Var) {
        int i9 = m1Var.a.f(519).d;
        ProfileActivity profileActivity = this.b;
        profileActivity.h6 = i9;
        FrameLayout frameLayout = profileActivity.o5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i10 = profileActivity.h6 + profileActivity.g6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i10) {
                marginLayoutParams.bottomMargin = i10;
                profileActivity.o5.setLayoutParams(marginLayoutParams);
            }
        }
        hz0 hz0Var = profileActivity.K;
        if (hz0Var != null) {
            hz0Var.setPagesPaddingBottom(profileActivity.h6 + profileActivity.f6);
            org.telegram.ui.Components.vq0 vq0Var = profileActivity.K.R;
            if (vq0Var != null) {
                vq0Var.setButtonOffset(profileActivity.h6 + profileActivity.g6);
            }
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        ProfileActivity profileActivity = this.b;
        f01 f01Var = profileActivity.e;
        if (f01Var.w || f01Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.v0);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new fx0(profileActivity, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        profileActivity.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView == null) {
            return true;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
        return true;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b;
                profileActivity.getMessagesController().blockPeer(profileActivity.a1);
                if (org.telegram.ui.Components.oc.a(profileActivity)) {
                    org.telegram.ui.Components.oc.d(profileActivity, true).j();
                    break;
                }
                break;
            case 5:
                f01 f01Var = this.b.e;
                f01Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                f01Var.l();
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

    @Override // org.telegram.ui.f60
    public void j(int i9, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.b;
        TLRPC.ChatFull chatFull = profileActivity.q2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i10 = 0; i10 < profileActivity.q2.participants.participants.size(); i10++) {
                hashSet.add(Long.valueOf(profileActivity.q2.participants.participants.get(i10).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.A2, profileActivity, arrayList, i9, new k3(arrayList2, 5), new k3(profileActivity, 6), new ye0(profileActivity, arrayList2, hashSet, 23));
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
        int i9 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i9);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i9, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.A2.id), null, profileActivity.A2, Boolean.valueOf(z10));
    }

    @Override // org.telegram.ui.f60
    public /* synthetic */ void i(TLRPC.User user) {
    }

    @Override // td.b
    public /* synthetic */ void B(float f10, int i9) {
    }
}
