package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class j01 implements org.telegram.ui.Components.fj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ s11 e;

    public j01(s11 s11Var, int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var, Integer num) {
        this.e = s11Var;
        this.a = i7;
        this.b = context;
        this.c = g6Var;
        this.d = num;
    }

    @Override // org.telegram.ui.Components.fj0
    public final boolean f(float f10, float f11, int i7, View view) {
        s11 s11Var = this.e;
        int i10 = s11Var.V;
        int i11 = this.a;
        if (i11 != 11 && i11 != 13 && s11Var.h1) {
            boolean z9 = view instanceof c11;
            if (z9 && (i11 == 1 || i11 == 8)) {
                s11Var.l();
                try {
                    s11Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                c11 c11Var = (c11) view;
                if (!c11Var.s && !org.telegram.messenger.p10.i(i10).q()) {
                    org.telegram.ui.Components.r5 r5Var = c11Var.e;
                    TLRPC.Document document = r5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.i5.e(i10, r5Var.documentId);
                    }
                    s11Var.p(c11Var, Long.valueOf(c11Var.e.documentId), document, c11Var.w, null);
                    return true;
                }
                s11Var.S0 = c11Var;
                s11Var.U0 = 0.0f;
                s11Var.T0 = false;
                if (c11Var.s) {
                    s11Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(i10).r.get(s11Var.S0.y.f);
                    if (tL_availableReaction != null) {
                        s11Var.V0.r0(org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", s11Var.S0.y, 0);
                    }
                } else {
                    s11Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.i5(4, i10, s11Var.S0.e.documentId));
                }
                s11Var.h0.invalidate();
                s11Var.m();
                return true;
            }
            if (z9) {
                c11 c11Var2 = (c11) view;
                if (c11Var2.e != null && (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = c11Var2.w;
                    i01 i01Var = new i01(this, this.b, s11Var.U1, s11Var, c11Var2, this.c, view, tL_starGiftUnique);
                    s11Var.X0 = i01Var;
                    i01Var.show();
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

    @Override // org.telegram.ui.Components.fj0
    public final void i() {
        s11 s11Var = this.e;
        if (s11Var.S0 != null) {
            s11Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(s11Var.U0, 0.0f);
            ofFloat.addUpdateListener(new jz0(this, 4));
            ofFloat.addListener(new f30(this, 26));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.xq.f);
            ofFloat.start();
        }
    }

    @Override // org.telegram.ui.Components.fj0
    public final /* synthetic */ void q(float f10) {
    }
}
