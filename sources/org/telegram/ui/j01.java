package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class j01 implements org.telegram.ui.Components.tj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ s11 e;

    public j01(s11 s11Var, int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, Integer num) {
        this.e = s11Var;
        this.a = i7;
        this.b = context;
        this.c = h6Var;
        this.d = num;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean f(float f10, float f11, int i7, View view) {
        s11 s11Var = this.e;
        int i10 = s11Var.W;
        int i11 = this.a;
        if (i11 != 11 && i11 != 13 && s11Var.i1) {
            boolean z10 = view instanceof c11;
            if (z10 && (i11 == 1 || i11 == 8)) {
                s11Var.l();
                try {
                    s11Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                c11 c11Var = (c11) view;
                if (!c11Var.s && !org.telegram.messenger.j10.i(i10).q()) {
                    org.telegram.ui.Components.y5 y5Var = c11Var.e;
                    TLRPC.Document document = y5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.p5.e(i10, y5Var.documentId);
                    }
                    s11Var.p(c11Var, Long.valueOf(c11Var.e.documentId), document, c11Var.w, null);
                    return true;
                }
                s11Var.T0 = c11Var;
                s11Var.V0 = 0.0f;
                s11Var.U0 = false;
                if (c11Var.s) {
                    s11Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ri.d0(i10).r.get(s11Var.T0.y.f);
                    if (tL_availableReaction != null) {
                        s11Var.W0.r0(org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", s11Var.T0.y, 0);
                    }
                } else {
                    s11Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.p5(4, i10, s11Var.T0.e.documentId));
                }
                s11Var.i0.invalidate();
                s11Var.m();
                return true;
            }
            if (z10) {
                c11 c11Var2 = (c11) view;
                if (c11Var2.e != null && (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = c11Var2.w;
                    i01 i01Var = new i01(this, this.b, s11Var.V1, s11Var, c11Var2, this.c, view, tL_starGiftUnique);
                    s11Var.Y0 = i01Var;
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

    @Override // org.telegram.ui.Components.tj0
    public final void j() {
        s11 s11Var = this.e;
        if (s11Var.T0 != null) {
            s11Var.U0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(s11Var.V0, 0.0f);
            ofFloat.addUpdateListener(new iz0(this, 4));
            ofFloat.addListener(new ay(this, 27));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.nr.f);
            ofFloat.start();
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ void r(float f10) {
    }
}
