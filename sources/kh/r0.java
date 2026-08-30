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
import org.telegram.ui.nn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class r0 implements eg {
    public final /* synthetic */ TL_stars.TL_starGiftUnique a;
    public final /* synthetic */ u0 b;

    public r0(u0 u0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = u0Var;
        this.a = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers G() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean G0() {
        return true;
    }

    public final void a(CharSequence charSequence) {
        int i10;
        int i11;
        u0 u0Var = this.b;
        k6 k6Var = u0Var.w;
        f6 f6Var = u0Var.b;
        i10 = ((org.telegram.ui.ActionBar.g3) u0Var).currentAccount;
        f6Var.a(this.a, UserConfig.getInstance(i10).getClientUserId(), u0Var.n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
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
    public final /* synthetic */ int c1() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TL_stories.StoryItem e1() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean g1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean k1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ int l() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eg
    public final void n1(CharSequence charSequence, boolean z4, boolean z10) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TLRPC.Peer p() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean q1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ nn r0() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final void y1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean z1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final void C() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void C1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void E2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void H1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void N0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void V0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void Y() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void f() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void h2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void m2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void o0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void p1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void r() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void r2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void s1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void t1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void u1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void w0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void z2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void b0(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void b1(int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void j2(int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void n2(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void x(float f10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void z(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void H(float f10, int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void I0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void v1(View view, CharSequence charSequence, boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void D(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void o2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
    }
}
