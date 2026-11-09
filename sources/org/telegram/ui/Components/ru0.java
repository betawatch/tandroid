package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ru0 extends pj0 {
    public int c;
    public final /* synthetic */ av0 d;

    public ru0(av0 av0Var) {
        this.d = av0Var;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f == 1;
    }

    @Override // v4.g0
    public final int b() {
        av0 av0Var = this.d;
        wu0[] wu0VarArr = av0Var.f3;
        int length = (wu0VarArr == null ? 0 : wu0VarArr.length) + 1;
        if (length != this.c) {
            bi.ec ecVar = av0Var.s3;
            if (ecVar != null) {
                ecVar.requestLayout();
            }
            this.c = length;
        }
        return length;
    }

    @Override // v4.g0
    public final int d(int i7) {
        return i7 == 0 ? 0 : 1;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        av0 av0Var;
        wu0[] wu0VarArr;
        if (d1Var.f != 1 || (wu0VarArr = (av0Var = this.d).f3) == null) {
            return;
        }
        int i10 = i7 - 1;
        wu0 wu0Var = wu0VarArr[i10];
        final vu0 vu0Var = (vu0) d1Var.a;
        boolean z9 = av0Var.t3 == i10;
        vu0Var.getClass();
        if (!TextUtils.isEmpty(wu0Var.d)) {
            vu0Var.setContentDescription(wu0Var.d);
        } else if (TextUtils.isEmpty(wu0Var.a)) {
            vu0Var.setContentDescription(null);
        } else {
            vu0Var.setContentDescription(wu0Var.a);
        }
        ValueAnimator valueAnimator = vu0Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            vu0Var.G = null;
        }
        vu0Var.setImageResource(0);
        vu0Var.a();
        final boolean D1 = vu0Var.H.D1();
        vu0Var.x = false;
        vu0Var.D = 1.0f;
        i5.g(org.telegram.messenger.p10.s0).b(wu0Var.c, new f5() { // from class: org.telegram.ui.Components.tu0
            @Override // org.telegram.ui.Components.f5
            public final void a(TLRPC.Document document) {
                boolean z10 = !D1;
                vu0 vu0Var2 = vu0.this;
                vu0Var2.setOnlyLastFrame(z10);
                vu0Var2.g(24, 24, document);
                vu0Var2.d();
            }
        });
        org.telegram.messenger.g0.i3(new kr0(vu0Var, 7), 60L);
        vu0Var.l(z9, false);
        vu0Var.setAlpha(av0Var.v3);
        vu0Var.setScaleX(av0Var.v3);
        vu0Var.setScaleY(av0Var.v3);
        vu0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        vu0 vu0Var;
        av0 av0Var = this.d;
        if (i7 == 0) {
            bi.ec ecVar = new bi.ec(27, av0Var.getContext(), this);
            av0Var.s3 = ecVar;
            vu0Var = ecVar;
        } else {
            vu0Var = new vu0(av0Var, av0Var.getContext());
        }
        return new yi0(vu0Var);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        if (d1Var.f == 1) {
            vu0 vu0Var = (vu0) d1Var.a;
            vu0Var.l(this.d.t3 == d1Var.b() - 1, false);
            vu0Var.j();
        }
    }
}
