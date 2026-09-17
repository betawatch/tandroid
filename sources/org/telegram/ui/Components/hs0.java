package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class hs0 extends xw0 {
    public final /* synthetic */ xu0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs0(xu0 xu0Var, Context context, t00 t00Var) {
        super(context, t00Var, 1, null);
        this.K = xu0Var;
    }

    @Override // org.telegram.ui.Components.xw0
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
