package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
