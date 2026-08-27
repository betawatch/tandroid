package gh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ag;
import org.telegram.ui.hn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class u0 implements ag {
    public final /* synthetic */ TL_stars.TL_starGiftUnique a;
    public final /* synthetic */ x0 b;

    public u0(x0 x0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = x0Var;
        this.a = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ hn P() {
        return null;
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ int P0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ TL_stories.StoryItem T0() {
        return null;
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ boolean X0(long j10) {
        return false;
    }

    public final void a(CharSequence charSequence) {
        int i10;
        int i11;
        x0 x0Var = this.b;
        org.telegram.ui.Components.j6 j6Var = x0Var.w;
        n6 n6Var = x0Var.b;
        i10 = ((org.telegram.ui.ActionBar.e3) x0Var).currentAccount;
        n6Var.a(this.a, UserConfig.getInstance(i10).getClientUserId(), x0Var.n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        x0Var.B = codePointCount;
        int i12 = x0Var.A;
        if (i12 <= 0 || (i11 = i12 - codePointCount) > 15) {
            j6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ag.r1(this, 5));
            return;
        }
        if (i11 < -9999) {
            i11 = -9999;
        }
        j6Var.c(LocaleController.formatNumber(i11, ','), j6Var.getVisibility() == 0, true);
        if (j6Var.getVisibility() != 0) {
            j6Var.setVisibility(0);
            j6Var.setAlpha(0.0f);
            j6Var.setScaleX(0.5f);
            j6Var.setScaleY(0.5f);
        }
        j6Var.animate().setListener(null).cancel();
        j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        if (i11 < 0) {
            j6Var.setTextColor(x0Var.getThemedColor(org.telegram.ui.ActionBar.g6.p7));
        } else {
            j6Var.setTextColor(x0Var.getThemedColor(org.telegram.ui.ActionBar.g6.y6));
        }
    }

    @Override // org.telegram.ui.Components.ag
    public final boolean b1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ag
    public final void c1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ boolean g1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ int i() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ TLRPC.Peer l() {
        return null;
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ boolean n0() {
        return true;
    }

    @Override // org.telegram.ui.Components.ag
    public final void n1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ boolean o1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers y() {
        return null;
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void F() {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void I0() {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void N() {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void N1() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void U1() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void c() {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void e() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void e2() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void f1() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void g0() {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void j1() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void k1() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void l2() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void m() {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void q0() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void q2() {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void r1() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void s() {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void w0() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void w1() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void G(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ag
    public final void N0(int i10) {
    }

    @Override // org.telegram.ui.Components.ag
    public final void S1(int i10) {
    }

    @Override // org.telegram.ui.Components.ag
    public final void W1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ag
    public final void n(float f10) {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void r(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ag
    public final void A(float f10, int i10) {
    }

    @Override // org.telegram.ui.Components.ag
    public final void o0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ag
    public final void l1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.ag
    public final void w(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
    }

    @Override // org.telegram.ui.Components.ag
    public final void X1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
