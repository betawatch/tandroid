package ii;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fk;
import org.telegram.ui.Components.vi;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class o implements fk {
    public final /* synthetic */ vi a;
    public final /* synthetic */ r b;

    public o(r rVar, vi viVar) {
        this.b = rVar;
        this.a = viVar;
    }

    @Override // org.telegram.ui.Components.fk
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        w3 w3Var = this.b.r;
        if (!arrayList.isEmpty()) {
            w3Var.d2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            MessageObject messageObject = (MessageObject) arrayList3.get(0);
            w3Var.getClass();
            if (messageObject != null && messageObject.getDocument() != null) {
                TLRPC.Document document = messageObject.getDocument();
                TLRPC.Message message = messageObject.messageOwner;
                w3Var.e2(document, message != null ? message.attachPath : null);
            }
        }
        this.a.dismiss(true);
    }

    @Override // org.telegram.ui.Components.fk
    public final void w() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.b.f0.startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.fk
    public final /* synthetic */ void O() {
    }

    @Override // org.telegram.ui.Components.fk
    public final /* synthetic */ void l(long j3, ArrayList arrayList, boolean z10, int i10) {
    }
}
