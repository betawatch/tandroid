// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o75 extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final /* synthetic */ g95 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o75(g95 g95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = g95Var;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        g95 g95Var = this.e;
        p75 p75Var = g95Var.y1;
        float y = p75Var.getY() + p75Var.getMeasuredHeight();
        h94 h94Var = g95Var.q5;
        float f = y - h94Var.f;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.a;
        rectF.set(0.0f, f, measuredWidth, measuredHeight);
        float y2 = p75Var.getY() + p75Var.getMeasuredHeight();
        float measuredWidth2 = getMeasuredWidth();
        float measuredHeight2 = getMeasuredHeight();
        RectF rectF2 = this.b;
        rectF2.set(0.0f, y2, measuredWidth2, measuredHeight2);
        float y3 = (p75Var.getY() + p75Var.getMeasuredHeight()) - h94Var.f;
        float measuredWidth3 = getMeasuredWidth();
        float y4 = p75Var.getY() + p75Var.getMeasuredHeight();
        RectF rectF3 = this.c;
        rectF3.set(0.0f, y3, measuredWidth3, y4);
        int i = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i < 29 || g95Var.G4 == null || !canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF3, paint);
            paint.setColor(on2.l(234881023, -14933463));
            canvas.drawRect(rectF2, paint);
        } else {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f2 = g95Var.H4;
            canvas.scale(f2, f2);
            canvas.drawRenderNode(g95Var.G4);
            canvas.restore();
            paint.setColor(234881023);
            canvas.drawRect(rectF2, paint);
        }
        super.dispatchDraw(canvas);
    }
}
