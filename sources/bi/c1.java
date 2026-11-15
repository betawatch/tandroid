package bi;

import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cg;
import org.telegram.ui.qm;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class c1 implements cg {
    public final /* synthetic */ TL_stars.TL_starGiftUnique a;
    public final /* synthetic */ f1 b;

    public c1(f1 f1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = f1Var;
        this.a = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ boolean E0() {
        return true;
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers O() {
        return null;
    }

    public final void a(CharSequence charSequence) {
        int i7;
        f1 f1Var = this.b;
        org.telegram.ui.Components.h6 h6Var = f1Var.w1;
        f1Var.m1.a(this.a, m10.i(f1Var.a).e(), f1Var.s1.getTextWithEntities(), hd.M0(2131749745, null), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        f1Var.A1 = codePointCount;
        int i10 = f1Var.z1;
        int i11 = 1;
        if (i10 <= 0 || (i7 = i10 - codePointCount) > 15) {
            h6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ai.i0(this, i11));
            return;
        }
        if (i7 < -9999) {
            i7 = -9999;
        }
        h6Var.c(hd.E(i7, ','), h6Var.getVisibility() == 0, true);
        if (h6Var.getVisibility() != 0) {
            h6Var.setVisibility(0);
            h6Var.setAlpha(0.0f);
            h6Var.setScaleX(0.5f);
            h6Var.setScaleY(0.5f);
        }
        h6Var.animate().setListener(null).cancel();
        h6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        if (i7 < 0) {
            org.telegram.ui.ActionBar.q6.Y(h6Var, org.telegram.ui.ActionBar.j6.p7, f1Var.J0);
        } else {
            org.telegram.ui.ActionBar.q6.Y(h6Var, org.telegram.ui.ActionBar.j6.y6, f1Var.J0);
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ int b1() {
        return 0;
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ TL_stories.StoryItem c1() {
        return null;
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ boolean e1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.cg
    public final boolean g1() {
        return false;
    }

    @Override // org.telegram.ui.Components.cg
    public final void j1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ boolean m1() {
        return false;
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ int n() {
        return 0;
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ qm p0() {
        return null;
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ TLRPC.Peer s() {
        return null;
    }

    @Override // org.telegram.ui.Components.cg
    public final void u1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ boolean v1() {
        return false;
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ void C(boolean z10) {
    }

    @Override // org.telegram.ui.Components.cg
    public final void a1(int i7) {
    }

    @Override // org.telegram.ui.Components.cg
    public final void b0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.cg
    public final void k2(int i7) {
    }

    @Override // org.telegram.ui.Components.cg
    public final void n2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.cg
    public final void y(float f10) {
    }

    @Override // org.telegram.ui.Components.cg
    public final void B2() {
    }

    @Override // org.telegram.ui.Components.cg
    public final void E() {
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Components.cg
    public final void G1() {
    }

    @Override // org.telegram.ui.Components.cg
    public final void I() {
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ void J0() {
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ void Q0() {
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ void Y() {
    }

    @Override // org.telegram.ui.Components.cg
    public final void b() {
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ void d() {
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ void i2() {
    }

    @Override // org.telegram.ui.Components.cg
    public final void l1() {
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ void m0() {
    }

    @Override // org.telegram.ui.Components.cg
    public final void m2() {
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ void n1() {
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ void o1() {
    }

    @Override // org.telegram.ui.Components.cg
    public final void q1() {
    }

    @Override // org.telegram.ui.Components.cg
    public final void r2() {
    }

    @Override // org.telegram.ui.Components.cg
    public final void s0() {
    }

    @Override // org.telegram.ui.Components.cg
    public final void v() {
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ void w1() {
    }

    @Override // org.telegram.ui.Components.cg
    public final void w2() {
    }

    @Override // org.telegram.ui.Components.cg
    public final void W(float f10, int i7) {
    }

    @Override // org.telegram.ui.Components.cg
    public final void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.cg
    public final void M(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
    }

    @Override // org.telegram.ui.Components.cg
    public final void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
    }
}
