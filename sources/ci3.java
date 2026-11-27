// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ci3 implements xy1, jbb {
    public final /* synthetic */ uj3 a;

    public /* synthetic */ ci3(uj3 uj3Var) {
        this.a = uj3Var;
    }

    @Override // xy1
    public final int E0() {
        return 0;
    }

    @Override // xy1
    public final TL_stories.StoryItem F0() {
        return null;
    }

    @Override // xy1
    public final boolean H0(long j) {
        return false;
    }

    @Override // xy1
    public final boolean L0() {
        return false;
    }

    @Override // xy1
    public final ou1 R() {
        return null;
    }

    @Override // xy1
    public final void R0(CharSequence charSequence, boolean z, boolean z2) {
        uj3 uj3Var = this.a;
        hl.d3(new ch3(uj3Var, (byte) 18), 100L);
        sea seaVar = uj3Var.I2;
        if (seaVar != null) {
            if (z) {
                if (seaVar.h) {
                    seaVar.e(charSequence, true);
                }
            } else {
                wd3 wd3Var = uj3Var.J2;
                if (wd3Var != null) {
                    hl.r(wd3Var);
                }
                wd3 wd3Var2 = new wd3(this, charSequence, (byte) 4);
                uj3Var.J2 = wd3Var2;
                hl.d3(wd3Var2, 1000L);
            }
        }
    }

    @Override // xy1
    public final boolean T0() {
        return false;
    }

    @Override // jbb
    public final nbb b(long j) {
        ii3 ii3Var = this.a.F0;
        return nbb.c(ii3Var != null ? ii3Var.e(j) : null);
    }

    @Override // jbb
    public final void c(long j, pqa pqaVar) {
        uj3 uj3Var = this.a;
        if (uj3Var.F0 == null) {
            pqaVar.run();
            return;
        }
        uj3Var.R4(false, true);
        uj3Var.R = true;
        uj3Var.fragmentView.invalidate();
        if (j == 0 || j == uj3Var.getUserConfig().e()) {
            uj3Var.F0.T.g1(0, 0);
        } else {
            uj3Var.F0.k(j);
        }
        uj3Var.f0[0].a.getViewTreeObserver().addOnPreDrawListener(new z(this, pqaVar, (byte) 2));
    }

    @Override // xy1
    public final boolean e0() {
        return true;
    }

    @Override // xy1
    public final boolean e1() {
        return false;
    }

    @Override // xy1
    public final boolean g() {
        return false;
    }

    @Override // xy1
    public final int j() {
        return 0;
    }

    @Override // xy1
    public final TLRPC.Peer k() {
        return null;
    }

    @Override // xy1
    public final void x(CharSequence charSequence, boolean z, int i, int i2, long j) {
        uj3 uj3Var = this.a;
        ArrayList arrayList = uj3Var.K2;
        if (uj3Var.E2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList2.add(jf7.a(((Long) uj3Var.K2.get(i3)).longValue(), 0L));
        }
        uj3Var.E2.q(uj3Var, arrayList2, charSequence, false, z, i, i2, null);
    }

    @Override // xy1
    public final TLRPC.TL_channels_sendAsPeers y() {
        return null;
    }

    @Override // xy1
    public final void B1() {
    }

    @Override // xy1
    public final void C() {
    }

    @Override // xy1
    public final void D1() {
    }

    @Override // xy1
    public final void J() {
    }

    @Override // xy1
    public final void O1() {
    }

    @Override // xy1
    public final void P1() {
    }

    @Override // xy1
    public final void S0() {
    }

    @Override // xy1
    public final void S1() {
    }

    @Override // xy1
    public final void V() {
    }

    @Override // xy1
    public final void W0() {
    }

    @Override // xy1
    public final void X0() {
    }

    @Override // xy1
    public final void Z0() {
    }

    @Override // xy1
    public final void a() {
    }

    @Override // xy1
    public final void e() {
    }

    @Override // xy1
    public final void f0() {
    }

    @Override // xy1
    public final void g1() {
    }

    @Override // xy1
    public final void i0() {
    }

    @Override // xy1
    public final void n() {
    }

    @Override // xy1
    public final void p1() {
    }

    @Override // xy1
    public final void s() {
    }

    @Override // xy1
    public final void t0() {
    }

    @Override // xy1
    public final void w() {
    }

    @Override // xy1
    public final void C1(int i) {
    }

    @Override // xy1
    public final void D(boolean z) {
    }

    @Override // xy1
    public final void E1(boolean z) {
    }

    @Override // xy1
    public final void d1(CharSequence charSequence) {
    }

    @Override // xy1
    public final void o(float f) {
    }

    @Override // xy1
    public final void p(boolean z) {
    }

    @Override // xy1
    public final void z0(int i) {
    }

    @Override // xy1
    public final void B(float f, int i) {
    }

    @Override // xy1
    public final void b1(View view, CharSequence charSequence, boolean z) {
    }

    @Override // xy1
    public final void H1(int i, int i2, int i3, long j, long j2, boolean z) {
    }
}
