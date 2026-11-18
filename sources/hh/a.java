package hh;

import c8.i0;
import gh.d;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.pc;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements d {
    public final /* synthetic */ int a;
    public final /* synthetic */ i6 b;

    public /* synthetic */ a(int i7, i6 i6Var) {
        this.a = i7;
        this.b = i6Var;
    }

    @Override // gh.d
    public final int j(i6 i6Var, boolean z10) {
        switch (this.a) {
            case 0:
                if (i0.d(j10.t0, this.b)) {
                    return n6.r1(pc.e(262144) ? 0.85f : 0.76f, n6.w0(n6.Je, i6Var));
                }
                return i0.a.o(n6.w0(n6.Je, i6Var), ks.e4);
            case 1:
                if (i0.d(j10.t0, this.b)) {
                    return n6.r1(pc.e(262144) ? 0.85f : 0.76f, n6.w0(n6.Te, i6Var));
                }
                return i0.a.o(n6.w0(z10 ? n6.s8 : n6.Te, i6Var), ks.e4);
            default:
                if (i0.d(j10.t0, this.b)) {
                    return n6.r1(pc.e(262144) ? 0.85f : 0.76f, n6.w0(n6.Te, i6Var));
                }
                return i0.a.o(n6.w0(z10 ? n6.s8 : n6.Te, i6Var), ks.e4);
        }
    }
}
