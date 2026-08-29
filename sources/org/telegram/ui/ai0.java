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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ai0 implements org.telegram.ui.Components.ek0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 a;
    public final /* synthetic */ ki0 b;

    public ai0(ki0 ki0Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.b = ki0Var;
        this.a = o2Var;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public final void Q(View view, kg.q0 q0Var, boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.ActionBar.o2 o2Var;
        boolean z13;
        long j10;
        kg.q0 q0Var2 = q0Var;
        if (q0Var2 != null) {
            ki0 ki0Var = this.b;
            yh0 yh0Var = ki0Var.a0;
            wh0 wh0Var = ki0Var.W;
            int i10 = ki0Var.c;
            if (yh0Var == null) {
                return;
            }
            boolean z14 = !UserConfig.getInstance(i10).isPremium() && q0Var2.d;
            org.telegram.ui.Cells.s1 s1Var = ki0Var.M;
            if (s1Var != null) {
                MessageObject messageObject = s1Var.getMessageObject();
                if (messageObject == null) {
                    return;
                }
                TLRPC.Message message = messageObject.messageOwner;
                long j11 = message.effect;
                long j12 = q0Var2.c;
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
                    ki0Var.M.X3(messageObject, ki0Var.l(messageObject), ki0Var.J.size() > 1, false, false, false);
                    ki0Var.a0.setSelectedReactionAnimated(z13 ? null : q0Var2);
                    if (ki0Var.a0.getReactionsWindow() != null && ki0Var.a0.getReactionsWindow().m != null) {
                        kg.z zVar = ki0Var.a0.getReactionsWindow().m;
                        if (z13) {
                            q0Var2 = null;
                        }
                        zVar.setSelectedReaction(q0Var2);
                        ki0Var.a0.getReactionsWindow().a.invalidate();
                    }
                }
                wh0Var.c();
                if (!z13) {
                    wh0Var.o(ki0Var.M, 0, false, false);
                }
                if (z14) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    message2.effect = j10;
                    if (j10 == 0) {
                        message2.flags2 &= -5;
                    }
                }
                xh0 xh0Var = ki0Var.T;
                if (xh0Var != null) {
                    xh0Var.setEffect(messageObject.messageOwner.effect);
                }
                ki0Var.m(messageObject.messageOwner.effect);
            } else if (ki0Var.h0 != null) {
                long j13 = q0Var2.c;
                if (j13 == ki0Var.E) {
                    ki0Var.E = 0L;
                    z12 = true;
                } else {
                    ki0Var.E = j13;
                    z12 = false;
                }
                xh0 xh0Var2 = ki0Var.T;
                if (xh0Var2 != null) {
                    xh0Var2.setEffect(ki0Var.E);
                }
                ki0Var.m(ki0Var.E);
                if (!z14) {
                    TLRPC.TL_availableEffect effect = ki0Var.E == 0 ? null : MessagesController.getInstance(i10).getEffect(ki0Var.E);
                    org.telegram.ui.Components.n5 n5Var = ki0Var.F;
                    if (n5Var != null) {
                        if (ki0Var.E == 0 || effect == null) {
                            n5Var.g(null, true);
                        } else {
                            n5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                        }
                    }
                    ki0Var.a0.setSelectedReactionAnimated(z12 ? null : q0Var2);
                    if (ki0Var.a0.getReactionsWindow() != null && ki0Var.a0.getReactionsWindow().m != null) {
                        kg.z zVar2 = ki0Var.a0.getReactionsWindow().m;
                        if (z12) {
                            q0Var2 = null;
                        }
                        zVar2.setSelectedReaction(q0Var2);
                        ki0Var.a0.getReactionsWindow().a.invalidate();
                    }
                }
                wh0Var.c();
                if (!z12) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j14 = ki0Var.E;
                    tL_message.effect = j14;
                    if (j14 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    ki0Var.W.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z14 && (o2Var = this.a) != null) {
                new org.telegram.ui.Components.tc(ki0Var.C, ki0Var.b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new zh0(0, o2Var))).j();
            }
            ki0Var.D.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ void H() {
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ void G(Canvas canvas, RectF rectF, float f9, float f10, float f11, int i10, boolean z10) {
    }
}
