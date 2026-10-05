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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class zn0 extends View {
    public yn0 a;
    public final e6 b;
    public final ch.d c;
    public zg.m0 d;
    public boolean e;
    public final Path f;
    public final RectF h;
    public final RectF n;
    public boolean r;
    public final /* synthetic */ ao0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn0(ao0 ao0Var, Context context) {
        super(context);
        this.s = ao0Var;
        this.b = new e6(this, 0L, 260L, tr.h);
        this.f = new Path();
        this.h = new RectF();
        this.n = new RectF();
        w7.b6.a(this);
        ah.c cVar = ao0Var.v;
        if (cVar != null) {
            ch.d c10 = cVar.c(this, null, false);
            c10.w(ao0Var.w);
            c10.B(AndroidUtilities.dp(5.0f));
            ch.d v = c10.v();
            v.y(AndroidUtilities.dp(6.0f));
            v.x(AndroidUtilities.dp(4.0f));
            this.c = v;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        yn0 yn0Var = this.a;
        if (yn0Var != null) {
            yn0Var.p = z10;
            e6 e6Var = this.b;
            if (z11) {
                yn0Var.i = yn0Var.N;
                yn0Var.g = yn0Var.O;
                yn0Var.h = yn0Var.P;
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
        yn0 yn0Var = this.a;
        if (yn0Var != null) {
            yn0Var.a();
        }
        this.r = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r) {
            yn0 yn0Var = this.a;
            if (yn0Var != null) {
                yn0Var.b();
            }
            this.r = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ao0 ao0Var = this.s;
        Paint paint = ao0Var.x;
        int width = (getWidth() - this.a.A) / 2;
        int height = getHeight();
        yn0 yn0Var = this.a;
        int i10 = yn0Var.B;
        int i11 = (height - i10) / 2;
        ch.d dVar = this.c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i11, yn0Var.A + width, i10 + i11);
            RectF rectF = this.n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f;
            if (!equals) {
                rectF2.set(rectF);
                zg.n0.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.d6 d6Var = ao0Var.c;
            paint.setColor((d6Var == null ? !org.telegram.ui.ActionBar.i6.I.q() : !d6Var.a()) ? -1 : 687865855);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.a.d(canvas, width, i11, this.b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int dp = AndroidUtilities.dp(8.67f);
        yn0 yn0Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp + (yn0Var != null ? yn0Var.A : AndroidUtilities.dp(44.33f)), TLObject.FLAG_30), i11);
    }
}
