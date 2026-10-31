package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dh0 implements org.telegram.ui.Components.lj0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 a;
    public final /* synthetic */ kh0 b;

    public dh0(kh0 kh0Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.b = kh0Var;
        this.a = k2Var;
    }

    @Override // org.telegram.ui.Components.lj0
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.lj0
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.lj0
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Components.lj0
    public final void x(View view, sg.o0 o0Var, boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.ActionBar.k2 k2Var;
        boolean z13;
        long j10;
        long j11;
        sg.o0 o0Var2 = o0Var;
        if (o0Var2 != null) {
            kh0 kh0Var = this.b;
            bh0 bh0Var = kh0Var.d0;
            zg0 zg0Var = kh0Var.Z;
            int i10 = kh0Var.c;
            if (bh0Var == null) {
                return;
            }
            int i11 = 0;
            boolean z14 = !org.telegram.messenger.d20.i(i10).q() && o0Var2.d;
            org.telegram.ui.Cells.q1 q1Var = kh0Var.P;
            if (q1Var != null) {
                org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
                if (messageObject == null) {
                    return;
                }
                TLRPC.Message message = messageObject.k;
                long j12 = message.effect;
                long j13 = o0Var2.c;
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
                    kh0Var.P.s3(messageObject, kh0Var.k(messageObject), kh0Var.M.size() > 1, false, false, false);
                    kh0Var.d0.setSelectedReactionAnimated(z13 ? null : o0Var2);
                    if (kh0Var.d0.getReactionsWindow() != null && kh0Var.d0.getReactionsWindow().m != null) {
                        sg.w wVar = kh0Var.d0.getReactionsWindow().m;
                        if (z13) {
                            o0Var2 = null;
                        }
                        wVar.setSelectedReaction(o0Var2);
                        kh0Var.d0.getReactionsWindow().a.invalidate();
                    }
                }
                zg0Var.c();
                if (!z13) {
                    zg0Var.n(kh0Var.P, 0, false, false);
                }
                if (z14) {
                    TLRPC.Message message2 = messageObject.k;
                    message2.effect = j11;
                    if (j11 == j10) {
                        message2.flags2 &= -5;
                    }
                }
                ah0 ah0Var = kh0Var.W;
                if (ah0Var != null) {
                    ah0Var.setEffect(messageObject.k.effect);
                }
                kh0Var.l(messageObject.k.effect);
            } else if (kh0Var.k0 != null) {
                long j14 = o0Var2.c;
                if (j14 == kh0Var.H) {
                    kh0Var.H = 0L;
                    z12 = true;
                } else {
                    kh0Var.H = j14;
                    z12 = false;
                }
                ah0 ah0Var2 = kh0Var.W;
                if (ah0Var2 != null) {
                    ah0Var2.setEffect(kh0Var.H);
                }
                kh0Var.l(kh0Var.H);
                if (!z14) {
                    TLRPC.TL_availableEffect Y0 = kh0Var.H == 0 ? null : org.telegram.messenger.vp.r1(i10).Y0(kh0Var.H);
                    org.telegram.ui.Components.d5 d5Var = kh0Var.I;
                    if (d5Var != null) {
                        if (kh0Var.H == 0 || Y0 == null) {
                            d5Var.g(null, true);
                        } else {
                            d5Var.g(org.telegram.messenger.k6.g(Y0.emoticon), true);
                        }
                    }
                    kh0Var.d0.setSelectedReactionAnimated(z12 ? null : o0Var2);
                    if (kh0Var.d0.getReactionsWindow() != null && kh0Var.d0.getReactionsWindow().m != null) {
                        sg.w wVar2 = kh0Var.d0.getReactionsWindow().m;
                        if (z12) {
                            o0Var2 = null;
                        }
                        wVar2.setSelectedReaction(o0Var2);
                        kh0Var.d0.getReactionsWindow().a.invalidate();
                    }
                }
                zg0Var.c();
                if (!z12) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j15 = kh0Var.H;
                    tL_message.effect = j15;
                    if (j15 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    kh0Var.Z.d(null, 0, null, new org.telegram.messenger.jj(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z14 && (k2Var = this.a) != null) {
                new org.telegram.ui.Components.cc(kh0Var.F, kh0Var.b).Q(R.raw.star_premium_2, 36, org.telegram.messenger.i0.x2(org.telegram.messenger.cd.L0(2131754253, null), new ch0(i11, k2Var))).j();
            }
            kh0Var.G.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.lj0
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.Components.lj0
    public final /* synthetic */ void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
