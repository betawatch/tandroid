package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.drawable.DrawableWrapper;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x2 extends DrawableWrapper {
    public ColorFilter a;

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.a;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a = colorFilter;
        super.setColorFilter(colorFilter);
    }
}
