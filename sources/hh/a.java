package hh;

import c8.i0;
import gh.d;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.qc;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements d {
    public final /* synthetic */ int a;
    public final /* synthetic */ h6 b;

    public /* synthetic */ a(int i7, h6 h6Var) {
        this.a = i7;
        this.b = h6Var;
    }

    @Override // gh.d
    public final int j(h6 h6Var, boolean z10) {
        switch (this.a) {
            case 0:
                if (i0.d(k10.t0, this.b)) {
                    return m6.r1(qc.e(262144) ? 0.85f : 0.76f, m6.w0(m6.Je, h6Var));
                }
                return i0.a.o(m6.w0(m6.Je, h6Var), ls.e4);
            case 1:
                if (i0.d(k10.t0, this.b)) {
                    return m6.r1(qc.e(262144) ? 0.85f : 0.76f, m6.w0(m6.Te, h6Var));
                }
                return i0.a.o(m6.w0(z10 ? m6.s8 : m6.Te, h6Var), ls.e4);
            default:
                if (i0.d(k10.t0, this.b)) {
                    return m6.r1(qc.e(262144) ? 0.85f : 0.76f, m6.w0(m6.Te, h6Var));
                }
                return i0.a.o(m6.w0(z10 ? m6.s8 : m6.Te, h6Var), ls.e4);
        }
    }
}
