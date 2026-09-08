package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class c4 extends Drawable {
    public final Drawable[] a;

    public c4(Context context) {
        this.a = new Drawable[]{r1, context.getResources().getDrawable(R.drawable.verified_check).mutate()};
        Drawable mutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-9063442, PorterDuff.Mode.MULTIPLY));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.a;
            if (i10 >= drawableArr.length) {
                return;
            }
            drawableArr[i10].setBounds(getBounds());
            drawableArr[i10].draw(canvas);
            i10++;
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
    public final void setAlpha(int i10) {
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.a;
            if (i11 >= drawableArr.length) {
                return;
            }
            drawableArr[i11].setAlpha(i10);
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
