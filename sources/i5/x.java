package i5;

import h5.d0;
import j3.c0;
import j3.q0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import lh.g5;
import nh.v0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileUploadOperation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ko;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qy;
import org.telegram.ui.sf1;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x(Object obj, long j10, long j11, Object obj2, int i10) {
        this.a = i10;
        this.e = obj;
        this.c = j10;
        this.d = j11;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.d;
        long j11 = this.c;
        Object obj = this.b;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                c0 c0Var = (c0) ((f7.b) obj2).c;
                int i11 = d0.a;
                k3.f fVar = c0Var.a.q;
                k3.a p10 = fVar.p();
                fVar.q(p10, 1016, new k3.c(p10, (String) obj, this.d, this.c));
                break;
            case 1:
                l3.q qVar = (l3.q) ((f7.b) obj2).c;
                int i12 = d0.a;
                k3.f fVar2 = ((c0) qVar).a.q;
                k3.a p11 = fVar2.p();
                fVar2.q(p11, 1008, new q0(p11, (String) obj, this.d, this.c));
                break;
            case 2:
                g5.e0((g5) obj2, this.c, this.d, (Utilities.Callback) obj);
                break;
            case 3:
                long j12 = this.d;
                ((v0) obj2).n(this.c, (TLRPC.TL_textWithEntities) obj, j12);
                break;
            case 4:
                ((FileUploadOperation) obj2).lambda$checkNewDataAvailable$4((Float) obj, this.c, this.d);
                break;
            case 5:
                ((MediaDataController) obj2).lambda$loadPinnedMessages$163(this.c, this.d, (ArrayList) obj);
                break;
            case 6:
                ((MediaDataController) obj2).lambda$saveDraftReplyMessage$192(this.c, this.d, (TLRPC.Message) obj);
                break;
            case 7:
                ((MessagesStorage) obj2).lambda$loadPendingTasks$29(this.c, this.d, (TLRPC.TL_messages_deleteScheduledMessages) obj);
                break;
            case 8:
                long j13 = this.d;
                ((MessagesStorage) obj2).lambda$loadPendingTasks$21(this.c, (TLRPC.InputPeer) obj, j13);
                break;
            case 9:
                ((MessagesStorage) obj2).lambda$getUnreadMention$156(this.c, this.d, (MessagesStorage.IntCallback) obj);
                break;
            case 10:
                ((NotificationsSettingsFacade) obj2).lambda$applyDialogNotificationsSettings$1(this.c, this.d, (TLRPC.PeerNotifySettings) obj);
                break;
            case 11:
                ((GroupCallMessagesController) obj2).lambda$processUpdate$3(this.c, this.d, (byte[]) obj);
                break;
            case 12:
                ((ko) obj2).d(this.c, this.d, (HashSet) obj);
                break;
            case 13:
                qy qyVar = (qy) obj2;
                sf1 sf1Var = (sf1) obj;
                if (qyVar.z2 == null) {
                    qyVar.finishFragment();
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j11, j10));
                    qyVar.z2.w(qyVar, arrayList, null, false, qyVar.G2, qyVar.H2, qyVar.I2, sf1Var);
                    if (qyVar.f2) {
                        qyVar.z2 = null;
                        break;
                    }
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                zn znVar = (zn) obj;
                Pattern pattern = LaunchActivity.y1;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(launchActivity.L).getTopicsController().findTopic(j11, j10);
                StringBuilder s6 = android.support.v4.media.a.s(j11, "LaunchActivity openForum after load ", " ");
                s6.append(j10);
                s6.append(" TL_forumTopic ");
                s6.append(findTopic);
                FileLog.d(s6.toString());
                if (launchActivity.n0 != null) {
                    ag.f.a(znVar, MessagesStorage.TopicKey.of(-j11, j10));
                    ((ActionBarLayout) launchActivity.O()).P(znVar);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x(Object obj, long j10, TLObject tLObject, long j11, int i10) {
        this.a = i10;
        this.e = obj;
        this.c = j10;
        this.b = tLObject;
        this.d = j11;
    }

    public /* synthetic */ x(Object obj, Object obj2, long j10, long j11, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = obj2;
        this.c = j10;
        this.d = j11;
    }
}
