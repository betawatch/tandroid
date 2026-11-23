package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.drawable.DrawableWrapper;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
