package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class nw0 extends kl0 {
    public int c;
    public final /* synthetic */ ww0 d;

    public nw0(ww0 ww0Var) {
        this.d = ww0Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    @Override // s4.h0
    public final int h() {
        ww0 ww0Var = this.d;
        sw0[] sw0VarArr = ww0Var.Y2;
        int length = (sw0VarArr == null ? 0 : sw0VarArr.length) + 1;
        if (length != this.c) {
            ci.eb ebVar = ww0Var.l3;
            if (ebVar != null) {
                ebVar.requestLayout();
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
        ww0 ww0Var;
        sw0[] sw0VarArr;
        if (c1Var.f != 1 || (sw0VarArr = (ww0Var = this.d).Y2) == null) {
            return;
        }
        int i11 = i10 - 1;
        sw0 sw0Var = sw0VarArr[i11];
        final rw0 rw0Var = (rw0) c1Var.a;
        boolean z10 = ww0Var.m3 == i11;
        rw0Var.getClass();
        if (!TextUtils.isEmpty(sw0Var.d)) {
            rw0Var.setContentDescription(sw0Var.d);
        } else if (TextUtils.isEmpty(sw0Var.a)) {
            rw0Var.setContentDescription(null);
        } else {
            rw0Var.setContentDescription(sw0Var.a);
        }
        ValueAnimator valueAnimator = rw0Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            rw0Var.G = null;
        }
        rw0Var.setImageResource(0);
        rw0Var.a();
        final boolean A1 = rw0Var.H.A1();
        rw0Var.w = false;
        rw0Var.y = 1.0f;
        o5.h(UserConfig.selectedAccount).b(sw0Var.c, new l5() { // from class: org.telegram.ui.Components.pw0
            @Override // org.telegram.ui.Components.l5
            public final void a(TLRPC.Document document) {
                boolean z11 = !A1;
                rw0 rw0Var2 = rw0.this;
                rw0Var2.setOnlyLastFrame(z11);
                rw0Var2.g(24, 24, document);
                rw0Var2.d();
            }
        });
        AndroidUtilities.runOnUIThread(new jq0(rw0Var, 9), 60L);
        rw0Var.l(z10, false);
        rw0Var.setAlpha(ww0Var.o3);
        rw0Var.setScaleX(ww0Var.o3);
        rw0Var.setScaleY(ww0Var.o3);
        rw0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        rw0 rw0Var;
        ww0 ww0Var = this.d;
        if (i10 == 0) {
            ci.eb ebVar = new ci.eb(this, ww0Var.getContext(), 25);
            ww0Var.l3 = ebVar;
            rw0Var = ebVar;
        } else {
            rw0Var = new rw0(ww0Var, ww0Var.getContext());
        }
        return new vk0(rw0Var);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        if (c1Var.f == 1) {
            rw0 rw0Var = (rw0) c1Var.a;
            rw0Var.l(this.d.m3 == c1Var.b() - 1, false);
            rw0Var.j();
        }
    }
}
