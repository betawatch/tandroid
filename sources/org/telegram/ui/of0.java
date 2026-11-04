package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class of0 implements org.telegram.ui.Components.ki0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 a;
    public final /* synthetic */ vf0 b;

    public of0(vf0 vf0Var, org.telegram.ui.ActionBar.d2 d2Var) {
        this.b = vf0Var;
        this.a = d2Var;
    }

    @Override // org.telegram.ui.Components.ki0
    public final /* synthetic */ boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.ki0
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // org.telegram.ui.Components.ki0
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Components.ki0
    public final void z(View view, dh.n0 n0Var, boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.ActionBar.d2 d2Var;
        boolean z13;
        long j10;
        long j11;
        dh.n0 n0Var2 = n0Var;
        if (n0Var2 != null) {
            vf0 vf0Var = this.b;
            mf0 mf0Var = vf0Var.e0;
            kf0 kf0Var = vf0Var.a0;
            int i3 = vf0Var.c;
            if (mf0Var == null) {
                return;
            }
            int i10 = 0;
            boolean z14 = !org.telegram.messenger.h10.i(i3).q() && n0Var2.d;
            org.telegram.ui.Cells.q1 q1Var = vf0Var.Q;
            if (q1Var != null) {
                org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
                if (messageObject == null) {
                    return;
                }
                TLRPC.Message message = messageObject.k;
                long j12 = message.effect;
                long j13 = n0Var2.c;
                if (j13 == j12) {
                    message.flags2 &= -5;
                    message.effect = 0L;
                    z13 = true;
                } else {
                    message.flags2 |= 4;
                    message.effect = j13;
                    z13 = false;
                }
                if (z14) {
                    j10 = 0;
                    j11 = j12;
                } else {
                    j10 = 0;
                    j11 = j12;
                    vf0Var.Q.u3(messageObject, vf0Var.k(messageObject), vf0Var.N.size() > 1, false, false, false);
                    vf0Var.e0.setSelectedReactionAnimated(z13 ? null : n0Var2);
                    if (vf0Var.e0.getReactionsWindow() != null && vf0Var.e0.getReactionsWindow().m != null) {
                        dh.v vVar = vf0Var.e0.getReactionsWindow().m;
                        if (z13) {
                            n0Var2 = null;
                        }
                        vVar.setSelectedReaction(n0Var2);
                        vf0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                kf0Var.c();
                if (!z13) {
                    kf0Var.n(vf0Var.Q, 0, false, false);
                }
                if (z14) {
                    TLRPC.Message message2 = messageObject.k;
                    message2.effect = j11;
                    if (j11 == j10) {
                        message2.flags2 &= -5;
                    }
                }
                lf0 lf0Var = vf0Var.X;
                if (lf0Var != null) {
                    lf0Var.setEffect(messageObject.k.effect);
                }
                vf0Var.l(messageObject.k.effect);
            } else if (vf0Var.l0 != null) {
                long j14 = n0Var2.c;
                if (j14 == vf0Var.I) {
                    vf0Var.I = 0L;
                    z12 = true;
                } else {
                    vf0Var.I = j14;
                    z12 = false;
                }
                lf0 lf0Var2 = vf0Var.X;
                if (lf0Var2 != null) {
                    lf0Var2.setEffect(vf0Var.I);
                }
                vf0Var.l(vf0Var.I);
                if (!z14) {
                    TLRPC.TL_availableEffect Z0 = vf0Var.I == 0 ? null : org.telegram.messenger.hp.s1(i3).Z0(vf0Var.I);
                    org.telegram.ui.Components.e5 e5Var = vf0Var.J;
                    if (e5Var != null) {
                        if (vf0Var.I == 0 || Z0 == null) {
                            e5Var.g(null, true);
                        } else {
                            e5Var.g(org.telegram.messenger.i6.g(Z0.emoticon), true);
                        }
                    }
                    vf0Var.e0.setSelectedReactionAnimated(z12 ? null : n0Var2);
                    if (vf0Var.e0.getReactionsWindow() != null && vf0Var.e0.getReactionsWindow().m != null) {
                        dh.v vVar2 = vf0Var.e0.getReactionsWindow().m;
                        if (z12) {
                            n0Var2 = null;
                        }
                        vVar2.setSelectedReaction(n0Var2);
                        vf0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                kf0Var.c();
                if (!z12) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j15 = vf0Var.I;
                    tL_message.effect = j15;
                    if (j15 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    vf0Var.a0.d(null, 0, null, new org.telegram.messenger.zi(i3, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z14 && (d2Var = this.a) != null) {
                new org.telegram.ui.Components.fc(vf0Var.G, vf0Var.b).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.bd.M0(2131754253, null), new nf0(i10, d2Var))).j();
            }
            vf0Var.H.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.ki0
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.Components.ki0
    public final /* synthetic */ void E(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i3, boolean z10) {
    }
}
