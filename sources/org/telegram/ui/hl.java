package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class hl extends org.telegram.ui.Cells.a0 {
    public final /* synthetic */ kl f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl(kl klVar, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, context, i6Var);
        this.f = klVar;
    }

    @Override // org.telegram.ui.Cells.a0
    public final int getSideMenuWidth() {
        bn bnVar = this.f.R;
        int i7 = bn.md;
        return bnVar.n9();
    }
}
