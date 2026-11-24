// default package

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jhb extends FrameLayout {
    public final mhb a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public jhb(mhb mhbVar, View view, boolean z) {
        super(mhbVar.getContext());
        this.d = false;
        this.e = true;
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
        boolean z = this.b;
        mhb mhbVar = this.a;
        if (z || this.c) {
            canvas2 = canvas;
            float L = gm.L(10.0f);
            float[] fArr = mhbVar.c;
            float f = mhbVar.h;
            Path path = mhbVar.b;
            boolean z2 = this.b;
            float f2 = (z2 && this.d) ? L : 0.0f;
            fArr[1] = f2;
            fArr[0] = f2;
            float f3 = (z2 && this.e) ? L : 0.0f;
            fArr[3] = f3;
            fArr[2] = f3;
            boolean z3 = this.c;
            float f4 = (z3 && this.e) ? L : 0.0f;
            fArr[5] = f4;
            fArr[4] = f4;
            if (!z3 || !this.d) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            path.rewind();
            RectF rectF = gm.P;
            rectF.set(f, f, getWidth() - f, ((this.c ? -1.0f : 1.0f) * f) + getHeight());
            if (!this.e) {
                rectF.right += mhbVar.f;
            }
            path.addRoundRect(rectF, mhbVar.c, Path.Direction.CW);
            canvas2.drawPath(path, mhbVar.e);
        } else {
            float f5 = mhbVar.h;
            float f6 = mhbVar.h;
            canvas2 = canvas;
            canvas2.drawRect(f5, f5, getWidth() - f6, getHeight() + f6, mhbVar.e);
        }
        super.onDraw(canvas2);
    }
}
