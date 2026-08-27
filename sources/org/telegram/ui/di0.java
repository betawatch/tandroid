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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class di0 implements org.telegram.ui.Components.vj0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ ni0 b;

    public di0(ni0 ni0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.b = ni0Var;
        this.a = n2Var;
    }

    @Override // org.telegram.ui.Components.vj0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.vj0
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.vj0
    public final void n(View view, ig.q0 q0Var, boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z13;
        long j10;
        ig.q0 q0Var2 = q0Var;
        if (q0Var2 != null) {
            ni0 ni0Var = this.b;
            bi0 bi0Var = ni0Var.a0;
            zh0 zh0Var = ni0Var.W;
            int i10 = ni0Var.c;
            if (bi0Var == null) {
                return;
            }
            boolean z14 = !UserConfig.getInstance(i10).isPremium() && q0Var2.d;
            org.telegram.ui.Cells.s1 s1Var = ni0Var.M;
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
                    ni0Var.M.W3(messageObject, ni0Var.l(messageObject), ni0Var.J.size() > 1, false, false, false);
                    ni0Var.a0.setSelectedReactionAnimated(z13 ? null : q0Var2);
                    if (ni0Var.a0.getReactionsWindow() != null && ni0Var.a0.getReactionsWindow().m != null) {
                        ig.z zVar = ni0Var.a0.getReactionsWindow().m;
                        if (z13) {
                            q0Var2 = null;
                        }
                        zVar.setSelectedReaction(q0Var2);
                        ni0Var.a0.getReactionsWindow().a.invalidate();
                    }
                }
                zh0Var.c();
                if (!z13) {
                    zh0Var.o(ni0Var.M, 0, false, false);
                }
                if (z14) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    message2.effect = j10;
                    if (j10 == 0) {
                        message2.flags2 &= -5;
                    }
                }
                ai0 ai0Var = ni0Var.T;
                if (ai0Var != null) {
                    ai0Var.setEffect(messageObject.messageOwner.effect);
                }
                ni0Var.m(messageObject.messageOwner.effect);
            } else if (ni0Var.h0 != null) {
                long j13 = q0Var2.c;
                if (j13 == ni0Var.E) {
                    ni0Var.E = 0L;
                    z12 = true;
                } else {
                    ni0Var.E = j13;
                    z12 = false;
                }
                ai0 ai0Var2 = ni0Var.T;
                if (ai0Var2 != null) {
                    ai0Var2.setEffect(ni0Var.E);
                }
                ni0Var.m(ni0Var.E);
                if (!z14) {
                    TLRPC.TL_availableEffect effect = ni0Var.E == 0 ? null : MessagesController.getInstance(i10).getEffect(ni0Var.E);
                    org.telegram.ui.Components.i5 i5Var = ni0Var.F;
                    if (i5Var != null) {
                        if (ni0Var.E == 0 || effect == null) {
                            i5Var.g(null, true);
                        } else {
                            i5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                        }
                    }
                    ni0Var.a0.setSelectedReactionAnimated(z12 ? null : q0Var2);
                    if (ni0Var.a0.getReactionsWindow() != null && ni0Var.a0.getReactionsWindow().m != null) {
                        ig.z zVar2 = ni0Var.a0.getReactionsWindow().m;
                        if (z12) {
                            q0Var2 = null;
                        }
                        zVar2.setSelectedReaction(q0Var2);
                        ni0Var.a0.getReactionsWindow().a.invalidate();
                    }
                }
                zh0Var.c();
                if (!z12) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j14 = ni0Var.E;
                    tL_message.effect = j14;
                    if (j14 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    ni0Var.W.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z14 && (n2Var = this.a) != null) {
                new org.telegram.ui.Components.mc(ni0Var.C, ni0Var.b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new ci0(0, n2Var))).j();
            }
            ni0Var.D.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.vj0
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.vj0
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.vj0
    public final /* synthetic */ void r(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z10) {
    }
}
