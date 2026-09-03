package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class o5 extends Drawable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public o5(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int max = Math.max(bounds.width(), bounds.height()) / 2;
        int i10 = this.a;
        int i11 = this.b;
        canvas.drawCircle((bounds.centerX() - i10) + i11, bounds.centerY(), max + i10 + i11, j6.z);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
