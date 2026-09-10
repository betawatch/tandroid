package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class iz0 implements org.telegram.ui.ActionBar.t0, nv0, org.telegram.ui.Components.n8 {
    public final /* synthetic */ ProfileActivity a;

    public /* synthetic */ iz0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // org.telegram.ui.nv0
    public void D0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.a;
        profileActivity.a.I0(true);
        r01 r01Var = profileActivity.O;
        if (r01Var != null && r01Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.d1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.V4.f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, profileActivity.z0)));
    }

    @Override // org.telegram.ui.nv0
    public void G(MessageObject messageObject) {
        org.telegram.ui.Components.ph0 ph0Var = this.a.m0;
        if (ph0Var == null || !ph0Var.a) {
            return;
        }
        ph0Var.O.d(0.0f, true);
        ph0Var.invalidate();
    }

    @Override // org.telegram.ui.Components.n8
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

    @Override // org.telegram.ui.Components.n8
    public void dismiss() {
        this.a.T0.M(null, null);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void e() {
        org.telegram.ui.Components.km0.d(new b5(this.a, 18));
    }

    @Override // org.telegram.ui.nv0
    public /* synthetic */ TextureView g0() {
        return null;
    }

    @Override // org.telegram.ui.Components.n8
    public void i1() {
        this.a.presentFragment(new q4());
        dismiss();
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void c() {
    }
}
