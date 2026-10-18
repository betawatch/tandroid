package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        ci.o4 o4Var = new ci.o4(context);
        o4Var.d = new androidx.biometric.e(new c2.n[]{new k2.a1(new z71(this.d))});
        return o4Var.a();
    }
}
