package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class m6 {
    public final w5 a;
    public final StaticLayout b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final /* synthetic */ p6 i;

    public m6(p6 p6Var, StaticLayout staticLayout, float f7, int i10) {
        this.i = p6Var;
        this.b = staticLayout;
        this.d = i10;
        this.c = f7;
        this.e = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineLeft(0);
        this.f = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineWidth(0);
        this.g = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineBaseline(0);
        this.h = staticLayout != null ? staticLayout.getHeight() - this.g : 0.0f;
        if (p6Var.getCallback() instanceof View) {
            this.a = a6.update(p6Var.p, (View) p6Var.getCallback(), this.a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        p6 p6Var = this.i;
        int i10 = p6Var.B;
        TextPaint textPaint = p6Var.a;
        int max = Math.max(0, Math.min(255, (int) (i10 * f7)));
        if (max == 0) {
            return;
        }
        textPaint.setAlpha(255);
        if (p6Var.U) {
            textPaint.setShadowLayer(p6Var.V, 0.0f, p6Var.W, p6Var.X);
        }
        int saveLayerAlpha = max < 255 ? canvas.saveLayerAlpha(null, max, 31) : -1;
        this.b.draw(canvas);
        a6.drawAnimatedEmojis(canvas, this.b, this.a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, p6Var.a0);
        if (saveLayerAlpha != -1) {
            canvas.restoreToCount(saveLayerAlpha);
        }
    }
}
