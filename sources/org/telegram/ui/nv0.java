package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class nv0 implements org.telegram.ui.Components.ag {
    public final /* synthetic */ PopupNotificationActivity a;

    public nv0(PopupNotificationActivity popupNotificationActivity) {
        this.a = popupNotificationActivity;
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

    @Override // org.telegram.ui.Components.ag
    public final boolean b1() {
        return false;
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
    public final /* synthetic */ boolean o1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ag
    public final void w(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
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

    @Override // org.telegram.ui.Components.ag
    public final void w1() {
        PopupNotificationActivity popupNotificationActivity = this.a;
        MessageObject messageObject = popupNotificationActivity.M;
        if (messageObject != null) {
            MessagesController.getInstance(messageObject.currentAccount).sendTyping(popupNotificationActivity.M.getDialogId(), 0L, 0, popupNotificationActivity.G);
        }
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers y() {
        return null;
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void F() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void G(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void I0() {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void N() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void N0(int i10) {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void N1() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void S1(int i10) {
    }

    @Override // org.telegram.ui.Components.ag
    public final void U1() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void W1(boolean z10) {
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
    public final /* synthetic */ void n(float f10) {
    }

    @Override // org.telegram.ui.Components.ag
    public final void n1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void q0() {
    }

    @Override // org.telegram.ui.Components.ag
    public final void q2() {
    }

    @Override // org.telegram.ui.Components.ag
    public final /* synthetic */ void r(boolean z10) {
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
    public final void A(float f10, int i10) {
    }

    @Override // org.telegram.ui.Components.ag
    public final void o0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ag
    public final void c1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Components.ag
    public final void l1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.ag
    public final void X1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
