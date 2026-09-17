package gh;

import android.graphics.Canvas;
import android.graphics.Paint;
import dh.f;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class c implements a {
    public final Paint a = new Paint(1);

    public final void a(int i10) {
        this.a.setColor(i10);
    }

    @Override // gh.a
    public final dh.d k() {
        return new f(this);
    }

    @Override // gh.a
    public final void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.drawRect(f7, f10, f11, f12, this.a);
    }

    @Override // gh.a
    public final /* synthetic */ void e() {
    }
}
