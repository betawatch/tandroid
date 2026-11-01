package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class u00 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ y00 c;

    public u00(y00 y00Var, long j10, int i10) {
        this.c = y00Var;
        this.a = j10;
        this.b = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
            y00 y00Var = this.c;
            wp messagesController = y00Var.getMessagesController();
            int i10 = tL_messages_affectedHistory.pts;
            int i11 = tL_messages_affectedHistory.pts_count;
            long j10 = this.a;
            messagesController.I3(i10, i11, j10);
            int i12 = tL_messages_affectedHistory.offset;
            if (i12 > 0) {
                y00Var.c(this.b, i12, j10);
            }
        }
    }
}
