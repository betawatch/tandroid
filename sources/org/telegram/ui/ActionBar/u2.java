package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.drawable.DrawableWrapper;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
