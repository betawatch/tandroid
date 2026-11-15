package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ak extends org.telegram.ui.Components.ul0 {
    public final /* synthetic */ an J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(an anVar, Context context, an anVar2, int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, anVar2, i7, j3, e6Var);
        this.J = anVar;
    }

    @Override // org.telegram.ui.Components.ul0
    public final void b(boolean z10) {
        an anVar = this.J;
        anVar.I7();
        anVar.G7();
        hk hkVar = anVar.Ab;
        if (hkVar != null) {
            hkVar.setTranslationY(anVar.S9 + getCurrentHeight());
        }
        if (z10) {
            anVar.Z9 = true;
            anVar.Rc();
        }
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean f(ch.p0 p0Var) {
        int i7;
        an anVar = this.J;
        anVar.F3 = p0Var;
        anVar.G3 = p0Var != null;
        if (p0Var == null) {
            org.telegram.messenger.si mediaDataController = anVar.getMediaDataController();
            mediaDataController.Z0.clear();
            mediaDataController.a1.clear();
            mediaDataController.b1.clear();
            anVar.Qb(false);
            anVar.nd(0, 0, -1);
        }
        anVar.qd();
        anVar.dd();
        anVar.I3 = anVar.k0.getSearchField().getText().toString();
        org.telegram.messenger.si mediaDataController2 = anVar.getMediaDataController();
        String str = anVar.I3;
        long j3 = anVar.k6;
        long j10 = anVar.c7;
        i7 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
        mediaDataController2.X1(str, j3, j10, i7, 0, anVar.s4, false, anVar.D3, anVar.E3, (TextUtils.isEmpty(anVar.I3) && anVar.F3 == null) ? false : true, anVar.F3);
        org.telegram.messenger.g0.v1(anVar.k0.getSearchField());
        return true;
    }

    @Override // org.telegram.ui.Components.ul0
    public final void h(boolean z10) {
        super.h(z10);
        an anVar = this.J;
        org.telegram.ui.ActionBar.q0 q0Var = anVar.k0;
        g(q0Var != null && q0Var.w() && a() && anVar.J3 == null);
    }
}
