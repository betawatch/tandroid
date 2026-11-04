package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sh extends org.telegram.ui.eq0 {
    public final /* synthetic */ org.telegram.messenger.ye a;
    public final /* synthetic */ bi b;

    public sh(bi biVar, org.telegram.messenger.ye yeVar) {
        this.b = biVar;
        this.a = yeVar;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void o(int i3, org.telegram.messenger.b20 b20Var, final boolean z10, final int i10, int i11, final boolean z11) {
        bi biVar = this.b;
        biVar.q4 = true;
        if (biVar.U3 == null) {
            return;
        }
        final org.telegram.messenger.ye yeVar = this.a;
        yeVar.s = b20Var;
        t4.Z(biVar.E3, biVar.X0() + 1, 0L, new org.telegram.messenger.u10() { // from class: org.telegram.ui.Components.rh
            @Override // org.telegram.messenger.u10
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.u1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, yeVar);
                sh.this.b.U3.o1(7, true, z10, i10, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
