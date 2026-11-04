package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ou0 extends sj0 {
    public int c;
    public final /* synthetic */ xu0 d;

    public ou0(xu0 xu0Var) {
        this.d = xu0Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f == 1;
    }

    @Override // u4.h0
    public final int b() {
        xu0 xu0Var = this.d;
        tu0[] tu0VarArr = xu0Var.g3;
        int length = (tu0VarArr == null ? 0 : tu0VarArr.length) + 1;
        if (length != this.c) {
            ai.x2 x2Var = xu0Var.t3;
            if (x2Var != null) {
                x2Var.requestLayout();
            }
            this.c = length;
        }
        return length;
    }

    @Override // u4.h0
    public final int d(int i3) {
        return i3 == 0 ? 0 : 1;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        xu0 xu0Var;
        tu0[] tu0VarArr;
        if (d1Var.f != 1 || (tu0VarArr = (xu0Var = this.d).g3) == null) {
            return;
        }
        int i10 = i3 - 1;
        tu0 tu0Var = tu0VarArr[i10];
        final su0 su0Var = (su0) d1Var.a;
        boolean z10 = xu0Var.u3 == i10;
        su0Var.getClass();
        if (!TextUtils.isEmpty(tu0Var.d)) {
            su0Var.setContentDescription(tu0Var.d);
        } else if (TextUtils.isEmpty(tu0Var.a)) {
            su0Var.setContentDescription(null);
        } else {
            su0Var.setContentDescription(tu0Var.a);
        }
        ValueAnimator valueAnimator = su0Var.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            su0Var.H = null;
        }
        su0Var.setImageResource(0);
        su0Var.a();
        final boolean D1 = su0Var.I.D1();
        su0Var.x = false;
        su0Var.E = 1.0f;
        g5.g(org.telegram.messenger.h10.t0).b(tu0Var.c, new d5() { // from class: org.telegram.ui.Components.qu0
            @Override // org.telegram.ui.Components.d5
            public final void a(TLRPC.Document document) {
                boolean z11 = !D1;
                su0 su0Var2 = su0.this;
                su0Var2.setOnlyLastFrame(z11);
                su0Var2.g(24, 24, document);
                su0Var2.d();
            }
        });
        org.telegram.messenger.g0.i3(new sp0(su0Var, 9), 60L);
        su0Var.l(z10, false);
        su0Var.setAlpha(xu0Var.w3);
        su0Var.setScaleX(xu0Var.w3);
        su0Var.setScaleY(xu0Var.w3);
        su0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        su0 su0Var;
        xu0 xu0Var = this.d;
        if (i3 == 0) {
            ai.x2 x2Var = new ai.x2(28, xu0Var.getContext(), this);
            xu0Var.t3 = x2Var;
            su0Var = x2Var;
        } else {
            su0Var = new su0(xu0Var, xu0Var.getContext());
        }
        return new bj0(su0Var);
    }

    @Override // u4.h0
    public final void y(u4.d1 d1Var) {
        if (d1Var.f == 1) {
            su0 su0Var = (su0) d1Var.a;
            su0Var.l(this.d.u3 == d1Var.b() - 1, false);
            su0Var.j();
        }
    }
}
