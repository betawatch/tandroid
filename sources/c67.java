// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class c67 implements u29 {
    public final /* synthetic */ d a;
    public final /* synthetic */ j67 b;

    public c67(j67 j67Var, d dVar) {
        this.b = j67Var;
        this.a = dVar;
    }

    @Override // u29
    public final void g(View view, k39 k39Var, boolean z, boolean z2) {
        long j;
        boolean z3;
        d dVar;
        boolean z4;
        long j2;
        k39 k39Var2 = k39Var;
        if (k39Var2 != null) {
            j67 j67Var = this.b;
            b67 b67Var = j67Var.e0;
            z57 z57Var = j67Var.a0;
            int i = j67Var.c;
            if (b67Var != null) {
                boolean z5 = !z8c.h(i).p() && k39Var2.d;
                rc2 rc2Var = j67Var.Q;
                if (rc2Var != null) {
                    k47 messageObject = rc2Var.getMessageObject();
                    if (messageObject == null) {
                        return;
                    }
                    TLRPC.Message message = messageObject.k;
                    long j3 = message.effect;
                    long j4 = k39Var2.c;
                    int i2 = message.flags2;
                    if (j4 == j3) {
                        message.flags2 = i2 & (-5);
                        message.effect = 0L;
                        z4 = true;
                    } else {
                        message.flags2 = i2 | 4;
                        message.effect = j4;
                        z4 = false;
                    }
                    if (z5) {
                        j2 = j3;
                    } else {
                        j2 = j3;
                        j67Var.Q.z3(messageObject, j67Var.j(messageObject), j67Var.N.size() > 1, false, false, false);
                        j67Var.e0.setSelectedReactionAnimated(z4 ? null : k39Var2);
                        if (j67Var.e0.getReactionsWindow() != null && j67Var.e0.getReactionsWindow().m != null) {
                            t53 t53Var = j67Var.e0.getReactionsWindow().m;
                            if (z4) {
                                k39Var2 = null;
                            }
                            t53Var.setSelectedReaction(k39Var2);
                            j67Var.e0.getReactionsWindow().a.invalidate();
                        }
                    }
                    z57Var.c();
                    if (!z4) {
                        z57Var.n(j67Var.Q, 0, false, false);
                    }
                    if (z5) {
                        TLRPC.Message message2 = messageObject.k;
                        message2.effect = j2;
                        if (j2 == 0) {
                            message2.flags2 &= -5;
                        }
                    }
                    a67 a67Var = j67Var.X;
                    if (a67Var != null) {
                        a67Var.setEffect(messageObject.k.effect);
                    }
                    j67Var.m(messageObject.k.effect);
                } else if (j67Var.l0 != null) {
                    long j5 = k39Var2.c;
                    if (j5 == j67Var.I) {
                        j67Var.I = 0L;
                        z3 = true;
                        j = 0;
                    } else {
                        j67Var.I = j5;
                        j = j5;
                        z3 = false;
                    }
                    a67 a67Var2 = j67Var.X;
                    if (a67Var2 != null) {
                        a67Var2.setEffect(j);
                    }
                    j67Var.m(j67Var.I);
                    if (!z5) {
                        TLRPC.TL_availableEffect Y0 = j67Var.I == 0 ? null : oc7.r1(i).Y0(j67Var.I);
                        tm tmVar = j67Var.J;
                        if (tmVar != null) {
                            if (j67Var.I == 0 || Y0 == null) {
                                tmVar.g(null, true);
                            } else {
                                tmVar.g(gw3.g(Y0.emoticon), true);
                            }
                        }
                        j67Var.e0.setSelectedReactionAnimated(z3 ? null : k39Var2);
                        if (j67Var.e0.getReactionsWindow() != null && j67Var.e0.getReactionsWindow().m != null) {
                            t53 t53Var2 = j67Var.e0.getReactionsWindow().m;
                            if (z3) {
                                k39Var2 = null;
                            }
                            t53Var2.setSelectedReaction(k39Var2);
                            j67Var.e0.getReactionsWindow().a.invalidate();
                        }
                    }
                    z57Var.c();
                    if (!z3) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j6 = j67Var.I;
                        tL_message.effect = j6;
                        if (j6 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        j67Var.a0.d(null, 0, null, new k47(i, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z5 && (dVar = this.a) != null) {
                    new c41(j67Var.G, j67Var.b).Q(R.raw.star_premium_2, 36, gm.N2(jb6.M0(2131754218, null), -1, 2, new ww1(dVar, (byte) 3), null)).j();
                }
                j67Var.H.invalidate();
            }
        }
    }

    @Override // u29
    public final boolean h() {
        return true;
    }

    @Override // u29
    public final boolean l() {
        return false;
    }

    @Override // u29
    public final boolean s() {
        return false;
    }

    @Override // u29
    public final void o() {
    }

    @Override // u29
    public final void m(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
