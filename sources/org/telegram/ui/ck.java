package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ck extends org.telegram.ui.Components.ql0 {
    public final /* synthetic */ cn I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck(cn cnVar, Context context, cn cnVar2, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, cnVar2, i7, j3, h6Var);
        this.I = cnVar;
    }

    @Override // org.telegram.ui.Components.ql0
    public final void b(boolean z9) {
        cn cnVar = this.I;
        cnVar.I7();
        cnVar.G7();
        jk jkVar = cnVar.zb;
        if (jkVar != null) {
            jkVar.setTranslationY(cnVar.R9 + getCurrentHeight());
        }
        if (z9) {
            cnVar.Y9 = true;
            cnVar.Qc();
        }
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean f(ch.o0 o0Var) {
        int i7;
        cn cnVar = this.I;
        cnVar.E3 = o0Var;
        cnVar.F3 = o0Var != null;
        if (o0Var == null) {
            org.telegram.messenger.ui mediaDataController = cnVar.getMediaDataController();
            mediaDataController.Y0.clear();
            mediaDataController.Z0.clear();
            mediaDataController.a1.clear();
            cnVar.Pb(false);
            cnVar.md(0, 0, -1);
        }
        cnVar.pd();
        cnVar.cd();
        cnVar.H3 = cnVar.j0.getSearchField().getText().toString();
        org.telegram.messenger.ui mediaDataController2 = cnVar.getMediaDataController();
        String str = cnVar.H3;
        long j3 = cnVar.j6;
        long j10 = cnVar.b7;
        i7 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
        mediaDataController2.X1(str, j3, j10, i7, 0, cnVar.r4, false, cnVar.C3, cnVar.D3, (TextUtils.isEmpty(cnVar.H3) && cnVar.E3 == null) ? false : true, cnVar.E3);
        org.telegram.messenger.g0.v1(cnVar.j0.getSearchField());
        return true;
    }

    @Override // org.telegram.ui.Components.ql0
    public final void h(boolean z9) {
        super.h(z9);
        cn cnVar = this.I;
        org.telegram.ui.ActionBar.r0 r0Var = cnVar.j0;
        g(r0Var != null && r0Var.v() && a() && cnVar.I3 == null);
    }
}
