package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class k6 {
    public final u5 a;
    public final StaticLayout b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final /* synthetic */ n6 i;

    public k6(n6 n6Var, StaticLayout staticLayout, float f10, int i7) {
        this.i = n6Var;
        this.b = staticLayout;
        this.d = i7;
        this.c = f10;
        this.e = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineLeft(0);
        this.f = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineWidth(0);
        this.g = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineBaseline(0);
        this.h = staticLayout != null ? staticLayout.getHeight() - this.g : 0.0f;
        if (n6Var.getCallback() instanceof View) {
            this.a = y5.update(n6Var.p, (View) n6Var.getCallback(), this.a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f10) {
        n6 n6Var = this.i;
        int i7 = n6Var.C;
        TextPaint textPaint = n6Var.a;
        int max = Math.max(0, Math.min(org.telegram.messenger.ls.e4, (int) (i7 * f10)));
        if (max == 0) {
            return;
        }
        textPaint.setAlpha(org.telegram.messenger.ls.e4);
        if (n6Var.V) {
            textPaint.setShadowLayer(n6Var.W, 0.0f, n6Var.X, n6Var.Y);
        }
        int saveLayerAlpha = max < 255 ? canvas.saveLayerAlpha(null, max, 31) : -1;
        this.b.draw(canvas);
        y5.drawAnimatedEmojis(canvas, this.b, this.a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, n6Var.b0);
        if (saveLayerAlpha != -1) {
            canvas.restoreToCount(saveLayerAlpha);
        }
    }
}
