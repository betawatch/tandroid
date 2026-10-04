package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ix0 extends yl0 {
    public int c;
    public final /* synthetic */ rx0 d;

    public ix0(rx0 rx0Var) {
        this.d = rx0Var;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    @Override // s4.h0
    public final int h() {
        rx0 rx0Var = this.d;
        nx0[] nx0VarArr = rx0Var.f3;
        int length = (nx0VarArr == null ? 0 : nx0VarArr.length) + 1;
        if (length != this.c) {
            ci.ab abVar = rx0Var.s3;
            if (abVar != null) {
                abVar.requestLayout();
            }
            this.c = length;
        }
        return length;
    }

    @Override // s4.h0
    public final int j(int i10) {
        return i10 == 0 ? 0 : 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        rx0 rx0Var;
        nx0[] nx0VarArr;
        if (c1Var.f != 1 || (nx0VarArr = (rx0Var = this.d).f3) == null) {
            return;
        }
        int i11 = i10 - 1;
        nx0 nx0Var = nx0VarArr[i11];
        final mx0 mx0Var = (mx0) c1Var.a;
        boolean z10 = rx0Var.t3 == i11;
        mx0Var.getClass();
        if (!TextUtils.isEmpty(nx0Var.d)) {
            mx0Var.setContentDescription(nx0Var.d);
        } else if (TextUtils.isEmpty(nx0Var.a)) {
            mx0Var.setContentDescription(null);
        } else {
            mx0Var.setContentDescription(nx0Var.a);
        }
        ValueAnimator valueAnimator = mx0Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            mx0Var.G = null;
        }
        mx0Var.setImageResource(0);
        mx0Var.a();
        final boolean C1 = mx0Var.H.C1();
        mx0Var.w = false;
        mx0Var.y = 1.0f;
        q5.h(UserConfig.selectedAccount).b(nx0Var.c, new n5() { // from class: org.telegram.ui.Components.kx0
            @Override // org.telegram.ui.Components.n5
            public final void a(TLRPC.Document document) {
                boolean z11 = !C1;
                mx0 mx0Var2 = mx0.this;
                mx0Var2.setOnlyLastFrame(z11);
                mx0Var2.g(24, 24, document);
                mx0Var2.d();
            }
        });
        AndroidUtilities.runOnUIThread(new br0(mx0Var, 11), 60L);
        mx0Var.l(z10, false);
        mx0Var.setAlpha(rx0Var.v3);
        mx0Var.setScaleX(rx0Var.v3);
        mx0Var.setScaleY(rx0Var.v3);
        mx0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        mx0 mx0Var;
        rx0 rx0Var = this.d;
        if (i10 == 0) {
            ci.ab abVar = new ci.ab(this, rx0Var.getContext(), 26);
            rx0Var.s3 = abVar;
            mx0Var = abVar;
        } else {
            mx0Var = new mx0(rx0Var, rx0Var.getContext());
        }
        return new il0(mx0Var);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        if (c1Var.f == 1) {
            mx0 mx0Var = (mx0) c1Var.a;
            mx0Var.l(this.d.t3 == c1Var.b() - 1, false);
            mx0Var.j();
        }
    }
}
