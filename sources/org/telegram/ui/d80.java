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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d80 implements yx, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d80(LaunchActivity launchActivity, int i10, TLRPC.User user, String str, String str2, fy fyVar) {
        this.b = launchActivity;
        this.a = i10;
        this.c = user;
        this.d = str;
        this.e = str2;
        this.f = fyVar;
    }

    @Override // org.telegram.ui.yx
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.yx
    public /* synthetic */ boolean J(fy fyVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        sf.h1 h1Var = (sf.h1) this.b;
        eg.d1 d1Var = (eg.d1) this.c;
        sf.r1 r1Var = (sf.r1) this.d;
        TextView textView = (TextView) this.e;
        Utilities.Callback callback = (Utilities.Callback) this.f;
        String obj = h1Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            AndroidUtilities.shakeView(h1Var);
            d1Var.run(Boolean.FALSE);
            return;
        }
        sf.s1 f9 = sf.s1.f(this.a);
        int i11 = r1Var == null ? -1 : r1Var.a;
        sf.r1 d = f9.d(obj);
        if (d == null || d.a == i11) {
            callback.run(obj);
            c2Var.dismiss();
        } else {
            AndroidUtilities.shakeView(h1Var);
            textView.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
            d1Var.run(Boolean.TRUE);
        }
    }

    @Override // org.telegram.ui.yx
    public boolean v(fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.b;
        final TLRPC.User user = (TLRPC.User) this.c;
        final String str = (String) this.d;
        final String str2 = (String) this.e;
        final fy fyVar2 = (fy) this.f;
        Pattern pattern = LaunchActivity.x1;
        final long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        final TLRPC.Chat chat = MessagesController.getInstance(launchActivity.K).getChat(Long.valueOf(-j10));
        final int i12 = this.a;
        if (chat == null || (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String string = LocaleController.getString(R.string.AddBot);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = string;
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), chat == null ? "" : chat.title));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.a90
                @Override // org.telegram.ui.ActionBar.b2
                public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i13) {
                    Pattern pattern2 = LaunchActivity.x1;
                    Bundle i14 = a4.w.i("scrollToTopOnResume", true);
                    long j11 = -j10;
                    i14.putLong("chat_id", j11);
                    tn tnVar = new tn(i14);
                    int i15 = i12;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    MessagesController.getInstance(i15).addUserToChat(j11, user, 0, str2, tnVar, null);
                    ((ActionBarLayout) LaunchActivity.this.O()).S(tnVar, true, false);
                }
            });
            alertDialog$Builder.o();
        } else {
            MessagesController.getInstance(i12).checkIsInChat(false, chat, user, new MessagesController.IsInChatCheckedCallback() { // from class: org.telegram.ui.z80
                @Override // org.telegram.messenger.MessagesController.IsInChatCheckedCallback
                public final void run(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str3) {
                    Pattern pattern2 = LaunchActivity.x1;
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.o8(LaunchActivity.this, str, tL_chatAdminRights2, z12, str2, i12, chat, fyVar2, user, j10, str3));
                }
            });
        }
        return true;
    }

    public /* synthetic */ d80(sf.h1 h1Var, eg.d1 d1Var, int i10, sf.r1 r1Var, TextView textView, Utilities.Callback callback) {
        this.b = h1Var;
        this.c = d1Var;
        this.a = i10;
        this.d = r1Var;
        this.e = textView;
        this.f = callback;
    }
}
