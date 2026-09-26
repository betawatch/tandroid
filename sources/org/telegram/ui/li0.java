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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class li0 implements org.telegram.ui.Components.pk0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 a;
    public final /* synthetic */ vi0 b;

    public li0(vi0 vi0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.b = vi0Var;
        this.a = m2Var;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.ActionBar.m2 m2Var;
        boolean z13;
        long j3;
        zg.o0 o0Var2 = o0Var;
        if (o0Var2 != null) {
            vi0 vi0Var = this.b;
            ji0 ji0Var = vi0Var.e0;
            hi0 hi0Var = vi0Var.a0;
            int i10 = vi0Var.c;
            if (ji0Var == null) {
                return;
            }
            boolean z14 = !UserConfig.getInstance(i10).isPremium() && o0Var2.d;
            org.telegram.ui.Cells.u1 u1Var = vi0Var.Q;
            if (u1Var != null) {
                MessageObject messageObject = u1Var.getMessageObject();
                if (messageObject == null) {
                    return;
                }
                TLRPC.Message message = messageObject.messageOwner;
                long j10 = message.effect;
                long j11 = o0Var2.c;
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
                    vi0Var.Q.X3(messageObject, vi0Var.l(messageObject), vi0Var.N.size() > 1, false, false, false);
                    vi0Var.e0.setSelectedReactionAnimated(z13 ? null : o0Var2);
                    if (vi0Var.e0.getReactionsWindow() != null && vi0Var.e0.getReactionsWindow().m != null) {
                        zg.x xVar = vi0Var.e0.getReactionsWindow().m;
                        if (z13) {
                            o0Var2 = null;
                        }
                        xVar.setSelectedReaction(o0Var2);
                        vi0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                hi0Var.c();
                if (!z13) {
                    hi0Var.o(vi0Var.Q, 0, false, false);
                }
                if (z14) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    message2.effect = j3;
                    if (j3 == 0) {
                        message2.flags2 &= -5;
                    }
                }
                ii0 ii0Var = vi0Var.X;
                if (ii0Var != null) {
                    ii0Var.setEffect(messageObject.messageOwner.effect);
                }
                vi0Var.m(messageObject.messageOwner.effect);
            } else if (vi0Var.l0 != null) {
                long j12 = o0Var2.c;
                if (j12 == vi0Var.I) {
                    vi0Var.I = 0L;
                    z12 = true;
                } else {
                    vi0Var.I = j12;
                    z12 = false;
                }
                ii0 ii0Var2 = vi0Var.X;
                if (ii0Var2 != null) {
                    ii0Var2.setEffect(vi0Var.I);
                }
                vi0Var.m(vi0Var.I);
                if (!z14) {
                    TLRPC.TL_availableEffect effect = vi0Var.I == 0 ? null : MessagesController.getInstance(i10).getEffect(vi0Var.I);
                    org.telegram.ui.Components.o5 o5Var = vi0Var.J;
                    if (o5Var != null) {
                        if (vi0Var.I == 0 || effect == null) {
                            o5Var.g(null, true);
                        } else {
                            o5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                        }
                    }
                    vi0Var.e0.setSelectedReactionAnimated(z12 ? null : o0Var2);
                    if (vi0Var.e0.getReactionsWindow() != null && vi0Var.e0.getReactionsWindow().m != null) {
                        zg.x xVar2 = vi0Var.e0.getReactionsWindow().m;
                        if (z12) {
                            o0Var2 = null;
                        }
                        xVar2.setSelectedReaction(o0Var2);
                        vi0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                hi0Var.c();
                if (!z12) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j13 = vi0Var.I;
                    tL_message.effect = j13;
                    if (j13 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    vi0Var.a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z14 && (m2Var = this.a) != null) {
                new org.telegram.ui.Components.xc(vi0Var.G, vi0Var.b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new ki0(0, m2Var))).j();
            }
            vi0Var.H.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
