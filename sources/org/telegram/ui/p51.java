package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class p51 implements org.telegram.ui.Components.dl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ z61 e;

    public p51(z61 z61Var, int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, Integer num) {
        this.e = z61Var;
        this.a = i10;
        this.b = context;
        this.c = d6Var;
        this.d = num;
    }

    @Override // org.telegram.ui.Components.dl0
    public final boolean c(float f7, float f10, int i10, View view) {
        z61 z61Var = this.e;
        int i11 = z61Var.V;
        int i12 = this.a;
        if (i12 != 11 && i12 != 13 && z61Var.h1) {
            boolean z10 = view instanceof i61;
            if (z10 && (i12 == 1 || i12 == 8)) {
                z61Var.l();
                try {
                    z61Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                i61 i61Var = (i61) view;
                if (!i61Var.s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.z5 z5Var = i61Var.e;
                    TLRPC.Document document = z5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.q5.f(i11, z5Var.documentId);
                    }
                    z61Var.p(i61Var, Long.valueOf(i61Var.e.documentId), document, i61Var.v, null);
                    return true;
                }
                z61Var.S0 = i61Var;
                z61Var.U0 = 0.0f;
                z61Var.T0 = false;
                if (i61Var.s) {
                    z61Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(z61Var.S0.x.f);
                    if (tL_availableReaction != null) {
                        z61Var.V0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", z61Var.S0.x, 0);
                    }
                } else {
                    z61Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.q5(4, i11, z61Var.S0.e.documentId));
                }
                z61Var.h0.invalidate();
                z61Var.m();
                return true;
            }
            if (z10) {
                i61 i61Var2 = (i61) view;
                if (i61Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = i61Var2.v;
                    o51 o51Var = new o51(this, this.b, z61Var.T1, z61Var, i61Var2, this.c, view, tL_starGiftUnique);
                    z61Var.X0 = o51Var;
                    o51Var.show();
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

    @Override // org.telegram.ui.Components.dl0
    public final void g() {
        z61 z61Var = this.e;
        if (z61Var.S0 != null) {
            z61Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(z61Var.U0, 0.0f);
            ofFloat.addUpdateListener(new s11(this, 8));
            ofFloat.addListener(new wq0(this, 19));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.rr.f);
            ofFloat.start();
        }
    }

    @Override // org.telegram.ui.Components.dl0
    public final /* synthetic */ void q(float f7) {
    }
}
