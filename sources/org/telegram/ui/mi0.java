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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class mi0 implements org.telegram.ui.Components.fk0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ wi0 b;

    public mi0(wi0 wi0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.b = wi0Var;
        this.a = n2Var;
    }

    @Override // org.telegram.ui.Components.fk0
    public final void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z13;
        long j3;
        zg.p0 p0Var2 = p0Var;
        if (p0Var2 != null) {
            wi0 wi0Var = this.b;
            ki0 ki0Var = wi0Var.e0;
            ii0 ii0Var = wi0Var.a0;
            int i10 = wi0Var.c;
            if (ki0Var == null) {
                return;
            }
            boolean z14 = !UserConfig.getInstance(i10).isPremium() && p0Var2.d;
            org.telegram.ui.Cells.t1 t1Var = wi0Var.Q;
            if (t1Var != null) {
                MessageObject messageObject = t1Var.getMessageObject();
                if (messageObject == null) {
                    return;
                }
                TLRPC.Message message = messageObject.messageOwner;
                long j10 = message.effect;
                long j11 = p0Var2.c;
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
                    wi0Var.Q.X3(messageObject, wi0Var.l(messageObject), wi0Var.N.size() > 1, false, false, false);
                    wi0Var.e0.setSelectedReactionAnimated(z13 ? null : p0Var2);
                    if (wi0Var.e0.getReactionsWindow() != null && wi0Var.e0.getReactionsWindow().m != null) {
                        zg.y yVar = wi0Var.e0.getReactionsWindow().m;
                        if (z13) {
                            p0Var2 = null;
                        }
                        yVar.setSelectedReaction(p0Var2);
                        wi0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                ii0Var.c();
                if (!z13) {
                    ii0Var.o(wi0Var.Q, 0, false, false);
                }
                if (z14) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    message2.effect = j3;
                    if (j3 == 0) {
                        message2.flags2 &= -5;
                    }
                }
                ji0 ji0Var = wi0Var.X;
                if (ji0Var != null) {
                    ji0Var.setEffect(messageObject.messageOwner.effect);
                }
                wi0Var.m(messageObject.messageOwner.effect);
            } else if (wi0Var.l0 != null) {
                long j12 = p0Var2.c;
                if (j12 == wi0Var.I) {
                    wi0Var.I = 0L;
                    z12 = true;
                } else {
                    wi0Var.I = j12;
                    z12 = false;
                }
                ji0 ji0Var2 = wi0Var.X;
                if (ji0Var2 != null) {
                    ji0Var2.setEffect(wi0Var.I);
                }
                wi0Var.m(wi0Var.I);
                if (!z14) {
                    TLRPC.TL_availableEffect effect = wi0Var.I == 0 ? null : MessagesController.getInstance(i10).getEffect(wi0Var.I);
                    org.telegram.ui.Components.o5 o5Var = wi0Var.J;
                    if (o5Var != null) {
                        if (wi0Var.I == 0 || effect == null) {
                            o5Var.g(null, true);
                        } else {
                            o5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                        }
                    }
                    wi0Var.e0.setSelectedReactionAnimated(z12 ? null : p0Var2);
                    if (wi0Var.e0.getReactionsWindow() != null && wi0Var.e0.getReactionsWindow().m != null) {
                        zg.y yVar2 = wi0Var.e0.getReactionsWindow().m;
                        if (z12) {
                            p0Var2 = null;
                        }
                        yVar2.setSelectedReaction(p0Var2);
                        wi0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                ii0Var.c();
                if (!z12) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j13 = wi0Var.I;
                    tL_message.effect = j13;
                    if (j13 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    wi0Var.a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z14 && (n2Var = this.a) != null) {
                new org.telegram.ui.Components.xc(wi0Var.G, wi0Var.b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new li0(0, n2Var))).j();
            }
            wi0Var.H.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.fk0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.fk0
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.fk0
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.fk0
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.fk0
    public final /* synthetic */ void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
