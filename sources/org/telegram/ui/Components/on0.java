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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class on0 extends View {
    public nn0 a;
    public final z5 b;
    public final qg.b c;
    public ng.q0 d;
    public boolean e;
    public final Path f;
    public final RectF h;
    public final RectF n;
    public boolean r;
    public final /* synthetic */ pn0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on0(pn0 pn0Var, Context context) {
        super(context);
        this.s = pn0Var;
        this.b = new z5(this, 0L, 260L, pr.h);
        this.f = new Path();
        this.h = new RectF();
        this.n = new RectF();
        k7.e6.a(this);
        og.a aVar = pn0Var.v;
        if (aVar != null) {
            qg.b c3 = aVar.c(this, null, false);
            c3.n(pn0Var.w);
            c3.t(AndroidUtilities.dp(5.0f));
            qg.b m9 = c3.m();
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
        nn0 nn0Var = this.a;
        if (nn0Var != null) {
            nn0Var.p = z4;
            z5 z5Var = this.b;
            if (z10) {
                nn0Var.i = nn0Var.N;
                nn0Var.g = nn0Var.O;
                nn0Var.h = nn0Var.P;
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
        nn0 nn0Var = this.a;
        if (nn0Var != null) {
            nn0Var.a();
        }
        this.r = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r) {
            nn0 nn0Var = this.a;
            if (nn0Var != null) {
                nn0Var.b();
            }
            this.r = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        pn0 pn0Var = this.s;
        Paint paint = pn0Var.x;
        int width = (getWidth() - this.a.A) / 2;
        int height = getHeight();
        nn0 nn0Var = this.a;
        int i10 = nn0Var.B;
        int i11 = (height - i10) / 2;
        qg.b bVar = this.c;
        if (bVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i11, nn0Var.A + width, i10 + i11);
            RectF rectF = this.n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f;
            if (!equals) {
                rectF2.set(rectF);
                ng.r0.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            bVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            bVar.draw(canvas);
            org.telegram.ui.ActionBar.g6 g6Var = pn0Var.c;
            paint.setColor((g6Var == null ? !org.telegram.ui.ActionBar.k6.I.q() : !g6Var.a()) ? -1 : 687865855);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.a.d(canvas, width, i11, this.b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int dp = AndroidUtilities.dp(8.67f);
        nn0 nn0Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp + (nn0Var != null ? nn0Var.A : AndroidUtilities.dp(44.33f)), TLObject.FLAG_30), i11);
    }
}
