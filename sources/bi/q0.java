package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.n10;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class q0 extends c3 {
    public final /* synthetic */ t0 A0;
    public final RectF x0;
    public final RectF y0;
    public final Path z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(t0 t0Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, context, i6Var);
        this.A0 = t0Var;
        this.x0 = new RectF();
        this.y0 = new RectF();
        this.z0 = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        t0 t0Var = this.A0;
        o0 o0Var = t0Var.W1;
        boolean drawChild = super.drawChild(canvas, view, j3);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            FrameLayout frameLayout2 = o0Var.b;
            n0 n0Var = t0Var.U1;
            RectF rectF = this.x0;
            if (!jh.k.c(frameLayout2, n0Var, rectF)) {
                return true;
            }
            RectF rectF2 = this.y0;
            if (!jh.k.c(frameLayout, this, rectF2)) {
                return true;
            }
            float centerX = rectF2.centerX() - org.telegram.messenger.g0.L(40.0f);
            float centerY = rectF2.centerY() - org.telegram.messenger.g0.L(40.0f);
            if (!rectF.isEmpty()) {
                canvas.save();
                canvas.clipPath(this.z0);
                canvas.scale(0.6f, 0.6f, rectF2.centerX(), rectF2.centerY());
                n10.k(o0Var.getHeight(), 2.0f, rectF2.centerY(), rectF2.centerX() - (o0Var.getWidth() / 2.0f), canvas);
                o0Var.b(o0Var.getWidth() / 2.0f, org.telegram.messenger.g0.L(104.0f), o0Var.getWidth(), o0Var.getHeight(), canvas);
                o0Var.c(o0Var.getWidth() / 2.0f, org.telegram.messenger.g0.L(104.0f), o0Var.getWidth(), o0Var.getHeight(), canvas);
                canvas.restore();
                canvas.save();
                canvas.translate(centerX, centerY);
                canvas.scale(org.telegram.messenger.g0.L(80.0f) / rectF.width(), org.telegram.messenger.g0.L(80.0f) / rectF.height());
                o0Var.b.draw(canvas);
                canvas.restore();
            }
        }
        return drawChild;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        Path path = this.z0;
        path.rewind();
        RectF rectF = this.x0;
        rectF.set(0.0f, 0.0f, i7, i10);
        rectF.inset(org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(4.0f));
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), Path.Direction.CW);
    }
}
