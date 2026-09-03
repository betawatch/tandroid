package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class cw0 implements org.telegram.ui.Components.eg {
    public final /* synthetic */ PopupNotificationActivity a;

    public cw0(PopupNotificationActivity popupNotificationActivity) {
        this.a = popupNotificationActivity;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean B1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final void G(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
        PopupNotificationActivity popupNotificationActivity = this.a;
        if (popupNotificationActivity.N == null) {
            return;
        }
        int i12 = popupNotificationActivity.P;
        if (i12 >= 0 && i12 < popupNotificationActivity.X.size()) {
            popupNotificationActivity.X.remove(popupNotificationActivity.P);
        }
        MessagesController.getInstance(popupNotificationActivity.N.currentAccount).markDialogAsRead(popupNotificationActivity.N.getDialogId(), popupNotificationActivity.N.getId(), Math.max(0, popupNotificationActivity.N.getId()), popupNotificationActivity.N.messageOwner.date, true, 0L, 0, true, 0);
        popupNotificationActivity.N = null;
        popupNotificationActivity.f();
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers H() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean H0() {
        return true;
    }

    @Override // org.telegram.ui.Components.eg
    public final void J1() {
        PopupNotificationActivity popupNotificationActivity = this.a;
        MessageObject messageObject = popupNotificationActivity.N;
        if (messageObject != null) {
            MessagesController.getInstance(messageObject.currentAccount).sendTyping(popupNotificationActivity.N.getDialogId(), 0L, 0, popupNotificationActivity.H);
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
    public final void A1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void A2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void B(boolean z4) {
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
    public final /* synthetic */ void L0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void O0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void X() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void Y(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void Y0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void c() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void f1(int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void i2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void k2(int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void n2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void o2(boolean z4) {
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
    public final /* synthetic */ void x(float f10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void x0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void x1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void J0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void K(float f10, int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void q1(CharSequence charSequence, boolean z4, boolean z10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void y1(View view, CharSequence charSequence, boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void p2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
    }
}
