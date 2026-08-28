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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bi0 implements org.telegram.ui.Components.tj0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 a;
    public final /* synthetic */ li0 b;

    public bi0(li0 li0Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.b = li0Var;
        this.a = o2Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final void d(View view, hg.r0 r0Var, boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.ActionBar.o2 o2Var;
        boolean z13;
        long j10;
        hg.r0 r0Var2 = r0Var;
        if (r0Var2 != null) {
            li0 li0Var = this.b;
            zh0 zh0Var = li0Var.a0;
            xh0 xh0Var = li0Var.W;
            int i9 = li0Var.c;
            if (zh0Var == null) {
                return;
            }
            boolean z14 = !UserConfig.getInstance(i9).isPremium() && r0Var2.d;
            org.telegram.ui.Cells.t1 t1Var = li0Var.M;
            if (t1Var != null) {
                MessageObject messageObject = t1Var.getMessageObject();
                if (messageObject == null) {
                    return;
                }
                TLRPC.Message message = messageObject.messageOwner;
                long j11 = message.effect;
                long j12 = r0Var2.c;
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
                    li0Var.M.X3(messageObject, li0Var.l(messageObject), li0Var.J.size() > 1, false, false, false);
                    li0Var.a0.setSelectedReactionAnimated(z13 ? null : r0Var2);
                    if (li0Var.a0.getReactionsWindow() != null && li0Var.a0.getReactionsWindow().m != null) {
                        hg.z zVar = li0Var.a0.getReactionsWindow().m;
                        if (z13) {
                            r0Var2 = null;
                        }
                        zVar.setSelectedReaction(r0Var2);
                        li0Var.a0.getReactionsWindow().a.invalidate();
                    }
                }
                xh0Var.c();
                if (!z13) {
                    xh0Var.o(li0Var.M, 0, false, false);
                }
                if (z14) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    message2.effect = j10;
                    if (j10 == 0) {
                        message2.flags2 &= -5;
                    }
                }
                yh0 yh0Var = li0Var.T;
                if (yh0Var != null) {
                    yh0Var.setEffect(messageObject.messageOwner.effect);
                }
                li0Var.m(messageObject.messageOwner.effect);
            } else if (li0Var.h0 != null) {
                long j13 = r0Var2.c;
                if (j13 == li0Var.E) {
                    li0Var.E = 0L;
                    z12 = true;
                } else {
                    li0Var.E = j13;
                    z12 = false;
                }
                yh0 yh0Var2 = li0Var.T;
                if (yh0Var2 != null) {
                    yh0Var2.setEffect(li0Var.E);
                }
                li0Var.m(li0Var.E);
                if (!z14) {
                    TLRPC.TL_availableEffect effect = li0Var.E == 0 ? null : MessagesController.getInstance(i9).getEffect(li0Var.E);
                    org.telegram.ui.Components.i5 i5Var = li0Var.F;
                    if (i5Var != null) {
                        if (li0Var.E == 0 || effect == null) {
                            i5Var.g(null, true);
                        } else {
                            i5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                        }
                    }
                    li0Var.a0.setSelectedReactionAnimated(z12 ? null : r0Var2);
                    if (li0Var.a0.getReactionsWindow() != null && li0Var.a0.getReactionsWindow().m != null) {
                        hg.z zVar2 = li0Var.a0.getReactionsWindow().m;
                        if (z12) {
                            r0Var2 = null;
                        }
                        zVar2.setSelectedReaction(r0Var2);
                        li0Var.a0.getReactionsWindow().a.invalidate();
                    }
                }
                xh0Var.c();
                if (!z12) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j14 = li0Var.E;
                    tL_message.effect = j14;
                    if (j14 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    li0Var.W.d(null, 0, null, new MessageObject(i9, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z14 && (o2Var = this.a) != null) {
                new org.telegram.ui.Components.oc(li0Var.C, li0Var.b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new ai0(0, o2Var))).j();
            }
            li0Var.D.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ boolean n() {
        return true;
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ void s(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i9, boolean z10) {
    }
}
