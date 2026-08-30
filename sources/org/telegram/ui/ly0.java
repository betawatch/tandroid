package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ly0 implements org.telegram.ui.ActionBar.t0, ru0, org.telegram.ui.Components.g8 {
    public final /* synthetic */ ProfileActivity a;

    public /* synthetic */ ly0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // org.telegram.ui.ru0
    public void H(MessageObject messageObject) {
        org.telegram.ui.Components.mh0 mh0Var = this.a.j0;
        if (mh0Var == null || !mh0Var.a) {
            return;
        }
        mh0Var.L.d(0.0f, true);
        mh0Var.invalidate();
    }

    @Override // org.telegram.ui.Components.g8
    public void U0(int i10, int i11) {
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
        org.telegram.ui.Components.im0.d(new d5(this.a, 18));
    }

    @Override // org.telegram.ui.ru0
    public /* synthetic */ TextureView f0() {
        return null;
    }

    @Override // org.telegram.ui.Components.g8
    public void i1() {
        this.a.presentFragment(new s4());
        dismiss();
    }

    @Override // org.telegram.ui.ru0
    public void w0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.a;
        profileActivity.a.I0(true);
        sz0 sz0Var = profileActivity.L;
        if (sz0Var != null && sz0Var.getCurrentListView() != null) {
            profileActivity.L.getCurrentListView().I0(true);
        }
        profileActivity.a1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.S4.f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, profileActivity.w0)));
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void c() {
    }
}
