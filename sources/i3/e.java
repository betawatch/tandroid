package i3;

import android.content.SharedPreferences;
import android.widget.EditText;
import ih.q5;
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
import org.telegram.ui.Components.eu0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements d5.k, RequestDelegateTimestamp, b2, MessagesStorage.StringCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(a aVar, int i9, long j10, long j11) {
        this.a = 0;
        this.d = aVar;
        this.b = i9;
        this.c = j10;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i9) {
        int i10 = this.a;
        Object obj = this.d;
        int i11 = this.b;
        long j10 = this.c;
        switch (i10) {
            case 2:
                EditText editText = (EditText) obj;
                if (j10 > 0) {
                    TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(UserConfig.getInstance(i11).getClientUserId());
                    String trim = editText.getText().toString().replace("\n", " ").replaceAll(" +", " ").trim();
                    if (userFull != null) {
                        String str = userFull.about;
                        if ((str != null ? str : "").equals(trim)) {
                            AndroidUtilities.hideKeyboard(editText);
                            c2Var.dismiss();
                            break;
                        } else {
                            userFull.about = trim;
                            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
                        }
                    }
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.about = trim;
                    updateprofile.flags |= 4;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 2, Long.valueOf(j10));
                    ConnectionsManager.getInstance(i11).sendRequest(updateprofile, new q5(9), 2);
                } else {
                    long j11 = -j10;
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(i11).getChatFull(j11);
                    String obj2 = editText.getText().toString();
                    if (chatFull != null) {
                        String str2 = chatFull.about;
                        if ((str2 != null ? str2 : "").equals(obj2)) {
                            AndroidUtilities.hideKeyboard(editText);
                            c2Var.dismiss();
                            break;
                        } else {
                            chatFull.about = obj2;
                            NotificationCenter notificationCenter = NotificationCenter.getInstance(i11);
                            int i12 = NotificationCenter.chatInfoDidLoad;
                            Boolean bool = Boolean.FALSE;
                            notificationCenter.lambda$postNotificationNameOnUIThread$1(i12, chatFull, 0, bool, bool);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 2, Long.valueOf(j10));
                    MessagesController.getInstance(i11).updateChatAbout(j11, obj2, chatFull);
                }
                c2Var.dismiss();
                break;
            default:
                Runnable runnable = (Runnable) obj;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                if (j10 != 0) {
                    edit.putInt("color_" + j10, 0);
                } else if (i11 == 1) {
                    edit.putInt("MessagesLed", 0);
                } else if (i11 == 0) {
                    edit.putInt("GroupLed", 0);
                } else if (i11 == 3) {
                    edit.putInt("StoriesLed", 0);
                } else if (i11 == 5 || i11 == 4) {
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

    @Override // d5.k
    public void invoke(Object obj) {
        ((b) obj).i((a) this.d, this.b, this.c);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        eu0.i((eu0) this.d, this.c, this.b, str);
    }

    public /* synthetic */ e(Object obj, int i9, long j10, int i10) {
        this.a = i10;
        this.c = j10;
        this.b = i9;
        this.d = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegateTimestamp
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        ((VoIPService) this.d).lambda$createGroupInstance$78(this.b, this.c, tLObject, tL_error, j10);
    }

    public /* synthetic */ e(VoIPService voIPService, int i9, long j10) {
        this.a = 1;
        this.d = voIPService;
        this.b = i9;
        this.c = j10;
    }

    public /* synthetic */ e(eu0 eu0Var, long j10, int i9) {
        this.a = 4;
        this.d = eu0Var;
        this.c = j10;
        this.b = i9;
    }
}
