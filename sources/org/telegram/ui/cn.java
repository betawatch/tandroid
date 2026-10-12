package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class cn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ cn(qn qnVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = qnVar;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qn qnVar = this.b;
                fo foVar = qnVar.a;
                foVar.T7();
                UndoView undoView = foVar.y3;
                if (undoView != null) {
                    int i10 = (foVar.Y.getVisibility() != 0 || foVar.R.getVisibility() == 0) ? 17 : 16;
                    MessageObject messageObject = this.c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new cn(qnVar, messageObject, 2));
                    break;
                }
                break;
            case 1:
                fo foVar2 = this.b.a;
                foVar2.wb = this.c.getId();
                foVar2.xb = 0;
                break;
            default:
                fo foVar3 = this.b.a;
                if (foVar3.i7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.c.getDiceEmoji(), foVar3.T5, foVar3.n5, foVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = foVar3.H8();
                    foVar3.getSendMessagesHelper().sendMessage(of2);
                    break;
                }
                break;
        }
    }
}
