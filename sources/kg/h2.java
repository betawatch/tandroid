package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.ui.k4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h2 extends k4 {
    public final Path h;
    public final /* synthetic */ k2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(k2 k2Var, Context context) {
        super(context);
        this.n = k2Var;
        this.h = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.h);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.k4, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Path path = this.h;
        path.reset();
        k2 k2Var = this.n;
        if (k2Var.d) {
            org.telegram.messenger.i0.P.set(0.0f, -k2Var.M, getMeasuredWidth(), getMeasuredHeight());
        } else {
            org.telegram.messenger.i0.P.set(0.0f, 0.0f, getMeasuredWidth(), (int) (getMeasuredHeight() + k2Var.M));
        }
        float L = k2Var.M - org.telegram.messenger.i0.L(3.0f);
        path.addRoundRect(org.telegram.messenger.i0.P, L, L, Path.Direction.CW);
    }
}
