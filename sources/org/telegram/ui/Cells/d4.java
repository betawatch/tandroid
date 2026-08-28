package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d4 extends Drawable {
    public final Drawable[] a;

    public d4(Context context) {
        this.a = new Drawable[]{r1, context.getResources().getDrawable(R.drawable.verified_check).mutate()};
        Drawable mutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-9063442, PorterDuff.Mode.MULTIPLY));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i9 = 0;
        while (true) {
            Drawable[] drawableArr = this.a;
            if (i9 >= drawableArr.length) {
                return;
            }
            drawableArr[i9].setBounds(getBounds());
            drawableArr[i9].draw(canvas);
            i9++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a[0].getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a[0].getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.a;
            if (i10 >= drawableArr.length) {
                return;
            }
            drawableArr[i10].setAlpha(i9);
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
