package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class he implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ org.telegram.messenger.gj c;

    public /* synthetic */ he(bn bnVar, org.telegram.messenger.gj gjVar, int i7) {
        this.a = i7;
        this.b = bnVar;
        this.c = gjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.WebPage webPage;
        int i7 = this.a;
        bn bnVar = this.b;
        org.telegram.messenger.gj gjVar = this.c;
        switch (i7) {
            case 0:
                TLRPC.MessageMedia messageMedia = gjVar.k.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(gjVar) == null) {
                        bnVar.createArticleViewer(false).L(gjVar, null, null, null);
                        break;
                    }
                }
                break;
            case 1:
                bnVar.getClass();
                TLRPC.Message message = gjVar.k;
                int i10 = message.ttl;
                boolean z10 = i10 != Integer.MAX_VALUE;
                int i11 = i10 == Integer.MAX_VALUE ? 0 : i10;
                message.destroyTime = bnVar.getConnectionsManager().getCurrentTime() + i11;
                gjVar.k.destroyTimeMillis = bnVar.getConnectionsManager().getCurrentTimeMillis() + (i11 * 1000);
                if (bnVar.h == null) {
                    bnVar.getMessagesController().x3(bnVar.l6, gjVar.e1(), null, i11, 0L, z10);
                    break;
                } else {
                    bnVar.getMessagesController().w3(bnVar.l6, i11, gjVar.k.random_id);
                    break;
                }
            case 2:
                int e12 = gjVar.e1();
                bn bnVar2 = this.b;
                bnVar2.Bb(e12, 0, true, 0, true, 0, null, null, new vf(bnVar2, 11));
                if (bnVar2.z6.isEmpty()) {
                    bnVar2.sc(false);
                    break;
                }
                break;
            case 3:
                bn bnVar3 = this.b;
                bnVar3.getClass();
                int N1 = gjVar.N1();
                TLRPC.Message message2 = gjVar.k;
                bnVar3.Bb(N1, message2.id, true, org.telegram.messenger.gj.B0(message2) == bnVar3.d7 ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) gjVar.k.action).answer.option, null);
                break;
            case 4:
                bn bnVar4 = this.b;
                bnVar4.getClass();
                int N12 = gjVar.N1();
                TLRPC.Message message3 = gjVar.k;
                bnVar4.Bb(N12, message3.id, true, org.telegram.messenger.gj.B0(message3) == bnVar4.d7 ? 1 : 0, false, 0, null, null, null);
                break;
            case 5:
                bn bnVar5 = this.b;
                bnVar5.getClass();
                int N13 = gjVar.N1();
                TLRPC.Message message4 = gjVar.k;
                bnVar5.l(N13, message4.id, true, org.telegram.messenger.gj.B0(message4) == bnVar5.d7 ? 1 : 0, false, 0);
                break;
            case 6:
                bnVar.getMessagesController().J3(bnVar.e, bnVar.f, gjVar.e1(), true, false, false);
                bnVar.P3 = null;
                break;
            case 7:
                if (!org.telegram.messenger.gj.L4(gjVar.k)) {
                    MediaController.B().S(gjVar);
                    break;
                } else {
                    bnVar.Ka(null, gjVar);
                    break;
                }
            default:
                org.telegram.ui.Components.lc.b0(bnVar).c(org.telegram.messenger.hd.N0(2131754485, null)).j();
                bnVar.ib(gjVar);
                bnVar.kb(gjVar);
                break;
        }
    }
}
