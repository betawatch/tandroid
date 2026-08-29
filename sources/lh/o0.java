package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import jh.va;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class o0 extends LinearLayout {
    public va a;
    public final Path b;
    public final Paint c;
    public long d;
    public final org.telegram.ui.Components.d6 e;
    public final /* synthetic */ r0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r0 r0Var, Context context) {
        super(context);
        this.f = r0Var;
        this.b = new Path();
        this.c = new Paint(1);
        this.d = 0L;
        this.e = new org.telegram.ui.Components.d6(this, 0L, 1000L, new LinearInterpolator());
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
        r0 r0Var = this.f;
        t0 t0Var = r0Var.f;
        if (t0Var != null) {
            int b10 = s.b(t0Var.a, t0Var.b(), 3);
            t0 t0Var2 = r0Var.f;
            int b11 = s.b(t0Var2.a, t0Var2.b(), 5);
            canvas.drawColor(b10);
            long j10 = this.d;
            t0 t0Var3 = r0Var.f;
            long j11 = t0Var3.b;
            org.telegram.ui.Components.d6 d6Var = this.e;
            if (j10 != j11) {
                d6Var.d(t0Var3.a(), true);
            }
            float d = d6Var.d(r0Var.f.a(), false);
            this.d = r0Var.f.b;
            Paint paint = this.c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * d, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.a == null) {
            this.a = new va(1, MediaDataController.MAX_LINKS_COUNT);
        }
        this.a.f(0, 0, getWidth(), getHeight());
        va vaVar = this.a;
        vaVar.h = 30.0f;
        vaVar.d();
        this.a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
