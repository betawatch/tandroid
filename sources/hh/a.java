package hh;

import c8.g0;
import gh.d;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.sc;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements d {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ a(int i7, f6 f6Var) {
        this.a = i7;
        this.b = f6Var;
    }

    @Override // gh.d
    public final int k(f6 f6Var, boolean z9) {
        switch (this.a) {
            case 0:
                if (g0.c(p10.s0, this.b)) {
                    return k6.r1(sc.e(262144) ? 0.85f : 0.76f, k6.w0(k6.Ge, f6Var));
                }
                return i0.a.o(k6.w0(k6.Ge, f6Var), qs.e4);
            case 1:
                if (g0.c(p10.s0, this.b)) {
                    return k6.r1(sc.e(262144) ? 0.85f : 0.76f, k6.w0(k6.Qe, f6Var));
                }
                return i0.a.o(k6.w0(z9 ? k6.s8 : k6.Qe, f6Var), qs.e4);
            default:
                if (g0.c(p10.s0, this.b)) {
                    return k6.r1(sc.e(262144) ? 0.85f : 0.76f, k6.w0(k6.Qe, f6Var));
                }
                return i0.a.o(k6.w0(z9 ? k6.s8 : k6.Qe, f6Var), qs.e4);
        }
    }
}
