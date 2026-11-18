package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class j6 {
    public final t5 a;
    public final StaticLayout b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final /* synthetic */ m6 i;

    public j6(m6 m6Var, StaticLayout staticLayout, float f10, int i7) {
        this.i = m6Var;
        this.b = staticLayout;
        this.d = i7;
        this.c = f10;
        this.e = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineLeft(0);
        this.f = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineWidth(0);
        this.g = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineBaseline(0);
        this.h = staticLayout != null ? staticLayout.getHeight() - this.g : 0.0f;
        if (m6Var.getCallback() instanceof View) {
            this.a = x5.update(m6Var.p, (View) m6Var.getCallback(), this.a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f10) {
        m6 m6Var = this.i;
        int i7 = m6Var.C;
        TextPaint textPaint = m6Var.a;
        int max = Math.max(0, Math.min(org.telegram.messenger.ks.e4, (int) (i7 * f10)));
        if (max == 0) {
            return;
        }
        textPaint.setAlpha(org.telegram.messenger.ks.e4);
        if (m6Var.V) {
            textPaint.setShadowLayer(m6Var.W, 0.0f, m6Var.X, m6Var.Y);
        }
        int saveLayerAlpha = max < 255 ? canvas.saveLayerAlpha(null, max, 31) : -1;
        this.b.draw(canvas);
        x5.drawAnimatedEmojis(canvas, this.b, this.a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, m6Var.b0);
        if (saveLayerAlpha != -1) {
            canvas.restoreToCount(saveLayerAlpha);
        }
    }
}
