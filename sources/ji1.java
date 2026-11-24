// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ji1 extends FrameLayout implements vlb {
    public lka a;
    public uib b;
    public tm c;
    public ylb d;
    public boolean e;
    public int f;

    public final void a(int i, int i2, boolean z) {
        if (i2 < 0) {
            b(null);
        } else if (i2 < 7) {
            this.f = cmb.v0(cmb.q8[i2], this.d);
        } else {
            oc7 r1 = oc7.r1(i);
            fc7 fc7Var = z ? r1.E3 : r1.F3;
            b(fc7Var != null ? fc7Var.d(i2) : null);
        }
        invalidate();
    }

    public final void b(ec7 ec7Var) {
        ylb ylbVar = this.d;
        if (ec7Var != null) {
            this.f = ec7Var.e(0, ylbVar);
            return;
        }
        int i = cmb.r8;
        if (gm.B(cmb.v0(i, ylbVar)) > 0.8f) {
            this.f = cmb.v0(cmb.m6, ylbVar);
        } else if (gm.B(cmb.v0(i, ylbVar)) < 0.2f) {
            this.f = cmb.p1(0.5f, cmb.v0(cmb.z8, ylbVar));
        } else {
            this.f = cmb.v(cmb.v0(cmb.c6, ylbVar), cmb.p1(0.7f, d38.z0(cmb.v0(i, ylbVar))));
        }
    }

    public final void c(long j, boolean z, boolean z2) {
        tm tmVar = this.c;
        if (j == 0) {
            tmVar.g(null, z2);
            if (this.b == null) {
                this.b = new uib(jb6.M0(2131752249, null), 16.0f, null);
            }
        } else {
            tmVar.j(j, z2);
            this.b = null;
        }
        tmVar.m(z, z2);
    }

    public final void d(TLRPC.Document document) {
        tm tmVar = this.c;
        if (document == null) {
            tmVar.g(null, false);
            if (this.b == null) {
                this.b = new uib(jb6.M0(2131752249, null), 16.0f, null);
            }
        } else {
            tmVar.i(document, false);
            this.b = null;
        }
        tmVar.m(false, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        ylb ylbVar = this.d;
        super.dispatchDraw(canvas);
        f();
        tm tmVar = this.c;
        tmVar.k(Integer.valueOf(this.f));
        uib uibVar = this.b;
        if (uibVar != null) {
            canvas2 = canvas;
            uibVar.c((getMeasuredWidth() - this.b.j()) - gm.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, cmb.v0(cmb.p6, ylbVar), canvas2);
        } else {
            canvas2 = canvas;
            tmVar.draw(canvas2);
        }
        if (this.e) {
            Paint d = ylbVar != null ? ylbVar.d("paintDivider") : cmb.j0;
            if (d != null) {
                canvas2.drawLine(jb6.a0 ? 0.0f : gm.L(23.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(23.0f) : 0), getMeasuredHeight() - 1, d);
            }
        }
    }

    public final void e(int i) {
        lka lkaVar = this.a;
        if (i <= 0) {
            lkaVar.i(null);
            return;
        }
        lkaVar.i(new hd(i, this.d, getContext(), false));
        lkaVar.setDrawablePadding(gm.L(6.0f));
    }

    public final void f() {
        tm tmVar = this.c;
        tmVar.setBounds((getWidth() - tmVar.s) - gm.L(21.0f), (getHeight() - tmVar.s) / 2, getWidth() - gm.L(21.0f), (getHeight() + tmVar.s) / 2);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), TLObject.FLAG_30));
    }

    @Override // vlb
    public final void updateColors() {
        lka lkaVar = this.a;
        if (lkaVar != null) {
            lkaVar.setTextColor(cmb.v0(cmb.F6, this.d));
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
