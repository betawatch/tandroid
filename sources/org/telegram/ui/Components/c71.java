package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class c71 extends j3.l {
    public final /* synthetic */ i71 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c71(Context context, i71 i71Var) {
        super(context);
        this.d = i71Var;
    }

    @Override // j3.l
    public final l3.k0 a(Context context) {
        com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r(8);
        l3.g a2 = l3.g.a(context);
        a2.getClass();
        rVar.b = a2;
        rVar.c = new af.d(new l3.n[]{new l3.t0(new h71(this.d))});
        return new l3.k0(rVar);
    }
}
