package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class hx0 extends hm0 {
    public int c;
    public final /* synthetic */ qx0 d;

    public hx0(qx0 qx0Var) {
        this.d = qx0Var;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 1;
    }

    @Override // s4.g0
    public final int h() {
        qx0 qx0Var = this.d;
        mx0[] mx0VarArr = qx0Var.W2;
        int length = (mx0VarArr == null ? 0 : mx0VarArr.length) + 1;
        if (length != this.c) {
            ai.ic icVar = qx0Var.j3;
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
        qx0 qx0Var;
        mx0[] mx0VarArr;
        if (b1Var.f != 1 || (mx0VarArr = (qx0Var = this.d).W2) == null) {
            return;
        }
        int i11 = i10 - 1;
        mx0 mx0Var = mx0VarArr[i11];
        final lx0 lx0Var = (lx0) b1Var.a;
        boolean z10 = qx0Var.k3 == i11;
        lx0Var.getClass();
        if (!TextUtils.isEmpty(mx0Var.d)) {
            lx0Var.setContentDescription(mx0Var.d);
        } else if (TextUtils.isEmpty(mx0Var.a)) {
            lx0Var.setContentDescription(null);
        } else {
            lx0Var.setContentDescription(mx0Var.a);
        }
        ValueAnimator valueAnimator = lx0Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            lx0Var.G = null;
        }
        lx0Var.setImageResource(0);
        lx0Var.a();
        final boolean B1 = lx0Var.H.B1();
        lx0Var.w = false;
        lx0Var.y = 1.0f;
        r5.h(UserConfig.selectedAccount).b(mx0Var.c, new o5() { // from class: org.telegram.ui.Components.jx0
            @Override // org.telegram.ui.Components.o5
            public final void a(TLRPC.Document document) {
                boolean z11 = !B1;
                lx0 lx0Var2 = lx0.this;
                lx0Var2.setOnlyLastFrame(z11);
                lx0Var2.g(24, 24, document);
                lx0Var2.d();
            }
        });
        AndroidUtilities.runOnUIThread(new gr0(lx0Var, 9), 60L);
        lx0Var.l(z10, false);
        lx0Var.setAlpha(qx0Var.m3);
        lx0Var.setScaleX(qx0Var.m3);
        lx0Var.setScaleY(qx0Var.m3);
        lx0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        lx0 lx0Var;
        qx0 qx0Var = this.d;
        if (i10 == 0) {
            ai.ic icVar = new ai.ic(this, qx0Var.getContext(), 26);
            qx0Var.j3 = icVar;
            lx0Var = icVar;
        } else {
            lx0Var = new lx0(qx0Var, qx0Var.getContext());
        }
        return new sl0(lx0Var);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        if (b1Var.f == 1) {
            lx0 lx0Var = (lx0) b1Var.a;
            lx0Var.l(this.d.k3 == b1Var.b() - 1, false);
            lx0Var.j();
        }
    }
}
