package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class k01 implements org.telegram.ui.Components.ej0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ t11 e;

    public k01(t11 t11Var, int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, Integer num) {
        this.e = t11Var;
        this.a = i7;
        this.b = context;
        this.c = h6Var;
        this.d = num;
    }

    @Override // org.telegram.ui.Components.ej0
    public final boolean f(float f10, float f11, int i7, View view) {
        t11 t11Var = this.e;
        int i10 = t11Var.V;
        int i11 = this.a;
        if (i11 != 11 && i11 != 13 && t11Var.h1) {
            boolean z9 = view instanceof d11;
            if (z9 && (i11 == 1 || i11 == 8)) {
                t11Var.l();
                try {
                    t11Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                d11 d11Var = (d11) view;
                if (!d11Var.s && !org.telegram.messenger.p10.i(i10).q()) {
                    org.telegram.ui.Components.q5 q5Var = d11Var.e;
                    TLRPC.Document document = q5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.h5.e(i10, q5Var.documentId);
                    }
                    t11Var.p(d11Var, Long.valueOf(d11Var.e.documentId), document, d11Var.w, null);
                    return true;
                }
                t11Var.S0 = d11Var;
                t11Var.U0 = 0.0f;
                t11Var.T0 = false;
                if (d11Var.s) {
                    t11Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(i10).r.get(t11Var.S0.y.f);
                    if (tL_availableReaction != null) {
                        t11Var.V0.r0(org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", t11Var.S0.y, 0);
                    }
                } else {
                    t11Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.h5(4, i10, t11Var.S0.e.documentId));
                }
                t11Var.h0.invalidate();
                t11Var.m();
                return true;
            }
            if (z9) {
                d11 d11Var2 = (d11) view;
                if (d11Var2.e != null && (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = d11Var2.w;
                    j01 j01Var = new j01(this, this.b, t11Var.U1, t11Var, d11Var2, this.c, view, tL_starGiftUnique);
                    t11Var.X0 = j01Var;
                    j01Var.show();
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

    @Override // org.telegram.ui.Components.ej0
    public final void i() {
        t11 t11Var = this.e;
        if (t11Var.S0 != null) {
            t11Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(t11Var.U0, 0.0f);
            ofFloat.addUpdateListener(new kz0(this, 4));
            ofFloat.addListener(new g30(this, 26));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.wq.f);
            ofFloat.start();
        }
    }

    @Override // org.telegram.ui.Components.ej0
    public final /* synthetic */ void q(float f10) {
    }
}
