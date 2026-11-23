package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ki extends org.telegram.ui.oq0 {
    public final /* synthetic */ org.telegram.messenger.ef a;
    public final /* synthetic */ ti b;

    public ki(ti tiVar, org.telegram.messenger.ef efVar) {
        this.b = tiVar;
        this.a = efVar;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.d20 d20Var, final boolean z10, final int i10, int i11, final boolean z11) {
        ti tiVar = this.b;
        tiVar.t4 = true;
        if (tiVar.X3 == null) {
            return;
        }
        final org.telegram.messenger.ef efVar = this.a;
        efVar.s = d20Var;
        b5.X(tiVar.H3, tiVar.Y0() + 1, 0L, new org.telegram.messenger.w10() { // from class: org.telegram.ui.Components.ji
            @Override // org.telegram.messenger.w10
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.u1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, efVar);
                ki.this.b.X3.y1(7, true, z10, i10, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
