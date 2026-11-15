package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class bs0 implements org.telegram.ui.Components.cg {
    public final /* synthetic */ PopupNotificationActivity a;

    public bs0(PopupNotificationActivity popupNotificationActivity) {
        this.a = popupNotificationActivity;
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ boolean E0() {
        return true;
    }

    @Override // org.telegram.ui.Components.cg
    public final void G1() {
        PopupNotificationActivity popupNotificationActivity = this.a;
        org.telegram.messenger.gj gjVar = popupNotificationActivity.R;
        if (gjVar != null) {
            org.telegram.messenger.np.s1(gjVar.K1).D4(0, popupNotificationActivity.L, org.telegram.messenger.gj.B0(popupNotificationActivity.R.k), 0L, null);
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final void M(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        PopupNotificationActivity popupNotificationActivity = this.a;
        if (popupNotificationActivity.R == null) {
            return;
        }
        int i11 = popupNotificationActivity.T;
        if (i11 >= 0 && i11 < popupNotificationActivity.b0.size()) {
            popupNotificationActivity.b0.remove(popupNotificationActivity.T);
        }
        org.telegram.messenger.np.s1(popupNotificationActivity.R.K1).j3(org.telegram.messenger.gj.B0(popupNotificationActivity.R.k), popupNotificationActivity.R.e1(), Math.max(0, popupNotificationActivity.R.e1()), popupNotificationActivity.R.k.date, true, 0L, 0, true, 0);
        popupNotificationActivity.R = null;
        popupNotificationActivity.f();
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers O() {
        return null;
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
    public final void u1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ void y(float f10) {
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
    public final void j1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Components.cg
    public final void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.cg
    public final void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
    }
}
