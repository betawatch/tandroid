package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qm0 extends View {
    public pm0 a;
    public final t5 b;
    public final vg.f c;
    public sg.o0 d;
    public boolean e;
    public final Path f;
    public final RectF h;
    public final RectF n;
    public boolean r;
    public final /* synthetic */ rm0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm0(rm0 rm0Var, Context context) {
        super(context);
        this.s = rm0Var;
        this.b = new t5(this, 0L, 260L, gr.h);
        this.f = new Path();
        this.h = new RectF();
        this.n = new RectF();
        w7.e6.a(this);
        tg.b bVar = rm0Var.w;
        if (bVar != null) {
            vg.f c10 = bVar.c(this, null, false);
            c10.o(rm0Var.x);
            c10.t(org.telegram.messenger.i0.L(5.0f));
            c10.h = false;
            vg.d dVar = c10.b0;
            if (dVar != null) {
                dVar.g(false);
            }
            org.telegram.messenger.z20.u(c10, org.telegram.messenger.i0.L(6.0f), 4.0f);
            this.c = c10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        pm0 pm0Var = this.a;
        if (pm0Var != null) {
            pm0Var.o = z10;
            t5 t5Var = this.b;
            if (z11) {
                pm0Var.h = pm0Var.M;
                pm0Var.f = pm0Var.N;
                pm0Var.g = pm0Var.O;
                t5Var.e(true, 0.0f);
            } else {
                t5Var.e(true, 1.0f);
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
        pm0 pm0Var = this.a;
        if (pm0Var != null) {
            pm0Var.a();
        }
        this.r = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r) {
            pm0 pm0Var = this.a;
            if (pm0Var != null) {
                pm0Var.b();
            }
            this.r = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        rm0 rm0Var = this.s;
        Paint paint = rm0Var.y;
        int width = (getWidth() - this.a.z) / 2;
        int height = getHeight();
        pm0 pm0Var = this.a;
        int i10 = pm0Var.A;
        int i11 = (height - i10) / 2;
        vg.f fVar = this.c;
        if (fVar != null) {
            Rect rect = org.telegram.messenger.i0.Q;
            rect.set(width, i11, pm0Var.z + width, i10 + i11);
            RectF rectF = this.n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f;
            if (!equals) {
                rectF2.set(rectF);
                sg.p0.h(rectF2, rectF, path);
            }
            rect.inset(-org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f));
            rect.right = org.telegram.messenger.i0.L(1.0f) + rect.right;
            fVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            fVar.draw(canvas);
            org.telegram.ui.ActionBar.p6 p6Var = rm0Var.c;
            paint.setColor((p6Var == null ? !org.telegram.ui.ActionBar.t6.I.q() : !p6Var.a()) ? -1 : 687865855);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.a.d(canvas, width, i11, this.b.e(false, 1.0f), 1.0f, false, false, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int L = org.telegram.messenger.i0.L(8.67f);
        pm0 pm0Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L + (pm0Var != null ? pm0Var.z : org.telegram.messenger.i0.L(44.33f)), TLObject.FLAG_30), i11);
    }
}
