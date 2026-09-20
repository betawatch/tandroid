package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ez0 implements org.telegram.ui.ActionBar.s0, lv0, org.telegram.ui.Components.m8 {
    public final /* synthetic */ ProfileActivity a;

    public /* synthetic */ ez0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // org.telegram.ui.lv0
    public void D0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.a;
        profileActivity.a.J0(true);
        l01 l01Var = profileActivity.O;
        if (l01Var != null && l01Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().J0(true);
        }
        profileActivity.d1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.V4.f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, profileActivity.z0)));
    }

    @Override // org.telegram.ui.lv0
    public void H(MessageObject messageObject) {
        org.telegram.ui.Components.ph0 ph0Var = this.a.m0;
        if (ph0Var == null || !ph0Var.a) {
            return;
        }
        ph0Var.O.d(0.0f, true);
        ph0Var.invalidate();
    }

    @Override // org.telegram.ui.Components.m8
    public void U0(int i10, int i11) {
        ProfileActivity profileActivity = this.a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.v2 == null && profileActivity.u2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.v2;
        undoView.k(a2, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : profileActivity.u2.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.m8
    public void dismiss() {
        this.a.T0.M(null, null);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void e() {
        org.telegram.ui.Components.mm0.d(new b5(this.a, 18));
    }

    @Override // org.telegram.ui.lv0
    public /* synthetic */ TextureView h0() {
        return null;
    }

    @Override // org.telegram.ui.Components.m8
    public void j1() {
        this.a.presentFragment(new p4());
        dismiss();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void c() {
    }
}
