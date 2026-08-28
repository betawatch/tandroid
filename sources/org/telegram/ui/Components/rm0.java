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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rm0 extends View {
    public qm0 a;
    public final y5 b;
    public final kg.d c;
    public hg.r0 d;
    public boolean e;
    public final Path f;
    public final RectF h;
    public final RectF n;
    public boolean r;
    public final /* synthetic */ sm0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm0(sm0 sm0Var, Context context) {
        super(context);
        this.s = sm0Var;
        this.b = new y5(this, 0L, 260L, gr.h);
        this.f = new Path();
        this.h = new RectF();
        this.n = new RectF();
        g7.g6.a(this);
        ig.a aVar = sm0Var.v;
        if (aVar != null) {
            kg.d c10 = aVar.c(this, null, false);
            c10.n(sm0Var.w);
            c10.t(AndroidUtilities.dp(5.0f));
            kg.d m10 = c10.m();
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
        qm0 qm0Var = this.a;
        if (qm0Var != null) {
            qm0Var.p = z10;
            y5 y5Var = this.b;
            if (z11) {
                qm0Var.i = qm0Var.N;
                qm0Var.g = qm0Var.O;
                qm0Var.h = qm0Var.P;
                y5Var.d(0.0f, true);
            } else {
                y5Var.d(1.0f, true);
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
        qm0 qm0Var = this.a;
        if (qm0Var != null) {
            qm0Var.a();
        }
        this.r = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r) {
            qm0 qm0Var = this.a;
            if (qm0Var != null) {
                qm0Var.b();
            }
            this.r = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        sm0 sm0Var = this.s;
        Paint paint = sm0Var.x;
        int width = (getWidth() - this.a.A) / 2;
        int height = getHeight();
        qm0 qm0Var = this.a;
        int i9 = qm0Var.B;
        int i10 = (height - i9) / 2;
        kg.d dVar = this.c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i10, qm0Var.A + width, i9 + i10);
            RectF rectF = this.n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f;
            if (!equals) {
                rectF2.set(rectF);
                hg.s0.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.b6 b6Var = sm0Var.c;
            paint.setColor((b6Var == null ? !org.telegram.ui.ActionBar.f6.I.q() : !b6Var.a()) ? -1 : 687865855);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.a.d(canvas, width, i10, this.b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int dp = AndroidUtilities.dp(8.67f);
        qm0 qm0Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp + (qm0Var != null ? qm0Var.A : AndroidUtilities.dp(44.33f)), TLObject.FLAG_30), i10);
    }
}
