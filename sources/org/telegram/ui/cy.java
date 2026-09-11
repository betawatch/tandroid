package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class cy implements org.telegram.ui.Components.d5 {
    public final /* synthetic */ uy a;

    public cy(uy uyVar) {
        this.a = uyVar;
    }

    @Override // org.telegram.ui.Components.d5
    public final void J(int i10, int i11, boolean z10) {
        uy uyVar = this.a;
        ArrayList arrayList = uyVar.I2;
        uyVar.K2 = i10;
        uyVar.L2 = i11;
        if (uyVar.C2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
        }
        uyVar.C2.u(uyVar, arrayList2, uyVar.B1.getFieldText(), false, z10, i10, i11, null);
    }
}
