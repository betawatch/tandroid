package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class i1 extends LinearLayout {
    public yh.k8 a;
    public final Path b;
    public final Paint c;
    public long d;
    public final org.telegram.ui.Components.c6 e;
    public final /* synthetic */ l1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(l1 l1Var, Context context) {
        super(context);
        this.f = l1Var;
        this.b = new Path();
        this.c = new Paint(1);
        this.d = 0L;
        this.e = new org.telegram.ui.Components.c6(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.b;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        l1 l1Var = this.f;
        n1 n1Var = l1Var.f;
        if (n1Var != null) {
            int b10 = g0.b(n1Var.a, n1Var.b(), 3);
            n1 n1Var2 = l1Var.f;
            int b11 = g0.b(n1Var2.a, n1Var2.b(), 5);
            canvas.drawColor(b10);
            long j3 = this.d;
            n1 n1Var3 = l1Var.f;
            long j10 = n1Var3.b;
            org.telegram.ui.Components.c6 c6Var = this.e;
            if (j3 != j10) {
                c6Var.d(n1Var3.a(), true);
            }
            float d = c6Var.d(l1Var.f.a(), false);
            this.d = l1Var.f.b;
            Paint paint = this.c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * d, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.a == null) {
            this.a = new yh.k8(1, MediaDataController.MAX_LINKS_COUNT);
        }
        this.a.f(0, 0, getWidth(), getHeight());
        yh.k8 k8Var = this.a;
        k8Var.h = 30.0f;
        k8Var.d();
        this.a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
