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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class gn0 extends View {
    public fn0 a;
    public final e6 b;
    public final dh.d c;
    public ah.j1 d;
    public boolean e;
    public final Path f;
    public final RectF h;
    public final RectF n;
    public boolean r;
    public final /* synthetic */ hn0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn0(hn0 hn0Var, Context context) {
        super(context);
        this.s = hn0Var;
        this.b = new e6(this, 0L, 260L, pr.h);
        this.f = new Path();
        this.h = new RectF();
        this.n = new RectF();
        w7.z5.a(this);
        bh.b bVar = hn0Var.v;
        if (bVar != null) {
            dh.d c10 = bVar.c(this, null, false);
            c10.n(hn0Var.w);
            c10.t(AndroidUtilities.dp(5.0f));
            dh.d m10 = c10.m();
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
        fn0 fn0Var = this.a;
        if (fn0Var != null) {
            fn0Var.p = z10;
            e6 e6Var = this.b;
            if (z11) {
                fn0Var.i = fn0Var.N;
                fn0Var.g = fn0Var.O;
                fn0Var.h = fn0Var.P;
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
        fn0 fn0Var = this.a;
        if (fn0Var != null) {
            fn0Var.a();
        }
        this.r = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r) {
            fn0 fn0Var = this.a;
            if (fn0Var != null) {
                fn0Var.b();
            }
            this.r = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        hn0 hn0Var = this.s;
        Paint paint = hn0Var.x;
        int width = (getWidth() - this.a.A) / 2;
        int height = getHeight();
        fn0 fn0Var = this.a;
        int i10 = fn0Var.B;
        int i11 = (height - i10) / 2;
        dh.d dVar = this.c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i11, fn0Var.A + width, i10 + i11);
            RectF rectF = this.n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f;
            if (!equals) {
                rectF2.set(rectF);
                ah.k1.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.f6 f6Var = hn0Var.c;
            paint.setColor((f6Var == null ? !org.telegram.ui.ActionBar.j6.I.q() : !f6Var.a()) ? -1 : 687865855);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.a.d(canvas, width, i11, this.b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int dp = AndroidUtilities.dp(8.67f);
        fn0 fn0Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp + (fn0Var != null ? fn0Var.A : AndroidUtilities.dp(44.33f)), TLObject.FLAG_30), i11);
    }
}
