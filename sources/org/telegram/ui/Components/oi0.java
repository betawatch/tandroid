package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class oi0 extends Drawable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ pi0 c;

    public oi0(pi0 pi0Var, int i9, int i10) {
        this.c = pi0Var;
        this.a = i9;
        this.b = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = AndroidUtilities.rectTmp2;
        int centerX = getBounds().centerX();
        float f10 = this.a;
        int dp = centerX - (AndroidUtilities.dp(f10) / 2);
        int centerY = getBounds().centerY();
        float f11 = this.b;
        rect.set(dp, centerY - (AndroidUtilities.dp(f11) / 2), (AndroidUtilities.dp(f10) / 2) + getBounds().centerX(), (AndroidUtilities.dp(f11) / 2) + getBounds().centerY());
        pi0 pi0Var = this.c;
        pi0Var.c.setImageCoords(rect);
        pi0Var.c.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.c.c.setAlpha(i9 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.c.setColorFilter(colorFilter);
    }
}
