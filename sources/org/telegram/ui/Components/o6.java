package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class o6 {
    public final y5 a;
    public final StaticLayout b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final /* synthetic */ r6 i;

    public o6(r6 r6Var, StaticLayout staticLayout, float f7, int i10) {
        this.i = r6Var;
        this.b = staticLayout;
        this.d = i10;
        this.c = f7;
        this.e = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineLeft(0);
        this.f = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineWidth(0);
        this.g = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineBaseline(0);
        this.h = staticLayout != null ? staticLayout.getHeight() - this.g : 0.0f;
        if (r6Var.getCallback() instanceof View) {
            this.a = c6.update(r6Var.p, (View) r6Var.getCallback(), this.a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        r6 r6Var = this.i;
        int i10 = r6Var.B;
        TextPaint textPaint = r6Var.a;
        int max = Math.max(0, Math.min(255, (int) (i10 * f7)));
        if (max == 0) {
            return;
        }
        textPaint.setAlpha(255);
        if (r6Var.U) {
            textPaint.setShadowLayer(r6Var.V, 0.0f, r6Var.W, r6Var.X);
        }
        int saveLayerAlpha = max < 255 ? canvas.saveLayerAlpha(null, max, 31) : -1;
        this.b.draw(canvas);
        c6.drawAnimatedEmojis(canvas, this.b, this.a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, r6Var.a0);
        if (saveLayerAlpha != -1) {
            canvas.restoreToCount(saveLayerAlpha);
        }
    }
}
