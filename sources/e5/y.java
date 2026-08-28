package e5;

import d5.f0;
import gh.k5;
import h3.h0;
import ih.w0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
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
import org.telegram.ui.Components.fo;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dy;
import org.telegram.ui.qn;
import org.telegram.ui.we1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y(Object obj, long j10, long j11, Object obj2, int i9) {
        this.a = i9;
        this.d = obj;
        this.b = j10;
        this.c = j11;
        this.e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        long j10 = this.c;
        long j11 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i9) {
            case 0:
                h0 h0Var = (h0) ((we.b) obj2).c;
                int i10 = f0.a;
                i3.f fVar = h0Var.a.r;
                i3.a k10 = fVar.k();
                fVar.l(k10, 1016, new i3.d(k10, (String) obj, this.c, this.b));
                break;
            case 1:
                k5.d0((k5) obj2, this.b, this.c, (Utilities.Callback) obj);
                break;
            case 2:
                long j12 = this.c;
                ((w0) obj2).n(this.b, (TLRPC.TL_textWithEntities) obj, j12);
                break;
            case 3:
                j3.n nVar = ((j3.m) obj2).b;
                int i11 = f0.a;
                i3.f fVar2 = ((h0) nVar).a.r;
                i3.a k11 = fVar2.k();
                fVar2.l(k11, 1008, new h9.a(k11, (String) obj, this.c, this.b));
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
                ((fo) obj2).d(this.b, this.c, (HashSet) obj);
                break;
            case 13:
                dy dyVar = (dy) obj2;
                we1 we1Var = (we1) obj;
                if (dyVar.y2 == null) {
                    dyVar.finishFragment();
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j11, j10));
                    dyVar.y2.v(dyVar, arrayList, null, false, dyVar.F2, dyVar.G2, dyVar.H2, we1Var);
                    if (dyVar.e2) {
                        dyVar.y2 = null;
                        break;
                    }
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                qn qnVar = (qn) obj;
                Pattern pattern = LaunchActivity.x1;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(launchActivity.K).getTopicsController().findTopic(j11, j10);
                StringBuilder s10 = aa.d.s(j11, "LaunchActivity openForum after load ", " ");
                s10.append(j10);
                s10.append(" TL_forumTopic ");
                s10.append(findTopic);
                FileLog.d(s10.toString());
                if (launchActivity.m0 != null) {
                    vf.c.a(qnVar, MessagesStorage.TopicKey.of(-j11, j10));
                    ((ActionBarLayout) launchActivity.O()).P(qnVar);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ y(Object obj, long j10, TLObject tLObject, long j11, int i9) {
        this.a = i9;
        this.d = obj;
        this.b = j10;
        this.e = tLObject;
        this.c = j11;
    }

    public /* synthetic */ y(Object obj, Object obj2, long j10, long j11, int i9) {
        this.a = i9;
        this.d = obj;
        this.e = obj2;
        this.b = j10;
        this.c = j11;
    }
}
