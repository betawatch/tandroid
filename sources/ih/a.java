package ih;

import b8.cd;
import hh.d;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.lc;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements d {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;

    public /* synthetic */ a(int i3, e6 e6Var) {
        this.a = i3;
        this.b = e6Var;
    }

    @Override // hh.d
    public final int j(e6 e6Var, boolean z10) {
        switch (this.a) {
            case 0:
                if (cd.c(h10.t0, this.b)) {
                    return k6.r1(lc.e(262144) ? 0.85f : 0.76f, k6.w0(k6.Ge, e6Var));
                }
                return i0.a.o(k6.w0(k6.Ge, e6Var), hs.e4);
            case 1:
                if (cd.c(h10.t0, this.b)) {
                    return k6.r1(lc.e(262144) ? 0.85f : 0.76f, k6.w0(k6.Qe, e6Var));
                }
                return i0.a.o(k6.w0(z10 ? k6.s8 : k6.Qe, e6Var), hs.e4);
            default:
                if (cd.c(h10.t0, this.b)) {
                    return k6.r1(lc.e(262144) ? 0.85f : 0.76f, k6.w0(k6.Qe, e6Var));
                }
                return i0.a.o(k6.w0(z10 ? k6.s8 : k6.Qe, e6Var), hs.e4);
        }
    }
}
