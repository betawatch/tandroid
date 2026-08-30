package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class j0 extends x1 {
    public final RectF j0;
    public final RectF k0;
    public final Path l0;
    public final /* synthetic */ m0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(m0 m0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.m0 = m0Var;
        this.j0 = new RectF();
        this.k0 = new RectF();
        this.l0 = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        m0 m0Var = this.m0;
        h0 h0Var = m0Var.X;
        boolean drawChild = super.drawChild(canvas, view, j10);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            FrameLayout frameLayout2 = h0Var.b;
            g0 g0Var = m0Var.V;
            RectF rectF = this.j0;
            if (!ug.i.c(frameLayout2, g0Var, rectF)) {
                return true;
            }
            RectF rectF2 = this.k0;
            if (!ug.i.c(frameLayout, this, rectF2)) {
                return true;
            }
            float centerX = rectF2.centerX() - AndroidUtilities.dp(40.0f);
            float centerY = rectF2.centerY() - AndroidUtilities.dp(40.0f);
            if (!rectF.isEmpty()) {
                canvas.save();
                canvas.clipPath(this.l0);
                canvas.scale(0.6f, 0.6f, rectF2.centerX(), rectF2.centerY());
                canvas.translate(rectF2.centerX() - (h0Var.getWidth() / 2.0f), rectF2.centerY() - (h0Var.getHeight() / 2.0f));
                h0Var.b(canvas, h0Var.getWidth() / 2.0f, AndroidUtilities.dp(104.0f), h0Var.getWidth(), h0Var.getHeight());
                h0Var.c(canvas, h0Var.getWidth() / 2.0f, AndroidUtilities.dp(104.0f), h0Var.getWidth(), h0Var.getHeight());
                canvas.restore();
                canvas.save();
                canvas.translate(centerX, centerY);
                canvas.scale(AndroidUtilities.dp(80.0f) / rectF.width(), AndroidUtilities.dp(80.0f) / rectF.height());
                h0Var.b.draw(canvas);
                canvas.restore();
            }
        }
        return drawChild;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.l0;
        path.rewind();
        RectF rectF = this.j0;
        rectF.set(0.0f, 0.0f, i10, i11);
        rectF.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
        path.addRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), Path.Direction.CW);
    }
}
