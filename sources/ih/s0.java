package ih;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.o6;
import org.telegram.ui.jn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class s0 implements hg {
    public final /* synthetic */ TL_stars.TL_starGiftUnique a;
    public final /* synthetic */ v0 b;

    public s0(v0 v0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = v0Var;
        this.a = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ boolean C0() {
        return true;
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers G() {
        return null;
    }

    public final void a(CharSequence charSequence) {
        int i10;
        int i11;
        v0 v0Var = this.b;
        o6 o6Var = v0Var.w;
        f6 f6Var = v0Var.b;
        i10 = ((org.telegram.ui.ActionBar.f3) v0Var).currentAccount;
        f6Var.a(this.a, UserConfig.getInstance(i10).getClientUserId(), v0Var.n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        v0Var.B = codePointCount;
        int i12 = v0Var.A;
        if (i12 <= 0 || (i11 = i12 - codePointCount) > 15) {
            o6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ag.m0(this, 8));
            return;
        }
        if (i11 < -9999) {
            i11 = -9999;
        }
        o6Var.c(LocaleController.formatNumber(i11, ','), o6Var.getVisibility() == 0, true);
        if (o6Var.getVisibility() != 0) {
            o6Var.setVisibility(0);
            o6Var.setAlpha(0.0f);
            o6Var.setScaleX(0.5f);
            o6Var.setScaleY(0.5f);
        }
        o6Var.animate().setListener(null).cancel();
        o6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        if (i11 < 0) {
            o6Var.setTextColor(v0Var.getThemedColor(g6.p7));
        } else {
            o6Var.setTextColor(v0Var.getThemedColor(g6.y6));
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ int b1() {
        return 0;
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ TL_stories.StoryItem d1() {
        return null;
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ boolean f1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.hg
    public final boolean i1() {
        return false;
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.Components.hg
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ int m() {
        return 0;
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ jn o0() {
        return null;
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ boolean o1() {
        return false;
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ TLRPC.Peer q() {
        return null;
    }

    @Override // org.telegram.ui.Components.hg
    public final void v1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ boolean w1() {
        return false;
    }

    @Override // org.telegram.ui.Components.hg
    public final void B() {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Components.hg
    public final void G1() {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void M() {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void T0() {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void d2() {
    }

    @Override // org.telegram.ui.Components.hg
    public final void e() {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.hg
    public final void i2() {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void k0() {
    }

    @Override // org.telegram.ui.Components.hg
    public final void n1() {
    }

    @Override // org.telegram.ui.Components.hg
    public final void o2() {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void q1() {
    }

    @Override // org.telegram.ui.Components.hg
    public final void r() {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void r1() {
    }

    @Override // org.telegram.ui.Components.hg
    public final void s0() {
    }

    @Override // org.telegram.ui.Components.hg
    public final void s1() {
    }

    @Override // org.telegram.ui.Components.hg
    public final void v2() {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void z1() {
    }

    @Override // org.telegram.ui.Components.hg
    public final void z2() {
    }

    @Override // org.telegram.ui.Components.hg
    public final void U(boolean z10) {
    }

    @Override // org.telegram.ui.Components.hg
    public final void a1(int i10) {
    }

    @Override // org.telegram.ui.Components.hg
    public final void f2(int i10) {
    }

    @Override // org.telegram.ui.Components.hg
    public final void k2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.hg
    public final void v(float f9) {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void x(boolean z10) {
    }

    @Override // org.telegram.ui.Components.hg
    public final void E0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.hg
    public final void I(float f9, int i10) {
    }

    @Override // org.telegram.ui.Components.hg
    public final void t1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.hg
    public final void D(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
    }

    @Override // org.telegram.ui.Components.hg
    public final void l2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
