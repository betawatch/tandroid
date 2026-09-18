package j2;

import ai.t7;
import android.content.SharedPreferences;
import android.widget.EditText;
import e2.m;
import java.util.List;
import m4.a0;
import m4.d1;
import m4.f1;
import m4.g1;
import m4.k1;
import m4.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.zu0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements m, d1, f1, RequestDelegateTimestamp, b2, MessagesStorage.StringCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(long j3, int i10, Object obj, int i11) {
        this.a = i11;
        this.c = j3;
        this.b = i10;
        this.d = obj;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i10) {
        int i11 = this.a;
        Object obj = this.d;
        int i12 = this.b;
        long j3 = this.c;
        switch (i11) {
            case 4:
                EditText editText = (EditText) obj;
                if (j3 > 0) {
                    TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(UserConfig.getInstance(i12).getClientUserId());
                    String trim = editText.getText().toString().replace("\n", " ").replaceAll(" +", " ").trim();
                    if (userFull != null) {
                        String str = userFull.about;
                        if ((str != null ? str : "").equals(trim)) {
                            AndroidUtilities.hideKeyboard(editText);
                            c2Var.dismiss();
                            break;
                        } else {
                            userFull.about = trim;
                            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j3), userFull);
                        }
                    }
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.about = trim;
                    updateprofile.flags |= 4;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 2, Long.valueOf(j3));
                    ConnectionsManager.getInstance(i12).sendRequest(updateprofile, new t7(12), 2);
                } else {
                    long j10 = -j3;
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(i12).getChatFull(j10);
                    String obj2 = editText.getText().toString();
                    if (chatFull != null) {
                        String str2 = chatFull.about;
                        if ((str2 != null ? str2 : "").equals(obj2)) {
                            AndroidUtilities.hideKeyboard(editText);
                            c2Var.dismiss();
                            break;
                        } else {
                            chatFull.about = obj2;
                            NotificationCenter notificationCenter = NotificationCenter.getInstance(i12);
                            int i13 = NotificationCenter.chatInfoDidLoad;
                            Boolean bool = Boolean.FALSE;
                            notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, chatFull, 0, bool, bool);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 2, Long.valueOf(j3));
                    MessagesController.getInstance(i12).updateChatAbout(j10, obj2, chatFull);
                }
                c2Var.dismiss();
                break;
            default:
                Runnable runnable = (Runnable) obj;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                if (j3 != 0) {
                    edit.putInt("color_" + j3, 0);
                } else if (i12 == 1) {
                    edit.putInt("MessagesLed", 0);
                } else if (i12 == 0) {
                    edit.putInt("GroupLed", 0);
                } else if (i12 == 3) {
                    edit.putInt("StoriesLed", 0);
                } else if (i12 == 5 || i12 == 4) {
                    edit.putInt("ReactionsLed", 0);
                } else {
                    edit.putInt("ChannelLed", 0);
                }
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    @Override // m4.d1
    public void g(k1 k1Var, r rVar) {
        g1 g1Var = (g1) this.d;
        k1Var.s(g1Var.K0(rVar, k1Var, this.b), this.c);
    }

    @Override // m4.f1
    public Object h(a0 a0Var, r rVar, int i10) {
        List list = (List) this.d;
        int i11 = this.b;
        return a0Var.q(rVar, list, i11 == -1 ? a0Var.t.l0() : i11, i11 == -1 ? a0Var.t.J0() : this.c);
    }

    @Override // e2.m
    public void invoke(Object obj) {
        ((b) obj).f((a) this.d, this.b, this.c);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        zu0.i((zu0) this.d, this.c, this.b, str);
    }

    public /* synthetic */ d(a aVar, int i10, long j3, long j10) {
        this.a = 0;
        this.d = aVar;
        this.b = i10;
        this.c = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegateTimestamp
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
        ((VoIPService) this.d).lambda$createGroupInstance$78(this.b, this.c, tLObject, tL_error, j3);
    }

    public /* synthetic */ d(Object obj, int i10, long j3, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = j3;
    }

    public /* synthetic */ d(zu0 zu0Var, long j3, int i10) {
        this.a = 6;
        this.d = zu0Var;
        this.c = j3;
        this.b = i10;
    }
}
