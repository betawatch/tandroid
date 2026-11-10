package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class qu0 extends oj0 {
    public int c;
    public final /* synthetic */ zu0 d;

    public qu0(zu0 zu0Var) {
        this.d = zu0Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f == 1;
    }

    @Override // v4.g0
    public final int b() {
        zu0 zu0Var = this.d;
        vu0[] vu0VarArr = zu0Var.f3;
        int length = (vu0VarArr == null ? 0 : vu0VarArr.length) + 1;
        if (length != this.c) {
            bi.ec ecVar = zu0Var.s3;
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
        zu0 zu0Var;
        vu0[] vu0VarArr;
        if (d1Var.f != 1 || (vu0VarArr = (zu0Var = this.d).f3) == null) {
            return;
        }
        int i10 = i7 - 1;
        vu0 vu0Var = vu0VarArr[i10];
        final uu0 uu0Var = (uu0) d1Var.a;
        boolean z9 = zu0Var.t3 == i10;
        uu0Var.getClass();
        if (!TextUtils.isEmpty(vu0Var.d)) {
            uu0Var.setContentDescription(vu0Var.d);
        } else if (TextUtils.isEmpty(vu0Var.a)) {
            uu0Var.setContentDescription(null);
        } else {
            uu0Var.setContentDescription(vu0Var.a);
        }
        ValueAnimator valueAnimator = uu0Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            uu0Var.G = null;
        }
        uu0Var.setImageResource(0);
        uu0Var.a();
        final boolean D1 = uu0Var.H.D1();
        uu0Var.x = false;
        uu0Var.D = 1.0f;
        h5.g(org.telegram.messenger.p10.s0).b(vu0Var.c, new e5() { // from class: org.telegram.ui.Components.su0
            @Override // org.telegram.ui.Components.e5
            public final void a(TLRPC.Document document) {
                boolean z10 = !D1;
                uu0 uu0Var2 = uu0.this;
                uu0Var2.setOnlyLastFrame(z10);
                uu0Var2.g(24, 24, document);
                uu0Var2.d();
            }
        });
        org.telegram.messenger.g0.i3(new jr0(uu0Var, 7), 60L);
        uu0Var.l(z9, false);
        uu0Var.setAlpha(zu0Var.v3);
        uu0Var.setScaleX(zu0Var.v3);
        uu0Var.setScaleY(zu0Var.v3);
        uu0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        uu0 uu0Var;
        zu0 zu0Var = this.d;
        if (i7 == 0) {
            bi.ec ecVar = new bi.ec(27, zu0Var.getContext(), this);
            zu0Var.s3 = ecVar;
            uu0Var = ecVar;
        } else {
            uu0Var = new uu0(zu0Var, zu0Var.getContext());
        }
        return new xi0(uu0Var);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        if (d1Var.f == 1) {
            uu0 uu0Var = (uu0) d1Var.a;
            uu0Var.l(this.d.t3 == d1Var.b() - 1, false);
            uu0Var.j();
        }
    }
}
