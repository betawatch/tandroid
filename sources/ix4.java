// default package

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class ix4 implements gx4 {
    public final Paint a = new Paint(1);
    public int b;

    public final void a(int i) {
        if (this.b != i) {
            this.b = i;
            this.a.setColor(i);
        }
    }

    @Override // gx4
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        canvas.drawRect(f, f2, f3, f4, this.a);
    }
}
