// default package

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class gjb extends TextView {
    public final hjb a;
    public boolean b;
    public boolean c;

    public gjb(hjb hjbVar, String str) {
        super(hjbVar.getContext());
        this.a = hjbVar;
        vnb vnbVar = hjbVar.a;
        setPadding(hl.L(12.66f), hl.L(9.33f), hl.L(12.66f), hl.L(9.33f));
        yob.X(this, aob.G6, vnbVar);
        setTypeface(hl.o());
        setTextSize(1, 14.0f);
        setText(str);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z = this.b;
        hjb hjbVar = this.a;
        if (z || this.c) {
            canvas2 = canvas;
            float L = hl.L(10.0f);
            float[] fArr = hjbVar.c;
            float f = hjbVar.h;
            Path path = hjbVar.b;
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
            RectF rectF = hl.P;
            rectF.set(f, f, getWidth() + f, ((this.c ? -1 : 1) * f) + getHeight());
            path.addRoundRect(rectF, hjbVar.c, Path.Direction.CW);
            canvas2.drawPath(path, hjbVar.d);
            canvas2.drawPath(path, hjbVar.e);
        } else {
            float f3 = hjbVar.h;
            float f4 = hjbVar.h;
            canvas2 = canvas;
            canvas2.drawRect(f3, f3, getWidth() + f4, getHeight() + f4, hjbVar.d);
            float f5 = hjbVar.h;
            canvas2.drawRect(f5, f5, getWidth() + f4, getHeight() + f4, hjbVar.e);
        }
        super.onDraw(canvas2);
    }
}
