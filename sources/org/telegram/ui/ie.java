package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ie implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ org.telegram.messenger.ij c;

    public /* synthetic */ ie(cn cnVar, org.telegram.messenger.ij ijVar, int i7) {
        this.a = i7;
        this.b = cnVar;
        this.c = ijVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.WebPage webPage;
        int i7 = this.a;
        cn cnVar = this.b;
        org.telegram.messenger.ij ijVar = this.c;
        switch (i7) {
            case 0:
                TLRPC.MessageMedia messageMedia = ijVar.k.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.G1.O().l(ijVar) == null) {
                        cnVar.createArticleViewer(false).L(ijVar, null, null, null);
                        break;
                    }
                }
                break;
            case 1:
                cnVar.getClass();
                TLRPC.Message message = ijVar.k;
                int i10 = message.ttl;
                boolean z9 = i10 != Integer.MAX_VALUE;
                int i11 = i10 == Integer.MAX_VALUE ? 0 : i10;
                message.destroyTime = cnVar.getConnectionsManager().getCurrentTime() + i11;
                ijVar.k.destroyTimeMillis = cnVar.getConnectionsManager().getCurrentTimeMillis() + (i11 * 1000);
                if (cnVar.h == null) {
                    cnVar.getMessagesController().q3(cnVar.j6, ijVar.e1(), null, i11, 0L, z9);
                    break;
                } else {
                    cnVar.getMessagesController().p3(cnVar.j6, i11, ijVar.k.random_id);
                    break;
                }
            case 2:
                int e12 = ijVar.e1();
                cn cnVar2 = this.b;
                cnVar2.Ab(e12, 0, true, 0, true, 0, null, null, new xf(cnVar2, 12));
                if (cnVar2.x6.isEmpty()) {
                    cnVar2.rc(false);
                    break;
                }
                break;
            case 3:
                cn cnVar3 = this.b;
                cnVar3.getClass();
                int N1 = ijVar.N1();
                TLRPC.Message message2 = ijVar.k;
                cnVar3.Ab(N1, message2.id, true, org.telegram.messenger.ij.B0(message2) == cnVar3.b7 ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) ijVar.k.action).answer.option, null);
                break;
            case 4:
                cn cnVar4 = this.b;
                cnVar4.getClass();
                int N12 = ijVar.N1();
                TLRPC.Message message3 = ijVar.k;
                cnVar4.Ab(N12, message3.id, true, org.telegram.messenger.ij.B0(message3) == cnVar4.b7 ? 1 : 0, false, 0, null, null, null);
                break;
            case 5:
                cn cnVar5 = this.b;
                cnVar5.getClass();
                int N13 = ijVar.N1();
                TLRPC.Message message4 = ijVar.k;
                cnVar5.l(N13, message4.id, true, org.telegram.messenger.ij.B0(message4) == cnVar5.b7 ? 1 : 0, false, 0);
                break;
            case 6:
                if (!org.telegram.messenger.ij.L4(ijVar.k)) {
                    MediaController.B().S(ijVar);
                    break;
                } else {
                    cnVar.Ja(null, ijVar);
                    break;
                }
            case 7:
                cnVar.getMessagesController().C3(cnVar.e, cnVar.f, ijVar.e1(), true, false, false);
                cnVar.O3 = null;
                break;
            default:
                org.telegram.ui.Components.gc.a0(cnVar).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                cnVar.hb(ijVar);
                cnVar.jb(ijVar);
                break;
        }
    }
}
