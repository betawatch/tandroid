package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class g50 extends o50 {
    public final /* synthetic */ c60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g50(c60 c60Var, Context context) {
        super(c60Var, context);
        this.d = c60Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.d.invalidate();
    }

    @Override // android.view.View
    public final void setRotationY(float f7) {
        super.setRotationY(f7);
        this.d.invalidate();
    }
}
