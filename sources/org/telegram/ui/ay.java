package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ay implements org.telegram.ui.Components.f5 {
    public final /* synthetic */ ty a;

    public ay(ty tyVar) {
        this.a = tyVar;
    }

    @Override // org.telegram.ui.Components.f5
    public final void J(int i10, int i11, boolean z10) {
        ty tyVar = this.a;
        ArrayList arrayList = tyVar.I2;
        tyVar.K2 = i10;
        tyVar.L2 = i11;
        if (tyVar.C2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
        }
        tyVar.C2.w(tyVar, arrayList2, tyVar.B1.getFieldText(), false, z10, i10, i11, null);
    }
}
