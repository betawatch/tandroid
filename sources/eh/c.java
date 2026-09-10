package eh;

import android.graphics.Canvas;
import android.graphics.Paint;
import bh.f;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class c implements a {
    public final Paint a = new Paint(1);

    public final void a(int i10) {
        this.a.setColor(i10);
    }

    @Override // eh.a
    public final bh.d k() {
        return new f(this);
    }

    @Override // eh.a
    public final void u(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.drawRect(f7, f10, f11, f12, this.a);
    }

    @Override // eh.a
    public final /* synthetic */ void b() {
    }
}
