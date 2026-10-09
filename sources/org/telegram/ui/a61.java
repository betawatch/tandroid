package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class a61 implements org.telegram.ui.Components.hm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ k71 e;

    public a61(k71 k71Var, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, Integer num) {
        this.e = k71Var;
        this.a = i10;
        this.b = context;
        this.c = e6Var;
        this.d = num;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean c(float f7, float f10, int i10, View view) {
        k71 k71Var = this.e;
        int i11 = k71Var.V;
        int i12 = this.a;
        if (i12 != 11 && i12 != 13 && k71Var.h1) {
            boolean z10 = view instanceof t61;
            if (z10 && (i12 == 1 || i12 == 8)) {
                k71Var.l();
                try {
                    k71Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                t61 t61Var = (t61) view;
                if (!t61Var.s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.b6 b6Var = t61Var.e;
                    TLRPC.Document document = b6Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.s5.f(i11, b6Var.documentId);
                    }
                    k71Var.p(t61Var, Long.valueOf(t61Var.e.documentId), document, t61Var.v, null);
                    return true;
                }
                k71Var.S0 = t61Var;
                k71Var.U0 = 0.0f;
                k71Var.T0 = false;
                if (t61Var.s) {
                    k71Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(k71Var.S0.x.f);
                    if (tL_availableReaction != null) {
                        k71Var.V0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", k71Var.S0.x, 0);
                    }
                } else {
                    k71Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.s5(4, i11, k71Var.S0.e.documentId));
                }
                k71Var.h0.invalidate();
                k71Var.m();
                return true;
            }
            if (z10) {
                t61 t61Var2 = (t61) view;
                if (t61Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = t61Var2.v;
                    z51 z51Var = new z51(this, this.b, k71Var.T1, k71Var, t61Var2, this.c, view, tL_starGiftUnique);
                    k71Var.X0 = z51Var;
                    z51Var.show();
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

    @Override // org.telegram.ui.Components.hm0
    public final void h() {
        k71 k71Var = this.e;
        if (k71Var.S0 != null) {
            k71Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(k71Var.U0, 0.0f);
            ofFloat.addUpdateListener(new y11(this, 8));
            ofFloat.addListener(new ep0(this, 20));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.hs.f);
            ofFloat.start();
        }
    }

    @Override // org.telegram.ui.Components.hm0
    public final /* synthetic */ void q(float f7) {
    }
}
