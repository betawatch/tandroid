package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class dd implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ld b;

    public /* synthetic */ dd(ld ldVar, int i3) {
        this.a = i3;
        this.b = ldVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ld ldVar = this.b;
                if (tL_error == null) {
                    ldVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    ldVar.getClass();
                    break;
                }
            case 1:
                ld ldVar2 = this.b;
                if (tL_error == null) {
                    ldVar2.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    ldVar2.getClass();
                    break;
                }
            default:
                boolean z10 = tLObject instanceof TLRPC.TL_messages_affectedMessages;
                ld ldVar3 = this.b;
                if (!z10) {
                    ldVar3.getClass();
                    break;
                } else {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    ldVar3.getMessagesController().M3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    break;
                }
        }
    }
}
