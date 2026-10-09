package ii;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.yi;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class u1 implements jk {
    public final /* synthetic */ yi a;
    public final /* synthetic */ e2 b;

    public u1(e2 e2Var, yi yiVar) {
        this.b = e2Var;
        this.a = yiVar;
    }

    @Override // org.telegram.ui.Components.jk
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        boolean isEmpty = arrayList.isEmpty();
        e2 e2Var = this.b;
        if (!isEmpty) {
            e2Var.P.d2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            x3 x3Var = e2Var.P;
            MessageObject messageObject = (MessageObject) arrayList3.get(0);
            x3Var.getClass();
            if (messageObject != null && messageObject.getDocument() != null) {
                TLRPC.Document document = messageObject.getDocument();
                TLRPC.Message message = messageObject.messageOwner;
                x3Var.e2(document, message != null ? message.attachPath : null);
            }
        }
        this.a.dismiss(true);
    }

    @Override // org.telegram.ui.Components.jk
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.startActivityForResult(intent, 21);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.Components.jk
    public final /* synthetic */ void O() {
    }

    @Override // org.telegram.ui.Components.jk
    public final /* synthetic */ void l(long j3, ArrayList arrayList, boolean z10, int i10) {
    }
}
