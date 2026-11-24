// default package

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class khb extends FrameLayout {
    public final mhb a;
    public boolean b;
    public boolean c;
    public boolean d;

    public khb(mhb mhbVar, View view, boolean z) {
        super(mhbVar.getContext());
        this.a = mhbVar;
        setWillNotDraw(false);
        if (!z) {
            setPadding(gm.L(12.66f), gm.L(9.33f), gm.L(12.66f), gm.L(9.33f));
        }
        addView(view, qoe.c(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z = this.c;
        mhb mhbVar = this.a;
        if (z || this.d) {
            canvas2 = canvas;
            float L = gm.L(10.0f);
            float[] fArr = mhbVar.c;
            float f = mhbVar.h;
            Path path = mhbVar.b;
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
            RectF rectF = gm.P;
            rectF.set(f, f, getWidth() - f, ((this.d ? -1.0f : 1.0f) * f) + getHeight());
            path.addRoundRect(rectF, mhbVar.c, Path.Direction.CW);
            if (this.b) {
                canvas2.drawPath(path, mhbVar.d);
            }
            canvas2.drawPath(path, mhbVar.e);
        } else {
            if (this.b) {
                float f5 = mhbVar.h;
                float f6 = mhbVar.h;
                canvas2 = canvas;
                canvas2.drawRect(f5, f5, getWidth() + f6, getHeight() + f6, mhbVar.d);
            } else {
                canvas2 = canvas;
            }
            float f7 = mhbVar.h;
            float f8 = mhbVar.h;
            canvas2.drawRect(f7, f7, getWidth() - f8, getHeight() + f8, mhbVar.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z) {
        this.b = z;
    }
}
