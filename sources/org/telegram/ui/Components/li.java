package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class li extends org.telegram.ui.oq0 {
    public final /* synthetic */ org.telegram.messenger.ff a;
    public final /* synthetic */ ui b;

    public li(ui uiVar, org.telegram.messenger.ff ffVar) {
        this.b = uiVar;
        this.a = ffVar;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.f20 f20Var, final boolean z10, final int i10, int i11, final boolean z11) {
        ui uiVar = this.b;
        uiVar.t4 = true;
        if (uiVar.X3 == null) {
            return;
        }
        final org.telegram.messenger.ff ffVar = this.a;
        ffVar.s = f20Var;
        c5.X(uiVar.H3, uiVar.Y0() + 1, 0L, new org.telegram.messenger.y10() { // from class: org.telegram.ui.Components.ki
            @Override // org.telegram.messenger.y10
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.u1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, ffVar);
                li.this.b.X3.y1(7, true, z10, i10, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
