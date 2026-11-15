package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class fe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ org.telegram.messenger.gj c;

    public /* synthetic */ fe(an anVar, org.telegram.messenger.gj gjVar, int i7) {
        this.a = i7;
        this.b = anVar;
        this.c = gjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.WebPage webPage;
        int i7 = this.a;
        an anVar = this.b;
        org.telegram.messenger.gj gjVar = this.c;
        switch (i7) {
            case 0:
                TLRPC.MessageMedia messageMedia = gjVar.k.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(gjVar) == null) {
                        anVar.createArticleViewer(false).L(gjVar, null, null, null);
                        break;
                    }
                }
                break;
            case 1:
                anVar.getClass();
                TLRPC.Message message = gjVar.k;
                int i10 = message.ttl;
                boolean z10 = i10 != Integer.MAX_VALUE;
                int i11 = i10 == Integer.MAX_VALUE ? 0 : i10;
                message.destroyTime = anVar.getConnectionsManager().getCurrentTime() + i11;
                gjVar.k.destroyTimeMillis = anVar.getConnectionsManager().getCurrentTimeMillis() + (i11 * 1000);
                if (anVar.h == null) {
                    anVar.getMessagesController().q3(anVar.k6, gjVar.e1(), null, i11, 0L, z10);
                    break;
                } else {
                    anVar.getMessagesController().p3(anVar.k6, i11, gjVar.k.random_id);
                    break;
                }
            case 2:
                int e12 = gjVar.e1();
                an anVar2 = this.b;
                anVar2.Bb(e12, 0, true, 0, true, 0, null, null, new uf(anVar2, 12));
                if (anVar2.y6.isEmpty()) {
                    anVar2.sc(false);
                    break;
                }
                break;
            case 3:
                an anVar3 = this.b;
                anVar3.getClass();
                int N1 = gjVar.N1();
                TLRPC.Message message2 = gjVar.k;
                anVar3.Bb(N1, message2.id, true, org.telegram.messenger.gj.B0(message2) == anVar3.c7 ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) gjVar.k.action).answer.option, null);
                break;
            case 4:
                an anVar4 = this.b;
                anVar4.getClass();
                int N12 = gjVar.N1();
                TLRPC.Message message3 = gjVar.k;
                anVar4.Bb(N12, message3.id, true, org.telegram.messenger.gj.B0(message3) == anVar4.c7 ? 1 : 0, false, 0, null, null, null);
                break;
            case 5:
                an anVar5 = this.b;
                anVar5.getClass();
                int N13 = gjVar.N1();
                TLRPC.Message message4 = gjVar.k;
                anVar5.l(N13, message4.id, true, org.telegram.messenger.gj.B0(message4) == anVar5.c7 ? 1 : 0, false, 0);
                break;
            case 6:
                anVar.getMessagesController().C3(anVar.e, anVar.f, gjVar.e1(), true, false, false);
                anVar.P3 = null;
                break;
            case 7:
                if (!org.telegram.messenger.gj.L4(gjVar.k)) {
                    MediaController.B().S(gjVar);
                    break;
                } else {
                    anVar.Ka(null, gjVar);
                    break;
                }
            default:
                org.telegram.ui.Components.cc.a0(anVar).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                anVar.ib(gjVar);
                anVar.kb(gjVar);
                break;
        }
    }
}
