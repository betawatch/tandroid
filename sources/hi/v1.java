package hi;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.yi;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class v1 implements kk {
    public final /* synthetic */ yi a;
    public final /* synthetic */ g2 b;

    public v1(g2 g2Var, yi yiVar) {
        this.b = g2Var;
        this.a = yiVar;
    }

    @Override // org.telegram.ui.Components.kk
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        boolean isEmpty = arrayList.isEmpty();
        g2 g2Var = this.b;
        if (!isEmpty) {
            g2Var.P.b2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            z3 z3Var = g2Var.P;
            MessageObject messageObject = (MessageObject) arrayList3.get(0);
            z3Var.getClass();
            if (messageObject != null && messageObject.getDocument() != null) {
                TLRPC.Document document = messageObject.getDocument();
                TLRPC.Message message = messageObject.messageOwner;
                z3Var.c2(document, message != null ? message.attachPath : null);
            }
        }
        this.a.dismiss(true);
    }

    @Override // org.telegram.ui.Components.kk
    public final void w() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.kk
    public final /* synthetic */ void O() {
    }

    @Override // org.telegram.ui.Components.kk
    public final /* synthetic */ void l(long j3, ArrayList arrayList, boolean z10, int i10) {
    }
}
