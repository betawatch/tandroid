package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class lx0 extends lm0 {
    public int c;
    public final /* synthetic */ ux0 d;

    public lx0(ux0 ux0Var) {
        this.d = ux0Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 1;
    }

    @Override // s4.g0
    public final int h() {
        ux0 ux0Var = this.d;
        qx0[] qx0VarArr = ux0Var.W2;
        int length = (qx0VarArr == null ? 0 : qx0VarArr.length) + 1;
        if (length != this.c) {
            di.ab abVar = ux0Var.j3;
            if (abVar != null) {
                abVar.requestLayout();
            }
            this.c = length;
        }
        return length;
    }

    @Override // s4.g0
    public final int j(int i10) {
        return i10 == 0 ? 0 : 1;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        ux0 ux0Var;
        qx0[] qx0VarArr;
        if (b1Var.f != 1 || (qx0VarArr = (ux0Var = this.d).W2) == null) {
            return;
        }
        int i11 = i10 - 1;
        qx0 qx0Var = qx0VarArr[i11];
        final px0 px0Var = (px0) b1Var.a;
        boolean z10 = ux0Var.k3 == i11;
        px0Var.getClass();
        if (!TextUtils.isEmpty(qx0Var.d)) {
            px0Var.setContentDescription(qx0Var.d);
        } else if (TextUtils.isEmpty(qx0Var.a)) {
            px0Var.setContentDescription(null);
        } else {
            px0Var.setContentDescription(qx0Var.a);
        }
        ValueAnimator valueAnimator = px0Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            px0Var.G = null;
        }
        px0Var.setImageResource(0);
        px0Var.a();
        final boolean B1 = px0Var.H.B1();
        px0Var.w = false;
        px0Var.y = 1.0f;
        s5.h(UserConfig.selectedAccount).b(qx0Var.c, new p5() { // from class: org.telegram.ui.Components.nx0
            @Override // org.telegram.ui.Components.p5
            public final void a(TLRPC.Document document) {
                boolean z11 = !B1;
                px0 px0Var2 = px0.this;
                px0Var2.setOnlyLastFrame(z11);
                px0Var2.g(24, 24, document);
                px0Var2.d();
            }
        });
        AndroidUtilities.runOnUIThread(new kr0(px0Var, 10), 60L);
        px0Var.l(z10, false);
        px0Var.setAlpha(ux0Var.m3);
        px0Var.setScaleX(ux0Var.m3);
        px0Var.setScaleY(ux0Var.m3);
        px0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        px0 px0Var;
        ux0 ux0Var = this.d;
        if (i10 == 0) {
            di.ab abVar = new di.ab(this, ux0Var.getContext(), 25);
            ux0Var.j3 = abVar;
            px0Var = abVar;
        } else {
            px0Var = new px0(ux0Var, ux0Var.getContext());
        }
        return new wl0(px0Var);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        if (b1Var.f == 1) {
            px0 px0Var = (px0) b1Var.a;
            px0Var.l(this.d.k3 == b1Var.b() - 1, false);
            px0Var.j();
        }
    }
}
