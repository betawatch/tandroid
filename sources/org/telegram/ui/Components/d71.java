package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class d71 extends j3.l {
    public final /* synthetic */ j71 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d71(Context context, j71 j71Var) {
        super(context);
        this.d = j71Var;
    }

    @Override // j3.l
    public final l3.k0 a(Context context) {
        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(8);
        l3.g a2 = l3.g.a(context);
        a2.getClass();
        sVar.b = a2;
        sVar.c = new androidx.biometric.e(new l3.n[]{new l3.t0(new i71(this.d))});
        return new l3.k0(sVar);
    }
}
