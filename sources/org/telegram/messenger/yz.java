package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class yz implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ c00 c;

    public yz(c00 c00Var, long j10, int i3) {
        this.c = c00Var;
        this.a = j10;
        this.b = i3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
            c00 c00Var = this.c;
            hp messagesController = c00Var.getMessagesController();
            int i3 = tL_messages_affectedHistory.pts;
            int i10 = tL_messages_affectedHistory.pts_count;
            long j10 = this.a;
            messagesController.L3(i3, i10, j10);
            int i11 = tL_messages_affectedHistory.offset;
            if (i11 > 0) {
                c00Var.c(this.b, i11, j10);
            }
        }
    }
}
