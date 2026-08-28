package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o0 extends f2 {
    public final RectF i0;
    public final RectF j0;
    public final Path k0;
    public final /* synthetic */ r0 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r0 r0Var, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, b6Var);
        this.l0 = r0Var;
        this.i0 = new RectF();
        this.j0 = new RectF();
        this.k0 = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        r0 r0Var = this.l0;
        m0 m0Var = r0Var.W;
        boolean drawChild = super.drawChild(canvas, view, j10);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            FrameLayout frameLayout2 = m0Var.b;
            l0 l0Var = r0Var.U;
            RectF rectF = this.i0;
            if (!pg.i.c(frameLayout2, l0Var, rectF)) {
                return true;
            }
            RectF rectF2 = this.j0;
            if (!pg.i.c(frameLayout, this, rectF2)) {
                return true;
            }
            float centerX = rectF2.centerX() - AndroidUtilities.dp(40.0f);
            float centerY = rectF2.centerY() - AndroidUtilities.dp(40.0f);
            if (!rectF.isEmpty()) {
                canvas.save();
                canvas.clipPath(this.k0);
                canvas.scale(0.6f, 0.6f, rectF2.centerX(), rectF2.centerY());
                canvas.translate(rectF2.centerX() - (m0Var.getWidth() / 2.0f), rectF2.centerY() - (m0Var.getHeight() / 2.0f));
                m0Var.b(canvas, m0Var.getWidth() / 2.0f, AndroidUtilities.dp(104.0f), m0Var.getWidth(), m0Var.getHeight());
                m0Var.c(canvas, m0Var.getWidth() / 2.0f, AndroidUtilities.dp(104.0f), m0Var.getWidth(), m0Var.getHeight());
                canvas.restore();
                canvas.save();
                canvas.translate(centerX, centerY);
                canvas.scale(AndroidUtilities.dp(80.0f) / rectF.width(), AndroidUtilities.dp(80.0f) / rectF.height());
                m0Var.b.draw(canvas);
                canvas.restore();
            }
        }
        return drawChild;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        Path path = this.k0;
        path.rewind();
        RectF rectF = this.i0;
        rectF.set(0.0f, 0.0f, i9, i10);
        rectF.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
        path.addRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), Path.Direction.CW);
    }
}
