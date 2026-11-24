// default package

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class jfb extends FrameLayout {
    public final mfb a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public jfb(mfb mfbVar, View view, boolean z) {
        super(mfbVar.getContext());
        this.d = false;
        this.e = true;
        this.a = mfbVar;
        setWillNotDraw(false);
        if (!z) {
            setPadding(gl.L(12.66f), gl.L(9.33f), gl.L(12.66f), gl.L(9.33f));
        }
        addView(view, nme.c(-1.0f, -1));
    }

    @Override // android.view.View
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
            RectF rectF = gl.P;
            rectF.set(f, f, getWidth() - f, ((this.c ? -1.0f : 1.0f) * f) + getHeight());
            if (!this.e) {
                rectF.right += mfbVar.f;
            }
            path.addRoundRect(rectF, mfbVar.c, Path.Direction.CW);
            canvas2.drawPath(path, mfbVar.e);
        } else {
            float f5 = mfbVar.h;
            float f6 = mfbVar.h;
            canvas2 = canvas;
            canvas2.drawRect(f5, f5, getWidth() - f6, getHeight() + f6, mfbVar.e);
        }
        super.onDraw(canvas2);
    }
}
