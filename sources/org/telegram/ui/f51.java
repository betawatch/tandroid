package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class f51 implements org.telegram.ui.Components.ll0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ q61 e;

    public f51(q61 q61Var, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, Integer num) {
        this.e = q61Var;
        this.a = i10;
        this.b = context;
        this.c = f6Var;
        this.d = num;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean c(float f10, float f11, int i10, View view) {
        q61 q61Var = this.e;
        int i11 = q61Var.S;
        int i12 = this.a;
        if (i12 != 11 && i12 != 13 && q61Var.e1) {
            boolean z4 = view instanceof y51;
            if (z4 && (i12 == 1 || i12 == 8)) {
                q61Var.l();
                try {
                    q61Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                y51 y51Var = (y51) view;
                if (!y51Var.s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.u5 u5Var = y51Var.e;
                    TLRPC.Document document = u5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.l5.f(i11, u5Var.documentId);
                    }
                    q61Var.p(y51Var, Long.valueOf(y51Var.e.documentId), document, y51Var.v, null);
                    return true;
                }
                q61Var.P0 = y51Var;
                q61Var.R0 = 0.0f;
                q61Var.Q0 = false;
                if (y51Var.s) {
                    q61Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(q61Var.P0.x.f);
                    if (tL_availableReaction != null) {
                        q61Var.S0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", q61Var.P0.x, 0);
                    }
                } else {
                    q61Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.l5(4, i11, q61Var.P0.e.documentId));
                }
                q61Var.e0.invalidate();
                q61Var.m();
                return true;
            }
            if (z4) {
                y51 y51Var2 = (y51) view;
                if (y51Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = y51Var2.v;
                    e51 e51Var = new e51(this, this.b, q61Var.Q1, q61Var, y51Var2, this.c, view, tL_starGiftUnique);
                    q61Var.U0 = e51Var;
                    e51Var.show();
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

    @Override // org.telegram.ui.Components.ll0
    public final void h() {
        q61 q61Var = this.e;
        if (q61Var.P0 != null) {
            q61Var.Q0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(q61Var.R0, 0.0f);
            ofFloat.addUpdateListener(new h11(this, 8));
            ofFloat.addListener(new ls0(this, 18));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.nr.f);
            ofFloat.start();
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public final /* synthetic */ void p(float f10) {
    }
}
