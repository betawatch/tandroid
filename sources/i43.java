// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.BubbleActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class i43 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final /* synthetic */ j43 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i43(j43 j43Var, Context context) {
        super(context);
        this.d = j43Var;
        this.a = new Paint(1);
        this.b = new Path();
        this.c = new RectF();
    }

    private float getContainerHeight() {
        boolean z = getContext() instanceof BubbleActivity;
        b43 b43Var = this.d.h;
        return ((getHeight() - (b43Var.F + (!z ? gm.m : 0))) - b43Var.E) - gm.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - gm.L(32.0f);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int currentWidth;
        int currentHeight;
        boolean z;
        ao6 ao6Var;
        float f;
        float f2;
        float f3;
        float f4;
        j43 j43Var = this.d;
        b43 b43Var = j43Var.h;
        int[] iArr = j43Var.y;
        k9b k9bVar = j43Var.a;
        if (j43Var.b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (j43Var.s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (j43Var.s < 1.0f) {
            Path path = this.b;
            path.rewind();
            float width = k9bVar.getWidth();
            float height = k9bVar.getHeight();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, width, height);
            int[] iArr2 = j43Var.x;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = gm.P;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            gm.X1(rectF, rectF2, j43Var.s, rectF);
            float U1 = gm.U1(j43Var.s, gm.L(12.0f), 0);
            path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f5 = j43Var.s;
        float f6 = 1.0f - f5;
        int[] iArr3 = j43Var.w;
        canvas.translate((-iArr3[0]) * f6, (-iArr3[1]) * f6);
        if (f6 > 0.0f) {
            if (j43Var.F) {
                j43Var.b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f6, iArr[1] * f6);
            ao6 ao6Var2 = j43Var.b.I0;
            if (ao6Var2 != null) {
                f4 = ao6Var2.e;
                f3 = ao6Var2.f;
            } else {
                f3 = 1.0f;
                f4 = 1.0f;
            }
            float R1 = gm.R1(1.0f, (j43Var.b.getScaleX() * (r9.getWidth() / f4)) / k9bVar.getWidth(), f6);
            canvas.scale(R1, R1);
            canvas.rotate(j43Var.b.getRotation() * f6);
            canvas.translate(((j43Var.b.getContentWidth() * f4) / 2.0f) * f6, ((j43Var.b.getContentHeight() * f3) / 2.0f) * f6);
        }
        canvas.translate(((getContainerWidth() / 2.0f) + gm.L(16.0f)) * f5, (((getContainerHeight() + gm.L(32.0f)) / 2.0f) + b43Var.F + (!(getContext() instanceof BubbleActivity) ? gm.m : 0)) * f5);
        if (f6 > 0.0f) {
            float contentWidth = j43Var.b.getContentWidth();
            float contentHeight = j43Var.b.getContentHeight();
            ao6 ao6Var3 = j43Var.b.I0;
            if (ao6Var3 != null) {
                f2 = ao6Var3.e;
                f = ao6Var3.f;
            } else {
                f = 1.0f;
                f2 = 1.0f;
            }
            float R12 = (gm.R1(1.0f, f2, f6) * contentWidth) / 2.0f;
            float R13 = (gm.R1(1.0f, f, f6) * contentHeight) / 2.0f;
            float R14 = gm.R1(1.0f, 4.0f, f5);
            canvas.clipRect((-R12) * R14, (-R13) * R14, R12 * R14, R13 * R14);
        }
        currentWidth = j43Var.getCurrentWidth();
        n43 n43Var = j43Var.E;
        currentHeight = j43Var.getCurrentHeight();
        int i = n43Var.i;
        if (i == 90 || i == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float A = td4.A(n43Var.l, 1.0f, f6, 1.0f);
        float f7 = currentWidth;
        float containerWidth = getContainerWidth() / f7;
        float f8 = currentHeight;
        if (containerWidth * f8 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f8;
        }
        canvas.translate(n43Var.d * 1.0f, n43Var.e * 1.0f);
        float f9 = (n43Var.f / A) * containerWidth;
        g88 g88Var = j43Var.b;
        float R15 = (g88Var == null || (ao6Var = g88Var.I0) == null) ? gm.R1(1.0f, f9, f5) : gm.R1(ao6Var.c, f9, f5);
        canvas.scale(R15, R15);
        canvas.translate(n43Var.b * f7 * 1.0f, n43Var.c * f8 * 1.0f);
        float e = j43Var.d.e(false, i) + j43Var.b.getOrientation() + n43Var.g;
        ao6 ao6Var4 = j43Var.b.I0;
        canvas.rotate(ao6Var4 == null ? gm.R1(0.0f, e, j43Var.s) : gm.R1(ao6Var4.d + ao6Var4.k, e, j43Var.s));
        canvas.rotate(j43Var.b.getOrientation());
        ln lnVar = j43Var.c;
        if (j43Var.F) {
            ao6 ao6Var5 = j43Var.b.I0;
            if (ao6Var5 != null && ao6Var5.l) {
                z = true;
            }
            z = false;
        } else {
            s43 s43Var = b43Var.M;
            if (s43Var != null) {
                z = s43Var.j;
            }
            z = false;
        }
        canvas.scale(gm.R1(1.0f, -1.0f, lnVar.d(z)), 1.0f);
        canvas.translate((-j43Var.b.getContentWidth()) / 2.0f, (-j43Var.b.getContentHeight()) / 2.0f);
        g88 g88Var2 = j43Var.b;
        Paint paint2 = g88Var2.H0;
        Bitmap bitmap = g88Var2.C0;
        if (bitmap != null) {
            paint2.setAlpha(nm7.d4);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
