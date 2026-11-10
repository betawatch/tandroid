package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.drawable.DrawableWrapper;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class u2 extends DrawableWrapper {
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
