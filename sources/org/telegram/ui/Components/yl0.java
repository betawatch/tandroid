package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class yl0 extends jg.h0 {
    public final /* synthetic */ org.telegram.ui.zw I0;
    public final /* synthetic */ Context J0;
    public final /* synthetic */ org.telegram.ui.iw K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl0(org.telegram.ui.iw iwVar, Context context, org.telegram.ui.zw zwVar, int i7, int i10, v4.k kVar, boolean z9, org.telegram.ui.zw zwVar2, Context context2) {
        super(context, zwVar, i7, i10, kVar, z9);
        this.K0 = iwVar;
        this.I0 = zwVar2;
        this.J0 = context2;
    }

    @Override // v4.g0
    public final void f() {
        bi.q1 q1Var;
        int i7 = this.B0;
        super.f();
        org.telegram.ui.iw iwVar = this.K0;
        if (!iwVar.K0 && (q1Var = iwVar.a0) != null) {
            q1Var.v0(0);
            iwVar.K0 = true;
        }
        if (b() != 0 || i7 == 0 || this.D0 > 0) {
            return;
        }
        iwVar.b0.e(false, false);
    }
}
