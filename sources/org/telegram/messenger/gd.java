package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class gd implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ od b;

    public /* synthetic */ gd(od odVar, int i10) {
        this.a = i10;
        this.b = odVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                od odVar = this.b;
                if (tL_error == null) {
                    odVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    odVar.getClass();
                    break;
                }
            case 1:
                od odVar2 = this.b;
                if (tL_error == null) {
                    odVar2.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    odVar2.getClass();
                    break;
                }
            default:
                boolean z10 = tLObject instanceof TLRPC.TL_messages_affectedMessages;
                od odVar3 = this.b;
                if (!z10) {
                    odVar3.getClass();
                    break;
                } else {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    odVar3.getMessagesController().J3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    break;
                }
        }
    }
}
