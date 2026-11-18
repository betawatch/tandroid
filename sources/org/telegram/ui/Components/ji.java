package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ji extends org.telegram.ui.oq0 {
    public final /* synthetic */ org.telegram.messenger.ef a;
    public final /* synthetic */ si b;

    public ji(si siVar, org.telegram.messenger.ef efVar) {
        this.b = siVar;
        this.a = efVar;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.e20 e20Var, final boolean z10, final int i10, int i11, final boolean z11) {
        si siVar = this.b;
        siVar.t4 = true;
        if (siVar.X3 == null) {
            return;
        }
        final org.telegram.messenger.ef efVar = this.a;
        efVar.s = e20Var;
        b5.X(siVar.H3, siVar.Y0() + 1, 0L, new org.telegram.messenger.x10() { // from class: org.telegram.ui.Components.ii
            @Override // org.telegram.messenger.x10
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.u1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, efVar);
                ji.this.b.X3.y1(7, true, z10, i10, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
