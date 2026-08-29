package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class mv0 implements org.telegram.ui.Components.hg {
    public final /* synthetic */ PopupNotificationActivity a;

    public mv0(PopupNotificationActivity popupNotificationActivity) {
        this.a = popupNotificationActivity;
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ boolean C0() {
        return true;
    }

    @Override // org.telegram.ui.Components.hg
    public final void D(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        PopupNotificationActivity popupNotificationActivity = this.a;
        if (popupNotificationActivity.M == null) {
            return;
        }
        int i12 = popupNotificationActivity.O;
        if (i12 >= 0 && i12 < popupNotificationActivity.W.size()) {
            popupNotificationActivity.W.remove(popupNotificationActivity.O);
        }
        MessagesController.getInstance(popupNotificationActivity.M.currentAccount).markDialogAsRead(popupNotificationActivity.M.getDialogId(), popupNotificationActivity.M.getId(), Math.max(0, popupNotificationActivity.M.getId()), popupNotificationActivity.M.messageOwner.date, true, 0L, 0, true, 0);
        popupNotificationActivity.M = null;
        popupNotificationActivity.f();
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers G() {
        return null;
    }

    @Override // org.telegram.ui.Components.hg
    public final void G1() {
        PopupNotificationActivity popupNotificationActivity = this.a;
        MessageObject messageObject = popupNotificationActivity.M;
        if (messageObject != null) {
            MessagesController.getInstance(messageObject.currentAccount).sendTyping(popupNotificationActivity.M.getDialogId(), 0L, 0, popupNotificationActivity.G);
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
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void M() {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void T0() {
    }

    @Override // org.telegram.ui.Components.hg
    public final void U(boolean z10) {
    }

    @Override // org.telegram.ui.Components.hg
    public final void a1(int i10) {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void d2() {
    }

    @Override // org.telegram.ui.Components.hg
    public final void e() {
    }

    @Override // org.telegram.ui.Components.hg
    public final void f2(int i10) {
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
    public final void k2(boolean z10) {
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
    public final /* synthetic */ void v(float f9) {
    }

    @Override // org.telegram.ui.Components.hg
    public final void v1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.hg
    public final void v2() {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void x(boolean z10) {
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ void z1() {
    }

    @Override // org.telegram.ui.Components.hg
    public final void z2() {
    }

    @Override // org.telegram.ui.Components.hg
    public final void E0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.hg
    public final void I(float f9, int i10) {
    }

    @Override // org.telegram.ui.Components.hg
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Components.hg
    public final void t1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.hg
    public final void l2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
