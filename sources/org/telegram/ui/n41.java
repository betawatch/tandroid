package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class n41 implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ x51 e;

    public n41(x51 x51Var, int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, Integer num) {
        this.e = x51Var;
        this.a = i10;
        this.b = context;
        this.c = d6Var;
        this.d = num;
    }

    @Override // org.telegram.ui.Components.am0
    public final boolean d(float f7, float f10, int i10, View view) {
        x51 x51Var = this.e;
        int i11 = x51Var.V;
        int i12 = this.a;
        if (i12 != 11 && i12 != 13 && x51Var.h1) {
            boolean z10 = view instanceof g51;
            if (z10 && (i12 == 1 || i12 == 8)) {
                x51Var.l();
                try {
                    x51Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                g51 g51Var = (g51) view;
                if (!g51Var.s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.a6 a6Var = g51Var.e;
                    TLRPC.Document document = a6Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.r5.f(i11, a6Var.documentId);
                    }
                    x51Var.p(g51Var, Long.valueOf(g51Var.e.documentId), document, g51Var.v, null);
                    return true;
                }
                x51Var.S0 = g51Var;
                x51Var.U0 = 0.0f;
                x51Var.T0 = false;
                if (g51Var.s) {
                    x51Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(x51Var.S0.x.f);
                    if (tL_availableReaction != null) {
                        x51Var.V0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", x51Var.S0.x, 0);
                    }
                } else {
                    x51Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.r5(4, i11, x51Var.S0.e.documentId));
                }
                x51Var.h0.invalidate();
                x51Var.m();
                return true;
            }
            if (z10) {
                g51 g51Var2 = (g51) view;
                if (g51Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = g51Var2.v;
                    m41 m41Var = new m41(this, this.b, x51Var.T1, x51Var, g51Var2, this.c, view, tL_starGiftUnique);
                    x51Var.X0 = m41Var;
                    m41Var.show();
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

    @Override // org.telegram.ui.Components.am0
    public final void h() {
        x51 x51Var = this.e;
        if (x51Var.S0 != null) {
            x51Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(x51Var.U0, 0.0f);
            ofFloat.addUpdateListener(new c11(this, 6));
            ofFloat.addListener(new zb0(this, 24));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.bs.f);
            ofFloat.start();
        }
    }

    @Override // org.telegram.ui.Components.am0
    public final /* synthetic */ void o(float f7) {
    }
}
