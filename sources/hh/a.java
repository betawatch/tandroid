package hh;

import c8.g0;
import gh.d;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.sc;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements d {
    public final /* synthetic */ int a;
    public final /* synthetic */ h6 b;

    public /* synthetic */ a(int i7, h6 h6Var) {
        this.a = i7;
        this.b = h6Var;
    }

    @Override // gh.d
    public final int k(h6 h6Var, boolean z9) {
        switch (this.a) {
            case 0:
                if (g0.c(p10.s0, this.b)) {
                    return m6.r1(sc.e(262144) ? 0.85f : 0.76f, m6.w0(m6.Ge, h6Var));
                }
                return i0.a.o(m6.w0(m6.Ge, h6Var), qs.e4);
            case 1:
                if (g0.c(p10.s0, this.b)) {
                    return m6.r1(sc.e(262144) ? 0.85f : 0.76f, m6.w0(m6.Qe, h6Var));
                }
                return i0.a.o(m6.w0(z9 ? m6.s8 : m6.Qe, h6Var), qs.e4);
            default:
                if (g0.c(p10.s0, this.b)) {
                    return m6.r1(sc.e(262144) ? 0.85f : 0.76f, m6.w0(m6.Qe, h6Var));
                }
                return i0.a.o(m6.w0(z9 ? m6.s8 : m6.Qe, h6Var), qs.e4);
        }
    }
}
