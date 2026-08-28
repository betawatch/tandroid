package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ay0 implements org.telegram.ui.ActionBar.t0, ju0, org.telegram.ui.Components.g8 {
    public final /* synthetic */ ProfileActivity a;

    public /* synthetic */ ay0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // org.telegram.ui.ju0
    public /* synthetic */ TextureView G() {
        return null;
    }

    @Override // org.telegram.ui.Components.g8
    public void V0(int i9, int i10) {
        ProfileActivity profileActivity = this.a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i9);
        if (profileActivity.r2 == null && profileActivity.q2 == null) {
            return;
        }
        UndoView undoView = profileActivity.I;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.r2;
        undoView.k(a2, i10, user, Integer.valueOf(userFull != null ? userFull.ttl_period : profileActivity.q2.ttl_period), null, null);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void d() {
        org.telegram.ui.Components.ll0.d(new a5(this.a, 18));
    }

    @Override // org.telegram.ui.Components.g8
    public void dismiss() {
        this.a.P0.M(null, null);
    }

    @Override // org.telegram.ui.Components.g8
    public void h1() {
        this.a.presentFragment(new p4());
        dismiss();
    }

    @Override // org.telegram.ui.ju0
    public void x0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.a;
        profileActivity.a.I0(true);
        hz0 hz0Var = profileActivity.K;
        if (hz0Var != null && hz0Var.getCurrentListView() != null) {
            profileActivity.K.getCurrentListView().I0(true);
        }
        profileActivity.Z0.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.R4.f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.a7, profileActivity.v0)));
    }

    @Override // org.telegram.ui.ju0
    public void y(MessageObject messageObject) {
        org.telegram.ui.Components.rg0 rg0Var = this.a.i0;
        if (rg0Var == null || !rg0Var.a) {
            return;
        }
        rg0Var.K.d(0.0f, true);
        rg0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void c() {
    }
}
