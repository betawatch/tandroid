package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class q01 extends FrameLayout {
    public final Paint a;
    public final RectF b;
    public final w5 c;
    public final String d;
    public final /* synthetic */ s01 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q01(s01 s01Var, Context context) {
        super(context);
        this.e = s01Var;
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
        int i7 = org.telegram.ui.ActionBar.k6.qk;
        s01 s01Var = this.e;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, s01Var.e);
        RectF rectF = this.b;
        rectF.set(org.telegram.messenger.g0.L(3.0f), (getHeight() - org.telegram.messenger.g0.L(28.0f)) / 2.0f, getWidth() - org.telegram.messenger.g0.L(3.0f), (org.telegram.messenger.g0.L(28.0f) + getHeight()) / 2.0f);
        int f10 = i0.a.f(e10, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.O5, s01Var.e), w02);
        Paint paint = this.a;
        paint.setColor(f10);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
        s01Var.g0.setColor(i0.a.f(e10, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, s01Var.e), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.tk, s01Var.e)));
        canvas.drawText(this.d, org.telegram.messenger.g0.L(35.0f), rectF.centerY() - ((s01Var.g0.ascent() + s01Var.g0.descent()) / 2.0f), s01Var.g0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(org.telegram.messenger.camera.q.B(13.0f, org.telegram.messenger.g0.L(35.0f) + ((int) Math.ceil(this.e.g0.measureText(this.d))), TLObject.FLAG_30), i10);
    }
}
