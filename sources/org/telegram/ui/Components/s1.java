package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s1 implements org.telegram.ui.ActionBar.b2, ResultCallback {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s1(EditText editText, long j10, int i10, EditText editText2) {
        this.c = editText;
        this.a = j10;
        this.b = i10;
        this.d = editText2;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        EditText editText = (EditText) this.c;
        EditText editText2 = (EditText) this.d;
        if (editText.getText() == null) {
            return;
        }
        long j10 = this.a;
        int i11 = this.b;
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
            String obj = editText.getText().toString();
            String obj2 = editText2.getText().toString();
            String str = user.first_name;
            String str2 = user.last_name;
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            if (str.equals(obj) && str2.equals(obj2)) {
                e2Var.dismiss();
                return;
            }
            TL_account.updateProfile updateprofile = new TL_account.updateProfile();
            updateprofile.flags = 3;
            updateprofile.first_name = obj;
            user.first_name = obj;
            updateprofile.last_name = obj2;
            user.last_name = obj2;
            TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(UserConfig.getInstance(i11).getClientUserId()));
            if (user2 != null) {
                user2.first_name = updateprofile.first_name;
                user2.last_name = updateprofile.last_name;
            }
            UserConfig.getInstance(i11).saveConfig(true);
            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            ConnectionsManager.getInstance(i11).sendRequest(updateprofile, new di.d6(12));
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j10));
        } else {
            long j11 = -j10;
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(j11));
            String obj3 = editText.getText().toString();
            String str3 = chat.title;
            if (str3 != null && str3.equals(obj3)) {
                e2Var.dismiss();
                return;
            }
            chat.title = obj3;
            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT_NAME));
            MessagesController.getInstance(i11).changeChatTitle(j11, obj3);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j10));
        }
        e2Var.dismiss();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        e31 e31Var = (e31) this.c;
        yp ypVar = (yp) this.d;
        Pair pair = (Pair) obj;
        if (pair == null || ((Long) pair.first).longValue() != this.a) {
            return;
        }
        Drawable drawable = ypVar.b;
        if (drawable instanceof vc0) {
            vc0 vc0Var = (vc0) drawable;
            vc0Var.s(e31.e((Bitmap) pair.second), this.b >= 0 ? 100 : -100);
            vc0Var.t(e31Var.L);
        }
        e31Var.invalidate();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public /* synthetic */ s1(e31 e31Var, long j10, yp ypVar, int i10) {
        this.c = e31Var;
        this.a = j10;
        this.d = ypVar;
        this.b = i10;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
