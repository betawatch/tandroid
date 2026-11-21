package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class bk extends org.telegram.ui.Components.em0 {
    public final /* synthetic */ bn J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, Context context, bn bnVar2, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, bnVar2, i7, j3, h6Var);
        this.J = bnVar;
    }

    @Override // org.telegram.ui.Components.em0
    public final void b(boolean z10) {
        bn bnVar = this.J;
        bnVar.I7();
        bnVar.G7();
        ik ikVar = bnVar.Bb;
        if (ikVar != null) {
            ikVar.setTranslationY(bnVar.T9 + getCurrentHeight());
        }
        if (z10) {
            bnVar.aa = true;
            bnVar.Rc();
        }
    }

    @Override // org.telegram.ui.Components.em0
    public final boolean f(ch.p0 p0Var) {
        int i7;
        bn bnVar = this.J;
        bnVar.F3 = p0Var;
        bnVar.G3 = p0Var != null;
        if (p0Var == null) {
            org.telegram.messenger.ri mediaDataController = bnVar.getMediaDataController();
            mediaDataController.Z0.clear();
            mediaDataController.a1.clear();
            mediaDataController.b1.clear();
            bnVar.Qb(false);
            bnVar.nd(0, 0, -1);
        }
        bnVar.qd();
        bnVar.dd();
        bnVar.I3 = bnVar.k0.getSearchField().getText().toString();
        org.telegram.messenger.ri mediaDataController2 = bnVar.getMediaDataController();
        String str = bnVar.I3;
        long j3 = bnVar.l6;
        long j10 = bnVar.d7;
        i7 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
        mediaDataController2.c2(str, j3, j10, i7, 0, bnVar.s4, false, bnVar.D3, bnVar.E3, (TextUtils.isEmpty(bnVar.I3) && bnVar.F3 == null) ? false : true, bnVar.F3);
        org.telegram.messenger.g0.v1(bnVar.k0.getSearchField());
        return true;
    }

    @Override // org.telegram.ui.Components.em0
    public final void h(boolean z10) {
        super.h(z10);
        bn bnVar = this.J;
        org.telegram.ui.ActionBar.q0 q0Var = bnVar.k0;
        g(q0Var != null && q0Var.w() && a() && bnVar.J3 == null);
    }
}
