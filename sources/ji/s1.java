package ji;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fk;
import org.telegram.ui.Components.vi;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class s1 implements fk {
    public final /* synthetic */ vi a;
    public final /* synthetic */ c2 b;

    public s1(c2 c2Var, vi viVar) {
        this.b = c2Var;
        this.a = viVar;
    }

    @Override // org.telegram.ui.Components.fk
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        boolean isEmpty = arrayList.isEmpty();
        c2 c2Var = this.b;
        if (!isEmpty) {
            c2Var.P.b2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            v3 v3Var = c2Var.P;
            MessageObject messageObject = (MessageObject) arrayList3.get(0);
            v3Var.getClass();
            if (messageObject != null && messageObject.getDocument() != null) {
                TLRPC.Document document = messageObject.getDocument();
                TLRPC.Message message = messageObject.messageOwner;
                v3Var.c2(document, message != null ? message.attachPath : null);
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.Components.fk
    public final /* synthetic */ void O() {
    }

    @Override // org.telegram.ui.Components.fk
    public final /* synthetic */ void l(long j3, ArrayList arrayList, boolean z10, int i10) {
    }
}
