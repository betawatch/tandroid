// default package

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class en {
    public final dm a;
    public final StaticLayout b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final /* synthetic */ hn i;

    public en(hn hnVar, StaticLayout staticLayout, float f, int i) {
        this.i = hnVar;
        this.b = staticLayout;
        this.d = i;
        this.c = f;
        this.e = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineLeft(0);
        this.f = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineWidth(0);
        this.g = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineBaseline(0);
        this.h = staticLayout != null ? staticLayout.getHeight() - this.g : 0.0f;
        if (hnVar.getCallback() instanceof View) {
            this.a = hm.update(hnVar.p, (View) hnVar.getCallback(), this.a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f) {
        hn hnVar = this.i;
        int i = hnVar.C;
        TextPaint textPaint = hnVar.a;
        int max = Math.max(0, Math.min(jn7.d4, (int) (i * f)));
        if (max != 0) {
            textPaint.setAlpha(jn7.d4);
            if (hnVar.V) {
                textPaint.setShadowLayer(hnVar.W, 0.0f, hnVar.X, hnVar.Y);
            }
            int saveLayerAlpha = max < 255 ? canvas.saveLayerAlpha(null, max, 31) : -1;
            this.b.draw(canvas);
            hm.drawAnimatedEmojis(canvas, this.b, this.a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, hnVar.b0);
            if (saveLayerAlpha != -1) {
                canvas.restoreToCount(saveLayerAlpha);
            }
        }
    }
}
