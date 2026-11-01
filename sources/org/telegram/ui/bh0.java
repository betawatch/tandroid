package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class bh0 implements org.telegram.ui.Components.mj0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 a;
    public final /* synthetic */ ih0 b;

    public bh0(ih0 ih0Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.b = ih0Var;
        this.a = k2Var;
    }

    @Override // org.telegram.ui.Components.mj0
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.mj0
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.mj0
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Components.mj0
    public final void x(View view, sg.o0 o0Var, boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.ActionBar.k2 k2Var;
        boolean z13;
        long j10;
        long j11;
        sg.o0 o0Var2 = o0Var;
        if (o0Var2 != null) {
            ih0 ih0Var = this.b;
            zg0 zg0Var = ih0Var.d0;
            xg0 xg0Var = ih0Var.Z;
            int i10 = ih0Var.c;
            if (zg0Var == null) {
                return;
            }
            int i11 = 0;
            boolean z14 = !org.telegram.messenger.e20.i(i10).q() && o0Var2.d;
            org.telegram.ui.Cells.q1 q1Var = ih0Var.P;
            if (q1Var != null) {
                org.telegram.messenger.kj messageObject = q1Var.getMessageObject();
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
                    ih0Var.P.s3(messageObject, ih0Var.k(messageObject), ih0Var.M.size() > 1, false, false, false);
                    ih0Var.d0.setSelectedReactionAnimated(z13 ? null : o0Var2);
                    if (ih0Var.d0.getReactionsWindow() != null && ih0Var.d0.getReactionsWindow().m != null) {
                        sg.w wVar = ih0Var.d0.getReactionsWindow().m;
                        if (z13) {
                            o0Var2 = null;
                        }
                        wVar.setSelectedReaction(o0Var2);
                        ih0Var.d0.getReactionsWindow().a.invalidate();
                    }
                }
                xg0Var.c();
                if (!z13) {
                    xg0Var.n(ih0Var.P, 0, false, false);
                }
                if (z14) {
                    TLRPC.Message message2 = messageObject.k;
                    message2.effect = j11;
                    if (j11 == j10) {
                        message2.flags2 &= -5;
                    }
                }
                yg0 yg0Var = ih0Var.W;
                if (yg0Var != null) {
                    yg0Var.setEffect(messageObject.k.effect);
                }
                ih0Var.l(messageObject.k.effect);
            } else if (ih0Var.k0 != null) {
                long j14 = o0Var2.c;
                if (j14 == ih0Var.H) {
                    ih0Var.H = 0L;
                    z12 = true;
                } else {
                    ih0Var.H = j14;
                    z12 = false;
                }
                yg0 yg0Var2 = ih0Var.W;
                if (yg0Var2 != null) {
                    yg0Var2.setEffect(ih0Var.H);
                }
                ih0Var.l(ih0Var.H);
                if (!z14) {
                    TLRPC.TL_availableEffect Y0 = ih0Var.H == 0 ? null : org.telegram.messenger.wp.r1(i10).Y0(ih0Var.H);
                    org.telegram.ui.Components.d5 d5Var = ih0Var.I;
                    if (d5Var != null) {
                        if (ih0Var.H == 0 || Y0 == null) {
                            d5Var.g(null, true);
                        } else {
                            d5Var.g(org.telegram.messenger.k6.g(Y0.emoticon), true);
                        }
                    }
                    ih0Var.d0.setSelectedReactionAnimated(z12 ? null : o0Var2);
                    if (ih0Var.d0.getReactionsWindow() != null && ih0Var.d0.getReactionsWindow().m != null) {
                        sg.w wVar2 = ih0Var.d0.getReactionsWindow().m;
                        if (z12) {
                            o0Var2 = null;
                        }
                        wVar2.setSelectedReaction(o0Var2);
                        ih0Var.d0.getReactionsWindow().a.invalidate();
                    }
                }
                xg0Var.c();
                if (!z12) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j15 = ih0Var.H;
                    tL_message.effect = j15;
                    if (j15 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    ih0Var.Z.d(null, 0, null, new org.telegram.messenger.kj(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z14 && (k2Var = this.a) != null) {
                new org.telegram.ui.Components.cc(ih0Var.F, ih0Var.b).Q(R.raw.star_premium_2, 36, org.telegram.messenger.i0.x2(org.telegram.messenger.dd.L0(2131754253, null), new ah0(i11, k2Var))).j();
            }
            ih0Var.G.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.mj0
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.Components.mj0
    public final /* synthetic */ void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
