package gh;

import android.graphics.Canvas;
import android.graphics.Paint;
import dh.f;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class c implements a {
    public final Paint a = new Paint(1);

    public final void a(int i10) {
        this.a.setColor(i10);
    }

    @Override // gh.a
    public final dh.d f() {
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
