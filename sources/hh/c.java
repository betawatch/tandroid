package hh;

import android.graphics.Canvas;
import android.graphics.Paint;
import eh.f;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class c implements a, ri.a {
    public final Paint a = new Paint(1);
    public int b;

    public final void a(int i10) {
        if (this.b != i10) {
            this.b = i10;
            this.a.setColor(i10);
        }
    }

    @Override // hh.a
    public final eh.d f() {
        return new f(this);
    }

    @Override // ri.a
    public final void w(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.drawRect(f7, f10, f11, f12, this.a);
    }
}
