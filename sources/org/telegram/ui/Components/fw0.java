package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fw0 extends il0 {
    public int c;
    public final /* synthetic */ ow0 d;

    public fw0(ow0 ow0Var) {
        this.d = ow0Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f == 1;
    }

    @Override // f2.p0
    public final int h() {
        ow0 ow0Var = this.d;
        kw0[] kw0VarArr = ow0Var.U2;
        int length = (kw0VarArr == null ? 0 : kw0VarArr.length) + 1;
        if (length != this.c) {
            cg.h0 h0Var = ow0Var.h3;
            if (h0Var != null) {
                h0Var.requestLayout();
            }
            this.c = length;
        }
        return length;
    }

    @Override // f2.p0
    public final int j(int i10) {
        return i10 == 0 ? 0 : 1;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        ow0 ow0Var;
        kw0[] kw0VarArr;
        if (n1Var.f != 1 || (kw0VarArr = (ow0Var = this.d).U2) == null) {
            return;
        }
        int i11 = i10 - 1;
        kw0 kw0Var = kw0VarArr[i11];
        final jw0 jw0Var = (jw0) n1Var.a;
        boolean z10 = ow0Var.i3 == i11;
        jw0Var.getClass();
        if (!TextUtils.isEmpty(kw0Var.d)) {
            jw0Var.setContentDescription(kw0Var.d);
        } else if (TextUtils.isEmpty(kw0Var.a)) {
            jw0Var.setContentDescription(null);
        } else {
            jw0Var.setContentDescription(kw0Var.a);
        }
        ValueAnimator valueAnimator = jw0Var.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            jw0Var.C = null;
        }
        jw0Var.setImageResource(0);
        jw0Var.a();
        final boolean A1 = jw0Var.D.A1();
        jw0Var.w = false;
        jw0Var.y = 1.0f;
        p5.h(UserConfig.selectedAccount).b(kw0Var.c, new m5() { // from class: org.telegram.ui.Components.hw0
            @Override // org.telegram.ui.Components.m5
            public final void a(TLRPC.Document document) {
                boolean z11 = !A1;
                jw0 jw0Var2 = jw0.this;
                jw0Var2.setOnlyLastFrame(z11);
                jw0Var2.g(24, 24, document);
                jw0Var2.d();
            }
        });
        AndroidUtilities.runOnUIThread(new fq0(jw0Var, 9), 60L);
        jw0Var.l(z10, false);
        jw0Var.setAlpha(ow0Var.k3);
        jw0Var.setScaleX(ow0Var.k3);
        jw0Var.setScaleY(ow0Var.k3);
        jw0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        jw0 jw0Var;
        ow0 ow0Var = this.d;
        if (i10 == 0) {
            cg.h0 h0Var = new cg.h0(this, ow0Var.getContext(), 22);
            ow0Var.h3 = h0Var;
            jw0Var = h0Var;
        } else {
            jw0Var = new jw0(ow0Var, ow0Var.getContext());
        }
        return new vk0(jw0Var);
    }

    @Override // f2.p0
    public final void y(f2.n1 n1Var) {
        if (n1Var.f == 1) {
            jw0 jw0Var = (jw0) n1Var.a;
            jw0Var.l(this.d.i3 == n1Var.b() - 1, false);
            jw0Var.j();
        }
    }
}
