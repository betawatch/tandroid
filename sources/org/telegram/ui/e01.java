package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class e01 implements org.telegram.ui.Components.jj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ n11 e;

    public e01(n11 n11Var, int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, Integer num) {
        this.e = n11Var;
        this.a = i7;
        this.b = context;
        this.c = e6Var;
        this.d = num;
    }

    @Override // org.telegram.ui.Components.jj0
    public final boolean f(float f10, float f11, int i7, View view) {
        n11 n11Var = this.e;
        int i10 = n11Var.W;
        int i11 = this.a;
        if (i11 != 11 && i11 != 13 && n11Var.i1) {
            boolean z10 = view instanceof x01;
            if (z10 && (i11 == 1 || i11 == 8)) {
                n11Var.l();
                try {
                    n11Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                x01 x01Var = (x01) view;
                if (!x01Var.s && !org.telegram.messenger.m10.i(i10).q()) {
                    org.telegram.ui.Components.p5 p5Var = x01Var.e;
                    TLRPC.Document document = p5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.g5.e(i10, p5Var.documentId);
                    }
                    n11Var.p(x01Var, Long.valueOf(x01Var.e.documentId), document, x01Var.w, null);
                    return true;
                }
                n11Var.T0 = x01Var;
                n11Var.V0 = 0.0f;
                n11Var.U0 = false;
                if (x01Var.s) {
                    n11Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.si.b0(i10).r.get(n11Var.T0.y.f);
                    if (tL_availableReaction != null) {
                        n11Var.W0.r0(org.telegram.messenger.gc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", n11Var.T0.y, 0);
                    }
                } else {
                    n11Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.g5(4, i10, n11Var.T0.e.documentId));
                }
                n11Var.i0.invalidate();
                n11Var.m();
                return true;
            }
            if (z10) {
                x01 x01Var2 = (x01) view;
                if (x01Var2.e != null && (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = x01Var2.w;
                    d01 d01Var = new d01(this, this.b, n11Var.V1, n11Var, x01Var2, this.c, view, tL_starGiftUnique);
                    n11Var.Y0 = d01Var;
                    d01Var.show();
                    try {
                        view.performHapticFeedback(0, 1);
                    } catch (Exception unused2) {
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.jj0
    public final void i() {
        n11 n11Var = this.e;
        if (n11Var.T0 != null) {
            n11Var.U0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(n11Var.V0, 0.0f);
            ofFloat.addUpdateListener(new ez0(this, 4));
            ofFloat.addListener(new xx(this, 27));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.er.f);
            ofFloat.start();
        }
    }

    @Override // org.telegram.ui.Components.jj0
    public final /* synthetic */ void q(float f10) {
    }
}
