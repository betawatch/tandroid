package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class pw0 extends sl0 {
    public int c;
    public final /* synthetic */ yw0 d;

    public pw0(yw0 yw0Var) {
        this.d = yw0Var;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.f == 1;
    }

    @Override // f2.p0
    public final int h() {
        yw0 yw0Var = this.d;
        uw0[] uw0VarArr = yw0Var.V2;
        int length = (uw0VarArr == null ? 0 : uw0VarArr.length) + 1;
        if (length != this.c) {
            fg.h0 h0Var = yw0Var.i3;
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
    public final void v(f2.m1 m1Var, int i10) {
        yw0 yw0Var;
        uw0[] uw0VarArr;
        if (m1Var.f != 1 || (uw0VarArr = (yw0Var = this.d).V2) == null) {
            return;
        }
        int i11 = i10 - 1;
        uw0 uw0Var = uw0VarArr[i11];
        final tw0 tw0Var = (tw0) m1Var.a;
        boolean z4 = yw0Var.j3 == i11;
        tw0Var.getClass();
        if (!TextUtils.isEmpty(uw0Var.d)) {
            tw0Var.setContentDescription(uw0Var.d);
        } else if (TextUtils.isEmpty(uw0Var.a)) {
            tw0Var.setContentDescription(null);
        } else {
            tw0Var.setContentDescription(uw0Var.a);
        }
        ValueAnimator valueAnimator = tw0Var.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            tw0Var.D = null;
        }
        tw0Var.setImageResource(0);
        tw0Var.a();
        final boolean A1 = tw0Var.E.A1();
        tw0Var.w = false;
        tw0Var.y = 1.0f;
        l5.h(UserConfig.selectedAccount).b(uw0Var.c, new i5() { // from class: org.telegram.ui.Components.rw0
            @Override // org.telegram.ui.Components.i5
            public final void a(TLRPC.Document document) {
                boolean z10 = !A1;
                tw0 tw0Var2 = tw0.this;
                tw0Var2.setOnlyLastFrame(z10);
                tw0Var2.g(24, 24, document);
                tw0Var2.d();
            }
        });
        AndroidUtilities.runOnUIThread(new oq0(tw0Var, 9), 60L);
        tw0Var.l(z4, false);
        tw0Var.setAlpha(yw0Var.l3);
        tw0Var.setScaleX(yw0Var.l3);
        tw0Var.setScaleY(yw0Var.l3);
        tw0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        tw0 tw0Var;
        yw0 yw0Var = this.d;
        if (i10 == 0) {
            fg.h0 h0Var = new fg.h0(this, yw0Var.getContext(), 20);
            yw0Var.i3 = h0Var;
            tw0Var = h0Var;
        } else {
            tw0Var = new tw0(yw0Var, yw0Var.getContext());
        }
        return new fl0(tw0Var);
    }

    @Override // f2.p0
    public final void y(f2.m1 m1Var) {
        if (m1Var.f == 1) {
            tw0 tw0Var = (tw0) m1Var.a;
            tw0Var.l(this.d.j3 == m1Var.b() - 1, false);
            tw0Var.j();
        }
    }
}
