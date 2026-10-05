package fh;

import android.graphics.Canvas;
import android.graphics.Paint;
import ch.f;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class c implements a, oi.a {
    public final Paint a = new Paint(1);
    public int b;

    public final void a(int i10) {
        if (this.b != i10) {
            this.b = i10;
            this.a.setColor(i10);
        }
    }

    @Override // fh.a
    public final ch.d b() {
        return new f(this);
    }

    @Override // oi.a
    public final void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.drawRect(f7, f10, f11, f12, this.a);
    }
}
