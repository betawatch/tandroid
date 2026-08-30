package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import lh.wa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class p0 extends LinearLayout {
    public wa a;
    public final Path b;
    public final Paint c;
    public long d;
    public final org.telegram.ui.Components.z5 e;
    public final /* synthetic */ s0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(s0 s0Var, Context context) {
        super(context);
        this.f = s0Var;
        this.b = new Path();
        this.c = new Paint(1);
        this.d = 0L;
        this.e = new org.telegram.ui.Components.z5(this, 0L, 1000L, new LinearInterpolator());
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
        s0 s0Var = this.f;
        u0 u0Var = s0Var.f;
        if (u0Var != null) {
            int b10 = t.b(u0Var.a, u0Var.b(), 3);
            u0 u0Var2 = s0Var.f;
            int b11 = t.b(u0Var2.a, u0Var2.b(), 5);
            canvas.drawColor(b10);
            long j10 = this.d;
            u0 u0Var3 = s0Var.f;
            long j11 = u0Var3.b;
            org.telegram.ui.Components.z5 z5Var = this.e;
            if (j10 != j11) {
                z5Var.d(u0Var3.a(), true);
            }
            float d = z5Var.d(s0Var.f.a(), false);
            this.d = s0Var.f.b;
            Paint paint = this.c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * d, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.a == null) {
            this.a = new wa(1, MediaDataController.MAX_LINKS_COUNT);
        }
        this.a.f(0, 0, getWidth(), getHeight());
        wa waVar = this.a;
        waVar.h = 30.0f;
        waVar.d();
        this.a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
