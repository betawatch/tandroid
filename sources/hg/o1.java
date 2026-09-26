package hg;

import ai.e4;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ky;
import org.telegram.ui.qy;
import org.telegram.ui.wf1;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements org.telegram.ui.ActionBar.z1, ky {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o1(s1 s1Var, e4 e4Var, int i10, b2 b2Var, TextView textView, Utilities.Callback callback) {
        this.b = s1Var;
        this.c = e4Var;
        this.a = i10;
        this.d = b2Var;
        this.e = textView;
        this.f = callback;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean K(qy qyVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        s1 s1Var = (s1) this.b;
        e4 e4Var = (e4) this.c;
        b2 b2Var = (b2) this.d;
        TextView textView = (TextView) this.e;
        Utilities.Callback callback = (Utilities.Callback) this.f;
        String obj = s1Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            AndroidUtilities.shakeView(s1Var);
            e4Var.run(Boolean.FALSE);
            return;
        }
        c2 f7 = c2.f(this.a);
        int i11 = b2Var == null ? -1 : b2Var.a;
        b2 d = f7.d(obj);
        if (d == null || d.a == i11) {
            callback.run(obj);
            a2Var.dismiss();
        } else {
            AndroidUtilities.shakeView(s1Var);
            textView.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
            e4Var.run(Boolean.TRUE);
        }
    }

    @Override // org.telegram.ui.ky
    public boolean u(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.b;
        final TLRPC.User user = (TLRPC.User) this.c;
        final String str = (String) this.d;
        final String str2 = (String) this.e;
        final qy qyVar2 = (qy) this.f;
        Pattern pattern = LaunchActivity.B1;
        final long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        final TLRPC.Chat chat = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-j3));
        final int i12 = this.a;
        if (chat == null || (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String string = LocaleController.getString(R.string.AddBot);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
            a2Var.R = string;
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), chat == null ? "" : chat.title));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.n90
                @Override // org.telegram.ui.ActionBar.z1
                public final void f(org.telegram.ui.ActionBar.a2 a2Var2, int i13) {
                    Pattern pattern2 = LaunchActivity.B1;
                    Bundle i14 = a4.a.i("scrollToTopOnResume", true);
                    long j10 = -j3;
                    i14.putLong("chat_id", j10);
                    wn wnVar = new wn(i14);
                    int i15 = i12;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    MessagesController.getInstance(i15).addUserToChat(j10, user, 0, str2, wnVar, null);
                    ((ActionBarLayout) LaunchActivity.this.O()).S(wnVar, true, false);
                }
            });
            alertDialog$Builder.o();
        } else {
            MessagesController.getInstance(i12).checkIsInChat(false, chat, user, new MessagesController.IsInChatCheckedCallback() { // from class: org.telegram.ui.m90
                @Override // org.telegram.messenger.MessagesController.IsInChatCheckedCallback
                public final void run(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str3) {
                    Pattern pattern2 = LaunchActivity.B1;
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.m8(LaunchActivity.this, str, tL_chatAdminRights2, z12, str2, i12, chat, qyVar2, user, j3, str3));
                }
            });
        }
        return true;
    }

    public /* synthetic */ o1(LaunchActivity launchActivity, int i10, TLRPC.User user, String str, String str2, qy qyVar) {
        this.b = launchActivity;
        this.a = i10;
        this.c = user;
        this.d = str;
        this.e = str2;
        this.f = qyVar;
    }
}
