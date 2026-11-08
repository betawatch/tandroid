package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class fl extends org.telegram.ui.Cells.f0 {
    public final /* synthetic */ jl L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl(jl jlVar, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i7, context, f6Var);
        this.L = jlVar;
    }

    @Override // org.telegram.ui.Cells.f0
    public final int getSideMenuWidth() {
        an anVar = this.L.Q;
        int i7 = an.id;
        return anVar.l9();
    }
}
