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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ksa extends View {
    public float E;
    public float F;
    public final Camera G;
    public final in3 H;
    public final RectF I;
    public fsa a;
    public fsa b;
    public fsa c;
    public float d;
    public float e;
    public float f;
    public boolean h;
    public boolean n;
    public boolean r;
    public esa s;
    public esa w;
    public esa x;
    public float y;

    public ksa(Context context) {
        super(context);
        this.G = new Camera();
        this.H = new in3((byte) 7);
        this.I = new RectF();
    }

    public final void a(Canvas canvas, esa esaVar, float f, float f2, float f3, int[] iArr, int[] iArr2, int[] iArr3) {
        if (esaVar != null) {
            Matrix matrix = esaVar.d;
            Paint paint = esaVar.c;
            float f4 = (f - 0.5f) / 1.5f;
            float l = Utilities.l(1.0f - Math.abs(f4));
            float max = Math.max(0.8f * f2, gm.L(180.0f));
            float v = aq1.v(f4, max, 1.8f, f2 / 2.0f);
            float min = Math.min(gm.L(176.0f), f3) / 2.0f;
            float f5 = v - max;
            float f6 = v + max;
            canvas.saveLayerAlpha(f5, 0.0f, f6, f3, nm7.d4, 31);
            matrix.reset();
            matrix.postTranslate(v, min);
            esaVar.e.setLocalMatrix(matrix);
            paint.setAlpha((int) (l * 255.0f));
            canvas.drawRect(f5, 0.0f, f6, f3, paint);
            canvas.save();
            float L = gm.L(90.0f);
            RectF rectF = this.I;
            rectF.set(f5, 0.0f, f5 + L, f3);
            in3 in3Var = this.H;
            in3Var.r(canvas, rectF, 0, 1.0f);
            rectF.set(f6 - L, 0.0f, f6, f3);
            in3Var.r(canvas, rectF, 2, 1.0f);
            canvas.restore();
            canvas.restore();
            for (int i = 0; i < iArr.length; i++) {
                float width = (getWidth() / (iArr.length - 1)) * i;
                iArr[i] = cmb.v(iArr[i], cmb.p1(l * ((width < f5 || width > f6) ? 0.0f : Math.min(Utilities.l((width - f5) / max), Utilities.l(1.0f - ((width - (f6 - max)) / max)))), esaVar.g));
            }
            for (int i2 = 0; i2 < iArr2.length; i2++) {
                float width2 = (getWidth() / (iArr2.length - 1)) * i2;
                iArr2[i2] = cmb.v(iArr2[i2], cmb.p1(l * ((width2 < f5 || width2 > f6) ? 0.0f : Math.min(Utilities.l((width2 - f5) / max), Utilities.l(1.0f - ((width2 - (f6 - max)) / max)))), esaVar.f));
            }
            for (int i3 = 0; i3 < iArr3.length; i3++) {
                float width3 = (getWidth() / (iArr2.length - 1)) * i3;
                iArr3[i3] = cmb.v(iArr3[i3], cmb.p1(l * ((width3 < f5 || width3 > f6) ? 0.0f : Math.min(Utilities.l((width3 - f5) / max), Utilities.l(1.0f - ((width3 - (f6 - max)) / max)))), esaVar.h));
            }
        }
    }

    public final void b(Canvas canvas, fsa fsaVar, float f, boolean z) {
        if (fsaVar == null) {
            return;
        }
        ImageReceiver imageReceiver = fsaVar.d;
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
        float width = (getWidth() / 2.0f) - (gm.L(220.0f) * f7);
        float L = gm.L(80.0f);
        float R1 = gm.R1(0.85f, 1.0f, l);
        float L2 = gm.L(160.0f);
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
