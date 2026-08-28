package og;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c extends Drawable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public Object d;

    public c(int i9, int i10, Drawable drawable) {
        this.b = i9;
        this.c = i10;
        this.d = drawable;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i9;
        switch (this.a) {
            case 0:
                ((Drawable) this.d).draw(canvas);
                break;
            case 1:
                Rect bounds = getBounds();
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), this.c / 2.0f, (Paint) this.d);
                break;
            default:
                Rect bounds2 = getBounds();
                int i10 = this.c;
                int i11 = this.b;
                if (i11 != 7) {
                    if (i11 == 1 || i11 == 6) {
                        if (i10 <= 0) {
                            i10 = AndroidUtilities.dp(20.0f);
                        }
                        i9 = i10;
                    } else {
                        i9 = i11 == 3 ? Math.max(bounds2.width(), bounds2.height()) / 2 : (int) Math.ceil(Math.sqrt(((bounds2.top - bounds2.centerY()) * (bounds2.top - bounds2.centerY())) + ((bounds2.left - bounds2.centerX()) * (bounds2.left - bounds2.centerX()))));
                    }
                    canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), i9, f6.z);
                    break;
                } else {
                    if (((RectF) this.d) == null) {
                        this.d = new RectF();
                    }
                    ((RectF) this.d).set(bounds2);
                    float dp = i10 <= 0 ? AndroidUtilities.dp(6.0f) : i10;
                    canvas.drawRoundRect((RectF) this.d, dp, dp, f6.z);
                    break;
                }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        switch (this.a) {
            case 0:
                return ((Drawable) this.d).getAlpha();
            default:
                return super.getAlpha();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return this.c + this.b;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return this.c + this.b;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return ((Drawable) this.d).getOpacity();
            case 1:
                return -2;
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        switch (this.a) {
            case 0:
                super.onBoundsChange(rect);
                int width = rect.width();
                int i9 = this.b;
                int i10 = (width - i9) / 2;
                int height = rect.height();
                int i11 = this.c;
                int i12 = (height - i11) / 2;
                ((Drawable) this.d).setBounds(i10, i12, i9 + i10, i11 + i12);
                break;
            default:
                super.onBoundsChange(rect);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        switch (this.a) {
            case 0:
                ((Drawable) this.d).setAlpha(i9);
                break;
            case 1:
                ((Paint) this.d).setAlpha(i9);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 1:
                ((Paint) this.d).setColorFilter(colorFilter);
                break;
        }
    }

    public c(int i9, int i10, int i11) {
        this.b = i9;
        this.c = i11;
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(i9);
        paint.setColor(i10);
    }

    public c(int i9, int i10) {
        this.b = i9;
        this.c = i10;
    }

    private final void a(int i9) {
    }

    private final void b(ColorFilter colorFilter) {
    }

    private final void c(ColorFilter colorFilter) {
    }
}
