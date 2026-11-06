package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ak extends org.telegram.ui.Components.ql0 {
    public final /* synthetic */ an I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(an anVar, Context context, an anVar2, int i7, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, anVar2, i7, j3, f6Var);
        this.I = anVar;
    }

    @Override // org.telegram.ui.Components.ql0
    public final void b(boolean z9) {
        an anVar = this.I;
        anVar.H7();
        anVar.F7();
        hk hkVar = anVar.xb;
        if (hkVar != null) {
            hkVar.setTranslationY(anVar.P9 + getCurrentHeight());
        }
        if (z9) {
            anVar.W9 = true;
            anVar.Nc();
        }
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean f(ch.o0 o0Var) {
        int i7;
        an anVar = this.I;
        anVar.E3 = o0Var;
        anVar.F3 = o0Var != null;
        if (o0Var == null) {
            org.telegram.messenger.ui mediaDataController = anVar.getMediaDataController();
            mediaDataController.Y0.clear();
            mediaDataController.Z0.clear();
            mediaDataController.a1.clear();
            anVar.Mb(false);
            anVar.jd(0, 0, -1);
        }
        anVar.md();
        anVar.Zc();
        anVar.H3 = anVar.j0.getSearchField().getText().toString();
        org.telegram.messenger.ui mediaDataController2 = anVar.getMediaDataController();
        String str = anVar.H3;
        long j3 = anVar.j6;
        long j10 = anVar.b7;
        i7 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
        mediaDataController2.X1(str, j3, j10, i7, 0, anVar.r4, false, anVar.C3, anVar.D3, (TextUtils.isEmpty(anVar.H3) && anVar.E3 == null) ? false : true, anVar.E3);
        org.telegram.messenger.g0.v1(anVar.j0.getSearchField());
        return true;
    }

    @Override // org.telegram.ui.Components.ql0
    public final void h(boolean z9) {
        super.h(z9);
        an anVar = this.I;
        org.telegram.ui.ActionBar.r0 r0Var = anVar.j0;
        g(r0Var != null && r0Var.v() && a() && anVar.I3 == null);
    }
}
