// default package

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class eo {
    public final cn a;
    public final StaticLayout b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final /* synthetic */ ho i;

    public eo(ho hoVar, StaticLayout staticLayout, float f, int i) {
        this.i = hoVar;
        this.b = staticLayout;
        this.d = i;
        this.c = f;
        this.e = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineLeft(0);
        this.f = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineWidth(0);
        this.g = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineBaseline(0);
        this.h = staticLayout != null ? staticLayout.getHeight() - this.g : 0.0f;
        if (hoVar.getCallback() instanceof View) {
            this.a = gn.update(hoVar.p, (View) hoVar.getCallback(), this.a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f) {
        ho hoVar = this.i;
        int i = hoVar.C;
        TextPaint textPaint = hoVar.a;
        int max = Math.max(0, Math.min(nm7.d4, (int) (i * f)));
        if (max != 0) {
            textPaint.setAlpha(nm7.d4);
            if (hoVar.V) {
                textPaint.setShadowLayer(hoVar.W, 0.0f, hoVar.X, hoVar.Y);
            }
            int saveLayerAlpha = max < 255 ? canvas.saveLayerAlpha(null, max, 31) : -1;
            this.b.draw(canvas);
            gn.drawAnimatedEmojis(canvas, this.b, this.a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, hoVar.b0);
            if (saveLayerAlpha != -1) {
                canvas.restoreToCount(saveLayerAlpha);
            }
        }
    }
}
