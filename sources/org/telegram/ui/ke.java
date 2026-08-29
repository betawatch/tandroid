package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ ke(tn tnVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = tnVar;
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
                    LaunchActivity launchActivity = LaunchActivity.C1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().k(messageObject) == null) {
                        this.b.createArticleViewer(false).N(messageObject, null, null, null);
                        break;
                    }
                }
                break;
            case 1:
                tn tnVar = this.b;
                tnVar.getClass();
                MessageObject messageObject2 = this.c;
                TLRPC.Message message = messageObject2.messageOwner;
                int i10 = message.ttl;
                boolean z10 = i10 != Integer.MAX_VALUE;
                int i11 = i10 == Integer.MAX_VALUE ? 0 : i10;
                message.destroyTime = tnVar.getConnectionsManager().getCurrentTime() + i11;
                messageObject2.messageOwner.destroyTimeMillis = tnVar.getConnectionsManager().getCurrentTimeMillis() + (i11 * 1000);
                if (tnVar.h == null) {
                    tnVar.getMessagesController().markMessageAsRead2(tnVar.P5, messageObject2.getId(), null, i11, 0L, z10);
                    break;
                } else {
                    tnVar.getMessagesController().markMessageAsRead(tnVar.P5, messageObject2.messageOwner.random_id, i11);
                    break;
                }
            case 2:
                int id2 = this.c.getId();
                tn tnVar2 = this.b;
                tnVar2.Xa(id2, 0, true, 0, true, 0, null, null, new ig(tnVar2, 13));
                if (tnVar2.d6.isEmpty()) {
                    tnVar2.Lb(false);
                    break;
                }
                break;
            case 3:
                tn tnVar3 = this.b;
                tnVar3.getClass();
                MessageObject messageObject3 = this.c;
                tnVar3.Xa(messageObject3.getReplyMsgId(), messageObject3.messageOwner.id, true, messageObject3.getDialogId() == tnVar3.H6 ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                break;
            case 4:
                tn tnVar4 = this.b;
                tnVar4.getClass();
                MessageObject messageObject4 = this.c;
                tnVar4.Xa(messageObject4.getReplyMsgId(), messageObject4.messageOwner.id, true, messageObject4.getDialogId() == tnVar4.H6 ? 1 : 0, false, 0, null, null, null);
                break;
            case 5:
                tn tnVar5 = this.b;
                tnVar5.getClass();
                MessageObject messageObject5 = this.c;
                tnVar5.j(messageObject5.getReplyMsgId(), messageObject5.messageOwner.id, true, messageObject5.getDialogId() == tnVar5.H6 ? 1 : 0, false, 0);
                break;
            case 6:
                tn tnVar6 = this.b;
                tnVar6.getClass();
                MessageObject messageObject6 = this.c;
                if (!messageObject6.isVideo()) {
                    MediaController.getInstance().playMessage(messageObject6);
                    break;
                } else {
                    tnVar6.ha(null, messageObject6);
                    break;
                }
            case 7:
                tn tnVar7 = this.b;
                tnVar7.getMessagesController().pinMessage(tnVar7.e, tnVar7.f, this.c.getId(), true, false, false);
                tnVar7.w3 = null;
                break;
            default:
                tn tnVar8 = this.b;
                org.telegram.ui.Components.tc.a0(tnVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.c;
                tnVar8.Fa(messageObject7);
                tnVar8.Ha(messageObject7);
                break;
        }
    }
}
