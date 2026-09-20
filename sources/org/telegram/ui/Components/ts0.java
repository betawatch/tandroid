package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ts0 extends jx0 {
    public final /* synthetic */ jv0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts0(jv0 jv0Var, Context context, t00 t00Var) {
        super(context, t00Var, 1, null);
        this.K = jv0Var;
    }

    @Override // org.telegram.ui.Components.jx0
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
