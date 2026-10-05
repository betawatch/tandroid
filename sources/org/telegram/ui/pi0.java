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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class pi0 implements org.telegram.ui.Components.rk0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ zi0 b;

    public pi0(zi0 zi0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.b = zi0Var;
        this.a = n2Var;
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ boolean B() {
        return true;
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ boolean E() {
        return false;
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ boolean K() {
        return false;
    }

    @Override // org.telegram.ui.Components.rk0
    public final void i(View view, zg.m0 m0Var, boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z13;
        long j3;
        zg.m0 m0Var2 = m0Var;
        if (m0Var2 != null) {
            zi0 zi0Var = this.b;
            ni0 ni0Var = zi0Var.e0;
            li0 li0Var = zi0Var.a0;
            int i10 = zi0Var.c;
            if (ni0Var == null) {
                return;
            }
            boolean z14 = !UserConfig.getInstance(i10).isPremium() && m0Var2.d;
            org.telegram.ui.Cells.u1 u1Var = zi0Var.Q;
            if (u1Var != null) {
                MessageObject messageObject = u1Var.getMessageObject();
                if (messageObject == null) {
                    return;
                }
                TLRPC.Message message = messageObject.messageOwner;
                long j10 = message.effect;
                long j11 = m0Var2.c;
                if (j11 == j10) {
                    message.flags2 &= -5;
                    message.effect = 0L;
                    z13 = true;
                } else {
                    message.flags2 |= 4;
                    message.effect = j11;
                    z13 = false;
                }
                if (z14) {
                    j3 = j10;
                } else {
                    j3 = j10;
                    zi0Var.Q.X3(messageObject, zi0Var.l(messageObject), zi0Var.N.size() > 1, false, false, false);
                    zi0Var.e0.setSelectedReactionAnimated(z13 ? null : m0Var2);
                    if (zi0Var.e0.getReactionsWindow() != null && zi0Var.e0.getReactionsWindow().m != null) {
                        zg.v vVar = zi0Var.e0.getReactionsWindow().m;
                        if (z13) {
                            m0Var2 = null;
                        }
                        vVar.setSelectedReaction(m0Var2);
                        zi0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                li0Var.c();
                if (!z13) {
                    li0Var.o(zi0Var.Q, 0, false, false);
                }
                if (z14) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    message2.effect = j3;
                    if (j3 == 0) {
                        message2.flags2 &= -5;
                    }
                }
                mi0 mi0Var = zi0Var.X;
                if (mi0Var != null) {
                    mi0Var.setEffect(messageObject.messageOwner.effect);
                }
                zi0Var.m(messageObject.messageOwner.effect);
            } else if (zi0Var.l0 != null) {
                long j12 = m0Var2.c;
                if (j12 == zi0Var.I) {
                    zi0Var.I = 0L;
                    z12 = true;
                } else {
                    zi0Var.I = j12;
                    z12 = false;
                }
                mi0 mi0Var2 = zi0Var.X;
                if (mi0Var2 != null) {
                    mi0Var2.setEffect(zi0Var.I);
                }
                zi0Var.m(zi0Var.I);
                if (!z14) {
                    TLRPC.TL_availableEffect effect = zi0Var.I == 0 ? null : MessagesController.getInstance(i10).getEffect(zi0Var.I);
                    org.telegram.ui.Components.o5 o5Var = zi0Var.J;
                    if (o5Var != null) {
                        if (zi0Var.I == 0 || effect == null) {
                            o5Var.g(null, true);
                        } else {
                            o5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                        }
                    }
                    zi0Var.e0.setSelectedReactionAnimated(z12 ? null : m0Var2);
                    if (zi0Var.e0.getReactionsWindow() != null && zi0Var.e0.getReactionsWindow().m != null) {
                        zg.v vVar2 = zi0Var.e0.getReactionsWindow().m;
                        if (z12) {
                            m0Var2 = null;
                        }
                        vVar2.setSelectedReaction(m0Var2);
                        zi0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                li0Var.c();
                if (!z12) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j13 = zi0Var.I;
                    tL_message.effect = j13;
                    if (j13 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    zi0Var.a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z14 && (n2Var = this.a) != null) {
                new org.telegram.ui.Components.yc(zi0Var.G, zi0Var.b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new oi0(0, n2Var))).j();
            }
            zi0Var.H.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ void I() {
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ void H(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
