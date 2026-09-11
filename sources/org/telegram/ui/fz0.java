package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class fz0 implements org.telegram.ui.ActionBar.s0, kv0, org.telegram.ui.Components.p8 {
    public final /* synthetic */ ProfileActivity a;

    public /* synthetic */ fz0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // org.telegram.ui.kv0
    public void E0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.a;
        profileActivity.a.I0(true);
        m01 m01Var = profileActivity.O;
        if (m01Var != null && m01Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.d1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.V4.f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, profileActivity.z0)));
    }

    @Override // org.telegram.ui.kv0
    public void H(MessageObject messageObject) {
        org.telegram.ui.Components.fh0 fh0Var = this.a.m0;
        if (fh0Var == null || !fh0Var.a) {
            return;
        }
        fh0Var.O.d(0.0f, true);
        fh0Var.invalidate();
    }

    @Override // org.telegram.ui.Components.p8
    public void Y0(int i10, int i11) {
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

    @Override // org.telegram.ui.Components.p8
    public void dismiss() {
        this.a.T0.M(null, null);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void e() {
        org.telegram.ui.Components.am0.d(new b5(this.a, 18));
    }

    @Override // org.telegram.ui.kv0
    public /* synthetic */ TextureView i0() {
        return null;
    }

    @Override // org.telegram.ui.Components.p8
    public void l1() {
        this.a.presentFragment(new q4());
        dismiss();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void d() {
    }
}
