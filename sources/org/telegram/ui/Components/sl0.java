package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sl0 extends View {
    public rl0 a;
    public final u5 b;
    public final gh.g c;
    public dh.n0 d;
    public boolean e;
    public final Path f;
    public final RectF h;
    public final RectF n;
    public boolean r;
    public final /* synthetic */ tl0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl0(tl0 tl0Var, Context context) {
        super(context);
        this.s = tl0Var;
        this.b = new u5(this, 0L, 260L, xq.h);
        this.f = new Path();
        this.h = new RectF();
        this.n = new RectF();
        b8.pf.a(this);
        eh.c cVar = tl0Var.w;
        if (cVar != null) {
            gh.g c2 = cVar.c(this, null, false);
            c2.p(tl0Var.x);
            c2.u(org.telegram.messenger.g0.L(5.0f));
            c2.s = false;
            gh.e eVar = c2.g0;
            if (eVar != null) {
                eVar.g(false);
            }
            org.telegram.messenger.camera.q.p(c2, org.telegram.messenger.g0.L(6.0f), 4.0f);
            this.c = c2;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        rl0 rl0Var = this.a;
        if (rl0Var != null) {
            rl0Var.o = z10;
            u5 u5Var = this.b;
            if (z11) {
                rl0Var.h = rl0Var.M;
                rl0Var.f = rl0Var.N;
                rl0Var.g = rl0Var.O;
                u5Var.e(true, 0.0f);
            } else {
                u5Var.e(true, 1.0f);
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
        rl0 rl0Var = this.a;
        if (rl0Var != null) {
            rl0Var.a();
        }
        this.r = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r) {
            rl0 rl0Var = this.a;
            if (rl0Var != null) {
                rl0Var.b();
            }
            this.r = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        tl0 tl0Var = this.s;
        Paint paint = tl0Var.y;
        int width = (getWidth() - this.a.z) / 2;
        int height = getHeight();
        rl0 rl0Var = this.a;
        int i3 = rl0Var.A;
        int i10 = (height - i3) / 2;
        gh.g gVar = this.c;
        if (gVar != null) {
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set(width, i10, rl0Var.z + width, i3 + i10);
            RectF rectF = this.n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f;
            if (!equals) {
                rectF2.set(rectF);
                dh.o0.h(rectF2, rectF, path);
            }
            rect.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
            rect.right = org.telegram.messenger.g0.L(1.0f) + rect.right;
            gVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            gVar.draw(canvas);
            org.telegram.ui.ActionBar.e6 e6Var = tl0Var.c;
            paint.setColor((e6Var == null ? !org.telegram.ui.ActionBar.k6.I.q() : !e6Var.a()) ? -1 : 687865855);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.a.d(canvas, width, i10, this.b.e(false, 1.0f), 1.0f, false, false, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int L = org.telegram.messenger.g0.L(8.67f);
        rl0 rl0Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L + (rl0Var != null ? rl0Var.z : org.telegram.messenger.g0.L(44.33f)), TLObject.FLAG_30), i10);
    }
}
