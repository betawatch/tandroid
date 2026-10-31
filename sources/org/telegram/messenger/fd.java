package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class fd implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ nd b;

    public /* synthetic */ fd(nd ndVar, int i10) {
        this.a = i10;
        this.b = ndVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                nd ndVar = this.b;
                if (tL_error == null) {
                    ndVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    ndVar.getClass();
                    break;
                }
            case 1:
                nd ndVar2 = this.b;
                if (tL_error == null) {
                    ndVar2.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    ndVar2.getClass();
                    break;
                }
            default:
                boolean z10 = tLObject instanceof TLRPC.TL_messages_affectedMessages;
                nd ndVar3 = this.b;
                if (!z10) {
                    ndVar3.getClass();
                    break;
                } else {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    ndVar3.getMessagesController().J3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    break;
                }
        }
    }
}
