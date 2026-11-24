// default package

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lhb extends TextView {
    public final mhb a;
    public boolean b;
    public boolean c;

    public lhb(mhb mhbVar, String str) {
        super(mhbVar.getContext());
        this.a = mhbVar;
        ylb ylbVar = mhbVar.a;
        setPadding(gm.L(12.66f), gm.L(9.33f), gm.L(12.66f), gm.L(9.33f));
        anb.X(this, cmb.F6, ylbVar);
        setTypeface(gm.o());
        setTextSize(1, 14.0f);
        setText(str);
    }

    @Override // android.widget.TextView, android.view.View
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
            RectF rectF = gm.P;
            rectF.set(f, f, getWidth() + f, ((this.c ? -1 : 1) * f) + getHeight());
            path.addRoundRect(rectF, mhbVar.c, Path.Direction.CW);
            canvas2.drawPath(path, mhbVar.d);
            canvas2.drawPath(path, mhbVar.e);
        } else {
            float f3 = mhbVar.h;
            float f4 = mhbVar.h;
            canvas2 = canvas;
            canvas2.drawRect(f3, f3, getWidth() + f4, getHeight() + f4, mhbVar.d);
            float f5 = mhbVar.h;
            canvas2.drawRect(f5, f5, getWidth() + f4, getHeight() + f4, mhbVar.e);
        }
        super.onDraw(canvas2);
    }
}
