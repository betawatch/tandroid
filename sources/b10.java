// default package

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class b10 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i20 b;
    public final /* synthetic */ cs5 c;
    public final /* synthetic */ k27 d;

    public /* synthetic */ b10(i20 i20Var, cs5 cs5Var, k27 k27Var, byte b) {
        this.a = b;
        this.b = i20Var;
        this.c = cs5Var;
        this.d = k27Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList t;
        TLRPC.TL_document tL_document;
        byte b = this.a;
        cs5 cs5Var = this.c;
        k27 k27Var = this.d;
        i20 i20Var = this.b;
        switch (b) {
            case 0:
                cs5Var.u();
                i20Var.G0(k27Var);
                break;
            case 1:
                cs5Var.u();
                i20Var.P0(k27Var);
                break;
            case 2:
                i20Var.L0(k27Var, false, new b10(i20Var, k27Var, cs5Var, (byte) 5), false);
                break;
            case 3:
                cs5Var.u();
                i20Var.G0(k27Var);
                break;
            case 4:
                cs5Var.u();
                i20Var.P0(k27Var);
                break;
            case 5:
                ia7 ia7Var = i20Var.p2;
                TLRPC.Document a = ia7Var.a();
                ia7Var.c.remove(k27Var);
                if (ia7Var.a() != a) {
                    ia7Var.e();
                }
                i20Var.q2.remove(k27Var);
                i20Var.t1.f();
                cs5Var.u();
                i20Var.O0(false);
                ir2.v(null, 2131753908, new u21((FrameLayout) i20Var.b, i20Var.J0), R.raw.ic_delete, 36);
                break;
            case 6:
                i20Var.L0(k27Var, true, new d10(i20Var, cs5Var, (byte) 4), false);
                break;
            case 7:
                long e = y6c.h(i20Var.a).e();
                int i = y6c.t0;
                int i2 = i20Var.a;
                if (i != i2) {
                    i20Var.z2.N0(i2);
                }
                if (k27Var.e1() < 0) {
                    if (k27Var.F0() instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) k27Var.F0();
                        t = null;
                    }
                    cs5Var.u();
                    ir2.v(null, 2131753906, new u21((FrameLayout) i20Var.b, i20Var.J0), R.raw.saved_messages, 36);
                    break;
                } else {
                    t = tb4.t(k27Var);
                    tL_document = null;
                }
                int i3 = i20Var.a;
                if (t != null) {
                    z3a.B(i3).p0(t, e, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                } else {
                    z3a B = z3a.B(i3);
                    x3a e2 = x3a.e(tL_document, null, k27Var.k.attachPath, e, null, null, null, null, null, true, 0, 0, 0, i20Var.p2, false);
                    e = e;
                    B.q0(e2);
                }
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    u21.b0(Q).Q(R.raw.forward, 36, e == y6c.h(i20Var.a).e() ? k96.M0(2131750482, null) : e > 0 ? k96.a0(null, null, 2131750481, cf3.s(e)) : k96.a0(null, null, 2131750486, cf3.s(e))).j();
                }
                cs5Var.u();
                ir2.v(null, 2131753906, new u21((FrameLayout) i20Var.b, i20Var.J0), R.raw.saved_messages, 36);
            default:
                i20Var.K0(k27Var);
                cs5Var.u();
                break;
        }
    }

    public /* synthetic */ b10(i20 i20Var, k27 k27Var, cs5 cs5Var, byte b) {
        this.a = b;
        this.b = i20Var;
        this.d = k27Var;
        this.c = cs5Var;
    }
}
