package og;

import android.graphics.Canvas;
import android.graphics.Paint;
import lg.f;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c implements a {
    public final Paint a = new Paint(1);

    @Override // og.a
    public final void T0(Canvas canvas, float f10, float f11, float f12, float f13) {
        canvas.drawRect(f10, f11, f12, f13, this.a);
    }

    public final void a(int i10) {
        this.a.setColor(i10);
    }

    @Override // og.a
    public final lg.d w() {
        return new f(this);
    }

    @Override // og.a
    public final /* synthetic */ void r() {
    }
}
