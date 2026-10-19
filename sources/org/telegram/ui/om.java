package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class om implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ om(cn cnVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = cnVar;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cn cnVar = this.b;
                qn qnVar = cnVar.a;
                qnVar.T7();
                UndoView undoView = qnVar.y3;
                if (undoView != null) {
                    int i10 = (qnVar.Y.getVisibility() != 0 || qnVar.R.getVisibility() == 0) ? 17 : 16;
                    MessageObject messageObject = this.c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new om(cnVar, messageObject, 2));
                    break;
                }
                break;
            case 1:
                qn qnVar2 = this.b.a;
                qnVar2.wb = this.c.getId();
                qnVar2.xb = 0;
                break;
            default:
                qn qnVar3 = this.b.a;
                if (qnVar3.i7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.c.getDiceEmoji(), qnVar3.T5, qnVar3.n5, qnVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = qnVar3.H8();
                    qnVar3.getSendMessagesHelper().sendMessage(of2);
                    break;
                }
                break;
        }
    }
}
