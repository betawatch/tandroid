package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class j extends ImageView {
    public final float a;
    public final hc b;

    public j(Context context) {
        super(context);
        this.b = new hc(this);
        this.a = 0.2f;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        float a10 = this.b.a(this.a);
        canvas.scale(a10, a10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        super.setPressed(z9);
        this.b.c(z9);
    }
}
