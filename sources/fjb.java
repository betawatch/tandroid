// default package

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class fjb extends FrameLayout {
    public final hjb a;
    public boolean b;
    public boolean c;
    public boolean d;

    public fjb(hjb hjbVar, View view, boolean z) {
        super(hjbVar.getContext());
        this.a = hjbVar;
        setWillNotDraw(false);
        if (!z) {
            setPadding(hl.L(12.66f), hl.L(9.33f), hl.L(12.66f), hl.L(9.33f));
        }
        addView(view, tre.c(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z = this.c;
        hjb hjbVar = this.a;
        if (z || this.d) {
            canvas2 = canvas;
            float L = hl.L(10.0f);
            float[] fArr = hjbVar.c;
            float f = hjbVar.h;
            Path path = hjbVar.b;
            boolean z2 = this.c;
            float f2 = z2 ? L : 0.0f;
            fArr[1] = f2;
            fArr[0] = f2;
            float f3 = z2 ? L : 0.0f;
            fArr[3] = f3;
            fArr[2] = f3;
            boolean z3 = this.d;
            float f4 = z3 ? L : 0.0f;
            fArr[5] = f4;
            fArr[4] = f4;
            if (!z3) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            path.rewind();
            RectF rectF = hl.P;
            rectF.set(f, f, getWidth() - f, ((this.d ? -1.0f : 1.0f) * f) + getHeight());
            path.addRoundRect(rectF, hjbVar.c, Path.Direction.CW);
            if (this.b) {
                canvas2.drawPath(path, hjbVar.d);
            }
            canvas2.drawPath(path, hjbVar.e);
        } else {
            if (this.b) {
                float f5 = hjbVar.h;
                float f6 = hjbVar.h;
                canvas2 = canvas;
                canvas2.drawRect(f5, f5, getWidth() + f6, getHeight() + f6, hjbVar.d);
            } else {
                canvas2 = canvas;
            }
            float f7 = hjbVar.h;
            float f8 = hjbVar.h;
            canvas2.drawRect(f7, f7, getWidth() - f8, getHeight() + f8, hjbVar.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z) {
        this.b = z;
    }
}
