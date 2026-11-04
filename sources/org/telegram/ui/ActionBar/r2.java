package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.drawable.DrawableWrapper;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r2 extends DrawableWrapper {
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
