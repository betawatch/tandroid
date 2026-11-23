package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class hl extends org.telegram.ui.Cells.a0 {
    public final /* synthetic */ kl f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl(kl klVar, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, context, h6Var);
        this.f = klVar;
    }

    @Override // org.telegram.ui.Cells.a0
    public final int getSideMenuWidth() {
        bn bnVar = this.f.R;
        int i7 = bn.md;
        return bnVar.n9();
    }
}
