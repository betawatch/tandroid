package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class s50 extends b60 {
    public final /* synthetic */ p60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s50(p60 p60Var, Context context) {
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
