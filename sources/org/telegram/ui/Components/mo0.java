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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class mo0 extends View {
    public lo0 a;
    public final g6 b;
    public final ch.d c;
    public zg.n0 d;
    public boolean e;
    public final Path f;
    public final RectF h;
    public final RectF n;
    public boolean r;
    public final /* synthetic */ no0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo0(no0 no0Var, Context context) {
        super(context);
        this.s = no0Var;
        this.b = new g6(this, 0L, 260L, hs.h);
        this.f = new Path();
        this.h = new RectF();
        this.n = new RectF();
        w7.z5.a(this);
        ah.c cVar = no0Var.v;
        if (cVar != null) {
            ch.d c10 = cVar.c(this, null, false);
            c10.o(no0Var.w);
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
        lo0 lo0Var = this.a;
        if (lo0Var != null) {
            lo0Var.p = z10;
            g6 g6Var = this.b;
            if (z11) {
                lo0Var.i = lo0Var.N;
                lo0Var.g = lo0Var.O;
                lo0Var.h = lo0Var.P;
                g6Var.d(0.0f, true);
            } else {
                g6Var.d(1.0f, true);
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
        lo0 lo0Var = this.a;
        if (lo0Var != null) {
            lo0Var.a();
        }
        this.r = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r) {
            lo0 lo0Var = this.a;
            if (lo0Var != null) {
                lo0Var.b();
            }
            this.r = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        no0 no0Var = this.s;
        Paint paint = no0Var.x;
        int width = (getWidth() - this.a.A) / 2;
        int height = getHeight();
        lo0 lo0Var = this.a;
        int i10 = lo0Var.B;
        int i11 = (height - i10) / 2;
        ch.d dVar = this.c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i11, lo0Var.A + width, i10 + i11);
            RectF rectF = this.n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f;
            if (!equals) {
                rectF2.set(rectF);
                zg.o0.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.e6 e6Var = no0Var.c;
            paint.setColor((e6Var == null ? !org.telegram.ui.ActionBar.i6.I.q() : !e6Var.a()) ? -1 : 687865855);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.a.d(canvas, width, i11, this.b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int dp = AndroidUtilities.dp(8.67f);
        lo0 lo0Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp + (lo0Var != null ? lo0Var.A : AndroidUtilities.dp(44.33f)), TLObject.FLAG_30), i11);
    }
}
