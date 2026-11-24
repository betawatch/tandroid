// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ih3 implements hy1, k7b {
    public final /* synthetic */ cj3 a;

    public /* synthetic */ ih3(cj3 cj3Var) {
        this.a = cj3Var;
    }

    @Override // hy1
    public final void C0(CharSequence charSequence, boolean z, boolean z2) {
        cj3 cj3Var = this.a;
        gl.e3(new sg3(cj3Var, (byte) 17), 100L);
        bba bbaVar = cj3Var.I2;
        if (bbaVar != null) {
            if (z) {
                if (bbaVar.h) {
                    bbaVar.e(charSequence, true);
                }
            } else {
                wc3 wc3Var = cj3Var.J2;
                if (wc3Var != null) {
                    gl.r(wc3Var);
                }
                wc3 wc3Var2 = new wc3(this, charSequence, (byte) 5);
                cj3Var.J2 = wc3Var2;
                gl.e3(wc3Var2, 1000L);
            }
        }
    }

    @Override // hy1
    public final bu1 G() {
        return null;
    }

    @Override // hy1
    public final boolean H0() {
        return false;
    }

    @Override // hy1
    public final boolean Q0() {
        return false;
    }

    @Override // hy1
    public final boolean R() {
        return true;
    }

    @Override // k7b
    public final o7b b(long j) {
        oh3 oh3Var = this.a.F0;
        return o7b.c(oh3Var != null ? oh3Var.e(j) : null);
    }

    @Override // k7b
    public final void c(long j, sma smaVar) {
        cj3 cj3Var = this.a;
        if (cj3Var.F0 == null) {
            smaVar.run();
            return;
        }
        byte b = 0;
        cj3Var.N4(false, true);
        cj3Var.R = true;
        cj3Var.fragmentView.invalidate();
        if (j == 0 || j == cj3Var.getUserConfig().e()) {
            cj3Var.F0.T.g1(0, 0);
        } else {
            cj3Var.F0.k(j);
        }
        cj3Var.f0[0].a.getViewTreeObserver().addOnPreDrawListener(new ni3(this, smaVar, b));
    }

    @Override // hy1
    public final boolean g() {
        return false;
    }

    @Override // hy1
    public final int h() {
        return 0;
    }

    @Override // hy1
    public final TLRPC.Peer i() {
        return null;
    }

    @Override // hy1
    public final int o0() {
        return 0;
    }

    @Override // hy1
    public final TL_stories.StoryItem t0() {
        return null;
    }

    @Override // hy1
    public final void u(CharSequence charSequence, boolean z, int i, int i2, long j) {
        cj3 cj3Var = this.a;
        ArrayList arrayList = cj3Var.K2;
        if (cj3Var.E2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList2.add(zc7.a(((Long) cj3Var.K2.get(i3)).longValue(), 0L));
        }
        cj3Var.E2.r(cj3Var, arrayList2, charSequence, false, z, i, i2, null);
    }

    @Override // hy1
    public final TLRPC.TL_channels_sendAsPeers v() {
        return null;
    }

    @Override // hy1
    public final boolean x0(long j) {
        return false;
    }

    @Override // hy1
    public final boolean y0() {
        return false;
    }

    @Override // hy1
    public final void B() {
    }

    @Override // hy1
    public final void G0() {
    }

    @Override // hy1
    public final void I0() {
    }

    @Override // hy1
    public final void J() {
    }

    @Override // hy1
    public final void K0() {
    }

    @Override // hy1
    public final void L0() {
    }

    @Override // hy1
    public final void R0() {
    }

    @Override // hy1
    public final void T() {
    }

    @Override // hy1
    public final void W0() {
    }

    @Override // hy1
    public final void Z() {
    }

    @Override // hy1
    public final void a() {
    }

    @Override // hy1
    public final void e() {
    }

    @Override // hy1
    public final void e1() {
    }

    @Override // hy1
    public final void f0() {
    }

    @Override // hy1
    public final void g1() {
    }

    @Override // hy1
    public final void j() {
    }

    @Override // hy1
    public final void n() {
    }

    @Override // hy1
    public final void o1() {
    }

    @Override // hy1
    public final void p1() {
    }

    @Override // hy1
    public final void r() {
    }

    @Override // hy1
    public final void s1() {
    }

    @Override // hy1
    public final void y() {
    }

    @Override // hy1
    public final void A(boolean z) {
    }

    @Override // hy1
    public final void P0(CharSequence charSequence) {
    }

    @Override // hy1
    public final void f1(int i) {
    }

    @Override // hy1
    public final void j1(boolean z) {
    }

    @Override // hy1
    public final void k(float f) {
    }

    @Override // hy1
    public final void m(boolean z) {
    }

    @Override // hy1
    public final void n0(int i) {
    }

    @Override // hy1
    public final void w(float f, int i) {
    }

    @Override // hy1
    public final void O0(View view, CharSequence charSequence, boolean z) {
    }

    @Override // hy1
    public final void k1(int i, int i2, int i3, long j, long j2, boolean z) {
    }
}
