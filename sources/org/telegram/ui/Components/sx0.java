package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class sx0 extends lm0 {
    public int c;
    public final /* synthetic */ by0 d;

    public sx0(by0 by0Var) {
        this.d = by0Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 1;
    }

    @Override // s4.h0
    public final int h() {
        by0 by0Var = this.d;
        xx0[] xx0VarArr = by0Var.g3;
        int length = (xx0VarArr == null ? 0 : xx0VarArr.length) + 1;
        if (length != this.c) {
            bi.cc ccVar = by0Var.t3;
            if (ccVar != null) {
                ccVar.requestLayout();
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
    public final void v(s4.e1 e1Var, int i10) {
        by0 by0Var;
        xx0[] xx0VarArr;
        if (e1Var.f != 1 || (xx0VarArr = (by0Var = this.d).g3) == null) {
            return;
        }
        int i11 = i10 - 1;
        xx0 xx0Var = xx0VarArr[i11];
        final wx0 wx0Var = (wx0) e1Var.a;
        boolean z10 = by0Var.u3 == i11;
        wx0Var.getClass();
        if (!TextUtils.isEmpty(xx0Var.d)) {
            wx0Var.setContentDescription(xx0Var.d);
        } else if (TextUtils.isEmpty(xx0Var.a)) {
            wx0Var.setContentDescription(null);
        } else {
            wx0Var.setContentDescription(xx0Var.a);
        }
        ValueAnimator valueAnimator = wx0Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            wx0Var.G = null;
        }
        wx0Var.setImageResource(0);
        wx0Var.a();
        final boolean G1 = wx0Var.H.G1();
        wx0Var.w = false;
        wx0Var.y = 1.0f;
        t5.h(UserConfig.selectedAccount).b(xx0Var.c, new q5() { // from class: org.telegram.ui.Components.ux0
            @Override // org.telegram.ui.Components.q5
            public final void a(TLRPC.Document document) {
                boolean z11 = !G1;
                wx0 wx0Var2 = wx0.this;
                wx0Var2.setOnlyLastFrame(z11);
                wx0Var2.g(24, 24, document);
                wx0Var2.d();
            }
        });
        AndroidUtilities.runOnUIThread(new mp0(wx0Var, 15), 60L);
        wx0Var.l(z10, false);
        wx0Var.setAlpha(by0Var.w3);
        wx0Var.setScaleX(by0Var.w3);
        wx0Var.setScaleY(by0Var.w3);
        wx0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        wx0 wx0Var;
        by0 by0Var = this.d;
        if (i10 == 0) {
            bi.cc ccVar = new bi.cc(this, by0Var.getContext(), 26);
            by0Var.t3 = ccVar;
            wx0Var = ccVar;
        } else {
            wx0Var = new wx0(by0Var, by0Var.getContext());
        }
        return new vl0(wx0Var);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        if (e1Var.f == 1) {
            wx0 wx0Var = (wx0) e1Var.a;
            wx0Var.l(this.d.u3 == e1Var.b() - 1, false);
            wx0Var.j();
        }
    }
}
