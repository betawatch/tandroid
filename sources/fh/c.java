package fh;

import android.graphics.Canvas;
import android.graphics.Paint;
import ch.f;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
