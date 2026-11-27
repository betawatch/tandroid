// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.FrameLayout;
import java.util.HashSet;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ew9 extends FrameLayout implements snb {
    public final Path a;
    public jl0 b;

    public ew9(Activity activity) {
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
        path.addRoundRect(hl.L(9.0f), hl.L(9.0f), i - hl.L(9.0f), i2 - hl.L(9.0f), hl.L(16.0f), hl.L(16.0f), Path.Direction.CW);
    }

    public void setBlurredBackground(jl0 jl0Var) {
        this.b = jl0Var;
        setBackground(jl0Var);
    }

    @Override // snb
    public final void updateColors() {
        jl0 jl0Var = this.b;
        if (jl0Var != null) {
            jl0Var.updateColors();
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
