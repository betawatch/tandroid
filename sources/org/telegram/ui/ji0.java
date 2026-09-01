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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ji0 implements org.telegram.ui.Components.qk0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 a;
    public final /* synthetic */ ti0 b;

    public ji0(ti0 ti0Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.b = ti0Var;
        this.a = p2Var;
    }

    @Override // org.telegram.ui.Components.qk0
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // org.telegram.ui.Components.qk0
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Components.qk0
    public final void o(View view, ng.q0 q0Var, boolean z4, boolean z10) {
        boolean z11;
        org.telegram.ui.ActionBar.p2 p2Var;
        boolean z12;
        long j10;
        ng.q0 q0Var2 = q0Var;
        if (q0Var2 != null) {
            ti0 ti0Var = this.b;
            hi0 hi0Var = ti0Var.b0;
            fi0 fi0Var = ti0Var.X;
            int i10 = ti0Var.c;
            if (hi0Var == null) {
                return;
            }
            boolean z13 = !UserConfig.getInstance(i10).isPremium() && q0Var2.d;
            org.telegram.ui.Cells.t1 t1Var = ti0Var.N;
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
                    ti0Var.N.X3(messageObject, ti0Var.l(messageObject), ti0Var.K.size() > 1, false, false, false);
                    ti0Var.b0.setSelectedReactionAnimated(z12 ? null : q0Var2);
                    if (ti0Var.b0.getReactionsWindow() != null && ti0Var.b0.getReactionsWindow().m != null) {
                        ng.z zVar = ti0Var.b0.getReactionsWindow().m;
                        if (z12) {
                            q0Var2 = null;
                        }
                        zVar.setSelectedReaction(q0Var2);
                        ti0Var.b0.getReactionsWindow().a.invalidate();
                    }
                }
                fi0Var.c();
                if (!z12) {
                    fi0Var.o(ti0Var.N, 0, false, false);
                }
                if (z13) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    message2.effect = j10;
                    if (j10 == 0) {
                        message2.flags2 &= -5;
                    }
                }
                gi0 gi0Var = ti0Var.U;
                if (gi0Var != null) {
                    gi0Var.setEffect(messageObject.messageOwner.effect);
                }
                ti0Var.m(messageObject.messageOwner.effect);
            } else if (ti0Var.i0 != null) {
                long j13 = q0Var2.c;
                if (j13 == ti0Var.F) {
                    ti0Var.F = 0L;
                    z11 = true;
                } else {
                    ti0Var.F = j13;
                    z11 = false;
                }
                gi0 gi0Var2 = ti0Var.U;
                if (gi0Var2 != null) {
                    gi0Var2.setEffect(ti0Var.F);
                }
                ti0Var.m(ti0Var.F);
                if (!z13) {
                    TLRPC.TL_availableEffect effect = ti0Var.F == 0 ? null : MessagesController.getInstance(i10).getEffect(ti0Var.F);
                    org.telegram.ui.Components.j5 j5Var = ti0Var.G;
                    if (j5Var != null) {
                        if (ti0Var.F == 0 || effect == null) {
                            j5Var.g(null, true);
                        } else {
                            j5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                        }
                    }
                    ti0Var.b0.setSelectedReactionAnimated(z11 ? null : q0Var2);
                    if (ti0Var.b0.getReactionsWindow() != null && ti0Var.b0.getReactionsWindow().m != null) {
                        ng.z zVar2 = ti0Var.b0.getReactionsWindow().m;
                        if (z11) {
                            q0Var2 = null;
                        }
                        zVar2.setSelectedReaction(q0Var2);
                        ti0Var.b0.getReactionsWindow().a.invalidate();
                    }
                }
                fi0Var.c();
                if (!z11) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j14 = ti0Var.F;
                    tL_message.effect = j14;
                    if (j14 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    ti0Var.X.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z13 && (p2Var = this.a) != null) {
                new org.telegram.ui.Components.qc(ti0Var.D, ti0Var.b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new ii0(0, p2Var))).j();
            }
            ti0Var.E.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.qk0
    public final /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.qk0
    public final /* synthetic */ void j(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
