package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sv0 extends sk0 {
    public int c;
    public final /* synthetic */ bw0 d;

    public sv0(bw0 bw0Var) {
        this.d = bw0Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    @Override // s4.g0
    public final int b() {
        bw0 bw0Var = this.d;
        xv0[] xv0VarArr = bw0Var.f3;
        int length = (xv0VarArr == null ? 0 : xv0VarArr.length) + 1;
        if (length != this.c) {
            bi.t0 t0Var = bw0Var.s3;
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
        bw0 bw0Var;
        xv0[] xv0VarArr;
        if (c1Var.f != 1 || (xv0VarArr = (bw0Var = this.d).f3) == null) {
            return;
        }
        int i11 = i10 - 1;
        xv0 xv0Var = xv0VarArr[i11];
        final wv0 wv0Var = (wv0) c1Var.a;
        boolean z10 = bw0Var.t3 == i11;
        wv0Var.getClass();
        if (!TextUtils.isEmpty(xv0Var.d)) {
            wv0Var.setContentDescription(xv0Var.d);
        } else if (TextUtils.isEmpty(xv0Var.a)) {
            wv0Var.setContentDescription(null);
        } else {
            wv0Var.setContentDescription(xv0Var.a);
        }
        ValueAnimator valueAnimator = wv0Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            wv0Var.G = null;
        }
        wv0Var.setImageResource(0);
        wv0Var.a();
        final boolean D1 = wv0Var.H.D1();
        wv0Var.x = false;
        wv0Var.D = 1.0f;
        f5.g(org.telegram.messenger.d20.s0).b(xv0Var.c, new c5() { // from class: org.telegram.ui.Components.uv0
            @Override // org.telegram.ui.Components.c5
            public final void a(TLRPC.Document document) {
                boolean z11 = !D1;
                wv0 wv0Var2 = wv0.this;
                wv0Var2.setOnlyLastFrame(z11);
                wv0Var2.g(24, 24, document);
                wv0Var2.d();
            }
        });
        org.telegram.messenger.i0.h3(new uo0(wv0Var, 12), 60L);
        wv0Var.l(z10, false);
        wv0Var.setAlpha(bw0Var.v3);
        wv0Var.setScaleX(bw0Var.v3);
        wv0Var.setScaleY(bw0Var.v3);
        wv0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        wv0 wv0Var;
        bw0 bw0Var = this.d;
        if (i10 == 0) {
            bi.t0 t0Var = new bi.t0(this, bw0Var.getContext(), 22);
            bw0Var.s3 = t0Var;
            wv0Var = t0Var;
        } else {
            wv0Var = new wv0(bw0Var, bw0Var.getContext());
        }
        return new ck0(wv0Var);
    }

    @Override // s4.g0
    public final void y(s4.c1 c1Var) {
        if (c1Var.f == 1) {
            wv0 wv0Var = (wv0) c1Var.a;
            wv0Var.l(this.d.t3 == c1Var.b() - 1, false);
            wv0Var.j();
        }
    }
}
