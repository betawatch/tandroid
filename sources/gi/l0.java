package gi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.hs;
import org.telegram.messenger.re;
import org.telegram.ui.BubbleActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l0 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final /* synthetic */ m0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, Context context) {
        super(context);
        this.d = m0Var;
        this.a = new Paint(1);
        this.b = new Path();
        this.c = new RectF();
        new Matrix();
        new Matrix();
        new Matrix();
    }

    private float getContainerHeight() {
        boolean z10 = getContext() instanceof BubbleActivity;
        g0 g0Var = this.d.h;
        return ((getHeight() - (g0Var.F + (!z10 ? org.telegram.messenger.g0.m : 0))) - g0Var.E) - org.telegram.messenger.g0.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - org.telegram.messenger.g0.L(32.0f);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int currentWidth;
        int currentHeight;
        boolean z10;
        re reVar;
        float f10;
        float f11;
        m0 m0Var = this.d;
        g0 g0Var = m0Var.h;
        int[] iArr = m0Var.y;
        y5 y5Var = m0Var.a;
        if (m0Var.b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (m0Var.s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (m0Var.s < 1.0f) {
            Path path = this.b;
            path.rewind();
            float width = y5Var.getWidth();
            float height = y5Var.getHeight();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, width, height);
            int[] iArr2 = m0Var.x;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            org.telegram.messenger.g0.Z1(rectF, rectF2, m0Var.s, rectF);
            float W1 = org.telegram.messenger.g0.W1(m0Var.s, org.telegram.messenger.g0.L(12.0f), 0);
            path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f12 = m0Var.s;
        float f13 = 1.0f - f12;
        int[] iArr3 = m0Var.w;
        canvas.translate((-iArr3[0]) * f13, (-iArr3[1]) * f13);
        if (f13 > 0.0f) {
            if (m0Var.F) {
                m0Var.b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f13, iArr[1] * f13);
            re reVar2 = m0Var.b.H0;
            if (reVar2 != null) {
                f11 = reVar2.e;
                f10 = reVar2.f;
            } else {
                f10 = 1.0f;
                f11 = 1.0f;
            }
            float T1 = org.telegram.messenger.g0.T1(1.0f, (m0Var.b.getScaleX() * (r9.getWidth() / f11)) / y5Var.getWidth(), f13);
            canvas.scale(T1, T1);
            canvas.rotate(m0Var.b.getRotation() * f13);
            canvas.translate(((m0Var.b.getContentWidth() * f11) / 2.0f) * f13, ((m0Var.b.getContentHeight() * f10) / 2.0f) * f13);
        }
        canvas.translate(((getContainerWidth() / 2.0f) + org.telegram.messenger.g0.L(16.0f)) * f12, (((getContainerHeight() + org.telegram.messenger.g0.L(32.0f)) / 2.0f) + g0Var.F + (!(getContext() instanceof BubbleActivity) ? org.telegram.messenger.g0.m : 0)) * f12);
        if (f13 > 0.0f) {
            float contentWidth = m0Var.b.getContentWidth();
            float contentHeight = m0Var.b.getContentHeight();
            re reVar3 = m0Var.b.H0;
            float f14 = reVar3 != null ? reVar3.e : 1.0f;
            float f15 = reVar3 != null ? reVar3.f : 1.0f;
            float T12 = (org.telegram.messenger.g0.T1(1.0f, f14, f13) * contentWidth) / 2.0f;
            float T13 = (org.telegram.messenger.g0.T1(1.0f, f15, f13) * contentHeight) / 2.0f;
            float T14 = org.telegram.messenger.g0.T1(1.0f, 4.0f, f12);
            canvas.clipRect((-T12) * T14, (-T13) * T14, T12 * T14, T13 * T14);
        }
        currentWidth = m0Var.getCurrentWidth();
        pg.f fVar = m0Var.E;
        currentHeight = m0Var.getCurrentHeight();
        int i3 = fVar.i;
        if (i3 == 90 || i3 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float y9 = com.google.android.recaptcha.internal.a.y(fVar.l, 1.0f, f13, 1.0f);
        float f16 = currentWidth;
        float containerWidth = getContainerWidth() / f16;
        float f17 = currentHeight;
        if (containerWidth * f17 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f17;
        }
        canvas.translate(fVar.d * 1.0f, fVar.e * 1.0f);
        float f18 = (fVar.f / y9) * containerWidth;
        ug.n1 n1Var = m0Var.b;
        float T15 = (n1Var == null || (reVar = n1Var.H0) == null) ? org.telegram.messenger.g0.T1(1.0f, f18, f12) : org.telegram.messenger.g0.T1(reVar.c, f18, f12);
        canvas.scale(T15, T15);
        canvas.translate(fVar.b * f16 * 1.0f, fVar.c * f17 * 1.0f);
        float e10 = m0Var.d.e(false, i3) + m0Var.b.getOrientation() + fVar.g;
        re reVar4 = m0Var.b.H0;
        canvas.rotate(reVar4 == null ? org.telegram.messenger.g0.T1(0.0f, e10, m0Var.s) : org.telegram.messenger.g0.T1(reVar4.d + reVar4.k, e10, m0Var.s));
        canvas.rotate(m0Var.b.getOrientation());
        org.telegram.ui.Components.u5 u5Var = m0Var.c;
        if (m0Var.F) {
            re reVar5 = m0Var.b.H0;
            if (reVar5 != null && reVar5.l) {
                z10 = true;
            }
            z10 = false;
        } else {
            pg.k kVar = g0Var.M;
            if (kVar != null) {
                z10 = kVar.j;
            }
            z10 = false;
        }
        canvas.scale(org.telegram.messenger.g0.T1(1.0f, -1.0f, u5Var.d(z10)), 1.0f);
        canvas.translate((-m0Var.b.getContentWidth()) / 2.0f, (-m0Var.b.getContentHeight()) / 2.0f);
        ug.n1 n1Var2 = m0Var.b;
        Paint paint2 = n1Var2.G0;
        Bitmap bitmap = n1Var2.B0;
        if (bitmap != null) {
            paint2.setAlpha(hs.e4);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
