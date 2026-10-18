package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ct0 extends rx0 {
    public final /* synthetic */ sv0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct0(sv0 sv0Var, Context context, b10 b10Var) {
        super(context, b10Var, 1, null);
        this.K = sv0Var;
    }

    @Override // org.telegram.ui.Components.rx0
    public final void a() {
        invalidate();
        this.K.G0();
    }
}
