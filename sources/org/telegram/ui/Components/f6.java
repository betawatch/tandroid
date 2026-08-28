package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f6 {
    public final p5 a;
    public final StaticLayout b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final /* synthetic */ i6 g;

    public f6(i6 i6Var, StaticLayout staticLayout, float f10, int i9) {
        this.g = i6Var;
        this.b = staticLayout;
        this.d = i9;
        this.c = f10;
        float f11 = 0.0f;
        this.e = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineLeft(0);
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineWidth(0);
        }
        this.f = f11;
        if (i6Var.getCallback() instanceof View) {
            this.a = t5.update(i6Var.l, (View) i6Var.getCallback(), this.a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f10) {
        this.b.draw(canvas);
        t5.drawAnimatedEmojis(canvas, this.b, this.a, 0.0f, null, 0.0f, 0.0f, 0.0f, f10, this.g.U);
    }
}
