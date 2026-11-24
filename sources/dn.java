// default package

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class dn {
    public final cm a;
    public final StaticLayout b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final /* synthetic */ gn i;

    public dn(gn gnVar, StaticLayout staticLayout, float f, int i) {
        this.i = gnVar;
        this.b = staticLayout;
        this.d = i;
        this.c = f;
        this.e = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineLeft(0);
        this.f = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineWidth(0);
        this.g = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineBaseline(0);
        this.h = staticLayout != null ? staticLayout.getHeight() - this.g : 0.0f;
        if (gnVar.getCallback() instanceof View) {
            this.a = gm.update(gnVar.p, (View) gnVar.getCallback(), this.a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f) {
        gn gnVar = this.i;
        int i = gnVar.C;
        TextPaint textPaint = gnVar.a;
        int max = Math.max(0, Math.min(kk7.d4, (int) (i * f)));
        if (max != 0) {
            textPaint.setAlpha(kk7.d4);
            if (gnVar.V) {
                textPaint.setShadowLayer(gnVar.W, 0.0f, gnVar.X, gnVar.Y);
            }
            int saveLayerAlpha = max < 255 ? canvas.saveLayerAlpha(null, max, 31) : -1;
            this.b.draw(canvas);
            gm.drawAnimatedEmojis(canvas, this.b, this.a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, gnVar.b0);
            if (saveLayerAlpha != -1) {
                canvas.restoreToCount(saveLayerAlpha);
            }
        }
    }
}
