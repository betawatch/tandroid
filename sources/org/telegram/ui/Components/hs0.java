package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
