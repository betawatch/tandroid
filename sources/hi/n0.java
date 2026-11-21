package hi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.ks;
import org.telegram.messenger.we;
import org.telegram.ui.BubbleActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class n0 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final /* synthetic */ o0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var, Context context) {
        super(context);
        this.d = o0Var;
        this.a = new Paint(1);
        this.b = new Path();
        this.c = new RectF();
        new Matrix();
        new Matrix();
        new Matrix();
    }

    private float getContainerHeight() {
        boolean z10 = getContext() instanceof BubbleActivity;
        i0 i0Var = this.d.h;
        return ((getHeight() - (i0Var.F + (!z10 ? org.telegram.messenger.g0.m : 0))) - i0Var.E) - org.telegram.messenger.g0.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - org.telegram.messenger.g0.L(32.0f);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int currentWidth;
        int currentHeight;
        boolean z10;
        we weVar;
        float f10;
        float f11;
        o0 o0Var = this.d;
        i0 i0Var = o0Var.h;
        int[] iArr = o0Var.y;
        v5 v5Var = o0Var.a;
        if (o0Var.b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (o0Var.s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (o0Var.s < 1.0f) {
            Path path = this.b;
            path.rewind();
            float width = v5Var.getWidth();
            float height = v5Var.getHeight();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, width, height);
            int[] iArr2 = o0Var.x;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            org.telegram.messenger.g0.Z1(rectF, rectF2, o0Var.s, rectF);
            float W1 = org.telegram.messenger.g0.W1(o0Var.s, org.telegram.messenger.g0.L(12.0f), 0);
            path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f12 = o0Var.s;
        float f13 = 1.0f - f12;
        int[] iArr3 = o0Var.w;
        canvas.translate((-iArr3[0]) * f13, (-iArr3[1]) * f13);
        if (f13 > 0.0f) {
            if (o0Var.F) {
                o0Var.b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f13, iArr[1] * f13);
            we weVar2 = o0Var.b.H0;
            if (weVar2 != null) {
                f11 = weVar2.e;
                f10 = weVar2.f;
            } else {
                f10 = 1.0f;
                f11 = 1.0f;
            }
            float T1 = org.telegram.messenger.g0.T1(1.0f, (o0Var.b.getScaleX() * (r9.getWidth() / f11)) / v5Var.getWidth(), f13);
            canvas.scale(T1, T1);
            canvas.rotate(o0Var.b.getRotation() * f13);
            canvas.translate(((o0Var.b.getContentWidth() * f11) / 2.0f) * f13, ((o0Var.b.getContentHeight() * f10) / 2.0f) * f13);
        }
        canvas.translate(((getContainerWidth() / 2.0f) + org.telegram.messenger.g0.L(16.0f)) * f12, (((getContainerHeight() + org.telegram.messenger.g0.L(32.0f)) / 2.0f) + i0Var.F + (!(getContext() instanceof BubbleActivity) ? org.telegram.messenger.g0.m : 0)) * f12);
        if (f13 > 0.0f) {
            float contentWidth = o0Var.b.getContentWidth();
            float contentHeight = o0Var.b.getContentHeight();
            we weVar3 = o0Var.b.H0;
            float f14 = weVar3 != null ? weVar3.e : 1.0f;
            float f15 = weVar3 != null ? weVar3.f : 1.0f;
            float T12 = (org.telegram.messenger.g0.T1(1.0f, f14, f13) * contentWidth) / 2.0f;
            float T13 = (org.telegram.messenger.g0.T1(1.0f, f15, f13) * contentHeight) / 2.0f;
            float T14 = org.telegram.messenger.g0.T1(1.0f, 4.0f, f12);
            canvas.clipRect((-T12) * T14, (-T13) * T14, T12 * T14, T13 * T14);
        }
        currentWidth = o0Var.getCurrentWidth();
        og.g gVar = o0Var.E;
        currentHeight = o0Var.getCurrentHeight();
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
        tg.p1 p1Var = o0Var.b;
        float T15 = (p1Var == null || (weVar = p1Var.H0) == null) ? org.telegram.messenger.g0.T1(1.0f, f18, f12) : org.telegram.messenger.g0.T1(weVar.c, f18, f12);
        canvas.scale(T15, T15);
        canvas.translate(gVar.b * f16 * 1.0f, gVar.c * f17 * 1.0f);
        float e10 = o0Var.d.e(false, i7) + o0Var.b.getOrientation() + gVar.g;
        we weVar4 = o0Var.b.H0;
        canvas.rotate(weVar4 == null ? org.telegram.messenger.g0.T1(0.0f, e10, o0Var.s) : org.telegram.messenger.g0.T1(weVar4.d + weVar4.k, e10, o0Var.s));
        canvas.rotate(o0Var.b.getOrientation());
        org.telegram.ui.Components.d6 d6Var = o0Var.c;
        if (o0Var.F) {
            we weVar5 = o0Var.b.H0;
            if (weVar5 != null && weVar5.l) {
                z10 = true;
            }
            z10 = false;
        } else {
            og.m mVar = i0Var.M;
            if (mVar != null) {
                z10 = mVar.j;
            }
            z10 = false;
        }
        canvas.scale(org.telegram.messenger.g0.T1(1.0f, -1.0f, d6Var.d(z10)), 1.0f);
        canvas.translate((-o0Var.b.getContentWidth()) / 2.0f, (-o0Var.b.getContentHeight()) / 2.0f);
        tg.p1 p1Var2 = o0Var.b;
        Paint paint2 = p1Var2.G0;
        Bitmap bitmap = p1Var2.B0;
        if (bitmap != null) {
            paint2.setAlpha(ks.e4);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
