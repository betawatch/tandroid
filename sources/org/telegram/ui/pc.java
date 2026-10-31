package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pc extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Path e;
    public final Path f;
    public boolean h;
    public boolean n;
    public final org.telegram.ui.Components.dc r;
    public boolean s;
    public final org.telegram.ui.Components.t5 w;
    public final /* synthetic */ qc x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc(qc qcVar, Context context) {
        super(context);
        this.x = qcVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Path();
        this.f = new Path();
        this.r = new org.telegram.ui.Components.dc(this);
        this.w = new org.telegram.ui.Components.t5(this, 0L, 320L, org.telegram.ui.Components.gr.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(org.telegram.messenger.kp kpVar) {
        org.telegram.ui.ActionBar.p6 p6Var = this.x.a;
        boolean a2 = p6Var != null ? p6Var.a() : org.telegram.ui.ActionBar.t6.I.q();
        Paint paint = this.c;
        Paint paint2 = this.b;
        if (a2) {
            if (kpVar.g() != kpVar.f()) {
                if (!(kpVar.i() != kpVar.f())) {
                    paint2.setColor(kpVar.e(1, p6Var));
                    paint.setColor(kpVar.e(0, p6Var));
                    this.d.setColor(kpVar.e(2, p6Var));
                    this.h = kpVar.g() == kpVar.f();
                    this.n = kpVar.i() != kpVar.f();
                }
            }
        }
        paint2.setColor(kpVar.e(0, p6Var));
        paint.setColor(kpVar.e(1, p6Var));
        this.d.setColor(kpVar.e(2, p6Var));
        this.h = kpVar.g() == kpVar.f();
        this.n = kpVar.i() != kpVar.f();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a2 = this.r.a(0.05f);
        canvas.scale(a2, a2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.e);
        canvas.drawPaint(this.b);
        if (this.h) {
            canvas.drawPath(this.f, this.c);
        }
        canvas.restore();
        if (this.n) {
            canvas.save();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set((getMeasuredWidth() - org.telegram.messenger.i0.L(12.4f)) / 2.0f, (getMeasuredHeight() - org.telegram.messenger.i0.L(12.4f)) / 2.0f, (org.telegram.messenger.i0.L(12.4f) + getMeasuredWidth()) / 2.0f, (org.telegram.messenger.i0.L(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.33f), org.telegram.messenger.i0.L(2.33f), this.d);
            canvas.restore();
        }
        float d = this.w.d(this.s);
        if (d > 0.0f) {
            float N = org.telegram.messenger.i0.N(2.0f);
            Paint paint = this.a;
            paint.setStrokeWidth(N);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, org.telegram.messenger.i0.T1((paint.getStrokeWidth() * 0.5f) + org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f) - (paint.getStrokeWidth() * 2.0f), d), paint);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(org.telegram.messenger.i0.L(56.0f), org.telegram.messenger.i0.L(56.0f));
        Path path = this.e;
        path.rewind();
        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, org.telegram.messenger.i0.L(20.0f), Path.Direction.CW);
        Path path2 = this.f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        this.a.setColor(i10);
    }

    @Override // android.view.View
    public final void setPressed(boolean z10) {
        super.setPressed(z10);
        this.r.c(z10);
    }
}
