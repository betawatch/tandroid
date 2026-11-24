// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lwb implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ qwb c;

    public lwb(qwb qwbVar, long j, int i) {
        this.c = qwbVar;
        this.a = j;
        this.b = i;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
            qwb qwbVar = this.c;
            oc7 messagesController = qwbVar.getMessagesController();
            int i = tL_messages_affectedHistory.pts;
            int i2 = tL_messages_affectedHistory.pts_count;
            long j = this.a;
            messagesController.Q3(i, i2, j);
            int i3 = tL_messages_affectedHistory.offset;
            if (i3 > 0) {
                qwbVar.c(this.b, i3, j);
            }
        }
    }
}
