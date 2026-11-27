// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class d29 extends Drawable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ e29 c;

    /* JADX WARN: Multi-variable type inference failed */
    public d29(e29 e29Var, int i, int i2) {
        this.c = e29Var;
        this.a = i;
        this.b = i2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = hl.Q;
        int centerX = getBounds().centerX();
        float f = this.a;
        int L = centerX - (hl.L(f) / 2);
        int centerY = getBounds().centerY();
        float f2 = this.b;
        rect.set(L, centerY - (hl.L(f2) / 2), (hl.L(f) / 2) + getBounds().centerX(), (hl.L(f2) / 2) + getBounds().centerY());
        e29 e29Var = this.c;
        e29Var.c.j0(rect);
        e29Var.c.h(canvas, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c.c.setAlpha(i / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.c.p1 = colorFilter;
    }
}
