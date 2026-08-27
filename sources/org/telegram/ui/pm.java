package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dn b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ pm(dn dnVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = dnVar;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dn dnVar = this.b;
                rn rnVar = dnVar.a;
                rnVar.Q7();
                UndoView undoView = rnVar.u3;
                if (undoView != null) {
                    int i10 = (rnVar.U.getVisibility() != 0 || rnVar.N.getVisibility() == 0) ? 17 : 16;
                    MessageObject messageObject = this.c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new pm(dnVar, messageObject, 2));
                    break;
                }
                break;
            case 1:
                rn rnVar2 = this.b.a;
                rnVar2.sb = this.c.getId();
                rnVar2.tb = 0;
                break;
            default:
                rn rnVar3 = this.b.a;
                if (rnVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.c.getDiceEmoji(), rnVar3.P5, rnVar3.j5, rnVar3.T3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = rnVar3.C8();
                    rnVar3.getSendMessagesHelper().sendMessage(of2);
                    break;
                }
                break;
        }
    }
}
