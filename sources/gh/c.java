package gh;

import android.graphics.Canvas;
import android.graphics.Paint;
import dh.f;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
