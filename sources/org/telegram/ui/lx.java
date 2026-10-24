package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class lx implements org.telegram.ui.Components.d5 {
    public final /* synthetic */ ey a;

    public lx(ey eyVar) {
        this.a = eyVar;
    }

    @Override // org.telegram.ui.Components.d5
    public final void C(int i10, int i11, boolean z10) {
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
        eyVar.C2.w(eyVar, arrayList2, eyVar.B1.getFieldText(), false, z10, i10, i11, null);
    }
}
