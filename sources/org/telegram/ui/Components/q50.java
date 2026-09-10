package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class q50 extends z50 {
    public final /* synthetic */ f60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q50(f60 f60Var, Context context) {
        super(f60Var, context);
        this.d = f60Var;
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
