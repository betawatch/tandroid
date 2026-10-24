package gh;

import android.graphics.Canvas;
import android.graphics.Paint;
import dh.f;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class c implements a {
    public final Paint a = new Paint(1);

    public final void a(int i10) {
        this.a.setColor(i10);
    }

    @Override // gh.a
    public final dh.d d() {
        return new f(this);
    }

    @Override // gh.a
    public final void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.drawRect(f7, f10, f11, f12, this.a);
    }

    @Override // gh.a
    public final /* synthetic */ void b() {
    }
}
