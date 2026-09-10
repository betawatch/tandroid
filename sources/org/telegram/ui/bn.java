package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class bn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pn b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ bn(pn pnVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = pnVar;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pn pnVar = this.b;
                eo eoVar = pnVar.a;
                eoVar.Q7();
                UndoView undoView = eoVar.y3;
                if (undoView != null) {
                    int i10 = (eoVar.Y.getVisibility() != 0 || eoVar.R.getVisibility() == 0) ? 17 : 16;
                    MessageObject messageObject = this.c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new bn(pnVar, messageObject, 2));
                    break;
                }
                break;
            case 1:
                eo eoVar2 = this.b.a;
                eoVar2.wb = this.c.getId();
                eoVar2.xb = 0;
                break;
            default:
                eo eoVar3 = this.b.a;
                if (eoVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.c.getDiceEmoji(), eoVar3.T5, eoVar3.n5, eoVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = eoVar3.C8();
                    eoVar3.getSendMessagesHelper().sendMessage(of2);
                    break;
                }
                break;
        }
    }
}
