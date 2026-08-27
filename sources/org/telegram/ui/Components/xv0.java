package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xv0 extends yk0 {
    public int c;
    public final /* synthetic */ gw0 d;

    public xv0(gw0 gw0Var) {
        this.d = gw0Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f == 1;
    }

    @Override // f2.q0
    public final int h() {
        gw0 gw0Var = this.d;
        cw0[] cw0VarArr = gw0Var.U2;
        int length = (cw0VarArr == null ? 0 : cw0VarArr.length) + 1;
        if (length != this.c) {
            ag.s0 s0Var = gw0Var.h3;
            if (s0Var != null) {
                s0Var.requestLayout();
            }
            this.c = length;
        }
        return length;
    }

    @Override // f2.q0
    public final int j(int i10) {
        return i10 == 0 ? 0 : 1;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        gw0 gw0Var;
        cw0[] cw0VarArr;
        if (o1Var.f != 1 || (cw0VarArr = (gw0Var = this.d).U2) == null) {
            return;
        }
        int i11 = i10 - 1;
        cw0 cw0Var = cw0VarArr[i11];
        final bw0 bw0Var = (bw0) o1Var.a;
        boolean z10 = gw0Var.i3 == i11;
        bw0Var.getClass();
        if (!TextUtils.isEmpty(cw0Var.d)) {
            bw0Var.setContentDescription(cw0Var.d);
        } else if (TextUtils.isEmpty(cw0Var.a)) {
            bw0Var.setContentDescription(null);
        } else {
            bw0Var.setContentDescription(cw0Var.a);
        }
        ValueAnimator valueAnimator = bw0Var.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            bw0Var.C = null;
        }
        bw0Var.setImageResource(0);
        bw0Var.a();
        final boolean A1 = bw0Var.D.A1();
        bw0Var.w = false;
        bw0Var.y = 1.0f;
        k5.h(UserConfig.selectedAccount).b(cw0Var.c, new h5() { // from class: org.telegram.ui.Components.zv0
            @Override // org.telegram.ui.Components.h5
            public final void a(TLRPC.Document document) {
                boolean z11 = !A1;
                bw0 bw0Var2 = bw0.this;
                bw0Var2.setOnlyLastFrame(z11);
                bw0Var2.g(24, 24, document);
                bw0Var2.d();
            }
        });
        AndroidUtilities.runOnUIThread(new up0(bw0Var, 9), 60L);
        bw0Var.l(z10, false);
        bw0Var.setAlpha(gw0Var.k3);
        bw0Var.setScaleX(gw0Var.k3);
        bw0Var.setScaleY(gw0Var.k3);
        bw0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        bw0 bw0Var;
        gw0 gw0Var = this.d;
        if (i10 == 0) {
            ag.s0 s0Var = new ag.s0(this, gw0Var.getContext(), 24);
            gw0Var.h3 = s0Var;
            bw0Var = s0Var;
        } else {
            bw0Var = new bw0(gw0Var, gw0Var.getContext());
        }
        return new lk0(bw0Var);
    }

    @Override // f2.q0
    public final void y(f2.o1 o1Var) {
        if (o1Var.f == 1) {
            bw0 bw0Var = (bw0) o1Var.a;
            bw0Var.l(this.d.i3 == o1Var.b() - 1, false);
            bw0Var.j();
        }
    }
}
