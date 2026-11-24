// default package

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class kqa extends View {
    public float E;
    public float F;
    public final Camera G;
    public final xl3 H;
    public final RectF I;
    public fqa a;
    public fqa b;
    public fqa c;
    public float d;
    public float e;
    public float f;
    public boolean h;
    public boolean n;
    public boolean r;
    public eqa s;
    public eqa w;
    public eqa x;
    public float y;

    public kqa(Context context) {
        super(context);
        this.G = new Camera();
        this.H = new xl3((byte) 7);
        this.I = new RectF();
    }

    public final void a(Canvas canvas, eqa eqaVar, float f, float f2, float f3, int[] iArr, int[] iArr2, int[] iArr3) {
        if (eqaVar != null) {
            Matrix matrix = eqaVar.d;
            Paint paint = eqaVar.c;
            float f4 = (f - 0.5f) / 1.5f;
            float l = Utilities.l(1.0f - Math.abs(f4));
            float max = Math.max(0.8f * f2, gl.L(180.0f));
            float v = oo1.v(f4, max, 1.8f, f2 / 2.0f);
            float min = Math.min(gl.L(176.0f), f3) / 2.0f;
            float f5 = v - max;
            float f6 = v + max;
            canvas.saveLayerAlpha(f5, 0.0f, f6, f3, kk7.d4, 31);
            matrix.reset();
            matrix.postTranslate(v, min);
            eqaVar.e.setLocalMatrix(matrix);
            paint.setAlpha((int) (l * 255.0f));
            canvas.drawRect(f5, 0.0f, f6, f3, paint);
            canvas.save();
            float L = gl.L(90.0f);
            RectF rectF = this.I;
            rectF.set(f5, 0.0f, f5 + L, f3);
            xl3 xl3Var = this.H;
            xl3Var.s(canvas, rectF, 0, 1.0f);
            rectF.set(f6 - L, 0.0f, f6, f3);
            xl3Var.s(canvas, rectF, 2, 1.0f);
            canvas.restore();
            canvas.restore();
            for (int i = 0; i < iArr.length; i++) {
                float width = (getWidth() / (iArr.length - 1)) * i;
                iArr[i] = bkb.v(iArr[i], bkb.p1(l * ((width < f5 || width > f6) ? 0.0f : Math.min(Utilities.l((width - f5) / max), Utilities.l(1.0f - ((width - (f6 - max)) / max)))), eqaVar.g));
            }
            for (int i2 = 0; i2 < iArr2.length; i2++) {
                float width2 = (getWidth() / (iArr2.length - 1)) * i2;
                iArr2[i2] = bkb.v(iArr2[i2], bkb.p1(l * ((width2 < f5 || width2 > f6) ? 0.0f : Math.min(Utilities.l((width2 - f5) / max), Utilities.l(1.0f - ((width2 - (f6 - max)) / max)))), eqaVar.f));
            }
            for (int i3 = 0; i3 < iArr3.length; i3++) {
                float width3 = (getWidth() / (iArr2.length - 1)) * i3;
                iArr3[i3] = bkb.v(iArr3[i3], bkb.p1(l * ((width3 < f5 || width3 > f6) ? 0.0f : Math.min(Utilities.l((width3 - f5) / max), Utilities.l(1.0f - ((width3 - (f6 - max)) / max)))), eqaVar.h));
            }
        }
    }

    public final void b(Canvas canvas, fqa fqaVar, float f, boolean z) {
        if (fqaVar == null) {
            return;
        }
        ImageReceiver imageReceiver = fqaVar.d;
        float f2 = f;
        if (z) {
            f2 = Math.max(0.5f, f2);
        }
        float f3 = imageReceiver.L0;
        float f4 = imageReceiver.M0;
        float f5 = imageReceiver.N0;
        float f6 = imageReceiver.O0;
        float alpha = imageReceiver.getAlpha();
        float f7 = (f2 - 0.5f) / 1.5f;
        float l = Utilities.l(1.0f - Math.abs(f7));
        float width = (getWidth() / 2.0f) - (gl.L(220.0f) * f7);
        float L = gl.L(80.0f);
        float R1 = gl.R1(0.85f, 1.0f, l);
        float L2 = gl.L(160.0f);
        canvas.save();
        float f8 = ((L2 / 2.0f) * f7) + width;
        canvas.translate(f8, L);
        Camera camera = this.G;
        camera.save();
        camera.rotateY(f7 * (-30.0f));
        camera.applyToCanvas(canvas);
        camera.restore();
        canvas.translate(-f8, -L);
        float f9 = L2 * R1;
        float f10 = f9 / 2.0f;
        imageReceiver.i0(width - f10, L - f10, f9, f9);
        imageReceiver.setAlpha(l);
        imageReceiver.h(canvas, null);
        imageReceiver.i0(f3, f4, f5, f6);
        imageReceiver.setAlpha(alpha);
        canvas.restore();
    }

    public final void c() {
        boolean z = (this.a == null && this.b == null && this.c == null && this.s == null && this.w == null && this.x == null) ? false : true;
        this.c = null;
        this.b = null;
        this.a = null;
        this.f = 0.0f;
        this.e = 0.0f;
        this.d = 0.0f;
        this.r = false;
        this.n = false;
        this.h = false;
        this.x = null;
        this.w = null;
        this.s = null;
        this.F = 0.0f;
        this.E = 0.0f;
        this.y = 0.0f;
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        b(canvas, this.a, this.d, this.h);
        b(canvas, this.b, this.e, this.n);
        b(canvas, this.c, this.f, this.r);
    }
}
