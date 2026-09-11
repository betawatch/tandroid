package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class an implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ on b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ an(on onVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = onVar;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                on onVar = this.b;
                co coVar = onVar.a;
                coVar.Q7();
                UndoView undoView = coVar.y3;
                if (undoView != null) {
                    int i10 = (coVar.Y.getVisibility() != 0 || coVar.R.getVisibility() == 0) ? 17 : 16;
                    MessageObject messageObject = this.c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new an(onVar, messageObject, 2));
                    break;
                }
                break;
            case 1:
                co coVar2 = this.b.a;
                coVar2.wb = this.c.getId();
                coVar2.xb = 0;
                break;
            default:
                co coVar3 = this.b.a;
                if (coVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.c.getDiceEmoji(), coVar3.T5, coVar3.n5, coVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = coVar3.C8();
                    coVar3.getSendMessagesHelper().sendMessage(of2);
                    break;
                }
                break;
        }
    }
}
