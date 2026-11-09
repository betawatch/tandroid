package hh;

import c8.g0;
import gh.d;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.sc;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements d {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6 b;

    public /* synthetic */ a(int i7, g6 g6Var) {
        this.a = i7;
        this.b = g6Var;
    }

    @Override // gh.d
    public final int k(g6 g6Var, boolean z9) {
        switch (this.a) {
            case 0:
                if (g0.c(p10.s0, this.b)) {
                    return l6.r1(sc.e(262144) ? 0.85f : 0.76f, l6.w0(l6.Ge, g6Var));
                }
                return i0.a.o(l6.w0(l6.Ge, g6Var), qs.e4);
            case 1:
                if (g0.c(p10.s0, this.b)) {
                    return l6.r1(sc.e(262144) ? 0.85f : 0.76f, l6.w0(l6.Qe, g6Var));
                }
                return i0.a.o(l6.w0(z9 ? l6.s8 : l6.Qe, g6Var), qs.e4);
            default:
                if (g0.c(p10.s0, this.b)) {
                    return l6.r1(sc.e(262144) ? 0.85f : 0.76f, l6.w0(l6.Qe, g6Var));
                }
                return i0.a.o(l6.w0(z9 ? l6.s8 : l6.Qe, g6Var), qs.e4);
        }
    }
}
