package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h01 implements org.telegram.ui.Components.tj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ q11 e;

    public h01(q11 q11Var, int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, Integer num) {
        this.e = q11Var;
        this.a = i7;
        this.b = context;
        this.c = i6Var;
        this.d = num;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean g(float f10, float f11, int i7, View view) {
        q11 q11Var = this.e;
        int i10 = q11Var.W;
        int i11 = this.a;
        if (i11 != 11 && i11 != 13 && q11Var.i1) {
            boolean z10 = view instanceof a11;
            if (z10 && (i11 == 1 || i11 == 8)) {
                q11Var.l();
                try {
                    q11Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                a11 a11Var = (a11) view;
                if (!a11Var.s && !org.telegram.messenger.i10.i(i10).q()) {
                    org.telegram.ui.Components.x5 x5Var = a11Var.e;
                    TLRPC.Document document = x5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.o5.e(i10, x5Var.documentId);
                    }
                    q11Var.p(a11Var, Long.valueOf(a11Var.e.documentId), document, a11Var.w, null);
                    return true;
                }
                q11Var.T0 = a11Var;
                q11Var.V0 = 0.0f;
                q11Var.U0 = false;
                if (a11Var.s) {
                    q11Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ri.d0(i10).r.get(q11Var.T0.y.f);
                    if (tL_availableReaction != null) {
                        q11Var.W0.s0(org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", q11Var.T0.y, 0);
                    }
                } else {
                    q11Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.o5(4, i10, q11Var.T0.e.documentId));
                }
                q11Var.i0.invalidate();
                q11Var.m();
                return true;
            }
            if (z10) {
                a11 a11Var2 = (a11) view;
                if (a11Var2.e != null && (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = a11Var2.w;
                    g01 g01Var = new g01(this, this.b, q11Var.V1, q11Var, a11Var2, this.c, view, tL_starGiftUnique);
                    q11Var.Y0 = g01Var;
                    g01Var.show();
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

    @Override // org.telegram.ui.Components.tj0
    public final void h() {
        q11 q11Var = this.e;
        if (q11Var.T0 != null) {
            q11Var.U0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(q11Var.V0, 0.0f);
            ofFloat.addUpdateListener(new hz0(this, 4));
            ofFloat.addListener(new zx(this, 27));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.kr.f);
            ofFloat.start();
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ void l(float f10) {
    }
}
