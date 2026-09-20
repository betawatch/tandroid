package a3;

import ai.o1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLoader;
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
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.po;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fg1;
import org.telegram.ui.uy;
import org.telegram.ui.zn;
import yh.y3;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        switch (this.a) {
            case 0:
                of.b bVar = (of.b) this.d;
                String str = (String) this.e;
                long j3 = this.b;
                long j10 = this.c;
                l0 l0Var = (l0) bVar.c;
                String str2 = e2.d0.a;
                j2.f fVar = ((i2.b0) l0Var).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1016, new j2.c(p5, str, j10, j3));
                return;
            case 1:
                ((o1) this.d).n(this.b, (TLRPC.TL_textWithEntities) this.e, this.c);
                return;
            case 2:
                n4.y yVar = (n4.y) this.d;
                String str3 = (String) this.e;
                long j11 = this.b;
                long j12 = this.c;
                k2.j jVar = (k2.j) yVar.b;
                String str4 = e2.d0.a;
                j2.f fVar2 = ((i2.b0) jVar).a.s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1008, new ga.a(p10, str3, j12, j11));
                return;
            case 3:
                ki.o0 o0Var = (ki.o0) this.d;
                ki.k0 k0Var = (ki.k0) this.e;
                long j13 = this.b;
                long j14 = this.c;
                ki.l0 l0Var2 = o0Var.d;
                long j15 = k0Var.a;
                File file = k0Var.b;
                p01 p01Var = (p01) l0Var2;
                synchronized (p01Var) {
                    n01 n01Var = (n01) p01Var.c.get(Long.valueOf(j15));
                    if (!p01Var.d && n01Var != null && !n01Var.e) {
                        p01Var.c(n01Var);
                        n01Var.b = Math.max(n01Var.b, j13 + j14);
                        FileLoader.getInstance(p01Var.a).checkUploadNewDataAvailable(file.getAbsolutePath(), p01Var.b, n01Var.b, 0L);
                        return;
                    }
                    return;
                }
            case 4:
                ((FileUploadOperation) this.d).lambda$checkNewDataAvailable$4((Float) this.e, this.b, this.c);
                return;
            case 5:
                ((MediaDataController) this.d).lambda$loadPinnedMessages$163(this.b, this.c, (ArrayList) this.e);
                return;
            case 6:
                ((MediaDataController) this.d).lambda$saveDraftReplyMessage$192(this.b, this.c, (TLRPC.Message) this.e);
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
                ((po) this.d).d(this.b, this.c, (HashSet) this.e);
                return;
            case 14:
                uy uyVar = (uy) this.d;
                long j16 = this.b;
                long j17 = this.c;
                fg1 fg1Var = (fg1) this.e;
                if (uyVar.C2 == null) {
                    uyVar.finishFragment();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j16, j17));
                uyVar.C2.u(uyVar, arrayList, null, false, uyVar.J2, uyVar.K2, uyVar.L2, fg1Var);
                if (uyVar.i2) {
                    uyVar.C2 = null;
                    return;
                }
                return;
            case 15:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                long j18 = this.b;
                long j19 = this.c;
                zn znVar = (zn) this.e;
                Pattern pattern = LaunchActivity.B1;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(launchActivity.O).getTopicsController().findTopic(j18, j19);
                StringBuilder t10 = a4.a.t(j18, "LaunchActivity openForum after load ", " ");
                t10.append(j19);
                t10.append(" TL_forumTopic ");
                t10.append(findTopic);
                FileLog.d(t10.toString());
                if (launchActivity.q0 != null) {
                    ng.d.a(znVar, MessagesStorage.TopicKey.of(-j18, j19));
                    ((ActionBarLayout) launchActivity.O()).P(znVar);
                    return;
                }
                return;
            default:
                y3.f0((y3) this.d, this.b, this.c, (Utilities.Callback) this.e);
                return;
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
