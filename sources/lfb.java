// default package

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class lfb extends TextView {
    public final mfb a;
    public boolean b;
    public boolean c;

    public lfb(mfb mfbVar, String str) {
        super(mfbVar.getContext());
        this.a = mfbVar;
        wjb wjbVar = mfbVar.a;
        setPadding(gl.L(12.66f), gl.L(9.33f), gl.L(12.66f), gl.L(9.33f));
        zkb.X(this, bkb.F6, wjbVar);
        setTypeface(gl.o());
        setTextSize(1, 14.0f);
        setText(str);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z = this.b;
        mfb mfbVar = this.a;
        if (z || this.c) {
            canvas2 = canvas;
            float L = gl.L(10.0f);
            float[] fArr = mfbVar.c;
            float f = mfbVar.h;
            Path path = mfbVar.b;
            float f2 = this.b ? L : 0.0f;
            fArr[1] = f2;
            fArr[0] = f2;
            fArr[3] = 0.0f;
            fArr[2] = 0.0f;
            fArr[5] = 0.0f;
            fArr[4] = 0.0f;
            if (!this.c) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            path.rewind();
            RectF rectF = gl.P;
            rectF.set(f, f, getWidth() + f, ((this.c ? -1 : 1) * f) + getHeight());
            path.addRoundRect(rectF, mfbVar.c, Path.Direction.CW);
            canvas2.drawPath(path, mfbVar.d);
            canvas2.drawPath(path, mfbVar.e);
        } else {
            float f3 = mfbVar.h;
            float f4 = mfbVar.h;
            canvas2 = canvas;
            canvas2.drawRect(f3, f3, getWidth() + f4, getHeight() + f4, mfbVar.d);
            float f5 = mfbVar.h;
            canvas2.drawRect(f5, f5, getWidth() + f4, getHeight() + f4, mfbVar.e);
        }
        super.onDraw(canvas2);
    }
}
