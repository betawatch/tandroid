// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class hz3 extends FrameLayout {
    public final Paint a;
    public final /* synthetic */ t14 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz3(t14 t14Var, Context context) {
        super(context);
        this.b = t14Var;
        this.a = new Paint();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        t14 t14Var = this.b;
        gz3 gz3Var = t14Var.C0;
        float L = gl.L(50.0f) * t14Var.u1.o();
        if (L > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (L != 0.0f) {
            canvas.clipRect(0.0f, L, getMeasuredWidth(), getMeasuredHeight());
        }
        int y = t14Var.y(bkb.yf);
        Paint paint = this.a;
        paint.setColor(y);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), gz3Var.getExpandedOffset() + gl.L(36.0f), paint);
        super.dispatchDraw(canvas);
        if (gz3Var.s != null) {
            canvas.save();
            float f = gz3Var.d0 - gz3Var.e0;
            float f2 = gz3Var.w;
            if (f2 > 0.0f) {
                f = ((gz3Var.s.getX() - gz3Var.getScrollX()) * gz3Var.w) + ((1.0f - f2) * f);
            }
            canvas.translate(f, 0.0f);
            gz3Var.s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b.Z();
    }
}
