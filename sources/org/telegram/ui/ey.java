package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ey implements org.telegram.ui.Components.b5 {
    public final /* synthetic */ wy a;

    public ey(wy wyVar) {
        this.a = wyVar;
    }

    @Override // org.telegram.ui.Components.b5
    public final void J(int i10, int i11, boolean z10) {
        wy wyVar = this.a;
        ArrayList arrayList = wyVar.I2;
        wyVar.K2 = i10;
        wyVar.L2 = i11;
        if (wyVar.C2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
        }
        wyVar.C2.u(wyVar, arrayList2, wyVar.B1.getFieldText(), false, z10, i10, i11, null);
    }
}
