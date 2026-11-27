// default package

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class oi8 extends d79 {
    public final n15 f3;
    public long g3;
    public final /* synthetic */ ui8 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi8(ui8 ui8Var, Context context) {
        super(context, null);
        this.h3 = ui8Var;
        this.f3 = new n15(8);
    }

    @Override // d79
    public final boolean G0(float f) {
        return f >= ((float) (this.h3.y1 + hl.m));
    }

    @Override // d79, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        ui8 ui8Var = this.h3;
        if (ui8Var.F1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.g3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.g3 = elapsedRealtime;
            ui8Var.D1 = qu6.d(abs, ui8Var.E1, 1800.0f, ui8Var.D1);
            while (true) {
                f = ui8Var.D1;
                float f2 = ui8Var.E1 * 2.0f;
                if (f < f2) {
                    break;
                } else {
                    ui8Var.D1 = f - f2;
                }
            }
            ui8Var.C1.setTranslate(f, 0.0f);
            ui8Var.B1.setLocalMatrix(ui8Var.C1);
            i1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - hl.n;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        n15 n15Var = this.f3;
        n15Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        n15Var.b(aob.v0(aob.i5, this.o2));
        n15Var.draw(canvas);
    }
}
