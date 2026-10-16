package j2;

import android.content.SharedPreferences;
import android.widget.EditText;
import bi.g7;
import e2.o;
import e2.x;
import java.util.List;
import m4.e0;
import m4.e1;
import m4.g1;
import m4.i1;
import m4.m1;
import m4.v;
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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.xv0;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements o, e1, g1, RequestDelegateTimestamp, z1, MessagesStorage.StringCallback, e2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(long j10, int i10, Object obj, int i11) {
        this.a = i11;
        this.c = j10;
        this.b = i10;
        this.d = obj;
    }

    @Override // e2.j
    public void accept(Object obj) {
        z3.o oVar = (z3.o) this.d;
        z3.b bVar = (z3.b) obj;
        oVar.h.getClass();
        byte[] v22 = sb.a.v2(bVar.a, bVar.c);
        x xVar = oVar.c;
        xVar.getClass();
        xVar.L(v22.length, v22);
        oVar.a.d(v22.length, xVar);
        long j10 = bVar.b;
        long j11 = this.c;
        if (j10 == -9223372036854775807L) {
            u6.p(oVar.h.x == Long.MAX_VALUE);
        } else {
            long j12 = oVar.h.x;
            j11 = j12 == Long.MAX_VALUE ? j11 + j10 : j10 + j12;
        }
        oVar.a.c(j11, this.b | 1, v22.length, 0, null);
    }

    @Override // m4.g1
    public Object c(e0 e0Var, v vVar, int i10) {
        List list = (List) this.d;
        int i11 = this.b;
        return e0Var.q(vVar, list, i11 == -1 ? e0Var.t.n0() : i11, i11 == -1 ? e0Var.t.M0() : this.c);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(a2 a2Var, int i10) {
        int i11 = this.a;
        Object obj = this.d;
        int i12 = this.b;
        long j10 = this.c;
        switch (i11) {
            case 4:
                EditText editText = (EditText) obj;
                if (j10 > 0) {
                    TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(UserConfig.getInstance(i12).getClientUserId());
                    String trim = editText.getText().toString().replace("\n", " ").replaceAll(" +", " ").trim();
                    if (userFull != null) {
                        String str = userFull.about;
                        if ((str != null ? str : "").equals(trim)) {
                            AndroidUtilities.hideKeyboard(editText);
                            a2Var.dismiss();
                            break;
                        } else {
                            userFull.about = trim;
                            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
                        }
                    }
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.about = trim;
                    updateprofile.flags |= 4;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 2, Long.valueOf(j10));
                    ConnectionsManager.getInstance(i12).sendRequest(updateprofile, new g7(12), 2);
                } else {
                    long j11 = -j10;
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(i12).getChatFull(j11);
                    String obj2 = editText.getText().toString();
                    if (chatFull != null) {
                        String str2 = chatFull.about;
                        if ((str2 != null ? str2 : "").equals(obj2)) {
                            AndroidUtilities.hideKeyboard(editText);
                            a2Var.dismiss();
                            break;
                        } else {
                            chatFull.about = obj2;
                            NotificationCenter notificationCenter = NotificationCenter.getInstance(i12);
                            int i13 = NotificationCenter.chatInfoDidLoad;
                            Boolean bool = Boolean.FALSE;
                            notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, chatFull, 0, bool, bool);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 2, Long.valueOf(j10));
                    MessagesController.getInstance(i12).updateChatAbout(j11, obj2, chatFull);
                }
                a2Var.dismiss();
                break;
            default:
                Runnable runnable = (Runnable) obj;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                if (j10 != 0) {
                    edit.putInt("color_" + j10, 0);
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

    @Override // m4.e1
    public void h(m1 m1Var, v vVar) {
        i1 i1Var = (i1) this.d;
        m1Var.r(i1Var.K0(vVar, m1Var, this.b), this.c);
    }

    @Override // e2.o
    public void invoke(Object obj) {
        ((b) obj).f((a) this.d, this.b, this.c);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        xv0.i((xv0) this.d, this.c, this.b, str);
    }

    public /* synthetic */ d(a aVar, int i10, long j10, long j11) {
        this.a = 0;
        this.d = aVar;
        this.b = i10;
        this.c = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegateTimestamp
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        ((VoIPService) this.d).lambda$createGroupInstance$78(this.b, this.c, tLObject, tL_error, j10);
    }

    public /* synthetic */ d(Object obj, int i10, long j10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = j10;
    }

    public /* synthetic */ d(Object obj, long j10, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = j10;
        this.b = i10;
    }
}
