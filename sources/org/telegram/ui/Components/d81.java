package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class d81 extends i2.k {
    public final /* synthetic */ j81 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d81(Context context, j81 j81Var) {
        super(context);
        this.d = j81Var;
    }

    @Override // i2.k
    public final k2.t0 a(Context context) {
        ci.o4 o4Var = new ci.o4(context, 1);
        o4Var.d = new androidx.biometric.e(new c2.n[]{new k2.b1(new i81(this.d))});
        return o4Var.a();
    }
}
