package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class mw0 extends kl0 {
    public int c;
    public final /* synthetic */ vw0 d;

    public mw0(vw0 vw0Var) {
        this.d = vw0Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    @Override // s4.h0
    public final int h() {
        vw0 vw0Var = this.d;
        rw0[] rw0VarArr = vw0Var.Y2;
        int length = (rw0VarArr == null ? 0 : rw0VarArr.length) + 1;
        if (length != this.c) {
            di.eb ebVar = vw0Var.l3;
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
        vw0 vw0Var;
        rw0[] rw0VarArr;
        if (c1Var.f != 1 || (rw0VarArr = (vw0Var = this.d).Y2) == null) {
            return;
        }
        int i11 = i10 - 1;
        rw0 rw0Var = rw0VarArr[i11];
        final qw0 qw0Var = (qw0) c1Var.a;
        boolean z10 = vw0Var.m3 == i11;
        qw0Var.getClass();
        if (!TextUtils.isEmpty(rw0Var.d)) {
            qw0Var.setContentDescription(rw0Var.d);
        } else if (TextUtils.isEmpty(rw0Var.a)) {
            qw0Var.setContentDescription(null);
        } else {
            qw0Var.setContentDescription(rw0Var.a);
        }
        ValueAnimator valueAnimator = qw0Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            qw0Var.G = null;
        }
        qw0Var.setImageResource(0);
        qw0Var.a();
        final boolean z12 = qw0Var.H.z1();
        qw0Var.w = false;
        qw0Var.y = 1.0f;
        q5.h(UserConfig.selectedAccount).b(rw0Var.c, new n5() { // from class: org.telegram.ui.Components.ow0
            @Override // org.telegram.ui.Components.n5
            public final void a(TLRPC.Document document) {
                boolean z11 = !z12;
                qw0 qw0Var2 = qw0.this;
                qw0Var2.setOnlyLastFrame(z11);
                qw0Var2.g(24, 24, document);
                qw0Var2.d();
            }
        });
        AndroidUtilities.runOnUIThread(new jq0(qw0Var, 9), 60L);
        qw0Var.l(z10, false);
        qw0Var.setAlpha(vw0Var.o3);
        qw0Var.setScaleX(vw0Var.o3);
        qw0Var.setScaleY(vw0Var.o3);
        qw0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        qw0 qw0Var;
        vw0 vw0Var = this.d;
        if (i10 == 0) {
            di.eb ebVar = new di.eb(this, vw0Var.getContext(), 25);
            vw0Var.l3 = ebVar;
            qw0Var = ebVar;
        } else {
            qw0Var = new qw0(vw0Var, vw0Var.getContext());
        }
        return new vk0(qw0Var);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        if (c1Var.f == 1) {
            qw0 qw0Var = (qw0) c1Var.a;
            qw0Var.l(this.d.m3 == c1Var.b() - 1, false);
            qw0Var.j();
        }
    }
}
