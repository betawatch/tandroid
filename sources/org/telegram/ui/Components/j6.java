package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class j6 {
    public final t5 a;
    public final StaticLayout b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final /* synthetic */ m6 g;

    public j6(m6 m6Var, StaticLayout staticLayout, float f7, int i10) {
        this.g = m6Var;
        this.b = staticLayout;
        this.d = i10;
        this.c = f7;
        float f10 = 0.0f;
        this.e = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineLeft(0);
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineWidth(0);
        }
        this.f = f10;
        if (m6Var.getCallback() instanceof View) {
            this.a = x5.update(m6Var.l, (View) m6Var.getCallback(), this.a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        this.b.draw(canvas);
        x5.drawAnimatedEmojis(canvas, this.b, this.a, 0.0f, null, 0.0f, 0.0f, 0.0f, f7, this.g.U);
    }
}
