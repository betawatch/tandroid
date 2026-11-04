package ei;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v8 extends Drawable {
    public int a;
    public final View b;
    public final Paint c;
    public final Paint d;
    public final org.telegram.ui.Components.u5 g;
    public boolean h;
    public Paint i;
    public int e = hs.e4;
    public final float[] f = new float[15];
    public final Path j = new Path();

    public v8(View view) {
        this.b = view;
        this.g = new org.telegram.ui.Components.u5(view, 350L, xq.h);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setShadowLayer(org.telegram.messenger.g0.L(4.0f), 0.0f, 0.0f, 1593835520);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setColor(-1);
    }

    public final void a() {
        int i3 = this.a + 1;
        this.a = i3;
        if (i3 >= 2) {
            this.a = 0;
        }
    }

    public final void b(boolean z10, boolean z11) {
        this.h = z10;
        if (z11) {
            this.b.invalidate();
        } else {
            this.g.e(true, z10 ? 1.0f : 0.0f);
        }
    }

    public final void c(float f10) {
        this.c.setShadowLayer(org.telegram.messenger.g0.L(2.0f) / f10, 0.0f, org.telegram.messenger.g0.N(0.7f) / f10, i0.a.o(-16777216, 45));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i3;
        int i10;
        float centerX = getBounds().centerX();
        float[] fArr = this.f;
        int i11 = 0;
        fArr[0] = centerX;
        int i12 = 1;
        fArr[1] = getBounds().centerY();
        int i13 = 2;
        fArr[2] = getBounds().height() / 2.0f;
        int i14 = 3;
        fArr[3] = (getBounds().width() * 1.027f) + getBounds().left;
        int i15 = 4;
        fArr[4] = (getBounds().height() * 0.956f) + getBounds().top;
        fArr[5] = getBounds().height() * 0.055f;
        fArr[6] = (getBounds().width() * 0.843f) + getBounds().left;
        fArr[7] = (getBounds().height() * 0.812f) + getBounds().top;
        fArr[8] = getBounds().height() * 0.132f;
        fArr[9] = (getBounds().width() * (-0.02699995f)) + getBounds().left;
        fArr[10] = (getBounds().height() * 0.956f) + getBounds().top;
        fArr[11] = getBounds().height() * 0.055f;
        fArr[12] = (getBounds().width() * 0.157f) + getBounds().left;
        fArr[13] = (getBounds().height() * 0.812f) + getBounds().top;
        fArr[14] = getBounds().height() * 0.132f;
        float e10 = this.g.e(false, this.h ? 1.0f : 0.0f);
        int i16 = this.a;
        Paint paint = this.d;
        if (i16 == 0) {
            paint.setColor(-1);
        } else if (i16 == 1) {
            if (this.i == null) {
                Paint paint2 = new Paint(1);
                this.i = paint2;
                paint2.setColor(-16777216);
                this.i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                this.i.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
            }
            paint.setColor(i0.a.o(-16777216, hs.L1));
        }
        if (this.e != 255 || this.a == 1) {
            canvas.saveLayerAlpha(getBounds().left - (getBounds().width() * 0.2f), getBounds().top, (getBounds().width() * 0.2f) + getBounds().right, (getBounds().height() * 0.2f) + getBounds().bottom, this.e, 31);
        } else {
            canvas.save();
        }
        Path path = this.j;
        path.rewind();
        int i17 = 0;
        while (i17 < i13) {
            if (this.a == i12 && i17 == 0) {
                i3 = i13;
            } else {
                Paint paint3 = i17 == 0 ? this.c : paint;
                int i18 = i17 == 0 ? i12 : i11;
                while (i11 < 5) {
                    if (i11 == i12 || i11 == i13) {
                        i10 = i13;
                        if (e10 != 1.0f) {
                            int i19 = i11 * 3;
                            path.addCircle(fArr[i19], fArr[i19 + 1], ((1.0f - e10) * fArr[i19 + 2]) - i18, Path.Direction.CW);
                        }
                    } else if (i11 == i14 || i11 == i15) {
                        i10 = i13;
                        if (e10 != 0.0f) {
                            int i20 = i11 * 3;
                            path.addCircle(fArr[i20], fArr[i20 + 1], (fArr[i20 + 2] * e10) - i18, Path.Direction.CW);
                        }
                    } else {
                        int i21 = i11 * 3;
                        i10 = i13;
                        path.addCircle(fArr[i21], fArr[i21 + 1], fArr[i21 + 2] - i18, Path.Direction.CW);
                    }
                    i11++;
                    i13 = i10;
                    i14 = 3;
                    i12 = 1;
                    i15 = 4;
                }
                i3 = i13;
                canvas.drawPath(path, paint3);
            }
            i17++;
            i13 = i3;
            i14 = 3;
            i11 = 0;
            i12 = 1;
            i15 = 4;
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        this.e = i3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
