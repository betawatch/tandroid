package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class u71 extends i2.k {
    public final /* synthetic */ a81 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u71(Context context, a81 a81Var) {
        super(context);
        this.d = a81Var;
    }

    @Override // i2.k
    public final k2.t0 a(Context context) {
        ci.p4 p4Var = new ci.p4(context);
        p4Var.d = new androidx.biometric.e(new c2.n[]{new k2.a1(new z71(this.d))});
        return p4Var.a();
    }
}
