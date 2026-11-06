package fi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.qs;
import org.telegram.messenger.ye;
import org.telegram.ui.BubbleActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
        boolean z9 = getContext() instanceof BubbleActivity;
        g0 g0Var = this.d.h;
        return ((getHeight() - (g0Var.E + (!z9 ? org.telegram.messenger.g0.m : 0))) - g0Var.D) - org.telegram.messenger.g0.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - org.telegram.messenger.g0.L(32.0f);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int currentWidth;
        int currentHeight;
        boolean z9;
        ye yeVar;
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
            if (m0Var.E) {
                m0Var.b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f13, iArr[1] * f13);
            ye yeVar2 = m0Var.b.G0;
            if (yeVar2 != null) {
                f11 = yeVar2.e;
                f10 = yeVar2.f;
            } else {
                f10 = 1.0f;
                f11 = 1.0f;
            }
            float T1 = org.telegram.messenger.g0.T1(1.0f, (m0Var.b.getScaleX() * (r9.getWidth() / f11)) / y5Var.getWidth(), f13);
            canvas.scale(T1, T1);
            canvas.rotate(m0Var.b.getRotation() * f13);
            canvas.translate(((m0Var.b.getContentWidth() * f11) / 2.0f) * f13, ((m0Var.b.getContentHeight() * f10) / 2.0f) * f13);
        }
        canvas.translate(((getContainerWidth() / 2.0f) + org.telegram.messenger.g0.L(16.0f)) * f12, (((getContainerHeight() + org.telegram.messenger.g0.L(32.0f)) / 2.0f) + g0Var.E + (!(getContext() instanceof BubbleActivity) ? org.telegram.messenger.g0.m : 0)) * f12);
        if (f13 > 0.0f) {
            float contentWidth = m0Var.b.getContentWidth();
            float contentHeight = m0Var.b.getContentHeight();
            ye yeVar3 = m0Var.b.G0;
            float f14 = yeVar3 != null ? yeVar3.e : 1.0f;
            float f15 = yeVar3 != null ? yeVar3.f : 1.0f;
            float T12 = (org.telegram.messenger.g0.T1(1.0f, f14, f13) * contentWidth) / 2.0f;
            float T13 = (org.telegram.messenger.g0.T1(1.0f, f15, f13) * contentHeight) / 2.0f;
            float T14 = org.telegram.messenger.g0.T1(1.0f, 4.0f, f12);
            canvas.clipRect((-T12) * T14, (-T13) * T14, T12 * T14, T13 * T14);
        }
        currentWidth = m0Var.getCurrentWidth();
        og.g gVar = m0Var.D;
        currentHeight = m0Var.getCurrentHeight();
        int i7 = gVar.i;
        if (i7 == 90 || i7 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float z10 = com.google.android.recaptcha.internal.a.z(gVar.l, 1.0f, f13, 1.0f);
        float f16 = currentWidth;
        float containerWidth = getContainerWidth() / f16;
        float f17 = currentHeight;
        if (containerWidth * f17 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f17;
        }
        canvas.translate(gVar.d * 1.0f, gVar.e * 1.0f);
        float f18 = (gVar.f / z10) * containerWidth;
        tg.n1 n1Var = m0Var.b;
        float T15 = (n1Var == null || (yeVar = n1Var.G0) == null) ? org.telegram.messenger.g0.T1(1.0f, f18, f12) : org.telegram.messenger.g0.T1(yeVar.c, f18, f12);
        canvas.scale(T15, T15);
        canvas.translate(gVar.b * f16 * 1.0f, gVar.c * f17 * 1.0f);
        float e10 = m0Var.d.e(false, i7) + m0Var.b.getOrientation() + gVar.g;
        ye yeVar4 = m0Var.b.G0;
        canvas.rotate(yeVar4 == null ? org.telegram.messenger.g0.T1(0.0f, e10, m0Var.s) : org.telegram.messenger.g0.T1(yeVar4.d + yeVar4.k, e10, m0Var.s));
        canvas.rotate(m0Var.b.getOrientation());
        org.telegram.ui.Components.w5 w5Var = m0Var.c;
        if (m0Var.E) {
            ye yeVar5 = m0Var.b.G0;
            if (yeVar5 != null && yeVar5.l) {
                z9 = true;
            }
            z9 = false;
        } else {
            og.m mVar = g0Var.L;
            if (mVar != null) {
                z9 = mVar.j;
            }
            z9 = false;
        }
        canvas.scale(org.telegram.messenger.g0.T1(1.0f, -1.0f, w5Var.d(z9)), 1.0f);
        canvas.translate((-m0Var.b.getContentWidth()) / 2.0f, (-m0Var.b.getContentHeight()) / 2.0f);
        tg.n1 n1Var2 = m0Var.b;
        Paint paint2 = n1Var2.F0;
        Bitmap bitmap = n1Var2.A0;
        if (bitmap != null) {
            paint2.setAlpha(qs.e4);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
