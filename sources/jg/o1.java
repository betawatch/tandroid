package jg;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import di.y2;
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
import org.telegram.ui.af1;
import org.telegram.ui.cy;
import org.telegram.ui.ux;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements org.telegram.ui.ActionBar.b2, ux {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o1(s1 s1Var, y2 y2Var, int i10, b2 b2Var, TextView textView, Utilities.Callback callback) {
        this.b = s1Var;
        this.c = y2Var;
        this.a = i10;
        this.d = b2Var;
        this.e = textView;
        this.f = callback;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean K(cy cyVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        s1 s1Var = (s1) this.b;
        y2 y2Var = (y2) this.c;
        b2 b2Var = (b2) this.d;
        TextView textView = (TextView) this.e;
        Utilities.Callback callback = (Utilities.Callback) this.f;
        String obj = s1Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            AndroidUtilities.shakeView(s1Var);
            y2Var.run(Boolean.FALSE);
            return;
        }
        c2 f7 = c2.f(this.a);
        int i11 = b2Var == null ? -1 : b2Var.a;
        b2 d = f7.d(obj);
        if (d == null || d.a == i11) {
            callback.run(obj);
            e2Var.dismiss();
        } else {
            AndroidUtilities.shakeView(s1Var);
            textView.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
            y2Var.run(Boolean.TRUE);
        }
    }

    @Override // org.telegram.ui.ux
    public boolean v(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, af1 af1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.b;
        final TLRPC.User user = (TLRPC.User) this.c;
        final String str = (String) this.d;
        final String str2 = (String) this.e;
        final cy cyVar2 = (cy) this.f;
        Pattern pattern = LaunchActivity.D1;
        final long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        final TLRPC.Chat chat = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-j10));
        final int i12 = this.a;
        if (chat == null || (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String string = LocaleController.getString(R.string.AddBot);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            e2Var.R = string;
            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), chat == null ? "" : chat.title));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.b90
                @Override // org.telegram.ui.ActionBar.b2
                public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i13) {
                    Pattern pattern2 = LaunchActivity.D1;
                    Bundle i14 = a1.g.i("scrollToTopOnResume", true);
                    long j11 = -j10;
                    i14.putLong("chat_id", j11);
                    un unVar = new un(i14);
                    int i15 = i12;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    MessagesController.getInstance(i15).addUserToChat(j11, user, 0, str2, unVar, null);
                    ((ActionBarLayout) LaunchActivity.this.O()).U(unVar, true, false);
                }
            });
            alertDialog$Builder.p();
        } else {
            MessagesController.getInstance(i12).checkIsInChat(false, chat, user, new MessagesController.IsInChatCheckedCallback() { // from class: org.telegram.ui.a90
                @Override // org.telegram.messenger.MessagesController.IsInChatCheckedCallback
                public final void run(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str3) {
                    Pattern pattern2 = LaunchActivity.D1;
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.o8(LaunchActivity.this, str, tL_chatAdminRights2, z12, str2, i12, chat, cyVar2, user, j10, str3));
                }
            });
        }
        return true;
    }

    public /* synthetic */ o1(LaunchActivity launchActivity, int i10, TLRPC.User user, String str, String str2, cy cyVar) {
        this.b = launchActivity;
        this.a = i10;
        this.c = user;
        this.d = str;
        this.e = str2;
        this.f = cyVar;
    }
}
