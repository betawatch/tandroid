package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class k0 extends Drawable {
    public final Drawable a;
    public final Drawable b;
    public final d6 c = new d6(new j0(this, 0), 1200, wr.h, 0);

    public k0(Context context) {
        this.a = context.getResources().getDrawable(R.drawable.input_ai).mutate();
        this.b = context.getResources().getDrawable(R.drawable.input_ai_star).mutate();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Drawable drawable = this.a;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        float d = this.c.d(1.0f, false);
        float width = (bounds.width() * 0.352f) + bounds.left;
        float height = (bounds.height() * 0.248f) + bounds.top;
        float width2 = bounds.width() * 0.105f * ((float) (1.0d - Math.sin(AndroidUtilities.cascade(d, 0.0f, 2.0f, 1.5f) * 3.141592653589793d)));
        float width3 = (bounds.width() * 0.215f) + bounds.left;
        float height2 = (bounds.height() * 0.43f) + bounds.top;
        float width4 = bounds.width() * 0.09f * ((float) (1.0d - Math.sin(AndroidUtilities.cascade(d, 1.0f, 2.0f, 1.5f) * 3.141592653589793d)));
        int i10 = (int) (width - width2);
        int i11 = (int) (height - width2);
        int i12 = (int) (width + width2);
        int i13 = (int) (height + width2);
        Drawable drawable2 = this.b;
        drawable2.setBounds(i10, i11, i12, i13);
        drawable2.draw(canvas);
        drawable2.setBounds((int) (width3 - width4), (int) (height2 - width4), (int) (width3 + width4), (int) (height2 + width4));
        drawable2.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.a.setAlpha(i10);
        this.b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
    }
}
