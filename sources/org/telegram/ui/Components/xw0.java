package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class xw0 extends vl0 {
    public int c;
    public final /* synthetic */ gx0 d;

    public xw0(gx0 gx0Var) {
        this.d = gx0Var;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    @Override // s4.h0
    public final int h() {
        gx0 gx0Var = this.d;
        cx0[] cx0VarArr = gx0Var.Y2;
        int length = (cx0VarArr == null ? 0 : cx0VarArr.length) + 1;
        if (length != this.c) {
            ci.bb bbVar = gx0Var.l3;
            if (bbVar != null) {
                bbVar.requestLayout();
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
        gx0 gx0Var;
        cx0[] cx0VarArr;
        if (c1Var.f != 1 || (cx0VarArr = (gx0Var = this.d).Y2) == null) {
            return;
        }
        int i11 = i10 - 1;
        cx0 cx0Var = cx0VarArr[i11];
        final bx0 bx0Var = (bx0) c1Var.a;
        boolean z10 = gx0Var.m3 == i11;
        bx0Var.getClass();
        if (!TextUtils.isEmpty(cx0Var.d)) {
            bx0Var.setContentDescription(cx0Var.d);
        } else if (TextUtils.isEmpty(cx0Var.a)) {
            bx0Var.setContentDescription(null);
        } else {
            bx0Var.setContentDescription(cx0Var.a);
        }
        ValueAnimator valueAnimator = bx0Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            bx0Var.G = null;
        }
        bx0Var.setImageResource(0);
        bx0Var.a();
        final boolean A1 = bx0Var.H.A1();
        bx0Var.w = false;
        bx0Var.y = 1.0f;
        q5.h(UserConfig.selectedAccount).b(cx0Var.c, new n5() { // from class: org.telegram.ui.Components.zw0
            @Override // org.telegram.ui.Components.n5
            public final void a(TLRPC.Document document) {
                boolean z11 = !A1;
                bx0 bx0Var2 = bx0.this;
                bx0Var2.setOnlyLastFrame(z11);
                bx0Var2.g(24, 24, document);
                bx0Var2.d();
            }
        });
        AndroidUtilities.runOnUIThread(new wq0(bx0Var, 10), 60L);
        bx0Var.l(z10, false);
        bx0Var.setAlpha(gx0Var.o3);
        bx0Var.setScaleX(gx0Var.o3);
        bx0Var.setScaleY(gx0Var.o3);
        bx0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        bx0 bx0Var;
        gx0 gx0Var = this.d;
        if (i10 == 0) {
            ci.bb bbVar = new ci.bb(this, gx0Var.getContext(), 25);
            gx0Var.l3 = bbVar;
            bx0Var = bbVar;
        } else {
            bx0Var = new bx0(gx0Var, gx0Var.getContext());
        }
        return new gl0(bx0Var);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        if (c1Var.f == 1) {
            bx0 bx0Var = (bx0) c1Var.a;
            bx0Var.l(this.d.m3 == c1Var.b() - 1, false);
            bx0Var.j();
        }
    }
}
