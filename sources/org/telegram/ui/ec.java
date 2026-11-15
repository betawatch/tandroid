package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ec extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public org.telegram.ui.ActionBar.j5 a;
    public org.telegram.ui.Components.oy0 b;
    public org.telegram.ui.Components.e5 c;
    public org.telegram.ui.ActionBar.e6 d;
    public boolean e;
    public int f;

    public final void a(int i7, int i10, boolean z10) {
        if (i10 < 0) {
            b(null);
        } else if (i10 < 7) {
            this.f = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.r8[i10], this.d);
        } else {
            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
            org.telegram.messenger.dp dpVar = z10 ? s12.r4 : s12.s4;
            b(dpVar != null ? dpVar.d(i10) : null);
        }
        invalidate();
    }

    public final void b(org.telegram.messenger.cp cpVar) {
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (cpVar != null) {
            this.f = cpVar.e(0, e6Var);
            return;
        }
        int i7 = org.telegram.ui.ActionBar.j6.s8;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(i7, e6Var)) > 0.8f) {
            this.f = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.n6, e6Var);
        } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(i7, e6Var)) < 0.2f) {
            this.f = org.telegram.ui.ActionBar.j6.r1(0.5f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.A8, e6Var));
        } else {
            this.f = org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, e6Var), org.telegram.ui.ActionBar.j6.r1(0.7f, jm0.B0(org.telegram.ui.ActionBar.j6.w0(i7, e6Var))));
        }
    }

    public final void c(long j3, boolean z10, boolean z11) {
        org.telegram.ui.Components.e5 e5Var = this.c;
        if (j3 == 0) {
            e5Var.g(null, z11);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.oy0(org.telegram.messenger.hd.M0(2131752311, null), 16.0f, null);
            }
        } else {
            e5Var.j(j3, z11);
            this.b = null;
        }
        e5Var.m(z10, z11);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.e5 e5Var = this.c;
        if (document == null) {
            e5Var.g(null, false);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.oy0(org.telegram.messenger.hd.M0(2131752311, null), 16.0f, null);
            }
        } else {
            e5Var.i(document, false);
            this.b = null;
        }
        e5Var.m(false, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        super.dispatchDraw(canvas);
        f();
        org.telegram.ui.Components.e5 e5Var = this.c;
        e5Var.k(Integer.valueOf(this.f));
        org.telegram.ui.Components.oy0 oy0Var = this.b;
        if (oy0Var != null) {
            canvas2 = canvas;
            oy0Var.c((getMeasuredWidth() - this.b.k()) - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.q6, e6Var), canvas2);
        } else {
            canvas2 = canvas;
            e5Var.draw(canvas2);
        }
        if (this.e) {
            Paint d = e6Var != null ? e6Var.d("paintDivider") : org.telegram.ui.ActionBar.j6.k0;
            if (d != null) {
                canvas2.drawLine(org.telegram.messenger.hd.a0 ? 0.0f : org.telegram.messenger.g0.L(23.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(23.0f) : 0), getMeasuredHeight() - 1, d);
            }
        }
    }

    public final void e(int i7) {
        org.telegram.ui.ActionBar.j5 j5Var = this.a;
        if (i7 <= 0) {
            j5Var.i(null);
        } else {
            j5Var.i(new org.telegram.ui.ActionBar.t2(i7, getContext(), this.d, false));
            j5Var.setDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        }
    }

    public final void f() {
        org.telegram.ui.Components.e5 e5Var = this.c;
        e5Var.setBounds((getWidth() - e5Var.s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - e5Var.s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + e5Var.s) / 2);
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.ActionBar.j5 j5Var = this.a;
        if (j5Var != null) {
            j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, this.d));
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
