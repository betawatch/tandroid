package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w0 extends q2 {
    public final /* synthetic */ z0 A0;
    public final RectF x0;
    public final RectF y0;
    public final Path z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(z0 z0Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i3, context, e6Var);
        this.A0 = z0Var;
        this.x0 = new RectF();
        this.y0 = new RectF();
        this.z0 = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        z0 z0Var = this.A0;
        u0 u0Var = z0Var.T1;
        boolean drawChild = super.drawChild(canvas, view, j10);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            FrameLayout frameLayout2 = u0Var.b;
            t0 t0Var = z0Var.R1;
            RectF rectF = this.x0;
            if (!kh.k.c(frameLayout2, t0Var, rectF)) {
                return true;
            }
            RectF rectF2 = this.y0;
            if (!kh.k.c(frameLayout, this, rectF2)) {
                return true;
            }
            float centerX = rectF2.centerX() - org.telegram.messenger.g0.L(40.0f);
            float centerY = rectF2.centerY() - org.telegram.messenger.g0.L(40.0f);
            if (!rectF.isEmpty()) {
                canvas.save();
                canvas.clipPath(this.z0);
                canvas.scale(0.6f, 0.6f, rectF2.centerX(), rectF2.centerY());
                canvas.translate(rectF2.centerX() - (u0Var.getWidth() / 2.0f), rectF2.centerY() - (u0Var.getHeight() / 2.0f));
                u0Var.b(canvas, u0Var.getWidth() / 2.0f, org.telegram.messenger.g0.L(104.0f), u0Var.getWidth(), u0Var.getHeight());
                u0Var.c(canvas, u0Var.getWidth() / 2.0f, org.telegram.messenger.g0.L(104.0f), u0Var.getWidth(), u0Var.getHeight());
                canvas.restore();
                canvas.save();
                canvas.translate(centerX, centerY);
                canvas.scale(org.telegram.messenger.g0.L(80.0f) / rectF.width(), org.telegram.messenger.g0.L(80.0f) / rectF.height());
                u0Var.b.draw(canvas);
                canvas.restore();
            }
        }
        return drawChild;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        Path path = this.z0;
        path.rewind();
        RectF rectF = this.x0;
        rectF.set(0.0f, 0.0f, i3, i10);
        rectF.inset(org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(4.0f));
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), Path.Direction.CW);
    }
}
