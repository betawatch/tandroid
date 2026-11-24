// default package

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mc1 extends ImageView {
    public final float a;
    public final u51 b;

    public mc1(Context context) {
        super(context);
        this.b = new u51(this);
        this.a = 0.2f;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        float a = this.b.a(this.a);
        canvas.scale(a, a, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.b.c(z);
    }
}
