package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e6 {
    public final m5 a;
    public final StaticLayout b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final /* synthetic */ h6 i;

    public e6(h6 h6Var, StaticLayout staticLayout, float f10, int i7) {
        this.i = h6Var;
        this.b = staticLayout;
        this.d = i7;
        this.c = f10;
        this.e = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineLeft(0);
        this.f = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineWidth(0);
        this.g = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineBaseline(0);
        this.h = staticLayout != null ? staticLayout.getHeight() - this.g : 0.0f;
        if (h6Var.getCallback() instanceof View) {
            this.a = q5.update(h6Var.p, (View) h6Var.getCallback(), this.a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f10) {
        h6 h6Var = this.i;
        int i7 = h6Var.B;
        TextPaint textPaint = h6Var.a;
        int max = Math.max(0, Math.min(org.telegram.messenger.qs.e4, (int) (i7 * f10)));
        if (max == 0) {
            return;
        }
        textPaint.setAlpha(org.telegram.messenger.qs.e4);
        if (h6Var.U) {
            textPaint.setShadowLayer(h6Var.V, 0.0f, h6Var.W, h6Var.X);
        }
        int saveLayerAlpha = max < 255 ? canvas.saveLayerAlpha(null, max, 31) : -1;
        this.b.draw(canvas);
        q5.drawAnimatedEmojis(canvas, this.b, this.a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, h6Var.a0);
        if (saveLayerAlpha != -1) {
            canvas.restoreToCount(saveLayerAlpha);
        }
    }
}
