package di;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
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
        this.g = new org.telegram.ui.Components.e6(new cc0(this, 1), 320L, pr.h, 0);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(-1);
        paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(2.0f)));
        paint2.setColor(-1);
        paint3.setStyle(style);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        path.moveTo(-AndroidUtilities.dpf2(3.75f), -AndroidUtilities.dpf2(5.4166f));
        path.lineTo(AndroidUtilities.dpf2(3.75f), 0.0f);
        path.lineTo(-AndroidUtilities.dpf2(3.75f), AndroidUtilities.dpf2(5.4166f));
        path.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                boolean z10 = this.f;
                if (z10) {
                    canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, 255, 31);
                } else {
                    canvas.save();
                }
                canvas.translate(getBounds().centerX(), getBounds().centerY());
                canvas.drawPath(this.b, this.c);
                if (z10) {
                    canvas.drawLine(-AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), this.d);
                    canvas.drawLine(-AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), this.e);
                }
                canvas.restore();
                break;
            default:
                float dpf2 = AndroidUtilities.dpf2(1.66f);
                Paint paint = this.c;
                paint.setStrokeWidth(dpf2);
                float dpf22 = AndroidUtilities.dpf2(3.32f);
                Paint paint2 = this.e;
                paint2.setStrokeWidth(dpf22);
                float e7 = ((org.telegram.ui.Components.e6) this.g).e(this.f);
                float centerX = getBounds().centerX();
                float centerY = getBounds().centerY();
                float dpf23 = AndroidUtilities.dpf2(10.66f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(centerX - dpf23, centerY - dpf23, centerX + dpf23, dpf23 + centerY);
                canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(8.33f), AndroidUtilities.dpf2(8.33f), paint);
                if (e7 > 0.0f) {
                    canvas.saveLayerAlpha(rectF, 255, 31);
                } else {
                    canvas.save();
                }
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(1.0f) + centerX, centerY - AndroidUtilities.dpf2(0.5f));
                canvas.drawPath(this.b, this.d);
                canvas.restore();
                if (e7 > 0.0f) {
                    if (this.f) {
                        canvas.drawLine(centerX - AndroidUtilities.dpf2(8.33f), centerY - AndroidUtilities.dpf2(8.33f), (centerX - AndroidUtilities.dpf2(8.33f)) + (AndroidUtilities.dpf2(16.66f) * e7), (centerY - AndroidUtilities.dpf2(8.33f)) + (AndroidUtilities.dpf2(16.66f) * e7), paint2);
                        canvas.drawLine(centerX - AndroidUtilities.dpf2(8.33f), centerY - AndroidUtilities.dpf2(8.33f), (AndroidUtilities.dpf2(16.66f) * e7) + (centerX - AndroidUtilities.dpf2(8.33f)), (AndroidUtilities.dpf2(16.66f) * e7) + (centerY - AndroidUtilities.dpf2(8.33f)), paint);
                    } else {
                        canvas.drawLine(AndroidUtilities.dpf2(8.33f) + centerX, AndroidUtilities.dpf2(8.33f) + centerY, (AndroidUtilities.dpf2(8.33f) + centerX) - (AndroidUtilities.dpf2(16.66f) * e7), (AndroidUtilities.dpf2(8.33f) + centerY) - (AndroidUtilities.dpf2(16.66f) * e7), paint2);
                        canvas.drawLine(AndroidUtilities.dpf2(8.33f) + centerX, AndroidUtilities.dpf2(8.33f) + centerY, (AndroidUtilities.dpf2(8.33f) + centerX) - (AndroidUtilities.dpf2(16.66f) * e7), (AndroidUtilities.dpf2(8.33f) + centerY) - (AndroidUtilities.dpf2(16.66f) * e7), paint);
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
                return AndroidUtilities.dp(32.0f);
            default:
                return AndroidUtilities.dp(24.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return AndroidUtilities.dp(32.0f);
            default:
                return AndroidUtilities.dp(24.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        switch (this.a) {
            case 0:
                this.c.setAlpha(i10);
                break;
            default:
                this.c.setAlpha(i10);
                this.d.setAlpha(i10);
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

    public u(t tVar, boolean z10) {
        t tVar2 = tVar;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new Paint(1);
        this.e = new Paint(1);
        Path path = new Path();
        this.b = path;
        this.g = new float[8];
        this.f = z10;
        paint.setColor(-1);
        float dpf2 = AndroidUtilities.dpf2(13.333333f);
        float dpf22 = AndroidUtilities.dpf2(18.666666f);
        float dpf23 = AndroidUtilities.dpf2(3.0f);
        float dpf24 = AndroidUtilities.dpf2(10.0f);
        float dpf25 = AndroidUtilities.dpf2(15.333333f);
        float dpf26 = AndroidUtilities.dpf2(1.0f);
        float dpf27 = AndroidUtilities.dpf2(1.33f);
        path.setFillType(Path.FillType.EVEN_ODD);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((-dpf2) / 2.0f, (-dpf22) / 2.0f, dpf2 / 2.0f, dpf22 / 2.0f);
        path.addRoundRect(rectF, dpf23, dpf23, Path.Direction.CW);
        ArrayList arrayList = tVar2.e;
        int i10 = tVar2.c;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            int i13 = i12 + 1;
            s sVar = (s) obj;
            int[] iArr = tVar2.d;
            int i14 = sVar.c;
            int i15 = sVar.b;
            int i16 = iArr[i14];
            int i17 = i16 - 1;
            float max = (dpf24 - (Math.max(i11, i17) * dpf27)) / i16;
            int i18 = i10 - 1;
            float max2 = (dpf25 - (Math.max(i11, i18) * dpf27)) / i10;
            RectF rectF2 = AndroidUtilities.rectTmp;
            ArrayList arrayList2 = arrayList;
            float f7 = (-dpf24) / 2.0f;
            int i19 = i10;
            float f10 = i15;
            float f11 = (max * f10) + f7;
            float f12 = f10 * dpf27;
            int i20 = size;
            float f13 = (-dpf25) / 2.0f;
            float f14 = dpf24;
            float f15 = i14;
            float f16 = (max2 * f15) + f13;
            float f17 = f15 * dpf27;
            float f18 = dpf25;
            float f19 = f17 + f16;
            float f20 = dpf26;
            rectF2.set(f12 + f11, f19, org.telegram.ui.Cells.p6.a(max, i15 + 1, f7, f12), org.telegram.ui.Cells.p6.a(max2, i14 + 1, f13, f17));
            float[] fArr = (float[]) this.g;
            float f21 = 0.0f;
            float f22 = (i15 == 0 && i14 == 0) ? f20 : 0.0f;
            fArr[1] = f22;
            fArr[0] = f22;
            float f23 = (i15 == i17 && i14 == 0) ? f20 : 0.0f;
            fArr[3] = f23;
            fArr[2] = f23;
            float f24 = (i15 == i17 && i14 == i18) ? f20 : 0.0f;
            fArr[5] = f24;
            fArr[4] = f24;
            if (i15 == 0 && i14 == i18) {
                f21 = f20;
            }
            fArr[7] = f21;
            fArr[6] = f21;
            this.b.addRoundRect(rectF2, fArr, Path.Direction.CW);
            tVar2 = tVar;
            arrayList = arrayList2;
            i10 = i19;
            i12 = i13;
            size = i20;
            dpf24 = f14;
            dpf26 = f20;
            dpf25 = f18;
            i11 = 0;
        }
        Paint paint2 = this.d;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.d.setStrokeWidth(AndroidUtilities.dp(3.33f));
        this.d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.e.setStyle(style);
        this.e.setStrokeWidth(AndroidUtilities.dp(1.33f));
        this.e.setColor(-1);
        this.e.setStrokeCap(Paint.Cap.ROUND);
        this.e.setStrokeJoin(Paint.Join.ROUND);
    }
}
