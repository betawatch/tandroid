package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class cx implements o70 {
    public final /* synthetic */ yy a;

    public cx(yy yyVar) {
        this.a = yyVar;
    }

    @Override // org.telegram.ui.o70
    public final void a(p70 p70Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
        yy yyVar = this.a;
        sy syVar = yyVar.C2;
        if (yyVar.B2) {
            yyVar.removeSelfFromStack();
        }
        syVar.w(yyVar, arrayList, null, true, yyVar.J2, yyVar.K2, yyVar.L2, null);
    }
}
