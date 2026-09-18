package fh;

import android.graphics.Canvas;
import android.graphics.Paint;
import ch.f;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class c implements a {
    public final Paint a = new Paint(1);

    public final void a(int i10) {
        this.a.setColor(i10);
    }

    @Override // fh.a
    public final ch.d d() {
        return new f(this);
    }

    @Override // fh.a
    public final void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.drawRect(f7, f10, f11, f12, this.a);
    }

    @Override // fh.a
    public final /* synthetic */ void b() {
    }
}
