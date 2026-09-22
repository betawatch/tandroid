package fh;

import android.graphics.Canvas;
import android.graphics.Paint;
import ch.f;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class c implements a {
    public final Paint a = new Paint(1);

    public final void a(int i10) {
        this.a.setColor(i10);
    }

    @Override // fh.a
    public final ch.d l() {
        return new f(this);
    }

    @Override // fh.a
    public final void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.drawRect(f7, f10, f11, f12, this.a);
    }

    @Override // fh.a
    public final /* synthetic */ void d() {
    }
}
