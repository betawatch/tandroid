package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class li extends org.telegram.ui.oq0 {
    public final /* synthetic */ org.telegram.messenger.ef a;
    public final /* synthetic */ ui b;

    public li(ui uiVar, org.telegram.messenger.ef efVar) {
        this.b = uiVar;
        this.a = efVar;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.e20 e20Var, final boolean z10, final int i10, int i11, final boolean z11) {
        ui uiVar = this.b;
        uiVar.t4 = true;
        if (uiVar.X3 == null) {
            return;
        }
        final org.telegram.messenger.ef efVar = this.a;
        efVar.s = e20Var;
        c5.X(uiVar.H3, uiVar.Y0() + 1, 0L, new org.telegram.messenger.x10() { // from class: org.telegram.ui.Components.ki
            @Override // org.telegram.messenger.x10
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.u1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, efVar);
                li.this.b.X3.y1(7, true, z10, i10, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
