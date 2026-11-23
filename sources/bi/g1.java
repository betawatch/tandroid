package bi;

import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.mg;
import org.telegram.ui.rm;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class g1 implements mg {
    public final /* synthetic */ TL_stars.TL_starGiftUnique a;
    public final /* synthetic */ k1 b;

    public g1(k1 k1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = k1Var;
        this.a = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers H() {
        return null;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ int X0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ TL_stories.StoryItem Y0() {
        return null;
    }

    public final void a(CharSequence charSequence) {
        int i7;
        k1 k1Var = this.b;
        org.telegram.ui.Components.n6 n6Var = k1Var.w1;
        k1Var.m1.a(this.a, i10.i(k1Var.a).e(), k1Var.s1.getTextWithEntities(), gd.N0(2131749727, null), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        k1Var.A1 = codePointCount;
        int i10 = k1Var.z1;
        int i11 = 1;
        if (i10 <= 0 || (i7 = i10 - codePointCount) > 15) {
            n6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ai.g0(this, i11));
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
            org.telegram.ui.ActionBar.u6.Y(n6Var, org.telegram.ui.ActionBar.n6.p7, k1Var.J0);
        } else {
            org.telegram.ui.ActionBar.u6.Y(n6Var, org.telegram.ui.ActionBar.n6.y6, k1Var.J0);
        }
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ rm a0() {
        return null;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ boolean b1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public final boolean d1() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public final void i1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ boolean l1() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ int n() {
        return 0;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ TLRPC.Peer o() {
        return null;
    }

    @Override // org.telegram.ui.Components.mg
    public final void u1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ boolean v1() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ boolean w0() {
        return true;
    }

    @Override // org.telegram.ui.Components.mg
    public final void Q(boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void U0(int i7) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void i2(int i7) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void n2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void u(float f10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void w(boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void E() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void G1() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void N() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void V() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void b() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void f() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void g0() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void h2() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void j1() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void m2() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void n1() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void o1() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void q1() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void r() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void r2() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void t2() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void v2() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void w1() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void y0() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void z() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void K(float f10, int i7) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void G(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
    }
}
