package e5;

import d5.g0;
import h3.h0;
import h3.q2;
import hh.i5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import jh.u0;
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
import org.telegram.ui.Components.co;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gy;
import org.telegram.ui.rn;
import org.telegram.ui.we1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w(Object obj, long j10, long j11, Object obj2, int i10) {
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
                h0 h0Var = (h0) ((xe.b) obj2).c;
                int i11 = g0.a;
                i3.f fVar = h0Var.a.r;
                i3.a k10 = fVar.k();
                fVar.l(k10, 1016, new q2(k10, (String) obj, this.c, this.b, 25));
                break;
            case 1:
                i5.e0((i5) obj2, this.b, this.c, (Utilities.Callback) obj);
                break;
            case 2:
                j3.o oVar = ((j3.n) obj2).b;
                int i12 = g0.a;
                i3.f fVar2 = ((h0) oVar).a.r;
                i3.a k11 = fVar2.k();
                fVar2.l(k11, 1008, new q2(k11, (String) obj, this.c, this.b, 8));
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
                ((co) obj2).d(this.b, this.c, (HashSet) obj);
                break;
            case 13:
                gy gyVar = (gy) obj2;
                we1 we1Var = (we1) obj;
                if (gyVar.y2 == null) {
                    gyVar.finishFragment();
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j11, j10));
                    gyVar.y2.w(gyVar, arrayList, null, false, gyVar.F2, gyVar.G2, gyVar.H2, we1Var);
                    if (gyVar.e2) {
                        gyVar.y2 = null;
                        break;
                    }
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                rn rnVar = (rn) obj;
                Pattern pattern = LaunchActivity.x1;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(launchActivity.K).getTopicsController().findTopic(j11, j10);
                StringBuilder q6 = a9.p.q(j11, "LaunchActivity openForum after load ", " ");
                q6.append(j10);
                q6.append(" TL_forumTopic ");
                q6.append(findTopic);
                FileLog.d(q6.toString());
                if (launchActivity.m0 != null) {
                    wf.c.a(rnVar, MessagesStorage.TopicKey.of(-j11, j10));
                    ((ActionBarLayout) launchActivity.O()).P(rnVar);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ w(Object obj, long j10, TLObject tLObject, long j11, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j10;
        this.e = tLObject;
        this.c = j11;
    }

    public /* synthetic */ w(Object obj, Object obj2, long j10, long j11, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = j10;
        this.c = j11;
    }
}
