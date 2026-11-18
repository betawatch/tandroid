package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class bm0 extends View {
    public am0 a;
    public final c6 b;
    public final fh.g c;
    public ch.p0 d;
    public boolean e;
    public final Path f;
    public final RectF h;
    public final RectF n;
    public boolean r;
    public final /* synthetic */ cm0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm0(cm0 cm0Var, Context context) {
        super(context);
        this.s = cm0Var;
        this.b = new c6(this, 0L, 260L, lr.h);
        this.f = new Path();
        this.h = new RectF();
        this.n = new RectF();
        c8.ra.a(this);
        dh.c cVar = cm0Var.w;
        if (cVar != null) {
            fh.g c10 = cVar.c(this, null, false);
            c10.p(cm0Var.x);
            c10.u(org.telegram.messenger.g0.L(5.0f));
            c10.s = false;
            fh.e eVar = c10.g0;
            if (eVar != null) {
                eVar.g(false);
            }
            org.telegram.messenger.n10.s(c10, org.telegram.messenger.g0.L(6.0f), 4.0f);
            this.c = c10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        am0 am0Var = this.a;
        if (am0Var != null) {
            am0Var.o = z10;
            c6 c6Var = this.b;
            if (z11) {
                am0Var.h = am0Var.M;
                am0Var.f = am0Var.N;
                am0Var.g = am0Var.O;
                c6Var.e(true, 0.0f);
            } else {
                c6Var.e(true, 1.0f);
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
        am0 am0Var = this.a;
        if (am0Var != null) {
            am0Var.a();
        }
        this.r = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r) {
            am0 am0Var = this.a;
            if (am0Var != null) {
                am0Var.b();
            }
            this.r = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        cm0 cm0Var = this.s;
        Paint paint = cm0Var.y;
        int width = (getWidth() - this.a.z) / 2;
        int height = getHeight();
        am0 am0Var = this.a;
        int i7 = am0Var.A;
        int i10 = (height - i7) / 2;
        fh.g gVar = this.c;
        if (gVar != null) {
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set(width, i10, am0Var.z + width, i7 + i10);
            RectF rectF = this.n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f;
            if (!equals) {
                rectF2.set(rectF);
                ch.q0.h(rectF2, rectF, path);
            }
            rect.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
            rect.right = org.telegram.messenger.g0.L(1.0f) + rect.right;
            gVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            gVar.draw(canvas);
            org.telegram.ui.ActionBar.i6 i6Var = cm0Var.c;
            paint.setColor((i6Var == null ? !org.telegram.ui.ActionBar.n6.I.q() : !i6Var.d()) ? -1 : 687865855);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.a.d(canvas, width, i10, this.b.e(false, 1.0f), 1.0f, false, false, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int L = org.telegram.messenger.g0.L(8.67f);
        am0 am0Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L + (am0Var != null ? am0Var.z : org.telegram.messenger.g0.L(44.33f)), TLObject.FLAG_30), i10);
    }
}
