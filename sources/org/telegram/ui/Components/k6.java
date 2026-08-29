package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k6 {
    public final u5 a;
    public final StaticLayout b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final /* synthetic */ n6 g;

    public k6(n6 n6Var, StaticLayout staticLayout, float f9, int i10) {
        this.g = n6Var;
        this.b = staticLayout;
        this.d = i10;
        this.c = f9;
        float f10 = 0.0f;
        this.e = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineLeft(0);
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineWidth(0);
        }
        this.f = f10;
        if (n6Var.getCallback() instanceof View) {
            this.a = y5.update(n6Var.l, (View) n6Var.getCallback(), this.a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f9) {
        this.b.draw(canvas);
        y5.drawAnimatedEmojis(canvas, this.b, this.a, 0.0f, null, 0.0f, 0.0f, 0.0f, f9, this.g.U);
    }
}
