package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class m6 {
    public final v5 a;
    public final StaticLayout b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final /* synthetic */ p6 g;

    public m6(p6 p6Var, StaticLayout staticLayout, float f7, int i10) {
        this.g = p6Var;
        this.b = staticLayout;
        this.d = i10;
        this.c = f7;
        float f10 = 0.0f;
        this.e = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineLeft(0);
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineWidth(0);
        }
        this.f = f10;
        if (p6Var.getCallback() instanceof View) {
            this.a = z5.update(p6Var.l, (View) p6Var.getCallback(), this.a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        this.b.draw(canvas);
        z5.drawAnimatedEmojis(canvas, this.b, this.a, 0.0f, null, 0.0f, 0.0f, 0.0f, f7, this.g.U);
    }
}
