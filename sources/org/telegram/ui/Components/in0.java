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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class in0 extends View {
    public hn0 a;
    public final c6 b;
    public final ch.d c;
    public zg.p0 d;
    public boolean e;
    public final Path f;
    public final RectF h;
    public final RectF n;
    public boolean r;
    public final /* synthetic */ jn0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in0(jn0 jn0Var, Context context) {
        super(context);
        this.s = jn0Var;
        this.b = new c6(this, 0L, 260L, qr.h);
        this.f = new Path();
        this.h = new RectF();
        this.n = new RectF();
        w7.z5.a(this);
        ah.c cVar = jn0Var.v;
        if (cVar != null) {
            ch.d c10 = cVar.c(this, null, false);
            c10.o(jn0Var.w);
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
        hn0 hn0Var = this.a;
        if (hn0Var != null) {
            hn0Var.p = z10;
            c6 c6Var = this.b;
            if (z11) {
                hn0Var.i = hn0Var.N;
                hn0Var.g = hn0Var.O;
                hn0Var.h = hn0Var.P;
                c6Var.d(0.0f, true);
            } else {
                c6Var.d(1.0f, true);
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
        hn0 hn0Var = this.a;
        if (hn0Var != null) {
            hn0Var.a();
        }
        this.r = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r) {
            hn0 hn0Var = this.a;
            if (hn0Var != null) {
                hn0Var.b();
            }
            this.r = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        jn0 jn0Var = this.s;
        Paint paint = jn0Var.x;
        int width = (getWidth() - this.a.A) / 2;
        int height = getHeight();
        hn0 hn0Var = this.a;
        int i10 = hn0Var.B;
        int i11 = (height - i10) / 2;
        ch.d dVar = this.c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i11, hn0Var.A + width, i10 + i11);
            RectF rectF = this.n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f;
            if (!equals) {
                rectF2.set(rectF);
                zg.q0.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.f6 f6Var = jn0Var.c;
            paint.setColor((f6Var == null ? !org.telegram.ui.ActionBar.j6.I.q() : !f6Var.a()) ? -1 : 687865855);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.a.d(canvas, width, i11, this.b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int dp = AndroidUtilities.dp(8.67f);
        hn0 hn0Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp + (hn0Var != null ? hn0Var.A : AndroidUtilities.dp(44.33f)), TLObject.FLAG_30), i11);
    }
}
