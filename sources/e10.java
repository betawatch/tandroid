// default package

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e10 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j20 b;
    public final /* synthetic */ r47 c;
    public final /* synthetic */ fu5 d;

    public /* synthetic */ e10(j20 j20Var, fu5 fu5Var, r47 r47Var, byte b) {
        this.a = b;
        this.b = j20Var;
        this.d = fu5Var;
        this.c = r47Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList t;
        TLRPC.TL_document tL_document;
        byte b = this.a;
        fu5 fu5Var = this.d;
        r47 r47Var = this.c;
        j20 j20Var = this.b;
        switch (b) {
            case 0:
                j20Var.M0(r47Var, true, new d10(j20Var, fu5Var, (byte) 4), false);
                break;
            case 1:
                long e = yac.h(j20Var.a).e();
                int i = yac.t0;
                int i2 = j20Var.a;
                if (i != i2) {
                    j20Var.z2.N0(i2);
                }
                if (r47Var.e1() < 0) {
                    if (r47Var.F0() instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) r47Var.F0();
                        t = null;
                    }
                    fu5Var.u();
                    bs2.v(null, 2131753902, new d31((FrameLayout) j20Var.b, j20Var.J0), R.raw.saved_messages, 36);
                    break;
                } else {
                    t = qd4.t(r47Var);
                    tL_document = null;
                }
                int i3 = j20Var.a;
                if (t != null) {
                    r7a.B(i3).p0(t, e, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                } else {
                    r7a B = r7a.B(i3);
                    p7a e2 = p7a.e(tL_document, null, r47Var.k.attachPath, e, null, null, null, null, null, true, 0, 0, 0, j20Var.p2, false);
                    e = e;
                    B.q0(e2);
                }
                e Q = LaunchActivity.Q();
                if (Q != null) {
                    d31.b0(Q).Q(R.raw.forward, 36, e == yac.h(j20Var.a).e() ? ob6.M0(2131750459, null) : e > 0 ? ob6.a0(null, null, 2131750458, wf3.s(e)) : ob6.a0(null, null, 2131750463, wf3.s(e))).j();
                }
                fu5Var.u();
                bs2.v(null, 2131753902, new d31((FrameLayout) j20Var.b, j20Var.J0), R.raw.saved_messages, 36);
            case 2:
                j20Var.L0(r47Var);
                fu5Var.u();
                break;
            case 3:
                fu5Var.u();
                j20Var.H0(r47Var);
                break;
            case 4:
                fu5Var.u();
                j20Var.Q0(r47Var);
                break;
            case 5:
                j20Var.M0(r47Var, false, new e10(j20Var, r47Var, fu5Var, (byte) 8), false);
                break;
            case 6:
                fu5Var.u();
                j20Var.H0(r47Var);
                break;
            case 7:
                fu5Var.u();
                j20Var.Q0(r47Var);
                break;
            default:
                pc7 pc7Var = j20Var.p2;
                TLRPC.Document a = pc7Var.a();
                pc7Var.c.remove(r47Var);
                if (pc7Var.a() != a) {
                    pc7Var.e();
                }
                j20Var.q2.remove(r47Var);
                j20Var.t1.f();
                fu5Var.u();
                j20Var.P0(false);
                bs2.v(null, 2131753904, new d31((FrameLayout) j20Var.b, j20Var.J0), R.raw.ic_delete, 36);
                break;
        }
    }

    public /* synthetic */ e10(j20 j20Var, r47 r47Var, fu5 fu5Var, byte b) {
        this.a = b;
        this.b = j20Var;
        this.c = r47Var;
        this.d = fu5Var;
    }
}
