package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class id implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ qd b;

    public /* synthetic */ id(qd qdVar, int i7) {
        this.a = i7;
        this.b = qdVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                qd qdVar = this.b;
                if (tL_error == null) {
                    qdVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    qdVar.getClass();
                    break;
                }
            case 1:
                qd qdVar2 = this.b;
                if (tL_error == null) {
                    qdVar2.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    qdVar2.getClass();
                    break;
                }
            default:
                boolean z10 = tLObject instanceof TLRPC.TL_messages_affectedMessages;
                qd qdVar3 = this.b;
                if (!z10) {
                    qdVar3.getClass();
                    break;
                } else {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    qdVar3.getMessagesController().T3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    break;
                }
        }
    }
}
