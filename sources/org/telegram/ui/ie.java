package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ie implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ org.telegram.messenger.ij c;

    public /* synthetic */ ie(an anVar, org.telegram.messenger.ij ijVar, int i7) {
        this.a = i7;
        this.b = anVar;
        this.c = ijVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.WebPage webPage;
        int i7 = this.a;
        an anVar = this.b;
        org.telegram.messenger.ij ijVar = this.c;
        switch (i7) {
            case 0:
                TLRPC.MessageMedia messageMedia = ijVar.k.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.G1.O().l(ijVar) == null) {
                        anVar.createArticleViewer(false).L(ijVar, null, null, null);
                        break;
                    }
                }
                break;
            case 1:
                anVar.getClass();
                TLRPC.Message message = ijVar.k;
                int i10 = message.ttl;
                boolean z9 = i10 != Integer.MAX_VALUE;
                int i11 = i10 == Integer.MAX_VALUE ? 0 : i10;
                message.destroyTime = anVar.getConnectionsManager().getCurrentTime() + i11;
                ijVar.k.destroyTimeMillis = anVar.getConnectionsManager().getCurrentTimeMillis() + (i11 * 1000);
                if (anVar.h == null) {
                    anVar.getMessagesController().q3(anVar.j6, ijVar.f1(), null, i11, 0L, z9);
                    break;
                } else {
                    anVar.getMessagesController().p3(anVar.j6, i11, ijVar.k.random_id);
                    break;
                }
            case 2:
                int f12 = ijVar.f1();
                an anVar2 = this.b;
                anVar2.xb(f12, 0, true, 0, true, 0, null, null, new xf(anVar2, 13));
                if (anVar2.x6.isEmpty()) {
                    anVar2.oc(false);
                    break;
                }
                break;
            case 3:
                an anVar3 = this.b;
                anVar3.getClass();
                int O1 = ijVar.O1();
                TLRPC.Message message2 = ijVar.k;
                anVar3.xb(O1, message2.id, true, org.telegram.messenger.ij.B0(message2) == anVar3.b7 ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) ijVar.k.action).answer.option, null);
                break;
            case 4:
                an anVar4 = this.b;
                anVar4.getClass();
                int O12 = ijVar.O1();
                TLRPC.Message message3 = ijVar.k;
                anVar4.xb(O12, message3.id, true, org.telegram.messenger.ij.B0(message3) == anVar4.b7 ? 1 : 0, false, 0, null, null, null);
                break;
            case 5:
                an anVar5 = this.b;
                anVar5.getClass();
                int O13 = ijVar.O1();
                TLRPC.Message message4 = ijVar.k;
                anVar5.l(O13, message4.id, true, org.telegram.messenger.ij.B0(message4) == anVar5.b7 ? 1 : 0, false, 0);
                break;
            case 6:
                if (!org.telegram.messenger.ij.M4(ijVar.k)) {
                    MediaController.B().S(ijVar);
                    break;
                } else {
                    anVar.Ha(null, ijVar);
                    break;
                }
            case 7:
                anVar.getMessagesController().C3(anVar.e, anVar.f, ijVar.f1(), true, false, false);
                anVar.O3 = null;
                break;
            default:
                org.telegram.ui.Components.hc.a0(anVar).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                anVar.eb(ijVar);
                anVar.gb(ijVar);
                break;
        }
    }
}
