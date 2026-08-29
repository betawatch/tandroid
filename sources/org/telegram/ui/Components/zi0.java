package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zi0 extends Drawable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ aj0 c;

    public zi0(aj0 aj0Var, int i10, int i11) {
        this.c = aj0Var;
        this.a = i10;
        this.b = i11;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = AndroidUtilities.rectTmp2;
        int centerX = getBounds().centerX();
        float f9 = this.a;
        int dp = centerX - (AndroidUtilities.dp(f9) / 2);
        int centerY = getBounds().centerY();
        float f10 = this.b;
        rect.set(dp, centerY - (AndroidUtilities.dp(f10) / 2), (AndroidUtilities.dp(f9) / 2) + getBounds().centerX(), (AndroidUtilities.dp(f10) / 2) + getBounds().centerY());
        aj0 aj0Var = this.c;
        aj0Var.c.setImageCoords(rect);
        aj0Var.c.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.c.c.setAlpha(i10 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.c.setColorFilter(colorFilter);
    }
}
