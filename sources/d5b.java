// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class d5b extends FrameLayout {
    public final Paint a;
    public final lm b;
    public final /* synthetic */ wjb c;
    public final /* synthetic */ g5b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5b(g5b g5bVar, Context context, wjb wjbVar) {
        super(context);
        this.d = g5bVar;
        this.c = wjbVar;
        this.a = new Paint(1);
        this.b = new lm(this, 0L, 350L, s33.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int v0 = bkb.v0(bkb.g5, this.c);
        Paint paint = this.a;
        paint.setColor(v0);
        g5b g5bVar = this.d;
        float max = Math.max(0.0f, g5bVar.D0());
        boolean z = max < ((float) gl.m);
        lm lmVar = this.b;
        float R1 = gl.R1(max, 0.0f, lmVar.d(z));
        RectF rectF = gl.P;
        rectF.set(g5bVar.u0, R1, getWidth() - g5bVar.u0, gl.L(14.0f) + getHeight());
        float L = (1.0f - lmVar.c) * gl.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
        g5bVar.q1.setTranslationY(Math.max(gl.L(8.0f) + gl.m, gl.L(14.0f) + R1));
        canvas.save();
        canvas.clipRect(g5bVar.u0, gl.L(14.0f) + gl.m, getWidth() - g5bVar.u0, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        g5b g5bVar = this.d;
        if (y >= g5bVar.D0()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        g5bVar.dismiss();
        return true;
    }
}
