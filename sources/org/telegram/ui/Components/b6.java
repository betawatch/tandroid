package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b6 {
    public final k5 a;
    public final StaticLayout b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final /* synthetic */ e6 i;

    public b6(e6 e6Var, StaticLayout staticLayout, float f7, int i10) {
        this.i = e6Var;
        this.b = staticLayout;
        this.d = i10;
        this.c = f7;
        this.e = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineLeft(0);
        this.f = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineWidth(0);
        this.g = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineBaseline(0);
        this.h = staticLayout != null ? staticLayout.getHeight() - this.g : 0.0f;
        if (e6Var.getCallback() instanceof View) {
            this.a = o5.update(e6Var.p, (View) e6Var.getCallback(), this.a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        e6 e6Var = this.i;
        int i10 = e6Var.B;
        TextPaint textPaint = e6Var.a;
        int max = Math.max(0, Math.min(org.telegram.messenger.zs.e4, (int) (i10 * f7)));
        if (max == 0) {
            return;
        }
        textPaint.setAlpha(org.telegram.messenger.zs.e4);
        if (e6Var.U) {
            textPaint.setShadowLayer(e6Var.V, 0.0f, e6Var.W, e6Var.X);
        }
        int saveLayerAlpha = max < 255 ? canvas.saveLayerAlpha(null, max, 31) : -1;
        this.b.draw(canvas);
        o5.drawAnimatedEmojis(canvas, this.b, this.a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, e6Var.a0);
        if (saveLayerAlpha != -1) {
            canvas.restoreToCount(saveLayerAlpha);
        }
    }
}
