package li;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.ti;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class r1 implements ek {
    public final /* synthetic */ ti a;
    public final /* synthetic */ b2 b;

    public r1(b2 b2Var, ti tiVar) {
        this.b = b2Var;
        this.a = tiVar;
    }

    @Override // org.telegram.ui.Components.ek
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        boolean isEmpty = arrayList.isEmpty();
        b2 b2Var = this.b;
        if (!isEmpty) {
            b2Var.P.i2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            v3 v3Var = b2Var.P;
            MessageObject messageObject = (MessageObject) arrayList3.get(0);
            v3Var.getClass();
            if (messageObject != null && messageObject.getDocument() != null) {
                TLRPC.Document document = messageObject.getDocument();
                TLRPC.Message message = messageObject.messageOwner;
                v3Var.j2(document, message != null ? message.attachPath : null);
            }
        }
        this.a.dismiss(true);
    }

    @Override // org.telegram.ui.Components.ek
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.ek
    public final /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.ek
    public final /* synthetic */ void m(long j10, ArrayList arrayList, boolean z10, int i10) {
    }
}
