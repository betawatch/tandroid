package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class mx implements org.telegram.ui.Components.b5 {
    public final /* synthetic */ fy a;

    public mx(fy fyVar) {
        this.a = fyVar;
    }

    @Override // org.telegram.ui.Components.b5
    public final void I(int i10, int i11, boolean z10) {
        fy fyVar = this.a;
        ArrayList arrayList = fyVar.E2;
        fyVar.G2 = i10;
        fyVar.H2 = i11;
        if (fyVar.y2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
        }
        fyVar.y2.v(fyVar, arrayList2, fyVar.x1.getFieldText(), false, z10, i10, i11, null);
    }
}
