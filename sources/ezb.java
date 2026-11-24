// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ezb extends Drawable {
    public final Drawable a;
    public final Paint b = new Paint(1);
    public final RectF c = new RectF();

    public ezb(Context context) {
        this.a = b10.d(context, R.drawable.menu_topic_add);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawRoundRect(this.c, gm.L(10.0f), gm.L(10.0f), this.b);
        this.a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c.set(rect);
        int centerX = rect.centerX() - gm.L(12.0f);
        int centerY = rect.centerY() - gm.L(12.0f);
        this.a.setBounds(centerX, centerY, gm.L(24.0f) + centerX, gm.L(24.0f) + centerY);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
