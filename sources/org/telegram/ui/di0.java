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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class di0 implements org.telegram.ui.Components.el0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 a;
    public final /* synthetic */ ni0 b;

    public di0(ni0 ni0Var, org.telegram.ui.ActionBar.r2 r2Var) {
        this.b = ni0Var;
        this.a = r2Var;
    }

    @Override // org.telegram.ui.Components.el0
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.el0
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // org.telegram.ui.Components.el0
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.Components.el0
    public final void p(View view, bh.x0 x0Var, boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.ActionBar.r2 r2Var;
        boolean z13;
        long j10;
        bh.x0 x0Var2 = x0Var;
        if (x0Var2 != null) {
            ni0 ni0Var = this.b;
            bi0 bi0Var = ni0Var.d0;
            zh0 zh0Var = ni0Var.Z;
            int i10 = ni0Var.c;
            if (bi0Var == null) {
                return;
            }
            boolean z14 = !UserConfig.getInstance(i10).isPremium() && x0Var2.d;
            org.telegram.ui.Cells.s1 s1Var = ni0Var.P;
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
                    ni0Var.P.Z3(messageObject, ni0Var.k(messageObject), ni0Var.M.size() > 1, false, false, false);
                    ni0Var.d0.setSelectedReactionAnimated(z13 ? null : x0Var2);
                    if (ni0Var.d0.getReactionsWindow() != null && ni0Var.d0.getReactionsWindow().m != null) {
                        bh.d0 d0Var = ni0Var.d0.getReactionsWindow().m;
                        if (z13) {
                            x0Var2 = null;
                        }
                        d0Var.setSelectedReaction(x0Var2);
                        ni0Var.d0.getReactionsWindow().a.invalidate();
                    }
                }
                zh0Var.c();
                if (!z13) {
                    zh0Var.n(ni0Var.P, 0, false, false);
                }
                if (z14) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    message2.effect = j10;
                    if (j10 == 0) {
                        message2.flags2 &= -5;
                    }
                }
                ai0 ai0Var = ni0Var.W;
                if (ai0Var != null) {
                    ai0Var.setEffect(messageObject.messageOwner.effect);
                }
                ni0Var.l(messageObject.messageOwner.effect);
            } else if (ni0Var.k0 != null) {
                long j13 = x0Var2.c;
                if (j13 == ni0Var.H) {
                    ni0Var.H = 0L;
                    z12 = true;
                } else {
                    ni0Var.H = j13;
                    z12 = false;
                }
                ai0 ai0Var2 = ni0Var.W;
                if (ai0Var2 != null) {
                    ai0Var2.setEffect(ni0Var.H);
                }
                ni0Var.l(ni0Var.H);
                if (!z14) {
                    TLRPC.TL_availableEffect effect = ni0Var.H == 0 ? null : MessagesController.getInstance(i10).getEffect(ni0Var.H);
                    org.telegram.ui.Components.r5 r5Var = ni0Var.I;
                    if (r5Var != null) {
                        if (ni0Var.H == 0 || effect == null) {
                            r5Var.g(null, true);
                        } else {
                            r5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                        }
                    }
                    ni0Var.d0.setSelectedReactionAnimated(z12 ? null : x0Var2);
                    if (ni0Var.d0.getReactionsWindow() != null && ni0Var.d0.getReactionsWindow().m != null) {
                        bh.d0 d0Var2 = ni0Var.d0.getReactionsWindow().m;
                        if (z12) {
                            x0Var2 = null;
                        }
                        d0Var2.setSelectedReaction(x0Var2);
                        ni0Var.d0.getReactionsWindow().a.invalidate();
                    }
                }
                zh0Var.c();
                if (!z12) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j14 = ni0Var.H;
                    tL_message.effect = j14;
                    if (j14 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    ni0Var.Z.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z14 && (r2Var = this.a) != null) {
                new org.telegram.ui.Components.wc(ni0Var.F, ni0Var.b).R(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new ci0(0, r2Var))).j();
            }
            ni0Var.G.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.el0
    public final /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.el0
    public final /* synthetic */ void l(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
