package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class t01 extends FrameLayout {
    public final Paint a;
    public final RectF b;
    public final u5 c;
    public final String d;
    public final /* synthetic */ v01 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t01(v01 v01Var, Context context) {
        super(context);
        this.e = v01Var;
        this.a = new Paint(1);
        this.b = new RectF();
        this.c = new u5(this, 0L, 260L, er.h);
        this.d = "";
        setWillNotDraw(false);
        c8.na.a(this);
        addView(new i9(context), c8.ja.d(20, 20.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float e10 = this.c.e(false, 0.0f);
        int i7 = org.telegram.ui.ActionBar.j6.tk;
        v01 v01Var = this.e;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, v01Var.e);
        RectF rectF = this.b;
        rectF.set(org.telegram.messenger.g0.L(3.0f), (getHeight() - org.telegram.messenger.g0.L(28.0f)) / 2.0f, getWidth() - org.telegram.messenger.g0.L(3.0f), (org.telegram.messenger.g0.L(28.0f) + getHeight()) / 2.0f);
        int f10 = i0.a.f(e10, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.O5, v01Var.e), w02);
        Paint paint = this.a;
        paint.setColor(f10);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
        v01Var.h0.setColor(i0.a.f(e10, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, v01Var.e), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.wk, v01Var.e)));
        canvas.drawText(this.d, org.telegram.messenger.g0.L(35.0f), rectF.centerY() - ((v01Var.h0.ascent() + v01Var.h0.descent()) / 2.0f), v01Var.h0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(org.telegram.messenger.i20.B(13.0f, org.telegram.messenger.g0.L(35.0f) + ((int) Math.ceil(this.e.h0.measureText(this.d))), TLObject.FLAG_30), i10);
    }
}
