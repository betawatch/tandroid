package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sp0 implements ah.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ wl0 b;

    public /* synthetic */ sp0(wl0 wl0Var, int i10) {
        this.a = i10;
        this.b = wl0Var;
    }

    @Override // ah.n
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 0:
                return ((xp0) this.b).drawChild(canvas, view, j3);
            default:
                return ((cu0) this.b).drawChild(canvas, view, j3);
        }
    }
}
