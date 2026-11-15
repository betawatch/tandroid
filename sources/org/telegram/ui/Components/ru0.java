package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ru0 extends tj0 {
    public int c;
    public final /* synthetic */ av0 d;

    public ru0(av0 av0Var) {
        this.d = av0Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return e1Var.f == 1;
    }

    @Override // v4.h0
    public final int b() {
        av0 av0Var = this.d;
        wu0[] wu0VarArr = av0Var.g3;
        int length = (wu0VarArr == null ? 0 : wu0VarArr.length) + 1;
        if (length != this.c) {
            bi.o2 o2Var = av0Var.t3;
            if (o2Var != null) {
                o2Var.requestLayout();
            }
            this.c = length;
        }
        return length;
    }

    @Override // v4.h0
    public final int d(int i7) {
        return i7 == 0 ? 0 : 1;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        av0 av0Var;
        wu0[] wu0VarArr;
        if (e1Var.f != 1 || (wu0VarArr = (av0Var = this.d).g3) == null) {
            return;
        }
        int i10 = i7 - 1;
        wu0 wu0Var = wu0VarArr[i10];
        final vu0 vu0Var = (vu0) e1Var.a;
        boolean z10 = av0Var.u3 == i10;
        vu0Var.getClass();
        if (!TextUtils.isEmpty(wu0Var.d)) {
            vu0Var.setContentDescription(wu0Var.d);
        } else if (TextUtils.isEmpty(wu0Var.a)) {
            vu0Var.setContentDescription(null);
        } else {
            vu0Var.setContentDescription(wu0Var.a);
        }
        ValueAnimator valueAnimator = vu0Var.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            vu0Var.H = null;
        }
        vu0Var.setImageResource(0);
        vu0Var.a();
        final boolean D1 = vu0Var.I.D1();
        vu0Var.x = false;
        vu0Var.E = 1.0f;
        g5.g(org.telegram.messenger.m10.t0).b(wu0Var.c, new d5() { // from class: org.telegram.ui.Components.tu0
            @Override // org.telegram.ui.Components.d5
            public final void a(TLRPC.Document document) {
                boolean z11 = !D1;
                vu0 vu0Var2 = vu0.this;
                vu0Var2.setOnlyLastFrame(z11);
                vu0Var2.g(24, 24, document);
                vu0Var2.d();
            }
        });
        org.telegram.messenger.g0.i3(new ro0(vu0Var, 10), 60L);
        vu0Var.l(z10, false);
        vu0Var.setAlpha(av0Var.w3);
        vu0Var.setScaleX(av0Var.w3);
        vu0Var.setScaleY(av0Var.w3);
        vu0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        vu0 vu0Var;
        av0 av0Var = this.d;
        if (i7 == 0) {
            bi.o2 o2Var = new bi.o2(28, av0Var.getContext(), this);
            av0Var.t3 = o2Var;
            vu0Var = o2Var;
        } else {
            vu0Var = new vu0(av0Var, av0Var.getContext());
        }
        return new cj0(vu0Var);
    }

    @Override // v4.h0
    public final void y(v4.e1 e1Var) {
        if (e1Var.f == 1) {
            vu0 vu0Var = (vu0) e1Var.a;
            vu0Var.l(this.d.u3 == e1Var.b() - 1, false);
            vu0Var.j();
        }
    }
}
