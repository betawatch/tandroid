package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class n6 {
    public final x5 a;
    public final StaticLayout b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final /* synthetic */ q6 i;

    public n6(q6 q6Var, StaticLayout staticLayout, float f7, int i10) {
        this.i = q6Var;
        this.b = staticLayout;
        this.d = i10;
        this.c = f7;
        this.e = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineLeft(0);
        this.f = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineWidth(0);
        this.g = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineBaseline(0);
        this.h = staticLayout != null ? staticLayout.getHeight() - this.g : 0.0f;
        if (q6Var.getCallback() instanceof View) {
            this.a = b6.update(q6Var.p, (View) q6Var.getCallback(), this.a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        q6 q6Var = this.i;
        int i10 = q6Var.B;
        TextPaint textPaint = q6Var.a;
        int max = Math.max(0, Math.min(255, (int) (i10 * f7)));
        if (max == 0) {
            return;
        }
        textPaint.setAlpha(255);
        if (q6Var.U) {
            textPaint.setShadowLayer(q6Var.V, 0.0f, q6Var.W, q6Var.X);
        }
        int saveLayerAlpha = max < 255 ? canvas.saveLayerAlpha(null, max, 31) : -1;
        this.b.draw(canvas);
        b6.drawAnimatedEmojis(canvas, this.b, this.a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, q6Var.a0);
        if (saveLayerAlpha != -1) {
            canvas.restoreToCount(saveLayerAlpha);
        }
    }
}
