package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ow0 extends rl0 {
    public int c;
    public final /* synthetic */ xw0 d;

    public ow0(xw0 xw0Var) {
        this.d = xw0Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.f == 1;
    }

    @Override // f2.p0
    public final int h() {
        xw0 xw0Var = this.d;
        tw0[] tw0VarArr = xw0Var.V2;
        int length = (tw0VarArr == null ? 0 : tw0VarArr.length) + 1;
        if (length != this.c) {
            fg.h0 h0Var = xw0Var.i3;
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
        xw0 xw0Var;
        tw0[] tw0VarArr;
        if (m1Var.f != 1 || (tw0VarArr = (xw0Var = this.d).V2) == null) {
            return;
        }
        int i11 = i10 - 1;
        tw0 tw0Var = tw0VarArr[i11];
        final sw0 sw0Var = (sw0) m1Var.a;
        boolean z4 = xw0Var.j3 == i11;
        sw0Var.getClass();
        if (!TextUtils.isEmpty(tw0Var.d)) {
            sw0Var.setContentDescription(tw0Var.d);
        } else if (TextUtils.isEmpty(tw0Var.a)) {
            sw0Var.setContentDescription(null);
        } else {
            sw0Var.setContentDescription(tw0Var.a);
        }
        ValueAnimator valueAnimator = sw0Var.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            sw0Var.D = null;
        }
        sw0Var.setImageResource(0);
        sw0Var.a();
        final boolean z12 = sw0Var.E.z1();
        sw0Var.w = false;
        sw0Var.y = 1.0f;
        l5.h(UserConfig.selectedAccount).b(tw0Var.c, new i5() { // from class: org.telegram.ui.Components.qw0
            @Override // org.telegram.ui.Components.i5
            public final void a(TLRPC.Document document) {
                boolean z10 = !z12;
                sw0 sw0Var2 = sw0.this;
                sw0Var2.setOnlyLastFrame(z10);
                sw0Var2.g(24, 24, document);
                sw0Var2.d();
            }
        });
        AndroidUtilities.runOnUIThread(new nq0(sw0Var, 9), 60L);
        sw0Var.l(z4, false);
        sw0Var.setAlpha(xw0Var.l3);
        sw0Var.setScaleX(xw0Var.l3);
        sw0Var.setScaleY(xw0Var.l3);
        sw0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        sw0 sw0Var;
        xw0 xw0Var = this.d;
        if (i10 == 0) {
            fg.h0 h0Var = new fg.h0(this, xw0Var.getContext(), 20);
            xw0Var.i3 = h0Var;
            sw0Var = h0Var;
        } else {
            sw0Var = new sw0(xw0Var, xw0Var.getContext());
        }
        return new el0(sw0Var);
    }

    @Override // f2.p0
    public final void y(f2.m1 m1Var) {
        if (m1Var.f == 1) {
            sw0 sw0Var = (sw0) m1Var.a;
            sw0Var.l(this.d.j3 == m1Var.b() - 1, false);
            sw0Var.j();
        }
    }
}
