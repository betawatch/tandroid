package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class pl0 extends View {
    public ol0 a;
    public final w5 b;
    public final fh.g c;
    public ch.o0 d;
    public boolean e;
    public final Path f;
    public final RectF h;
    public final RectF n;
    public boolean r;
    public final /* synthetic */ ql0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl0(ql0 ql0Var, Context context) {
        super(context);
        this.s = ql0Var;
        this.b = new w5(this, 0L, 260L, xq.h);
        this.f = new Path();
        this.h = new RectF();
        this.n = new RectF();
        c8.ka.a(this);
        dh.c cVar = ql0Var.w;
        if (cVar != null) {
            fh.g c10 = cVar.c(this, null, false);
            c10.p(ql0Var.x);
            c10.u(org.telegram.messenger.g0.L(5.0f));
            c10.s = false;
            fh.e eVar = c10.f0;
            if (eVar != null) {
                eVar.g(false);
            }
            org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(6.0f), 4.0f);
            this.c = c10;
        }
    }

    public final void a(boolean z9, boolean z10) {
        if (this.e == z9) {
            return;
        }
        this.e = z9;
        ol0 ol0Var = this.a;
        if (ol0Var != null) {
            ol0Var.o = z9;
            w5 w5Var = this.b;
            if (z10) {
                ol0Var.h = ol0Var.M;
                ol0Var.f = ol0Var.N;
                ol0Var.g = ol0Var.O;
                w5Var.e(true, 0.0f);
            } else {
                w5Var.e(true, 1.0f);
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
        ol0 ol0Var = this.a;
        if (ol0Var != null) {
            ol0Var.a();
        }
        this.r = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r) {
            ol0 ol0Var = this.a;
            if (ol0Var != null) {
                ol0Var.b();
            }
            this.r = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ql0 ql0Var = this.s;
        Paint paint = ql0Var.y;
        int width = (getWidth() - this.a.z) / 2;
        int height = getHeight();
        ol0 ol0Var = this.a;
        int i7 = ol0Var.A;
        int i10 = (height - i7) / 2;
        fh.g gVar = this.c;
        if (gVar != null) {
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set(width, i10, ol0Var.z + width, i7 + i10);
            RectF rectF = this.n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f;
            if (!equals) {
                rectF2.set(rectF);
                ch.p0.h(rectF2, rectF, path);
            }
            rect.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
            rect.right = org.telegram.messenger.g0.L(1.0f) + rect.right;
            gVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            gVar.draw(canvas);
            org.telegram.ui.ActionBar.f6 f6Var = ql0Var.c;
            paint.setColor((f6Var == null ? !org.telegram.ui.ActionBar.k6.I.q() : !f6Var.a()) ? -1 : 687865855);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.a.d(canvas, width, i10, this.b.e(false, 1.0f), 1.0f, false, false, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int L = org.telegram.messenger.g0.L(8.67f);
        ol0 ol0Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L + (ol0Var != null ? ol0Var.z : org.telegram.messenger.g0.L(44.33f)), TLObject.FLAG_30), i10);
    }
}
