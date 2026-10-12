package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class u50 extends c60 {
    public final /* synthetic */ p60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u50(p60 p60Var, Context context) {
        super(p60Var, context);
        this.d = p60Var;
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
