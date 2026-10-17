package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class lx implements org.telegram.ui.Components.e5 {
    public final /* synthetic */ ey a;

    public lx(ey eyVar) {
        this.a = eyVar;
    }

    @Override // org.telegram.ui.Components.e5
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
