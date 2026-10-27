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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class oo0 extends View {
    public no0 a;
    public final h6 b;
    public final eh.d c;
    public bh.x0 d;
    public boolean e;
    public final Path f;
    public final RectF h;
    public final RectF n;
    public boolean r;
    public final /* synthetic */ po0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0(po0 po0Var, Context context) {
        super(context);
        this.s = po0Var;
        this.b = new h6(this, 0L, 260L, ds.h);
        this.f = new Path();
        this.h = new RectF();
        this.n = new RectF();
        kb1.b(this);
        ch.b bVar = po0Var.v;
        if (bVar != null) {
            eh.d c10 = bVar.c(this, null, false);
            c10.v(po0Var.w);
            c10.A(AndroidUtilities.dp(5.0f));
            eh.d u10 = c10.u();
            org.telegram.messenger.wh.s(u10, AndroidUtilities.dp(6.0f), 4.0f);
            this.c = u10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        no0 no0Var = this.a;
        if (no0Var != null) {
            no0Var.p = z10;
            h6 h6Var = this.b;
            if (z11) {
                no0Var.i = no0Var.N;
                no0Var.g = no0Var.O;
                no0Var.h = no0Var.P;
                h6Var.d(0.0f, true);
            } else {
                h6Var.d(1.0f, true);
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
        no0 no0Var = this.a;
        if (no0Var != null) {
            no0Var.a();
        }
        this.r = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r) {
            no0 no0Var = this.a;
            if (no0Var != null) {
                no0Var.b();
            }
            this.r = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        po0 po0Var = this.s;
        Paint paint = po0Var.x;
        int width = (getWidth() - this.a.A) / 2;
        int height = getHeight();
        no0 no0Var = this.a;
        int i10 = no0Var.B;
        int i11 = (height - i10) / 2;
        eh.d dVar = this.c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i11, no0Var.A + width, i10 + i11);
            RectF rectF = this.n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f;
            if (!equals) {
                rectF2.set(rectF);
                bh.y0.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.u6 u6Var = po0Var.c;
            paint.setColor((u6Var == null ? !org.telegram.ui.ActionBar.y6.I.q() : !u6Var.a()) ? -1 : 687865855);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.a.d(canvas, width, i11, this.b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int dp = AndroidUtilities.dp(8.67f);
        no0 no0Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp + (no0Var != null ? no0Var.A : AndroidUtilities.dp(44.33f)), TLObject.FLAG_30), i11);
    }
}
