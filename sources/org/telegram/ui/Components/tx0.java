package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class tx0 extends mm0 {
    public int c;
    public final /* synthetic */ cy0 d;

    public tx0(cy0 cy0Var) {
        this.d = cy0Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 1;
    }

    @Override // s4.h0
    public final int h() {
        cy0 cy0Var = this.d;
        yx0[] yx0VarArr = cy0Var.g3;
        int length = (yx0VarArr == null ? 0 : yx0VarArr.length) + 1;
        if (length != this.c) {
            bi.cc ccVar = cy0Var.t3;
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
        cy0 cy0Var;
        yx0[] yx0VarArr;
        if (e1Var.f != 1 || (yx0VarArr = (cy0Var = this.d).g3) == null) {
            return;
        }
        int i11 = i10 - 1;
        yx0 yx0Var = yx0VarArr[i11];
        final xx0 xx0Var = (xx0) e1Var.a;
        boolean z10 = cy0Var.u3 == i11;
        xx0Var.getClass();
        if (!TextUtils.isEmpty(yx0Var.d)) {
            xx0Var.setContentDescription(yx0Var.d);
        } else if (TextUtils.isEmpty(yx0Var.a)) {
            xx0Var.setContentDescription(null);
        } else {
            xx0Var.setContentDescription(yx0Var.a);
        }
        ValueAnimator valueAnimator = xx0Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            xx0Var.G = null;
        }
        xx0Var.setImageResource(0);
        xx0Var.a();
        final boolean G1 = xx0Var.H.G1();
        xx0Var.w = false;
        xx0Var.y = 1.0f;
        t5.h(UserConfig.selectedAccount).b(yx0Var.c, new q5() { // from class: org.telegram.ui.Components.vx0
            @Override // org.telegram.ui.Components.q5
            public final void a(TLRPC.Document document) {
                boolean z11 = !G1;
                xx0 xx0Var2 = xx0.this;
                xx0Var2.setOnlyLastFrame(z11);
                xx0Var2.g(24, 24, document);
                xx0Var2.d();
            }
        });
        AndroidUtilities.runOnUIThread(new np0(xx0Var, 15), 60L);
        xx0Var.l(z10, false);
        xx0Var.setAlpha(cy0Var.w3);
        xx0Var.setScaleX(cy0Var.w3);
        xx0Var.setScaleY(cy0Var.w3);
        xx0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        xx0 xx0Var;
        cy0 cy0Var = this.d;
        if (i10 == 0) {
            bi.cc ccVar = new bi.cc(this, cy0Var.getContext(), 26);
            cy0Var.t3 = ccVar;
            xx0Var = ccVar;
        } else {
            xx0Var = new xx0(cy0Var, cy0Var.getContext());
        }
        return new wl0(xx0Var);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        if (e1Var.f == 1) {
            xx0 xx0Var = (xx0) e1Var.a;
            xx0Var.l(this.d.u3 == e1Var.b() - 1, false);
            xx0Var.j();
        }
    }
}
