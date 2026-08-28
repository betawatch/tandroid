package ih;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class s8 extends Drawable {
    public int a;
    public final View b;
    public final Paint c;
    public final Paint d;
    public final org.telegram.ui.Components.y5 g;
    public boolean h;
    public Paint i;
    public int e = 255;
    public final float[] f = new float[15];
    public final Path j = new Path();

    public s8(View view) {
        this.b = view;
        this.g = new org.telegram.ui.Components.y5(view, 350L, gr.h);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 1593835520);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setColor(-1);
    }

    public final void a() {
        int i9 = this.a + 1;
        this.a = i9;
        if (i9 >= 2) {
            this.a = 0;
        }
    }

    public final void b(boolean z10, boolean z11) {
        this.h = z10;
        if (z11) {
            this.b.invalidate();
        } else {
            this.g.d(z10 ? 1.0f : 0.0f, true);
        }
    }

    public final void c(float f10) {
        this.c.setShadowLayer(AndroidUtilities.dp(2.0f) / f10, 0.0f, AndroidUtilities.dpf2(0.7f) / f10, i0.a.k(-16777216, 45));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float centerX = getBounds().centerX();
        float[] fArr = this.f;
        int i9 = 0;
        fArr[0] = centerX;
        int i10 = 1;
        fArr[1] = getBounds().centerY();
        int i11 = 2;
        fArr[2] = getBounds().height() / 2.0f;
        int i12 = 3;
        fArr[3] = (getBounds().width() * 1.027f) + getBounds().left;
        int i13 = 4;
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
        float d = this.g.d(this.h ? 1.0f : 0.0f, false);
        int i14 = this.a;
        Paint paint = this.d;
        if (i14 == 0) {
            paint.setColor(-1);
        } else if (i14 == 1) {
            if (this.i == null) {
                Paint paint2 = new Paint(1);
                this.i = paint2;
                paint2.setColor(-16777216);
                this.i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                this.i.setStrokeWidth(AndroidUtilities.dp(3.0f));
            }
            paint.setColor(i0.a.k(-16777216, 127));
        }
        if (this.e != 255 || this.a == 1) {
            canvas.saveLayerAlpha(getBounds().left - (getBounds().width() * 0.2f), getBounds().top, (getBounds().width() * 0.2f) + getBounds().right, (getBounds().height() * 0.2f) + getBounds().bottom, this.e, 31);
        } else {
            canvas.save();
        }
        Path path = this.j;
        path.rewind();
        int i15 = 0;
        while (i15 < i11) {
            if (this.a != i10 || i15 != 0) {
                Paint paint3 = i15 == 0 ? this.c : paint;
                int i16 = i15 == 0 ? 1 : 0;
                while (i9 < 5) {
                    if (i9 == i10 || i9 == i11) {
                        if (d != 1.0f) {
                            int i17 = i9 * 3;
                            path.addCircle(fArr[i17], fArr[i17 + 1], ((1.0f - d) * fArr[i17 + 2]) - i16, Path.Direction.CW);
                        }
                    } else if (i9 != i12 && i9 != i13) {
                        int i18 = i9 * 3;
                        path.addCircle(fArr[i18], fArr[i18 + 1], fArr[i18 + 2] - i16, Path.Direction.CW);
                    } else if (d != 0.0f) {
                        int i19 = i9 * 3;
                        path.addCircle(fArr[i19], fArr[i19 + 1], (fArr[i19 + 2] * d) - i16, Path.Direction.CW);
                    }
                    i9++;
                    i12 = 3;
                    i10 = 1;
                    i11 = 2;
                    i13 = 4;
                }
                canvas.drawPath(path, paint3);
            }
            i15++;
            i12 = 3;
            i9 = 0;
            i10 = 1;
            i11 = 2;
            i13 = 4;
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.e = i9;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
