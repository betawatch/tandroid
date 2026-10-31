package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ot0 implements org.telegram.ui.Components.sf {
    public final /* synthetic */ PopupNotificationActivity a;

    public ot0(PopupNotificationActivity popupNotificationActivity) {
        this.a = popupNotificationActivity;
    }

    @Override // org.telegram.ui.Components.sf
    public final void E(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        PopupNotificationActivity popupNotificationActivity = this.a;
        if (popupNotificationActivity.Q == null) {
            return;
        }
        int i12 = popupNotificationActivity.S;
        if (i12 >= 0 && i12 < popupNotificationActivity.a0.size()) {
            popupNotificationActivity.a0.remove(popupNotificationActivity.S);
        }
        org.telegram.messenger.vp.r1(popupNotificationActivity.Q.I1).h3(org.telegram.messenger.jj.B0(popupNotificationActivity.Q.k), popupNotificationActivity.Q.f1(), Math.max(0, popupNotificationActivity.Q.f1()), popupNotificationActivity.Q.k.date, true, 0L, 0, true, 0);
        popupNotificationActivity.Q = null;
        popupNotificationActivity.f();
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers F() {
        return null;
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ int H0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ TL_stories.StoryItem P0() {
        return null;
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ boolean R0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.sf
    public final boolean T0() {
        return false;
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ boolean Y0() {
        return false;
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ kn b0() {
        return null;
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ boolean h1() {
        return false;
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ boolean k0() {
        return true;
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.sf
    public final void o1() {
        PopupNotificationActivity popupNotificationActivity = this.a;
        org.telegram.messenger.jj jjVar = popupNotificationActivity.Q;
        if (jjVar != null) {
            org.telegram.messenger.vp.r1(jjVar.I1).z4(0, popupNotificationActivity.K, org.telegram.messenger.jj.B0(popupNotificationActivity.Q.k), 0L, null);
        }
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ int r() {
        return 0;
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ TLRPC.Peer u() {
        return null;
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void B(boolean z10) {
    }

    @Override // org.telegram.ui.Components.sf
    public final void G0(int i10) {
    }

    @Override // org.telegram.ui.Components.sf
    public final void Q1(int i10) {
    }

    @Override // org.telegram.ui.Components.sf
    public final void U1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.sf
    public final void V(boolean z10) {
    }

    @Override // org.telegram.ui.Components.sf
    public final void g1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void y(float f7) {
    }

    @Override // org.telegram.ui.Components.sf
    public final void C() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void D() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void N() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void O1() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void T1() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void X() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void X0() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void Y1() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void a1() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void b1() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void d1() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void d2() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void e() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void h2() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void j0() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void n0() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void q0() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void w() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void I(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.sf
    public final void V0(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Components.sf
    public final void e1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.sf
    public final void V1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
