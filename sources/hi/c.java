package hi;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class c implements a {
    public final Paint a = new Paint(1);
    public int b;

    public final void a(int i10) {
        if (this.b != i10) {
            this.b = i10;
            this.a.setColor(i10);
        }
    }

    @Override // hi.a
    public final void e(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.drawRect(f7, f10, f11, f12, this.a);
    }
}
