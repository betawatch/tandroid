package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class gl extends org.telegram.ui.Cells.a0 {
    public final /* synthetic */ jl f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(jl jlVar, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i7, context, f6Var);
        this.f = jlVar;
    }

    @Override // org.telegram.ui.Cells.a0
    public final int getSideMenuWidth() {
        an anVar = this.f.Q;
        int i7 = an.id;
        return anVar.l9();
    }
}
