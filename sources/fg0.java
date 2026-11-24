// default package

import android.graphics.Canvas;
import android.graphics.drawable.RippleDrawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fg0 extends RippleDrawable {
    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int save = canvas.save();
        try {
            try {
                super.draw(canvas);
            } catch (Exception e) {
                fc4.e("probably forgot to put setCallback", e);
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
