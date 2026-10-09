package ai;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class pb extends Drawable {
    public int a;
    public final View b;
    public final Paint c;
    public final Paint d;
    public final org.telegram.ui.Components.g6 g;
    public boolean h;
    public Paint i;
    public int e = 255;
    public final float[] f = new float[15];
    public final Path j = new Path();

    public pb(View view) {
        this.b = view;
        this.g = new org.telegram.ui.Components.g6(view, 350L, hs.h);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 1593835520);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setColor(-1);
    }

    public final void a() {
        int i10 = this.a + 1;
        this.a = i10;
        if (i10 >= 2) {
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

    public final void c(float f7) {
        this.c.setShadowLayer(AndroidUtilities.dp(2.0f) / f7, 0.0f, AndroidUtilities.dpf2(0.7f) / f7, i0.a.k(-16777216, 45));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        float centerX = getBounds().centerX();
        float[] fArr = this.f;
        int i12 = 0;
        fArr[0] = centerX;
        int i13 = 1;
        fArr[1] = getBounds().centerY();
        int i14 = 2;
        fArr[2] = getBounds().height() / 2.0f;
        int i15 = 3;
        fArr[3] = (getBounds().width() * 1.027f) + getBounds().left;
        int i16 = 4;
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
        int i17 = this.a;
        Paint paint = this.d;
        if (i17 == 0) {
            paint.setColor(-1);
        } else if (i17 == 1) {
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
        int i18 = 0;
        while (i18 < i14) {
            if (this.a == i13 && i18 == 0) {
                i10 = i14;
            } else {
                Paint paint3 = i18 == 0 ? this.c : paint;
                int i19 = i18 == 0 ? i13 : i12;
                while (i12 < 5) {
                    if (i12 == i13 || i12 == i14) {
                        i11 = i14;
                        if (d != 1.0f) {
                            int i20 = i12 * 3;
                            path.addCircle(fArr[i20], fArr[i20 + 1], ((1.0f - d) * fArr[i20 + 2]) - i19, Path.Direction.CW);
                        }
                    } else if (i12 == i15 || i12 == i16) {
                        i11 = i14;
                        if (d != 0.0f) {
                            int i21 = i12 * 3;
                            path.addCircle(fArr[i21], fArr[i21 + 1], (fArr[i21 + 2] * d) - i19, Path.Direction.CW);
                        }
                    } else {
                        int i22 = i12 * 3;
                        i11 = i14;
                        path.addCircle(fArr[i22], fArr[i22 + 1], fArr[i22 + 2] - i19, Path.Direction.CW);
                    }
                    i12++;
                    i14 = i11;
                    i15 = 3;
                    i13 = 1;
                    i16 = 4;
                }
                i10 = i14;
                canvas.drawPath(path, paint3);
            }
            i18++;
            i14 = i10;
            i15 = 3;
            i12 = 0;
            i13 = 1;
            i16 = 4;
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.e = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
