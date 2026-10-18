package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class gx0 extends hm0 {
    public int c;
    public final /* synthetic */ px0 d;

    public gx0(px0 px0Var) {
        this.d = px0Var;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 1;
    }

    @Override // s4.g0
    public final int h() {
        px0 px0Var = this.d;
        lx0[] lx0VarArr = px0Var.W2;
        int length = (lx0VarArr == null ? 0 : lx0VarArr.length) + 1;
        if (length != this.c) {
            ai.ic icVar = px0Var.j3;
            if (icVar != null) {
                icVar.requestLayout();
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
        px0 px0Var;
        lx0[] lx0VarArr;
        if (b1Var.f != 1 || (lx0VarArr = (px0Var = this.d).W2) == null) {
            return;
        }
        int i11 = i10 - 1;
        lx0 lx0Var = lx0VarArr[i11];
        final kx0 kx0Var = (kx0) b1Var.a;
        boolean z10 = px0Var.k3 == i11;
        kx0Var.getClass();
        if (!TextUtils.isEmpty(lx0Var.d)) {
            kx0Var.setContentDescription(lx0Var.d);
        } else if (TextUtils.isEmpty(lx0Var.a)) {
            kx0Var.setContentDescription(null);
        } else {
            kx0Var.setContentDescription(lx0Var.a);
        }
        ValueAnimator valueAnimator = kx0Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            kx0Var.G = null;
        }
        kx0Var.setImageResource(0);
        kx0Var.a();
        final boolean B1 = kx0Var.H.B1();
        kx0Var.w = false;
        kx0Var.y = 1.0f;
        r5.h(UserConfig.selectedAccount).b(lx0Var.c, new o5() { // from class: org.telegram.ui.Components.ix0
            @Override // org.telegram.ui.Components.o5
            public final void a(TLRPC.Document document) {
                boolean z11 = !B1;
                kx0 kx0Var2 = kx0.this;
                kx0Var2.setOnlyLastFrame(z11);
                kx0Var2.g(24, 24, document);
                kx0Var2.d();
            }
        });
        AndroidUtilities.runOnUIThread(new fr0(kx0Var, 9), 60L);
        kx0Var.l(z10, false);
        kx0Var.setAlpha(px0Var.m3);
        kx0Var.setScaleX(px0Var.m3);
        kx0Var.setScaleY(px0Var.m3);
        kx0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        kx0 kx0Var;
        px0 px0Var = this.d;
        if (i10 == 0) {
            ai.ic icVar = new ai.ic(this, px0Var.getContext(), 26);
            px0Var.j3 = icVar;
            kx0Var = icVar;
        } else {
            kx0Var = new kx0(px0Var, px0Var.getContext());
        }
        return new sl0(kx0Var);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        if (b1Var.f == 1) {
            kx0 kx0Var = (kx0) b1Var.a;
            kx0Var.l(this.d.k3 == b1Var.b() - 1, false);
            kx0Var.j();
        }
    }
}
