package ii;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fk;
import org.telegram.ui.Components.vi;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class t1 implements fk {
    public final /* synthetic */ vi a;
    public final /* synthetic */ d2 b;

    public t1(d2 d2Var, vi viVar) {
        this.b = d2Var;
        this.a = viVar;
    }

    @Override // org.telegram.ui.Components.fk
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        boolean isEmpty = arrayList.isEmpty();
        d2 d2Var = this.b;
        if (!isEmpty) {
            d2Var.P.d2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            w3 w3Var = d2Var.P;
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
            this.b.startActivityForResult(intent, 21);
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
