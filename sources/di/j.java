package di;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class j extends ImageView {
    public final float a;
    public final org.telegram.ui.Components.zc b;

    public j(Context context) {
        super(context);
        this.b = new org.telegram.ui.Components.zc(this);
        this.a = 0.2f;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        float a2 = this.b.a(this.a);
        canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.b.c(z10);
    }
}
