// default package

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class op8 extends of4 {
    @Override // of4, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        canvas.translate(gm.L(2.0f), 0.0f);
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
        canvas.restore();
    }
}
