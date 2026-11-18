package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class es0 implements org.telegram.ui.Components.kg {
    public final /* synthetic */ PopupNotificationActivity a;

    public es0(PopupNotificationActivity popupNotificationActivity) {
        this.a = popupNotificationActivity;
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ boolean E0() {
        return true;
    }

    @Override // org.telegram.ui.Components.kg
    public final void G1() {
        PopupNotificationActivity popupNotificationActivity = this.a;
        org.telegram.messenger.fj fjVar = popupNotificationActivity.R;
        if (fjVar != null) {
            org.telegram.messenger.mp.u1(fjVar.K1).N4(0, popupNotificationActivity.L, org.telegram.messenger.fj.B0(popupNotificationActivity.R.k), 0L, null);
        }
    }

    @Override // org.telegram.ui.Components.kg
    public final void H(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        PopupNotificationActivity popupNotificationActivity = this.a;
        if (popupNotificationActivity.R == null) {
            return;
        }
        int i11 = popupNotificationActivity.T;
        if (i11 >= 0 && i11 < popupNotificationActivity.b0.size()) {
            popupNotificationActivity.b0.remove(popupNotificationActivity.T);
        }
        org.telegram.messenger.mp.u1(popupNotificationActivity.R.K1).q3(org.telegram.messenger.fj.B0(popupNotificationActivity.R.k), popupNotificationActivity.R.e1(), Math.max(0, popupNotificationActivity.R.e1()), popupNotificationActivity.R.k.date, true, 0L, 0, true, 0);
        popupNotificationActivity.R = null;
        popupNotificationActivity.f();
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers J() {
        return null;
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
    public final void u1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ void x(float f10) {
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
    public final void j1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Components.kg
    public final void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.kg
    public final void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
    }
}
