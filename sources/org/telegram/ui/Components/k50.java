package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class k50 extends s50 {
    public final /* synthetic */ f60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k50(f60 f60Var, Context context) {
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
