package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class kx implements org.telegram.ui.Components.x4 {
    public final /* synthetic */ dy a;

    public kx(dy dyVar) {
        this.a = dyVar;
    }

    @Override // org.telegram.ui.Components.x4
    public final void B(int i9, int i10, boolean z10) {
        dy dyVar = this.a;
        ArrayList arrayList = dyVar.E2;
        dyVar.G2 = i9;
        dyVar.H2 = i10;
        if (dyVar.y2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i11)).longValue(), 0L));
        }
        dyVar.y2.v(dyVar, arrayList2, dyVar.x1.getFieldText(), false, z10, i9, i10, null);
    }
}
