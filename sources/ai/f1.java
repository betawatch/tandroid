package ai;

import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.uf;
import org.telegram.ui.mm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f1 implements uf {
    public final /* synthetic */ TL_stars.TL_starGiftUnique a;
    public final /* synthetic */ i1 b;

    public f1(i1 i1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = i1Var;
        this.a = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers M() {
        return null;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ int O0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ TL_stories.StoryItem R0() {
        return null;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ boolean T0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.uf
    public final boolean V0() {
        return false;
    }

    @Override // org.telegram.ui.Components.uf
    public final void Y0(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    public final void a(CharSequence charSequence) {
        int i3;
        i1 i1Var = this.b;
        org.telegram.ui.Components.h6 h6Var = i1Var.t1;
        i1Var.j1.a(this.a, h10.i(i1Var.a).e(), i1Var.p1.getTextWithEntities(), bd.M0(2131749753, null), true);
        int i10 = 0;
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        i1Var.x1 = codePointCount;
        int i11 = i1Var.w1;
        if (i11 <= 0 || (i3 = i11 - codePointCount) > 15) {
            h6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new e1(this, i10));
            return;
        }
        if (i3 < -9999) {
            i3 = -9999;
        }
        h6Var.c(bd.E(i3, ','), h6Var.getVisibility() == 0, true);
        if (h6Var.getVisibility() != 0) {
            h6Var.setVisibility(0);
            h6Var.setAlpha(0.0f);
            h6Var.setScaleX(0.5f);
            h6Var.setScaleY(0.5f);
        }
        h6Var.animate().setListener(null).cancel();
        h6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        if (i3 < 0) {
            org.telegram.ui.ActionBar.r6.Z(h6Var, org.telegram.ui.ActionBar.k6.p7, i1Var.J0);
        } else {
            org.telegram.ui.ActionBar.r6.Z(h6Var, org.telegram.ui.ActionBar.k6.y6, i1Var.J0);
        }
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ boolean a1() {
        return false;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ mm i0() {
        return null;
    }

    @Override // org.telegram.ui.Components.uf
    public final void j1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ boolean k1() {
        return false;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ TLRPC.Peer t() {
        return null;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ boolean u0() {
        return true;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void A(boolean z10) {
    }

    @Override // org.telegram.ui.Components.uf
    public final void M0(int i3) {
    }

    @Override // org.telegram.ui.Components.uf
    public final void T1(int i3) {
    }

    @Override // org.telegram.ui.Components.uf
    public final void c0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.uf
    public final void c2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.uf
    public final void x(float f10) {
    }

    @Override // org.telegram.ui.Components.uf
    public final void E() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void F() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void F0() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void I0() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void O1() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void Z0() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void a0() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void b1() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void b2() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void e() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void e1() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void f() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void g0() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void g1() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void g2() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void m1() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void n2() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void q0() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void r2() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void s1() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void u() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void w0() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void O(float f10, int i3) {
    }

    @Override // org.telegram.ui.Components.uf
    public final void h1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.uf
    public final void G(CharSequence charSequence, boolean z10, int i3, int i10, long j10) {
    }

    @Override // org.telegram.ui.Components.uf
    public final void d2(int i3, int i10, int i11, long j10, long j11, boolean z10) {
    }
}
