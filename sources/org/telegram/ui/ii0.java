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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ii0 implements org.telegram.ui.Components.ok0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 a;
    public final /* synthetic */ si0 b;

    public ii0(si0 si0Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.b = si0Var;
        this.a = p2Var;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.Components.ok0
    public final void i(View view, mg.q0 q0Var, boolean z4, boolean z10) {
        boolean z11;
        org.telegram.ui.ActionBar.p2 p2Var;
        boolean z12;
        long j10;
        mg.q0 q0Var2 = q0Var;
        if (q0Var2 != null) {
            si0 si0Var = this.b;
            gi0 gi0Var = si0Var.b0;
            ei0 ei0Var = si0Var.X;
            int i10 = si0Var.c;
            if (gi0Var == null) {
                return;
            }
            boolean z13 = !UserConfig.getInstance(i10).isPremium() && q0Var2.d;
            org.telegram.ui.Cells.t1 t1Var = si0Var.N;
            if (t1Var != null) {
                MessageObject messageObject = t1Var.getMessageObject();
                if (messageObject == null) {
                    return;
                }
                TLRPC.Message message = messageObject.messageOwner;
                long j11 = message.effect;
                long j12 = q0Var2.c;
                if (j12 == j11) {
                    message.flags2 &= -5;
                    message.effect = 0L;
                    z12 = true;
                } else {
                    message.flags2 |= 4;
                    message.effect = j12;
                    z12 = false;
                }
                if (z13) {
                    j10 = j11;
                } else {
                    j10 = j11;
                    si0Var.N.X3(messageObject, si0Var.l(messageObject), si0Var.K.size() > 1, false, false, false);
                    si0Var.b0.setSelectedReactionAnimated(z12 ? null : q0Var2);
                    if (si0Var.b0.getReactionsWindow() != null && si0Var.b0.getReactionsWindow().m != null) {
                        mg.z zVar = si0Var.b0.getReactionsWindow().m;
                        if (z12) {
                            q0Var2 = null;
                        }
                        zVar.setSelectedReaction(q0Var2);
                        si0Var.b0.getReactionsWindow().a.invalidate();
                    }
                }
                ei0Var.c();
                if (!z12) {
                    ei0Var.o(si0Var.N, 0, false, false);
                }
                if (z13) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    message2.effect = j10;
                    if (j10 == 0) {
                        message2.flags2 &= -5;
                    }
                }
                fi0 fi0Var = si0Var.U;
                if (fi0Var != null) {
                    fi0Var.setEffect(messageObject.messageOwner.effect);
                }
                si0Var.m(messageObject.messageOwner.effect);
            } else if (si0Var.i0 != null) {
                long j13 = q0Var2.c;
                if (j13 == si0Var.F) {
                    si0Var.F = 0L;
                    z11 = true;
                } else {
                    si0Var.F = j13;
                    z11 = false;
                }
                fi0 fi0Var2 = si0Var.U;
                if (fi0Var2 != null) {
                    fi0Var2.setEffect(si0Var.F);
                }
                si0Var.m(si0Var.F);
                if (!z13) {
                    TLRPC.TL_availableEffect effect = si0Var.F == 0 ? null : MessagesController.getInstance(i10).getEffect(si0Var.F);
                    org.telegram.ui.Components.j5 j5Var = si0Var.G;
                    if (j5Var != null) {
                        if (si0Var.F == 0 || effect == null) {
                            j5Var.g(null, true);
                        } else {
                            j5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                        }
                    }
                    si0Var.b0.setSelectedReactionAnimated(z11 ? null : q0Var2);
                    if (si0Var.b0.getReactionsWindow() != null && si0Var.b0.getReactionsWindow().m != null) {
                        mg.z zVar2 = si0Var.b0.getReactionsWindow().m;
                        if (z11) {
                            q0Var2 = null;
                        }
                        zVar2.setSelectedReaction(q0Var2);
                        si0Var.b0.getReactionsWindow().a.invalidate();
                    }
                }
                ei0Var.c();
                if (!z11) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j14 = si0Var.F;
                    tL_message.effect = j14;
                    if (j14 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    si0Var.X.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z13 && (p2Var = this.a) != null) {
                new org.telegram.ui.Components.qc(si0Var.D, si0Var.b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new hi0(0, p2Var))).j();
            }
            si0Var.E.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean s() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void n(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
