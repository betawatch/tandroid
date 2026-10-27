package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ix implements org.telegram.ui.Components.e5 {
    public final /* synthetic */ ey a;

    public ix(ey eyVar) {
        this.a = eyVar;
    }

    @Override // org.telegram.ui.Components.e5
    public final void G(int i10, int i11, boolean z10) {
        ey eyVar = this.a;
        ArrayList arrayList = eyVar.I2;
        eyVar.K2 = i10;
        eyVar.L2 = i11;
        eyVar.M2 = false;
        if (eyVar.C2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
        }
        eyVar.C2.v(eyVar, arrayList2, eyVar.B1.getFieldText(), false, z10, i10, i11, null);
    }
}
