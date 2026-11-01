package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class th extends org.telegram.ui.xr0 {
    public final /* synthetic */ org.telegram.messenger.ff a;
    public final /* synthetic */ bi b;

    public th(bi biVar, org.telegram.messenger.ff ffVar) {
        this.b = biVar;
        this.a = ffVar;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void o(int i10, org.telegram.messenger.y20 y20Var, final boolean z10, final int i11, int i12, final boolean z11) {
        bi biVar = this.b;
        biVar.p4 = true;
        if (biVar.T3 == null) {
            return;
        }
        final org.telegram.messenger.ff ffVar = this.a;
        ffVar.s = y20Var;
        s4.Z(biVar.D3, biVar.W0() + 1, 0L, new org.telegram.messenger.r20() { // from class: org.telegram.ui.Components.sh
            @Override // org.telegram.messenger.r20
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, ffVar);
                th.this.b.T3.H0(7, true, z10, i11, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
