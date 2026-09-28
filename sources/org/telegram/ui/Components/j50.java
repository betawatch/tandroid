package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class j50 extends r50 {
    public final /* synthetic */ e60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j50(e60 e60Var, Context context) {
        super(e60Var, context);
        this.d = e60Var;
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
