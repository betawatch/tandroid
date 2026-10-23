package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
