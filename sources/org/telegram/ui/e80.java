package org.telegram.ui;

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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e80 implements zx, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e80(LaunchActivity launchActivity, int i10, TLRPC.User user, String str, String str2, gy gyVar) {
        this.b = launchActivity;
        this.a = i10;
        this.c = user;
        this.d = str;
        this.e = str2;
        this.f = gyVar;
    }

    @Override // org.telegram.ui.zx
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.zx
    public /* synthetic */ boolean K(gy gyVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        qf.h1 h1Var = (qf.h1) this.b;
        cg.e1 e1Var = (cg.e1) this.c;
        qf.p1 p1Var = (qf.p1) this.d;
        TextView textView = (TextView) this.e;
        Utilities.Callback callback = (Utilities.Callback) this.f;
        String obj = h1Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            AndroidUtilities.shakeView(h1Var);
            e1Var.run(Boolean.FALSE);
            return;
        }
        qf.q1 f10 = qf.q1.f(this.a);
        int i11 = p1Var == null ? -1 : p1Var.a;
        qf.p1 d = f10.d(obj);
        if (d == null || d.a == i11) {
            callback.run(obj);
            b2Var.dismiss();
        } else {
            AndroidUtilities.shakeView(h1Var);
            textView.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
            e1Var.run(Boolean.TRUE);
        }
    }

    @Override // org.telegram.ui.zx
    public boolean w(gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.b;
        final TLRPC.User user = (TLRPC.User) this.c;
        final String str = (String) this.d;
        final String str2 = (String) this.e;
        final gy gyVar2 = (gy) this.f;
        Pattern pattern = LaunchActivity.x1;
        final long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        final TLRPC.Chat chat = MessagesController.getInstance(launchActivity.K).getChat(Long.valueOf(-j10));
        final int i12 = this.a;
        if (chat == null || (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String string = LocaleController.getString(R.string.AddBot);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.N = string;
            b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), chat == null ? "" : chat.title));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.b90
                @Override // org.telegram.ui.ActionBar.a2
                public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i13) {
                    Pattern pattern2 = LaunchActivity.x1;
                    Bundle h = a9.p.h("scrollToTopOnResume", true);
                    long j11 = -j10;
                    h.putLong("chat_id", j11);
                    rn rnVar = new rn(h);
                    int i14 = i12;
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    MessagesController.getInstance(i14).addUserToChat(j11, user, 0, str2, rnVar, null);
                    ((ActionBarLayout) LaunchActivity.this.O()).S(rnVar, true, false);
                }
            });
            alertDialog$Builder.o();
        } else {
            MessagesController.getInstance(i12).checkIsInChat(false, chat, user, new MessagesController.IsInChatCheckedCallback() { // from class: org.telegram.ui.a90
                @Override // org.telegram.messenger.MessagesController.IsInChatCheckedCallback
                public final void run(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str3) {
                    Pattern pattern2 = LaunchActivity.x1;
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.m8(LaunchActivity.this, str, tL_chatAdminRights2, z12, str2, i12, chat, gyVar2, user, j10, str3));
                }
            });
        }
        return true;
    }

    public /* synthetic */ e80(qf.h1 h1Var, cg.e1 e1Var, int i10, qf.p1 p1Var, TextView textView, Utilities.Callback callback) {
        this.b = h1Var;
        this.c = e1Var;
        this.a = i10;
        this.d = p1Var;
        this.e = textView;
        this.f = callback;
    }
}
