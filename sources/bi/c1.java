package bi;

import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.kg;
import org.telegram.ui.rm;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class c1 implements kg {
    public final /* synthetic */ TL_stars.TL_starGiftUnique a;
    public final /* synthetic */ g1 b;

    public c1(g1 g1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = g1Var;
        this.a = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ boolean E0() {
        return true;
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    public final void a(CharSequence charSequence) {
        int i7;
        g1 g1Var = this.b;
        org.telegram.ui.Components.n6 n6Var = g1Var.w1;
        g1Var.m1.a(this.a, j10.i(g1Var.a).e(), g1Var.s1.getTextWithEntities(), gd.M0(2131749728, null), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        g1Var.A1 = codePointCount;
        int i10 = g1Var.z1;
        int i11 = 1;
        if (i10 <= 0 || (i7 = i10 - codePointCount) > 15) {
            n6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ai.j0(this, i11));
            return;
        }
        if (i7 < -9999) {
            i7 = -9999;
        }
        n6Var.c(gd.E(i7, ','), n6Var.getVisibility() == 0, true);
        if (n6Var.getVisibility() != 0) {
            n6Var.setVisibility(0);
            n6Var.setAlpha(0.0f);
            n6Var.setScaleX(0.5f);
            n6Var.setScaleY(0.5f);
        }
        n6Var.animate().setListener(null).cancel();
        n6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        if (i7 < 0) {
            org.telegram.ui.ActionBar.u6.Y(n6Var, org.telegram.ui.ActionBar.n6.p7, g1Var.J0);
        } else {
            org.telegram.ui.ActionBar.u6.Y(n6Var, org.telegram.ui.ActionBar.n6.y6, g1Var.J0);
        }
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ int b1() {
        return 0;
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ TL_stories.StoryItem c1() {
        return null;
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ boolean e1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.kg
    public final boolean g1() {
        return false;
    }

    @Override // org.telegram.ui.Components.kg
    public final void j1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ rm m0() {
        return null;
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ boolean m1() {
        return false;
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ int n() {
        return 0;
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ TLRPC.Peer t() {
        return null;
    }

    @Override // org.telegram.ui.Components.kg
    public final void u1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ boolean v1() {
        return false;
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ void A(boolean z10) {
    }

    @Override // org.telegram.ui.Components.kg
    public final void a0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.kg
    public final void a1(int i7) {
    }

    @Override // org.telegram.ui.Components.kg
    public final void k2(int i7) {
    }

    @Override // org.telegram.ui.Components.kg
    public final void n2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.kg
    public final void x(float f10) {
    }

    @Override // org.telegram.ui.Components.kg
    public final void B2() {
    }

    @Override // org.telegram.ui.Components.kg
    public final void D() {
    }

    @Override // org.telegram.ui.Components.kg
    public final void G() {
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Components.kg
    public final void G1() {
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ void J0() {
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ void Q0() {
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ void V() {
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ void b0() {
    }

    @Override // org.telegram.ui.Components.kg
    public final void d() {
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ void i2() {
    }

    @Override // org.telegram.ui.Components.kg
    public final void l1() {
    }

    @Override // org.telegram.ui.Components.kg
    public final void m2() {
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ void n1() {
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ void o1() {
    }

    @Override // org.telegram.ui.Components.kg
    public final void q1() {
    }

    @Override // org.telegram.ui.Components.kg
    public final void r2() {
    }

    @Override // org.telegram.ui.Components.kg
    public final void s0() {
    }

    @Override // org.telegram.ui.Components.kg
    public final void u() {
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ void w1() {
    }

    @Override // org.telegram.ui.Components.kg
    public final void w2() {
    }

    @Override // org.telegram.ui.Components.kg
    public final void Q(float f10, int i7) {
    }

    @Override // org.telegram.ui.Components.kg
    public final void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.kg
    public final void H(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
    }

    @Override // org.telegram.ui.Components.kg
    public final void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
    }
}
