package a3;

import bi.h7;
import di.x0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileUploadOperation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.l11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.af1;
import org.telegram.ui.cy;
import org.telegram.ui.un;
import vi.s0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h0(Object obj, long j10, long j11, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j10;
        this.c = j11;
        this.e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n4.s sVar = (n4.s) this.d;
                String str = (String) this.e;
                long j10 = this.b;
                long j11 = this.c;
                m0 m0Var = (m0) sVar.c;
                String str2 = e2.n0.a;
                j2.e eVar = ((i2.d0) m0Var).a.s;
                j2.a p10 = eVar.p();
                eVar.q(p10, 1016, new ig.g(p10, str, j11, j10, 19));
                return;
            case 1:
                h7.a1((h7) this.d, this.b, this.c, (Utilities.Callback) this.e);
                return;
            case 2:
                ((x0) this.d).n(this.b, (TLRPC.TL_textWithEntities) this.e, this.c);
                return;
            case 3:
                rf.b bVar = (rf.b) this.d;
                String str3 = (String) this.e;
                long j12 = this.b;
                long j13 = this.c;
                k2.v vVar = (k2.v) bVar.c;
                String str4 = e2.n0.a;
                j2.e eVar2 = ((i2.d0) vVar).a.s;
                j2.a p11 = eVar2.p();
                eVar2.q(p11, 1008, new ig.g(p11, str3, j13, j12, 7));
                return;
            case 4:
                ((FileUploadOperation) this.d).lambda$checkNewDataAvailable$4((Float) this.e, this.b, this.c);
                return;
            case 5:
                ((MediaDataController) this.d).lambda$loadPinnedMessages$163(this.b, this.c, (ArrayList) this.e);
                return;
            case 6:
                ((MediaDataController) this.d).lambda$saveDraftReplyMessage$193(this.b, this.c, (TLRPC.Message) this.e);
                return;
            case 7:
                ((MessagesStorage) this.d).lambda$loadPendingTasks$29(this.b, this.c, (TLRPC.TL_messages_deleteScheduledMessages) this.e);
                return;
            case 8:
                ((MessagesStorage) this.d).lambda$loadPendingTasks$21(this.b, (TLRPC.InputPeer) this.e, this.c);
                return;
            case 9:
                ((MessagesStorage) this.d).lambda$getUnreadMention$159(this.b, this.c, (MessagesStorage.IntCallback) this.e);
                return;
            case 10:
                ((NotificationsSettingsFacade) this.d).lambda$applyDialogNotificationsSettings$1(this.b, this.c, (TLRPC.PeerNotifySettings) this.e);
                return;
            case 11:
                ((SecretChatHelper) this.d).lambda$resendMessages$15(this.b, (TLRPC.EncryptedChat) this.e, this.c);
                return;
            case 12:
                ((GroupCallMessagesController) this.d).lambda$processUpdate$3(this.b, this.c, (byte[]) this.e);
                return;
            case 13:
                ((bp) this.d).e(this.b, this.c, (HashSet) this.e);
                return;
            case 14:
                cy cyVar = (cy) this.d;
                long j14 = this.b;
                long j15 = this.c;
                af1 af1Var = (af1) this.e;
                if (cyVar.C2 == null) {
                    cyVar.finishFragment();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j14, j15));
                cyVar.C2.v(cyVar, arrayList, null, false, cyVar.J2, cyVar.K2, cyVar.L2, af1Var);
                if (cyVar.i2) {
                    cyVar.C2 = null;
                    return;
                }
                return;
            case 15:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                long j16 = this.b;
                long j17 = this.c;
                un unVar = (un) this.e;
                Pattern pattern = LaunchActivity.D1;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(launchActivity.O).getTopicsController().findTopic(j16, j17);
                StringBuilder t10 = a1.g.t(j16, "LaunchActivity openForum after load ", " ");
                t10.append(j17);
                t10.append(" TL_forumTopic ");
                t10.append(findTopic);
                FileLog.d(t10.toString());
                if (launchActivity.q0 != null) {
                    pg.d.a(unVar, MessagesStorage.TopicKey.of(-j16, j17));
                    ((ActionBarLayout) launchActivity.O()).R(unVar);
                    return;
                }
                return;
            default:
                s0 s0Var = (s0) this.d;
                vi.o0 o0Var = (vi.o0) this.e;
                long j18 = this.b;
                long j19 = this.c;
                synchronized (s0Var.g) {
                    if (!o0Var.d && !o0Var.e) {
                        ((l11) s0Var.e).a(o0Var.a, o0Var.b, j18, j19);
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ h0(Object obj, long j10, TLObject tLObject, long j11, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j10;
        this.e = tLObject;
        this.c = j11;
    }

    public /* synthetic */ h0(Object obj, Object obj2, long j10, long j11, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = j10;
        this.c = j11;
    }
}
