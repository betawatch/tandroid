package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class b81 extends i2.k {
    public final /* synthetic */ h81 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b81(Context context, h81 h81Var) {
        super(context);
        this.d = h81Var;
    }

    @Override // i2.k
    public final k2.s0 a(Context context) {
        bi.p5 p5Var = new bi.p5(context);
        p5Var.d = new androidx.biometric.e(new c2.n[]{new k2.a1(new g81(this.d))});
        return p5Var.a();
    }
}
