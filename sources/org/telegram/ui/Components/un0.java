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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class un0 extends View {
    public tn0 a;
    public final e6 b;
    public final ch.d c;
    public zg.o0 d;
    public boolean e;
    public final Path f;
    public final RectF h;
    public final RectF n;
    public boolean r;
    public final /* synthetic */ vn0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un0(vn0 vn0Var, Context context) {
        super(context);
        this.s = vn0Var;
        this.b = new e6(this, 0L, 260L, qr.h);
        this.f = new Path();
        this.h = new RectF();
        this.n = new RectF();
        w7.a6.a(this);
        ah.c cVar = vn0Var.v;
        if (cVar != null) {
            ch.d c10 = cVar.c(this, null, false);
            c10.o(vn0Var.w);
            c10.u(AndroidUtilities.dp(5.0f));
            ch.d n10 = c10.n();
            n10.q(AndroidUtilities.dp(6.0f));
            n10.p(AndroidUtilities.dp(4.0f));
            this.c = n10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        tn0 tn0Var = this.a;
        if (tn0Var != null) {
            tn0Var.p = z10;
            e6 e6Var = this.b;
            if (z11) {
                tn0Var.i = tn0Var.N;
                tn0Var.g = tn0Var.O;
                tn0Var.h = tn0Var.P;
                e6Var.d(0.0f, true);
            } else {
                e6Var.d(1.0f, true);
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
        tn0 tn0Var = this.a;
        if (tn0Var != null) {
            tn0Var.a();
        }
        this.r = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r) {
            tn0 tn0Var = this.a;
            if (tn0Var != null) {
                tn0Var.b();
            }
            this.r = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        vn0 vn0Var = this.s;
        Paint paint = vn0Var.x;
        int width = (getWidth() - this.a.A) / 2;
        int height = getHeight();
        tn0 tn0Var = this.a;
        int i10 = tn0Var.B;
        int i11 = (height - i10) / 2;
        ch.d dVar = this.c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i11, tn0Var.A + width, i10 + i11);
            RectF rectF = this.n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f;
            if (!equals) {
                rectF2.set(rectF);
                zg.p0.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.e6 e6Var = vn0Var.c;
            paint.setColor((e6Var == null ? !org.telegram.ui.ActionBar.j6.I.q() : !e6Var.a()) ? -1 : 687865855);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.a.d(canvas, width, i11, this.b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int dp = AndroidUtilities.dp(8.67f);
        tn0 tn0Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp + (tn0Var != null ? tn0Var.A : AndroidUtilities.dp(44.33f)), TLObject.FLAG_30), i11);
    }
}
