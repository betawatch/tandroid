package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                sn snVar = dnVar.a;
                snVar.T7();
                UndoView undoView = snVar.K3;
                if (undoView != null) {
                    int i10 = (snVar.Y.getVisibility() != 0 || snVar.R.getVisibility() == 0) ? 17 : 16;
                    MessageObject messageObject = this.c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new pm(dnVar, messageObject, 2));
                    break;
                }
                break;
            case 1:
                sn snVar2 = this.b.a;
                snVar2.Jb = this.c.getId();
                snVar2.Kb = 0;
                break;
            default:
                sn snVar3 = this.b.a;
                if (snVar3.i7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.c.getDiceEmoji(), snVar3.f6, snVar3.z5, snVar3.j4, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = snVar3.H8();
                    snVar3.getSendMessagesHelper().sendMessage(of2);
                    break;
                }
                break;
        }
    }
}
