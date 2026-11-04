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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class iq0 extends View {
    public final Paint a;
    public final org.telegram.ui.Components.g6 b;
    public final TextPaint c;
    public StaticLayout d;
    public float e;
    public float f;
    public final org.telegram.ui.Components.g6 h;
    public String n;
    public boolean r;
    public final org.telegram.ui.Components.u5 s;
    public boolean w;
    public int x;

    public iq0(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        this.r = false;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.s = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
        paint.setColor(2130706432);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.b = g6Var;
        g6Var.n(0.3f, 320L, xqVar);
        g6Var.u(-1);
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.setCallback(this);
        g6Var.t("0", true, true);
        Point point = org.telegram.messenger.g0.q;
        g6Var.M = point.x;
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        c();
        org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(false, true, true);
        this.h = g6Var2;
        g6Var2.n(0.3f, 320L, xqVar);
        g6Var2.u(-1);
        g6Var2.w(org.telegram.messenger.g0.L(14.0f));
        g6Var2.x(org.telegram.messenger.g0.o());
        g6Var2.setCallback(this);
        g6Var2.t("0", true, true);
        g6Var2.M = point.x;
    }

    public final void a(int i3, int i10) {
        b(i3, i10, true);
    }

    public final void b(int i3, int i10, boolean z10) {
        boolean z11 = false;
        int max = Math.max(0, i3);
        int max2 = Math.max(max, i10);
        if (org.telegram.messenger.bd.E0().B != null && !TextUtils.equals(this.n, org.telegram.messenger.bd.E0().B.c)) {
            c();
        }
        this.b.t(String.format("%d", Integer.valueOf(org.telegram.messenger.bd.a0 ? max2 : max)), (!z10 || this.w || org.telegram.messenger.bd.a0) ? false : true, true);
        if (!org.telegram.messenger.bd.a0) {
            max = max2;
        }
        String format = String.format("%d", Integer.valueOf(max));
        if (z10 && !this.w && !org.telegram.messenger.bd.a0) {
            z11 = true;
        }
        this.h.t(format, z11, true);
        this.w = !z10;
    }

    public final void c() {
        this.n = org.telegram.messenger.bd.E0().B.c;
        StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.bd.M0(2131747837, null).replace("%1$d", "").replace("%2$d", ""), this.c, org.telegram.messenger.g0.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
        float e10 = this.s.e(false, this.r ? 1.0f : 0.0f);
        if (e10 <= 0.0f) {
            return;
        }
        org.telegram.ui.Components.g6 g6Var = this.b;
        float c2 = g6Var.c() + this.e;
        org.telegram.ui.Components.g6 g6Var2 = this.h;
        float c10 = g6Var2.c() + c2 + org.telegram.messenger.g0.L(18.0f);
        float f10 = ((1.0f - e10) * (-org.telegram.messenger.g0.L(8.0f))) + this.x;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - c10) / 2.0f, org.telegram.messenger.g0.N(10.0f) + f10, (getWidth() + c10) / 2.0f, org.telegram.messenger.g0.N(33.0f) + f10);
        Paint paint = this.a;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * e10));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(12.0f), org.telegram.messenger.g0.N(12.0f), paint);
        paint.setAlpha(alpha);
        canvas.save();
        canvas.translate(((getWidth() - c10) / 2.0f) + org.telegram.messenger.g0.L(9.0f), f10 + org.telegram.messenger.g0.L(9.5f));
        g6Var.setBounds(0, 0, (int) g6Var.c(), org.telegram.messenger.g0.L(23.0f));
        int i3 = (int) (e10 * 255.0f);
        g6Var.B = i3;
        g6Var.draw(canvas);
        canvas.translate(g6Var.c(), 0.0f);
        canvas.save();
        canvas.translate((-(this.d.getWidth() - this.e)) / 2.0f, ((this.f / 2.0f) + (org.telegram.messenger.g0.L(23.0f) - this.d.getHeight())) / 2.0f);
        this.c.setAlpha(i3);
        this.d.draw(canvas);
        canvas.restore();
        canvas.translate(this.e, 0.0f);
        g6Var2.setBounds(0, 0, (int) g6Var2.c(), org.telegram.messenger.g0.L(23.0f));
        g6Var2.B = i3;
        g6Var2.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        this.x = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
        this.b.M = size;
        this.h.M = size;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), org.telegram.messenger.camera.q.B(43.0f, this.x, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.b == drawable || this.h == drawable || super.verifyDrawable(drawable);
    }
}
