package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class v5 extends Drawable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public Object d;

    public v5(int i10, int i11, Drawable drawable) {
        this.b = i10;
        this.c = i11;
        this.d = drawable;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        switch (this.a) {
            case 0:
                Rect bounds = getBounds();
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), this.c / 2.0f, (Paint) this.d);
                break;
            case 1:
                Rect bounds2 = getBounds();
                int i11 = this.c;
                int i12 = this.b;
                if (i12 != 7) {
                    if (i12 == 1 || i12 == 6) {
                        if (i11 <= 0) {
                            i11 = AndroidUtilities.dp(20.0f);
                        }
                        i10 = i11;
                    } else {
                        i10 = i12 == 3 ? Math.max(bounds2.width(), bounds2.height()) / 2 : (int) Math.ceil(Math.sqrt(((bounds2.top - bounds2.centerY()) * (bounds2.top - bounds2.centerY())) + ((bounds2.left - bounds2.centerX()) * (bounds2.left - bounds2.centerX()))));
                    }
                    canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), i10, j6.z);
                    break;
                } else {
                    if (((RectF) this.d) == null) {
                        this.d = new RectF();
                    }
                    ((RectF) this.d).set(bounds2);
                    float dp = i11 <= 0 ? AndroidUtilities.dp(6.0f) : i11;
                    canvas.drawRoundRect((RectF) this.d, dp, dp, j6.z);
                    break;
                }
                break;
            default:
                ((Drawable) this.d).draw(canvas);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        switch (this.a) {
            case 2:
                return ((Drawable) this.d).getAlpha();
            default:
                return super.getAlpha();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 0:
                return this.c + this.b;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return this.c + this.b;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return -2;
            case 1:
                return 0;
            default:
                return ((Drawable) this.d).getOpacity();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        switch (this.a) {
            case 2:
                super.onBoundsChange(rect);
                int width = rect.width();
                int i10 = this.b;
                int i11 = (width - i10) / 2;
                int height = rect.height();
                int i12 = this.c;
                int i13 = (height - i12) / 2;
                ((Drawable) this.d).setBounds(i11, i13, i10 + i11, i12 + i13);
                break;
            default:
                super.onBoundsChange(rect);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        switch (this.a) {
            case 0:
                ((Paint) this.d).setAlpha(i10);
                break;
            case 1:
                break;
            default:
                ((Drawable) this.d).setAlpha(i10);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                ((Paint) this.d).setColorFilter(colorFilter);
                break;
        }
    }

    public v5(int i10, int i11, int i12) {
        this.b = i10;
        this.c = i12;
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(i10);
        paint.setColor(i11);
    }

    public v5(int i10, int i11) {
        this.b = i10;
        this.c = i11;
    }

    private final void a(int i10) {
    }

    private final void b(ColorFilter colorFilter) {
    }

    private final void c(ColorFilter colorFilter) {
    }
}
