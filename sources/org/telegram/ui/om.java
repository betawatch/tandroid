package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class om implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ om(cn cnVar, MessageObject messageObject, int i9) {
        this.a = i9;
        this.b = cnVar;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cn cnVar = this.b;
                qn qnVar = cnVar.a;
                qnVar.Q7();
                UndoView undoView = qnVar.u3;
                if (undoView != null) {
                    int i9 = (qnVar.U.getVisibility() != 0 || qnVar.N.getVisibility() == 0) ? 17 : 16;
                    MessageObject messageObject = this.c;
                    undoView.k(0L, i9, messageObject.getDiceEmoji(), null, null, new om(cnVar, messageObject, 2));
                    break;
                }
                break;
            case 1:
                qn qnVar2 = this.b.a;
                qnVar2.sb = this.c.getId();
                qnVar2.tb = 0;
                break;
            default:
                qn qnVar3 = this.b.a;
                if (qnVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.c.getDiceEmoji(), qnVar3.P5, qnVar3.j5, qnVar3.T3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = qnVar3.C8();
                    qnVar3.getSendMessagesHelper().sendMessage(of2);
                    break;
                }
                break;
        }
    }
}
