package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class jx0 extends yl0 {
    public int c;
    public final /* synthetic */ sx0 d;

    public jx0(sx0 sx0Var) {
        this.d = sx0Var;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    @Override // s4.h0
    public final int h() {
        sx0 sx0Var = this.d;
        ox0[] ox0VarArr = sx0Var.f3;
        int length = (ox0VarArr == null ? 0 : ox0VarArr.length) + 1;
        if (length != this.c) {
            ci.ab abVar = sx0Var.s3;
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
        sx0 sx0Var;
        ox0[] ox0VarArr;
        if (c1Var.f != 1 || (ox0VarArr = (sx0Var = this.d).f3) == null) {
            return;
        }
        int i11 = i10 - 1;
        ox0 ox0Var = ox0VarArr[i11];
        final nx0 nx0Var = (nx0) c1Var.a;
        boolean z10 = sx0Var.t3 == i11;
        nx0Var.getClass();
        if (!TextUtils.isEmpty(ox0Var.d)) {
            nx0Var.setContentDescription(ox0Var.d);
        } else if (TextUtils.isEmpty(ox0Var.a)) {
            nx0Var.setContentDescription(null);
        } else {
            nx0Var.setContentDescription(ox0Var.a);
        }
        ValueAnimator valueAnimator = nx0Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            nx0Var.G = null;
        }
        nx0Var.setImageResource(0);
        nx0Var.a();
        final boolean B1 = nx0Var.H.B1();
        nx0Var.w = false;
        nx0Var.y = 1.0f;
        q5.h(UserConfig.selectedAccount).b(ox0Var.c, new n5() { // from class: org.telegram.ui.Components.lx0
            @Override // org.telegram.ui.Components.n5
            public final void a(TLRPC.Document document) {
                boolean z11 = !B1;
                nx0 nx0Var2 = nx0.this;
                nx0Var2.setOnlyLastFrame(z11);
                nx0Var2.g(24, 24, document);
                nx0Var2.d();
            }
        });
        AndroidUtilities.runOnUIThread(new gq0(nx0Var, 12), 60L);
        nx0Var.l(z10, false);
        nx0Var.setAlpha(sx0Var.v3);
        nx0Var.setScaleX(sx0Var.v3);
        nx0Var.setScaleY(sx0Var.v3);
        nx0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        nx0 nx0Var;
        sx0 sx0Var = this.d;
        if (i10 == 0) {
            ci.ab abVar = new ci.ab(this, sx0Var.getContext(), 26);
            sx0Var.s3 = abVar;
            nx0Var = abVar;
        } else {
            nx0Var = new nx0(sx0Var, sx0Var.getContext());
        }
        return new il0(nx0Var);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        if (c1Var.f == 1) {
            nx0 nx0Var = (nx0) c1Var.a;
            nx0Var.l(this.d.t3 == c1Var.b() - 1, false);
            nx0Var.j();
        }
    }
}
