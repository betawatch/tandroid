package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class zw0 extends vl0 {
    public int c;
    public final /* synthetic */ ix0 d;

    public zw0(ix0 ix0Var) {
        this.d = ix0Var;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    @Override // s4.h0
    public final int h() {
        ix0 ix0Var = this.d;
        ex0[] ex0VarArr = ix0Var.Y2;
        int length = (ex0VarArr == null ? 0 : ex0VarArr.length) + 1;
        if (length != this.c) {
            ci.eb ebVar = ix0Var.l3;
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
        ix0 ix0Var;
        ex0[] ex0VarArr;
        if (c1Var.f != 1 || (ex0VarArr = (ix0Var = this.d).Y2) == null) {
            return;
        }
        int i11 = i10 - 1;
        ex0 ex0Var = ex0VarArr[i11];
        final dx0 dx0Var = (dx0) c1Var.a;
        boolean z10 = ix0Var.m3 == i11;
        dx0Var.getClass();
        if (!TextUtils.isEmpty(ex0Var.d)) {
            dx0Var.setContentDescription(ex0Var.d);
        } else if (TextUtils.isEmpty(ex0Var.a)) {
            dx0Var.setContentDescription(null);
        } else {
            dx0Var.setContentDescription(ex0Var.a);
        }
        ValueAnimator valueAnimator = dx0Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            dx0Var.G = null;
        }
        dx0Var.setImageResource(0);
        dx0Var.a();
        final boolean B1 = dx0Var.H.B1();
        dx0Var.w = false;
        dx0Var.y = 1.0f;
        q5.h(UserConfig.selectedAccount).b(ex0Var.c, new n5() { // from class: org.telegram.ui.Components.bx0
            @Override // org.telegram.ui.Components.n5
            public final void a(TLRPC.Document document) {
                boolean z11 = !B1;
                dx0 dx0Var2 = dx0.this;
                dx0Var2.setOnlyLastFrame(z11);
                dx0Var2.g(24, 24, document);
                dx0Var2.d();
            }
        });
        AndroidUtilities.runOnUIThread(new xq0(dx0Var, 9), 60L);
        dx0Var.l(z10, false);
        dx0Var.setAlpha(ix0Var.o3);
        dx0Var.setScaleX(ix0Var.o3);
        dx0Var.setScaleY(ix0Var.o3);
        dx0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        dx0 dx0Var;
        ix0 ix0Var = this.d;
        if (i10 == 0) {
            ci.eb ebVar = new ci.eb(this, ix0Var.getContext(), 25);
            ix0Var.l3 = ebVar;
            dx0Var = ebVar;
        } else {
            dx0Var = new dx0(ix0Var, ix0Var.getContext());
        }
        return new gl0(dx0Var);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        if (c1Var.f == 1) {
            dx0 dx0Var = (dx0) c1Var.a;
            dx0Var.l(this.d.m3 == c1Var.b() - 1, false);
            dx0Var.j();
        }
    }
}
