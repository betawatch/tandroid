package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class nx implements org.telegram.ui.Components.x4 {
    public final /* synthetic */ gy a;

    public nx(gy gyVar) {
        this.a = gyVar;
    }

    @Override // org.telegram.ui.Components.x4
    public final void I(int i10, int i11, boolean z10) {
        gy gyVar = this.a;
        ArrayList arrayList = gyVar.E2;
        gyVar.G2 = i10;
        gyVar.H2 = i11;
        if (gyVar.y2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
        }
        gyVar.y2.w(gyVar, arrayList2, gyVar.x1.getFieldText(), false, z10, i10, i11, null);
    }
}
