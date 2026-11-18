package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class he implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ org.telegram.messenger.fj c;

    public /* synthetic */ he(bn bnVar, org.telegram.messenger.fj fjVar, int i7) {
        this.a = i7;
        this.b = bnVar;
        this.c = fjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.WebPage webPage;
        int i7 = this.a;
        bn bnVar = this.b;
        org.telegram.messenger.fj fjVar = this.c;
        switch (i7) {
            case 0:
                TLRPC.MessageMedia messageMedia = fjVar.k.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(fjVar) == null) {
                        bnVar.createArticleViewer(false).L(fjVar, null, null, null);
                        break;
                    }
                }
                break;
            case 1:
                bnVar.getClass();
                TLRPC.Message message = fjVar.k;
                int i10 = message.ttl;
                boolean z10 = i10 != Integer.MAX_VALUE;
                int i11 = i10 == Integer.MAX_VALUE ? 0 : i10;
                message.destroyTime = bnVar.getConnectionsManager().getCurrentTime() + i11;
                fjVar.k.destroyTimeMillis = bnVar.getConnectionsManager().getCurrentTimeMillis() + (i11 * 1000);
                if (bnVar.h == null) {
                    bnVar.getMessagesController().x3(bnVar.l6, fjVar.e1(), null, i11, 0L, z10);
                    break;
                } else {
                    bnVar.getMessagesController().w3(bnVar.l6, i11, fjVar.k.random_id);
                    break;
                }
            case 2:
                int e12 = fjVar.e1();
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
                int N1 = fjVar.N1();
                TLRPC.Message message2 = fjVar.k;
                bnVar3.Bb(N1, message2.id, true, org.telegram.messenger.fj.B0(message2) == bnVar3.d7 ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) fjVar.k.action).answer.option, null);
                break;
            case 4:
                bn bnVar4 = this.b;
                bnVar4.getClass();
                int N12 = fjVar.N1();
                TLRPC.Message message3 = fjVar.k;
                bnVar4.Bb(N12, message3.id, true, org.telegram.messenger.fj.B0(message3) == bnVar4.d7 ? 1 : 0, false, 0, null, null, null);
                break;
            case 5:
                bn bnVar5 = this.b;
                bnVar5.getClass();
                int N13 = fjVar.N1();
                TLRPC.Message message4 = fjVar.k;
                bnVar5.l(N13, message4.id, true, org.telegram.messenger.fj.B0(message4) == bnVar5.d7 ? 1 : 0, false, 0);
                break;
            case 6:
                bnVar.getMessagesController().J3(bnVar.e, bnVar.f, fjVar.e1(), true, false, false);
                bnVar.P3 = null;
                break;
            case 7:
                if (!org.telegram.messenger.fj.L4(fjVar.k)) {
                    MediaController.B().S(fjVar);
                    break;
                } else {
                    bnVar.Ka(null, fjVar);
                    break;
                }
            default:
                org.telegram.ui.Components.lc.b0(bnVar).c(org.telegram.messenger.gd.M0(2131754486, null)).j();
                bnVar.ib(fjVar);
                bnVar.kb(fjVar);
                break;
        }
    }
}
