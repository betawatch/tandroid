package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ds0 implements org.telegram.ui.Components.mg {
    public final /* synthetic */ PopupNotificationActivity a;

    public ds0(PopupNotificationActivity popupNotificationActivity) {
        this.a = popupNotificationActivity;
    }

    @Override // org.telegram.ui.Components.mg
    public final void G(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
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

    @Override // org.telegram.ui.Components.mg
    public final void G1() {
        PopupNotificationActivity popupNotificationActivity = this.a;
        org.telegram.messenger.fj fjVar = popupNotificationActivity.R;
        if (fjVar != null) {
            org.telegram.messenger.mp.u1(fjVar.K1).N4(0, popupNotificationActivity.L, org.telegram.messenger.fj.B0(popupNotificationActivity.R.k), 0L, null);
        }
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers H() {
        return null;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ int X0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ TL_stories.StoryItem Y0() {
        return null;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ rm a0() {
        return null;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ boolean b1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public final boolean d1() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ boolean l1() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ int n() {
        return 0;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ TLRPC.Peer o() {
        return null;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ boolean v1() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ boolean w0() {
        return true;
    }

    @Override // org.telegram.ui.Components.mg
    public final void Q(boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void U0(int i7) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void i2(int i7) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void n2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void u(float f10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void u1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void w(boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void E() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void N() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void V() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void b() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void f() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void g0() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void h2() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void j1() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void m2() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void n1() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void o1() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void q1() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void r() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void r2() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void t2() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void v2() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void w1() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void y0() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void z() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void K(float f10, int i7) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void i1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
    }
}
