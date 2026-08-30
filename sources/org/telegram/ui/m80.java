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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m80 implements iy, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m80(LaunchActivity launchActivity, int i10, TLRPC.User user, String str, String str2, oy oyVar) {
        this.b = launchActivity;
        this.a = i10;
        this.c = user;
        this.d = str;
        this.e = str2;
        this.f = oyVar;
    }

    @Override // org.telegram.ui.iy
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.iy
    public /* synthetic */ boolean K(oy oyVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        uf.g1 g1Var = (uf.g1) this.b;
        gg.c1 c1Var = (gg.c1) this.c;
        uf.o1 o1Var = (uf.o1) this.d;
        TextView textView = (TextView) this.e;
        Utilities.Callback callback = (Utilities.Callback) this.f;
        String obj = g1Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            AndroidUtilities.shakeView(g1Var);
            c1Var.run(Boolean.FALSE);
            return;
        }
        uf.p1 f10 = uf.p1.f(this.a);
        int i11 = o1Var == null ? -1 : o1Var.a;
        uf.o1 d = f10.d(obj);
        if (d == null || d.a == i11) {
            callback.run(obj);
            d2Var.dismiss();
        } else {
            AndroidUtilities.shakeView(g1Var);
            textView.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
            c1Var.run(Boolean.TRUE);
        }
    }

    @Override // org.telegram.ui.iy
    public boolean w(oy oyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, kf1 kf1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.b;
        final TLRPC.User user = (TLRPC.User) this.c;
        final String str = (String) this.d;
        final String str2 = (String) this.e;
        final oy oyVar2 = (oy) this.f;
        Pattern pattern = LaunchActivity.y1;
        final long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        final TLRPC.Chat chat = MessagesController.getInstance(launchActivity.L).getChat(Long.valueOf(-j10));
        final int i12 = this.a;
        if (chat == null || (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String string = LocaleController.getString(R.string.AddBot);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.O = string;
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), chat == null ? "" : chat.title));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.i90
                @Override // org.telegram.ui.ActionBar.c2
                public final void i(org.telegram.ui.ActionBar.d2 d2Var2, int i13) {
                    Pattern pattern2 = LaunchActivity.y1;
                    Bundle i14 = android.support.v4.media.a.i("scrollToTopOnResume", true);
                    long j11 = -j10;
                    i14.putLong("chat_id", j11);
                    xn xnVar = new xn(i14);
                    int i15 = i12;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    MessagesController.getInstance(i15).addUserToChat(j11, user, 0, str2, xnVar, null);
                    ((ActionBarLayout) LaunchActivity.this.O()).S(xnVar, true, false);
                }
            });
            alertDialog$Builder.o();
        } else {
            MessagesController.getInstance(i12).checkIsInChat(false, chat, user, new MessagesController.IsInChatCheckedCallback() { // from class: org.telegram.ui.h90
                @Override // org.telegram.messenger.MessagesController.IsInChatCheckedCallback
                public final void run(boolean z11, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str3) {
                    Pattern pattern2 = LaunchActivity.y1;
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.p8(LaunchActivity.this, str, tL_chatAdminRights2, z11, str2, i12, chat, oyVar2, user, j10, str3));
                }
            });
        }
        return true;
    }

    public /* synthetic */ m80(uf.g1 g1Var, gg.c1 c1Var, int i10, uf.o1 o1Var, TextView textView, Utilities.Callback callback) {
        this.b = g1Var;
        this.c = c1Var;
        this.a = i10;
        this.d = o1Var;
        this.e = textView;
        this.f = callback;
    }
}
