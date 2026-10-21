package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class et0 extends tx0 {
    public final /* synthetic */ uv0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et0(uv0 uv0Var, Context context, b10 b10Var) {
        super(context, b10Var, 1, null);
        this.K = uv0Var;
    }

    @Override // org.telegram.ui.Components.tx0
    public final void a() {
        invalidate();
        this.K.G0();
    }
}
