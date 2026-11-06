package fi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class u extends Drawable {
    public final /* synthetic */ int a = 1;
    public final Path b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public boolean f;
    public final Object g;

    public u() {
        Path path = new Path();
        this.b = path;
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.g = new org.telegram.ui.Components.w5(new gp(this, 28), 320L, xq.h, 0);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(-1);
        paint2.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.N(2.0f)));
        paint2.setColor(-1);
        paint3.setStyle(style);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        path.moveTo(-org.telegram.messenger.g0.N(3.75f), -org.telegram.messenger.g0.N(5.4166f));
        path.lineTo(org.telegram.messenger.g0.N(3.75f), 0.0f);
        path.lineTo(-org.telegram.messenger.g0.N(3.75f), org.telegram.messenger.g0.N(5.4166f));
        path.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                boolean z9 = this.f;
                if (z9) {
                    canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, qs.e4, 31);
                } else {
                    canvas.save();
                }
                canvas.translate(getBounds().centerX(), getBounds().centerY());
                canvas.drawPath(this.b, this.c);
                if (z9) {
                    canvas.drawLine(-org.telegram.messenger.g0.L(8.66f), -org.telegram.messenger.g0.L(8.66f), org.telegram.messenger.g0.L(8.66f), org.telegram.messenger.g0.L(8.66f), this.d);
                    canvas.drawLine(-org.telegram.messenger.g0.L(8.66f), -org.telegram.messenger.g0.L(8.66f), org.telegram.messenger.g0.L(8.66f), org.telegram.messenger.g0.L(8.66f), this.e);
                }
                canvas.restore();
                break;
            default:
                float N = org.telegram.messenger.g0.N(1.66f);
                Paint paint = this.c;
                paint.setStrokeWidth(N);
                float N2 = org.telegram.messenger.g0.N(3.32f);
                Paint paint2 = this.e;
                paint2.setStrokeWidth(N2);
                float d = ((org.telegram.ui.Components.w5) this.g).d(this.f);
                float centerX = getBounds().centerX();
                float centerY = getBounds().centerY();
                float N3 = org.telegram.messenger.g0.N(10.66f);
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(centerX - N3, centerY - N3, centerX + N3, N3 + centerY);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(8.33f), org.telegram.messenger.g0.N(8.33f), paint);
                if (d > 0.0f) {
                    canvas.saveLayerAlpha(rectF, qs.e4, 31);
                } else {
                    canvas.save();
                }
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.N(1.0f) + centerX, centerY - org.telegram.messenger.g0.N(0.5f));
                canvas.drawPath(this.b, this.d);
                canvas.restore();
                if (d > 0.0f) {
                    if (this.f) {
                        canvas.drawLine(centerX - org.telegram.messenger.g0.N(8.33f), centerY - org.telegram.messenger.g0.N(8.33f), org.telegram.ui.Cells.f1.d(16.66f, d, centerX - org.telegram.messenger.g0.N(8.33f)), org.telegram.ui.Cells.f1.d(16.66f, d, centerY - org.telegram.messenger.g0.N(8.33f)), paint2);
                        canvas.drawLine(centerX - org.telegram.messenger.g0.N(8.33f), centerY - org.telegram.messenger.g0.N(8.33f), org.telegram.ui.Cells.f1.d(16.66f, d, centerX - org.telegram.messenger.g0.N(8.33f)), org.telegram.ui.Cells.f1.d(16.66f, d, centerY - org.telegram.messenger.g0.N(8.33f)), paint);
                    } else {
                        canvas.drawLine(org.telegram.messenger.g0.N(8.33f) + centerX, org.telegram.messenger.g0.N(8.33f) + centerY, (org.telegram.messenger.g0.N(8.33f) + centerX) - (org.telegram.messenger.g0.N(16.66f) * d), (org.telegram.messenger.g0.N(8.33f) + centerY) - (org.telegram.messenger.g0.N(16.66f) * d), paint2);
                        canvas.drawLine(org.telegram.messenger.g0.N(8.33f) + centerX, org.telegram.messenger.g0.N(8.33f) + centerY, (org.telegram.messenger.g0.N(8.33f) + centerX) - (org.telegram.messenger.g0.N(16.66f) * d), (org.telegram.messenger.g0.N(8.33f) + centerY) - (org.telegram.messenger.g0.N(16.66f) * d), paint);
                    }
                }
                canvas.restore();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 0:
                return org.telegram.messenger.g0.L(32.0f);
            default:
                return org.telegram.messenger.g0.L(24.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return org.telegram.messenger.g0.L(32.0f);
            default:
                return org.telegram.messenger.g0.L(24.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        switch (this.a) {
            case 0:
                this.c.setAlpha(i7);
                break;
            default:
                this.c.setAlpha(i7);
                this.d.setAlpha(i7);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                this.c.setColorFilter(colorFilter);
                break;
            default:
                this.d.setColorFilter(colorFilter);
                this.c.setColorFilter(colorFilter);
                break;
        }
    }

    public u(t tVar, boolean z9) {
        t tVar2 = tVar;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new Paint(1);
        this.e = new Paint(1);
        Path path = new Path();
        this.b = path;
        this.g = new float[8];
        this.f = z9;
        paint.setColor(-1);
        float N = org.telegram.messenger.g0.N(13.333333f);
        float N2 = org.telegram.messenger.g0.N(18.666666f);
        float N3 = org.telegram.messenger.g0.N(3.0f);
        float N4 = org.telegram.messenger.g0.N(10.0f);
        float N5 = org.telegram.messenger.g0.N(15.333333f);
        float N6 = org.telegram.messenger.g0.N(1.0f);
        float f10 = 1.33f;
        float N7 = org.telegram.messenger.g0.N(1.33f);
        path.setFillType(Path.FillType.EVEN_ODD);
        RectF rectF = org.telegram.messenger.g0.P;
        float f11 = 2.0f;
        rectF.set((-N) / 2.0f, (-N2) / 2.0f, N / 2.0f, N2 / 2.0f);
        path.addRoundRect(rectF, N3, N3, Path.Direction.CW);
        ArrayList arrayList = tVar2.e;
        int i7 = tVar2.c;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            int i12 = i11 + 1;
            s sVar = (s) obj;
            int[] iArr = tVar2.d;
            float f12 = f10;
            int i13 = sVar.c;
            int i14 = sVar.b;
            int i15 = iArr[i13];
            float f13 = f11;
            int i16 = i15 - 1;
            float max = (N4 - (Math.max(i10, i16) * N7)) / i15;
            int i17 = i7 - 1;
            int i18 = i10;
            float max2 = (N5 - (Math.max(i10, i17) * N7)) / i7;
            RectF rectF2 = org.telegram.messenger.g0.P;
            ArrayList arrayList2 = arrayList;
            float f14 = (-N4) / f13;
            int i19 = i7;
            float f15 = i14;
            float f16 = (max * f15) + f14;
            float f17 = f15 * N7;
            int i20 = size;
            float f18 = (-N5) / f13;
            float f19 = N4;
            float f20 = i13;
            float f21 = (max2 * f20) + f18;
            float f22 = f20 * N7;
            float f23 = N5;
            float f24 = f22 + f21;
            float f25 = N6;
            rectF2.set(f17 + f16, f24, rf.b.d(max, i14 + 1, f14, f17), rf.b.d(max2, i13 + 1, f18, f22));
            float[] fArr = (float[]) this.g;
            float f26 = 0.0f;
            float f27 = (i14 == 0 && i13 == 0) ? f25 : 0.0f;
            fArr[1] = f27;
            fArr[i18] = f27;
            float f28 = (i14 == i16 && i13 == 0) ? f25 : 0.0f;
            fArr[3] = f28;
            fArr[2] = f28;
            float f29 = (i14 == i16 && i13 == i17) ? f25 : 0.0f;
            fArr[5] = f29;
            fArr[4] = f29;
            if (i14 == 0 && i13 == i17) {
                f26 = f25;
            }
            fArr[7] = f26;
            fArr[6] = f26;
            this.b.addRoundRect(rectF2, fArr, Path.Direction.CW);
            tVar2 = tVar;
            f10 = f12;
            f11 = f13;
            i10 = i18;
            arrayList = arrayList2;
            i7 = i19;
            i11 = i12;
            size = i20;
            N4 = f19;
            N6 = f25;
            N5 = f23;
        }
        Paint paint2 = this.d;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.d.setStrokeWidth(org.telegram.messenger.g0.L(3.33f));
        this.d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.e.setStyle(style);
        this.e.setStrokeWidth(org.telegram.messenger.g0.L(f10));
        this.e.setColor(-1);
        this.e.setStrokeCap(Paint.Cap.ROUND);
        this.e.setStrokeJoin(Paint.Join.ROUND);
    }
}
