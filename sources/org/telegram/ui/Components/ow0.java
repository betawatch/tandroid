package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ow0 extends ll0 {
    public int c;
    public final /* synthetic */ xw0 d;

    public ow0(xw0 xw0Var) {
        this.d = xw0Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    @Override // s4.h0
    public final int h() {
        xw0 xw0Var = this.d;
        tw0[] tw0VarArr = xw0Var.Y2;
        int length = (tw0VarArr == null ? 0 : tw0VarArr.length) + 1;
        if (length != this.c) {
            ci.eb ebVar = xw0Var.l3;
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
        xw0 xw0Var;
        tw0[] tw0VarArr;
        if (c1Var.f != 1 || (tw0VarArr = (xw0Var = this.d).Y2) == null) {
            return;
        }
        int i11 = i10 - 1;
        tw0 tw0Var = tw0VarArr[i11];
        final sw0 sw0Var = (sw0) c1Var.a;
        boolean z10 = xw0Var.m3 == i11;
        sw0Var.getClass();
        if (!TextUtils.isEmpty(tw0Var.d)) {
            sw0Var.setContentDescription(tw0Var.d);
        } else if (TextUtils.isEmpty(tw0Var.a)) {
            sw0Var.setContentDescription(null);
        } else {
            sw0Var.setContentDescription(tw0Var.a);
        }
        ValueAnimator valueAnimator = sw0Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            sw0Var.G = null;
        }
        sw0Var.setImageResource(0);
        sw0Var.a();
        final boolean B1 = sw0Var.H.B1();
        sw0Var.w = false;
        sw0Var.y = 1.0f;
        o5.h(UserConfig.selectedAccount).b(tw0Var.c, new l5() { // from class: org.telegram.ui.Components.qw0
            @Override // org.telegram.ui.Components.l5
            public final void a(TLRPC.Document document) {
                boolean z11 = !B1;
                sw0 sw0Var2 = sw0.this;
                sw0Var2.setOnlyLastFrame(z11);
                sw0Var2.g(24, 24, document);
                sw0Var2.d();
            }
        });
        AndroidUtilities.runOnUIThread(new kq0(sw0Var, 9), 60L);
        sw0Var.l(z10, false);
        sw0Var.setAlpha(xw0Var.o3);
        sw0Var.setScaleX(xw0Var.o3);
        sw0Var.setScaleY(xw0Var.o3);
        sw0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        sw0 sw0Var;
        xw0 xw0Var = this.d;
        if (i10 == 0) {
            ci.eb ebVar = new ci.eb(this, xw0Var.getContext(), 25);
            xw0Var.l3 = ebVar;
            sw0Var = ebVar;
        } else {
            sw0Var = new sw0(xw0Var, xw0Var.getContext());
        }
        return new wk0(sw0Var);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        if (c1Var.f == 1) {
            sw0 sw0Var = (sw0) c1Var.a;
            sw0Var.l(this.d.m3 == c1Var.b() - 1, false);
            sw0Var.j();
        }
    }
}
