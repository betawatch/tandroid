// default package

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class nb1 extends ImageView {
    public final float a;
    public final v41 b;

    public nb1(Context context) {
        super(context);
        this.b = new v41(this);
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
