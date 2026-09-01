package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ny0 implements org.telegram.ui.ActionBar.t0, tu0, org.telegram.ui.Components.g8 {
    public final /* synthetic */ ProfileActivity a;

    public /* synthetic */ ny0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // org.telegram.ui.tu0
    public void G(MessageObject messageObject) {
        org.telegram.ui.Components.oh0 oh0Var = this.a.j0;
        if (oh0Var == null || !oh0Var.a) {
            return;
        }
        oh0Var.L.d(0.0f, true);
        oh0Var.invalidate();
    }

    @Override // org.telegram.ui.Components.g8
    public void Q0(int i10, int i11) {
        ProfileActivity profileActivity = this.a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.s2 == null && profileActivity.r2 == null) {
            return;
        }
        UndoView undoView = profileActivity.J;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.s2;
        undoView.k(a2, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : profileActivity.r2.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.g8
    public void dismiss() {
        this.a.Q0.M(null, null);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void e() {
        org.telegram.ui.Components.jm0.d(new d5(this.a, 18));
    }

    @Override // org.telegram.ui.tu0
    public /* synthetic */ TextureView h0() {
        return null;
    }

    @Override // org.telegram.ui.Components.g8
    public void h1() {
        this.a.presentFragment(new s4());
        dismiss();
    }

    @Override // org.telegram.ui.tu0
    public void y0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.a;
        profileActivity.a.I0(true);
        uz0 uz0Var = profileActivity.L;
        if (uz0Var != null && uz0Var.getCurrentListView() != null) {
            profileActivity.L.getCurrentListView().I0(true);
        }
        profileActivity.a1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.S4.f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.a7, profileActivity.w0)));
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void c() {
    }
}
