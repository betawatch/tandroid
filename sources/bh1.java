// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bh1 extends FrameLayout implements tjb {
    public jia a;
    public tgb b;
    public tl c;
    public wjb d;
    public boolean e;
    public int f;

    public final void a(int i, int i2, boolean z) {
        if (i2 < 0) {
            b(null);
        } else if (i2 < 7) {
            this.f = bkb.v0(bkb.q8[i2], this.d);
        } else {
            na7 q1 = na7.q1(i);
            ea7 ea7Var = z ? q1.E3 : q1.F3;
            b(ea7Var != null ? ea7Var.d(i2) : null);
        }
        invalidate();
    }

    public final void b(da7 da7Var) {
        wjb wjbVar = this.d;
        if (da7Var != null) {
            this.f = da7Var.e(0, wjbVar);
            return;
        }
        int i = bkb.r8;
        if (gl.B(bkb.v0(i, wjbVar)) > 0.8f) {
            this.f = bkb.v0(bkb.m6, wjbVar);
        } else if (gl.B(bkb.v0(i, wjbVar)) < 0.2f) {
            this.f = bkb.p1(0.5f, bkb.v0(bkb.z8, wjbVar));
        } else {
            this.f = bkb.v(bkb.v0(bkb.c6, wjbVar), bkb.p1(0.7f, a18.y0(bkb.v0(i, wjbVar))));
        }
    }

    public final void c(long j, boolean z, boolean z2) {
        tl tlVar = this.c;
        if (j == 0) {
            tlVar.g(null, z2);
            if (this.b == null) {
                this.b = new tgb(k96.M0(2131752299, null), 16.0f, null);
            }
        } else {
            tlVar.j(j, z2);
            this.b = null;
        }
        tlVar.m(z, z2);
    }

    public final void d(TLRPC.Document document) {
        tl tlVar = this.c;
        if (document == null) {
            tlVar.g(null, false);
            if (this.b == null) {
                this.b = new tgb(k96.M0(2131752299, null), 16.0f, null);
            }
        } else {
            tlVar.i(document, false);
            this.b = null;
        }
        tlVar.m(false, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        wjb wjbVar = this.d;
        super.dispatchDraw(canvas);
        f();
        tl tlVar = this.c;
        tlVar.k(Integer.valueOf(this.f));
        tgb tgbVar = this.b;
        if (tgbVar != null) {
            canvas2 = canvas;
            tgbVar.c((getMeasuredWidth() - this.b.j()) - gl.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, bkb.v0(bkb.p6, wjbVar), canvas2);
        } else {
            canvas2 = canvas;
            tlVar.draw(canvas2);
        }
        if (this.e) {
            Paint d = wjbVar != null ? wjbVar.d("paintDivider") : bkb.j0;
            if (d != null) {
                canvas2.drawLine(k96.a0 ? 0.0f : gl.L(23.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(23.0f) : 0), getMeasuredHeight() - 1, d);
            }
        }
    }

    public final void e(int i) {
        jia jiaVar = this.a;
        if (i <= 0) {
            jiaVar.i(null);
            return;
        }
        jiaVar.i(new gc(i, this.d, getContext(), false));
        jiaVar.setDrawablePadding(gl.L(6.0f));
    }

    public final void f() {
        tl tlVar = this.c;
        tlVar.setBounds((getWidth() - tlVar.s) - gl.L(21.0f), (getHeight() - tlVar.s) / 2, getWidth() - gl.L(21.0f), (getHeight() + tlVar.s) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), TLObject.FLAG_30));
    }

    @Override // tjb
    public final void updateColors() {
        jia jiaVar = this.a;
        if (jiaVar != null) {
            jiaVar.setTextColor(bkb.v0(bkb.F6, this.d));
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
