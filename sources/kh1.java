// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class kh1 extends FrameLayout implements snb {
    public ema a;
    public pkb b;
    public ul c;
    public vnb d;
    public boolean e;
    public int f;

    public final void a(int i, int i2, boolean z) {
        if (i2 < 0) {
            b(null);
        } else if (i2 < 7) {
            this.f = aob.v0(aob.r8[i2], this.d);
        } else {
            uc7 s1 = uc7.s1(i);
            lc7 lc7Var = z ? s1.E3 : s1.F3;
            b(lc7Var != null ? lc7Var.d(i2) : null);
        }
        invalidate();
    }

    public final void b(kc7 kc7Var) {
        vnb vnbVar = this.d;
        if (kc7Var != null) {
            this.f = kc7Var.e(0, vnbVar);
            return;
        }
        int i = aob.s8;
        if (hl.B(aob.v0(i, vnbVar)) > 0.8f) {
            this.f = aob.v0(aob.n6, vnbVar);
        } else if (hl.B(aob.v0(i, vnbVar)) < 0.2f) {
            this.f = aob.p1(0.5f, aob.v0(aob.A8, vnbVar));
        } else {
            this.f = aob.v(aob.v0(aob.d6, vnbVar), aob.p1(0.7f, h48.z0(aob.v0(i, vnbVar))));
        }
    }

    public final void c(long j, boolean z, boolean z2) {
        ul ulVar = this.c;
        if (j == 0) {
            ulVar.g(null, z2);
            if (this.b == null) {
                this.b = new pkb(ob6.M0(2131752277, null), 16.0f, null);
            }
        } else {
            ulVar.j(j, z2);
            this.b = null;
        }
        ulVar.m(z, z2);
    }

    public final void d(TLRPC.Document document) {
        ul ulVar = this.c;
        if (document == null) {
            ulVar.g(null, false);
            if (this.b == null) {
                this.b = new pkb(ob6.M0(2131752277, null), 16.0f, null);
            }
        } else {
            ulVar.i(document, false);
            this.b = null;
        }
        ulVar.m(false, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        vnb vnbVar = this.d;
        super.dispatchDraw(canvas);
        f();
        ul ulVar = this.c;
        ulVar.k(Integer.valueOf(this.f));
        pkb pkbVar = this.b;
        if (pkbVar != null) {
            canvas2 = canvas;
            pkbVar.c((getMeasuredWidth() - this.b.j()) - hl.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, aob.v0(aob.q6, vnbVar), canvas2);
        } else {
            canvas2 = canvas;
            ulVar.draw(canvas2);
        }
        if (this.e) {
            Paint d = vnbVar != null ? vnbVar.d("paintDivider") : aob.j0;
            if (d != null) {
                canvas2.drawLine(ob6.a0 ? 0.0f : hl.L(23.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(23.0f) : 0), getMeasuredHeight() - 1, d);
            }
        }
    }

    public final void e(int i) {
        ema emaVar = this.a;
        if (i <= 0) {
            emaVar.i(null);
            return;
        }
        emaVar.i(new hc(i, this.d, getContext(), false));
        emaVar.setDrawablePadding(hl.L(6.0f));
    }

    public final void f() {
        ul ulVar = this.c;
        ulVar.setBounds((getWidth() - ulVar.s) - hl.L(21.0f), (getHeight() - ulVar.s) / 2, getWidth() - hl.L(21.0f), (getHeight() + ulVar.s) / 2);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), TLObject.FLAG_30));
    }

    @Override // snb
    public final void updateColors() {
        ema emaVar = this.a;
        if (emaVar != null) {
            emaVar.setTextColor(aob.v0(aob.G6, this.d));
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
