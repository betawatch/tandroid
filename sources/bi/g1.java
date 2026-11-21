package bi;

import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ng;
import org.telegram.ui.rm;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class g1 implements ng {
    public final /* synthetic */ TL_stars.TL_starGiftUnique a;
    public final /* synthetic */ k1 b;

    public g1(k1 k1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = k1Var;
        this.a = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean E0() {
        return true;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    public final void a(CharSequence charSequence) {
        int i7;
        k1 k1Var = this.b;
        org.telegram.ui.Components.o6 o6Var = k1Var.w1;
        k1Var.m1.a(this.a, j10.i(k1Var.a).e(), k1Var.s1.getTextWithEntities(), gd.N0(2131749727, null), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        k1Var.A1 = codePointCount;
        int i10 = k1Var.z1;
        int i11 = 1;
        if (i10 <= 0 || (i7 = i10 - codePointCount) > 15) {
            o6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ai.k0(this, i11));
            return;
        }
        if (i7 < -9999) {
            i7 = -9999;
        }
        o6Var.c(gd.E(i7, ','), o6Var.getVisibility() == 0, true);
        if (o6Var.getVisibility() != 0) {
            o6Var.setVisibility(0);
            o6Var.setAlpha(0.0f);
            o6Var.setScaleX(0.5f);
            o6Var.setScaleY(0.5f);
        }
        o6Var.animate().setListener(null).cancel();
        o6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        if (i7 < 0) {
            org.telegram.ui.ActionBar.t6.Y(o6Var, org.telegram.ui.ActionBar.m6.p7, k1Var.J0);
        } else {
            org.telegram.ui.ActionBar.t6.Y(o6Var, org.telegram.ui.ActionBar.m6.y6, k1Var.J0);
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ int b1() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ TL_stories.StoryItem c1() {
        return null;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean e1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public final boolean g1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public final void j1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ rm m0() {
        return null;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean m1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ int n() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ TLRPC.Peer t() {
        return null;
    }

    @Override // org.telegram.ui.Components.ng
    public final void u1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean v1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void A(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void a0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void a1(int i7) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void k2(int i7) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void n2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void x(float f10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void B2() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void D() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void G() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void G1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void J0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void Q0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void V() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void b0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void d() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void i2() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void l1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void m2() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void n1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void o1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void q1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void r2() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void s0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void u() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void w1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void w2() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void Q(float f10, int i7) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void H(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
    }
}
