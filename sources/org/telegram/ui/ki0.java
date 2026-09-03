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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ki0 implements org.telegram.ui.Components.ok0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 a;
    public final /* synthetic */ ui0 b;

    public ki0(ui0 ui0Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.b = ui0Var;
        this.a = p2Var;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.Components.ok0
    public final void j(View view, mg.q0 q0Var, boolean z4, boolean z10) {
        boolean z11;
        org.telegram.ui.ActionBar.p2 p2Var;
        boolean z12;
        long j10;
        mg.q0 q0Var2 = q0Var;
        if (q0Var2 != null) {
            ui0 ui0Var = this.b;
            ii0 ii0Var = ui0Var.b0;
            gi0 gi0Var = ui0Var.X;
            int i10 = ui0Var.c;
            if (ii0Var == null) {
                return;
            }
            boolean z13 = !UserConfig.getInstance(i10).isPremium() && q0Var2.d;
            org.telegram.ui.Cells.s1 s1Var = ui0Var.N;
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
                    ui0Var.N.X3(messageObject, ui0Var.l(messageObject), ui0Var.K.size() > 1, false, false, false);
                    ui0Var.b0.setSelectedReactionAnimated(z12 ? null : q0Var2);
                    if (ui0Var.b0.getReactionsWindow() != null && ui0Var.b0.getReactionsWindow().m != null) {
                        mg.z zVar = ui0Var.b0.getReactionsWindow().m;
                        if (z12) {
                            q0Var2 = null;
                        }
                        zVar.setSelectedReaction(q0Var2);
                        ui0Var.b0.getReactionsWindow().a.invalidate();
                    }
                }
                gi0Var.c();
                if (!z12) {
                    gi0Var.o(ui0Var.N, 0, false, false);
                }
                if (z13) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    message2.effect = j10;
                    if (j10 == 0) {
                        message2.flags2 &= -5;
                    }
                }
                hi0 hi0Var = ui0Var.U;
                if (hi0Var != null) {
                    hi0Var.setEffect(messageObject.messageOwner.effect);
                }
                ui0Var.m(messageObject.messageOwner.effect);
            } else if (ui0Var.i0 != null) {
                long j13 = q0Var2.c;
                if (j13 == ui0Var.F) {
                    ui0Var.F = 0L;
                    z11 = true;
                } else {
                    ui0Var.F = j13;
                    z11 = false;
                }
                hi0 hi0Var2 = ui0Var.U;
                if (hi0Var2 != null) {
                    hi0Var2.setEffect(ui0Var.F);
                }
                ui0Var.m(ui0Var.F);
                if (!z13) {
                    TLRPC.TL_availableEffect effect = ui0Var.F == 0 ? null : MessagesController.getInstance(i10).getEffect(ui0Var.F);
                    org.telegram.ui.Components.j5 j5Var = ui0Var.G;
                    if (j5Var != null) {
                        if (ui0Var.F == 0 || effect == null) {
                            j5Var.g(null, true);
                        } else {
                            j5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                        }
                    }
                    ui0Var.b0.setSelectedReactionAnimated(z11 ? null : q0Var2);
                    if (ui0Var.b0.getReactionsWindow() != null && ui0Var.b0.getReactionsWindow().m != null) {
                        mg.z zVar2 = ui0Var.b0.getReactionsWindow().m;
                        if (z11) {
                            q0Var2 = null;
                        }
                        zVar2.setSelectedReaction(q0Var2);
                        ui0Var.b0.getReactionsWindow().a.invalidate();
                    }
                }
                gi0Var.c();
                if (!z11) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j14 = ui0Var.F;
                    tL_message.effect = j14;
                    if (j14 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    ui0Var.X.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z13 && (p2Var = this.a) != null) {
                new org.telegram.ui.Components.qc(ui0Var.D, ui0Var.b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new ji0(0, p2Var))).j();
            }
            ui0Var.E.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void l(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
