package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class vv extends w9 {
    public final /* synthetic */ yv G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(yv yvVar, Context context) {
        super(context);
        this.G = yvVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (zg.e0.b(this)) {
            return;
        }
        super.invalidate();
        this.G.f();
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (zg.e0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
