package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
