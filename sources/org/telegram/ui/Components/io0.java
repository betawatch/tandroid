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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class io0 extends View {
    public ho0 a;
    public final f6 b;
    public final dh.d c;
    public ah.i1 d;
    public boolean e;
    public final Path f;
    public final RectF h;
    public final RectF n;
    public boolean r;
    public final /* synthetic */ jo0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io0(jo0 jo0Var, Context context) {
        super(context);
        this.s = jo0Var;
        this.b = new f6(this, 0L, 260L, bs.h);
        this.f = new Path();
        this.h = new RectF();
        this.n = new RectF();
        w7.b6.a(this);
        bh.b bVar = jo0Var.v;
        if (bVar != null) {
            dh.d c10 = bVar.c(this, null, false);
            c10.o(jo0Var.w);
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
        ho0 ho0Var = this.a;
        if (ho0Var != null) {
            ho0Var.p = z10;
            f6 f6Var = this.b;
            if (z11) {
                ho0Var.i = ho0Var.N;
                ho0Var.g = ho0Var.O;
                ho0Var.h = ho0Var.P;
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
        ho0 ho0Var = this.a;
        if (ho0Var != null) {
            ho0Var.a();
        }
        this.r = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r) {
            ho0 ho0Var = this.a;
            if (ho0Var != null) {
                ho0Var.b();
            }
            this.r = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        jo0 jo0Var = this.s;
        Paint paint = jo0Var.x;
        int width = (getWidth() - this.a.A) / 2;
        int height = getHeight();
        ho0 ho0Var = this.a;
        int i10 = ho0Var.B;
        int i11 = (height - i10) / 2;
        dh.d dVar = this.c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i11, ho0Var.A + width, i10 + i11);
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
            org.telegram.ui.ActionBar.g6 g6Var = jo0Var.c;
            paint.setColor((g6Var == null ? !org.telegram.ui.ActionBar.k6.I.q() : !g6Var.a()) ? -1 : 687865855);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.a.d(canvas, width, i11, this.b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int dp = AndroidUtilities.dp(8.67f);
        ho0 ho0Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp + (ho0Var != null ? ho0Var.A : AndroidUtilities.dp(44.33f)), TLObject.FLAG_30), i11);
    }
}
