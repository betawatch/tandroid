package ci;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x5 extends View {
    public float E;
    public float F;
    public final Camera G;
    public final k4.j H;
    public final RectF I;
    public s5 a;
    public s5 b;
    public s5 c;
    public float d;
    public float e;
    public float f;
    public boolean h;
    public boolean n;
    public boolean r;
    public r5 s;
    public r5 w;
    public r5 x;
    public float y;

    public x5(Context context) {
        super(context);
        this.G = new Camera();
        this.H = new k4.j(24);
        this.I = new RectF();
    }

    public final void a(Canvas canvas, r5 r5Var, float f10, float f11, float f12, int[] iArr, int[] iArr2, int[] iArr3) {
        if (r5Var != null) {
            Matrix matrix = r5Var.d;
            Paint paint = r5Var.c;
            if (paint == null) {
                return;
            }
            float f13 = (f10 - 0.5f) / 1.5f;
            float l10 = Utilities.l(1.0f - Math.abs(f13));
            float max = Math.max(0.8f * f11, org.telegram.messenger.g0.L(180.0f));
            float A = org.telegram.ui.Cells.f1.A(f13, max, 1.8f, f11 / 2.0f);
            float min = Math.min(org.telegram.messenger.g0.L(176.0f), f12) / 2.0f;
            float f14 = A - max;
            float f15 = A + max;
            canvas.saveLayerAlpha(f14, 0.0f, f15, f12, hs.e4, 31);
            matrix.reset();
            matrix.postTranslate(A, min);
            r5Var.e.setLocalMatrix(matrix);
            paint.setAlpha((int) (l10 * 255.0f));
            canvas.drawRect(f14, 0.0f, f15, f12, paint);
            canvas.save();
            float L = org.telegram.messenger.g0.L(90.0f);
            RectF rectF = this.I;
            rectF.set(f14, 0.0f, f14 + L, f12);
            k4.j jVar = this.H;
            jVar.w(canvas, rectF, 0, 1.0f);
            rectF.set(f15 - L, 0.0f, f15, f12);
            jVar.w(canvas, rectF, 2, 1.0f);
            canvas.restore();
            canvas.restore();
            for (int i3 = 0; i3 < iArr.length; i3++) {
                float width = (getWidth() / (iArr.length - 1)) * i3;
                iArr[i3] = org.telegram.ui.ActionBar.k6.w(iArr[i3], org.telegram.ui.ActionBar.k6.r1(l10 * ((width < f14 || width > f15) ? 0.0f : Math.min(Utilities.l((width - f14) / max), Utilities.l(1.0f - ((width - (f15 - max)) / max)))), r5Var.g));
            }
            for (int i10 = 0; i10 < iArr2.length; i10++) {
                float width2 = (getWidth() / (iArr2.length - 1)) * i10;
                iArr2[i10] = org.telegram.ui.ActionBar.k6.w(iArr2[i10], org.telegram.ui.ActionBar.k6.r1(l10 * ((width2 < f14 || width2 > f15) ? 0.0f : Math.min(Utilities.l((width2 - f14) / max), Utilities.l(1.0f - ((width2 - (f15 - max)) / max)))), r5Var.f));
            }
            for (int i11 = 0; i11 < iArr3.length; i11++) {
                float width3 = (getWidth() / (iArr2.length - 1)) * i11;
                iArr3[i11] = org.telegram.ui.ActionBar.k6.w(iArr3[i11], org.telegram.ui.ActionBar.k6.r1(l10 * ((width3 < f14 || width3 > f15) ? 0.0f : Math.min(Utilities.l((width3 - f14) / max), Utilities.l(1.0f - ((width3 - (f15 - max)) / max)))), r5Var.h));
            }
        }
    }

    public final void b(Canvas canvas, s5 s5Var, float f10, boolean z10) {
        if (s5Var == null) {
            return;
        }
        ImageReceiver imageReceiver = s5Var.d;
        float f11 = f10;
        if (z10) {
            f11 = Math.max(0.5f, f11);
        }
        float f12 = imageReceiver.L0;
        float f13 = imageReceiver.M0;
        float f14 = imageReceiver.N0;
        float f15 = imageReceiver.O0;
        float alpha = imageReceiver.getAlpha();
        float f16 = (f11 - 0.5f) / 1.5f;
        float l10 = Utilities.l(1.0f - Math.abs(f16));
        float width = (getWidth() / 2.0f) - (org.telegram.messenger.g0.L(220.0f) * f16);
        float L = org.telegram.messenger.g0.L(80.0f);
        float T1 = org.telegram.messenger.g0.T1(0.85f, 1.0f, l10);
        float L2 = org.telegram.messenger.g0.L(160.0f);
        canvas.save();
        float f17 = ((L2 / 2.0f) * f16) + width;
        canvas.translate(f17, L);
        Camera camera = this.G;
        camera.save();
        camera.rotateY(f16 * (-30.0f));
        camera.applyToCanvas(canvas);
        camera.restore();
        canvas.translate(-f17, -L);
        float f18 = L2 * T1;
        float f19 = f18 / 2.0f;
        imageReceiver.y0(width - f19, L - f19, f18, f18);
        imageReceiver.setAlpha(l10);
        imageReceiver.h(canvas, null);
        imageReceiver.y0(f12, f13, f14, f15);
        imageReceiver.setAlpha(alpha);
        canvas.restore();
    }

    public final void c() {
        boolean z10 = (this.a == null && this.b == null && this.c == null && this.s == null && this.w == null && this.x == null) ? false : true;
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
        if (z10) {
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
