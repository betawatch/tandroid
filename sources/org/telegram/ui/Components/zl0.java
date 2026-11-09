package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class zl0 extends jg.h0 {
    public final /* synthetic */ org.telegram.ui.yw I0;
    public final /* synthetic */ Context J0;
    public final /* synthetic */ org.telegram.ui.hw K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl0(org.telegram.ui.hw hwVar, Context context, org.telegram.ui.yw ywVar, int i7, int i10, v4.k kVar, boolean z9, org.telegram.ui.yw ywVar2, Context context2) {
        super(context, ywVar, i7, i10, kVar, z9);
        this.K0 = hwVar;
        this.I0 = ywVar2;
        this.J0 = context2;
    }

    @Override // v4.g0
    public final void f() {
        bi.q1 q1Var;
        int i7 = this.B0;
        super.f();
        org.telegram.ui.hw hwVar = this.K0;
        if (!hwVar.K0 && (q1Var = hwVar.a0) != null) {
            q1Var.v0(0);
            hwVar.K0 = true;
        }
        if (b() != 0 || i7 == 0 || this.D0 > 0) {
            return;
        }
        hwVar.b0.e(false, false);
    }
}
