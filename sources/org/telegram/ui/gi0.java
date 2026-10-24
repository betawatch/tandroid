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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class gi0 implements org.telegram.ui.Components.fl0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 a;
    public final /* synthetic */ qi0 b;

    public gi0(qi0 qi0Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.b = qi0Var;
        this.a = o2Var;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final void m(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.ActionBar.o2 o2Var;
        boolean z13;
        long j10;
        ah.i1 i1Var2 = i1Var;
        if (i1Var2 != null) {
            qi0 qi0Var = this.b;
            ei0 ei0Var = qi0Var.d0;
            ci0 ci0Var = qi0Var.Z;
            int i10 = qi0Var.c;
            if (ei0Var == null) {
                return;
            }
            boolean z14 = !UserConfig.getInstance(i10).isPremium() && i1Var2.d;
            org.telegram.ui.Cells.t1 t1Var = qi0Var.P;
            if (t1Var != null) {
                MessageObject messageObject = t1Var.getMessageObject();
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
                    qi0Var.P.W3(messageObject, qi0Var.k(messageObject), qi0Var.M.size() > 1, false, false, false);
                    qi0Var.d0.setSelectedReactionAnimated(z13 ? null : i1Var2);
                    if (qi0Var.d0.getReactionsWindow() != null && qi0Var.d0.getReactionsWindow().m != null) {
                        ah.n0 n0Var = qi0Var.d0.getReactionsWindow().m;
                        if (z13) {
                            i1Var2 = null;
                        }
                        n0Var.setSelectedReaction(i1Var2);
                        qi0Var.d0.getReactionsWindow().a.invalidate();
                    }
                }
                ci0Var.c();
                if (!z13) {
                    ci0Var.n(qi0Var.P, 0, false, false);
                }
                if (z14) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    message2.effect = j10;
                    if (j10 == 0) {
                        message2.flags2 &= -5;
                    }
                }
                di0 di0Var = qi0Var.W;
                if (di0Var != null) {
                    di0Var.setEffect(messageObject.messageOwner.effect);
                }
                qi0Var.l(messageObject.messageOwner.effect);
            } else if (qi0Var.k0 != null) {
                long j13 = i1Var2.c;
                if (j13 == qi0Var.H) {
                    qi0Var.H = 0L;
                    z12 = true;
                } else {
                    qi0Var.H = j13;
                    z12 = false;
                }
                di0 di0Var2 = qi0Var.W;
                if (di0Var2 != null) {
                    di0Var2.setEffect(qi0Var.H);
                }
                qi0Var.l(qi0Var.H);
                if (!z14) {
                    TLRPC.TL_availableEffect effect = qi0Var.H == 0 ? null : MessagesController.getInstance(i10).getEffect(qi0Var.H);
                    org.telegram.ui.Components.p5 p5Var = qi0Var.I;
                    if (p5Var != null) {
                        if (qi0Var.H == 0 || effect == null) {
                            p5Var.g(null, true);
                        } else {
                            p5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                        }
                    }
                    qi0Var.d0.setSelectedReactionAnimated(z12 ? null : i1Var2);
                    if (qi0Var.d0.getReactionsWindow() != null && qi0Var.d0.getReactionsWindow().m != null) {
                        ah.n0 n0Var2 = qi0Var.d0.getReactionsWindow().m;
                        if (z12) {
                            i1Var2 = null;
                        }
                        n0Var2.setSelectedReaction(i1Var2);
                        qi0Var.d0.getReactionsWindow().a.invalidate();
                    }
                }
                ci0Var.c();
                if (!z12) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j14 = qi0Var.H;
                    tL_message.effect = j14;
                    if (j14 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    qi0Var.Z.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z14 && (o2Var = this.a) != null) {
                new org.telegram.ui.Components.xc(qi0Var.F, qi0Var.b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new fi0(0, o2Var))).j();
            }
            qi0Var.G.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void s(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
