package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cs0 extends View {
    public final Paint a;
    public final org.telegram.ui.Components.e6 b;
    public final TextPaint c;
    public StaticLayout d;
    public float e;
    public float f;
    public final org.telegram.ui.Components.e6 h;
    public String n;
    public boolean r;
    public final org.telegram.ui.Components.t5 s;
    public boolean w;
    public int x;

    public cs0(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        this.r = false;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.s = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        paint.setColor(2130706432);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        this.b = e6Var;
        e6Var.n(0.3f, 320L, grVar);
        e6Var.u(-1);
        e6Var.w(org.telegram.messenger.i0.L(14.0f));
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.setCallback(this);
        e6Var.t("0", true, true);
        Point point = org.telegram.messenger.i0.q;
        e6Var.M = point.x;
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        c();
        org.telegram.ui.Components.e6 e6Var2 = new org.telegram.ui.Components.e6(false, true, true);
        this.h = e6Var2;
        e6Var2.n(0.3f, 320L, grVar);
        e6Var2.u(-1);
        e6Var2.w(org.telegram.messenger.i0.L(14.0f));
        e6Var2.x(org.telegram.messenger.i0.o());
        e6Var2.setCallback(this);
        e6Var2.t("0", true, true);
        e6Var2.M = point.x;
    }

    public final void a(int i10, int i11) {
        b(i10, i11, true);
    }

    public final void b(int i10, int i11, boolean z10) {
        boolean z11 = false;
        int max = Math.max(0, i10);
        int max2 = Math.max(max, i11);
        if (org.telegram.messenger.cd.D0().B != null && !TextUtils.equals(this.n, org.telegram.messenger.cd.D0().B.c)) {
            c();
        }
        this.b.t(String.format("%d", Integer.valueOf(org.telegram.messenger.cd.X ? max2 : max)), (!z10 || this.w || org.telegram.messenger.cd.X) ? false : true, true);
        if (!org.telegram.messenger.cd.X) {
            max = max2;
        }
        String format = String.format("%d", Integer.valueOf(max));
        if (z10 && !this.w && !org.telegram.messenger.cd.X) {
            z11 = true;
        }
        this.h.t(format, z11, true);
        this.w = !z10;
    }

    public final void c() {
        this.n = org.telegram.messenger.cd.D0().B.c;
        StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.cd.L0(2131747845, null).replace("%1$d", "").replace("%2$d", ""), this.c, org.telegram.messenger.i0.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() >= 1) {
            this.e = this.d.getLineWidth(0);
            this.f = this.d.getLineDescent(0);
        } else {
            this.e = 0.0f;
            this.f = 0.0f;
        }
    }

    public final void d(boolean z10, boolean z11) {
        if (this.r != z10) {
            this.r = z10;
            if (!z10) {
                this.w = true;
            }
            if (!z11) {
                this.s.e(true, z10 ? 1.0f : 0.0f);
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean isShown() {
        return this.r;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e = this.s.e(false, this.r ? 1.0f : 0.0f);
        if (e <= 0.0f) {
            return;
        }
        org.telegram.ui.Components.e6 e6Var = this.b;
        float c10 = e6Var.c() + this.e;
        org.telegram.ui.Components.e6 e6Var2 = this.h;
        float c11 = e6Var2.c() + c10 + org.telegram.messenger.i0.L(18.0f);
        float f7 = ((1.0f - e) * (-org.telegram.messenger.i0.L(8.0f))) + this.x;
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set((getWidth() - c11) / 2.0f, org.telegram.messenger.i0.N(10.0f) + f7, (getWidth() + c11) / 2.0f, org.telegram.messenger.i0.N(33.0f) + f7);
        Paint paint = this.a;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * e));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.N(12.0f), org.telegram.messenger.i0.N(12.0f), paint);
        paint.setAlpha(alpha);
        canvas.save();
        canvas.translate(((getWidth() - c11) / 2.0f) + org.telegram.messenger.i0.L(9.0f), f7 + org.telegram.messenger.i0.L(9.5f));
        e6Var.setBounds(0, 0, (int) e6Var.c(), org.telegram.messenger.i0.L(23.0f));
        int i10 = (int) (e * 255.0f);
        e6Var.B = i10;
        e6Var.draw(canvas);
        canvas.translate(e6Var.c(), 0.0f);
        canvas.save();
        canvas.translate((-(this.d.getWidth() - this.e)) / 2.0f, ((this.f / 2.0f) + (org.telegram.messenger.i0.L(23.0f) - this.d.getHeight())) / 2.0f);
        this.c.setAlpha(i10);
        this.d.draw(canvas);
        canvas.restore();
        canvas.translate(this.e, 0.0f);
        e6Var2.setBounds(0, 0, (int) e6Var2.c(), org.telegram.messenger.i0.L(23.0f));
        e6Var2.B = i10;
        e6Var2.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        this.x = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m;
        this.b.M = size;
        this.h.M = size;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), org.telegram.messenger.z20.B(43.0f, this.x, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.b == drawable || this.h == drawable || super.verifyDrawable(drawable);
    }
}
