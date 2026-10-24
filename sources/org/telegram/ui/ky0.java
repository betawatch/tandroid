package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ky0 implements org.telegram.ui.ActionBar.r0, uu0, org.telegram.ui.Components.o8 {
    public final /* synthetic */ ProfileActivity a;

    public /* synthetic */ ky0(ProfileActivity profileActivity) {
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

    @Override // org.telegram.ui.uu0
    public /* synthetic */ TextureView U() {
        return null;
    }

    @Override // org.telegram.ui.Components.o8
    public void Y0() {
        this.a.presentFragment(new u4());
        dismiss();
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void d() {
        org.telegram.ui.Components.cn0.d(new f5(this.a, 18));
    }

    @Override // org.telegram.ui.Components.o8
    public void dismiss() {
        this.a.U0.M(null, null);
    }

    @Override // org.telegram.ui.uu0
    public void m0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.a;
        profileActivity.a.I0(true);
        rz0 rz0Var = profileActivity.O;
        if (rz0Var != null && rz0Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.e1.setBackgroundColor(i0.a.f(0.1f, profileActivity.R3(profileActivity.X4.f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, profileActivity.A0)));
    }

    @Override // org.telegram.ui.uu0
    public void z(MessageObject messageObject) {
        org.telegram.ui.Components.fi0 fi0Var = this.a.n0;
        if (fi0Var == null || !fi0Var.a) {
            return;
        }
        fi0Var.O.d(0.0f, true);
        fi0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void c() {
    }
}
