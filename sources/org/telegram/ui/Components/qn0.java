package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qn0 extends View {
    public pn0 a;
    public final d6 b;
    public final bh.d c;
    public yg.p0 d;
    public boolean e;
    public final Path f;
    public final RectF h;
    public final RectF n;
    public boolean r;
    public final /* synthetic */ rn0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn0(rn0 rn0Var, Context context) {
        super(context);
        this.s = rn0Var;
        this.b = new d6(this, 0L, 260L, wr.h);
        this.f = new Path();
        this.h = new RectF();
        this.n = new RectF();
        w7.c6.a(this);
        zg.a aVar = rn0Var.v;
        if (aVar != null) {
            bh.d c10 = aVar.c(this, null, false);
            c10.n(rn0Var.w);
            c10.t(AndroidUtilities.dp(5.0f));
            bh.d m10 = c10.m();
            m10.p(AndroidUtilities.dp(6.0f));
            m10.o(AndroidUtilities.dp(4.0f));
            this.c = m10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        pn0 pn0Var = this.a;
        if (pn0Var != null) {
            pn0Var.p = z10;
            d6 d6Var = this.b;
            if (z11) {
                pn0Var.i = pn0Var.N;
                pn0Var.g = pn0Var.O;
                pn0Var.h = pn0Var.P;
                d6Var.d(0.0f, true);
            } else {
                d6Var.d(1.0f, true);
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.r) {
            return;
        }
        pn0 pn0Var = this.a;
        if (pn0Var != null) {
            pn0Var.a();
        }
        this.r = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r) {
            pn0 pn0Var = this.a;
            if (pn0Var != null) {
                pn0Var.b();
            }
            this.r = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        rn0 rn0Var = this.s;
        Paint paint = rn0Var.x;
        int width = (getWidth() - this.a.A) / 2;
        int height = getHeight();
        pn0 pn0Var = this.a;
        int i10 = pn0Var.B;
        int i11 = (height - i10) / 2;
        bh.d dVar = this.c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i11, pn0Var.A + width, i10 + i11);
            RectF rectF = this.n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f;
            if (!equals) {
                rectF2.set(rectF);
                yg.q0.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.f6 f6Var = rn0Var.c;
            paint.setColor((f6Var == null ? !org.telegram.ui.ActionBar.j6.I.q() : !f6Var.a()) ? -1 : 687865855);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.a.d(canvas, width, i11, this.b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int dp = AndroidUtilities.dp(8.67f);
        pn0 pn0Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp + (pn0Var != null ? pn0Var.A : AndroidUtilities.dp(44.33f)), TLObject.FLAG_30), i11);
    }
}
