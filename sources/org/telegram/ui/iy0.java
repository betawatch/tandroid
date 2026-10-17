package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class iy0 implements org.telegram.ui.ActionBar.r0, tu0, org.telegram.ui.Components.o8 {
    public final /* synthetic */ ProfileActivity a;

    public /* synthetic */ iy0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // org.telegram.ui.Components.o8
    public void H0(int i10, int i11) {
        ProfileActivity profileActivity = this.a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.w2 == null && profileActivity.v2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.w2;
        undoView.k(a2, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : profileActivity.v2.ttl_period), null, null);
    }

    @Override // org.telegram.ui.tu0
    public /* synthetic */ TextureView U() {
        return null;
    }

    @Override // org.telegram.ui.Components.o8
    public void Y0() {
        this.a.presentFragment(new v4());
        dismiss();
    }

    @Override // org.telegram.ui.Components.o8
    public void dismiss() {
        this.a.U0.M(null, null);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void f() {
        org.telegram.ui.Components.ym0.d(new g5(this.a, 18));
    }

    @Override // org.telegram.ui.tu0
    public void m0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.a;
        profileActivity.a.I0(true);
        pz0 pz0Var = profileActivity.O;
        if (pz0Var != null && pz0Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.e1.setBackgroundColor(i0.b.f(0.1f, profileActivity.P3(profileActivity.X4.f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.a7, profileActivity.A0)));
    }

    @Override // org.telegram.ui.tu0
    public void z(MessageObject messageObject) {
        org.telegram.ui.Components.bi0 bi0Var = this.a.n0;
        if (bi0Var == null || !bi0Var.a) {
            return;
        }
        bi0Var.O.d(0.0f, true);
        bi0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void e() {
    }
}
