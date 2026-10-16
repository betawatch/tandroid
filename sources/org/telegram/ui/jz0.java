package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class jz0 implements org.telegram.ui.ActionBar.r0, rv0, org.telegram.ui.Components.r8 {
    public final /* synthetic */ ProfileActivity a;

    public /* synthetic */ jz0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // org.telegram.ui.rv0
    public void C0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.a;
        profileActivity.a.I0(true);
        q01 q01Var = profileActivity.O;
        if (q01Var != null && q01Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.d1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.V4.f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.a7, profileActivity.z0)));
    }

    @Override // org.telegram.ui.rv0
    public void H(MessageObject messageObject) {
        org.telegram.ui.Components.gi0 gi0Var = this.a.m0;
        if (gi0Var == null || !gi0Var.a) {
            return;
        }
        gi0Var.O.d(0.0f, true);
        gi0Var.invalidate();
    }

    @Override // org.telegram.ui.Components.r8
    public void X0(int i10, int i11) {
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

    @Override // org.telegram.ui.Components.r8
    public void dismiss() {
        this.a.T0.M(null, null);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void e() {
        org.telegram.ui.Components.cn0.d(new f5(this.a, 18));
    }

    @Override // org.telegram.ui.rv0
    public /* synthetic */ TextureView g0() {
        return null;
    }

    @Override // org.telegram.ui.Components.r8
    public void k1() {
        this.a.presentFragment(new u4());
        dismiss();
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void d() {
    }
}
