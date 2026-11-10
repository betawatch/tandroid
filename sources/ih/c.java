package ih;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import bg.s;
import jg.g;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.qs;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.m6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class c extends Drawable {
    public final /* synthetic */ int a;
    public final Drawable b;
    public int c;
    public int d;

    public c() {
        this.a = 1;
        this.d = qs.e4;
        this.b = g.h(t0.b, R.drawable.settings_arrow);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                this.b.draw(canvas);
                break;
            default:
                float exactCenterX = getBounds().exactCenterX();
                float exactCenterY = getBounds().exactCenterY();
                int x02 = m6.x0(null, m6.G6, false);
                int x03 = m6.x0(null, m6.d6, false);
                int i7 = this.c;
                Drawable drawable = this.b;
                if (i7 != x03) {
                    this.c = x03;
                    drawable.setColorFilter(new PorterDuffColorFilter(x03, PorterDuff.Mode.SRC_IN));
                }
                canvas.drawCircle(exactCenterX, exactCenterY, g0.L(7.6666665f), m6.n0(i0.a.o(x03, this.d)));
                canvas.drawCircle(exactCenterX, exactCenterY, g0.L(6.6666665f), m6.n0(i0.a.o(x02, this.d)));
                s.d(drawable, exactCenterX, exactCenterY, 17);
                canvas.translate(0.0f, g0.L(0.66f));
                canvas.save();
                canvas.rotate(90.0f, exactCenterX, exactCenterY);
                s.b(canvas, drawable, 0.8f);
                canvas.restore();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        switch (this.a) {
            case 0:
                return this.b.getAlpha();
            default:
                return this.d;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return g0.L(13.333333f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return g0.L(13.333333f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return this.b.getOpacity();
            default:
                return -3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        switch (this.a) {
            case 0:
                super.onBoundsChange(rect);
                int width = rect.width();
                int i7 = this.c;
                int i10 = (width - i7) / 2;
                int height = rect.height();
                int i11 = this.d;
                int i12 = (height - i11) / 2;
                this.b.setBounds(i10, i12, i7 + i10, i11 + i12);
                break;
            default:
                super.onBoundsChange(rect);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        switch (this.a) {
            case 0:
                this.b.setAlpha(i7);
                break;
            default:
                this.d = i7;
                this.b.setAlpha(i7);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i7 = this.a;
    }

    public c(int i7, int i10, Drawable drawable) {
        this.a = 0;
        this.c = i7;
        this.d = i10;
        this.b = drawable;
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
