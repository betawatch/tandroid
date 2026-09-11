package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class pw0 implements org.telegram.ui.Components.og {
    public final /* synthetic */ PopupNotificationActivity a;

    public pw0(PopupNotificationActivity popupNotificationActivity) {
        this.a = popupNotificationActivity;
    }

    @Override // org.telegram.ui.Components.og
    public final void G(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        PopupNotificationActivity popupNotificationActivity = this.a;
        if (popupNotificationActivity.Q == null) {
            return;
        }
        int i12 = popupNotificationActivity.S;
        if (i12 >= 0 && i12 < popupNotificationActivity.a0.size()) {
            popupNotificationActivity.a0.remove(popupNotificationActivity.S);
        }
        MessagesController.getInstance(popupNotificationActivity.Q.currentAccount).markDialogAsRead(popupNotificationActivity.Q.getDialogId(), popupNotificationActivity.Q.getId(), Math.max(0, popupNotificationActivity.Q.getId()), popupNotificationActivity.Q.messageOwner.date, true, 0L, 0, true, 0);
        popupNotificationActivity.Q = null;
        popupNotificationActivity.f();
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers H() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ int W0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TL_stories.StoryItem Y0() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean a1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final boolean d1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean i1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ sn o0() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TLRPC.Peer q() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean q1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final void x1() {
        PopupNotificationActivity popupNotificationActivity = this.a;
        MessageObject messageObject = popupNotificationActivity.Q;
        if (messageObject != null) {
            MessagesController.getInstance(messageObject.currentAccount).sendTyping(popupNotificationActivity.Q.getDialogId(), 0L, 0, popupNotificationActivity.K);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean z0() {
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public final void C() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void D0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void P0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Components.og
    public final void V0(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void V1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void W(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void X1(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void a2() {
    }

    @Override // org.telegram.ui.Components.og
    public final void b2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void g2() {
    }

    @Override // org.telegram.ui.Components.og
    public final void h() {
    }

    @Override // org.telegram.ui.Components.og
    public final void h1() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void l0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void l1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void m1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void n2() {
    }

    @Override // org.telegram.ui.Components.og
    public final void p1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.og
    public final void r0() {
    }

    @Override // org.telegram.ui.Components.og
    public final void r2() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void t1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void v() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void x(float f7) {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void z(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void B0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.og
    public final void J(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void f1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Components.og
    public final void n1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void c2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
