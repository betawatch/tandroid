package ji;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.vi;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class t1 implements gk {
    public final /* synthetic */ vi a;
    public final /* synthetic */ d2 b;

    public t1(d2 d2Var, vi viVar) {
        this.b = d2Var;
        this.a = viVar;
    }

    @Override // org.telegram.ui.Components.gk
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        boolean isEmpty = arrayList.isEmpty();
        d2 d2Var = this.b;
        if (!isEmpty) {
            d2Var.P.d2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            x3 x3Var = d2Var.P;
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

    @Override // org.telegram.ui.Components.gk
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.gk
    public final /* synthetic */ void O() {
    }

    @Override // org.telegram.ui.Components.gk
    public final /* synthetic */ void m(long j10, ArrayList arrayList, boolean z10, int i10) {
    }
}
