package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class h50 extends p50 {
    public final /* synthetic */ c60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h50(c60 c60Var, Context context) {
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
