package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class dm0 extends View {
    public cm0 a;
    public final d6 b;
    public final fh.g c;
    public ch.p0 d;
    public boolean e;
    public final Path f;
    public final RectF h;
    public final RectF n;
    public boolean r;
    public final /* synthetic */ em0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm0(em0 em0Var, Context context) {
        super(context);
        this.s = em0Var;
        this.b = new d6(this, 0L, 260L, nr.h);
        this.f = new Path();
        this.h = new RectF();
        this.n = new RectF();
        c8.ra.a(this);
        dh.c cVar = em0Var.w;
        if (cVar != null) {
            fh.g c10 = cVar.c(this, null, false);
            c10.p(em0Var.x);
            c10.u(org.telegram.messenger.g0.L(5.0f));
            c10.s = false;
            fh.e eVar = c10.g0;
            if (eVar != null) {
                eVar.g(false);
            }
            org.telegram.messenger.o10.s(c10, org.telegram.messenger.g0.L(6.0f), 4.0f);
            this.c = c10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        cm0 cm0Var = this.a;
        if (cm0Var != null) {
            cm0Var.o = z10;
            d6 d6Var = this.b;
            if (z11) {
                cm0Var.h = cm0Var.M;
                cm0Var.f = cm0Var.N;
                cm0Var.g = cm0Var.O;
                d6Var.e(true, 0.0f);
            } else {
                d6Var.e(true, 1.0f);
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
        cm0 cm0Var = this.a;
        if (cm0Var != null) {
            cm0Var.a();
        }
        this.r = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r) {
            cm0 cm0Var = this.a;
            if (cm0Var != null) {
                cm0Var.b();
            }
            this.r = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        em0 em0Var = this.s;
        Paint paint = em0Var.y;
        int width = (getWidth() - this.a.z) / 2;
        int height = getHeight();
        cm0 cm0Var = this.a;
        int i7 = cm0Var.A;
        int i10 = (height - i7) / 2;
        fh.g gVar = this.c;
        if (gVar != null) {
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set(width, i10, cm0Var.z + width, i7 + i10);
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
            org.telegram.ui.ActionBar.h6 h6Var = em0Var.c;
            paint.setColor((h6Var == null ? !org.telegram.ui.ActionBar.m6.I.q() : !h6Var.d()) ? -1 : 687865855);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.a.d(canvas, width, i10, this.b.e(false, 1.0f), 1.0f, false, false, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int L = org.telegram.messenger.g0.L(8.67f);
        cm0 cm0Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L + (cm0Var != null ? cm0Var.z : org.telegram.messenger.g0.L(44.33f)), TLObject.FLAG_30), i10);
    }
}
