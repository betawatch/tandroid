package j2;

import ai.u7;
import android.content.SharedPreferences;
import android.widget.EditText;
import e2.m;
import e2.v;
import java.util.List;
import m4.a0;
import m4.a1;
import m4.b1;
import m4.f1;
import m4.r;
import m4.y0;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.yu0;
import z3.n;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements m, y0, a1, RequestDelegateTimestamp, a2, MessagesStorage.StringCallback, e2.h {
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

    @Override // e2.h
    public void accept(Object obj) {
        n nVar = (n) this.d;
        z3.a aVar = (z3.a) obj;
        e2.d.h(nVar.h);
        byte[] C2 = ob.a.C2(aVar.a, aVar.c);
        v vVar = nVar.c;
        vVar.getClass();
        vVar.H(C2.length, C2);
        nVar.a.d(C2.length, vVar);
        long j3 = aVar.b;
        long j10 = this.c;
        if (j3 == -9223372036854775807L) {
            e2.d.g(nVar.h.w == Long.MAX_VALUE);
        } else {
            long j11 = nVar.h.w;
            j10 = j11 == Long.MAX_VALUE ? j10 + j3 : j3 + j11;
        }
        nVar.a.c(j10, this.b | 1, C2.length, 0, null);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
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
                            b2Var.dismiss();
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
                    ConnectionsManager.getInstance(i12).sendRequest(updateprofile, new u7(12), 2);
                } else {
                    long j10 = -j3;
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(i12).getChatFull(j10);
                    String obj2 = editText.getText().toString();
                    if (chatFull != null) {
                        String str2 = chatFull.about;
                        if ((str2 != null ? str2 : "").equals(obj2)) {
                            AndroidUtilities.hideKeyboard(editText);
                            b2Var.dismiss();
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
                b2Var.dismiss();
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

    @Override // m4.y0
    public void g(f1 f1Var, r rVar) {
        b1 b1Var = (b1) this.d;
        f1Var.s(b1Var.K0(rVar, f1Var, this.b), this.c);
    }

    @Override // m4.a1
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
        yu0.i((yu0) this.d, this.c, this.b, str);
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

    public /* synthetic */ d(Object obj, long j3, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = j3;
        this.b = i10;
    }
}
