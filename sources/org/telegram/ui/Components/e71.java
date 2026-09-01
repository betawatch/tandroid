package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class e71 extends j3.l {
    public final /* synthetic */ k71 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e71(Context context, k71 k71Var) {
        super(context);
        this.d = k71Var;
    }

    @Override // j3.l
    public final l3.k0 a(Context context) {
        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(8);
        l3.g a2 = l3.g.a(context);
        a2.getClass();
        sVar.b = a2;
        sVar.c = new androidx.biometric.e(new l3.n[]{new l3.t0(new j71(this.d))});
        return new l3.k0(sVar);
    }
}
