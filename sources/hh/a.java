package hh;

import c8.j0;
import gh.d;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.pc;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements d {
    public final /* synthetic */ int a;
    public final /* synthetic */ i6 b;

    public /* synthetic */ a(int i7, i6 i6Var) {
        this.a = i7;
        this.b = i6Var;
    }

    @Override // gh.d
    public final int f(i6 i6Var, boolean z10) {
        switch (this.a) {
            case 0:
                if (j0.d(i10.t0, this.b)) {
                    return n6.r1(pc.e(262144) ? 0.85f : 0.76f, n6.w0(n6.Je, i6Var));
                }
                return i0.a.o(n6.w0(n6.Je, i6Var), ks.e4);
            case 1:
                if (j0.d(i10.t0, this.b)) {
                    return n6.r1(pc.e(262144) ? 0.85f : 0.76f, n6.w0(n6.Te, i6Var));
                }
                return i0.a.o(n6.w0(z10 ? n6.s8 : n6.Te, i6Var), ks.e4);
            default:
                if (j0.d(i10.t0, this.b)) {
                    return n6.r1(pc.e(262144) ? 0.85f : 0.76f, n6.w0(n6.Te, i6Var));
                }
                return i0.a.o(n6.w0(z10 ? n6.s8 : n6.Te, i6Var), ks.e4);
        }
    }
}
