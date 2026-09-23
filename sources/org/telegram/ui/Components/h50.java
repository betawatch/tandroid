package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class h50 extends q50 {
    public final /* synthetic */ x50 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h50(x50 x50Var, Context context) {
        super(x50Var, context);
        this.d = x50Var;
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
