package nh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class a extends Drawable {
    public int b;
    public int c = 255;
    public final Drawable a = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.settings_arrow).mutate();

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float exactCenterX = getBounds().exactCenterX();
        float exactCenterY = getBounds().exactCenterY();
        int w02 = f6.w0(null, f6.G6, false);
        int w03 = f6.w0(null, f6.d6, false);
        int i9 = this.b;
        Drawable drawable = this.a;
        if (i9 != w03) {
            this.b = w03;
            drawable.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        }
        canvas.drawCircle(exactCenterX, exactCenterY, AndroidUtilities.dp(7.6666665f), f6.l0(i0.a.k(w03, this.c)));
        canvas.drawCircle(exactCenterX, exactCenterY, AndroidUtilities.dp(6.6666665f), f6.l0(i0.a.k(w02, this.c)));
        ff.s.d(drawable, exactCenterX, exactCenterY, 17);
        canvas.translate(0.0f, AndroidUtilities.dp(0.66f));
        canvas.save();
        canvas.rotate(90.0f, exactCenterX, exactCenterY);
        ff.s.b(canvas, drawable, 0.8f);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(13.333333f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(13.333333f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.c = i9;
        this.a.setAlpha(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
