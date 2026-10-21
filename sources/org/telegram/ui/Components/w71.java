package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class w71 extends i2.l {
    public final /* synthetic */ c81 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w71(Context context, c81 c81Var) {
        super(context);
        this.d = c81Var;
    }

    @Override // i2.l
    public final k2.t0 a(Context context) {
        ci.p4 p4Var = new ci.p4(context, 1);
        p4Var.d = new androidx.biometric.e(new c2.n[]{new k2.b1(new b81(this.d))});
        return p4Var.a();
    }
}
