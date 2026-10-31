package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class t00 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ x00 c;

    public t00(x00 x00Var, long j10, int i10) {
        this.c = x00Var;
        this.a = j10;
        this.b = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
            x00 x00Var = this.c;
            vp messagesController = x00Var.getMessagesController();
            int i10 = tL_messages_affectedHistory.pts;
            int i11 = tL_messages_affectedHistory.pts_count;
            long j10 = this.a;
            messagesController.I3(i10, i11, j10);
            int i12 = tL_messages_affectedHistory.offset;
            if (i12 > 0) {
                x00Var.c(this.b, i12, j10);
            }
        }
    }
}
