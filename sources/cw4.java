// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cw4 implements uz1 {
    public final /* synthetic */ TL_stars.TL_starGiftUnique a;
    public final /* synthetic */ fw4 b;

    public cw4(fw4 fw4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = fw4Var;
        this.a = tL_starGiftUnique;
    }

    @Override // uz1
    public final int B0() {
        return 0;
    }

    @Override // uz1
    public final TL_stories.StoryItem C0() {
        return null;
    }

    @Override // uz1
    public final boolean E0(long j) {
        return false;
    }

    @Override // uz1
    public final boolean G0() {
        return false;
    }

    @Override // uz1
    public final void H0(CharSequence charSequence, boolean z, boolean z2) {
        b(charSequence);
    }

    @Override // uz1
    public final nv1 J() {
        return null;
    }

    @Override // uz1
    public final boolean K0() {
        return false;
    }

    public final void b(CharSequence charSequence) {
        int i;
        fw4 fw4Var = this.b;
        io ioVar = fw4Var.v1;
        fw4Var.l1.a(this.a, z8c.h(fw4Var.a).e(), fw4Var.r1.getTextWithEntities(), jb6.M0(2131749677, null), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        fw4Var.z1 = codePointCount;
        int i2 = fw4Var.y1;
        if (i2 <= 0 || (i = i2 - codePointCount) > 15) {
            ioVar.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new kh2(this, (byte) 28));
            return;
        }
        if (i < -9999) {
            i = -9999;
        }
        ioVar.c(jb6.E(i, ','), ioVar.getVisibility() == 0, true);
        if (ioVar.getVisibility() != 0) {
            ioVar.setVisibility(0);
            ioVar.setAlpha(0.0f);
            ioVar.setScaleX(0.5f);
            ioVar.setScaleY(0.5f);
        }
        ioVar.animate().setListener(null).cancel();
        ioVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        if (i < 0) {
            anb.U(ioVar, cmb.o7, fw4Var.J0);
        } else {
            anb.U(ioVar, cmb.x6, fw4Var.J0);
        }
    }

    @Override // uz1
    public final boolean b0() {
        return true;
    }

    @Override // uz1
    public final void c1(CharSequence charSequence) {
        b(charSequence);
    }

    @Override // uz1
    public final boolean d1() {
        return false;
    }

    @Override // uz1
    public final boolean h() {
        return false;
    }

    @Override // uz1
    public final int j() {
        return 0;
    }

    @Override // uz1
    public final TLRPC.Peer l() {
        return null;
    }

    @Override // uz1
    public final TLRPC.TL_channels_sendAsPeers x() {
        return null;
    }

    @Override // uz1
    public final void A1() {
    }

    @Override // uz1
    public final void B() {
    }

    @Override // uz1
    public final void C(boolean z) {
    }

    @Override // uz1
    public final void E1(boolean z) {
    }

    @Override // uz1
    public final void G1() {
    }

    @Override // uz1
    public final void H1() {
    }

    @Override // uz1
    public final void I() {
    }

    @Override // uz1
    public final void I0() {
    }

    @Override // uz1
    public final void L() {
    }

    @Override // uz1
    public final void O0() {
    }

    @Override // uz1
    public final void R1() {
    }

    @Override // uz1
    public final void W0() {
    }

    @Override // uz1
    public final void Y0() {
    }

    @Override // uz1
    public final void a() {
    }

    @Override // uz1
    public final void c0() {
    }

    @Override // uz1
    public final void e() {
    }

    @Override // uz1
    public final void e1() {
    }

    @Override // uz1
    public final void f0() {
    }

    @Override // uz1
    public final void j1() {
    }

    @Override // uz1
    public final void n() {
    }

    @Override // uz1
    public final void n0() {
    }

    @Override // uz1
    public final void o(float f) {
    }

    @Override // uz1
    public final void p(boolean z) {
    }

    @Override // uz1
    public final void r() {
    }

    @Override // uz1
    public final void s1() {
    }

    @Override // uz1
    public final void v() {
    }

    @Override // uz1
    public final void v1(int i) {
    }

    @Override // uz1
    public final void z0(int i) {
    }

    @Override // uz1
    public final void y(float f, int i) {
    }

    @Override // uz1
    public final void a1(View view, CharSequence charSequence, boolean z) {
    }

    @Override // uz1
    public final void w(CharSequence charSequence, boolean z, int i, int i2, long j) {
    }

    @Override // uz1
    public final void F1(int i, int i2, int i3, long j, long j2, boolean z) {
    }
}
