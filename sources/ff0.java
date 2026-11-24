// default package

import android.graphics.Canvas;
import android.graphics.drawable.RippleDrawable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ff0 extends RippleDrawable {
    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int save = canvas.save();
        try {
            try {
                super.draw(canvas);
            } catch (Exception e) {
                fa4.e("probably forgot to put setCallback", e);
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
