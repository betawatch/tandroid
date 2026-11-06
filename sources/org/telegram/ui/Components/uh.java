package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class uh extends org.telegram.ui.nq0 {
    public final /* synthetic */ org.telegram.messenger.gf a;
    public final /* synthetic */ di b;

    public uh(di diVar, org.telegram.messenger.gf gfVar) {
        this.b = diVar;
        this.a = gfVar;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, final boolean z9, final int i10, int i11, final boolean z10) {
        di diVar = this.b;
        diVar.p4 = true;
        if (diVar.T3 == null) {
            return;
        }
        final org.telegram.messenger.gf gfVar = this.a;
        gfVar.s = j20Var;
        v4.X(diVar.D3, diVar.X0() + 1, 0L, new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.th
            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, gfVar);
                uh.this.b.T3.o1(7, true, z9, i10, 0, 0L, false, z10, ((Long) obj).longValue());
            }
        });
    }
}
