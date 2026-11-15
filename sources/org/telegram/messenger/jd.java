package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class jd implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ rd b;

    public /* synthetic */ jd(rd rdVar, int i7) {
        this.a = i7;
        this.b = rdVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                rd rdVar = this.b;
                if (tL_error == null) {
                    rdVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    rdVar.getClass();
                    break;
                }
            case 1:
                rd rdVar2 = this.b;
                if (tL_error == null) {
                    rdVar2.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    rdVar2.getClass();
                    break;
                }
            default:
                boolean z10 = tLObject instanceof TLRPC.TL_messages_affectedMessages;
                rd rdVar3 = this.b;
                if (!z10) {
                    rdVar3.getClass();
                    break;
                } else {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    rdVar3.getMessagesController().M3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    break;
                }
        }
    }
}
