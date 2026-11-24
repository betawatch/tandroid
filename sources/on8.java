// default package

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class on8 extends nd4 {
    @Override // nd4, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        canvas.translate(gl.L(2.0f), 0.0f);
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
        canvas.restore();
    }
}
