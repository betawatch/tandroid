package g5;

import f5.d0;
import j3.h0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import jh.d3;
import jh.h5;
import lh.u0;
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
import org.telegram.ui.Components.jo;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fy;
import org.telegram.ui.tn;
import org.telegram.ui.ze1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x(Object obj, long j10, long j11, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j10;
        this.c = j11;
        this.e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.c;
        long j11 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                h0 h0Var = (h0) ((ze.b) obj2).b;
                int i11 = d0.a;
                k3.f fVar = h0Var.a.r;
                k3.a k9 = fVar.k();
                fVar.l(k9, 1016, new d3(k9, (String) obj, this.c, this.b, 18));
                break;
            case 1:
                h5.e0((h5) obj2, this.b, this.c, (Utilities.Callback) obj);
                break;
            case 2:
                l3.o oVar = ((l3.n) obj2).b;
                int i12 = d0.a;
                k3.f fVar2 = ((h0) oVar).a.r;
                k3.a k10 = fVar2.k();
                fVar2.l(k10, 1008, new d3(k10, (String) obj, this.c, this.b, 1));
                break;
            case 3:
                long j12 = this.c;
                ((u0) obj2).n(this.b, (TLRPC.TL_textWithEntities) obj, j12);
                break;
            case 4:
                ((FileUploadOperation) obj2).lambda$checkNewDataAvailable$4((Float) obj, this.b, this.c);
                break;
            case 5:
                ((MediaDataController) obj2).lambda$loadPinnedMessages$163(this.b, this.c, (ArrayList) obj);
                break;
            case 6:
                ((MediaDataController) obj2).lambda$saveDraftReplyMessage$192(this.b, this.c, (TLRPC.Message) obj);
                break;
            case 7:
                ((MessagesStorage) obj2).lambda$loadPendingTasks$29(this.b, this.c, (TLRPC.TL_messages_deleteScheduledMessages) obj);
                break;
            case 8:
                long j13 = this.c;
                ((MessagesStorage) obj2).lambda$loadPendingTasks$21(this.b, (TLRPC.InputPeer) obj, j13);
                break;
            case 9:
                ((MessagesStorage) obj2).lambda$getUnreadMention$156(this.b, this.c, (MessagesStorage.IntCallback) obj);
                break;
            case 10:
                ((NotificationsSettingsFacade) obj2).lambda$applyDialogNotificationsSettings$1(this.b, this.c, (TLRPC.PeerNotifySettings) obj);
                break;
            case 11:
                ((GroupCallMessagesController) obj2).lambda$processUpdate$3(this.b, this.c, (byte[]) obj);
                break;
            case 12:
                ((jo) obj2).d(this.b, this.c, (HashSet) obj);
                break;
            case 13:
                fy fyVar = (fy) obj2;
                ze1 ze1Var = (ze1) obj;
                if (fyVar.y2 == null) {
                    fyVar.finishFragment();
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j11, j10));
                    fyVar.y2.v(fyVar, arrayList, null, false, fyVar.F2, fyVar.G2, fyVar.H2, ze1Var);
                    if (fyVar.e2) {
                        fyVar.y2 = null;
                        break;
                    }
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                tn tnVar = (tn) obj;
                Pattern pattern = LaunchActivity.x1;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(launchActivity.K).getTopicsController().findTopic(j11, j10);
                StringBuilder r6 = a4.w.r(j11, "LaunchActivity openForum after load ", " ");
                r6.append(j10);
                r6.append(" TL_forumTopic ");
                r6.append(findTopic);
                FileLog.d(r6.toString());
                if (launchActivity.m0 != null) {
                    yf.d.a(tnVar, MessagesStorage.TopicKey.of(-j11, j10));
                    ((ActionBarLayout) launchActivity.O()).P(tnVar);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x(Object obj, long j10, TLObject tLObject, long j11, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j10;
        this.e = tLObject;
        this.c = j11;
    }

    public /* synthetic */ x(Object obj, Object obj2, long j10, long j11, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = j10;
        this.c = j11;
    }
}
