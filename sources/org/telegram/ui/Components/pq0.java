package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class pq0 extends Drawable {
    public final Paint a = new Paint(1);
    public final Path b = new Path();
    public final /* synthetic */ er0 c;

    public pq0(er0 er0Var) {
        this.c = er0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float dp = AndroidUtilities.dp(25.0f);
        float f7 = bounds.top;
        er0 er0Var = this.c;
        float min = Math.min(f7, er0Var.n - er0Var.b.getY());
        int themedColor = er0Var.getThemedColor(org.telegram.ui.ActionBar.h6.h5);
        Paint paint = this.a;
        paint.setColor(themedColor);
        Path path = this.b;
        path.rewind();
        path.addRoundRect(bounds.left, min, bounds.right, bounds.bottom + dp, dp, dp, Path.Direction.CW);
        canvas.save();
        canvas.clipRect(bounds);
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
