// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class c47 implements s09 {
    public final /* synthetic */ d a;
    public final /* synthetic */ j47 b;

    public c47(j47 j47Var, d dVar) {
        this.b = j47Var;
        this.a = dVar;
    }

    @Override // s09
    public final boolean C() {
        return false;
    }

    @Override // s09
    public final void q(View view, h19 h19Var, boolean z, boolean z2) {
        long j;
        boolean z3;
        d dVar;
        boolean z4;
        long j2;
        h19 h19Var2 = h19Var;
        if (h19Var2 != null) {
            j47 j47Var = this.b;
            b47 b47Var = j47Var.e0;
            z37 z37Var = j47Var.a0;
            int i = j47Var.c;
            if (b47Var != null) {
                boolean z5 = !y6c.h(i).p() && h19Var2.d;
                gb2 gb2Var = j47Var.Q;
                if (gb2Var != null) {
                    k27 messageObject = gb2Var.getMessageObject();
                    if (messageObject == null) {
                        return;
                    }
                    TLRPC.Message message = messageObject.k;
                    long j3 = message.effect;
                    long j4 = h19Var2.c;
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
                        j47Var.Q.z3(messageObject, j47Var.j(messageObject), j47Var.N.size() > 1, false, false, false);
                        j47Var.e0.setSelectedReactionAnimated(z4 ? null : h19Var2);
                        if (j47Var.e0.getReactionsWindow() != null && j47Var.e0.getReactionsWindow().m != null) {
                            i43 i43Var = j47Var.e0.getReactionsWindow().m;
                            if (z4) {
                                h19Var2 = null;
                            }
                            i43Var.setSelectedReaction(h19Var2);
                            j47Var.e0.getReactionsWindow().a.invalidate();
                        }
                    }
                    z37Var.c();
                    if (!z4) {
                        z37Var.n(j47Var.Q, 0, false, false);
                    }
                    if (z5) {
                        TLRPC.Message message2 = messageObject.k;
                        message2.effect = j2;
                        if (j2 == 0) {
                            message2.flags2 &= -5;
                        }
                    }
                    a47 a47Var = j47Var.X;
                    if (a47Var != null) {
                        a47Var.setEffect(messageObject.k.effect);
                    }
                    j47Var.m(messageObject.k.effect);
                } else if (j47Var.l0 != null) {
                    long j5 = h19Var2.c;
                    if (j5 == j47Var.I) {
                        j47Var.I = 0L;
                        z3 = true;
                        j = 0;
                    } else {
                        j47Var.I = j5;
                        j = j5;
                        z3 = false;
                    }
                    a47 a47Var2 = j47Var.X;
                    if (a47Var2 != null) {
                        a47Var2.setEffect(j);
                    }
                    j47Var.m(j47Var.I);
                    if (!z5) {
                        TLRPC.TL_availableEffect X0 = j47Var.I == 0 ? null : na7.q1(i).X0(j47Var.I);
                        tl tlVar = j47Var.J;
                        if (tlVar != null) {
                            if (j47Var.I == 0 || X0 == null) {
                                tlVar.g(null, true);
                            } else {
                                tlVar.g(vu3.g(X0.emoticon), true);
                            }
                        }
                        j47Var.e0.setSelectedReactionAnimated(z3 ? null : h19Var2);
                        if (j47Var.e0.getReactionsWindow() != null && j47Var.e0.getReactionsWindow().m != null) {
                            i43 i43Var2 = j47Var.e0.getReactionsWindow().m;
                            if (z3) {
                                h19Var2 = null;
                            }
                            i43Var2.setSelectedReaction(h19Var2);
                            j47Var.e0.getReactionsWindow().a.invalidate();
                        }
                    }
                    z37Var.c();
                    if (!z3) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j6 = j47Var.I;
                        tL_message.effect = j6;
                        if (j6 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        j47Var.a0.d(null, 0, null, new k27(i, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z5 && (dVar = this.a) != null) {
                    new u21(j47Var.G, j47Var.b).Q(R.raw.star_premium_2, 36, gl.N2(k96.M0(2131754250, null), -1, 2, new kv1(dVar, (byte) 3), null)).j();
                }
                j47Var.H.invalidate();
            }
        }
    }

    @Override // s09
    public final boolean r() {
        return true;
    }

    @Override // s09
    public final boolean u() {
        return false;
    }

    @Override // s09
    public final void A() {
    }

    @Override // s09
    public final void x(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
