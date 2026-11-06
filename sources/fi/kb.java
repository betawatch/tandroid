package fi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class kb extends View implements o2 {
    public Paint a;
    public Paint b;
    public org.telegram.ui.Components.i6 c;
    public boolean d;
    public org.telegram.ui.Components.w5 e;

    public final void a(long j3, boolean z9) {
        long j10 = j3 % 60;
        long j11 = (j3 - j10) / 60;
        StringBuilder sb2 = new StringBuilder(5);
        if (j11 < 10) {
            sb2.append('0');
        }
        sb2.append(j11);
        sb2.append(':');
        if (j10 < 10) {
            sb2.append('0');
        }
        sb2.append(j10);
        this.c.t(sb2, z9, true);
    }

    public final void b(boolean z9, boolean z10) {
        this.d = z9;
        if (!z10) {
            this.e.e(true, z9 ? 1.0f : 0.0f);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.b;
        org.telegram.ui.Components.i6 i6Var = this.c;
        super.onDraw(canvas);
        float e10 = this.e.e(false, this.d ? 1.0f : 0.0f);
        float L = org.telegram.messenger.g0.L(12.66f) * e10;
        float c10 = i6Var.c() + L;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(((getWidth() - c10) / 2.0f) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(18.0f), ((getWidth() + c10) / 2.0f) + org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(40.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), this.a);
        if (e10 > 0.0f) {
            paint.setAlpha((int) (Utilities.i((((float) Math.sin(((System.currentTimeMillis() % 2000) / 1000.0f) * 3.141592653589793d)) / 4.0f) + 0.75f, 1.0f, 0.0f) * 255.0f));
            invalidate();
            canvas.drawCircle(rectF.left + org.telegram.messenger.g0.L(10.66f), rectF.centerY(), org.telegram.messenger.g0.L(4.0f) * e10, paint);
        }
        i6Var.setBounds((int) (rectF.left + L), ((int) rectF.top) - org.telegram.messenger.g0.L(1.0f), (int) rectF.right, (int) rectF.bottom);
        i6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(45.0f), TLObject.FLAG_30));
    }

    @Override // fi.o2
    public void setInvert(float f10) {
        this.a.setColor(i0.a.f(f10, 1056964608, TLObject.FLAG_28));
        this.c.u(i0.a.f(f10, -1, -16777216));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.c == drawable || super.verifyDrawable(drawable);
    }
}
