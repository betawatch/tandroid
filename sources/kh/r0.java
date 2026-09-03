package kh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.k6;
import org.telegram.ui.pn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class r0 implements eg {
    public final /* synthetic */ TL_stars.TL_starGiftUnique a;
    public final /* synthetic */ u0 b;

    public r0(u0 u0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = u0Var;
        this.a = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.Components.eg
    public final void A1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean B1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers H() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean H0() {
        return true;
    }

    public final void a(CharSequence charSequence) {
        int i10;
        int i11;
        u0 u0Var = this.b;
        k6 k6Var = u0Var.w;
        e6 e6Var = u0Var.b;
        i10 = ((org.telegram.ui.ActionBar.g3) u0Var).currentAccount;
        e6Var.a(this.a, UserConfig.getInstance(i10).getClientUserId(), u0Var.n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        u0Var.C = codePointCount;
        int i12 = u0Var.B;
        if (i12 <= 0 || (i11 = i12 - codePointCount) > 15) {
            k6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new cg.l0(this, 8));
            return;
        }
        if (i11 < -9999) {
            i11 = -9999;
        }
        k6Var.c(LocaleController.formatNumber(i11, ','), k6Var.getVisibility() == 0, true);
        if (k6Var.getVisibility() != 0) {
            k6Var.setVisibility(0);
            k6Var.setAlpha(0.0f);
            k6Var.setScaleX(0.5f);
            k6Var.setScaleY(0.5f);
        }
        k6Var.animate().setListener(null).cancel();
        k6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        if (i11 < 0) {
            k6Var.setTextColor(u0Var.getThemedColor(j6.p7));
        } else {
            k6Var.setTextColor(u0Var.getThemedColor(j6.y6));
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ int g1() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TL_stories.StoryItem i1() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean k1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean n1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eg
    public final void q1(CharSequence charSequence, boolean z4, boolean z10) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TLRPC.Peer r() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean t1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ pn u0() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final void A2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void D() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void E1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void E2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void J1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void L0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void O0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void X() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void Y0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void c() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void i2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void n2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void q0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void s1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void t2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void v() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void v1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void w1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void x0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void x1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void B(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void Y(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void f1(int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void k2(int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void o2(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void x(float f10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void J0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void K(float f10, int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void y1(View view, CharSequence charSequence, boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void G(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void p2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
    }
}
