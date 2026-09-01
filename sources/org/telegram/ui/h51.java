package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class h51 implements org.telegram.ui.Components.ml0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ r61 e;

    public h51(r61 r61Var, int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, Integer num) {
        this.e = r61Var;
        this.a = i10;
        this.b = context;
        this.c = g6Var;
        this.d = num;
    }

    @Override // org.telegram.ui.Components.ml0
    public final boolean c(float f10, float f11, int i10, View view) {
        r61 r61Var = this.e;
        int i11 = r61Var.S;
        int i12 = this.a;
        if (i12 != 11 && i12 != 13 && r61Var.e1) {
            boolean z4 = view instanceof a61;
            if (z4 && (i12 == 1 || i12 == 8)) {
                r61Var.l();
                try {
                    r61Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                a61 a61Var = (a61) view;
                if (!a61Var.s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.u5 u5Var = a61Var.e;
                    TLRPC.Document document = u5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.l5.f(i11, u5Var.documentId);
                    }
                    r61Var.p(a61Var, Long.valueOf(a61Var.e.documentId), document, a61Var.v, null);
                    return true;
                }
                r61Var.P0 = a61Var;
                r61Var.R0 = 0.0f;
                r61Var.Q0 = false;
                if (a61Var.s) {
                    r61Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(r61Var.P0.x.f);
                    if (tL_availableReaction != null) {
                        r61Var.S0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", r61Var.P0.x, 0);
                    }
                } else {
                    r61Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.l5(4, i11, r61Var.P0.e.documentId));
                }
                r61Var.e0.invalidate();
                r61Var.m();
                return true;
            }
            if (z4) {
                a61 a61Var2 = (a61) view;
                if (a61Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = a61Var2.v;
                    g51 g51Var = new g51(this, this.b, r61Var.Q1, r61Var, a61Var2, this.c, view, tL_starGiftUnique);
                    r61Var.U0 = g51Var;
                    g51Var.show();
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

    @Override // org.telegram.ui.Components.ml0
    public final void h() {
        r61 r61Var = this.e;
        if (r61Var.P0 != null) {
            r61Var.Q0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(r61Var.R0, 0.0f);
            ofFloat.addUpdateListener(new j11(this, 8));
            ofFloat.addListener(new ns0(this, 18));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.pr.f);
            ofFloat.start();
        }
    }

    @Override // org.telegram.ui.Components.ml0
    public final /* synthetic */ void p(float f10) {
    }
}
