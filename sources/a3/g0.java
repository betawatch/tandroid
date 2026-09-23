package a3;

import ai.o1;
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
import org.telegram.ui.Components.qo;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ry;
import org.telegram.ui.wf1;
import org.telegram.ui.xn;
import yh.y3;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g0(Object obj, long j3, long j10, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j3;
        this.c = j10;
        this.e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j3 = this.c;
        long j10 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                l0 l0Var = (l0) ((of.b) obj2).c;
                String str = e2.d0.a;
                j2.f fVar = ((i2.c0) l0Var).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1016, new j2.c(p5, (String) obj, this.c, this.b));
                break;
            case 1:
                long j11 = this.c;
                ((o1) obj2).n(this.b, (TLRPC.TL_textWithEntities) obj, j11);
                break;
            case 2:
                k2.j jVar = (k2.j) ((n4.y) obj2).c;
                String str2 = e2.d0.a;
                j2.f fVar2 = ((i2.c0) jVar).a.s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1008, new hg.r(p10, (String) obj, this.c, this.b));
                break;
            case 3:
                ((FileUploadOperation) obj2).lambda$checkNewDataAvailable$4((Float) obj, this.b, this.c);
                break;
            case 4:
                ((MediaDataController) obj2).lambda$loadPinnedMessages$163(this.b, this.c, (ArrayList) obj);
                break;
            case 5:
                ((MediaDataController) obj2).lambda$saveDraftReplyMessage$192(this.b, this.c, (TLRPC.Message) obj);
                break;
            case 6:
                ((MessagesStorage) obj2).lambda$loadPendingTasks$29(this.b, this.c, (TLRPC.TL_messages_deleteScheduledMessages) obj);
                break;
            case 7:
                long j12 = this.c;
                ((MessagesStorage) obj2).lambda$loadPendingTasks$21(this.b, (TLRPC.InputPeer) obj, j12);
                break;
            case 8:
                ((MessagesStorage) obj2).lambda$getUnreadMention$156(this.b, this.c, (MessagesStorage.IntCallback) obj);
                break;
            case 9:
                ((NotificationsSettingsFacade) obj2).lambda$applyDialogNotificationsSettings$1(this.b, this.c, (TLRPC.PeerNotifySettings) obj);
                break;
            case 10:
                long j13 = this.c;
                ((SecretChatHelper) obj2).lambda$resendMessages$15(this.b, (TLRPC.EncryptedChat) obj, j13);
                break;
            case 11:
                ((GroupCallMessagesController) obj2).lambda$processUpdate$3(this.b, this.c, (byte[]) obj);
                break;
            case 12:
                ((qo) obj2).d(this.b, this.c, (HashSet) obj);
                break;
            case 13:
                ry ryVar = (ry) obj2;
                wf1 wf1Var = (wf1) obj;
                if (ryVar.C2 == null) {
                    ryVar.finishFragment();
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j10, j3));
                    ryVar.C2.u(ryVar, arrayList, null, false, ryVar.J2, ryVar.K2, ryVar.L2, wf1Var);
                    if (ryVar.i2) {
                        ryVar.C2 = null;
                        break;
                    }
                }
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                xn xnVar = (xn) obj;
                Pattern pattern = LaunchActivity.B1;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(launchActivity.O).getTopicsController().findTopic(j10, j3);
                StringBuilder u10 = a4.a.u(j10, "LaunchActivity openForum after load ", " ");
                u10.append(j3);
                u10.append(" TL_forumTopic ");
                u10.append(findTopic);
                FileLog.d(u10.toString());
                if (launchActivity.q0 != null) {
                    ng.d.a(xnVar, MessagesStorage.TopicKey.of(-j10, j3));
                    ((ActionBarLayout) launchActivity.O()).P(xnVar);
                    break;
                }
                break;
            default:
                y3.e0((y3) obj2, this.b, this.c, (Utilities.Callback) obj);
                break;
        }
    }

    public /* synthetic */ g0(Object obj, long j3, TLObject tLObject, long j10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j3;
        this.e = tLObject;
        this.c = j10;
    }

    public /* synthetic */ g0(Object obj, Object obj2, long j3, long j10, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = j3;
        this.c = j10;
    }
}
