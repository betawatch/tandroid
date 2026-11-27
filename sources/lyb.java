// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class lyb implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ qyb c;

    public lyb(qyb qybVar, long j, int i) {
        this.c = qybVar;
        this.a = j;
        this.b = i;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
            qyb qybVar = this.c;
            uc7 messagesController = qybVar.getMessagesController();
            int i = tL_messages_affectedHistory.pts;
            int i2 = tL_messages_affectedHistory.pts_count;
            long j = this.a;
            messagesController.V3(i, i2, j);
            int i3 = tL_messages_affectedHistory.offset;
            if (i3 > 0) {
                qybVar.c(this.b, i3, j);
            }
        }
    }
}
