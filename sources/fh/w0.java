package fh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.eg;
import org.telegram.ui.gn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class w0 implements eg {
    public final /* synthetic */ TL_stars.TL_starGiftUnique a;
    public final /* synthetic */ z0 b;

    public w0(z0 z0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = z0Var;
        this.a = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers A() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ int N0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TL_stories.StoryItem P0() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ gn T() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean T0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean X0() {
        return false;
    }

    public final void a(CharSequence charSequence) {
        int i9;
        int i10;
        z0 z0Var = this.b;
        org.telegram.ui.Components.j6 j6Var = z0Var.w;
        v6 v6Var = z0Var.b;
        i9 = ((org.telegram.ui.ActionBar.f3) z0Var).currentAccount;
        v6Var.a(this.a, UserConfig.getInstance(i9).getClientUserId(), z0Var.n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        z0Var.B = codePointCount;
        int i11 = z0Var.A;
        if (i11 <= 0 || (i10 = i11 - codePointCount) > 15) {
            j6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ag.e(this, 3));
            return;
        }
        if (i10 < -9999) {
            i10 = -9999;
        }
        j6Var.c(LocaleController.formatNumber(i10, ','), j6Var.getVisibility() == 0, true);
        if (j6Var.getVisibility() != 0) {
            j6Var.setVisibility(0);
            j6Var.setAlpha(0.0f);
            j6Var.setScaleX(0.5f);
            j6Var.setScaleY(0.5f);
        }
        j6Var.animate().setListener(null).cancel();
        j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        if (i10 < 0) {
            j6Var.setTextColor(z0Var.getThemedColor(org.telegram.ui.ActionBar.f6.p7));
        } else {
            j6Var.setTextColor(z0Var.getThemedColor(org.telegram.ui.ActionBar.f6.y6));
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void b1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean f1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ int j() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TLRPC.Peer k() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final void m1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean n0() {
        return true;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean n1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void G() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void J0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void J1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void Q() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void Q1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void X1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void c() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void c1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void c2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void d2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void e() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void h0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void h1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void j1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void n() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void q1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void t0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void u() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void u1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void x0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void H(boolean z10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void K1(int i9) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void L0(int i9) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void T1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void o(float f10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void p(boolean z10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void B(float f10, int i9) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void p0(int i9, int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void k1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void y(CharSequence charSequence, boolean z10, int i9, int i10, long j10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void U1(int i9, int i10, int i11, long j10, long j11, boolean z10) {
    }
}
