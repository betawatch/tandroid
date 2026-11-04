package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ge implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;
    public final /* synthetic */ org.telegram.messenger.zi c;

    public /* synthetic */ ge(wm wmVar, org.telegram.messenger.zi ziVar, int i3) {
        this.a = i3;
        this.b = wmVar;
        this.c = ziVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.WebPage webPage;
        int i3 = this.a;
        wm wmVar = this.b;
        org.telegram.messenger.zi ziVar = this.c;
        switch (i3) {
            case 0:
                TLRPC.MessageMedia messageMedia = ziVar.k.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.K1;
                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.K1.O().l(ziVar) == null) {
                        wmVar.createArticleViewer(false).L(ziVar, null, null, null);
                        break;
                    }
                }
                break;
            case 1:
                wmVar.getClass();
                TLRPC.Message message = ziVar.k;
                int i10 = message.ttl;
                boolean z10 = i10 != Integer.MAX_VALUE;
                int i11 = i10 == Integer.MAX_VALUE ? 0 : i10;
                message.destroyTime = wmVar.getConnectionsManager().getCurrentTime() + i11;
                ziVar.k.destroyTimeMillis = wmVar.getConnectionsManager().getCurrentTimeMillis() + (i11 * 1000);
                if (wmVar.h == null) {
                    wmVar.getMessagesController().q3(wmVar.k6, ziVar.f1(), null, i11, 0L, z10);
                    break;
                } else {
                    wmVar.getMessagesController().p3(wmVar.k6, i11, ziVar.k.random_id);
                    break;
                }
            case 2:
                int f12 = ziVar.f1();
                wm wmVar2 = this.b;
                wmVar2.xb(f12, 0, true, 0, true, 0, null, null, new tf(wmVar2, 13));
                if (wmVar2.y6.isEmpty()) {
                    wmVar2.oc(false);
                    break;
                }
                break;
            case 3:
                wm wmVar3 = this.b;
                wmVar3.getClass();
                int O1 = ziVar.O1();
                TLRPC.Message message2 = ziVar.k;
                wmVar3.xb(O1, message2.id, true, org.telegram.messenger.zi.B0(message2) == wmVar3.c7 ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) ziVar.k.action).answer.option, null);
                break;
            case 4:
                wm wmVar4 = this.b;
                wmVar4.getClass();
                int O12 = ziVar.O1();
                TLRPC.Message message3 = ziVar.k;
                wmVar4.xb(O12, message3.id, true, org.telegram.messenger.zi.B0(message3) == wmVar4.c7 ? 1 : 0, false, 0, null, null, null);
                break;
            case 5:
                wm wmVar5 = this.b;
                wmVar5.getClass();
                int O13 = ziVar.O1();
                TLRPC.Message message4 = ziVar.k;
                wmVar5.l(O13, message4.id, true, org.telegram.messenger.zi.B0(message4) == wmVar5.c7 ? 1 : 0, false, 0);
                break;
            case 6:
                if (!org.telegram.messenger.zi.M4(ziVar.k)) {
                    MediaController.B().S(ziVar);
                    break;
                } else {
                    wmVar.Ha(null, ziVar);
                    break;
                }
            case 7:
                wmVar.getMessagesController().C3(wmVar.e, wmVar.f, ziVar.f1(), true, false, false);
                wmVar.P3 = null;
                break;
            default:
                org.telegram.ui.Components.fc.a0(wmVar).c(org.telegram.messenger.bd.M0(2131754488, null)).j();
                wmVar.eb(ziVar);
                wmVar.gb(ziVar);
                break;
        }
    }
}
