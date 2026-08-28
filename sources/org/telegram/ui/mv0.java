package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mv0 implements org.telegram.ui.Components.eg {
    public final /* synthetic */ PopupNotificationActivity a;

    public mv0(PopupNotificationActivity popupNotificationActivity) {
        this.a = popupNotificationActivity;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers A() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ int N0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TL_stories.StoryItem P0() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ gn T() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean T0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean X0() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean f1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ int j() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TLRPC.Peer k() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean n0() {
        return true;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean n1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final void u1() {
        PopupNotificationActivity popupNotificationActivity = this.a;
        MessageObject messageObject = popupNotificationActivity.M;
        if (messageObject != null) {
            MessagesController.getInstance(messageObject.currentAccount).sendTyping(popupNotificationActivity.M.getDialogId(), 0L, 0, popupNotificationActivity.G);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void y(CharSequence charSequence, boolean z10, int i9, int i10, long j10) {
        PopupNotificationActivity popupNotificationActivity = this.a;
        if (popupNotificationActivity.M == null) {
            return;
        }
        int i11 = popupNotificationActivity.O;
        if (i11 >= 0 && i11 < popupNotificationActivity.W.size()) {
            popupNotificationActivity.W.remove(popupNotificationActivity.O);
        }
        MessagesController.getInstance(popupNotificationActivity.M.currentAccount).markDialogAsRead(popupNotificationActivity.M.getDialogId(), popupNotificationActivity.M.getId(), Math.max(0, popupNotificationActivity.M.getId()), popupNotificationActivity.M.messageOwner.date, true, 0L, 0, true, 0);
        popupNotificationActivity.M = null;
        popupNotificationActivity.f();
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void G() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void H(boolean z10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void J0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void J1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void K1(int i9) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void L0(int i9) {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void Q() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void Q1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void T1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void X1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void c() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void c1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void c2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void d2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void e() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void h0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void h1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void j1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void m1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void n() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void o(float f10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void p(boolean z10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void q1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void t0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void u() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void x0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void B(float f10, int i9) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void p0(int i9, int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void b1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void k1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void U1(int i9, int i10, int i11, long j10, long j11, boolean z10) {
    }
}
