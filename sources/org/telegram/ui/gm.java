package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class gm extends org.telegram.ui.Cells.b0 {
    public final /* synthetic */ nm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm(nm nmVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.f = nmVar;
    }

    @Override // org.telegram.ui.Cells.b0
    public final int getSideMenuWidth() {
        bo boVar = this.f.Q;
        int i10 = bo.Gc;
        return boVar.R8();
    }
}
