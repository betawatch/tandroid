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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a80 implements wx, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a80(LaunchActivity launchActivity, int i9, TLRPC.User user, String str, String str2, dy dyVar) {
        this.b = launchActivity;
        this.a = i9;
        this.c = user;
        this.d = str;
        this.e = str2;
        this.f = dyVar;
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean I(dy dyVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        pf.h1 h1Var = (pf.h1) this.b;
        bg.j1 j1Var = (bg.j1) this.c;
        pf.q1 q1Var = (pf.q1) this.d;
        TextView textView = (TextView) this.e;
        Utilities.Callback callback = (Utilities.Callback) this.f;
        String obj = h1Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            AndroidUtilities.shakeView(h1Var);
            j1Var.run(Boolean.FALSE);
            return;
        }
        pf.r1 f10 = pf.r1.f(this.a);
        int i10 = q1Var == null ? -1 : q1Var.a;
        pf.q1 d = f10.d(obj);
        if (d == null || d.a == i10) {
            callback.run(obj);
            c2Var.dismiss();
        } else {
            AndroidUtilities.shakeView(h1Var);
            textView.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
            j1Var.run(Boolean.TRUE);
        }
    }

    @Override // org.telegram.ui.wx
    public boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.b;
        final TLRPC.User user = (TLRPC.User) this.c;
        final String str = (String) this.d;
        final String str2 = (String) this.e;
        final dy dyVar2 = (dy) this.f;
        Pattern pattern = LaunchActivity.x1;
        final long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        final TLRPC.Chat chat = MessagesController.getInstance(launchActivity.K).getChat(Long.valueOf(-j10));
        final int i11 = this.a;
        if (chat == null || (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String string = LocaleController.getString(R.string.AddBot);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = string;
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), chat == null ? "" : chat.title));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.x80
                @Override // org.telegram.ui.ActionBar.b2
                public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i12) {
                    Pattern pattern2 = LaunchActivity.x1;
                    Bundle i13 = aa.d.i("scrollToTopOnResume", true);
                    long j11 = -j10;
                    i13.putLong("chat_id", j11);
                    qn qnVar = new qn(i13);
                    int i14 = i11;
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    MessagesController.getInstance(i14).addUserToChat(j11, user, 0, str2, qnVar, null);
                    ((ActionBarLayout) LaunchActivity.this.O()).S(qnVar, true, false);
                }
            });
            alertDialog$Builder.o();
        } else {
            MessagesController.getInstance(i11).checkIsInChat(false, chat, user, new MessagesController.IsInChatCheckedCallback() { // from class: org.telegram.ui.w80
                @Override // org.telegram.messenger.MessagesController.IsInChatCheckedCallback
                public final void run(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str3) {
                    Pattern pattern2 = LaunchActivity.x1;
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.j8(LaunchActivity.this, str, tL_chatAdminRights2, z12, str2, i11, chat, dyVar2, user, j10, str3));
                }
            });
        }
        return true;
    }

    public /* synthetic */ a80(pf.h1 h1Var, bg.j1 j1Var, int i9, pf.q1 q1Var, TextView textView, Utilities.Callback callback) {
        this.b = h1Var;
        this.c = j1Var;
        this.a = i9;
        this.d = q1Var;
        this.e = textView;
        this.f = callback;
    }
}
