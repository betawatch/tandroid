package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class d6 {
    public final l5 a;
    public final StaticLayout b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final /* synthetic */ g6 i;

    public d6(g6 g6Var, StaticLayout staticLayout, float f10, int i7) {
        this.i = g6Var;
        this.b = staticLayout;
        this.d = i7;
        this.c = f10;
        this.e = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineLeft(0);
        this.f = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineWidth(0);
        this.g = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineBaseline(0);
        this.h = staticLayout != null ? staticLayout.getHeight() - this.g : 0.0f;
        if (g6Var.getCallback() instanceof View) {
            this.a = p5.update(g6Var.p, (View) g6Var.getCallback(), this.a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f10) {
        g6 g6Var = this.i;
        int i7 = g6Var.C;
        TextPaint textPaint = g6Var.a;
        int max = Math.max(0, Math.min(org.telegram.messenger.ns.e4, (int) (i7 * f10)));
        if (max == 0) {
            return;
        }
        textPaint.setAlpha(org.telegram.messenger.ns.e4);
        if (g6Var.V) {
            textPaint.setShadowLayer(g6Var.W, 0.0f, g6Var.X, g6Var.Y);
        }
        int saveLayerAlpha = max < 255 ? canvas.saveLayerAlpha(null, max, 31) : -1;
        this.b.draw(canvas);
        p5.drawAnimatedEmojis(canvas, this.b, this.a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, g6Var.b0);
        if (saveLayerAlpha != -1) {
            canvas.restoreToCount(saveLayerAlpha);
        }
    }
}
