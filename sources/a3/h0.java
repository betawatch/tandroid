package a3;

import ai.l7;
import ci.x0;
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
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.zo;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cy;
import org.telegram.ui.qn;
import org.telegram.ui.re1;
import si.s0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                String str2 = e2.m0.a;
                j2.f fVar = ((i2.c0) m0Var).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1016, new j2.c(p5, str, j11, j10, 17));
                return;
            case 1:
                l7.b1((l7) this.d, this.b, this.c, (Utilities.Callback) this.e);
                return;
            case 2:
                ((x0) this.d).n(this.b, (TLRPC.TL_textWithEntities) this.e, this.c);
                return;
            case 3:
                qf.b bVar = (qf.b) this.d;
                String str3 = (String) this.e;
                long j12 = this.b;
                long j13 = this.c;
                k2.u uVar = (k2.u) bVar.c;
                String str4 = e2.m0.a;
                j2.f fVar2 = ((i2.c0) uVar).a.s;
                j2.a p9 = fVar2.p();
                fVar2.q(p9, 1008, new j2.c(p9, str3, j13, j12, 5));
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
                ((MessagesStorage) this.d).lambda$getUnreadMention$156(this.b, this.c, (MessagesStorage.IntCallback) this.e);
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
                ((zo) this.d).d(this.b, this.c, (HashSet) this.e);
                return;
            case 14:
                cy cyVar = (cy) this.d;
                long j14 = this.b;
                long j15 = this.c;
                re1 re1Var = (re1) this.e;
                if (cyVar.C2 == null) {
                    cyVar.finishFragment();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j14, j15));
                cyVar.C2.w(cyVar, arrayList, null, false, cyVar.J2, cyVar.K2, cyVar.L2, re1Var);
                if (cyVar.i2) {
                    cyVar.C2 = null;
                    return;
                }
                return;
            case 15:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                long j16 = this.b;
                long j17 = this.c;
                qn qnVar = (qn) this.e;
                Pattern pattern = LaunchActivity.C1;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(launchActivity.O).getTopicsController().findTopic(j16, j17);
                StringBuilder t10 = a1.g.t(j16, "LaunchActivity openForum after load ", " ");
                t10.append(j17);
                t10.append(" TL_forumTopic ");
                t10.append(findTopic);
                FileLog.d(t10.toString());
                if (launchActivity.q0 != null) {
                    og.d.a(qnVar, MessagesStorage.TopicKey.of(-j16, j17));
                    ((ActionBarLayout) launchActivity.O()).P(qnVar);
                    return;
                }
                return;
            default:
                s0 s0Var = (s0) this.d;
                si.o0 o0Var = (si.o0) this.e;
                long j18 = this.b;
                long j19 = this.c;
                synchronized (s0Var.g) {
                    if (!o0Var.d && !o0Var.e) {
                        ((a11) s0Var.e).a(o0Var.a, o0Var.b, j18, j19);
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
