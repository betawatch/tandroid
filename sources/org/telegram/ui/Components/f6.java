package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class f6 {
    public final n5 a;
    public final StaticLayout b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final /* synthetic */ i6 i;

    public f6(i6 i6Var, StaticLayout staticLayout, float f10, int i7) {
        this.i = i6Var;
        this.b = staticLayout;
        this.d = i7;
        this.c = f10;
        this.e = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineLeft(0);
        this.f = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineWidth(0);
        this.g = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineBaseline(0);
        this.h = staticLayout != null ? staticLayout.getHeight() - this.g : 0.0f;
        if (i6Var.getCallback() instanceof View) {
            this.a = r5.update(i6Var.p, (View) i6Var.getCallback(), this.a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f10) {
        i6 i6Var = this.i;
        int i7 = i6Var.B;
        TextPaint textPaint = i6Var.a;
        int max = Math.max(0, Math.min(org.telegram.messenger.qs.e4, (int) (i7 * f10)));
        if (max == 0) {
            return;
        }
        textPaint.setAlpha(org.telegram.messenger.qs.e4);
        if (i6Var.U) {
            textPaint.setShadowLayer(i6Var.V, 0.0f, i6Var.W, i6Var.X);
        }
        int saveLayerAlpha = max < 255 ? canvas.saveLayerAlpha(null, max, 31) : -1;
        this.b.draw(canvas);
        r5.drawAnimatedEmojis(canvas, this.b, this.a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, i6Var.a0);
        if (saveLayerAlpha != -1) {
            canvas.restoreToCount(saveLayerAlpha);
        }
    }
}
