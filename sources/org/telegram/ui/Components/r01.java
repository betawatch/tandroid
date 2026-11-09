package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class r01 extends FrameLayout {
    public final Paint a;
    public final RectF b;
    public final w5 c;
    public final String d;
    public final /* synthetic */ t01 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r01(t01 t01Var, Context context) {
        super(context);
        this.e = t01Var;
        this.a = new Paint(1);
        this.b = new RectF();
        this.c = new w5(this, 0L, 260L, xq.h);
        this.d = "";
        setWillNotDraw(false);
        c8.ka.a(this);
        addView(new l9(context), c8.ha.d(20, 20.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float e10 = this.c.e(false, 0.0f);
        int i7 = org.telegram.ui.ActionBar.l6.qk;
        t01 t01Var = this.e;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i7, t01Var.e);
        RectF rectF = this.b;
        rectF.set(org.telegram.messenger.g0.L(3.0f), (getHeight() - org.telegram.messenger.g0.L(28.0f)) / 2.0f, getWidth() - org.telegram.messenger.g0.L(3.0f), (org.telegram.messenger.g0.L(28.0f) + getHeight()) / 2.0f);
        int f10 = i0.a.f(e10, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.O5, t01Var.e), w02);
        Paint paint = this.a;
        paint.setColor(f10);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
        t01Var.g0.setColor(i0.a.f(e10, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G6, t01Var.e), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.tk, t01Var.e)));
        canvas.drawText(this.d, org.telegram.messenger.g0.L(35.0f), rectF.centerY() - ((t01Var.g0.ascent() + t01Var.g0.descent()) / 2.0f), t01Var.g0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(org.telegram.messenger.camera.q.B(13.0f, org.telegram.messenger.g0.L(35.0f) + ((int) Math.ceil(this.e.g0.measureText(this.d))), TLObject.FLAG_30), i10);
    }
}
