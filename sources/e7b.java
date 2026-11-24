// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class e7b extends FrameLayout {
    public final Paint a;
    public final ln b;
    public final /* synthetic */ ylb c;
    public final /* synthetic */ h7b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7b(h7b h7bVar, Context context, ylb ylbVar) {
        super(context);
        this.d = h7bVar;
        this.c = ylbVar;
        this.a = new Paint(1);
        this.b = new ln(this, 0L, 350L, d53.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int v0 = cmb.v0(cmb.g5, this.c);
        Paint paint = this.a;
        paint.setColor(v0);
        h7b h7bVar = this.d;
        float max = Math.max(0.0f, h7bVar.D0());
        boolean z = max < ((float) gm.m);
        ln lnVar = this.b;
        float R1 = gm.R1(max, 0.0f, lnVar.d(z));
        RectF rectF = gm.P;
        rectF.set(h7bVar.u0, R1, getWidth() - h7bVar.u0, gm.L(14.0f) + getHeight());
        float L = (1.0f - lnVar.c) * gm.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
        h7bVar.q1.setTranslationY(Math.max(gm.L(8.0f) + gm.m, gm.L(14.0f) + R1));
        canvas.save();
        canvas.clipRect(h7bVar.u0, gm.L(14.0f) + gm.m, getWidth() - h7bVar.u0, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        h7b h7bVar = this.d;
        if (y >= h7bVar.D0()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        h7bVar.dismiss();
        return true;
    }
}
