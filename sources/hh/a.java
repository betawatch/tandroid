package hh;

import c8.g0;
import gh.d;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.qc;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements d {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;

    public /* synthetic */ a(int i7, e6 e6Var) {
        this.a = i7;
        this.b = e6Var;
    }

    @Override // gh.d
    public final int j(e6 e6Var, boolean z10) {
        switch (this.a) {
            case 0:
                if (g0.c(m10.t0, this.b)) {
                    return j6.r1(qc.e(262144) ? 0.85f : 0.76f, j6.w0(j6.Je, e6Var));
                }
                return i0.a.o(j6.w0(j6.Je, e6Var), ns.e4);
            case 1:
                if (g0.c(m10.t0, this.b)) {
                    return j6.r1(qc.e(262144) ? 0.85f : 0.76f, j6.w0(j6.Te, e6Var));
                }
                return i0.a.o(j6.w0(z10 ? j6.s8 : j6.Te, e6Var), ns.e4);
            default:
                if (g0.c(m10.t0, this.b)) {
                    return j6.r1(qc.e(262144) ? 0.85f : 0.76f, j6.w0(j6.Te, e6Var));
                }
                return i0.a.o(j6.w0(z10 ? j6.s8 : j6.Te, e6Var), ns.e4);
        }
    }
}
