package ci;

import ai.ce;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class r0 extends LinearLayout {
    public ce a;
    public final Path b;
    public final Paint c;
    public long d;
    public final org.telegram.ui.Components.f6 e;
    public final /* synthetic */ u0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(u0 u0Var, Context context) {
        super(context);
        this.f = u0Var;
        this.b = new Path();
        this.c = new Paint(1);
        this.d = 0L;
        this.e = new org.telegram.ui.Components.f6(this, 0L, 1000L, new LinearInterpolator());
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
        u0 u0Var = this.f;
        w0 w0Var = u0Var.f;
        if (w0Var != null) {
            int b10 = u.b(w0Var.a, w0Var.b(), 3);
            w0 w0Var2 = u0Var.f;
            int b11 = u.b(w0Var2.a, w0Var2.b(), 5);
            canvas.drawColor(b10);
            long j10 = this.d;
            w0 w0Var3 = u0Var.f;
            long j11 = w0Var3.b;
            org.telegram.ui.Components.f6 f6Var = this.e;
            if (j10 != j11) {
                f6Var.d(w0Var3.a(), true);
            }
            float d = f6Var.d(u0Var.f.a(), false);
            this.d = u0Var.f.b;
            Paint paint = this.c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * d, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.a == null) {
            this.a = new ce(1, MediaDataController.MAX_LINKS_COUNT);
        }
        this.a.f(0, 0, getWidth(), getHeight());
        ce ceVar = this.a;
        ceVar.h = 30.0f;
        ceVar.d();
        this.a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
