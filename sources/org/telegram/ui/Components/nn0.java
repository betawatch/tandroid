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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class nn0 extends View {
    public mn0 a;
    public final z5 b;
    public final pg.b c;
    public mg.q0 d;
    public boolean e;
    public final Path f;
    public final RectF h;
    public final RectF n;
    public boolean r;
    public final /* synthetic */ on0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn0(on0 on0Var, Context context) {
        super(context);
        this.s = on0Var;
        this.b = new z5(this, 0L, 260L, nr.h);
        this.f = new Path();
        this.h = new RectF();
        this.n = new RectF();
        k7.d6.a(this);
        ng.a aVar = on0Var.v;
        if (aVar != null) {
            pg.b c3 = aVar.c(this, null, false);
            c3.n(on0Var.w);
            c3.t(AndroidUtilities.dp(5.0f));
            pg.b m9 = c3.m();
            m9.p(AndroidUtilities.dp(6.0f));
            m9.o(AndroidUtilities.dp(4.0f));
            this.c = m9;
        }
    }

    public final void a(boolean z4, boolean z10) {
        if (this.e == z4) {
            return;
        }
        this.e = z4;
        mn0 mn0Var = this.a;
        if (mn0Var != null) {
            mn0Var.p = z4;
            z5 z5Var = this.b;
            if (z10) {
                mn0Var.i = mn0Var.N;
                mn0Var.g = mn0Var.O;
                mn0Var.h = mn0Var.P;
                z5Var.d(0.0f, true);
            } else {
                z5Var.d(1.0f, true);
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
        mn0 mn0Var = this.a;
        if (mn0Var != null) {
            mn0Var.a();
        }
        this.r = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r) {
            mn0 mn0Var = this.a;
            if (mn0Var != null) {
                mn0Var.b();
            }
            this.r = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        on0 on0Var = this.s;
        Paint paint = on0Var.x;
        int width = (getWidth() - this.a.A) / 2;
        int height = getHeight();
        mn0 mn0Var = this.a;
        int i10 = mn0Var.B;
        int i11 = (height - i10) / 2;
        pg.b bVar = this.c;
        if (bVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i11, mn0Var.A + width, i10 + i11);
            RectF rectF = this.n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f;
            if (!equals) {
                rectF2.set(rectF);
                mg.r0.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            bVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            bVar.draw(canvas);
            org.telegram.ui.ActionBar.f6 f6Var = on0Var.c;
            paint.setColor((f6Var == null ? !org.telegram.ui.ActionBar.j6.I.q() : !f6Var.a()) ? -1 : 687865855);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.a.d(canvas, width, i11, this.b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int dp = AndroidUtilities.dp(8.67f);
        mn0 mn0Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp + (mn0Var != null ? mn0Var.A : AndroidUtilities.dp(44.33f)), TLObject.FLAG_30), i11);
    }
}
