package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class u71 extends i2.j {
    public final /* synthetic */ a81 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u71(Context context, a81 a81Var) {
        super(context);
        this.d = a81Var;
    }

    @Override // i2.j
    public final k2.t0 a(Context context) {
        ci.p4 p4Var = new ci.p4(context);
        p4Var.d = new androidx.biometric.e(new c2.n[]{new k2.a1(new z71(this.d))});
        return p4Var.a();
    }
}
