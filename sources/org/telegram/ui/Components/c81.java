package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class c81 extends i2.k {
    public final /* synthetic */ i81 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c81(Context context, i81 i81Var) {
        super(context);
        this.d = i81Var;
    }

    @Override // i2.k
    public final k2.s0 a(Context context) {
        bi.p5 p5Var = new bi.p5(context);
        p5Var.d = new androidx.biometric.e(new c2.n[]{new k2.a1(new h81(this.d))});
        return p5Var.a();
    }
}
