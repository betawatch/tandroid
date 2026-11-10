package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class hs0 implements org.telegram.ui.Components.vf {
    public final /* synthetic */ PopupNotificationActivity a;

    public hs0(PopupNotificationActivity popupNotificationActivity) {
        this.a = popupNotificationActivity;
    }

    @Override // org.telegram.ui.Components.vf
    public final void F(CharSequence charSequence, boolean z9, int i7, int i10, long j3) {
        PopupNotificationActivity popupNotificationActivity = this.a;
        if (popupNotificationActivity.Q == null) {
            return;
        }
        int i11 = popupNotificationActivity.S;
        if (i11 >= 0 && i11 < popupNotificationActivity.a0.size()) {
            popupNotificationActivity.a0.remove(popupNotificationActivity.S);
        }
        org.telegram.messenger.qp.s1(popupNotificationActivity.Q.I1).j3(org.telegram.messenger.ij.B0(popupNotificationActivity.Q.k), popupNotificationActivity.Q.e1(), Math.max(0, popupNotificationActivity.Q.e1()), popupNotificationActivity.Q.k.date, true, 0L, 0, true, 0);
        popupNotificationActivity.Q = null;
        popupNotificationActivity.f();
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers I() {
        return null;
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ int S0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ TL_stories.StoryItem T0() {
        return null;
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ boolean V0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.vf
    public final boolean X0() {
        return false;
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ boolean d1() {
        return false;
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ int l() {
        return 0;
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ boolean l1() {
        return false;
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ sm o0() {
        return null;
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ TLRPC.Peer s() {
        return null;
    }

    @Override // org.telegram.ui.Components.vf
    public final void t1() {
        PopupNotificationActivity popupNotificationActivity = this.a;
        org.telegram.messenger.ij ijVar = popupNotificationActivity.Q;
        if (ijVar != null) {
            org.telegram.messenger.qp.s1(ijVar.I1).C4(0, popupNotificationActivity.K, org.telegram.messenger.ij.B0(popupNotificationActivity.Q.k), 0L, null);
        }
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ boolean v0() {
        return true;
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void B(boolean z9) {
    }

    @Override // org.telegram.ui.Components.vf
    public final void R0(int i7) {
    }

    @Override // org.telegram.ui.Components.vf
    public final void V1(int i7) {
    }

    @Override // org.telegram.ui.Components.vf
    public final void Y(boolean z9) {
    }

    @Override // org.telegram.ui.Components.vf
    public final void Y1(boolean z9) {
    }

    @Override // org.telegram.ui.Components.vf
    public final void k1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void w(float f10) {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void C0() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void D() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void E() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void I0() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void T1() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void X1() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void a() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void c1() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void d2() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void e1() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void f1() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void h1() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void h2() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void j0() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void l2() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void m1() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void r0() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void t() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void w0() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void M(float f10, int i7) {
    }

    @Override // org.telegram.ui.Components.vf
    public final void a1(CharSequence charSequence, boolean z9, boolean z10) {
    }

    @Override // org.telegram.ui.Components.vf
    public final void i1(View view, CharSequence charSequence, boolean z9) {
    }

    @Override // org.telegram.ui.Components.vf
    public final void Z1(int i7, int i10, int i11, long j3, long j10, boolean z9) {
    }
}
