// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ew4 implements xy1 {
    public final /* synthetic */ TL_stars.TL_starGiftUnique a;
    public final /* synthetic */ hw4 b;

    public ew4(hw4 hw4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = hw4Var;
        this.a = tL_starGiftUnique;
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
        b(charSequence);
    }

    @Override // xy1
    public final boolean T0() {
        return false;
    }

    public final void b(CharSequence charSequence) {
        int i;
        hw4 hw4Var = this.b;
        in inVar = hw4Var.v1;
        hw4Var.l1.a(this.a, yac.h(hw4Var.a).e(), hw4Var.r1.getTextWithEntities(), ob6.M0(2131749690, null), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        hw4Var.z1 = codePointCount;
        int i2 = hw4Var.y1;
        if (i2 <= 0 || (i = i2 - codePointCount) > 15) {
            inVar.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new cn2(this, (byte) 25));
            return;
        }
        if (i < -9999) {
            i = -9999;
        }
        inVar.c(ob6.E(i, ','), inVar.getVisibility() == 0, true);
        if (inVar.getVisibility() != 0) {
            inVar.setVisibility(0);
            inVar.setAlpha(0.0f);
            inVar.setScaleX(0.5f);
            inVar.setScaleY(0.5f);
        }
        inVar.animate().setListener(null).cancel();
        inVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        if (i < 0) {
            yob.U(inVar, aob.p7, hw4Var.J0);
        } else {
            yob.U(inVar, aob.y6, hw4Var.J0);
        }
    }

    @Override // xy1
    public final void d1(CharSequence charSequence) {
        b(charSequence);
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
    public final void x(CharSequence charSequence, boolean z, int i, int i2, long j) {
    }

    @Override // xy1
    public final void H1(int i, int i2, int i3, long j, long j2, boolean z) {
    }
}
