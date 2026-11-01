package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class tv0 extends tk0 {
    public int c;
    public final /* synthetic */ cw0 d;

    public tv0(cw0 cw0Var) {
        this.d = cw0Var;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    @Override // s4.g0
    public final int b() {
        cw0 cw0Var = this.d;
        yv0[] yv0VarArr = cw0Var.f3;
        int length = (yv0VarArr == null ? 0 : yv0VarArr.length) + 1;
        if (length != this.c) {
            bi.t0 t0Var = cw0Var.s3;
            if (t0Var != null) {
                t0Var.requestLayout();
            }
            this.c = length;
        }
        return length;
    }

    @Override // s4.g0
    public final int d(int i10) {
        return i10 == 0 ? 0 : 1;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        cw0 cw0Var;
        yv0[] yv0VarArr;
        if (c1Var.f != 1 || (yv0VarArr = (cw0Var = this.d).f3) == null) {
            return;
        }
        int i11 = i10 - 1;
        yv0 yv0Var = yv0VarArr[i11];
        final xv0 xv0Var = (xv0) c1Var.a;
        boolean z10 = cw0Var.t3 == i11;
        xv0Var.getClass();
        if (!TextUtils.isEmpty(yv0Var.d)) {
            xv0Var.setContentDescription(yv0Var.d);
        } else if (TextUtils.isEmpty(yv0Var.a)) {
            xv0Var.setContentDescription(null);
        } else {
            xv0Var.setContentDescription(yv0Var.a);
        }
        ValueAnimator valueAnimator = xv0Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            xv0Var.G = null;
        }
        xv0Var.setImageResource(0);
        xv0Var.a();
        final boolean D1 = xv0Var.H.D1();
        xv0Var.x = false;
        xv0Var.D = 1.0f;
        f5.g(org.telegram.messenger.e20.s0).b(yv0Var.c, new c5() { // from class: org.telegram.ui.Components.vv0
            @Override // org.telegram.ui.Components.c5
            public final void a(TLRPC.Document document) {
                boolean z11 = !D1;
                xv0 xv0Var2 = xv0.this;
                xv0Var2.setOnlyLastFrame(z11);
                xv0Var2.g(24, 24, document);
                xv0Var2.d();
            }
        });
        org.telegram.messenger.i0.h3(new vo0(xv0Var, 12), 60L);
        xv0Var.l(z10, false);
        xv0Var.setAlpha(cw0Var.v3);
        xv0Var.setScaleX(cw0Var.v3);
        xv0Var.setScaleY(cw0Var.v3);
        xv0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        xv0 xv0Var;
        cw0 cw0Var = this.d;
        if (i10 == 0) {
            bi.t0 t0Var = new bi.t0(this, cw0Var.getContext(), 22);
            cw0Var.s3 = t0Var;
            xv0Var = t0Var;
        } else {
            xv0Var = new xv0(cw0Var, cw0Var.getContext());
        }
        return new dk0(xv0Var);
    }

    @Override // s4.g0
    public final void y(s4.c1 c1Var) {
        if (c1Var.f == 1) {
            xv0 xv0Var = (xv0) c1Var.a;
            xv0Var.l(this.d.t3 == c1Var.b() - 1, false);
            xv0Var.j();
        }
    }
}
