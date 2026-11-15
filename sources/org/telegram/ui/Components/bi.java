package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class bi extends org.telegram.ui.mq0 {
    public final /* synthetic */ org.telegram.messenger.ff a;
    public final /* synthetic */ ki b;

    public bi(ki kiVar, org.telegram.messenger.ff ffVar) {
        this.b = kiVar;
        this.a = ffVar;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void o(int i7, org.telegram.messenger.g20 g20Var, final boolean z10, final int i10, int i11, final boolean z11) {
        ki kiVar = this.b;
        kiVar.t4 = true;
        if (kiVar.X3 == null) {
            return;
        }
        final org.telegram.messenger.ff ffVar = this.a;
        ffVar.s = g20Var;
        t4.X(kiVar.H3, kiVar.X0() + 1, 0L, new org.telegram.messenger.z10() { // from class: org.telegram.ui.Components.ai
            @Override // org.telegram.messenger.z10
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.u1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, ffVar);
                bi.this.b.X3.y1(7, true, z10, i10, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
