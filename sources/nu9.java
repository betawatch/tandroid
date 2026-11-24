// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.FrameLayout;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nu9 extends FrameLayout implements vlb {
    public final Path a;
    public im0 b;

    public nu9(Activity activity) {
        super(activity);
        this.a = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.a);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.a;
        path.rewind();
        path.addRoundRect(gm.L(9.0f), gm.L(9.0f), i - gm.L(9.0f), i2 - gm.L(9.0f), gm.L(16.0f), gm.L(16.0f), Path.Direction.CW);
    }

    public void setBlurredBackground(im0 im0Var) {
        this.b = im0Var;
        setBackground(im0Var);
    }

    @Override // vlb
    public final void updateColors() {
        im0 im0Var = this.b;
        if (im0Var != null) {
            im0Var.updateColors();
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
