package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ax0 extends xl0 {
    public int c;
    public final /* synthetic */ jx0 d;

    public ax0(jx0 jx0Var) {
        this.d = jx0Var;
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    @Override // s4.h0
    public final int h() {
        jx0 jx0Var = this.d;
        fx0[] fx0VarArr = jx0Var.Y2;
        int length = (fx0VarArr == null ? 0 : fx0VarArr.length) + 1;
        if (length != this.c) {
            ci.eb ebVar = jx0Var.l3;
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
        jx0 jx0Var;
        fx0[] fx0VarArr;
        if (c1Var.f != 1 || (fx0VarArr = (jx0Var = this.d).Y2) == null) {
            return;
        }
        int i11 = i10 - 1;
        fx0 fx0Var = fx0VarArr[i11];
        final ex0 ex0Var = (ex0) c1Var.a;
        boolean z10 = jx0Var.m3 == i11;
        ex0Var.getClass();
        if (!TextUtils.isEmpty(fx0Var.d)) {
            ex0Var.setContentDescription(fx0Var.d);
        } else if (TextUtils.isEmpty(fx0Var.a)) {
            ex0Var.setContentDescription(null);
        } else {
            ex0Var.setContentDescription(fx0Var.a);
        }
        ValueAnimator valueAnimator = ex0Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            ex0Var.G = null;
        }
        ex0Var.setImageResource(0);
        ex0Var.a();
        final boolean B1 = ex0Var.H.B1();
        ex0Var.w = false;
        ex0Var.y = 1.0f;
        p5.h(UserConfig.selectedAccount).b(fx0Var.c, new m5() { // from class: org.telegram.ui.Components.cx0
            @Override // org.telegram.ui.Components.m5
            public final void a(TLRPC.Document document) {
                boolean z11 = !B1;
                ex0 ex0Var2 = ex0.this;
                ex0Var2.setOnlyLastFrame(z11);
                ex0Var2.g(24, 24, document);
                ex0Var2.d();
            }
        });
        AndroidUtilities.runOnUIThread(new yq0(ex0Var, 10), 60L);
        ex0Var.l(z10, false);
        ex0Var.setAlpha(jx0Var.o3);
        ex0Var.setScaleX(jx0Var.o3);
        ex0Var.setScaleY(jx0Var.o3);
        ex0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ex0 ex0Var;
        jx0 jx0Var = this.d;
        if (i10 == 0) {
            ci.eb ebVar = new ci.eb(this, jx0Var.getContext(), 25);
            jx0Var.l3 = ebVar;
            ex0Var = ebVar;
        } else {
            ex0Var = new ex0(jx0Var, jx0Var.getContext());
        }
        return new il0(ex0Var);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        if (c1Var.f == 1) {
            ex0 ex0Var = (ex0) c1Var.a;
            ex0Var.l(this.d.m3 == c1Var.b() - 1, false);
            ex0Var.j();
        }
    }
}
