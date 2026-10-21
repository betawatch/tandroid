package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class jx implements org.telegram.ui.Components.e5 {
    public final /* synthetic */ cy a;

    public jx(cy cyVar) {
        this.a = cyVar;
    }

    @Override // org.telegram.ui.Components.e5
    public final void C(int i10, int i11, boolean z10) {
        cy cyVar = this.a;
        ArrayList arrayList = cyVar.I2;
        cyVar.K2 = i10;
        cyVar.L2 = i11;
        cyVar.M2 = false;
        if (cyVar.C2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
        }
        cyVar.C2.w(cyVar, arrayList2, cyVar.B1.getFieldText(), false, z10, i10, i11, null);
    }
}
