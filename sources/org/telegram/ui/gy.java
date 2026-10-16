package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class gy implements org.telegram.ui.Components.f5 {
    public final /* synthetic */ yy a;

    public gy(yy yyVar) {
        this.a = yyVar;
    }

    @Override // org.telegram.ui.Components.f5
    public final void J(int i10, int i11, boolean z10) {
        yy yyVar = this.a;
        ArrayList arrayList = yyVar.I2;
        yyVar.K2 = i10;
        yyVar.L2 = i11;
        yyVar.M2 = false;
        if (yyVar.C2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
        }
        yyVar.C2.w(yyVar, arrayList2, yyVar.B1.getFieldText(), false, z10, i10, i11, null);
    }
}
