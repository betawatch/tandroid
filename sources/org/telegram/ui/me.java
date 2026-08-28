package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class me implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ me(qn qnVar, MessageObject messageObject, int i9) {
        this.a = i9;
        this.b = qnVar;
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
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().l(messageObject) == null) {
                        this.b.createArticleViewer(false).N(messageObject, null, null, null);
                        break;
                    }
                }
                break;
            case 1:
                qn qnVar = this.b;
                qnVar.getClass();
                MessageObject messageObject2 = this.c;
                TLRPC.Message message = messageObject2.messageOwner;
                int i9 = message.ttl;
                boolean z10 = i9 != Integer.MAX_VALUE;
                int i10 = i9 == Integer.MAX_VALUE ? 0 : i9;
                message.destroyTime = qnVar.getConnectionsManager().getCurrentTime() + i10;
                messageObject2.messageOwner.destroyTimeMillis = qnVar.getConnectionsManager().getCurrentTimeMillis() + (i10 * 1000);
                if (qnVar.h == null) {
                    qnVar.getMessagesController().markMessageAsRead2(qnVar.P5, messageObject2.getId(), null, i10, 0L, z10);
                    break;
                } else {
                    qnVar.getMessagesController().markMessageAsRead(qnVar.P5, messageObject2.messageOwner.random_id, i10);
                    break;
                }
            case 2:
                int id2 = this.c.getId();
                qn qnVar2 = this.b;
                qnVar2.Xa(id2, 0, true, 0, true, 0, null, null, new jg(qnVar2, 13));
                if (qnVar2.d6.isEmpty()) {
                    qnVar2.Lb(false);
                    break;
                }
                break;
            case 3:
                qn qnVar3 = this.b;
                qnVar3.getClass();
                MessageObject messageObject3 = this.c;
                qnVar3.Xa(messageObject3.getReplyMsgId(), messageObject3.messageOwner.id, true, messageObject3.getDialogId() == qnVar3.H6 ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                break;
            case 4:
                qn qnVar4 = this.b;
                qnVar4.getClass();
                MessageObject messageObject4 = this.c;
                qnVar4.Xa(messageObject4.getReplyMsgId(), messageObject4.messageOwner.id, true, messageObject4.getDialogId() == qnVar4.H6 ? 1 : 0, false, 0, null, null, null);
                break;
            case 5:
                qn qnVar5 = this.b;
                qnVar5.getClass();
                MessageObject messageObject5 = this.c;
                qnVar5.j(messageObject5.getReplyMsgId(), messageObject5.messageOwner.id, true, messageObject5.getDialogId() == qnVar5.H6 ? 1 : 0, false, 0);
                break;
            case 6:
                qn qnVar6 = this.b;
                qnVar6.getClass();
                MessageObject messageObject6 = this.c;
                if (!messageObject6.isVideo()) {
                    MediaController.getInstance().playMessage(messageObject6);
                    break;
                } else {
                    qnVar6.ha(null, messageObject6);
                    break;
                }
            case 7:
                qn qnVar7 = this.b;
                qnVar7.getMessagesController().pinMessage(qnVar7.e, qnVar7.f, this.c.getId(), true, false, false);
                qnVar7.w3 = null;
                break;
            default:
                qn qnVar8 = this.b;
                org.telegram.ui.Components.oc.a0(qnVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.c;
                qnVar8.Fa(messageObject7);
                qnVar8.Ha(messageObject7);
                break;
        }
    }
}
