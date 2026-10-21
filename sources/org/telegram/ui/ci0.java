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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class ci0 implements org.telegram.ui.Components.cl0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ mi0 b;

    public ci0(mi0 mi0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.b = mi0Var;
        this.a = n2Var;
    }

    @Override // org.telegram.ui.Components.cl0
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.Components.cl0
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.cl0
    public final void o(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z13;
        long j10;
        ah.i1 i1Var2 = i1Var;
        if (i1Var2 != null) {
            mi0 mi0Var = this.b;
            ai0 ai0Var = mi0Var.d0;
            yh0 yh0Var = mi0Var.Z;
            int i10 = mi0Var.c;
            if (ai0Var == null) {
                return;
            }
            boolean z14 = !UserConfig.getInstance(i10).isPremium() && i1Var2.d;
            org.telegram.ui.Cells.u1 u1Var = mi0Var.P;
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
                    mi0Var.P.X3(messageObject, mi0Var.k(messageObject), mi0Var.M.size() > 1, false, false, false);
                    mi0Var.d0.setSelectedReactionAnimated(z13 ? null : i1Var2);
                    if (mi0Var.d0.getReactionsWindow() != null && mi0Var.d0.getReactionsWindow().m != null) {
                        ah.n0 n0Var = mi0Var.d0.getReactionsWindow().m;
                        if (z13) {
                            i1Var2 = null;
                        }
                        n0Var.setSelectedReaction(i1Var2);
                        mi0Var.d0.getReactionsWindow().a.invalidate();
                    }
                }
                yh0Var.c();
                if (!z13) {
                    yh0Var.n(mi0Var.P, 0, false, false);
                }
                if (z14) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    message2.effect = j10;
                    if (j10 == 0) {
                        message2.flags2 &= -5;
                    }
                }
                zh0 zh0Var = mi0Var.W;
                if (zh0Var != null) {
                    zh0Var.setEffect(messageObject.messageOwner.effect);
                }
                mi0Var.l(messageObject.messageOwner.effect);
            } else if (mi0Var.k0 != null) {
                long j13 = i1Var2.c;
                if (j13 == mi0Var.H) {
                    mi0Var.H = 0L;
                    z12 = true;
                } else {
                    mi0Var.H = j13;
                    z12 = false;
                }
                zh0 zh0Var2 = mi0Var.W;
                if (zh0Var2 != null) {
                    zh0Var2.setEffect(mi0Var.H);
                }
                mi0Var.l(mi0Var.H);
                if (!z14) {
                    TLRPC.TL_availableEffect effect = mi0Var.H == 0 ? null : MessagesController.getInstance(i10).getEffect(mi0Var.H);
                    org.telegram.ui.Components.p5 p5Var = mi0Var.I;
                    if (p5Var != null) {
                        if (mi0Var.H == 0 || effect == null) {
                            p5Var.g(null, true);
                        } else {
                            p5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                        }
                    }
                    mi0Var.d0.setSelectedReactionAnimated(z12 ? null : i1Var2);
                    if (mi0Var.d0.getReactionsWindow() != null && mi0Var.d0.getReactionsWindow().m != null) {
                        ah.n0 n0Var2 = mi0Var.d0.getReactionsWindow().m;
                        if (z12) {
                            i1Var2 = null;
                        }
                        n0Var2.setSelectedReaction(i1Var2);
                        mi0Var.d0.getReactionsWindow().a.invalidate();
                    }
                }
                yh0Var.c();
                if (!z12) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j14 = mi0Var.H;
                    tL_message.effect = j14;
                    if (j14 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    mi0Var.Z.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z14 && (n2Var = this.a) != null) {
                new org.telegram.ui.Components.xc(mi0Var.F, mi0Var.b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new bi0(0, n2Var))).j();
            }
            mi0Var.G.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // org.telegram.ui.Components.cl0
    public final /* synthetic */ void v() {
    }

    @Override // org.telegram.ui.Components.cl0
    public final /* synthetic */ void q(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
