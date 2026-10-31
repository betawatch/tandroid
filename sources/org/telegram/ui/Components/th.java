package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class th extends org.telegram.ui.yr0 {
    public final /* synthetic */ org.telegram.messenger.ef a;
    public final /* synthetic */ bi b;

    public th(bi biVar, org.telegram.messenger.ef efVar) {
        this.b = biVar;
        this.a = efVar;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void o(int i10, org.telegram.messenger.x20 x20Var, final boolean z10, final int i11, int i12, final boolean z11) {
        bi biVar = this.b;
        biVar.p4 = true;
        if (biVar.T3 == null) {
            return;
        }
        final org.telegram.messenger.ef efVar = this.a;
        efVar.s = x20Var;
        s4.Z(biVar.D3, biVar.W0() + 1, 0L, new org.telegram.messenger.q20() { // from class: org.telegram.ui.Components.sh
            @Override // org.telegram.messenger.q20
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, efVar);
                th.this.b.T3.H0(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
