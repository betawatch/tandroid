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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dn0 extends View {
    public cn0 a;
    public final d6 b;
    public final ng.d c;
    public kg.q0 d;
    public boolean e;
    public final Path f;
    public final RectF h;
    public final RectF n;
    public boolean r;
    public final /* synthetic */ en0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn0(en0 en0Var, Context context) {
        super(context);
        this.s = en0Var;
        this.b = new d6(this, 0L, 260L, jr.h);
        this.f = new Path();
        this.h = new RectF();
        this.n = new RectF();
        i7.h6.a(this);
        lg.a aVar = en0Var.v;
        if (aVar != null) {
            ng.d c3 = aVar.c(this, null, false);
            c3.n(en0Var.w);
            c3.t(AndroidUtilities.dp(5.0f));
            ng.d m10 = c3.m();
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
        cn0 cn0Var = this.a;
        if (cn0Var != null) {
            cn0Var.p = z10;
            d6 d6Var = this.b;
            if (z11) {
                cn0Var.i = cn0Var.N;
                cn0Var.g = cn0Var.O;
                cn0Var.h = cn0Var.P;
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
        cn0 cn0Var = this.a;
        if (cn0Var != null) {
            cn0Var.a();
        }
        this.r = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r) {
            cn0 cn0Var = this.a;
            if (cn0Var != null) {
                cn0Var.b();
            }
            this.r = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        en0 en0Var = this.s;
        Paint paint = en0Var.x;
        int width = (getWidth() - this.a.A) / 2;
        int height = getHeight();
        cn0 cn0Var = this.a;
        int i10 = cn0Var.B;
        int i11 = (height - i10) / 2;
        ng.d dVar = this.c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i11, cn0Var.A + width, i10 + i11);
            RectF rectF = this.n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f;
            if (!equals) {
                rectF2.set(rectF);
                kg.r0.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.c6 c6Var = en0Var.c;
            paint.setColor((c6Var == null ? !org.telegram.ui.ActionBar.g6.I.q() : !c6Var.a()) ? -1 : 687865855);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.a.d(canvas, width, i11, this.b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int dp = AndroidUtilities.dp(8.67f);
        cn0 cn0Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp + (cn0Var != null ? cn0Var.A : AndroidUtilities.dp(44.33f)), TLObject.FLAG_30), i11);
    }
}
