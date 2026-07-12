package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes5.dex */
public class ActivityWindowEmptyBackgroundDrawable extends Drawable {
    private int mAlpha = NotificationCenter.didReceiveSmsCode;
    private ColorFilter mColorFilter;

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.mAlpha = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mColorFilter = colorFilter;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.mColorFilter;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mAlpha;
    }
}
