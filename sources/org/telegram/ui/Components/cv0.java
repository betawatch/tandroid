package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class cv0 extends dk0 {
    public int c;
    public final /* synthetic */ lv0 d;

    public cv0(lv0 lv0Var) {
        this.d = lv0Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 1;
    }

    @Override // v4.i0
    public final int b() {
        lv0 lv0Var = this.d;
        hv0[] hv0VarArr = lv0Var.g3;
        int length = (hv0VarArr == null ? 0 : hv0VarArr.length) + 1;
        if (length != this.c) {
            bi.m3 m3Var = lv0Var.t3;
            if (m3Var != null) {
                m3Var.requestLayout();
            }
            this.c = length;
        }
        return length;
    }

    @Override // v4.i0
    public final int d(int i7) {
        return i7 == 0 ? 0 : 1;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        lv0 lv0Var;
        hv0[] hv0VarArr;
        if (f1Var.f != 1 || (hv0VarArr = (lv0Var = this.d).g3) == null) {
            return;
        }
        int i10 = i7 - 1;
        hv0 hv0Var = hv0VarArr[i10];
        final gv0 gv0Var = (gv0) f1Var.a;
        boolean z10 = lv0Var.u3 == i10;
        gv0Var.getClass();
        if (!TextUtils.isEmpty(hv0Var.d)) {
            gv0Var.setContentDescription(hv0Var.d);
        } else if (TextUtils.isEmpty(hv0Var.a)) {
            gv0Var.setContentDescription(null);
        } else {
            gv0Var.setContentDescription(hv0Var.a);
        }
        ValueAnimator valueAnimator = gv0Var.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            gv0Var.H = null;
        }
        gv0Var.setImageResource(0);
        gv0Var.a();
        final boolean D1 = gv0Var.I.D1();
        gv0Var.x = false;
        gv0Var.E = 1.0f;
        p5.g(org.telegram.messenger.k10.t0).b(hv0Var.c, new m5() { // from class: org.telegram.ui.Components.ev0
            @Override // org.telegram.ui.Components.m5
            public final void a(TLRPC.Document document) {
                boolean z11 = !D1;
                gv0 gv0Var2 = gv0.this;
                gv0Var2.setOnlyLastFrame(z11);
                gv0Var2.g(24, 24, document);
                gv0Var2.d();
            }
        });
        org.telegram.messenger.g0.h3(new cp0(gv0Var, 10), 60L);
        gv0Var.l(z10, false);
        gv0Var.setAlpha(lv0Var.w3);
        gv0Var.setScaleX(lv0Var.w3);
        gv0Var.setScaleY(lv0Var.w3);
        gv0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        gv0 gv0Var;
        lv0 lv0Var = this.d;
        if (i7 == 0) {
            bi.m3 m3Var = new bi.m3(28, lv0Var.getContext(), this);
            lv0Var.t3 = m3Var;
            gv0Var = m3Var;
        } else {
            gv0Var = new gv0(lv0Var, lv0Var.getContext());
        }
        return new mj0(gv0Var);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        if (f1Var.f == 1) {
            gv0 gv0Var = (gv0) f1Var.a;
            gv0Var.l(this.d.u3 == f1Var.b() - 1, false);
            gv0Var.j();
        }
    }
}
