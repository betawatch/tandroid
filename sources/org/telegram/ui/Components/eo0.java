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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class eo0 extends View {
    public do0 a;
    public final f6 b;
    public final dh.d c;
    public ah.i1 d;
    public boolean e;
    public final Path f;
    public final RectF h;
    public final RectF n;
    public boolean r;
    public final /* synthetic */ fo0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo0(fo0 fo0Var, Context context) {
        super(context);
        this.s = fo0Var;
        this.b = new f6(this, 0L, 260L, bs.h);
        this.f = new Path();
        this.h = new RectF();
        this.n = new RectF();
        w7.b6.a(this);
        bh.b bVar = fo0Var.v;
        if (bVar != null) {
            dh.d c10 = bVar.c(this, null, false);
            c10.o(fo0Var.w);
            c10.u(AndroidUtilities.dp(5.0f));
            dh.d n10 = c10.n();
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
        do0 do0Var = this.a;
        if (do0Var != null) {
            do0Var.p = z10;
            f6 f6Var = this.b;
            if (z11) {
                do0Var.i = do0Var.N;
                do0Var.g = do0Var.O;
                do0Var.h = do0Var.P;
                f6Var.d(0.0f, true);
            } else {
                f6Var.d(1.0f, true);
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
        do0 do0Var = this.a;
        if (do0Var != null) {
            do0Var.a();
        }
        this.r = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r) {
            do0 do0Var = this.a;
            if (do0Var != null) {
                do0Var.b();
            }
            this.r = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        fo0 fo0Var = this.s;
        Paint paint = fo0Var.x;
        int width = (getWidth() - this.a.A) / 2;
        int height = getHeight();
        do0 do0Var = this.a;
        int i10 = do0Var.B;
        int i11 = (height - i10) / 2;
        dh.d dVar = this.c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i11, do0Var.A + width, i10 + i11);
            RectF rectF = this.n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f;
            if (!equals) {
                rectF2.set(rectF);
                ah.j1.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.d6 d6Var = fo0Var.c;
            paint.setColor((d6Var == null ? !org.telegram.ui.ActionBar.h6.I.q() : !d6Var.a()) ? -1 : 687865855);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.a.d(canvas, width, i11, this.b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int dp = AndroidUtilities.dp(8.67f);
        do0 do0Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp + (do0Var != null ? do0Var.A : AndroidUtilities.dp(44.33f)), TLObject.FLAG_30), i11);
    }
}
