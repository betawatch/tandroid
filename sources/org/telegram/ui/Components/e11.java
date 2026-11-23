package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class e11 extends FrameLayout {
    public final q9 a;
    public final Paint b;
    public final RectF c;
    public final d6 d;
    public d11 e;
    public String f;
    public p5 h;
    public int n;
    public boolean r;
    public final /* synthetic */ g11 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e11(g11 g11Var, Context context) {
        super(context);
        this.s = g11Var;
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new d6(this, 0L, 260L, nr.h);
        setWillNotDraw(false);
        c8.ra.a(this);
        q9 q9Var = new q9(context);
        this.a = q9Var;
        addView(q9Var, c8.ma.d(20, 20.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z10) {
        boolean z11;
        d11 d11Var = this.e;
        if (d11Var != null) {
            long j3 = d11Var.a;
            g11 g11Var = this.s;
            if (j3 == 0 ? d11Var.b.equals(g11Var.W) : j3 == g11Var.V) {
                z11 = true;
                this.r = z11;
                if (!z10) {
                    this.d.e(true, z11 ? 1.0f : 0.0f);
                }
                invalidate();
            }
        }
        z11 = false;
        this.r = z11;
        if (!z10) {
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float e10 = this.d.e(false, this.r ? 1.0f : 0.0f);
        int i7 = org.telegram.ui.ActionBar.m6.tk;
        g11 g11Var = this.s;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, g11Var.e);
        RectF rectF = this.c;
        rectF.set(org.telegram.messenger.g0.L(3.0f), (getHeight() - org.telegram.messenger.g0.L(28.0f)) / 2.0f, getWidth() - org.telegram.messenger.g0.L(3.0f), (org.telegram.messenger.g0.L(28.0f) + getHeight()) / 2.0f);
        int f10 = i0.a.f(e10, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.O5, g11Var.e), w02);
        Paint paint = this.b;
        paint.setColor(f10);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
        int f11 = i0.a.f(e10, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, g11Var.e), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wk, g11Var.e));
        p5 p5Var = this.h;
        if (p5Var != null && this.n != f11) {
            this.n = f11;
            p5Var.setColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN));
            this.a.invalidate();
        }
        if (this.f != null) {
            g11Var.l0.setColor(f11);
            canvas.drawText(this.f, org.telegram.messenger.g0.L(15.0f), rectF.centerY() - ((g11Var.l0.ascent() + g11Var.l0.descent()) / 2.0f), g11Var.l0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int L;
        if (this.f == null) {
            L = org.telegram.messenger.g0.L(44.0f);
        } else {
            L = org.telegram.messenger.g0.L(15.0f) + org.telegram.messenger.g0.L(15.0f) + ((int) Math.ceil(this.s.l0.measureText(this.f)));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30), i10);
    }
}
