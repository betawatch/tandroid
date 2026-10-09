package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class px0 extends pm0 {
    public int c;
    public final /* synthetic */ yx0 d;

    public px0(yx0 yx0Var) {
        this.d = yx0Var;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return d1Var.f == 1;
    }

    @Override // s4.i0
    public final int h() {
        yx0 yx0Var = this.d;
        ux0[] ux0VarArr = yx0Var.W2;
        int length = (ux0VarArr == null ? 0 : ux0VarArr.length) + 1;
        if (length != this.c) {
            ci.bb bbVar = yx0Var.j3;
            if (bbVar != null) {
                bbVar.requestLayout();
            }
            this.c = length;
        }
        return length;
    }

    @Override // s4.i0
    public final int j(int i10) {
        return i10 == 0 ? 0 : 1;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        yx0 yx0Var;
        ux0[] ux0VarArr;
        if (d1Var.f != 1 || (ux0VarArr = (yx0Var = this.d).W2) == null) {
            return;
        }
        int i11 = i10 - 1;
        ux0 ux0Var = ux0VarArr[i11];
        final tx0 tx0Var = (tx0) d1Var.a;
        boolean z10 = yx0Var.k3 == i11;
        tx0Var.getClass();
        if (!TextUtils.isEmpty(ux0Var.d)) {
            tx0Var.setContentDescription(ux0Var.d);
        } else if (TextUtils.isEmpty(ux0Var.a)) {
            tx0Var.setContentDescription(null);
        } else {
            tx0Var.setContentDescription(ux0Var.a);
        }
        ValueAnimator valueAnimator = tx0Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            tx0Var.G = null;
        }
        tx0Var.setImageResource(0);
        tx0Var.a();
        final boolean B1 = tx0Var.H.B1();
        tx0Var.w = false;
        tx0Var.y = 1.0f;
        s5.h(UserConfig.selectedAccount).b(ux0Var.c, new p5() { // from class: org.telegram.ui.Components.rx0
            @Override // org.telegram.ui.Components.p5
            public final void a(TLRPC.Document document) {
                boolean z11 = !B1;
                tx0 tx0Var2 = tx0.this;
                tx0Var2.setOnlyLastFrame(z11);
                tx0Var2.g(24, 24, document);
                tx0Var2.d();
            }
        });
        AndroidUtilities.runOnUIThread(new or0(tx0Var, 9), 60L);
        tx0Var.l(z10, false);
        tx0Var.setAlpha(yx0Var.m3);
        tx0Var.setScaleX(yx0Var.m3);
        tx0Var.setScaleY(yx0Var.m3);
        tx0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        tx0 tx0Var;
        yx0 yx0Var = this.d;
        if (i10 == 0) {
            ci.bb bbVar = new ci.bb(this, yx0Var.getContext(), 25);
            yx0Var.j3 = bbVar;
            tx0Var = bbVar;
        } else {
            tx0Var = new tx0(yx0Var, yx0Var.getContext());
        }
        return new am0(tx0Var);
    }

    @Override // s4.i0
    public final void y(s4.d1 d1Var) {
        if (d1Var.f == 1) {
            tx0 tx0Var = (tx0) d1Var.a;
            tx0Var.l(this.d.k3 == d1Var.b() - 1, false);
            tx0Var.j();
        }
    }
}
