package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
