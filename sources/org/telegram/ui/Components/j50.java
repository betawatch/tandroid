package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class j50 extends r50 {
    public final /* synthetic */ x50 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j50(x50 x50Var, Context context) {
        super(x50Var, context);
        this.d = x50Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.d.invalidate();
    }

    @Override // android.view.View
    public final void setRotationY(float f10) {
        super.setRotationY(f10);
        this.d.invalidate();
    }
}
