package ii;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.wi;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class o implements gk {
    public final /* synthetic */ wi a;
    public final /* synthetic */ r b;

    public o(r rVar, wi wiVar) {
        this.b = rVar;
        this.a = wiVar;
    }

    @Override // org.telegram.ui.Components.gk
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        x3 x3Var = this.b.r;
        if (!arrayList.isEmpty()) {
            x3Var.c2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            MessageObject messageObject = (MessageObject) arrayList3.get(0);
            x3Var.getClass();
            if (messageObject != null && messageObject.getDocument() != null) {
                TLRPC.Document document = messageObject.getDocument();
                TLRPC.Message message = messageObject.messageOwner;
                x3Var.d2(document, message != null ? message.attachPath : null);
            }
        }
        this.a.dismiss(true);
    }

    @Override // org.telegram.ui.Components.gk
    public final void w() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.b.f0.startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.gk
    public final /* synthetic */ void O() {
    }

    @Override // org.telegram.ui.Components.gk
    public final /* synthetic */ void l(long j3, ArrayList arrayList, boolean z10, int i10) {
    }
}
