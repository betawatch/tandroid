package fh;

import android.graphics.Canvas;
import android.graphics.Paint;
import ch.f;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
