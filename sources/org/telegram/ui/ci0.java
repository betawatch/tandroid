package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ci0 implements org.telegram.ui.Components.bl0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ mi0 b;

    public ci0(mi0 mi0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.b = mi0Var;
        this.a = n2Var;
    }

    @Override // org.telegram.ui.Components.bl0
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.Components.bl0
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public final void o(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z13;
        long j10;
        ah.i1 i1Var2 = i1Var;
        if (i1Var2 != null) {
            mi0 mi0Var = this.b;
            ai0 ai0Var = mi0Var.e0;
            yh0 yh0Var = mi0Var.a0;
            int i10 = mi0Var.c;
            if (ai0Var == null) {
                return;
            }
            boolean z14 = !UserConfig.getInstance(i10).isPremium() && i1Var2.d;
            org.telegram.ui.Cells.u1 u1Var = mi0Var.Q;
            if (u1Var != null) {
                MessageObject messageObject = u1Var.getMessageObject();
                if (messageObject == null) {
                    return;
                }
                TLRPC.Message message = messageObject.messageOwner;
                long j11 = message.effect;
                long j12 = i1Var2.c;
                if (j12 == j11) {
                    message.flags2 &= -5;
                    message.effect = 0L;
                    z13 = true;
                } else {
                    message.flags2 |= 4;
                    message.effect = j12;
                    z13 = false;
                }
                if (z14) {
                    j10 = j11;
                } else {
                    j10 = j11;
                    mi0Var.Q.X3(messageObject, mi0Var.l(messageObject), mi0Var.N.size() > 1, false, false, false);
                    mi0Var.e0.setSelectedReactionAnimated(z13 ? null : i1Var2);
                    if (mi0Var.e0.getReactionsWindow() != null && mi0Var.e0.getReactionsWindow().m != null) {
                        ah.n0 n0Var = mi0Var.e0.getReactionsWindow().m;
                        if (z13) {
                            i1Var2 = null;
                        }
                        n0Var.setSelectedReaction(i1Var2);
                        mi0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                yh0Var.c();
                if (!z13) {
                    yh0Var.n(mi0Var.Q, 0, false, false);
                }
                if (z14) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    message2.effect = j10;
                    if (j10 == 0) {
                        message2.flags2 &= -5;
                    }
                }
                zh0 zh0Var = mi0Var.X;
                if (zh0Var != null) {
                    zh0Var.setEffect(messageObject.messageOwner.effect);
                }
                mi0Var.m(messageObject.messageOwner.effect);
            } else if (mi0Var.l0 != null) {
                long j13 = i1Var2.c;
                if (j13 == mi0Var.I) {
                    mi0Var.I = 0L;
                    z12 = true;
                } else {
                    mi0Var.I = j13;
                    z12 = false;
                }
                zh0 zh0Var2 = mi0Var.X;
                if (zh0Var2 != null) {
                    zh0Var2.setEffect(mi0Var.I);
                }
                mi0Var.m(mi0Var.I);
                if (!z14) {
                    TLRPC.TL_availableEffect effect = mi0Var.I == 0 ? null : MessagesController.getInstance(i10).getEffect(mi0Var.I);
                    org.telegram.ui.Components.p5 p5Var = mi0Var.J;
                    if (p5Var != null) {
                        if (mi0Var.I == 0 || effect == null) {
                            p5Var.g(null, true);
                        } else {
                            p5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                        }
                    }
                    mi0Var.e0.setSelectedReactionAnimated(z12 ? null : i1Var2);
                    if (mi0Var.e0.getReactionsWindow() != null && mi0Var.e0.getReactionsWindow().m != null) {
                        ah.n0 n0Var2 = mi0Var.e0.getReactionsWindow().m;
                        if (z12) {
                            i1Var2 = null;
                        }
                        n0Var2.setSelectedReaction(i1Var2);
                        mi0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                yh0Var.c();
                if (!z12) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j14 = mi0Var.I;
                    tL_message.effect = j14;
                    if (j14 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    mi0Var.a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z14 && (n2Var = this.a) != null) {
                new org.telegram.ui.Components.xc(mi0Var.G, mi0Var.b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new bi0(0, n2Var))).j();
            }
            mi0Var.H.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public final /* synthetic */ void v() {
    }

    @Override // org.telegram.ui.Components.bl0
    public final /* synthetic */ void q(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
