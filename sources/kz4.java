// default package

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class kz4 implements iz4 {
    public final Paint a = new Paint(1);
    public int b;

    public final void a(int i) {
        if (this.b != i) {
            this.b = i;
            this.a.setColor(i);
        }
    }

    @Override // iz4
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        canvas.drawRect(f, f2, f3, f4, this.a);
    }
}
