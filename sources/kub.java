// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class kub implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ pub c;

    public kub(pub pubVar, long j, int i) {
        this.c = pubVar;
        this.a = j;
        this.b = i;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
            pub pubVar = this.c;
            na7 messagesController = pubVar.getMessagesController();
            int i = tL_messages_affectedHistory.pts;
            int i2 = tL_messages_affectedHistory.pts_count;
            long j = this.a;
            messagesController.O3(i, i2, j);
            int i3 = tL_messages_affectedHistory.offset;
            if (i3 > 0) {
                pubVar.c(this.b, i3, j);
            }
        }
    }
}
