package a3;

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
import org.telegram.ui.Components.uo;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.ig1;
import org.telegram.ui.wy;
import xh.x3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g0(Object obj, long j3, long j10, Object obj2, int i10) {
        this.a = i10;
        this.e = obj;
        this.c = j3;
        this.d = j10;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j3 = this.d;
        long j10 = this.c;
        Object obj = this.b;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                l0 l0Var = (l0) ((of.b) obj2).c;
                String str = e2.d0.a;
                j2.e eVar = ((i2.b0) l0Var).a.s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1016, new i0.b(p5, (String) obj, this.d, this.c, 24));
                break;
            case 1:
                k2.j jVar = (k2.j) ((of.b) obj2).c;
                String str2 = e2.d0.a;
                j2.e eVar2 = ((i2.b0) jVar).a.s;
                j2.a p10 = eVar2.p();
                eVar2.q(p10, 1008, new i0.b(p10, (String) obj, this.d, this.c, 12));
                break;
            case 2:
                ((FileUploadOperation) obj2).lambda$checkNewDataAvailable$4((Float) obj, this.c, this.d);
                break;
            case 3:
                ((MediaDataController) obj2).lambda$loadPinnedMessages$163(this.c, this.d, (ArrayList) obj);
                break;
            case 4:
                ((MediaDataController) obj2).lambda$saveDraftReplyMessage$192(this.c, this.d, (TLRPC.Message) obj);
                break;
            case 5:
                ((MessagesStorage) obj2).lambda$loadPendingTasks$29(this.c, this.d, (TLRPC.TL_messages_deleteScheduledMessages) obj);
                break;
            case 6:
                long j11 = this.d;
                ((MessagesStorage) obj2).lambda$loadPendingTasks$21(this.c, (TLRPC.InputPeer) obj, j11);
                break;
            case 7:
                ((MessagesStorage) obj2).lambda$getUnreadMention$156(this.c, this.d, (MessagesStorage.IntCallback) obj);
                break;
            case 8:
                ((NotificationsSettingsFacade) obj2).lambda$applyDialogNotificationsSettings$1(this.c, this.d, (TLRPC.PeerNotifySettings) obj);
                break;
            case 9:
                ((GroupCallMessagesController) obj2).lambda$processUpdate$3(this.c, this.d, (byte[]) obj);
                break;
            case 10:
                ((uo) obj2).d(this.c, this.d, (HashSet) obj);
                break;
            case 11:
                wy wyVar = (wy) obj2;
                ig1 ig1Var = (ig1) obj;
                if (wyVar.C2 == null) {
                    wyVar.finishFragment();
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j10, j3));
                    wyVar.C2.v(wyVar, arrayList, null, false, wyVar.J2, wyVar.K2, wyVar.L2, ig1Var);
                    if (wyVar.i2) {
                        wyVar.C2 = null;
                        break;
                    }
                }
                break;
            case 12:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                eo eoVar = (eo) obj;
                Pattern pattern = LaunchActivity.B1;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(launchActivity.O).getTopicsController().findTopic(j10, j3);
                StringBuilder t10 = a4.a.t(j10, "LaunchActivity openForum after load ", " ");
                t10.append(j3);
                t10.append(" TL_forumTopic ");
                t10.append(findTopic);
                FileLog.d(t10.toString());
                if (launchActivity.q0 != null) {
                    mg.d.a(eoVar, MessagesStorage.TopicKey.of(-j10, j3));
                    ((ActionBarLayout) launchActivity.O()).P(eoVar);
                    break;
                }
                break;
            case 13:
                x3.f0((x3) obj2, this.c, this.d, (Utilities.Callback) obj);
                break;
            default:
                long j12 = this.d;
                ((zh.m0) obj2).n(this.c, (TLRPC.TL_textWithEntities) obj, j12);
                break;
        }
    }

    public /* synthetic */ g0(Object obj, long j3, TLObject tLObject, long j10, int i10) {
        this.a = i10;
        this.e = obj;
        this.c = j3;
        this.b = tLObject;
        this.d = j10;
    }

    public /* synthetic */ g0(Object obj, Object obj2, long j3, long j10, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = obj2;
        this.c = j3;
        this.d = j10;
    }
}
