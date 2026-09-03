package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class g6 {
    public final q5 a;
    public final StaticLayout b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final /* synthetic */ j6 g;

    public g6(j6 j6Var, StaticLayout staticLayout, float f10, int i10) {
        this.g = j6Var;
        this.b = staticLayout;
        this.d = i10;
        this.c = f10;
        float f11 = 0.0f;
        this.e = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineLeft(0);
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineWidth(0);
        }
        this.f = f11;
        if (j6Var.getCallback() instanceof View) {
            this.a = u5.update(j6Var.l, (View) j6Var.getCallback(), this.a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f10) {
        this.b.draw(canvas);
        u5.drawAnimatedEmojis(canvas, this.b, this.a, 0.0f, null, 0.0f, 0.0f, 0.0f, f10, this.g.U);
    }
}
