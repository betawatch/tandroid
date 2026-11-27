// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class j67 implements h49 {
    public final /* synthetic */ e a;
    public final /* synthetic */ q67 b;

    public j67(q67 q67Var, e eVar) {
        this.b = q67Var;
        this.a = eVar;
    }

    @Override // h49
    public final void e(View view, w49 w49Var, boolean z, boolean z2) {
        long j;
        boolean z3;
        e eVar;
        boolean z4;
        long j2;
        w49 w49Var2 = w49Var;
        if (w49Var2 != null) {
            q67 q67Var = this.b;
            i67 i67Var = q67Var.e0;
            g67 g67Var = q67Var.a0;
            int i = q67Var.c;
            if (i67Var != null) {
                boolean z5 = !yac.h(i).p() && w49Var2.d;
                wb2 wb2Var = q67Var.Q;
                if (wb2Var != null) {
                    r47 messageObject = wb2Var.getMessageObject();
                    if (messageObject == null) {
                        return;
                    }
                    TLRPC.Message message = messageObject.k;
                    long j3 = message.effect;
                    long j4 = w49Var2.c;
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
                        q67Var.Q.z3(messageObject, q67Var.j(messageObject), q67Var.N.size() > 1, false, false, false);
                        q67Var.e0.setSelectedReactionAnimated(z4 ? null : w49Var2);
                        if (q67Var.e0.getReactionsWindow() != null && q67Var.e0.getReactionsWindow().m != null) {
                            a53 a53Var = q67Var.e0.getReactionsWindow().m;
                            if (z4) {
                                w49Var2 = null;
                            }
                            a53Var.setSelectedReaction(w49Var2);
                            q67Var.e0.getReactionsWindow().a.invalidate();
                        }
                    }
                    g67Var.c();
                    if (!z4) {
                        g67Var.n(q67Var.Q, 0, false, false);
                    }
                    if (z5) {
                        TLRPC.Message message2 = messageObject.k;
                        message2.effect = j2;
                        if (j2 == 0) {
                            message2.flags2 &= -5;
                        }
                    }
                    h67 h67Var = q67Var.X;
                    if (h67Var != null) {
                        h67Var.setEffect(messageObject.k.effect);
                    }
                    q67Var.m(messageObject.k.effect);
                } else if (q67Var.l0 != null) {
                    long j5 = w49Var2.c;
                    if (j5 == q67Var.I) {
                        q67Var.I = 0L;
                        z3 = true;
                        j = 0;
                    } else {
                        q67Var.I = j5;
                        j = j5;
                        z3 = false;
                    }
                    h67 h67Var2 = q67Var.X;
                    if (h67Var2 != null) {
                        h67Var2.setEffect(j);
                    }
                    q67Var.m(q67Var.I);
                    if (!z5) {
                        TLRPC.TL_availableEffect Z0 = q67Var.I == 0 ? null : uc7.s1(i).Z0(q67Var.I);
                        ul ulVar = q67Var.J;
                        if (ulVar != null) {
                            if (q67Var.I == 0 || Z0 == null) {
                                ulVar.g(null, true);
                            } else {
                                ulVar.g(pv3.g(Z0.emoticon), true);
                            }
                        }
                        q67Var.e0.setSelectedReactionAnimated(z3 ? null : w49Var2);
                        if (q67Var.e0.getReactionsWindow() != null && q67Var.e0.getReactionsWindow().m != null) {
                            a53 a53Var2 = q67Var.e0.getReactionsWindow().m;
                            if (z3) {
                                w49Var2 = null;
                            }
                            a53Var2.setSelectedReaction(w49Var2);
                            q67Var.e0.getReactionsWindow().a.invalidate();
                        }
                    }
                    g67Var.c();
                    if (!z3) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j6 = q67Var.I;
                        tL_message.effect = j6;
                        if (j6 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        q67Var.a0.d(null, 0, null, new r47(i, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z5 && (eVar = this.a) != null) {
                    new d31(q67Var.G, q67Var.b).Q(R.raw.star_premium_2, 36, hl.N2(ob6.M0(2131754246, null), -1, 2, new yv1(eVar, (byte) 3), null)).j();
                }
                q67Var.H.invalidate();
            }
        }
    }

    @Override // h49
    public final boolean j() {
        return true;
    }

    @Override // h49
    public final boolean k() {
        return false;
    }

    @Override // h49
    public final boolean p() {
        return false;
    }

    @Override // h49
    public final void n() {
    }

    @Override // h49
    public final void m(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
