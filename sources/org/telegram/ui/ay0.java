package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ay0 implements org.telegram.ui.ActionBar.t0, hu0, org.telegram.ui.Components.l8 {
    public final /* synthetic */ ProfileActivity a;

    public /* synthetic */ ay0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // org.telegram.ui.hu0
    public void D(MessageObject messageObject) {
        org.telegram.ui.Components.bh0 bh0Var = this.a.i0;
        if (bh0Var == null || !bh0Var.a) {
            return;
        }
        bh0Var.K.d(0.0f, true);
        bh0Var.invalidate();
    }

    @Override // org.telegram.ui.Components.l8
    public void T0(int i10, int i11) {
        ProfileActivity profileActivity = this.a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.r2 == null && profileActivity.q2 == null) {
            return;
        }
        UndoView undoView = profileActivity.I;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.r2;
        undoView.k(a2, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : profileActivity.q2.ttl_period), null, null);
    }

    @Override // org.telegram.ui.hu0
    public /* synthetic */ TextureView b0() {
        return null;
    }

    @Override // org.telegram.ui.Components.l8
    public void dismiss() {
        this.a.P0.M(null, null);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void e() {
        org.telegram.ui.Components.yl0.d(new b5(this.a, 18));
    }

    @Override // org.telegram.ui.Components.l8
    public void e1() {
        this.a.presentFragment(new q4());
        dismiss();
    }

    @Override // org.telegram.ui.hu0
    public void x0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.a;
        profileActivity.a.I0(true);
        hz0 hz0Var = profileActivity.K;
        if (hz0Var != null && hz0Var.getCurrentListView() != null) {
            profileActivity.K.getCurrentListView().I0(true);
        }
        profileActivity.Z0.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.R4.f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.a7, profileActivity.v0)));
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void b() {
    }
}
