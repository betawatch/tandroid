package hi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.ns;
import org.telegram.messenger.xe;
import org.telegram.ui.BubbleActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class m0 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final /* synthetic */ n0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, Context context) {
        super(context);
        this.d = n0Var;
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
        xe xeVar;
        float f10;
        float f11;
        n0 n0Var = this.d;
        g0 g0Var = n0Var.h;
        int[] iArr = n0Var.y;
        x5 x5Var = n0Var.a;
        if (n0Var.b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (n0Var.s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (n0Var.s < 1.0f) {
            Path path = this.b;
            path.rewind();
            float width = x5Var.getWidth();
            float height = x5Var.getHeight();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, width, height);
            int[] iArr2 = n0Var.x;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            org.telegram.messenger.g0.Z1(rectF, rectF2, n0Var.s, rectF);
            float W1 = org.telegram.messenger.g0.W1(n0Var.s, org.telegram.messenger.g0.L(12.0f), 0);
            path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f12 = n0Var.s;
        float f13 = 1.0f - f12;
        int[] iArr3 = n0Var.w;
        canvas.translate((-iArr3[0]) * f13, (-iArr3[1]) * f13);
        if (f13 > 0.0f) {
            if (n0Var.F) {
                n0Var.b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f13, iArr[1] * f13);
            xe xeVar2 = n0Var.b.H0;
            if (xeVar2 != null) {
                f11 = xeVar2.e;
                f10 = xeVar2.f;
            } else {
                f10 = 1.0f;
                f11 = 1.0f;
            }
            float T1 = org.telegram.messenger.g0.T1(1.0f, (n0Var.b.getScaleX() * (r9.getWidth() / f11)) / x5Var.getWidth(), f13);
            canvas.scale(T1, T1);
            canvas.rotate(n0Var.b.getRotation() * f13);
            canvas.translate(((n0Var.b.getContentWidth() * f11) / 2.0f) * f13, ((n0Var.b.getContentHeight() * f10) / 2.0f) * f13);
        }
        canvas.translate(((getContainerWidth() / 2.0f) + org.telegram.messenger.g0.L(16.0f)) * f12, (((getContainerHeight() + org.telegram.messenger.g0.L(32.0f)) / 2.0f) + g0Var.F + (!(getContext() instanceof BubbleActivity) ? org.telegram.messenger.g0.m : 0)) * f12);
        if (f13 > 0.0f) {
            float contentWidth = n0Var.b.getContentWidth();
            float contentHeight = n0Var.b.getContentHeight();
            xe xeVar3 = n0Var.b.H0;
            float f14 = xeVar3 != null ? xeVar3.e : 1.0f;
            float f15 = xeVar3 != null ? xeVar3.f : 1.0f;
            float T12 = (org.telegram.messenger.g0.T1(1.0f, f14, f13) * contentWidth) / 2.0f;
            float T13 = (org.telegram.messenger.g0.T1(1.0f, f15, f13) * contentHeight) / 2.0f;
            float T14 = org.telegram.messenger.g0.T1(1.0f, 4.0f, f12);
            canvas.clipRect((-T12) * T14, (-T13) * T14, T12 * T14, T13 * T14);
        }
        currentWidth = n0Var.getCurrentWidth();
        og.g gVar = n0Var.E;
        currentHeight = n0Var.getCurrentHeight();
        int i7 = gVar.i;
        if (i7 == 90 || i7 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float z11 = com.google.android.gms.internal.vision.e2.z(gVar.l, 1.0f, f13, 1.0f);
        float f16 = currentWidth;
        float containerWidth = getContainerWidth() / f16;
        float f17 = currentHeight;
        if (containerWidth * f17 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f17;
        }
        canvas.translate(gVar.d * 1.0f, gVar.e * 1.0f);
        float f18 = (gVar.f / z11) * containerWidth;
        tg.n1 n1Var = n0Var.b;
        float T15 = (n1Var == null || (xeVar = n1Var.H0) == null) ? org.telegram.messenger.g0.T1(1.0f, f18, f12) : org.telegram.messenger.g0.T1(xeVar.c, f18, f12);
        canvas.scale(T15, T15);
        canvas.translate(gVar.b * f16 * 1.0f, gVar.c * f17 * 1.0f);
        float e10 = n0Var.d.e(false, i7) + n0Var.b.getOrientation() + gVar.g;
        xe xeVar4 = n0Var.b.H0;
        canvas.rotate(xeVar4 == null ? org.telegram.messenger.g0.T1(0.0f, e10, n0Var.s) : org.telegram.messenger.g0.T1(xeVar4.d + xeVar4.k, e10, n0Var.s));
        canvas.rotate(n0Var.b.getOrientation());
        org.telegram.ui.Components.u5 u5Var = n0Var.c;
        if (n0Var.F) {
            xe xeVar5 = n0Var.b.H0;
            if (xeVar5 != null && xeVar5.l) {
                z10 = true;
            }
            z10 = false;
        } else {
            og.m mVar = g0Var.M;
            if (mVar != null) {
                z10 = mVar.j;
            }
            z10 = false;
        }
        canvas.scale(org.telegram.messenger.g0.T1(1.0f, -1.0f, u5Var.d(z10)), 1.0f);
        canvas.translate((-n0Var.b.getContentWidth()) / 2.0f, (-n0Var.b.getContentHeight()) / 2.0f);
        tg.n1 n1Var2 = n0Var.b;
        Paint paint2 = n1Var2.G0;
        Bitmap bitmap = n1Var2.B0;
        if (bitmap != null) {
            paint2.setAlpha(ns.e4);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
