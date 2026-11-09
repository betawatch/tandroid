package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class tx extends av0 {
    public final /* synthetic */ int G3;
    public final /* synthetic */ ux H3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx(ux uxVar, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(i7, context, g6Var);
        this.H3 = uxVar;
        this.G3 = i10;
    }

    @Override // org.telegram.ui.Components.av0
    public final boolean D1() {
        return org.telegram.messenger.sc.e(8200);
    }

    @Override // org.telegram.ui.Components.av0
    public final void H1(int i7) {
        uv uvVar;
        lw lwVar;
        super.H1(i7);
        ux uxVar = this.H3;
        hy hyVar = uxVar.G;
        tx txVar = uxVar.r;
        boolean z9 = txVar.getSelectedCategory() == null;
        int i10 = hy.U2;
        hyVar.M(z9);
        int i11 = this.G3;
        if (i11 == 1 && (lwVar = hyVar.I) != null) {
            lwVar.n(txVar.getSelectedCategory() == null);
        } else if (i11 == 0 && (uvVar = hyVar.B0) != null) {
            uvVar.o0 = txVar.getSelectedCategory() == null;
            uvVar.invalidate();
        }
        uxVar.g(false);
    }
}
