package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class bf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ bf(fo foVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = foVar;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.WebPage webPage;
        switch (this.a) {
            case 0:
                MessageObject messageObject = this.c;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                        this.b.createArticleViewer(false).N(messageObject, null, null, null);
                        break;
                    }
                }
                break;
            case 1:
                fo foVar = this.b;
                foVar.getClass();
                MessageObject messageObject2 = this.c;
                TLRPC.Message message = messageObject2.messageOwner;
                int i10 = message.ttl;
                boolean z10 = i10 != Integer.MAX_VALUE;
                int i11 = i10 == Integer.MAX_VALUE ? 0 : i10;
                message.destroyTime = foVar.getConnectionsManager().getCurrentTime() + i11;
                messageObject2.messageOwner.destroyTimeMillis = foVar.getConnectionsManager().getCurrentTimeMillis() + (i11 * 1000);
                if (foVar.h == null) {
                    foVar.getMessagesController().markMessageAsRead2(foVar.T5, messageObject2.getId(), null, i11, 0L, z10);
                    break;
                } else {
                    foVar.getMessagesController().markMessageAsRead(foVar.T5, messageObject2.messageOwner.random_id, i11);
                    break;
                }
            case 2:
                fo foVar2 = this.b;
                foVar2.getClass();
                MessageObject messageObject3 = this.c;
                foVar2.bb(messageObject3.getReplyMsgId(), messageObject3.messageOwner.id, true, messageObject3.getDialogId() == foVar2.L6 ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                break;
            case 3:
                fo foVar3 = this.b;
                foVar3.getClass();
                MessageObject messageObject4 = this.c;
                foVar3.bb(messageObject4.getReplyMsgId(), messageObject4.messageOwner.id, true, messageObject4.getDialogId() == foVar3.L6 ? 1 : 0, false, 0, null, null, null);
                break;
            case 4:
                fo foVar4 = this.b;
                foVar4.getClass();
                MessageObject messageObject5 = this.c;
                foVar4.j(messageObject5.getReplyMsgId(), messageObject5.messageOwner.id, true, messageObject5.getDialogId() == foVar4.L6 ? 1 : 0, false, 0);
                break;
            case 5:
                int id2 = this.c.getId();
                fo foVar5 = this.b;
                foVar5.bb(id2, 0, true, 0, true, 0, null, null, new wf(foVar5, 23));
                if (foVar5.h6.isEmpty()) {
                    foVar5.Pb(false);
                    break;
                }
                break;
            case 6:
                fo foVar6 = this.b;
                foVar6.getClass();
                MessageObject messageObject6 = this.c;
                if (!messageObject6.isVideo()) {
                    MediaController.getInstance().playMessage(messageObject6);
                    break;
                } else {
                    foVar6.ma(null, messageObject6);
                    break;
                }
            case 7:
                fo foVar7 = this.b;
                foVar7.getMessagesController().pinMessage(foVar7.e, foVar7.f, this.c.getId(), true, false, false);
                foVar7.A3 = null;
                break;
            default:
                fo foVar8 = this.b;
                org.telegram.ui.Components.zc.a0(foVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.c;
                foVar8.Ja(messageObject7);
                foVar8.La(messageObject7);
                break;
        }
    }
}
