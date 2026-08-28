package ng;

import android.graphics.Canvas;
import android.graphics.Paint;
import kg.f;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c implements a {
    public final Paint a = new Paint(1);

    @Override // ng.a
    public final void T0(Canvas canvas, float f10, float f11, float f12, float f13) {
        canvas.drawRect(f10, f11, f12, f13, this.a);
    }

    public final void a(int i9) {
        this.a.setColor(i9);
    }

    @Override // ng.a
    public final kg.d y() {
        return new f(this);
    }

    @Override // ng.a
    public final /* synthetic */ void t() {
    }
}
