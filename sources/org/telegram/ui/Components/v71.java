package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class v71 extends i2.l {
    public final /* synthetic */ b81 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v71(Context context, b81 b81Var) {
        super(context);
        this.d = b81Var;
    }

    @Override // i2.l
    public final k2.t0 a(Context context) {
        ci.p4 p4Var = new ci.p4(context);
        p4Var.d = new androidx.biometric.e(new c2.n[]{new k2.b1(new a81(this.d))});
        return p4Var.a();
    }
}
