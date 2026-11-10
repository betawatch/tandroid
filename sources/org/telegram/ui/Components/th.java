package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class th extends org.telegram.ui.qq0 {
    public final /* synthetic */ org.telegram.messenger.gf a;
    public final /* synthetic */ ci b;

    public th(ci ciVar, org.telegram.messenger.gf gfVar) {
        this.b = ciVar;
        this.a = gfVar;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, final boolean z9, final int i10, int i11, final boolean z10) {
        ci ciVar = this.b;
        ciVar.s4 = true;
        if (ciVar.W3 == null) {
            return;
        }
        final org.telegram.messenger.gf gfVar = this.a;
        gfVar.s = j20Var;
        u4.X(ciVar.G3, ciVar.X0() + 1, 0L, new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.sh
            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, gfVar);
                th.this.b.W3.o1(7, true, z9, i10, 0, 0L, false, z10, ((Long) obj).longValue());
            }
        });
    }
}
