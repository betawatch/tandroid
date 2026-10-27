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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fi0 implements org.telegram.ui.Components.fl0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 a;
    public final /* synthetic */ pi0 b;

    public fi0(pi0 pi0Var, org.telegram.ui.ActionBar.r2 r2Var) {
        this.b = pi0Var;
        this.a = r2Var;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final void p(View view, bh.x0 x0Var, boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.ActionBar.r2 r2Var;
        boolean z13;
        long j10;
        bh.x0 x0Var2 = x0Var;
        if (x0Var2 != null) {
            pi0 pi0Var = this.b;
            di0 di0Var = pi0Var.d0;
            bi0 bi0Var = pi0Var.Z;
            int i10 = pi0Var.c;
            if (di0Var == null) {
                return;
            }
            boolean z14 = !UserConfig.getInstance(i10).isPremium() && x0Var2.d;
            org.telegram.ui.Cells.s1 s1Var = pi0Var.P;
            if (s1Var != null) {
                MessageObject messageObject = s1Var.getMessageObject();
                if (messageObject == null) {
                    return;
                }
                TLRPC.Message message = messageObject.messageOwner;
                long j11 = message.effect;
                long j12 = x0Var2.c;
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
                    pi0Var.P.Z3(messageObject, pi0Var.k(messageObject), pi0Var.M.size() > 1, false, false, false);
                    pi0Var.d0.setSelectedReactionAnimated(z13 ? null : x0Var2);
                    if (pi0Var.d0.getReactionsWindow() != null && pi0Var.d0.getReactionsWindow().m != null) {
                        bh.d0 d0Var = pi0Var.d0.getReactionsWindow().m;
                        if (z13) {
                            x0Var2 = null;
                        }
                        d0Var.setSelectedReaction(x0Var2);
                        pi0Var.d0.getReactionsWindow().a.invalidate();
                    }
                }
                bi0Var.c();
                if (!z13) {
                    bi0Var.n(pi0Var.P, 0, false, false);
                }
                if (z14) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    message2.effect = j10;
                    if (j10 == 0) {
                        message2.flags2 &= -5;
                    }
                }
                ci0 ci0Var = pi0Var.W;
                if (ci0Var != null) {
                    ci0Var.setEffect(messageObject.messageOwner.effect);
                }
                pi0Var.l(messageObject.messageOwner.effect);
            } else if (pi0Var.k0 != null) {
                long j13 = x0Var2.c;
                if (j13 == pi0Var.H) {
                    pi0Var.H = 0L;
                    z12 = true;
                } else {
                    pi0Var.H = j13;
                    z12 = false;
                }
                ci0 ci0Var2 = pi0Var.W;
                if (ci0Var2 != null) {
                    ci0Var2.setEffect(pi0Var.H);
                }
                pi0Var.l(pi0Var.H);
                if (!z14) {
                    TLRPC.TL_availableEffect effect = pi0Var.H == 0 ? null : MessagesController.getInstance(i10).getEffect(pi0Var.H);
                    org.telegram.ui.Components.r5 r5Var = pi0Var.I;
                    if (r5Var != null) {
                        if (pi0Var.H == 0 || effect == null) {
                            r5Var.g(null, true);
                        } else {
                            r5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                        }
                    }
                    pi0Var.d0.setSelectedReactionAnimated(z12 ? null : x0Var2);
                    if (pi0Var.d0.getReactionsWindow() != null && pi0Var.d0.getReactionsWindow().m != null) {
                        bh.d0 d0Var2 = pi0Var.d0.getReactionsWindow().m;
                        if (z12) {
                            x0Var2 = null;
                        }
                        d0Var2.setSelectedReaction(x0Var2);
                        pi0Var.d0.getReactionsWindow().a.invalidate();
                    }
                }
                bi0Var.c();
                if (!z12) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j14 = pi0Var.H;
                    tL_message.effect = j14;
                    if (j14 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    pi0Var.Z.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z14 && (r2Var = this.a) != null) {
                new org.telegram.ui.Components.wc(pi0Var.F, pi0Var.b).R(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new ei0(0, r2Var))).j();
            }
            pi0Var.G.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void l(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
