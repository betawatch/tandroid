package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class m40 extends t40 {
    public final /* synthetic */ e50 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m40(e50 e50Var, Context context) {
        super(e50Var, context);
        this.d = e50Var;
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
